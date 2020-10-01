/*
 * Copyright (C) 2018 The Android Open Source Project
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

package libcore.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Proof of concept / dummy code whose only purpose is to demonstrate that Java 9
 * language features are supported in libcore.
 */
public class Java9LanguageFeatures {

    public interface Person {
        String name();

        default boolean isPalindrome() {
            return name().equals(reverse(name()));
        }

        default boolean isPalindromeIgnoreCase() {
            return name().equalsIgnoreCase(reverse(name()));
        }

        // Language feature: private interface method
        private String reverse(String s) {
            return new StringBuilder(s).reverse().toString();
        }
    }

    @SafeVarargs
    public static<T> String toListString(T... values) {
        return toString(values).toString();
    }

    // Language feature: @SafeVarargs on private methods
    @SafeVarargs
    private static<T> List<String> toString(T... values) {
        List<String> result = new ArrayList<>();
        for (T value : values) {
            result.add(value.toString());
        }
        return result;
    }

    public <T> AtomicReference<T> createReference(T content) {
        // Language feature: <> on anonymous class
        return new AtomicReference<>(content) { };
    }

    public static byte[] copy(byte[] bytes) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(bytes);
        try (inputStream) { // Language feature: try on effectively-final variable
            int value;
            while ((value = inputStream.read()) != -1) {
                byteArrayOutputStream.write(value);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }


}
