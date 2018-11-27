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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INRequestPaymentIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleRequestPayment:completion:")
    void handleRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INRequestPaymentIntentResponse> completion);
    @Method(selector = "confirmRequestPayment:completion:")
    void confirmRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INRequestPaymentIntentResponse> completion);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. resolvePayerForRequestPayment:withCompletion: is deprecated. Use resolvePayerForRequestPayment:completion: instead
     */
    @Deprecated
    @Method(selector = "resolvePayerForRequestPayment:withCompletion:")
    void resolvePersonPayerForRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INPersonResolutionResult> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "resolvePayerForRequestPayment:completion:")
    void resolvePayerForRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INRequestPaymentPayerResolutionResult> completion);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. resolveCurrencyAmountForRequestPayment:withCompletion: is deprecated. Use resolveCurrencyAmountForRequestPayment:completion: instead
     */
    @Deprecated
    @Method(selector = "resolveCurrencyAmountForRequestPayment:withCompletion:")
    void resolveCurrencyAmountForRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INCurrencyAmountResolutionResult> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "resolveCurrencyAmountForRequestPayment:completion:")
    void resolveRequestPaymentCurrencyAmountForRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INRequestPaymentCurrencyAmountResolutionResult> completion);
    @Method(selector = "resolveNoteForRequestPayment:withCompletion:")
    void resolveNoteForRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INStringResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
