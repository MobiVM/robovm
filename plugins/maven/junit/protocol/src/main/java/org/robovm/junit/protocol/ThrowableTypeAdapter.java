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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Type;

import biz.source_code.base64Coder.Base64Coder;

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
        JsonObject jsonObject = new JsonObject();
        String throwableString = serialize(throwable);
        jsonObject.addProperty("throwableObject", throwableString);
        return jsonObject;
    }

    private String serialize(Throwable throwable) {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(byteStream);
            outputStream.writeObject(throwable);
            outputStream.flush();
            return new String(Base64Coder.encode(byteStream.toByteArray()));
        } catch (NotSerializableException e) {
            return serialize(new UnserializableException(throwable));
        } catch (IOException e) {
            throw new Error(e);
        }
    }
    
    @Override
    public Throwable deserialize(JsonElement jsonElement, Type type,
            JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

        JsonObject jsonObject = jsonElement.getAsJsonObject();

        String throwableString = jsonObject.get("throwableObject").getAsString();

        byte bytes[] = Base64Coder.decode(throwableString);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (Throwable) objectInputStream.readObject();
        } catch (IOException e) {
            throw new Error(e);
        } catch (ClassNotFoundException e) {
            throw new Error(e);
        }
    }
}
