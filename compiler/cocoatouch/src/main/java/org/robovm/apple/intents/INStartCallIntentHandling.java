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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INStartCallIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleStartCall:completion:")
    void handleStartCall(INStartCallIntent intent, @Block VoidBlock1<INStartCallIntentResponse> completion);
    @Method(selector = "confirmStartCall:completion:")
    void confirmStartCall(INStartCallIntent intent, @Block VoidBlock1<INStartCallIntentResponse> completion);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "resolveCallRecordToCallBackForStartCall:withCompletion:")
    void resolveCallRecord(INStartCallIntent intent, @Block VoidBlock1<INCallRecordResolutionResult> completion);
    @Method(selector = "resolveDestinationTypeForStartCall:withCompletion:")
    void resolveDestinationType(INStartCallIntent intent, @Block VoidBlock1<INCallDestinationTypeResolutionResult> completion);
    @Method(selector = "resolveContactsForStartCall:withCompletion:")
    void resolveContacts(INStartCallIntent intent, @Block VoidBlock1<NSArray<INStartCallContactResolutionResult>> completion);
    @Method(selector = "resolveCallCapabilityForStartCall:withCompletion:")
    void resolveCallCapability(INStartCallIntent intent, @Block VoidBlock1<INStartCallCallCapabilityResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
