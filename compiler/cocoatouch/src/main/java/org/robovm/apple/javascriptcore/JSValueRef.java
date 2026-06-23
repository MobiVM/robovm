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
package org.robovm.apple.javascriptcore;

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
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("JavaScriptCore")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/JSValueRef/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class JSValueRefPtr extends Ptr<JSValueRef, JSValueRefPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(JSValueRef.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected JSValueRef() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="JSValueGetType", optional=true)
    public static native JSType getType(JSContextRef ctx, JSValueRef value);
    @Bridge(symbol="JSValueIsUndefined", optional=true)
    public static native boolean isUndefined(JSContextRef ctx, JSValueRef value);
    @Bridge(symbol="JSValueIsNull", optional=true)
    public static native boolean isNull(JSContextRef ctx, JSValueRef value);
    @Bridge(symbol="JSValueIsBoolean", optional=true)
    public static native boolean isBoolean(JSContextRef ctx, JSValueRef value);
    @Bridge(symbol="JSValueIsNumber", optional=true)
    public static native boolean isNumber(JSContextRef ctx, JSValueRef value);
    @Bridge(symbol="JSValueIsString", optional=true)
    public static native boolean isString(JSContextRef ctx, JSValueRef value);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="JSValueIsSymbol", optional=true)
    public static native boolean isSymbol(JSContextRef ctx, JSValueRef value);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSValueIsBigInt", optional=true)
    public static native boolean isBigInt(JSContextRef ctx, JSValueRef value);
    @Bridge(symbol="JSValueIsObject", optional=true)
    public static native boolean isObject(JSContextRef ctx, JSValueRef value);
    @Bridge(symbol="JSValueIsObjectOfClass", optional=true)
    public static native boolean isObjectOfClass(JSContextRef ctx, JSValueRef value, JSClassRef jsClass);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="JSValueIsArray", optional=true)
    public static native boolean isArray(JSContextRef ctx, JSValueRef value);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="JSValueIsDate", optional=true)
    public static native boolean isDate(JSContextRef ctx, JSValueRef value);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSValueGetTypedArrayType", optional=true)
    public static native JSTypedArrayType getTypedArrayType(JSContextRef ctx, JSValueRef value, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSValueIsEqual", optional=true)
    public static native boolean isEqual(JSContextRef ctx, JSValueRef a, JSValueRef b, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSValueIsStrictEqual", optional=true)
    public static native boolean isStrictEqual(JSContextRef ctx, JSValueRef a, JSValueRef b);
    @Bridge(symbol="JSValueIsInstanceOfConstructor", optional=true)
    public static native boolean isInstanceOfConstructor(JSContextRef ctx, JSValueRef value, JSObjectRef constructor, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSValueCompare", optional=true)
    public static native JSRelationCondition compare(JSContextRef ctx, JSValueRef left, JSValueRef right, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSValueCompareInt64", optional=true)
    public static native JSRelationCondition compareInt64(JSContextRef ctx, JSValueRef left, long right, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSValueCompareUInt64", optional=true)
    public static native JSRelationCondition compareUInt64(JSContextRef ctx, JSValueRef left, long right, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSValueCompareDouble", optional=true)
    public static native JSRelationCondition compareDouble(JSContextRef ctx, JSValueRef left, double right, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSValueMakeUndefined", optional=true)
    public static native JSValueRef makeUndefined(JSContextRef ctx);
    @Bridge(symbol="JSValueMakeNull", optional=true)
    public static native JSValueRef makeNull(JSContextRef ctx);
    @Bridge(symbol="JSValueMakeBoolean", optional=true)
    public static native JSValueRef makeBoolean(JSContextRef ctx, boolean b);
    @Bridge(symbol="JSValueMakeNumber", optional=true)
    public static native JSValueRef makeNumber(JSContextRef ctx, double number);
    @Bridge(symbol="JSValueMakeString", optional=true)
    public static native JSValueRef makeString(JSContextRef ctx, JSStringRef string);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="JSValueMakeSymbol", optional=true)
    public static native JSValueRef makeSymbol(JSContextRef ctx, JSStringRef description);
    @Bridge(symbol="JSValueMakeFromJSONString", optional=true)
    public static native JSValueRef makeFromJSONString(JSContextRef ctx, JSStringRef string);
    @Bridge(symbol="JSValueCreateJSONString", optional=true)
    public static native JSStringRef createJSONString(JSContextRef ctx, JSValueRef value, int indent, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSValueToBoolean", optional=true)
    public static native boolean toBoolean(JSContextRef ctx, JSValueRef value);
    @Bridge(symbol="JSValueToNumber", optional=true)
    public static native double toNumber(JSContextRef ctx, JSValueRef value, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSValueToInt32", optional=true)
    public static native int toInt32(JSContextRef ctx, JSValueRef value, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSValueToUInt32", optional=true)
    public static native int toUInt32(JSContextRef ctx, JSValueRef value, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSValueToInt64", optional=true)
    public static native long toInt64(JSContextRef ctx, JSValueRef value, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="JSValueToUInt64", optional=true)
    public static native long toUInt64(JSContextRef ctx, JSValueRef value, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSValueToStringCopy", optional=true)
    public static native JSStringRef toStringCopy(JSContextRef ctx, JSValueRef value, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSValueToObject", optional=true)
    public static native JSObjectRef toObject(JSContextRef ctx, JSValueRef value, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSValueProtect", optional=true)
    public static native void protect(JSContextRef ctx, JSValueRef value);
    @Bridge(symbol="JSValueUnprotect", optional=true)
    public static native void unprotect(JSContextRef ctx, JSValueRef value);
    /*</methods>*/
}
