/*
 * Copyright (C) 2014 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.robovm.junit.client;

import org.junit.runner.notification.RunListener;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.plugin.LaunchPlugin;
import org.robovm.compiler.plugin.PluginArguments;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.target.ios.IOSTarget;
import org.robovm.compiler.util.io.ObservableInputStream;
import org.robovm.junit.protocol.Command;
import org.robovm.junit.protocol.ResultObject;
import org.robovm.junit.protocol.ResultType;
import org.robovm.libimobiledevice.IDevice;
import org.robovm.libimobiledevice.IDeviceConnection;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.IntConsumer;

/**
 * Client side of the bridge between the tester (IDE, Maven, Gradle, etc) and
 * the testee (console, simulator, device).
 */
public class TestClient extends LaunchPlugin {

    private static class Waiter implements Runnable {
        CountDownLatch c = new CountDownLatch(1);

        public void run() {
            c.countDown();
        }

        public void await() throws InterruptedException {
            c.await();
        }
    }

    private static class Terminator extends Waiter {}

    public static final String SERVER_WRAPPER_CLASS_NAME = "org.robovm.objc.NonUICodeWrapper";
    public static final String SERVER_CLASS_NAME = "org.robovm.junit.server.TestServer";

    private final LinkedBlockingQueue<Object> runQueue = new LinkedBlockingQueue<>();
    private RunListener runListener;
    private String mainClassName = SERVER_CLASS_NAME;
    private List<String> runArgs = Collections.emptyList();

    public TestClient() {}

    public void setMainClass(Class<?> mainClass) {
        this.mainClassName = mainClass.getName();
    }

    public void setRunArgs(List<String> runArgs) {
        this.runArgs = runArgs;
    }

    public TestClient runTests(String... testsToRun) {
        runQueue.addAll(Arrays.asList(testsToRun));
        return this;
    }

    public void terminate() throws InterruptedException {
        Terminator t = new Terminator();
        runQueue.add(t);
        t.await();
    }

    public TestClient flush() throws InterruptedException {
        Waiter w = new Waiter();
        runQueue.add(w);
        w.await();
        return this;
    }

    public void setRunListener(RunListener runListener) {
        this.runListener = runListener;
    }

    @Override
    public void beforeLaunch(Config config, LaunchParameters parameters) {
        parameters.getArguments().add("-rvm:log=fatal");
        /*
         * Set this system property to true let the TestServer detect if it gets
         * restarted when running in the iOS simulator. See the comment in
         * TestServer for more info.
         */
        parameters.getArguments().add("-rvm:Drobovm.launchedFromTestClient=true");

        parameters.getArguments().addAll(runArgs);

        // we always use the NonUICodeWrapper to run the TestServer
        // on iOS so the process watchdog is not triggered. The mainClass
        // will be set to NonUICodeWrapper, which takes the actual test
        // runner as an environment variable.
        if (config.getOs() == OS.ios) {
            Map<String, String> env = new HashMap<>(
                    parameters.getEnvironment() == null ? new HashMap<>() : parameters.getEnvironment());
            env.put("robovm.wrappedClass", mainClassName);
            parameters.setEnvironment(env);
        }

        // register std out observer to get server port
        parameters.setStdOutObserver(new ServerPortObserver(port -> serverPortReady(config, port)));
    }

    void serverPortReady(Config config, int port) {
        // Run the tests asynchronously
        runTests(config, port).subscribeOn(Schedulers.newThread()).subscribe(o -> {
            try {
                switch (o.getResultType()) {
                case AssumptionFailure:
                    runListener.testAssumptionFailure(o.getFailure());
                    break;
                case Failure:
                    runListener.testFailure(o.getFailure());
                    break;
                case Finished:
                    runListener.testFinished(o.getDescription());
                    break;
                case Ignored:
                    runListener.testIgnored(o.getDescription());
                    break;
                case RunFinished:
                    runListener.testRunFinished(o.getResult());
                    break;
                case RunStarted:
                    runListener.testRunStarted(o.getDescription());
                    break;
                case Started:
                    runListener.testStarted(o.getDescription());
                    break;
                default:
                    break;
                }
            } catch (Exception e) {
                // Swallow
            }
        });
    }

    @Override
    public PluginArguments getArguments() {
        return new PluginArguments("junit", Collections.emptyList());
    }

    @Override
    public void launchFailed(Config config, LaunchParameters parameters) {}

    @Override
    public void afterLaunch(Config config, LaunchParameters parameters, Process process) {}

    @Override
    public void cleanup() {}

