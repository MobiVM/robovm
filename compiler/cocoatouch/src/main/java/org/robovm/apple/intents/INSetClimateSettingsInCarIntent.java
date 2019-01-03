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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSetClimateSettingsInCarIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSetClimateSettingsInCarIntentPtr extends Ptr<INSetClimateSettingsInCarIntent, INSetClimateSettingsInCarIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSetClimateSettingsInCarIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSetClimateSettingsInCarIntent() {}
    protected INSetClimateSettingsInCarIntent(Handle h, long handle) { super(h, handle); }
    protected INSetClimateSettingsInCarIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithEnableFan:enableAirConditioner:enableClimateControl:enableAutoMode:airCirculationMode:fanSpeedIndex:fanSpeedPercentage:relativeFanSpeedSetting:temperature:relativeTemperatureSetting:climateZone:carName:")
    public INSetClimateSettingsInCarIntent(NSNumber enableFan, NSNumber enableAirConditioner, NSNumber enableClimateControl, NSNumber enableAutoMode, INCarAirCirculationMode airCirculationMode, NSNumber fanSpeedIndex, NSNumber fanSpeedPercentage, INRelativeSetting relativeFanSpeedSetting, NSMeasurement<NSUnitTemperature> temperature, INRelativeSetting relativeTemperatureSetting, INCarSeat climateZone, INSpeakableString carName) { super((SkipInit) null); initObject(init(enableFan, enableAirConditioner, enableClimateControl, enableAutoMode, airCirculationMode, fanSpeedIndex, fanSpeedPercentage, relativeFanSpeedSetting, temperature, relativeTemperatureSetting, climateZone, carName)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "initWithEnableFan:enableAirConditioner:enableClimateControl:enableAutoMode:airCirculationMode:fanSpeedIndex:fanSpeedPercentage:relativeFanSpeedSetting:temperature:relativeTemperatureSetting:climateZone:")
    public INSetClimateSettingsInCarIntent(NSNumber enableFan, NSNumber enableAirConditioner, NSNumber enableClimateControl, NSNumber enableAutoMode, INCarAirCirculationMode airCirculationMode, NSNumber fanSpeedIndex, NSNumber fanSpeedPercentage, INRelativeSetting relativeFanSpeedSetting, NSMeasurement<NSUnitTemperature> temperature, INRelativeSetting relativeTemperatureSetting, INCarSeat climateZone) { super((SkipInit) null); initObject(init(enableFan, enableAirConditioner, enableClimateControl, enableAutoMode, airCirculationMode, fanSpeedIndex, fanSpeedPercentage, relativeFanSpeedSetting, temperature, relativeTemperatureSetting, climateZone)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enableFan")
    public native NSNumber getEnableFan();
    @Property(selector = "enableAirConditioner")
    public native NSNumber getEnableAirConditioner();
    @Property(selector = "enableClimateControl")
    public native NSNumber getEnableClimateControl();
    @Property(selector = "enableAutoMode")
    public native NSNumber getEnableAutoMode();
    @Property(selector = "airCirculationMode")
    public native INCarAirCirculationMode getAirCirculationMode();
    @Property(selector = "fanSpeedIndex")
    public native NSNumber getFanSpeedIndex();
    @Property(selector = "fanSpeedPercentage")
    public native NSNumber getFanSpeedPercentage();
    @Property(selector = "relativeFanSpeedSetting")
    public native INRelativeSetting getRelativeFanSpeedSetting();
    @Property(selector = "temperature")
    public native NSMeasurement<NSUnitTemperature> getTemperature();
    @Property(selector = "relativeTemperatureSetting")
    public native INRelativeSetting getRelativeTemperatureSetting();
    @Property(selector = "climateZone")
    public native INCarSeat getClimateZone();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "carName")
    public native INSpeakableString getCarName();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithEnableFan:enableAirConditioner:enableClimateControl:enableAutoMode:airCirculationMode:fanSpeedIndex:fanSpeedPercentage:relativeFanSpeedSetting:temperature:relativeTemperatureSetting:climateZone:carName:")
    protected native @Pointer long init(NSNumber enableFan, NSNumber enableAirConditioner, NSNumber enableClimateControl, NSNumber enableAutoMode, INCarAirCirculationMode airCirculationMode, NSNumber fanSpeedIndex, NSNumber fanSpeedPercentage, INRelativeSetting relativeFanSpeedSetting, NSMeasurement<NSUnitTemperature> temperature, INRelativeSetting relativeTemperatureSetting, INCarSeat climateZone, INSpeakableString carName);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "initWithEnableFan:enableAirConditioner:enableClimateControl:enableAutoMode:airCirculationMode:fanSpeedIndex:fanSpeedPercentage:relativeFanSpeedSetting:temperature:relativeTemperatureSetting:climateZone:")
    protected native @Pointer long init(NSNumber enableFan, NSNumber enableAirConditioner, NSNumber enableClimateControl, NSNumber enableAutoMode, INCarAirCirculationMode airCirculationMode, NSNumber fanSpeedIndex, NSNumber fanSpeedPercentage, INRelativeSetting relativeFanSpeedSetting, NSMeasurement<NSUnitTemperature> temperature, INRelativeSetting relativeTemperatureSetting, INCarSeat climateZone);
    /*</methods>*/
}
