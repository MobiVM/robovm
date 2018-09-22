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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INSearchCallHistoryIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleSearchCallHistory:completion:")
    void handleSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INSearchCallHistoryIntentResponse> completion);
    @Method(selector = "confirmSearchCallHistory:completion:")
    void confirmSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INSearchCallHistoryIntentResponse> completion);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. resolveCallTypeForSearchCallHistory:withCompletion: is deprecated. Use resolveCallTypesForSearchCallHistory:withCompletion: instead
     */
    @Deprecated
    @Method(selector = "resolveCallTypeForSearchCallHistory:withCompletion:")
    void resolveCallTypeForSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INCallRecordTypeResolutionResult> completion);
    @Method(selector = "resolveDateCreatedForSearchCallHistory:withCompletion:")
    void resolveDateCreatedForSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion);
    @Method(selector = "resolveRecipientForSearchCallHistory:withCompletion:")
    void resolveRecipientForSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INPersonResolutionResult> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "resolveCallTypesForSearchCallHistory:withCompletion:")
    void resolveCallTypesForSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INCallRecordTypeOptionsResolutionResult> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "resolveUnseenForSearchCallHistory:withCompletion:")
    void resolveUnseenForSearchCallHistory(INSearchCallHistoryIntent intent, @Block VoidBlock1<INBooleanResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
