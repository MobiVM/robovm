/**
*******************************************************************************
* Copyright (C) 1996-2006, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*
*******************************************************************************
*/

package com.android.icu.charset;

import libcore.util.NativeAllocationRegistry;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

public final class NativeConverter {

    private static final NativeAllocationRegistry registry = NativeAllocationRegistry
        .createMalloced(NativeConverter.class.getClassLoader(), getNativeFinalizer());

    /** All methods are static, no need to instantiate. */
    private NativeConverter() {}

    /* package */ static native int decode(long converterHandle, byte[] input, int inEnd,
            char[] output, int outEnd, int[] data, boolean flush);

    /* package */ static native int encode(long converterHandle, char[] input, int inEnd,
            byte[] output, int outEnd, int[] data, boolean flush);

    /* package */ static native long openConverter(String charsetName);
    /* package */ static native void closeConverter(long converterHandle);

    /* package */ static void registerConverter(Object referrent, long converterHandle) {
        registry.registerNativeAllocation(referrent, converterHandle);
    }

    /* package */ static native void resetByteToChar(long converterHandle);
    /* package */ static native void resetCharToByte(long converterHandle);

    /* package */ static native byte[] getSubstitutionBytes(long converterHandle);

    /* package */ static native int getMaxBytesPerChar(long converterHandle);
    /* package */ static native float getAveBytesPerChar(long converterHandle);
    /* package */ static native float getAveCharsPerByte(long converterHandle);

    /* package */ static native boolean contains(String converterName1, String converterName2);

    /* package */ static native String[] getAvailableCharsetNames();

    /* package */ static native Charset charsetForName(String charsetName);

    // Translates from Java's enum to the magic numbers #defined in "NativeConverter.cpp".
    private static int translateCodingErrorAction(CodingErrorAction action) {
        if (action == CodingErrorAction.REPORT) {
            return 0;
        } else if (action == CodingErrorAction.IGNORE) {
            return 1;
        } else if (action == CodingErrorAction.REPLACE) {
            return 2;
        } else {
            throw new AssertionError(); // Someone changed the enum.
        }
    }

    /* package */ static void setCallbackDecode(long converterHandle, CharsetDecoder decoder) {
        setCallbackDecode(converterHandle,
                          translateCodingErrorAction(decoder.malformedInputAction()),
                          translateCodingErrorAction(decoder.unmappableCharacterAction()),
                          decoder.replacement());
    }
    private static native void setCallbackDecode(long converterHandle, int onMalformedInput, int onUnmappableInput, String subChars);

    /* package */ static void setCallbackEncode(long converterHandle, CharsetEncoder encoder) {
        setCallbackEncode(converterHandle,
                          translateCodingErrorAction(encoder.malformedInputAction()),
                          translateCodingErrorAction(encoder.unmappableCharacterAction()),
                          encoder.replacement());
    }
    private static native void setCallbackEncode(long converterHandle, int onMalformedInput, int onUnmappableInput, byte[] subBytes);

    private static native long getNativeFinalizer();

    // Just the subset of error codes needed by CharsetDecoderICU/CharsetEncoderICU.
    /* package */ static final int U_ZERO_ERROR = 0;
    /* package */ static final int U_INVALID_CHAR_FOUND = 10;
    /* package */ static final int U_TRUNCATED_CHAR_FOUND = 11;
    /* package */ static final int U_ILLEGAL_CHAR_FOUND = 12;
    /* package */ static final int U_BUFFER_OVERFLOW_ERROR = 15;
    /* package */ static boolean U_FAILURE(int error) {
      return error > U_ZERO_ERROR;
    }
}
