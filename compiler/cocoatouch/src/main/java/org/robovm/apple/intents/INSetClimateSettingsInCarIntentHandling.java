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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INSetClimateSettingsInCarIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleSetClimateSettingsInCar:completion:")
    void handleSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INSetClimateSettingsInCarIntentResponse> completion);
    @Method(selector = "confirmSetClimateSettingsInCar:completion:")
    void confirmSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INSetClimateSettingsInCarIntentResponse> completion);
    @Method(selector = "resolveEnableFanForSetClimateSettingsInCar:withCompletion:")
    void resolveEnableFanForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion);
    @Method(selector = "resolveEnableAirConditionerForSetClimateSettingsInCar:withCompletion:")
    void resolveEnableAirConditionerForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion);
    @Method(selector = "resolveEnableClimateControlForSetClimateSettingsInCar:withCompletion:")
    void resolveEnableClimateControlForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion);
    @Method(selector = "resolveEnableAutoModeForSetClimateSettingsInCar:withCompletion:")
    void resolveEnableAutoModeForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion);
    @Method(selector = "resolveAirCirculationModeForSetClimateSettingsInCar:withCompletion:")
    void resolveAirCirculationModeForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INCarAirCirculationModeResolutionResult> completion);
    @Method(selector = "resolveFanSpeedIndexForSetClimateSettingsInCar:withCompletion:")
    void resolveFanSpeedIndexForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INIntegerResolutionResult> completion);
    @Method(selector = "resolveFanSpeedPercentageForSetClimateSettingsInCar:withCompletion:")
    void resolveFanSpeedPercentageForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INDoubleResolutionResult> completion);
    @Method(selector = "resolveRelativeFanSpeedSettingForSetClimateSettingsInCar:withCompletion:")
    void resolveRelativeFanSpeedSettingForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INRelativeSettingResolutionResult> completion);
    @Method(selector = "resolveTemperatureForSetClimateSettingsInCar:withCompletion:")
    void resolveTemperatureForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INTemperatureResolutionResult> completion);
    @Method(selector = "resolveRelativeTemperatureSettingForSetClimateSettingsInCar:withCompletion:")
    void resolveRelativeTemperatureSettingForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INRelativeSettingResolutionResult> completion);
    @Method(selector = "resolveClimateZoneForSetClimateSettingsInCar:withCompletion:")
    void resolveClimateZoneForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INCarSeatResolutionResult> completion);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "resolveCarNameForSetClimateSettingsInCar:withCompletion:")
    void resolveCarNameForSetClimateSettingsInCar(INSetClimateSettingsInCarIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
