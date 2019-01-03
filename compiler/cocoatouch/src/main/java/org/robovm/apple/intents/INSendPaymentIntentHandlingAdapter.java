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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSendPaymentIntentHandlingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INSendPaymentIntentHandling/*</implements>*/ {

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
    @NotImplemented("handleSendPayment:completion:")
    public void handleSendPayment(INSendPaymentIntent intent, @Block VoidBlock1<INSendPaymentIntentResponse> completion) {}
    @NotImplemented("confirmSendPayment:completion:")
    public void confirmSendPayment(INSendPaymentIntent intent, @Block VoidBlock1<INSendPaymentIntentResponse> completion) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. resolvePayeeForSendPayment:withCompletion: is deprecated. Use resolvePayeeForSendPayment:completion: instead
     */
    @Deprecated
    @NotImplemented("resolvePayeeForSendPayment:withCompletion:")
    public void resolvePersonPayeeForSendPayment(INSendPaymentIntent intent, @Block VoidBlock1<INPersonResolutionResult> completion) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("resolvePayeeForSendPayment:completion:")
    public void resolvePayeeForSendPayment(INSendPaymentIntent intent, @Block VoidBlock1<INSendPaymentPayeeResolutionResult> completion) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. resolveCurrencyAmountForSendPayment:withCompletion: is deprecated. Use resolveCurrencyAmountForSendPayment:completion: instead
     */
    @Deprecated
    @NotImplemented("resolveCurrencyAmountForSendPayment:withCompletion:")
    public void resolveCurrencyAmountForSendPayment(INSendPaymentIntent intent, @Block VoidBlock1<INCurrencyAmountResolutionResult> completion) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("resolveCurrencyAmountForSendPayment:completion:")
    public void resolveSendPaymentCurrencyAmountForSendPayment(INSendPaymentIntent intent, @Block VoidBlock1<INSendPaymentCurrencyAmountResolutionResult> completion) {}
    @NotImplemented("resolveNoteForSendPayment:withCompletion:")
    public void resolveNoteForSendPayment(INSendPaymentIntent intent, @Block VoidBlock1<INStringResolutionResult> completion) {}
    /*</methods>*/
}
