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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterColorControl/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterColorControlPtr extends Ptr<MTRBaseClusterColorControl, MTRBaseClusterColorControlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterColorControl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterColorControl() {}
    protected MTRBaseClusterColorControl(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterColorControl(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterColorControl(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveToHueWithParams:completion:")
    public native void moveToHue(MTRColorControlClusterMoveToHueParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveHueWithParams:completion:")
    public native void moveHue(MTRColorControlClusterMoveHueParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stepHueWithParams:completion:")
    public native void stepHue(MTRColorControlClusterStepHueParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveToSaturationWithParams:completion:")
    public native void moveToSaturation(MTRColorControlClusterMoveToSaturationParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveSaturationWithParams:completion:")
    public native void moveSaturation(MTRColorControlClusterMoveSaturationParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stepSaturationWithParams:completion:")
    public native void stepSaturation(MTRColorControlClusterStepSaturationParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveToHueAndSaturationWithParams:completion:")
    public native void moveToHueAndSaturation(MTRColorControlClusterMoveToHueAndSaturationParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveToColorWithParams:completion:")
    public native void moveToColor(MTRColorControlClusterMoveToColorParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveColorWithParams:completion:")
    public native void moveColor(MTRColorControlClusterMoveColorParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stepColorWithParams:completion:")
    public native void stepColor(MTRColorControlClusterStepColorParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveToColorTemperatureWithParams:completion:")
    public native void moveToColorTemperature(MTRColorControlClusterMoveToColorTemperatureParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "enhancedMoveToHueWithParams:completion:")
    public native void enhancedMoveToHue(MTRColorControlClusterEnhancedMoveToHueParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "enhancedMoveHueWithParams:completion:")
    public native void enhancedMoveHue(MTRColorControlClusterEnhancedMoveHueParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "enhancedStepHueWithParams:completion:")
    public native void enhancedStepHue(MTRColorControlClusterEnhancedStepHueParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "enhancedMoveToHueAndSaturationWithParams:completion:")
    public native void enhancedMoveToHueAndSaturation(MTRColorControlClusterEnhancedMoveToHueAndSaturationParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "colorLoopSetWithParams:completion:")
    public native void colorLoopSet(MTRColorControlClusterColorLoopSetParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stopMoveStepWithParams:completion:")
    public native void stopMoveStep(MTRColorControlClusterStopMoveStepParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveColorTemperatureWithParams:completion:")
    public native void moveColorTemperature(MTRColorControlClusterMoveColorTemperatureParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stepColorTemperatureWithParams:completion:")
    public native void stepColorTemperature(MTRColorControlClusterStepColorTemperatureParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentHueWithCompletion:")
    public native void readAttributeCurrentHue(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCurrentHueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentHue(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentSaturationWithCompletion:")
    public native void readAttributeCurrentSaturation(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCurrentSaturationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentSaturation(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRemainingTimeWithCompletion:")
    public native void readAttributeRemainingTime(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRemainingTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRemainingTime(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentXWithCompletion:")
    public native void readAttributeCurrentX(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCurrentXWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentX(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentYWithCompletion:")
    public native void readAttributeCurrentY(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCurrentYWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentY(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDriftCompensationWithCompletion:")
    public native void readAttributeDriftCompensation(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeDriftCompensationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDriftCompensation(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCompensationTextWithCompletion:")
    public native void readAttributeCompensationText(@Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCompensationTextWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCompensationText(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSString, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorTemperatureMiredsWithCompletion:")
    public native void readAttributeColorTemperatureMireds(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorTemperatureMiredsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorTemperatureMireds(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorModeWithCompletion:")
    public native void readAttributeColorMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOptionsWithCompletion:")
    public native void readAttributeOptions(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOptionsWithValue:completion:")
    public native void writeAttributeOptions(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOptionsWithValue:params:completion:")
    public native void writeAttributeOptions(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOptionsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOptions(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfPrimariesWithCompletion:")
    public native void readAttributeNumberOfPrimaries(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNumberOfPrimariesWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfPrimaries(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary1XWithCompletion:")
    public native void readAttributePrimary1X(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary1XWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary1X(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary1YWithCompletion:")
    public native void readAttributePrimary1Y(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary1YWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary1Y(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary1IntensityWithCompletion:")
    public native void readAttributePrimary1Intensity(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary1IntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary1Intensity(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary2XWithCompletion:")
    public native void readAttributePrimary2X(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary2XWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary2X(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary2YWithCompletion:")
    public native void readAttributePrimary2Y(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary2YWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary2Y(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary2IntensityWithCompletion:")
    public native void readAttributePrimary2Intensity(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary2IntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary2Intensity(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary3XWithCompletion:")
    public native void readAttributePrimary3X(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary3XWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary3X(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary3YWithCompletion:")
    public native void readAttributePrimary3Y(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary3YWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary3Y(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary3IntensityWithCompletion:")
    public native void readAttributePrimary3Intensity(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary3IntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary3Intensity(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary4XWithCompletion:")
    public native void readAttributePrimary4X(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary4XWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary4X(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary4YWithCompletion:")
    public native void readAttributePrimary4Y(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary4YWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary4Y(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary4IntensityWithCompletion:")
    public native void readAttributePrimary4Intensity(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary4IntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary4Intensity(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary5XWithCompletion:")
    public native void readAttributePrimary5X(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary5XWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary5X(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary5YWithCompletion:")
    public native void readAttributePrimary5Y(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary5YWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary5Y(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary5IntensityWithCompletion:")
    public native void readAttributePrimary5Intensity(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary5IntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary5Intensity(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary6XWithCompletion:")
    public native void readAttributePrimary6X(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary6XWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary6X(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary6YWithCompletion:")
    public native void readAttributePrimary6Y(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary6YWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary6Y(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary6IntensityWithCompletion:")
    public native void readAttributePrimary6Intensity(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributePrimary6IntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePrimary6Intensity(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWhitePointXWithCompletion:")
    public native void readAttributeWhitePointX(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeWhitePointXWithValue:completion:")
    public native void writeAttributeWhitePointX(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeWhitePointXWithValue:params:completion:")
    public native void writeAttributeWhitePointX(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeWhitePointXWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWhitePointX(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWhitePointYWithCompletion:")
    public native void readAttributeWhitePointY(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeWhitePointYWithValue:completion:")
    public native void writeAttributeWhitePointY(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeWhitePointYWithValue:params:completion:")
    public native void writeAttributeWhitePointY(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeWhitePointYWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWhitePointY(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointRXWithCompletion:")
    public native void readAttributeColorPointRX(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointRXWithValue:completion:")
    public native void writeAttributeColorPointRX(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointRXWithValue:params:completion:")
    public native void writeAttributeColorPointRX(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorPointRXWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointRX(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointRYWithCompletion:")
    public native void readAttributeColorPointRY(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointRYWithValue:completion:")
    public native void writeAttributeColorPointRY(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointRYWithValue:params:completion:")
    public native void writeAttributeColorPointRY(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorPointRYWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointRY(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointRIntensityWithCompletion:")
    public native void readAttributeColorPointRIntensity(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointRIntensityWithValue:completion:")
    public native void writeAttributeColorPointRIntensity(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointRIntensityWithValue:params:completion:")
    public native void writeAttributeColorPointRIntensity(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorPointRIntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointRIntensity(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointGXWithCompletion:")
    public native void readAttributeColorPointGX(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointGXWithValue:completion:")
    public native void writeAttributeColorPointGX(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointGXWithValue:params:completion:")
    public native void writeAttributeColorPointGX(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorPointGXWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointGX(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointGYWithCompletion:")
    public native void readAttributeColorPointGY(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointGYWithValue:completion:")
    public native void writeAttributeColorPointGY(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointGYWithValue:params:completion:")
    public native void writeAttributeColorPointGY(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorPointGYWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointGY(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointGIntensityWithCompletion:")
    public native void readAttributeColorPointGIntensity(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointGIntensityWithValue:completion:")
    public native void writeAttributeColorPointGIntensity(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointGIntensityWithValue:params:completion:")
    public native void writeAttributeColorPointGIntensity(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorPointGIntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointGIntensity(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointBXWithCompletion:")
    public native void readAttributeColorPointBX(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointBXWithValue:completion:")
    public native void writeAttributeColorPointBX(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointBXWithValue:params:completion:")
    public native void writeAttributeColorPointBX(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorPointBXWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointBX(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointBYWithCompletion:")
    public native void readAttributeColorPointBY(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointBYWithValue:completion:")
    public native void writeAttributeColorPointBY(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointBYWithValue:params:completion:")
    public native void writeAttributeColorPointBY(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorPointBYWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointBY(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointBIntensityWithCompletion:")
    public native void readAttributeColorPointBIntensity(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointBIntensityWithValue:completion:")
    public native void writeAttributeColorPointBIntensity(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeColorPointBIntensityWithValue:params:completion:")
    public native void writeAttributeColorPointBIntensity(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorPointBIntensityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorPointBIntensity(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnhancedCurrentHueWithCompletion:")
    public native void readAttributeEnhancedCurrentHue(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEnhancedCurrentHueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnhancedCurrentHue(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnhancedColorModeWithCompletion:")
    public native void readAttributeEnhancedColorMode(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEnhancedColorModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnhancedColorMode(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorLoopActiveWithCompletion:")
    public native void readAttributeColorLoopActive(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorLoopActiveWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopActive(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorLoopDirectionWithCompletion:")
    public native void readAttributeColorLoopDirection(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorLoopDirectionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopDirection(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorLoopTimeWithCompletion:")
    public native void readAttributeColorLoopTime(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorLoopTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopTime(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorLoopStartEnhancedHueWithCompletion:")
    public native void readAttributeColorLoopStartEnhancedHue(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorLoopStartEnhancedHueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopStartEnhancedHue(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorLoopStoredEnhancedHueWithCompletion:")
    public native void readAttributeColorLoopStoredEnhancedHue(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorLoopStoredEnhancedHueWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorLoopStoredEnhancedHue(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorCapabilitiesWithCompletion:")
    public native void readAttributeColorCapabilities(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorCapabilitiesWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorCapabilities(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorTempPhysicalMinMiredsWithCompletion:")
    public native void readAttributeColorTempPhysicalMinMireds(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorTempPhysicalMinMiredsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorTempPhysicalMinMireds(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorTempPhysicalMaxMiredsWithCompletion:")
    public native void readAttributeColorTempPhysicalMaxMireds(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeColorTempPhysicalMaxMiredsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeColorTempPhysicalMaxMireds(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCoupleColorTempToLevelMinMiredsWithCompletion:")
    public native void readAttributeCoupleColorTempToLevelMinMireds(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCoupleColorTempToLevelMinMiredsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCoupleColorTempToLevelMinMireds(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeStartUpColorTemperatureMiredsWithCompletion:")
    public native void readAttributeStartUpColorTemperatureMireds(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeStartUpColorTemperatureMiredsWithValue:completion:")
    public native void writeAttributeStartUpColorTemperatureMireds(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeStartUpColorTemperatureMiredsWithValue:params:completion:")
    public native void writeAttributeStartUpColorTemperatureMireds(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeStartUpColorTemperatureMiredsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStartUpColorTemperatureMireds(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithCompletion:")
    public native void readAttributeGeneratedCommandList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeGeneratedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeGeneratedCommandList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithCompletion:")
    public native void readAttributeAcceptedCommandList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeAcceptedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcceptedCommandList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithCompletion:")
    public native void readAttributeAttributeList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeAttributeListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAttributeList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithCompletion:")
    public native void readAttributeFeatureMap(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeFeatureMapWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFeatureMap(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithCompletion:")
    public native void readAttributeClusterRevision(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeClusterRevisionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeClusterRevision(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentHueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentHue(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentSaturationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentSaturation(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRemainingTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRemainingTime(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentXWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentX(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCurrentYWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentY(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeDriftCompensationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDriftCompensation(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCompensationTextWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCompensationText(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorTemperatureMiredsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorTemperatureMireds(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOptionsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOptions(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNumberOfPrimariesWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfPrimaries(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary1XWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary1X(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary1YWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary1Y(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary1IntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary1Intensity(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary2XWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary2X(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary2YWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary2Y(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary2IntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary2Intensity(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary3XWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary3X(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary3YWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary3Y(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary3IntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary3Intensity(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary4XWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary4X(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary4YWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary4Y(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary4IntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary4Intensity(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary5XWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary5X(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary5YWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary5Y(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary5IntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary5Intensity(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary6XWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary6X(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary6YWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary6Y(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributePrimary6IntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePrimary6Intensity(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWhitePointXWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeWhitePointX(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWhitePointYWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeWhitePointY(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointRXWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointRX(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointRYWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointRY(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointRIntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointRIntensity(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointGXWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointGX(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointGYWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointGY(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointGIntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointGIntensity(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointBXWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointBX(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointBYWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointBY(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorPointBIntensityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorPointBIntensity(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnhancedCurrentHueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnhancedCurrentHue(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnhancedColorModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnhancedColorMode(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorLoopActiveWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorLoopActive(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorLoopDirectionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorLoopDirection(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorLoopTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorLoopTime(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorLoopStartEnhancedHueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorLoopStartEnhancedHue(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorLoopStoredEnhancedHueWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorLoopStoredEnhancedHue(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorCapabilitiesWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorCapabilities(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorTempPhysicalMinMiredsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorTempPhysicalMinMireds(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeColorTempPhysicalMaxMiredsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeColorTempPhysicalMaxMireds(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCoupleColorTempToLevelMinMiredsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCoupleColorTempToLevelMinMireds(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeStartUpColorTemperatureMiredsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeStartUpColorTemperatureMireds(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeGeneratedCommandList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcceptedCommandList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAttributeList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFeatureMap(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeClusterRevision(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /*</methods>*/
}
