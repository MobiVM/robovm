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
import org.robovm.compiler.launcher.LaunchParameters;
import org.robovm.compiler.launcher.Launcher;
import org.robovm.compiler.launcher.LauncherUtils;
import org.robovm.compiler.launcher.LauncherUtils.OutputPortObserverFuture;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.plugin.PluginArguments;
import org.robovm.compiler.plugin.launch.LaunchPlugin;
import org.robovm.junit.protocol.Command;
import org.robovm.junit.protocol.ResultObject;
import org.robovm.junit.protocol.ResultType;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

import java.io.*;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Client side of the bridge between the tester (IDE, Maven, Gradle, etc) and
 * the testee (console, simulator, device).
 */
public class TestClient extends LaunchPlugin implements Launcher.Listener {

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

    private OutputPortObserverFuture serverPortFuture;
    private Logger logger;
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
    public void setupLaunch(Config config, LaunchParameters parameters) {
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
                    parameters.getEnvironment() == null ? new HashMap<>() : parameters.getEnvironment()
            );
            env.put("robovm.wrappedClass", mainClassName);
            parameters.setEnvironment(env);
        }

        serverPortFuture = setupPortNumberObserver(parameters);
        logger = config.getLogger();
    }

    @Override
    public void onLaunching() {
        // nothing to do (while application is deployed to target)
    }

    @Override
    public void onLaunched(Launcher.Target target) {
        // Run the tests asynchronously
        runTests(target).subscribeOn(Schedulers.newThread()).subscribe(o -> {
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
    public void onExited(int code) {
    }

    @Override
    public PluginArguments getArguments() {
        return new PluginArguments("junit", Collections.emptyList());
    }

    private Observable<ResultObject> runTests(final Launcher.Target target) {
        final Logger logger = this.logger;
        return Observable.create(subscriber -> {
            try {
                int port = serverPortFuture.get();
                Launcher.Connection conn = target.createConnection();
                try {
                    conn.connect(port);
                    logger.debug("Connected to test server on target");
                    runTests(logger, subscriber, conn.in(), conn.out());
                } finally {
                    conn.disconnect();
                }
                logger.debug("Test client finished.");
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

    private void runTests(final Logger logger, Subscriber<? super ResultObject> subscriber, InputStream in,
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
                    logger.debug("Running test %s", testToRun);
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

        logger.debug("Test run completed. Shutting down test server...");

        writer.write(Command.terminate + "\n");
        writer.flush();
        writer.close();
    }

    /**
     * Setups port number observer from stdout stream
     */
    private OutputPortObserverFuture setupPortNumberObserver(LaunchParameters parameters) {
        final String tag1 = SERVER_CLASS_NAME + ": port=";
        final String tag2 = mainClassName + ": port=";
        OutputPortObserverFuture.PortExtractor portExtractor = (s, start, end) -> {
            if (s.startsWith(tag1, start))
                return s.substring(start + tag1.length(), end).trim();
            if (s.startsWith(tag2, start))
                return s.substring(start + tag2.length(), end).trim();
            return null;
        };
        OutputPortObserverFuture observeOutputFeature = new OutputPortObserverFuture(portExtractor);
        LauncherUtils.attachOutputPortObserver(parameters.getStdoutChain(), observeOutputFeature);
        return observeOutputFeature;
    }
}
