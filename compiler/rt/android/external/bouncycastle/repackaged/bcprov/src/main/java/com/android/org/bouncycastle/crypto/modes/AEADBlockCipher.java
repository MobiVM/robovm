/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.crypto.modes;

import com.android.org.bouncycastle.crypto.BlockCipher;

/**
 * An {@link AEADCipher} based on a {@link BlockCipher}.
 * @hide This class is not part of the Android public SDK API
 */
public interface AEADBlockCipher
    extends AEADCipher
{
    /**
     * return the {@link BlockCipher} this object wraps.
     *
     * @return the {@link BlockCipher} this object wraps.
     */
    public BlockCipher getUnderlyingCipher();
}
