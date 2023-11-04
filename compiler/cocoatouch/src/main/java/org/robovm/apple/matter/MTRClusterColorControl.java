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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterColorControl/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterColorControlPtr extends Ptr<MTRClusterColorControl, MTRClusterColorControlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterColorControl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterColorControl() {}
    protected MTRClusterColorControl(Handle h, long handle) { super(h, handle); }
    protected MTRClusterColorControl(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterColorControl(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "moveToHueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToHue(MTRColorControlClusterMoveToHueParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveHueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveHue(MTRColorControlClusterMoveHueParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stepHueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stepHue(MTRColorControlClusterStepHueParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveToSaturationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToSaturation(MTRColorControlClusterMoveToSaturationParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveSaturationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveSaturation(MTRColorControlClusterMoveSaturationParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stepSaturationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stepSaturation(MTRColorControlClusterStepSaturationParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveToHueAndSaturationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToHueAndSaturation(MTRColorControlClusterMoveToHueAndSaturationParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveToColorWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToColor(MTRColorControlClusterMoveToColorParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveColorWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveColor(MTRColorControlClusterMoveColorParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stepColorWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stepColor(MTRColorControlClusterStepColorParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveToColorTemperatureWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToColorTemperature(MTRColorControlClusterMoveToColorTemperatureParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "enhancedMoveToHueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enhancedMoveToHue(MTRColorControlClusterEnhancedMoveToHueParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "enhancedMoveHueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enhancedMoveHue(MTRColorControlClusterEnhancedMoveHueParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "enhancedStepHueWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enhancedStepHue(MTRColorControlClusterEnhancedStepHueParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "enhancedMoveToHueAndSaturationWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enhancedMoveToHueAndSaturation(MTRColorControlClusterEnhancedMoveToHueAndSaturationParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "colorLoopSetWithParams:expectedValues:expectedValueInterval:completion:")
    public native void colorLoopSet(MTRColorControlClusterColorLoopSetParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stopMoveStepWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stopMoveStep(MTRColorControlClusterStopMoveStepParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveColorTemperatureWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveColorTemperature(MTRColorControlClusterMoveColorTemperatureParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stepColorTemperatureWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stepColorTemperature(MTRColorControlClusterStepColorTemperatureParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentHueWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentHue(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentSaturationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentSaturation(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRemainingTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRemainingTime(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentXWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentX(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentYWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentY(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDriftCompensationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDriftCompensation(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCompensationTextWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCompensationText(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorTemperatureMiredsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorTemperatureMireds(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorMode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOptionsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOptions(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOptionsWithValue:expectedValueInterval:")
    public native void writeAttributeOptions(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOptionsWithValue:expectedValueInterval:params:")
    public native void writeAttributeOptions(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeNumberOfPrimariesWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNumberOfPrimaries(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary1XWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary1X(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary1YWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary1Y(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary1IntensityWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary1Intensity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary2XWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary2X(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary2YWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary2Y(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary2IntensityWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary2Intensity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary3XWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary3X(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary3YWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary3Y(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary3IntensityWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary3Intensity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary4XWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary4X(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary4YWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary4Y(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary4IntensityWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary4Intensity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary5XWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary5X(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary5YWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary5Y(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary5IntensityWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary5Intensity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary6XWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary6X(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary6YWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary6Y(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePrimary6IntensityWithParams:")
    public native NSDictionary<NSString, ?> readAttributePrimary6Intensity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWhitePointXWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWhitePointX(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeWhitePointXWithValue:expectedValueInterval:")
    public native void writeAttributeWhitePointX(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeWhitePointXWithValue:expectedValueInterval:params:")
    public native void writeAttributeWhitePointX(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWhitePointYWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWhitePointY(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeWhitePointYWithValue:expectedValueInterval:")
    public native void writeAttributeWhitePointY(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeWhitePointYWithValue:expectedValueInterval:params:")
    public native void writeAttributeWhitePointY(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorPointRXWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorPointRX(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointRXWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointRX(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointRXWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointRX(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorPointRYWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorPointRY(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointRYWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointRY(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointRYWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointRY(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorPointRIntensityWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorPointRIntensity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointRIntensityWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointRIntensity(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointRIntensityWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointRIntensity(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorPointGXWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorPointGX(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointGXWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointGX(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointGXWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointGX(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorPointGYWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorPointGY(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointGYWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointGY(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointGYWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointGY(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorPointGIntensityWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorPointGIntensity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointGIntensityWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointGIntensity(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointGIntensityWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointGIntensity(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorPointBXWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorPointBX(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointBXWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointBX(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointBXWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointBX(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorPointBYWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorPointBY(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointBYWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointBY(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointBYWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointBY(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorPointBIntensityWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorPointBIntensity(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointBIntensityWithValue:expectedValueInterval:")
    public native void writeAttributeColorPointBIntensity(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeColorPointBIntensityWithValue:expectedValueInterval:params:")
    public native void writeAttributeColorPointBIntensity(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeEnhancedCurrentHueWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEnhancedCurrentHue(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeEnhancedColorModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEnhancedColorMode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorLoopActiveWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorLoopActive(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorLoopDirectionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorLoopDirection(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorLoopTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorLoopTime(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorLoopStartEnhancedHueWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorLoopStartEnhancedHue(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorLoopStoredEnhancedHueWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorLoopStoredEnhancedHue(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorCapabilitiesWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorCapabilities(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorTempPhysicalMinMiredsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorTempPhysicalMinMireds(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeColorTempPhysicalMaxMiredsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeColorTempPhysicalMaxMireds(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCoupleColorTempToLevelMinMiredsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCoupleColorTempToLevelMinMireds(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeStartUpColorTemperatureMiredsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeStartUpColorTemperatureMireds(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeStartUpColorTemperatureMiredsWithValue:expectedValueInterval:")
    public native void writeAttributeStartUpColorTemperatureMireds(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeStartUpColorTemperatureMiredsWithValue:expectedValueInterval:params:")
    public native void writeAttributeStartUpColorTemperatureMireds(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
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
