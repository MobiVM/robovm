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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * Serialization class for exceptions
 */
public class ThrowableTypeAdapter implements JsonSerializer<Throwable>, JsonDeserializer<Throwable> {

    @Override
    public JsonElement serialize(Throwable throwable, Type type,
            JsonSerializationContext jsonSerializationContext) {

        return serialize(throwable);
    }

    private JsonObject serialize(Throwable throwable) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("class", throwable.getClass().getName());
        if (throwable.getMessage() != null) {
            jsonObject.addProperty("message", throwable.getMessage());
        }
        jsonObject.add("stackTrace", serialize(throwable.getStackTrace()));
        if (throwable.getCause() != null && throwable.getCause() != throwable) {
            jsonObject.add("cause", serialize(throwable.getCause()));
        }
        return jsonObject;
    }

    private JsonArray serialize(StackTraceElement[] stackTrace) {
        JsonArray result = new JsonArray();
        for (StackTraceElement ste : stackTrace) {
            result.add(serialize(ste));
        }
        return result;
    }

    private JsonObject serialize(StackTraceElement ste) {
        JsonObject result = new JsonObject();
        result.addProperty("className", ste.getClassName());
        result.addProperty("methodName", ste.getMethodName());
        result.addProperty("fileName", ste.getFileName());
        result.addProperty("lineNumber", ste.getLineNumber());
        return result;
    }

    @Override
    public Throwable deserialize(JsonElement jsonElement, Type type,
            JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

        return deserializeThrowable(jsonElement.getAsJsonObject());
    }
    
    private Throwable deserializeThrowable(JsonObject jsonObject) {
        String className = jsonObject.get("class").getAsString();
        String message = jsonObject.get("message") != null ? jsonObject.get("message").getAsString() : null;
        StackTraceElement[] stackTrace = deserializeStackTraceElements(jsonObject.get("stackTrace").getAsJsonArray());
        Throwable cause = jsonObject.get("cause") != null ? deserializeThrowable(jsonObject.get("cause").getAsJsonObject()) : null;

        try {
            
            @SuppressWarnings("unchecked")
            Class<Throwable> cls = (Class<Throwable>) Class.forName(className);
            Throwable t = cls.getConstructor(String.class).newInstance(message);
            t.setStackTrace(stackTrace);
            if (cause != null) {
                t.initCause(cause);
            }
            return t;
        } catch (Throwable t) {
            /*
             * An error occurred. Could be that the class isn't available in
             * this VM or that it doesn't have an appropriate constructor.
             * Create an Error instance which will pretend to be the original
             * exception.
             */
            if (message == null) {
                message = className;
            }
            Error e = new Error(message);
            e.setStackTrace(stackTrace);
            if (cause != null) {
                e.initCause(cause);
            }
            return e;
        }
    }
    
    private StackTraceElement[] deserializeStackTraceElements(JsonArray array) {
        List<StackTraceElement> stackTrace = new ArrayList<>();
        for (JsonElement e : array) {
            stackTrace.add(deserializeStackTraceElement(e.getAsJsonObject()));
        }
        return stackTrace.toArray(new StackTraceElement[stackTrace.size()]);
    }

    private StackTraceElement deserializeStackTraceElement(JsonObject o) {
        return new StackTraceElement(
                o.get("className").getAsString(),
                o.get("methodName").getAsString(),
                o.get("fileName").getAsString(),
                o.get("lineNumber").getAsInt());
    }

}
