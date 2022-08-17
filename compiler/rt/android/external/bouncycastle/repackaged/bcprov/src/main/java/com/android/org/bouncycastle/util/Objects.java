/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.util;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class Objects
{
    public static boolean areEqual(Object a, Object b)
    {
        return a == b || (null != a && null != b && a.equals(b));
    }

    public static int hashCode(Object obj)
    {
        return null == obj ? 0 : obj.hashCode();
    }
}
