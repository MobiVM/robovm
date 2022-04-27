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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 * @deprecated Deprecated in iOS 15.0. INSetDefrosterSettingsInCarIntentHandling is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INSetDefrosterSettingsInCarIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleSetDefrosterSettingsInCar:completion:")
    void handleSetDefrosterSettingsInCar(INSetDefrosterSettingsInCarIntent intent, @Block VoidBlock1<INSetDefrosterSettingsInCarIntentResponse> completion);
    @Method(selector = "confirmSetDefrosterSettingsInCar:completion:")
    void confirmSetDefrosterSettingsInCar(INSetDefrosterSettingsInCarIntent intent, @Block VoidBlock1<INSetDefrosterSettingsInCarIntentResponse> completion);
    @Method(selector = "resolveEnableForSetDefrosterSettingsInCar:withCompletion:")
    void resolveEnableForSetDefrosterSettingsInCar(INSetDefrosterSettingsInCarIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion);
    @Method(selector = "resolveDefrosterForSetDefrosterSettingsInCar:withCompletion:")
    void resolveDefrosterForSetDefrosterSettingsInCar(INSetDefrosterSettingsInCarIntent intent, @Block VoidBlock1<INCarDefrosterResolutionResult> completion);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "resolveCarNameForSetDefrosterSettingsInCar:withCompletion:")
    void resolveCarNameForSetDefrosterSettingsInCar(INSetDefrosterSettingsInCarIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
