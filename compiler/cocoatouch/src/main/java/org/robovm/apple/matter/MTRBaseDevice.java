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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseDevice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseDevicePtr extends Ptr<MTRBaseDevice, MTRBaseDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseDevice() {}
    protected MTRBaseDevice(Handle h, long handle) { super(h, handle); }
    protected MTRBaseDevice(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "sessionTransportType")
    public native MTRTransportType getSessionTransportType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("Matter")
    public static class Values {
        static { Bro.bind(Values.class); }

        @GlobalValue(symbol="MTRAttributePathKey", optional=true)
        public static native NSString MTRAttributePathKey();
        @GlobalValue(symbol="MTRCommandPathKey", optional=true)
        public static native NSString MTRCommandPathKey();
        @GlobalValue(symbol="MTREventPathKey", optional=true)
        public static native NSString MTREventPathKey();
        @GlobalValue(symbol="MTRDataKey", optional=true)
        public static native NSString MTRDataKey();
        @GlobalValue(symbol="MTRErrorKey", optional=true)
        public static native NSString MTRErrorKey();
        @GlobalValue(symbol="MTRTypeKey", optional=true)
        public static native NSString MTRTypeKey();
        @GlobalValue(symbol="MTRValueKey", optional=true)
        public static native NSString MTRValueKey();
        @GlobalValue(symbol="MTRContextTagKey", optional=true)
        public static native NSString MTRContextTagKey();
        @GlobalValue(symbol="MTRSignedIntegerValueType", optional=true)
        public static native NSString MTRSignedIntegerValueType();
        @GlobalValue(symbol="MTRUnsignedIntegerValueType", optional=true)
        public static native NSString MTRUnsignedIntegerValueType();
        @GlobalValue(symbol="MTRBooleanValueType", optional=true)
        public static native NSString MTRBooleanValueType();
        @GlobalValue(symbol="MTRUTF8StringValueType", optional=true)
        public static native NSString MTRUTF8StringValueType();
        @GlobalValue(symbol="MTROctetStringValueType", optional=true)
        public static native NSString MTROctetStringValueType();
        @GlobalValue(symbol="MTRFloatValueType", optional=true)
        public static native NSString MTRFloatValueType();
        @GlobalValue(symbol="MTRDoubleValueType", optional=true)
        public static native NSString MTRDoubleValueType();
        @GlobalValue(symbol="MTRNullValueType", optional=true)
        public static native NSString MTRNullValueType();
        @GlobalValue(symbol="MTRStructureValueType", optional=true)
        public static native NSString MTRStructureValueType();
        @GlobalValue(symbol="MTRArrayValueType", optional=true)
        public static native NSString MTRArrayValueType();
        /**
         * @since Available in iOS 16.5 and later.
         */
        @GlobalValue(symbol="MTREventNumberKey", optional=true)
        public static native NSString MTREventNumberKey();
        /**
         * @since Available in iOS 16.5 and later.
         */
        @GlobalValue(symbol="MTREventPriorityKey", optional=true)
        public static native NSString MTREventPriorityKey();
        /**
         * @since Available in iOS 16.5 and later.
         */
        @GlobalValue(symbol="MTREventTimeTypeKey", optional=true)
        public static native NSString MTREventTimeTypeKey();
        /**
         * @since Available in iOS 16.5 and later.
         */
        @GlobalValue(symbol="MTREventSystemUpTimeKey", optional=true)
        public static native NSString MTREventSystemUpTimeKey();
        /**
         * @since Available in iOS 16.5 and later.
         */
        @GlobalValue(symbol="MTREventTimestampDateKey", optional=true)
        public static native NSString MTREventTimestampDateKey();
    }
    
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeWithQueue:params:clusterStateCacheContainer:attributeReportHandler:eventReportHandler:errorHandler:subscriptionEstablished:resubscriptionScheduled:")
    public native void subscribe(DispatchQueue queue, MTRSubscribeParams params, MTRClusterStateCacheContainer clusterStateCacheContainer, @Block VoidBlock1<NSArray<?>> attributeReportHandler, @Block VoidBlock1<NSArray<?>> eventReportHandler, @Block VoidBlock1<NSError> errorHandler, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSError, NSNumber> resubscriptionScheduled);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributesWithEndpointID:clusterID:attributeID:params:queue:completion:")
    public native void readAttributes(NSNumber endpointID, NSNumber clusterID, NSNumber attributeID, MTRReadParams params, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "readAttributePaths:eventPaths:params:queue:completion:")
    public native void readAttributePaths(NSArray<MTRAttributeRequestPath> attributePaths, NSArray<MTREventRequestPath> eventPaths, MTRReadParams params, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeWithEndpointID:clusterID:attributeID:value:timedWriteTimeout:queue:completion:")
    public native void writeAttribute(NSNumber endpointID, NSNumber clusterID, NSNumber attributeID, NSObject value, NSNumber timeoutMs, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "invokeCommandWithEndpointID:clusterID:commandID:commandFields:timedInvokeTimeout:queue:completion:")
    public native void invokeCommand(NSNumber endpointID, NSNumber clusterID, NSNumber commandID, NSObject commandFields, NSNumber timeoutMs, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeToAttributesWithEndpointID:clusterID:attributeID:params:queue:reportHandler:subscriptionEstablished:")
    public native void subscribeToAttributes(NSNumber endpointID, NSNumber clusterID, NSNumber attributeID, MTRSubscribeParams params, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> reportHandler, @Block Runnable subscriptionEstablished);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "subscribeToAttributePaths:eventPaths:params:queue:reportHandler:subscriptionEstablished:resubscriptionScheduled:")
    public native void subscribeToAttributePaths(NSArray<MTRAttributeRequestPath> attributePaths, NSArray<MTREventRequestPath> eventPaths, MTRSubscribeParams params, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> reportHandler, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSError, NSNumber> resubscriptionScheduled);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "deregisterReportHandlersWithQueue:completion:")
    public native void deregisterReportHandlers(DispatchQueue queue, @Block Runnable completion);
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
    @Method(selector = "readEventsWithEndpointID:clusterID:eventID:params:queue:completion:")
    public native void readEvents(NSNumber endpointID, NSNumber clusterID, NSNumber eventID, MTRReadParams params, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeToEventsWithEndpointID:clusterID:eventID:params:queue:reportHandler:subscriptionEstablished:")
    public native void subscribeToEvents(NSNumber endpointID, NSNumber clusterID, NSNumber eventID, MTRSubscribeParams params, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> reportHandler, @Block Runnable subscriptionEstablished);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "deviceWithNodeID:controller:")
    public static native MTRBaseDevice createDevice(NSNumber nodeID, MTRDeviceController controller);
    /*</methods>*/
}
