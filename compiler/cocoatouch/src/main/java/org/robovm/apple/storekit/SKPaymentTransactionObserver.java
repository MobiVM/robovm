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

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/SKPaymentTransactionObserver/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "paymentQueue:updatedTransactions:")
    void updatedTransactions(SKPaymentQueue queue, NSArray<SKPaymentTransaction> transactions);
    @Method(selector = "paymentQueue:removedTransactions:")
    void removedTransactions(SKPaymentQueue queue, NSArray<SKPaymentTransaction> transactions);
    @Method(selector = "paymentQueue:restoreCompletedTransactionsFailedWithError:")
    void restoreCompletedTransactionsFailed(SKPaymentQueue queue, NSError error);
    @Method(selector = "paymentQueueRestoreCompletedTransactionsFinished:")
    void restoreCompletedTransactionsFinished(SKPaymentQueue queue);
    @Method(selector = "paymentQueue:updatedDownloads:")
    void updatedDownloads(SKPaymentQueue queue, NSArray<SKDownload> downloads);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "paymentQueue:shouldAddStorePayment:forProduct:")
    boolean shouldAddStorePayment(SKPaymentQueue queue, SKPayment payment, SKProduct product);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "paymentQueueDidChangeStorefront:")
    void paymentQueueDidChangeStorefront(SKPaymentQueue queue);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "paymentQueue:didRevokeEntitlementsForProductIdentifiers:")
    void didRevokeEntitlements(SKPaymentQueue queue, NSArray<NSString> productIdentifiers);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
