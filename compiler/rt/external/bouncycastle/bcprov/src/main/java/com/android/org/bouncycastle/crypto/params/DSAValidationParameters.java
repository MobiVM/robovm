/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.crypto.params;

import com.android.org.bouncycastle.util.Arrays;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class DSAValidationParameters
{
    private int usageIndex;
    private byte[]  seed;
    private int     counter;

    public DSAValidationParameters(
        byte[]  seed,
        int     counter)
    {
        this(seed, counter, -1);
    }

    public DSAValidationParameters(
        byte[]  seed,
        int     counter,
        int     usageIndex)
    {
        this.seed = Arrays.clone(seed);
        this.counter = counter;
        this.usageIndex = usageIndex;
    }

    public int getCounter()
    {
        return counter;
    }

    public byte[] getSeed()
    {
        return Arrays.clone(seed);
    }

    public int getUsageIndex()
    {
        return usageIndex;
    }

    public int hashCode()
    {
        return counter ^ Arrays.hashCode(seed);
    }
    
    public boolean equals(
        Object o)
    {
        if (!(o instanceof DSAValidationParameters))
        {
            return false;
        }

        DSAValidationParameters  other = (DSAValidationParameters)o;

        if (other.counter != this.counter)
        {
            return false;
        }

        return Arrays.areEqual(this.seed, other.seed);
    }
}
