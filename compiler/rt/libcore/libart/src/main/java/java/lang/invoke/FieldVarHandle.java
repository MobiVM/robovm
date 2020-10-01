/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package java.lang.invoke;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * A VarHandle that's associated with an ArtField.
 * @hide
 */
final class FieldVarHandle extends VarHandle {
    private final long artField;

    private FieldVarHandle(Field field, Class<?> declaringClass) {
        super(field.getType(), Modifier.isFinal(field.getModifiers()), declaringClass);
        artField = field.getArtField();
    }

    private FieldVarHandle(Field field) {
        super(field.getType(), Modifier.isFinal(field.getModifiers()));
        artField = field.getArtField();
    }

    static FieldVarHandle create(Field field) {
        if (Modifier.isStatic(field.getModifiers())) {
            return new FieldVarHandle(field);
        } else {
            return new FieldVarHandle(field, field.getDeclaringClass());
        }
    }
}
