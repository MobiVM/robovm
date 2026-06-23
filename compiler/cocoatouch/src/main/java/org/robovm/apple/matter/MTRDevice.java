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
 * @since Available in iOS 16.1 and later.
 */
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
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "deviceCachePrimed")
    public native boolean isDeviceCachePrimed();
    /**
     * @since Available in iOS 16.5 and later.
     */
    @Property(selector = "estimatedStartTime")
    public native NSDate getEstimatedStartTime();
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Property(selector = "deviceController")
    public native MTRDeviceController getDeviceController();
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Property(selector = "nodeID")
    public native NSNumber getNodeID();
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Property(selector = "estimatedSubscriptionLatency")
    public native NSNumber getEstimatedSubscriptionLatency();
    /**
     * @since Available in iOS 18.3 and later.
     */
    @Property(selector = "vendorID")
    public native NSNumber getVendorID();
    /**
     * @since Available in iOS 18.3 and later.
     */
    @Property(selector = "productID")
    public native NSNumber getProductID();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "networkCommissioningFeatures")
    public native MTRNetworkCommissioningFeature getNetworkCommissioningFeatures();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 18.0. Please use addDelegate:queue:interestedPaths:
     */
    @Deprecated
    @Method(selector = "setDelegate:queue:")
    public native void setDelegate(MTRDeviceDelegate delegate, DispatchQueue queue);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "addDelegate:queue:")
    public native void addDelegate(MTRDeviceDelegate delegate, DispatchQueue queue);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "addDelegate:queue:interestedPathsForAttributes:interestedPathsForEvents:")
    public native void addDelegate(MTRDeviceDelegate delegate, DispatchQueue queue, NSArray<?> interestedPathsForAttributes, NSArray<?> interestedPathsForEvents);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "removeDelegate:")
    public native void removeDelegate(MTRDeviceDelegate delegate);
    @Method(selector = "readAttributeWithEndpointID:clusterID:attributeID:params:")
    public native NSDictionary<NSString, ?> readAttribute(NSNumber endpointID, NSNumber clusterID, NSNumber attributeID, MTRReadParams params);
    @Method(selector = "writeAttributeWithEndpointID:clusterID:attributeID:value:expectedValueInterval:timedWriteTimeout:")
    public native void writeAttribute(NSNumber endpointID, NSNumber clusterID, NSNumber attributeID, NSObject value, NSNumber expectedValueInterval, NSNumber timeout);
    /**
     * @since Available in iOS 18.2 and later.
     */
    @Method(selector = "readAttributePaths:")
    public native NSArray<?> readAttributePaths(NSArray<MTRAttributeRequestPath> attributePaths);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "descriptorClusters")
    public native NSDictionary<?, ?> descriptorClusters();
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Method(selector = "invokeCommandWithEndpointID:clusterID:commandID:commandFields:expectedValues:expectedValueInterval:queue:completion:")
    public native void invokeCommand(NSNumber endpointID, NSNumber clusterID, NSNumber commandID, NSDictionary<NSString, ?> commandFields, NSArray<?> expectedValues, NSNumber expectedValueInterval, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "invokeCommandWithEndpointID:clusterID:commandID:commandFields:expectedValues:expectedValueInterval:timedInvokeTimeout:queue:completion:")
    public native void invokeCommand(NSNumber endpointID, NSNumber clusterID, NSNumber commandID, NSObject commandFields, NSArray<?> expectedValues, NSNumber expectedValueInterval, NSNumber timeout, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "invokeCommands:queue:completion:")
    public native void invokeCommands(NSArray<?> commands, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
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
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "downloadLogOfType:timeout:queue:completion:")
    public native void downloadLogOfType(MTRDiagnosticLogType type, double timeout, DispatchQueue queue, @Block VoidBlock2<NSURL, NSError> completion);
    /**
     * @since Available in iOS 18.3 and later.
     */
    @Method(selector = "waitForAttributeValues:timeout:queue:completion:")
    public native MTRAttributeValueWaiter waitForAttributeValues(NSDictionary<?, ?> values, double timeout, DispatchQueue queue, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "deviceWithNodeID:controller:")
    protected static native @Pointer long create(NSNumber nodeID, MTRDeviceController controller);
    /*</methods>*/
}
