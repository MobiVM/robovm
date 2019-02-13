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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INSetSeatSettingsInCarIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleSetSeatSettingsInCar:completion:")
    void handleSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INSetSeatSettingsInCarIntentResponse> completion);
    @Method(selector = "confirmSetSeatSettingsInCar:completion:")
    void confirmSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INSetSeatSettingsInCarIntentResponse> completion);
    @Method(selector = "resolveEnableHeatingForSetSeatSettingsInCar:withCompletion:")
    void resolveEnableHeatingForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion);
    @Method(selector = "resolveEnableCoolingForSetSeatSettingsInCar:withCompletion:")
    void resolveEnableCoolingForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion);
    @Method(selector = "resolveEnableMassageForSetSeatSettingsInCar:withCompletion:")
    void resolveEnableMassageForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion);
    @Method(selector = "resolveSeatForSetSeatSettingsInCar:withCompletion:")
    void resolveSeatForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INCarSeatResolutionResult> completion);
    @Method(selector = "resolveLevelForSetSeatSettingsInCar:withCompletion:")
    void resolveLevelForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INIntegerResolutionResult> completion);
    @Method(selector = "resolveRelativeLevelSettingForSetSeatSettingsInCar:withCompletion:")
    void resolveRelativeLevelSettingForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INRelativeSettingResolutionResult> completion);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "resolveCarNameForSetSeatSettingsInCar:withCompletion:")
    void resolveCarNameForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
