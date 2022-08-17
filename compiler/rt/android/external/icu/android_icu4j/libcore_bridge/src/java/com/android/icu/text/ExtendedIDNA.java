/*
 * Copyright (C) 2020 The Android Open Source Project
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

package com.android.icu.text;

import android.icu.text.IDNA;
import android.icu.text.StringPrepParseException;

import libcore.api.IntraCoreApi;

import java.net.IDN;

/**
 * Provide extra functionalities on top of {@link IDNA} public APIs.
 *
 * @hide
 */
@IntraCoreApi
public class ExtendedIDNA {

    private ExtendedIDNA() {}

    /**
     * Converts an International Domain Name to Ascii conforming the IDNA2003 spec.
     *
     * @param src input string
     * @param options A bit set of 0, {@link IDN#ALLOW_UNASSIGNED}
     *                and {@link IDN#USE_STD3_ASCII_RULES}. Undefined behavior if other flag is
     *                passed.
     * @return the converted string
     *
     * @hide
     */
    @IntraCoreApi
    public static StringBuffer convertIDNToASCII(String src, int options)
            throws StringPrepParseException {
        return IDNA.convertIDNToASCII(src, options);
    }

    /**
     * Converts an International Domain Name to a Unicode string conforming the IDNA2003 spec.
     *
     * @param src input string
     * @param options A bit set of 0, {@link IDN#ALLOW_UNASSIGNED}
     *                and {@link IDN#USE_STD3_ASCII_RULES}. Undefined behavior if other flag is
     *                passed.
     * @return the converted string
     *
     * @hide
     */
    @IntraCoreApi
    public static StringBuffer convertIDNToUnicode(String src, int options)
            throws StringPrepParseException {
        return IDNA.convertIDNToUnicode(src, options);
    }
}
