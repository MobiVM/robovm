/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2018 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
package android.icu.impl.number.range;

/**
 * A small, mutable internal helper class for keeping track of offsets on range patterns.
 * @hide Only a subset of ICU is exposed in Android
 */
public class PrefixInfixSuffixLengthHelper {
    public int lengthPrefix = 0;
    public int length1 = 0;
    public int lengthInfix = 0;
    public int length2 = 0;
    public int lengthSuffix = 0;

    public int index0() {
        return lengthPrefix;
    }

    public int index1() {
        return lengthPrefix + length1;
    }

    public int index2() {
        return lengthPrefix + length1 + lengthInfix;
    }

    public int index3() {
        return lengthPrefix + length1 + lengthInfix + length2;
    }
}
