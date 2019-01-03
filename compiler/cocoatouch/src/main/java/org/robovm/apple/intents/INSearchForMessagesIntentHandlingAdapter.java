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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSearchForMessagesIntentHandlingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INSearchForMessagesIntentHandling/*</implements>*/ {

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
    @NotImplemented("handleSearchForMessages:completion:")
    public void handleSearchForMessages(INSearchForMessagesIntent intent, @Block VoidBlock1<INSearchForMessagesIntentResponse> completion) {}
    @NotImplemented("confirmSearchForMessages:completion:")
    public void confirmSearchForMessages(INSearchForMessagesIntent intent, @Block VoidBlock1<INSearchForMessagesIntentResponse> completion) {}
    @NotImplemented("resolveRecipientsForSearchForMessages:withCompletion:")
    public void resolveRecipientsForSearchForMessages(INSearchForMessagesIntent intent, @Block VoidBlock1<NSArray<INPersonResolutionResult>> completion) {}
    @NotImplemented("resolveSendersForSearchForMessages:withCompletion:")
    public void resolveSendersForSearchForMessages(INSearchForMessagesIntent intent, @Block VoidBlock1<NSArray<INPersonResolutionResult>> completion) {}
    @NotImplemented("resolveAttributesForSearchForMessages:withCompletion:")
    public void resolveAttributesForSearchForMessages(INSearchForMessagesIntent intent, @Block VoidBlock1<INMessageAttributeOptionsResolutionResult> completion) {}
    @NotImplemented("resolveDateTimeRangeForSearchForMessages:withCompletion:")
    public void resolveDateTimeRangeForSearchForMessages(INSearchForMessagesIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. resolveGroupNamesForSearchForMessages:withCompletion: is deprecated. Use resolveSpeakableGroupNamesForSearchForMessages:withCompletion: instead
     */
    @Deprecated
    @NotImplemented("resolveGroupNamesForSearchForMessages:withCompletion:")
    public void resolveGroupNamesForSearchForMessages(INSearchForMessagesIntent intent, @Block VoidBlock1<NSArray<INStringResolutionResult>> completion) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("resolveSpeakableGroupNamesForSearchForMessages:withCompletion:")
    public void resolveSpeakableGroupNamesForSearchForMessages(INSearchForMessagesIntent intent, @Block VoidBlock1<NSArray<INSpeakableStringResolutionResult>> completion) {}
    /*</methods>*/
}