    private Observable<ResultObject> runTests(final Config config, int port) {
        return Observable.create(subscriber -> {
            try {
                if (config.getTarget() instanceof IOSTarget && IOSTarget.isDeviceArch(config.getArch())) {
                    // iOS device launch. Use libimobiledevice to set up the
                    // connection.
                    IDevice device = ((IOSTarget) config.getTarget()).getDevice();
                    config.getLogger().debug("Connecting to test server running on port %d "
                            + "on device with id %s", port, device.getUdid());
                    try (IDeviceConnection conn = device.connect(port)) {
                        config.getLogger().debug("Connected to test server on device %s", device.getUdid());
                        runTests(config, subscriber, conn.getInputStream(), conn.getOutputStream());
                    }
                } else {
                    // Local launch. Use sockets.
                    config.getLogger().debug("Connecting to test server running on localhost:%d", port);
                    try (Socket socket = new Socket("localhost", port)) {
                        config.getLogger().debug("Connected to test server at %s", socket.getRemoteSocketAddress());
                        runTests(config, subscriber, socket.getInputStream(), socket.getOutputStream());
                    }
                }
                config.getLogger().debug("Test client finished.");
            } catch (Throwable t) {
                t.printStackTrace();
                subscriber.onError(t);
            }
            subscriber.onCompleted();
        });
    }

    public Config.Builder configure(Config.Builder configBuilder, boolean isIOS) {
        if (configBuilder == null) {
            throw new IllegalArgumentException("RoboVM configuration cannot be null");
        }

        configBuilder.addForceLinkClass("org.robovm.junit.server.TestServer");
        if (isIOS) {
            configBuilder.mainClass(SERVER_WRAPPER_CLASS_NAME);
        } else {
            configBuilder.mainClass(mainClassName);
        }
        configBuilder.addForceLinkClass("com.android.org.conscrypt.OpenSSLProvider");
        configBuilder.addForceLinkClass("com.android.org.conscrypt.OpenSSLMessageDigestJDK**");

        configBuilder.addLaunchPlugin(this);

        return configBuilder;
    }

    private void runTests(final Config config, Subscriber<? super ResultObject> subscriber, InputStream in,
            OutputStream out) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

        String line;
        Object action;
        try {
            while (!subscriber.isUnsubscribed()) {
                action = runQueue.take();
                if (action instanceof String) {
                    String testToRun = (String) action;
                    config.getLogger().debug("Running test %s", testToRun);
                    writer.write(Command.run + " " + testToRun + "\n");
                    writer.flush();

                    while ((line = reader.readLine()) != null) {
                        ResultObject resultObject = ResultObject.fromJson(line);
                        if (!subscriber.isUnsubscribed()) {
                            subscriber.onNext(resultObject);
                        }
                        if (resultObject.getResultType() == ResultType.RunFinished) {
                            break;
                        }
                    }
                } else if (action instanceof Terminator) {
                    ((Terminator) action).run();
                    break;
                } else if (action instanceof Waiter) {
                    ((Waiter) action).run();
                }
            }
        } catch (InterruptedException ignored) {
        }

        config.getLogger().debug("Test run completed. Shutting down test server...");

        writer.write(Command.terminate + "\n");
        writer.flush();
        writer.close();
    }

    /**
     * Wraps the stdout stream of the server and reads the port which the server
     * will be print to stdout. Will continue to wrap the stdout stream until
     * the server process has finished.
     */
    private static class ServerPortObserver implements ObservableInputStream.Observer {
        private final String tag = SERVER_CLASS_NAME + ": port=";
        private final IntConsumer callback;
        private volatile Integer port = null;
        private String incompleteLine;

        public ServerPortObserver(IntConsumer callback) {
            this.callback = callback;
        }

        @Override
        public void observeRead(byte[] b, int off, int len) {
            if (port == null) {
                // port is not received yet, keep working
                String str = new String(b, off, len, StandardCharsets.UTF_8);
                if (incompleteLine != null) {
                    str = incompleteLine + str;
                    incompleteLine = null;
                }

                int lookingPos = 0;
                int newLineIdx = str.indexOf('\n');
                while (newLineIdx >= 0 ) {
                    // get next new line
                    if (str.startsWith(tag, lookingPos)) {
                        // got it
                        port = Integer.parseInt(str.substring(lookingPos + tag.length(), newLineIdx).trim());
                        callback.accept(port);
                        break;
                    } else {
                        // move to next line
                        lookingPos = newLineIdx + 1;
                        newLineIdx = str.indexOf('\n', newLineIdx + 1);
                    }
                }

                // keep trailing line (without eol)
                if (port == null && lookingPos < str.length()) {
                    incompleteLine = lookingPos != 0 ? str.substring(lookingPos) : str;
                }
            }
        }
    }
}
