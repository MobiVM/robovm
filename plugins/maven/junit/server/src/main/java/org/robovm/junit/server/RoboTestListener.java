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
package org.robovm.junit.server;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.robovm.junit.protocol.ResultObject;
import org.robovm.junit.protocol.ResultType;

/**
 * JUnit RunListener which sends results via an output stream (eg. socket) to a
 * listening instance (eg. surefire provider)
 */
public class RoboTestListener extends org.junit.runner.notification.RunListener {
    private final PrintWriter writer;

    public RoboTestListener(OutputStream out) {
        this.writer = new PrintWriter(out, true);
    }

    @Override
    public void testAssumptionFailure(Failure failure) {
        sendToHost(createFailureResult(failure, ResultType.AssumptionFailure));
    }
    
    @Override
    public void testIgnored(Description description) throws Exception {
        sendToHost(createDescriptionResult(description, ResultType.Ignored));
    }

    @Override
    public void testRunStarted(Description description) throws Exception {
        sendToHost(createDescriptionResult(description, ResultType.RunStarted));
    }

    @Override
    public void testRunFinished(Result result) throws Exception {
        sendToHost(createResultResult(result, ResultType.RunFinished));
    }

    @Override
    public void testStarted(Description description) throws Exception {
        sendToHost(createDescriptionResult(description, ResultType.Started));
    }

    @Override
    public void testFinished(Description description) throws Exception {
        sendToHost(createDescriptionResult(description, ResultType.Finished));
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        sendToHost(createFailureResult(failure, ResultType.Failure));
    }

    private ResultObject createFailureResult(Failure failure, ResultType type) {
        ResultObject resultObject = new ResultObject();
        resultObject.setFailure(failure);
        resultObject.setResultType(type);
        return resultObject;
    }

    private ResultObject createDescriptionResult(Description description, ResultType type) {
        ResultObject resultObject = new ResultObject();
        resultObject.setDescription(description);
        resultObject.setResultType(type);
        return resultObject;
    }

    private ResultObject createResultResult(Result result, ResultType type) {
        ResultObject resultObject = new ResultObject();
        resultObject.setResult(result);
        resultObject.setResultType(type);
        return resultObject;
    }

    public void sendToHost(ResultObject message) {
        try {
            transmit(message);
        } catch (Exception e) {
            // Lost connection to host for some reason. We cannot recover from
            // this in any way.
            throw new Error(e);
        }
    }

    private void transmit(ResultObject message) throws IOException, InterruptedException {
        writer.println(message.toJson());
        writer.flush();
    }

}
