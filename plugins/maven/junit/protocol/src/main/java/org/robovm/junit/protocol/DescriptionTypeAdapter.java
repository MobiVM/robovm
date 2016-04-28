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

import com.google.gson.*;

import org.junit.runner.Description;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class DescriptionTypeAdapter implements JsonDeserializer<Description>, JsonSerializer<Description> {
    @Override
    public JsonElement serialize(Description description, Type type,
            JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("display_name", new JsonPrimitive(description.getDisplayName()));

        ArrayList<Description> subDescription = description.getChildren();

        JsonArray array = new JsonArray();
        for (Description desc : subDescription) {
            array.add(jsonSerializationContext.serialize(desc));
        }

        jsonObject.add("sub_description", array);

        return jsonObject;
    }

    @Override
    public Description deserialize(JsonElement jsonElement, Type type,
            JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        String displayName = jsonObject.get("display_name").getAsString();
        Description description = Description.createSuiteDescription(displayName);

        JsonArray array = jsonObject.getAsJsonArray("sub_description");

        for (JsonElement e : array) {
            description.addChild(jsonDeserializationContext.<Description>deserialize(e, Description.class));
        }
        return description;
    }
}
