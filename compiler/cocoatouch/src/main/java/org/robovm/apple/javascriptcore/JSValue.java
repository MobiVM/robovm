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
/*<annotations>*/@Library("JavaScriptCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/JSValue/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class JSValuePtr extends Ptr<JSValue, JSValuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(JSValue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public JSValue() {}
    protected JSValue(Handle h, long handle) { super(h, handle); }
    protected JSValue(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "context")
    public native JSContext getContext();
    @Property(selector = "isUndefined")
    public native boolean isUndefined();
    @Property(selector = "isNull")
    public native boolean isNull();
    @Property(selector = "isBoolean")
    public native boolean isBoolean();
    @Property(selector = "isNumber")
    public native boolean isNumber();
    @Property(selector = "isString")
    public native boolean isString();
    @Property(selector = "isObject")
    public native boolean isObject();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isArray")
    public native boolean isArray();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isDate")
    public native boolean isDate();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isSymbol")
    public native boolean isSymbol();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "isBigInt")
    public native boolean isBigInt();
    @Property(selector = "JSValueRef")
    public native JSValueRef getJSValueRef();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("JavaScriptCore")
    public static class PropertyDescriptorKeys {
        static { Bro.bind(PropertyDescriptorKeys.class); }

        @GlobalValue(symbol="JSPropertyDescriptorWritableKey", optional=true)
        public static native NSString Writable();
        @GlobalValue(symbol="JSPropertyDescriptorEnumerableKey", optional=true)
        public static native NSString Enumerable();
        @GlobalValue(symbol="JSPropertyDescriptorConfigurableKey", optional=true)
        public static native NSString Configurable();
        @GlobalValue(symbol="JSPropertyDescriptorValueKey", optional=true)
        public static native NSString Value();
        @GlobalValue(symbol="JSPropertyDescriptorGetKey", optional=true)
        public static native NSString Get();
        @GlobalValue(symbol="JSPropertyDescriptorSetKey", optional=true)
        public static native NSString Set();
    }
    
    @Method(selector = "toObject")
    public native NSObject toObject();
    @Method(selector = "toObjectOfClass:")
    public native NSObject toObjectOfClass(Class<?> expectedClass);
    @Method(selector = "toBool")
    public native boolean toBool();
    @Method(selector = "toDouble")
    public native double toDouble();
    @Method(selector = "toInt32")
    public native int toInt32();
    @Method(selector = "toUInt32")
    public native int toUInt32();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "toInt64")
    public native long toInt64();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "toUInt64")
    public native long toUInt64();
    @Method(selector = "toNumber")
    public native NSNumber toNumber();
    @Method(selector = "toString")
    public native String toString();
    @Method(selector = "toDate")
    public native NSDate toDate();
    @Method(selector = "toArray")
    public native NSArray<?> toArray();
    @Method(selector = "toDictionary")
    public native NSDictionary<?, ?> toDictionary();
    @Method(selector = "isInstanceOf:")
    public native boolean isInstanceOf(NSObject value);
    @Method(selector = "isEqualToObject:")
    public native boolean isEqualToObject(NSObject value);
    @Method(selector = "isEqualWithTypeCoercionToObject:")
    public native boolean isEqual(NSObject value);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "compareJSValue:")
    public native JSRelationCondition compareJSValue(JSValue other);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "compareInt64:")
    public native JSRelationCondition compareInt64(long other);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "compareUInt64:")
    public native JSRelationCondition compareUInt64(long other);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "compareDouble:")
    public native JSRelationCondition compareDouble(double other);
    @Method(selector = "callWithArguments:")
    public native JSValue call(NSArray<?> arguments);
    @Method(selector = "constructWithArguments:")
    public native JSValue construct(NSArray<?> arguments);
    @Method(selector = "invokeMethod:withArguments:")
    public native JSValue invokeMethod(String method, NSArray<?> arguments);
    @Method(selector = "valueWithObject:inContext:")
    public static native JSValue valueWithObject(NSObject value, JSContext context);
    @Method(selector = "valueWithBool:inContext:")
    public static native JSValue valueWithBool(boolean value, JSContext context);
    @Method(selector = "valueWithDouble:inContext:")
    public static native JSValue valueWithDouble(double value, JSContext context);
    @Method(selector = "valueWithInt32:inContext:")
    public static native JSValue valueWithInt32(int value, JSContext context);
    @Method(selector = "valueWithUInt32:inContext:")
    public static native JSValue valueWithUInt32(int value, JSContext context);
    @Method(selector = "valueWithNewObjectInContext:")
    public static native JSValue valueWithNewObject(JSContext context);
    @Method(selector = "valueWithNewArrayInContext:")
    public static native JSValue valueWithNewArray(JSContext context);
    @Method(selector = "valueWithNewRegularExpressionFromPattern:flags:inContext:")
    public static native JSValue valueWithNewRegularExpression(String pattern, String flags, JSContext context);
    @Method(selector = "valueWithNewErrorFromMessage:inContext:")
    public static native JSValue valueWithNewErrorFromMessage(String message, JSContext context);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "valueWithNewPromiseInContext:fromExecutor:")
    public static native JSValue valueWithNewPromise(JSContext context, @Block VoidBlock2<JSValue, JSValue> callback);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "valueWithNewPromiseResolvedWithResult:inContext:")
    public static native JSValue valueWithNewPromiseResolvedWithResult(NSObject result, JSContext context);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "valueWithNewPromiseRejectedWithReason:inContext:")
    public static native JSValue valueWithNewPromiseRejectedWithReason(NSObject reason, JSContext context);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "valueWithNewSymbolFromDescription:inContext:")
    public static native JSValue valueWithNewSymbolFromDescription(String description, JSContext context);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "valueWithNewBigIntFromString:inContext:")
    public static native JSValue valueWithNewBigIntFromString(String string, JSContext context);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "valueWithNewBigIntFromInt64:inContext:")
    public static native JSValue valueWithNewBigIntFromInt64(long int64, JSContext context);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "valueWithNewBigIntFromUInt64:inContext:")
    public static native JSValue valueWithNewBigIntFromUInt64(long uint64, JSContext context);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "valueWithNewBigIntFromDouble:inContext:")
    public static native JSValue valueWithNewBigIntFromDouble(double value, JSContext context);
    @Method(selector = "valueWithNullInContext:")
    public static native JSValue valueWithNull(JSContext context);
    @Method(selector = "valueWithUndefinedInContext:")
    public static native JSValue valueWithUndefined(JSContext context);
    @Method(selector = "toPoint")
    public native @ByVal CGPoint toPoint();
    @Method(selector = "toRange")
    public native @ByVal NSRange toRange();
    @Method(selector = "toRect")
    public native @ByVal CGRect toRect();
    @Method(selector = "toSize")
    public native @ByVal CGSize toSize();
    @Method(selector = "valueWithPoint:inContext:")
    public static native JSValue valueWithPoint(@ByVal CGPoint point, JSContext context);
    @Method(selector = "valueWithRange:inContext:")
    public static native JSValue valueWithRange(@ByVal NSRange range, JSContext context);
    @Method(selector = "valueWithRect:inContext:")
    public static native JSValue valueWithRect(@ByVal CGRect rect, JSContext context);
    @Method(selector = "valueWithSize:inContext:")
    public static native JSValue valueWithSize(@ByVal CGSize size, JSContext context);
    @Method(selector = "valueForProperty:")
    public native JSValue valueForProperty(NSObject property);
    @Method(selector = "setValue:forProperty:")
    public native void setValueForProperty(NSObject value, NSObject property);
    @Method(selector = "deleteProperty:")
    public native boolean deleteProperty(NSObject property);
    @Method(selector = "hasProperty:")
    public native boolean hasProperty(NSObject property);
    @Method(selector = "defineProperty:descriptor:")
    public native void defineProperty(NSObject property, NSObject descriptor);
    @Method(selector = "valueAtIndex:")
    public native JSValue valueAtIndex(@MachineSizedUInt long index);
    @Method(selector = "setValue:atIndex:")
    public native void setValueAtIndex(NSObject value, @MachineSizedUInt long index);
    @Method(selector = "objectForKeyedSubscript:")
    public native JSValue objectForKeyedSubscript(NSObject key);
    @Method(selector = "objectAtIndexedSubscript:")
    public native JSValue objectAtIndexedSubscript(@MachineSizedUInt long index);
    @Method(selector = "setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(NSObject object, NSObject key);
    @Method(selector = "setObject:atIndexedSubscript:")
    public native void setObjectAtIndexedSubscript(NSObject object, @MachineSizedUInt long index);
    @Method(selector = "valueWithJSValueRef:inContext:")
    public static native JSValue valueWithJSValueRef(JSValueRef value, JSContext context);
    /*</methods>*/
}
