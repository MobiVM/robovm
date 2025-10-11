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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/JSObjectRef/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class JSObjectRefPtr extends Ptr<JSObjectRef, JSObjectRefPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(JSObjectRef.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected JSObjectRef() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="JSObjectMake", optional=true)
    public static native JSObjectRef make(JSContextRef ctx, JSClassRef jsClass, VoidPtr data);
    @Bridge(symbol="JSObjectMakeFunctionWithCallback", optional=true)
    public static native JSObjectRef makeFunctionWithCallback(JSContextRef ctx, JSStringRef name, FunctionPtr callAsFunction);
    @Bridge(symbol="JSObjectMakeConstructor", optional=true)
    public static native JSObjectRef makeConstructor(JSContextRef ctx, JSClassRef jsClass, FunctionPtr callAsConstructor);
    @Bridge(symbol="JSObjectMakeArray", optional=true)
    public static native JSObjectRef makeArray(JSContextRef ctx, @MachineSizedUInt long argumentCount, JSValueRef.JSValueRefPtr arguments, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSObjectMakeDate", optional=true)
    public static native JSObjectRef makeDate(JSContextRef ctx, @MachineSizedUInt long argumentCount, JSValueRef.JSValueRefPtr arguments, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSObjectMakeError", optional=true)
    public static native JSObjectRef makeError(JSContextRef ctx, @MachineSizedUInt long argumentCount, JSValueRef.JSValueRefPtr arguments, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSObjectMakeRegExp", optional=true)
    public static native JSObjectRef makeRegExp(JSContextRef ctx, @MachineSizedUInt long argumentCount, JSValueRef.JSValueRefPtr arguments, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="JSObjectMakeDeferredPromise", optional=true)
    public static native JSObjectRef makeDeferredPromise(JSContextRef ctx, JSObjectRef.JSObjectRefPtr resolve, JSObjectRef.JSObjectRefPtr reject, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSObjectMakeFunction", optional=true)
    public static native JSObjectRef makeFunction(JSContextRef ctx, JSStringRef name, int parameterCount, JSStringRef.JSStringRefPtr parameterNames, JSStringRef body, JSStringRef sourceURL, int startingLineNumber, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSObjectGetPrototype", optional=true)
    public static native JSValueRef getPrototype(JSContextRef ctx, JSObjectRef object);
    @Bridge(symbol="JSObjectSetPrototype", optional=true)
    public static native void setPrototype(JSContextRef ctx, JSObjectRef object, JSValueRef value);
    @Bridge(symbol="JSObjectHasProperty", optional=true)
    public static native boolean hasProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName);
    @Bridge(symbol="JSObjectGetProperty", optional=true)
    public static native JSValueRef getProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSObjectSetProperty", optional=true)
    public static native void setProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName, JSValueRef value, JSPropertyAttributes attributes, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSObjectDeleteProperty", optional=true)
    public static native boolean deleteProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="JSObjectHasPropertyForKey", optional=true)
    public static native boolean hasPropertyForKey(JSContextRef ctx, JSObjectRef object, JSValueRef propertyKey, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="JSObjectGetPropertyForKey", optional=true)
    public static native JSValueRef getPropertyForKey(JSContextRef ctx, JSObjectRef object, JSValueRef propertyKey, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="JSObjectSetPropertyForKey", optional=true)
    public static native void setPropertyForKey(JSContextRef ctx, JSObjectRef object, JSValueRef propertyKey, JSValueRef value, JSPropertyAttributes attributes, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="JSObjectDeletePropertyForKey", optional=true)
    public static native boolean deletePropertyForKey(JSContextRef ctx, JSObjectRef object, JSValueRef propertyKey, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSObjectGetPropertyAtIndex", optional=true)
    public static native JSValueRef getPropertyAtIndex(JSContextRef ctx, JSObjectRef object, int propertyIndex, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSObjectSetPropertyAtIndex", optional=true)
    public static native void setPropertyAtIndex(JSContextRef ctx, JSObjectRef object, int propertyIndex, JSValueRef value, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSObjectGetPrivate", optional=true)
    public native VoidPtr getPrivate();
    @Bridge(symbol="JSObjectSetPrivate", optional=true)
    public native boolean setPrivate(VoidPtr data);
    @Bridge(symbol="JSObjectIsFunction", optional=true)
    public static native boolean isFunction(JSContextRef ctx, JSObjectRef object);
    @Bridge(symbol="JSObjectCallAsFunction", optional=true)
    public static native JSValueRef callAsFunction(JSContextRef ctx, JSObjectRef object, JSObjectRef thisObject, @MachineSizedUInt long argumentCount, JSValueRef.JSValueRefPtr arguments, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSObjectIsConstructor", optional=true)
    public static native boolean isConstructor(JSContextRef ctx, JSObjectRef object);
    @Bridge(symbol="JSObjectCallAsConstructor", optional=true)
    public static native JSObjectRef callAsConstructor(JSContextRef ctx, JSObjectRef object, @MachineSizedUInt long argumentCount, JSValueRef.JSValueRefPtr arguments, JSValueRef.JSValueRefPtr exception);
    @Bridge(symbol="JSObjectCopyPropertyNames", optional=true)
    public static native JSPropertyNameArrayRef copyPropertyNames(JSContextRef ctx, JSObjectRef object);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSObjectMakeTypedArray", optional=true)
    public static native JSObjectRef makeTypedArray(JSContextRef ctx, JSTypedArrayType arrayType, @MachineSizedUInt long length, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSObjectMakeTypedArrayWithBytesNoCopy", optional=true)
    public static native JSObjectRef makeTypedArrayWithBytesNoCopy(JSContextRef ctx, JSTypedArrayType arrayType, VoidPtr bytes, @MachineSizedUInt long byteLength, FunctionPtr bytesDeallocator, VoidPtr deallocatorContext, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSObjectMakeTypedArrayWithArrayBuffer", optional=true)
    public static native JSObjectRef makeTypedArrayWithArrayBuffer(JSContextRef ctx, JSTypedArrayType arrayType, JSObjectRef buffer, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSObjectMakeTypedArrayWithArrayBufferAndOffset", optional=true)
    public static native JSObjectRef makeTypedArrayWithArrayBufferAndOffset(JSContextRef ctx, JSTypedArrayType arrayType, JSObjectRef buffer, @MachineSizedUInt long byteOffset, @MachineSizedUInt long length, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSObjectGetTypedArrayBytesPtr", optional=true)
    public static native VoidPtr getTypedArrayBytesPtr(JSContextRef ctx, JSObjectRef object, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSObjectGetTypedArrayLength", optional=true)
    public static native @MachineSizedUInt long getTypedArrayLength(JSContextRef ctx, JSObjectRef object, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSObjectGetTypedArrayByteLength", optional=true)
    public static native @MachineSizedUInt long getTypedArrayByteLength(JSContextRef ctx, JSObjectRef object, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSObjectGetTypedArrayByteOffset", optional=true)
    public static native @MachineSizedUInt long getTypedArrayByteOffset(JSContextRef ctx, JSObjectRef object, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSObjectGetTypedArrayBuffer", optional=true)
    public static native JSObjectRef getTypedArrayBuffer(JSContextRef ctx, JSObjectRef object, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSObjectMakeArrayBufferWithBytesNoCopy", optional=true)
    public static native JSObjectRef makeArrayBufferWithBytesNoCopy(JSContextRef ctx, VoidPtr bytes, @MachineSizedUInt long byteLength, FunctionPtr bytesDeallocator, VoidPtr deallocatorContext, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSObjectGetArrayBufferBytesPtr", optional=true)
    public static native VoidPtr getArrayBufferBytesPtr(JSContextRef ctx, JSObjectRef object, JSValueRef.JSValueRefPtr exception);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="JSObjectGetArrayBufferByteLength", optional=true)
    public static native @MachineSizedUInt long getArrayBufferByteLength(JSContextRef ctx, JSObjectRef object, JSValueRef.JSValueRefPtr exception);
    /*</methods>*/
}
