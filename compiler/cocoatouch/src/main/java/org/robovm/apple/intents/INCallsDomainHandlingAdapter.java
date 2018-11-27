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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INCallsDomainHandlingAdapter/*</name>*/ 
    extends /*<extends>*/INStartAudioCallIntentHandlingAdapter/*</extends>*/ 
    /*<implements>*/implements INCallsDomainHandling/*</implements>*/ {

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
    @NotImplemented("handleStartVideoCall:completion:")
    public void handleStartVideoCall(INStartVideoCallIntent intent, @Block VoidBlock1<INStartVideoCallIntentResponse> completion) {}
    @NotImplemented("confirmStartVideoCall:completion:")
    public void confirmStartVideoCall(INStartVideoCallIntent intent, @Block VoidBlock1<INStartVideoCallIntentResponse> completion) {}
    @NotImplemented("resolveContactsForStartVideoCall:withCompletion:")
    public void resolveContactsForStartVideoCall(INStartVideoCallIntent intent, @Block VoidBlock1<NSArray<INPersonResolutionResult>> completion) {}
    @NotImplemented("handleSearchCallHistory:completion:")
    public void handleSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INSearchCallHistoryIntentResponse> completion) {}
    @NotImplemented("confirmSearchCallHistory:completion:")
    public void confirmSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INSearchCallHistoryIntentResponse> completion) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. resolveCallTypeForSearchCallHistory:withCompletion: is deprecated. Use resolveCallTypesForSearchCallHistory:withCompletion: instead
     */
    @Deprecated
    @NotImplemented("resolveCallTypeForSearchCallHistory:withCompletion:")
    public void resolveCallTypeForSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INCallRecordTypeResolutionResult> completion) {}
    @NotImplemented("resolveDateCreatedForSearchCallHistory:withCompletion:")
    public void resolveDateCreatedForSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion) {}
    @NotImplemented("resolveRecipientForSearchCallHistory:withCompletion:")
    public void resolveRecipientForSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INPersonResolutionResult> completion) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("resolveCallTypesForSearchCallHistory:withCompletion:")
    public void resolveCallTypesForSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INCallRecordTypeOptionsResolutionResult> completion) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("resolveUnseenForSearchCallHistory:withCompletion:")
    public void resolveUnseenForSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion) {}
    /*</methods>*/
}
