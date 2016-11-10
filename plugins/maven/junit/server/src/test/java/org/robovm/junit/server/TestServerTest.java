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

package org.robovm.junit.server;

import org.junit.Test;
import org.robovm.junit.protocol.Command;
import rx.functions.Action1;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Created by ash on 18/06/2015.
 */
public class TestServerTest {

    @Test
    public void testSuccessfulWholeClassRunOutsideOfRoboVM() throws Exception {
        final TestServer testServer = new TestServer();
        PipedOutputStream cmdStream = new PipedOutputStream();
        final PipedInputStream in = new PipedInputStream(cmdStream);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();

        OutputStreamWriter cmdWriter = new OutputStreamWriter(cmdStream);
        cmdWriter.write(Command.run + " " + RunnerClass.class.getName() + "\n");
        cmdWriter.flush();
        cmdWriter.write(Command.terminate + "\n");
        cmdWriter.flush();

        final ArrayList<String> results = new ArrayList<>();

        /* take two emissions */
        testServer.run(in, out).take(2).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                results.add(s);
            }
        });

        System.out.println(results.get(0));
        assertTrue(results.get(0).equals(Command.run + " " + RunnerClass.class.getName()));
        System.out.println(results.get(1));
        assertTrue(results.get(1).equals(Command.terminate.toString()));
    }

}
