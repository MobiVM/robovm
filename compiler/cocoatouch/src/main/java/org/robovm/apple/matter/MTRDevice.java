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

/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDevice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDevicePtr extends Ptr<MTRDevice, MTRDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRDevice() {}
    protected MTRDevice(Handle h, long handle) { super(h, handle); }
    protected MTRDevice(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    public MTRDevice(NSNumber nodeID, MTRDeviceController controller) { super((Handle) null, create(nodeID, controller)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "state")
    public native MTRDeviceState getState();
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Property(selector = "estimatedStartTime")
    public native NSDate getEstimatedStartTime();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDelegate:queue:")
    public native void setDelegate(MTRDeviceDelegate delegate, DispatchQueue queue);
    @Method(selector = "readAttributeWithEndpointID:clusterID:attributeID:params:")
    public native NSDictionary<NSString, ?> readAttribute(NSNumber endpointID, NSNumber clusterID, NSNumber attributeID, MTRReadParams params);
    @Method(selector = "writeAttributeWithEndpointID:clusterID:attributeID:value:expectedValueInterval:timedWriteTimeout:")
    public native void writeAttribute(NSNumber endpointID, NSNumber clusterID, NSNumber attributeID, NSObject value, NSNumber expectedValueInterval, NSNumber timeout);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "invokeCommandWithEndpointID:clusterID:commandID:commandFields:expectedValues:expectedValueInterval:timedInvokeTimeout:queue:completion:")
    public native void invokeCommand(NSNumber endpointID, NSNumber clusterID, NSNumber commandID, NSObject commandFields, NSArray<?> expectedValues, NSNumber expectedValueInterval, NSNumber timeout, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.2 and later.
     */
    @Method(selector = "openCommissioningWindowWithSetupPasscode:discriminator:duration:queue:completion:")
    public native void openCommissioningWindow(NSNumber setupPasscode, NSNumber discriminator, NSNumber duration, DispatchQueue queue, @Block VoidBlock2<MTRSetupPayload, NSError> completion);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "openCommissioningWindowWithDiscriminator:duration:queue:completion:")
    public native void openCommissioningWindow(NSNumber discriminator, NSNumber duration, DispatchQueue queue, @Block VoidBlock2<MTRSetupPayload, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "deviceWithNodeID:controller:")
    protected static native @Pointer long create(NSNumber nodeID, MTRDeviceController controller);
    /*</methods>*/
}
