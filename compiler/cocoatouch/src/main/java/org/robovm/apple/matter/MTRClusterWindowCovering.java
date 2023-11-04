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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterWindowCovering/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterWindowCoveringPtr extends Ptr<MTRClusterWindowCovering, MTRClusterWindowCoveringPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterWindowCovering.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterWindowCovering() {}
    protected MTRClusterWindowCovering(Handle h, long handle) { super(h, handle); }
    protected MTRClusterWindowCovering(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterWindowCovering(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRDevice device, NSNumber endpointID, DispatchQueue queue);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "upOrOpenWithParams:expectedValues:expectedValueInterval:completion:")
    public native void upOrOpen(MTRWindowCoveringClusterUpOrOpenParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "upOrOpenWithExpectedValues:expectedValueInterval:completion:")
    public native void upOrOpen(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "downOrCloseWithParams:expectedValues:expectedValueInterval:completion:")
    public native void downOrClose(MTRWindowCoveringClusterDownOrCloseParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "downOrCloseWithExpectedValues:expectedValueInterval:completion:")
    public native void downOrClose(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stopMotionWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stopMotion(MTRWindowCoveringClusterStopMotionParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stopMotionWithExpectedValues:expectedValueInterval:completion:")
    public native void stopMotion(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "goToLiftValueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void goToLiftValue(MTRWindowCoveringClusterGoToLiftValueParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "goToLiftPercentageWithParams:expectedValues:expectedValueInterval:completion:")
    public native void goToLiftPercentage(MTRWindowCoveringClusterGoToLiftPercentageParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "goToTiltValueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void goToTiltValue(MTRWindowCoveringClusterGoToTiltValueParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "goToTiltPercentageWithParams:expectedValues:expectedValueInterval:completion:")
    public native void goToTiltPercentage(MTRWindowCoveringClusterGoToTiltPercentageParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTypeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeType(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePhysicalClosedLimitLiftWithParams:")
    public native NSDictionary<NSString, ?> readAttributePhysicalClosedLimitLift(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePhysicalClosedLimitTiltWithParams:")
    public native NSDictionary<NSString, ?> readAttributePhysicalClosedLimitTilt(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentPositionLiftWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentPositionLift(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentPositionTiltWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentPositionTilt(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNumberOfActuationsLiftWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfActuationsLift(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNumberOfActuationsTiltWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfActuationsTilt(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeConfigStatusWithParams:")
    public native NSDictionary<NSString, ?> readAttributeConfigStatus(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentPositionLiftPercentageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentPositionLiftPercentage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentPositionTiltPercentageWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentPositionTiltPercentage(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOperationalStatusWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOperationalStatus(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTargetPositionLiftPercent100thsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTargetPositionLiftPercent100ths(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeTargetPositionTiltPercent100thsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTargetPositionTiltPercent100ths(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeEndProductTypeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEndProductType(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentPositionLiftPercent100thsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentPositionLiftPercent100ths(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentPositionTiltPercent100thsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentPositionTiltPercent100ths(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeInstalledOpenLimitLiftWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInstalledOpenLimitLift(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeInstalledClosedLimitLiftWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInstalledClosedLimitLift(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeInstalledOpenLimitTiltWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInstalledOpenLimitTilt(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeInstalledClosedLimitTiltWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInstalledClosedLimitTilt(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeModeWithValue:expectedValueInterval:")
    public native void writeAttributeMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSafetyStatusWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSafetyStatus(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGeneratedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcceptedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAttributeListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAttributeList(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFeatureMap(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeClusterRevision(MTRReadParams params);
    /*</methods>*/
}
