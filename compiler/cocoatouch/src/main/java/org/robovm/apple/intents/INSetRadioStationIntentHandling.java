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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INSetRadioStationIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleSetRadioStation:completion:")
    void handleSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INSetRadioStationIntentResponse> completion);
    @Method(selector = "confirmSetRadioStation:completion:")
    void confirmSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INSetRadioStationIntentResponse> completion);
    @Method(selector = "resolveRadioTypeForSetRadioStation:withCompletion:")
    void resolveRadioTypeForSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INRadioTypeResolutionResult> completion);
    @Method(selector = "resolveFrequencyForSetRadioStation:withCompletion:")
    void resolveFrequencyForSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INDoubleResolutionResult> completion);
    @Method(selector = "resolveStationNameForSetRadioStation:withCompletion:")
    void resolveStationNameForSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INStringResolutionResult> completion);
    @Method(selector = "resolveChannelForSetRadioStation:withCompletion:")
    void resolveChannelForSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INStringResolutionResult> completion);
    @Method(selector = "resolvePresetNumberForSetRadioStation:withCompletion:")
    void resolvePresetNumberForSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INIntegerResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
