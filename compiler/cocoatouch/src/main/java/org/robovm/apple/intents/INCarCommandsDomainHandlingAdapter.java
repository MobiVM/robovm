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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INCarCommandsDomainHandlingAdapter/*</name>*/ 
    extends /*<extends>*/INActivateCarSignalIntentHandlingAdapter/*</extends>*/ 
    /*<implements>*/implements INCarCommandsDomainHandling/*</implements>*/ {

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
    @NotImplemented("handleSetCarLockStatus:completion:")
    public void handleSetCarLockStatus(INSetCarLockStatusIntent intent, @Block VoidBlock1<INSetCarLockStatusIntentResponse> completion) {}
    @NotImplemented("confirmSetCarLockStatus:completion:")
    public void confirmSetCarLockStatus(INSetCarLockStatusIntent intent, @Block VoidBlock1<INSetCarLockStatusIntentResponse> completion) {}
    @NotImplemented("resolveLockedForSetCarLockStatus:withCompletion:")
    public void resolveLockedForSetCarLockStatus(INSetCarLockStatusIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion) {}
    @NotImplemented("resolveCarNameForSetCarLockStatus:withCompletion:")
    public void resolveCarNameForSetCarLockStatus(INSetCarLockStatusIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    @NotImplemented("handleGetCarLockStatus:completion:")
    public void handleGetCarLockStatus(INGetCarLockStatusIntent intent, @Block VoidBlock1<INGetCarLockStatusIntentResponse> completion) {}
    @NotImplemented("confirmGetCarLockStatus:completion:")
    public void confirmGetCarLockStatus(INGetCarLockStatusIntent intent, @Block VoidBlock1<INGetCarLockStatusIntentResponse> completion) {}
    @NotImplemented("resolveCarNameForGetCarLockStatus:withCompletion:")
    public void resolveCarNameForGetCarLockStatus(INGetCarLockStatusIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    @NotImplemented("handleGetCarPowerLevelStatus:completion:")
    public void handleGetCarPowerLevelStatus(INGetCarPowerLevelStatusIntent intent, @Block VoidBlock1<INGetCarPowerLevelStatusIntentResponse> completion) {}
    @NotImplemented("confirmGetCarPowerLevelStatus:completion:")
    public void confirmGetCarPowerLevelStatus(INGetCarPowerLevelStatusIntent intent, @Block VoidBlock1<INGetCarPowerLevelStatusIntentResponse> completion) {}
    @NotImplemented("resolveCarNameForGetCarPowerLevelStatus:withCompletion:")
    public void resolveCarNameForGetCarPowerLevelStatus(INGetCarPowerLevelStatusIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    /*</methods>*/
}
