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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSetSeatSettingsInCarIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSetSeatSettingsInCarIntentPtr extends Ptr<INSetSeatSettingsInCarIntent, INSetSeatSettingsInCarIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSetSeatSettingsInCarIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSetSeatSettingsInCarIntent() {}
    protected INSetSeatSettingsInCarIntent(Handle h, long handle) { super(h, handle); }
    protected INSetSeatSettingsInCarIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "initWithEnableHeating:enableCooling:enableMassage:seat:level:relativeLevelSetting:carName:")
    public INSetSeatSettingsInCarIntent(NSNumber enableHeating, NSNumber enableCooling, NSNumber enableMassage, INCarSeat seat, NSNumber level, INRelativeSetting relativeLevelSetting, INSpeakableString carName) { super((SkipInit) null); initObject(init(enableHeating, enableCooling, enableMassage, seat, level, relativeLevelSetting, carName)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "initWithEnableHeating:enableCooling:enableMassage:seat:level:relativeLevelSetting:")
    public INSetSeatSettingsInCarIntent(NSNumber enableHeating, NSNumber enableCooling, NSNumber enableMassage, INCarSeat seat, NSNumber level, INRelativeSetting relativeLevelSetting) { super((SkipInit) null); initObject(init(enableHeating, enableCooling, enableMassage, seat, level, relativeLevelSetting)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enableHeating")
    public native NSNumber getEnableHeating();
    @Property(selector = "enableCooling")
    public native NSNumber getEnableCooling();
    @Property(selector = "enableMassage")
    public native NSNumber getEnableMassage();
    @Property(selector = "seat")
    public native INCarSeat getSeat();
    @Property(selector = "level")
    public native NSNumber getLevel();
    @Property(selector = "relativeLevelSetting")
    public native INRelativeSetting getRelativeLevelSetting();
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
    @Method(selector = "initWithEnableHeating:enableCooling:enableMassage:seat:level:relativeLevelSetting:carName:")
    protected native @Pointer long init(NSNumber enableHeating, NSNumber enableCooling, NSNumber enableMassage, INCarSeat seat, NSNumber level, INRelativeSetting relativeLevelSetting, INSpeakableString carName);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "initWithEnableHeating:enableCooling:enableMassage:seat:level:relativeLevelSetting:")
    protected native @Pointer long init(NSNumber enableHeating, NSNumber enableCooling, NSNumber enableMassage, INCarSeat seat, NSNumber level, INRelativeSetting relativeLevelSetting);
    /*</methods>*/
}
