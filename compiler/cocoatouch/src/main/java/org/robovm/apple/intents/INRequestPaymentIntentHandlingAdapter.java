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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRequestPaymentIntentHandlingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INRequestPaymentIntentHandling/*</implements>*/ {

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
    @NotImplemented("handleRequestPayment:completion:")
    public void handleRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INRequestPaymentIntentResponse> completion) {}
    @NotImplemented("confirmRequestPayment:completion:")
    public void confirmRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INRequestPaymentIntentResponse> completion) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. resolvePayerForRequestPayment:withCompletion: is deprecated. Use resolvePayerForRequestPayment:completion: instead
     */
    @Deprecated
    @NotImplemented("resolvePayerForRequestPayment:withCompletion:")
    public void resolvePersonPayerForRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INPersonResolutionResult> completion) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("resolvePayerForRequestPayment:completion:")
    public void resolvePayerForRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INRequestPaymentPayerResolutionResult> completion) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. resolveCurrencyAmountForRequestPayment:withCompletion: is deprecated. Use resolveCurrencyAmountForRequestPayment:completion: instead
     */
    @Deprecated
    @NotImplemented("resolveCurrencyAmountForRequestPayment:withCompletion:")
    public void resolveCurrencyAmountForRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INCurrencyAmountResolutionResult> completion) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("resolveCurrencyAmountForRequestPayment:completion:")
    public void resolveRequestPaymentCurrencyAmountForRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INRequestPaymentCurrencyAmountResolutionResult> completion) {}
    @NotImplemented("resolveNoteForRequestPayment:withCompletion:")
    public void resolveNoteForRequestPayment(INRequestPaymentIntent intent, @Block VoidBlock1<INStringResolutionResult> completion) {}
    /*</methods>*/
}
