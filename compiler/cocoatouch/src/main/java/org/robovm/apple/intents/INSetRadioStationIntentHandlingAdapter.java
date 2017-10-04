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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSetRadioStationIntentHandlingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INSetRadioStationIntentHandling/*</implements>*/ {

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
    @NotImplemented("handleSetRadioStation:completion:")
    public void handleSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INSetRadioStationIntentResponse> completion) {}
    @NotImplemented("confirmSetRadioStation:completion:")
    public void confirmSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INSetRadioStationIntentResponse> completion) {}
    @NotImplemented("resolveRadioTypeForSetRadioStation:withCompletion:")
    public void resolveRadioTypeForSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INRadioTypeResolutionResult> completion) {}
    @NotImplemented("resolveFrequencyForSetRadioStation:withCompletion:")
    public void resolveFrequencyForSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INDoubleResolutionResult> completion) {}
    @NotImplemented("resolveStationNameForSetRadioStation:withCompletion:")
    public void resolveStationNameForSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INStringResolutionResult> completion) {}
    @NotImplemented("resolveChannelForSetRadioStation:withCompletion:")
    public void resolveChannelForSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INStringResolutionResult> completion) {}
    @NotImplemented("resolvePresetNumberForSetRadioStation:withCompletion:")
    public void resolvePresetNumberForSetRadioStation(INSetRadioStationIntent intent, @Block VoidBlock1<INIntegerResolutionResult> completion) {}
    /*</methods>*/
}
