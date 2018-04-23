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
package org.robovm.junit.protocol;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.google.gson.JsonObject;

public class GsonTest {

    @Test
    public void testResultObjectSerializationDeserialization() {
        Exception thrownException = new RuntimeException(new IOException());

        ResultObject resultObject = new ResultObject();
        Description description = Description.createSuiteDescription("Main description");
        Description subDescription = Description.createSuiteDescription("Sub description");

        description.addChild(subDescription);

        resultObject.setResultType(ResultType.Finished);
        resultObject.setResult(new Result());
        resultObject.setDescription(description);
        resultObject.setFailure(
                new Failure(Description.createSuiteDescription("test"), thrownException));

        JsonObject json = (JsonObject) ResultObject.gson.toJsonTree(resultObject);

        assertEquals("Main description", json.get("description").getAsJsonObject().get("display_name").getAsString());
        assertEquals("Sub description", json.get("description").getAsJsonObject().get("sub_description")
                .getAsJsonArray().get(0).getAsJsonObject().get("display_name").getAsString());

        ResultObject resultObject2 = ResultObject.gson.fromJson(json, ResultObject.class);

        assertThrowablesEqual(thrownException, resultObject2.getFailure().getException(), false);
    }

    @Test
    public void testNonDeserializableException() throws Exception {
        NonDeserializableException e = new NonDeserializableException();
        ResultObject resultObject = new ResultObject();
        resultObject.setFailure(
                new Failure(Description.createSuiteDescription("test"), e));

        JsonObject json = (JsonObject) ResultObject.gson.toJsonTree(resultObject);
        ResultObject resultObject2 = ResultObject.gson.fromJson(json, ResultObject.class);

        assertThrowablesEqual(e, resultObject2.getFailure().getException(), true);
    }
    
    private void assertThrowablesEqual(Throwable expected, Throwable actual, boolean undeserializable) {
        if (!undeserializable) {
            assertEquals(expected.getClass(), actual.getClass());
            assertEquals(expected.getMessage(), actual.getMessage());
        } else {
            if (expected.getMessage() == null) {
                assertEquals(expected.getClass().getName(), actual.getMessage());
            } else {
                assertEquals(expected.getMessage(), actual.getMessage());
            }
        }
        
        assertArrayEquals(expected.getStackTrace(), actual.getStackTrace());
        
        Throwable cause1 = expected.getCause();
        Throwable cause2 = actual.getCause();
        if (cause1 == null) {
            assertNull(cause2);
        } else {
            assertNotNull(cause2);
        }

        if (cause1 != null) {
            assertThrowablesEqual(cause1, cause2, undeserializable);
        }
    }
    
    @SuppressWarnings("serial")
    public static class NonDeserializableException extends Exception {
    }
}
