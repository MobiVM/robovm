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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterLevelControl/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterLevelControlPtr extends Ptr<MTRClusterLevelControl, MTRClusterLevelControlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterLevelControl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterLevelControl() {}
    protected MTRClusterLevelControl(Handle h, long handle) { super(h, handle); }
    protected MTRClusterLevelControl(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterLevelControl(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
    @Method(selector = "moveToLevelWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToLevel(MTRLevelControlClusterMoveToLevelParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveWithParams:expectedValues:expectedValueInterval:completion:")
    public native void move(MTRLevelControlClusterMoveParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stepWithParams:expectedValues:expectedValueInterval:completion:")
    public native void step(MTRLevelControlClusterStepParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stopWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stop(MTRLevelControlClusterStopParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveToLevelWithOnOffWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToLevelWithOnOff(MTRLevelControlClusterMoveToLevelWithOnOffParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveWithOnOffWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveWithOnOff(MTRLevelControlClusterMoveWithOnOffParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stepWithOnOffWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stepWithOnOff(MTRLevelControlClusterStepWithOnOffParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stopWithOnOffWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stopWithOnOff(MTRLevelControlClusterStopWithOnOffParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "moveToClosestFrequencyWithParams:expectedValues:expectedValueInterval:completion:")
    public native void moveToClosestFrequency(MTRLevelControlClusterMoveToClosestFrequencyParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentLevelWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentLevel(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRemainingTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRemainingTime(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMinLevelWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinLevel(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxLevelWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxLevel(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentFrequencyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentFrequency(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMinFrequencyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMinFrequency(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeMaxFrequencyWithParams:")
    public native NSDictionary<NSString, ?> readAttributeMaxFrequency(MTRReadParams params);
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
    @Method(selector = "readAttributeOnOffTransitionTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOnOffTransitionTime(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOnOffTransitionTimeWithValue:expectedValueInterval:")
    public native void writeAttributeOnOffTransitionTime(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOnOffTransitionTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeOnOffTransitionTime(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOnLevelWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOnLevel(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOnLevelWithValue:expectedValueInterval:")
    public native void writeAttributeOnLevel(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOnLevelWithValue:expectedValueInterval:params:")
    public native void writeAttributeOnLevel(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOnTransitionTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOnTransitionTime(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOnTransitionTimeWithValue:expectedValueInterval:")
    public native void writeAttributeOnTransitionTime(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOnTransitionTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeOnTransitionTime(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeOffTransitionTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOffTransitionTime(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOffTransitionTimeWithValue:expectedValueInterval:")
    public native void writeAttributeOffTransitionTime(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeOffTransitionTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeOffTransitionTime(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDefaultMoveRateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDefaultMoveRate(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeDefaultMoveRateWithValue:expectedValueInterval:")
    public native void writeAttributeDefaultMoveRate(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeDefaultMoveRateWithValue:expectedValueInterval:params:")
    public native void writeAttributeDefaultMoveRate(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeStartUpCurrentLevelWithParams:")
    public native NSDictionary<NSString, ?> readAttributeStartUpCurrentLevel(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeStartUpCurrentLevelWithValue:expectedValueInterval:")
    public native void writeAttributeStartUpCurrentLevel(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeStartUpCurrentLevelWithValue:expectedValueInterval:params:")
    public native void writeAttributeStartUpCurrentLevel(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
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
