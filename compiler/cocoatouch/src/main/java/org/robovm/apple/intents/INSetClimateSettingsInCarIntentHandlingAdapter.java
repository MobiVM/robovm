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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSetClimateSettingsInCarIntentHandlingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INSetClimateSettingsInCarIntentHandling/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("handleSetClimateSettingsInCar:completion:")
    public void handleSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INSetClimateSettingsInCarIntentResponse> completion) {}
    @NotImplemented("confirmSetClimateSettingsInCar:completion:")
    public void confirmSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INSetClimateSettingsInCarIntentResponse> completion) {}
    @NotImplemented("resolveEnableFanForSetClimateSettingsInCar:withCompletion:")
    public void resolveEnableFanForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion) {}
    @NotImplemented("resolveEnableAirConditionerForSetClimateSettingsInCar:withCompletion:")
    public void resolveEnableAirConditionerForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion) {}
    @NotImplemented("resolveEnableClimateControlForSetClimateSettingsInCar:withCompletion:")
    public void resolveEnableClimateControlForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion) {}
    @NotImplemented("resolveEnableAutoModeForSetClimateSettingsInCar:withCompletion:")
    public void resolveEnableAutoModeForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion) {}
    @NotImplemented("resolveAirCirculationModeForSetClimateSettingsInCar:withCompletion:")
    public void resolveAirCirculationModeForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INCarAirCirculationModeResolutionResult> completion) {}
    @NotImplemented("resolveFanSpeedIndexForSetClimateSettingsInCar:withCompletion:")
    public void resolveFanSpeedIndexForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INIntegerResolutionResult> completion) {}
    @NotImplemented("resolveFanSpeedPercentageForSetClimateSettingsInCar:withCompletion:")
    public void resolveFanSpeedPercentageForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INDoubleResolutionResult> completion) {}
    @NotImplemented("resolveRelativeFanSpeedSettingForSetClimateSettingsInCar:withCompletion:")
    public void resolveRelativeFanSpeedSettingForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INRelativeSettingResolutionResult> completion) {}
    @NotImplemented("resolveTemperatureForSetClimateSettingsInCar:withCompletion:")
    public void resolveTemperatureForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INTemperatureResolutionResult> completion) {}
    @NotImplemented("resolveRelativeTemperatureSettingForSetClimateSettingsInCar:withCompletion:")
    public void resolveRelativeTemperatureSettingForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INRelativeSettingResolutionResult> completion) {}
    @NotImplemented("resolveClimateZoneForSetClimateSettingsInCar:withCompletion:")
    public void resolveClimateZoneForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INCarSeatResolutionResult> completion) {}
    /**
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("resolveCarNameForSetClimateSettingsInCar:withCompletion:")
    public void resolveCarNameForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    /*</methods>*/
}
