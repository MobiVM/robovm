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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRXPCDeviceControllerParameters/*</name>*/ 
    extends /*<extends>*/MTRDeviceControllerAbstractParameters/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRXPCDeviceControllerParametersPtr extends Ptr<MTRXPCDeviceControllerParameters, MTRXPCDeviceControllerParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRXPCDeviceControllerParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRXPCDeviceControllerParameters() {}
    protected MTRXPCDeviceControllerParameters(Handle h, long handle) { super(h, handle); }
    protected MTRXPCDeviceControllerParameters(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithXPCConnectionBlock:uniqueIdentifier:")
    public MTRXPCDeviceControllerParameters(@Block Block0<NSXPCConnection> xpcConnectionBlock, NSUUID uniqueIdentifier) { super((SkipInit) null); initObject(init(xpcConnectionBlock, uniqueIdentifier)); }
    /**
     * @since Available in iOS 18.2 and later.
     * @deprecated Deprecated in iOS 26.0. Please use initWithXPCConnectionBlock:uniqueIdentifier:
     */
    @Deprecated
    @Method(selector = "initWithXPConnectionBlock:uniqueIdentifier:")
    public static MTRXPCDeviceControllerParameters createWithXPConnectionBlock(@Block Block0<NSXPCConnection> xpcConnectionBlock, NSUUID uniqueIdentifier) {
       MTRXPCDeviceControllerParameters res = new MTRXPCDeviceControllerParameters((SkipInit) null);
       res.initObject(res.initWithXPConnectionBlock(xpcConnectionBlock, uniqueIdentifier));
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 18.2 and later.
     */
    @Property(selector = "uniqueIdentifier")
    public native NSUUID getUniqueIdentifier();
    /**
     * @since Available in iOS 18.2 and later.
     */
    @Property(selector = "xpcConnectionBlock")
    public native @Block Block0<NSXPCConnection> getXpcConnectionBlock();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithXPCConnectionBlock:uniqueIdentifier:")
    protected native @Pointer long init(@Block Block0<NSXPCConnection> xpcConnectionBlock, NSUUID uniqueIdentifier);
    /**
     * @since Available in iOS 18.2 and later.
     * @deprecated Deprecated in iOS 26.0. Please use initWithXPCConnectionBlock:uniqueIdentifier:
     */
    @Deprecated
    @Method(selector = "initWithXPConnectionBlock:uniqueIdentifier:")
    protected native @Pointer long initWithXPConnectionBlock(@Block Block0<NSXPCConnection> xpcConnectionBlock, NSUUID uniqueIdentifier);
    /*</methods>*/
}
