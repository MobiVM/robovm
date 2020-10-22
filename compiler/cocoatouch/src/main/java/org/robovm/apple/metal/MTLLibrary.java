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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeProtocolProxy/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/MTLLibrary/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class MTLLibraryPtr extends Ptr<MTLLibrary, MTLLibraryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLLibrary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "device")
    public native MTLDevice getDevice();
    @Property(selector = "functionNames")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getFunctionNames();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "type")
    public native MTLLibraryType getType();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "installName")
    public native String getInstallName();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "newFunctionWithName:")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSObject.NoRetainMarshaler.class) MTLFunction newFunction(String functionName);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public MTLFunction newFunction(String name, MTLFunctionConstantValues constantValues) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLFunction result = newFunction(name, constantValues, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newFunctionWithName:constantValues:error:")
    private native MTLFunction newFunction(String name, MTLFunctionConstantValues constantValues, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newFunctionWithName:constantValues:completionHandler:")
    public native void newFunction(String name, MTLFunctionConstantValues constantValues, @Block VoidBlock2<MTLFunction, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "newFunctionWithDescriptor:completionHandler:")
    public native void newFunction(MTLFunctionDescriptor descriptor, @Block VoidBlock2<MTLFunction, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "newFunctionWithDescriptor:error:")
    public native MTLFunction newFunction(MTLFunctionDescriptor descriptor, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "newIntersectionFunctionWithDescriptor:completionHandler:")
    public native void newIntersectionFunction(MTLIntersectionFunctionDescriptor descriptor, @Block VoidBlock2<MTLFunction, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "newIntersectionFunctionWithDescriptor:error:")
    public native MTLFunction newIntersectionFunction(MTLIntersectionFunctionDescriptor descriptor, NSError.NSErrorPtr error);
    /*</methods>*/
}
