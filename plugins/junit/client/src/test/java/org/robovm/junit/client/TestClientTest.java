/*
 * Copyright (C) 2014 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.robovm.junit.client;

import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.robovm.compiler.AppCompiler;
import org.robovm.compiler.Version;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Config.Home;
import org.robovm.compiler.log.ConsoleLogger;
import org.robovm.compiler.target.LaunchParameters;
import org.robovm.maven.resolver.RoboVMResolver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests {@link TestClient}.
 */
public class TestClientTest {

    @Test
    public void testSuccessfulWholeClassRun() throws Throwable {
        TestClient client = new TestClient();
        TestRunListener listener = new TestRunListener();
        client.setRunListener(listener);
        Config config = client.configure(createConfig(), false).build();
        AppCompiler appCompiler = new AppCompiler(config);
        appCompiler.build();

        LaunchParameters launchParameters = config.getTarget().createLaunchParameters();
        Process process = appCompiler.launchAsync(launchParameters);
        client.runTests(RunnerClass.class.getName()).terminate();
        process.waitFor();
        appCompiler.launchAsyncCleanup();

        assertEquals("2 successful tests expected", 2, listener.successful.size());
        assertTrue(listener.successful.contains("testSuccessfulTest1(" + RunnerClass.class.getName() + ")"));
        assertTrue(listener.successful.contains("testSuccessfulTest2(" + RunnerClass.class.getName() + ")"));
        assertEquals("1 failed test expected", 1, listener.failed.size());
        assertTrue(listener.failed.contains("testShouldFail(" + RunnerClass.class.getName() + "): 1 == 2"));
    }

    @Test
    public void testSuccessfulSingleMethodRun() throws Throwable {
        TestClient client = new TestClient();
        TestRunListener listener = new TestRunListener();
        client.setRunListener(listener);
        Config config = client.configure(createConfig(), false).build();
        AppCompiler appCompiler = new AppCompiler(config);
        appCompiler.build();

        LaunchParameters launchParameters = config.getTarget().createLaunchParameters();
        Process process = appCompiler.launchAsync(launchParameters);
        client.runTests(RunnerClass.class.getName() + "#testSuccessfulTest1").terminate();
        process.waitFor();
        appCompiler.launchAsyncCleanup();

        assertEquals("1 successful tests expected", 1, listener.successful.size());
        assertTrue(listener.successful.contains("testSuccessfulTest1(" + RunnerClass.class.getName() + ")"));
        assertEquals("0 failed tests expected", 0, listener.failed.size());
    }

    private Config.Builder createConfig() throws IOException, ClassNotFoundException {
        RoboVMResolver roboVMResolver = new RoboVMResolver();
        Home home = new Home(roboVMResolver.resolveAndUnpackRoboVMDistArtifact(Version.getVersion()));

        Config.Builder config = new Config.Builder();

        config.home(home);

        for (String p : System.getProperty("java.class.path").split(File.pathSeparator)) {
            config.addClasspathEntry(new File(p));
        }

        config.addForceLinkClass(RunnerClass.class.getName());
        config.logger(new ConsoleLogger(true));
        config.skipInstall(true);

        return config;
    }

    private static class TestRunListener extends RunListener {
        List<String> successful = new ArrayList<>();
        List<String> failed = new ArrayList<>();
        boolean success = true;
        Failure failure = null;

        @Override
        public void testStarted(Description description) throws Exception {
            success = true;
            failure = null;
        }

        @Override
        public void testFailure(Failure failure) throws Exception {
            success = false;
            this.failure = failure;
        }

        @Override
        public void testFinished(Description description) throws Exception {
            if (success) {
                successful.add(description.toString());
            } else {
                failed.add(failure.toString());
            }
        }
    }
}
