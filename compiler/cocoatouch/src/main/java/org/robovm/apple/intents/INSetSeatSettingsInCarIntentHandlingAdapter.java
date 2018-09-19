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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSetSeatSettingsInCarIntentHandlingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INSetSeatSettingsInCarIntentHandling/*</implements>*/ {

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
    @NotImplemented("handleSetSeatSettingsInCar:completion:")
    public void handleSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INSetSeatSettingsInCarIntentResponse> completion) {}
    @NotImplemented("confirmSetSeatSettingsInCar:completion:")
    public void confirmSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INSetSeatSettingsInCarIntentResponse> completion) {}
    @NotImplemented("resolveEnableHeatingForSetSeatSettingsInCar:withCompletion:")
    public void resolveEnableHeatingForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion) {}
    @NotImplemented("resolveEnableCoolingForSetSeatSettingsInCar:withCompletion:")
    public void resolveEnableCoolingForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion) {}
    @NotImplemented("resolveEnableMassageForSetSeatSettingsInCar:withCompletion:")
    public void resolveEnableMassageForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion) {}
    @NotImplemented("resolveSeatForSetSeatSettingsInCar:withCompletion:")
    public void resolveSeatForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INCarSeatResolutionResult> completion) {}
    @NotImplemented("resolveLevelForSetSeatSettingsInCar:withCompletion:")
    public void resolveLevelForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INIntegerResolutionResult> completion) {}
    @NotImplemented("resolveRelativeLevelSettingForSetSeatSettingsInCar:withCompletion:")
    public void resolveRelativeLevelSettingForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INRelativeSettingResolutionResult> completion) {}
    /**
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("resolveCarNameForSetSeatSettingsInCar:withCompletion:")
    public void resolveCarNameForSetSeatSettingsInCar(INSetSeatSettingsInCarIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    /*</methods>*/
}
