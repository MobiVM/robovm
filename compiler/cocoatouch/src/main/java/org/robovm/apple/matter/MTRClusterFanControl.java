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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterFanControl/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterFanControlPtr extends Ptr<MTRClusterFanControl, MTRClusterFanControlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterFanControl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterFanControl() {}
    protected MTRClusterFanControl(Handle h, long handle) { super(h, handle); }
    protected MTRClusterFanControl(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterFanControl(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
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
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeFanModeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFanMode(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeFanModeWithValue:expectedValueInterval:")
    public native void writeAttributeFanMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeFanModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeFanMode(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeFanModeSequenceWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFanModeSequence(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeFanModeSequenceWithValue:expectedValueInterval:")
    public native void writeAttributeFanModeSequence(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeFanModeSequenceWithValue:expectedValueInterval:params:")
    public native void writeAttributeFanModeSequence(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePercentSettingWithParams:")
    public native NSDictionary<NSString, ?> readAttributePercentSetting(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributePercentSettingWithValue:expectedValueInterval:")
    public native void writeAttributePercentSetting(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributePercentSettingWithValue:expectedValueInterval:params:")
    public native void writeAttributePercentSetting(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePercentCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributePercentCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSpeedMaxWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSpeedMax(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSpeedSettingWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSpeedSetting(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeSpeedSettingWithValue:expectedValueInterval:")
    public native void writeAttributeSpeedSetting(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeSpeedSettingWithValue:expectedValueInterval:params:")
    public native void writeAttributeSpeedSetting(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSpeedCurrentWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSpeedCurrent(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRockSupportWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRockSupport(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeRockSettingWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRockSetting(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRockSettingWithValue:expectedValueInterval:")
    public native void writeAttributeRockSetting(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeRockSettingWithValue:expectedValueInterval:params:")
    public native void writeAttributeRockSetting(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWindSupportWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWindSupport(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeWindSettingWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWindSetting(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeWindSettingWithValue:expectedValueInterval:")
    public native void writeAttributeWindSetting(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "writeAttributeWindSettingWithValue:expectedValueInterval:params:")
    public native void writeAttributeWindSetting(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
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
