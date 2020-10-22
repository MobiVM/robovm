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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INStartCallIntentHandlingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INStartCallIntentHandling/*</implements>*/ {

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
    @NotImplemented("handleStartCall:completion:")
    public void handleStartCall(INStartCallIntent intent, @Block VoidBlock1<INStartCallIntentResponse> completion) {}
    @NotImplemented("confirmStartCall:completion:")
    public void confirmStartCall(INStartCallIntent intent, @Block VoidBlock1<INStartCallIntentResponse> completion) {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("resolveCallRecordToCallBackForStartCall:withCompletion:")
    public void resolveCallRecord(INStartCallIntent intent, @Block VoidBlock1<INCallRecordResolutionResult> completion) {}
    @NotImplemented("resolveDestinationTypeForStartCall:withCompletion:")
    public void resolveDestinationType(INStartCallIntent intent, @Block VoidBlock1<INCallDestinationTypeResolutionResult> completion) {}
    @NotImplemented("resolveContactsForStartCall:withCompletion:")
    public void resolveContacts(INStartCallIntent intent, @Block VoidBlock1<NSArray<INStartCallContactResolutionResult>> completion) {}
    @NotImplemented("resolveCallCapabilityForStartCall:withCompletion:")
    public void resolveCallCapability(INStartCallIntent intent, @Block VoidBlock1<INStartCallCallCapabilityResolutionResult> completion) {}
    /*</methods>*/
}
