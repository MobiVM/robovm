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
package org.robovm.apple.storekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 18.0. No longer supported.
 */
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKPaymentQueue/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKPaymentQueuePtr extends Ptr<SKPaymentQueue, SKPaymentQueuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKPaymentQueue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKPaymentQueue() {}
    protected SKPaymentQueue(Handle h, long handle) { super(h, handle); }
    protected SKPaymentQueue(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 18.0. No longer supported.
     */
    @Deprecated
    @Property(selector = "delegate")
    public native SKPaymentQueueDelegate getDelegate();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 18.0. No longer supported.
     */
    @Deprecated
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SKPaymentQueueDelegate v);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 18.0. Use Storefront.current.
     */
    @Deprecated
    @Property(selector = "storefront")
    public native SKStorefront getStorefront();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 18.0. Use Transaction.updates or PurchaseResult from Product.purchase(confirmIn:options:).
     */
    @Deprecated
    @Property(selector = "transactionObservers")
    public native NSArray<?> getTransactionObservers();
    /**
     * @deprecated Deprecated in iOS 18.0. Use Transaction.unfinished.
     */
    @Deprecated
    @Property(selector = "transactions")
    public native NSArray<SKPaymentTransaction> getTransactions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 18.0. Use Product.purchase(confirmIn:options:).
     */
    @Deprecated
    @Method(selector = "addPayment:")
    public native void addPayment(SKPayment payment);
    /**
     * @deprecated Deprecated in iOS 18.0. Use AppStore.sync().
     */
    @Deprecated
    @Method(selector = "restoreCompletedTransactions")
    public native void restoreCompletedTransactions();
    /**
     * @deprecated Deprecated in iOS 18.0. Use AppStore.sync().
     */
    @Deprecated
    @Method(selector = "restoreCompletedTransactionsWithApplicationUsername:")
    public native void restoreCompletedTransactions(String username);
    /**
     * @deprecated Deprecated in iOS 18.0. Use Transaction.finish().
     */
    @Deprecated
    @Method(selector = "finishTransaction:")
    public native void finishTransaction(SKPaymentTransaction transaction);
    /**
     * @deprecated Deprecated in iOS 16.0. Hosted content is no longer supported.
     */
    @Deprecated
    @Method(selector = "startDownloads:")
    public native void startDownloads(NSArray<SKDownload> downloads);
    /**
     * @deprecated Deprecated in iOS 16.0. Hosted content is no longer supported.
     */
    @Deprecated
    @Method(selector = "pauseDownloads:")
    public native void pauseDownloads(NSArray<SKDownload> downloads);
    /**
     * @deprecated Deprecated in iOS 16.0. Hosted content is no longer supported.
     */
    @Deprecated
    @Method(selector = "resumeDownloads:")
    public native void resumeDownloads(NSArray<SKDownload> downloads);
    /**
     * @deprecated Deprecated in iOS 16.0. Hosted content is no longer supported.
     */
    @Deprecated
    @Method(selector = "cancelDownloads:")
    public native void cancelDownloads(NSArray<SKDownload> downloads);
    /**
     * @deprecated Deprecated in iOS 18.0. Use Transaction.updates or PurchaseResult from Product.purchase(confirmIn:options:).
     */
    @Deprecated
    @Method(selector = "addTransactionObserver:")
    public native void addTransactionObserver(SKPaymentTransactionObserver observer);
    /**
     * @deprecated Deprecated in iOS 18.0. No longer supported.
     */
    @Deprecated
    @Method(selector = "removeTransactionObserver:")
    public native void removeTransactionObserver(SKPaymentTransactionObserver observer);
    /**
     * @since Available in iOS 13.4 and later.
     * @deprecated Deprecated in iOS 18.0. Use Message.messages and Message.display(in:).
     */
    @Deprecated
    @Method(selector = "showPriceConsentIfNeeded")
    public native void showPriceConsentIfNeeded();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 18.0. Use AppStore.presentOfferCodeRedeemSheet(in:).
     */
    @Deprecated
    @Method(selector = "presentCodeRedemptionSheet")
    public native void presentCodeRedemptionSheet();
    @Method(selector = "defaultQueue")
    public static native SKPaymentQueue getDefaultQueue();
    /**
     * @deprecated Deprecated in iOS 18.0. Use AppStore.canMakePayments.
     */
    @Deprecated
    @Method(selector = "canMakePayments")
    public static native boolean canMakePayments();
    /*</methods>*/
}
