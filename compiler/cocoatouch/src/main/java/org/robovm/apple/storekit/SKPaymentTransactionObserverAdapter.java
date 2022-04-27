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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKPaymentTransactionObserverAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SKPaymentTransactionObserver/*</implements>*/ {

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
    @NotImplemented("paymentQueue:updatedTransactions:")
    public void updatedTransactions(SKPaymentQueue queue, NSArray<SKPaymentTransaction> transactions) {}
    @NotImplemented("paymentQueue:removedTransactions:")
    public void removedTransactions(SKPaymentQueue queue, NSArray<SKPaymentTransaction> transactions) {}
    @NotImplemented("paymentQueue:restoreCompletedTransactionsFailedWithError:")
    public void restoreCompletedTransactionsFailed(SKPaymentQueue queue, NSError error) {}
    @NotImplemented("paymentQueueRestoreCompletedTransactionsFinished:")
    public void restoreCompletedTransactionsFinished(SKPaymentQueue queue) {}
    @NotImplemented("paymentQueue:updatedDownloads:")
    public void updatedDownloads(SKPaymentQueue queue, NSArray<SKDownload> downloads) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("paymentQueue:shouldAddStorePayment:forProduct:")
    public boolean shouldAddStorePayment(SKPaymentQueue queue, SKPayment payment, SKProduct product) { return false; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("paymentQueueDidChangeStorefront:")
    public void paymentQueueDidChangeStorefront(SKPaymentQueue queue) {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("paymentQueue:didRevokeEntitlementsForProductIdentifiers:")
    public void didRevokeEntitlements(SKPaymentQueue queue, NSArray<NSString> productIdentifiers) {}
    /*</methods>*/
}
