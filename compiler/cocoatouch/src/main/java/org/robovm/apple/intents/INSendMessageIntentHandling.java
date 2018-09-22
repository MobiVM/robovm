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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INSendMessageIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleSendMessage:completion:")
    void handleSendMessage(INSendMessageIntent intent, @Block VoidBlock1<INSendMessageIntentResponse> completion);
    @Method(selector = "confirmSendMessage:completion:")
    void confirmSendMessage(INSendMessageIntent intent, @Block VoidBlock1<INSendMessageIntentResponse> completion);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. resolveRecipientsForSendMessage:withCompletion: is deprecated. Use resolveRecipientsForSendMessage:completion: instead
     */
    @Deprecated
    @Method(selector = "resolveRecipientsForSendMessage:withCompletion:")
    void resolveRecipientsForSendMessage(INSendMessageIntent intent, @Block VoidBlock1<NSArray<INPersonResolutionResult>> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "resolveRecipientsForSendMessage:completion:")
    void resolveRecipientsForSendMessageRecepient(INSendMessageIntent intent, @Block VoidBlock1<NSArray<INSendMessageRecipientResolutionResult>> completion);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. resolveGroupNameForSendMessage:withCompletion: is deprecated. Use resolveSpeakableGroupNameForSendMessage:withCompletion: instead
     */
    @Deprecated
    @Method(selector = "resolveGroupNameForSendMessage:withCompletion:")
    void resolveGroupNameForSendMessage(INSendMessageIntent intent, @Block VoidBlock1<INStringResolutionResult> completion);
    @Method(selector = "resolveContentForSendMessage:withCompletion:")
    void resolveContentForSendMessage(INSendMessageIntent intent, @Block VoidBlock1<INStringResolutionResult> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "resolveSpeakableGroupNameForSendMessage:withCompletion:")
    void resolveSpeakableGroupNameForSendMessage(INSendMessageIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
