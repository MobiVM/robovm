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
 * @since Available in iOS 10.3 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INPayBillIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handlePayBill:completion:")
    void handlePayBill(INPayBillIntent intent, @Block VoidBlock1<INPayBillIntentResponse> completion);
    @Method(selector = "confirmPayBill:completion:")
    void confirmPayBill(INPayBillIntent intent, @Block VoidBlock1<INPayBillIntentResponse> completion);
    @Method(selector = "resolveBillPayeeForPayBill:withCompletion:")
    void resolveBillPayeeForPayBill(INPayBillIntent intent, @Block VoidBlock1<INBillPayeeResolutionResult> completion);
    @Method(selector = "resolveFromAccountForPayBill:withCompletion:")
    void resolveFromAccountForPayBill(INPayBillIntent intent, @Block VoidBlock1<INPaymentAccountResolutionResult> completion);
    @Method(selector = "resolveTransactionAmountForPayBill:withCompletion:")
    void resolveTransactionAmountForPayBill(INPayBillIntent intent, @Block VoidBlock1<INPaymentAmountResolutionResult> completion);
    @Method(selector = "resolveTransactionScheduledDateForPayBill:withCompletion:")
    void resolveTransactionScheduledDateForPayBill(INPayBillIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion);
    @Method(selector = "resolveTransactionNoteForPayBill:withCompletion:")
    void resolveTransactionNoteForPayBill(INPayBillIntent intent, @Block VoidBlock1<INStringResolutionResult> completion);
    @Method(selector = "resolveBillTypeForPayBill:withCompletion:")
    void resolveBillTypeForPayBill(INPayBillIntent intent, @Block VoidBlock1<INBillTypeResolutionResult> completion);
    @Method(selector = "resolveDueDateForPayBill:withCompletion:")
    void resolveDueDateForPayBill(INPayBillIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
