/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSNumber/*</name>*/ 
    extends /*<extends>*/NSValue/*</extends>*/ 
    /*<implements>*/implements NSPropertyList/*</implements>*/ {

    /*<ptr>*/public static class NSNumberPtr extends Ptr<NSNumber, NSNumberPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSNumber.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSNumber(Handle h, long handle) { super(h, handle); }
    protected NSNumber(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "charValue")
    public native byte byteValue();
    @Property(selector = "shortValue")
    public native short shortValue();
    @Property(selector = "unsignedShortValue")
    public native char charValue();
    @Property(selector = "intValue")
    public native int intValue();
    @Property(selector = "longLongValue")
    public native long longValue();
    @Property(selector = "floatValue")
    public native float floatValue();
    @Property(selector = "doubleValue")
    public native double doubleValue();
    @Property(selector = "boolValue")
    public native boolean booleanValue();
    @Property(selector = "stringValue")
    public native String stringValue();
    @Property(selector = "decimalValue")
    public native @ByVal NSDecimal decimalValue();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    public static NSNumber valueOf(Number value) {
        if (value instanceof Byte) {
            return valueOf((byte)value);
        }
        if (value instanceof Short) {
            return valueOf((short)value);
        }
        if (value instanceof Integer) {
            return valueOf((int)value);
        }
        if (value instanceof Long) {
            return valueOf((long)value);
        }
        if (value instanceof Float) {
            return valueOf((float)value);
        }
        if (value instanceof Double) {
            return valueOf((double)value);
        }
        throw new IllegalArgumentException("value is not a supported number type: " + value.getClass());
    }
    
    @Method(selector = "numberWithChar:")
    static native @Pointer long pointerValueOf(byte value);
    
    @Method(selector = "numberWithShort:")
    static native @Pointer long pointerValueOf(short value);
    
    @Method(selector = "numberWithUnsignedShort:")
    static native @Pointer long pointerValueOf(char value);
    
    @Method(selector = "numberWithInt:")
    static native @Pointer long pointerValueOf(int value);
    
    @Method(selector = "numberWithLongLong:")
    static native @Pointer long pointerValueOf(long value);
    
    @Method(selector = "numberWithFloat:")
    static native @Pointer long pointerValueOf(float value);
    
    @Method(selector = "numberWithDouble:")
    static native @Pointer long pointerValueOf(double value);
    
    @Method(selector = "numberWithBool:")
    static native @Pointer long pointerValueOf(boolean value);
    
    static long pointerValueOf(Number value) {
        if (value instanceof Byte) {
            return pointerValueOf((byte)value);
        } else if (value instanceof Short) {
            return pointerValueOf((short)value);
        } else if (value instanceof Integer) {
            return pointerValueOf((int)value);
        } else if (value instanceof Long) {
            return pointerValueOf((long)value);
        } else if (value instanceof Float) {
            return pointerValueOf((float)value);
        } else if (value instanceof Double) {
            return pointerValueOf((double)value);
        } else {
            throw new IllegalArgumentException("value is not a supported number type: " + value.getClass());
        }
    }
    
    /*<methods>*/
    @Method(selector = "compare:")
    public native NSComparisonResult compare(NSNumber otherNumber);
    @Method(selector = "isEqualToNumber:")
    public native boolean equalsTo(NSNumber number);
    @Method(selector = "descriptionWithLocale:")
    public native String toString(NSLocale locale);
    @Method(selector = "numberWithChar:")
    public static native NSNumber valueOf(byte value);
    @Method(selector = "numberWithShort:")
    public static native NSNumber valueOf(short value);
    @Method(selector = "numberWithUnsignedShort:")
    public static native NSNumber valueOf(char value);
    @Method(selector = "numberWithInt:")
    public static native NSNumber valueOf(int value);
    @Method(selector = "numberWithLongLong:")
    public static native NSNumber valueOf(long value);
    @Method(selector = "numberWithFloat:")
    public static native NSNumber valueOf(float value);
    @Method(selector = "numberWithDouble:")
    public static native NSNumber valueOf(double value);
    @Method(selector = "numberWithBool:")
    public static native NSNumber valueOf(boolean value);
    /*</methods>*/
}
