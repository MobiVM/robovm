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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INPaymentsDomainHandlingAdapter/*</name>*/ 
    extends /*<extends>*/INSendPaymentIntentHandlingAdapter/*</extends>*/ 
    /*<implements>*/implements INPaymentsDomainHandling/*</implements>*/ {

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
    @NotImplemented("handlePayBill:completion:")
    public void handlePayBill(INPayBillIntent intent, @Block VoidBlock1<INPayBillIntentResponse> completion) {}
    @NotImplemented("confirmPayBill:completion:")
    public void confirmPayBill(INPayBillIntent intent, @Block VoidBlock1<INPayBillIntentResponse> completion) {}
    @NotImplemented("resolveBillPayeeForPayBill:withCompletion:")
    public void resolveBillPayeeForPayBill(INPayBillIntent intent, @Block VoidBlock1<INBillPayeeResolutionResult> completion) {}
    @NotImplemented("resolveFromAccountForPayBill:withCompletion:")
    public void resolveFromAccountForPayBill(INPayBillIntent intent, @Block VoidBlock1<INPaymentAccountResolutionResult> completion) {}
    @NotImplemented("resolveTransactionAmountForPayBill:withCompletion:")
    public void resolveTransactionAmountForPayBill(INPayBillIntent intent, @Block VoidBlock1<INPaymentAmountResolutionResult> completion) {}
    @NotImplemented("resolveTransactionScheduledDateForPayBill:withCompletion:")
    public void resolveTransactionScheduledDateForPayBill(INPayBillIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion) {}
    @NotImplemented("resolveTransactionNoteForPayBill:withCompletion:")
    public void resolveTransactionNoteForPayBill(INPayBillIntent intent, @Block VoidBlock1<INStringResolutionResult> completion) {}
    @NotImplemented("resolveBillTypeForPayBill:withCompletion:")
    public void resolveBillTypeForPayBill(INPayBillIntent intent, @Block VoidBlock1<INBillTypeResolutionResult> completion) {}
    @NotImplemented("resolveDueDateForPayBill:withCompletion:")
    public void resolveDueDateForPayBill(INPayBillIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion) {}
    @NotImplemented("handleSearchForBills:completion:")
    public void handleSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INSearchForBillsIntentResponse> completion) {}
    @NotImplemented("confirmSearchForBills:completion:")
    public void confirmSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INSearchForBillsIntentResponse> completion) {}
    @NotImplemented("resolveBillPayeeForSearchForBills:withCompletion:")
    public void resolveBillPayeeForSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INBillPayeeResolutionResult> completion) {}
    @NotImplemented("resolvePaymentDateRangeForSearchForBills:withCompletion:")
    public void resolvePaymentDateRangeForSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion) {}
    @NotImplemented("resolveBillTypeForSearchForBills:withCompletion:")
    public void resolveBillTypeForSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INBillTypeResolutionResult> completion) {}
    @NotImplemented("resolveStatusForSearchForBills:withCompletion:")
    public void resolveStatusForSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INPaymentStatusResolutionResult> completion) {}
    @NotImplemented("resolveDueDateRangeForSearchForBills:withCompletion:")
    public void resolveDueDateRangeForSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion) {}
    @NotImplemented("handleSearchForAccounts:completion:")
    public void handleSearchForAccounts(INSearchForAccountsIntent intent, @Block VoidBlock1<INSearchForAccountsIntentResponse> completion) {}
    @NotImplemented("confirmSearchForAccounts:completion:")
    public void confirmSearchForAccounts(INSearchForAccountsIntent intent, @Block VoidBlock1<INSearchForAccountsIntentResponse> completion) {}
    @NotImplemented("resolveAccountNicknameForSearchForAccounts:withCompletion:")
    public void resolveAccountNicknameForSearchForAccounts(INSearchForAccountsIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    @NotImplemented("resolveAccountTypeForSearchForAccounts:withCompletion:")
    public void resolveAccountTypeForSearchForAccounts(INSearchForAccountsIntent intent, @Block VoidBlock1<INAccountTypeResolutionResult> completion) {}
    @NotImplemented("resolveOrganizationNameForSearchForAccounts:withCompletion:")
    public void resolveOrganizationNameForSearchForAccounts(INSearchForAccountsIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    @NotImplemented("resolveRequestedBalanceTypeForSearchForAccounts:withCompletion:")
    public void resolveRequestedBalanceTypeForSearchForAccounts(INSearchForAccountsIntent intent, @Block VoidBlock1<INBalanceTypeResolutionResult> completion) {}
    @NotImplemented("handleTransferMoney:completion:")
    public void handleTransferMoney(INTransferMoneyIntent intent, @Block VoidBlock1<INTransferMoneyIntentResponse> completion) {}
    @NotImplemented("confirmTransferMoney:completion:")
    public void confirmTransferMoney(INTransferMoneyIntent intent, @Block VoidBlock1<INTransferMoneyIntentResponse> completion) {}
    @NotImplemented("resolveFromAccountForTransferMoney:withCompletion:")
    public void resolveFromAccountForTransferMoney(INTransferMoneyIntent intent, @Block VoidBlock1<INPaymentAccountResolutionResult> completion) {}
    @NotImplemented("resolveToAccountForTransferMoney:withCompletion:")
    public void resolveToAccountForTransferMoney(INTransferMoneyIntent intent, @Block VoidBlock1<INPaymentAccountResolutionResult> completion) {}
    @NotImplemented("resolveTransactionAmountForTransferMoney:withCompletion:")
    public void resolveTransactionAmountForTransferMoney(INTransferMoneyIntent intent, @Block VoidBlock1<INPaymentAmountResolutionResult> completion) {}
    @NotImplemented("resolveTransactionScheduledDateForTransferMoney:withCompletion:")
    public void resolveTransactionScheduledDateForTransferMoney(INTransferMoneyIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion) {}
    @NotImplemented("resolveTransactionNoteForTransferMoney:withCompletion:")
    public void resolveTransactionNoteForTransferMoney(INTransferMoneyIntent intent, @Block VoidBlock1<INStringResolutionResult> completion) {}
    /*</methods>*/
}
