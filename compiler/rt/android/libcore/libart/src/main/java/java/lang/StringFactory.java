/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package java.lang;

import dalvik.annotation.optimization.FastNative;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import libcore.util.CharsetUtils;
import libcore.util.EmptyArray;

/**
 * Class used to generate strings instead of calling String.&lt;init&gt;.
 *
 * @hide
 */
public final class StringFactory {

    // TODO: Remove once native methods are in place.
    private static final char REPLACEMENT_CHAR = (char) 0xfffd;

    public static String newEmptyString() {
        return newStringFromChars(EmptyArray.CHAR, 0, 0);
    }

    public static String newStringFromBytes(byte[] data) {
        return newStringFromBytes(data, 0, data.length);
    }

    public static String newStringFromBytes(byte[] data, int high) {
        return newStringFromBytes(data, high, 0, data.length);
    }

    public static String newStringFromBytes(byte[] data, int offset, int byteCount) {
        return newStringFromBytes(data, offset, byteCount, Charset.defaultCharset());
    }

    @FastNative
    public static native String newStringFromBytes(byte[] data, int high, int offset, int byteCount);

    public static String newStringFromBytes(byte[] data, int offset, int byteCount, String charsetName) throws UnsupportedEncodingException {
        return newStringFromBytes(data, offset, byteCount, Charset.forNameUEE(charsetName));
    }

    public static String newStringFromBytes(byte[] data, String charsetName) throws UnsupportedEncodingException {
        return newStringFromBytes(data, 0, data.length, Charset.forNameUEE(charsetName));
    }

    // TODO: Implement this method natively.
    public static String newStringFromBytes(byte[] data, int offset, int byteCount, Charset charset) {
        if ((offset | byteCount) < 0 || byteCount > data.length - offset) {
            throw new StringIndexOutOfBoundsException(data.length, offset, byteCount);
        }

        char[] value;
        int length;

        // We inline UTF-8, ISO-8859-1, and US-ASCII decoders for speed.
        String canonicalCharsetName = charset.name();
        if (canonicalCharsetName.equals("UTF-8")) {
            return newStringFromUtf8Bytes(data, offset, byteCount);
        } else if (canonicalCharsetName.equals("ISO-8859-1")) {
            value = new char[byteCount];
            length = byteCount;
            CharsetUtils.isoLatin1BytesToChars(data, offset, byteCount, value);
        } else if (canonicalCharsetName.equals("US-ASCII")) {
            value = new char[byteCount];
            length = byteCount;
            CharsetUtils.asciiBytesToChars(data, offset, byteCount, value);
        } else {
            CharBuffer cb = charset.decode(ByteBuffer.wrap(data, offset, byteCount));
            length = cb.length();
            // The call to newStringFromChars below will copy length bytes out of value, so it does
            // not matter that cb.array().length may be > cb.length() or that a Charset could keep a
            // reference to the CharBuffer it returns and later mutate it.
            value = cb.array();
        }
        return newStringFromChars(value, 0, length);
    }

    public static String newStringFromBytes(byte[] data, Charset charset) {
        return newStringFromBytes(data, 0, data.length, charset);
    }

    public static String newStringFromChars(char[] data) {
        return newStringFromChars(data, 0, data.length);
    }

    public static String newStringFromChars(char[] data, int offset, int charCount) {
        if ((offset | charCount) < 0 || charCount > data.length - offset) {
            throw new StringIndexOutOfBoundsException(data.length, offset, charCount);
        }
        return newStringFromChars(offset, charCount, data);
    }

    // The char array passed as {@code java_data} must not be a null reference.
    @FastNative
    static native String newStringFromChars(int offset, int charCount, char[] data);

    @FastNative
    public static native String newStringFromString(String toCopy);

    @FastNative
    public static native String newStringFromUtf8Bytes(byte[] data, int offset, int byteCount);

    public static String newStringFromStringBuffer(StringBuffer stringBuffer) {
        synchronized (stringBuffer) {
            return newStringFromChars(stringBuffer.getValue(), 0, stringBuffer.length());
        }
    }

    // TODO: Implement this method natively.
    public static String newStringFromCodePoints(int[] codePoints, int offset, int count) {
        if (codePoints == null) {
            throw new NullPointerException("codePoints == null");
        }
        if ((offset | count) < 0 || count > codePoints.length - offset) {
            throw new StringIndexOutOfBoundsException(codePoints.length, offset, count);
        }
        char[] value = new char[count * 2];
        int end = offset + count;
        int length = 0;
        for (int i = offset; i < end; i++) {
            length += Character.toChars(codePoints[i], value, length);
        }
        return newStringFromChars(value, 0, length);
    }

    public static String newStringFromStringBuilder(StringBuilder stringBuilder) {
        return newStringFromChars(stringBuilder.getValue(), 0, stringBuilder.length());
    }
}
