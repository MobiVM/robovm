/**
*******************************************************************************
* Copyright (C) 1996-2005, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*
*******************************************************************************
*/

package com.android.icu.charset;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * This class is used from native code associated with {@link NativeConverter}.
 */
public final class CharsetICU extends Charset {
    private final String icuCanonicalName;

    /**
     * Called by native codes.
     */
    protected CharsetICU(String canonicalName, String icuCanonName, String[] aliases) {
         super(canonicalName, aliases);
         icuCanonicalName = icuCanonName;
    }

    @Override
    public CharsetDecoder newDecoder() {
        return CharsetDecoderICU.newInstance(this, icuCanonicalName);
    }

    @Override
    public CharsetEncoder newEncoder() {
        return CharsetEncoderICU.newInstance(this, icuCanonicalName);
    }

    @Override
    public boolean contains(Charset cs) {
        if (cs == null) {
            return false;
        } else if (this.equals(cs)) {
            return true;
        }
        return NativeConverter.contains(this.name(), cs.name());
    }
}
