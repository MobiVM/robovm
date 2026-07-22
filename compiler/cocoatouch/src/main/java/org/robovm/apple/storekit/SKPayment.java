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
 * @deprecated Deprecated in iOS 18.0. Use Product.purchase(confirmIn:options:).
 */
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKPayment/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKPaymentPtr extends Ptr<SKPayment, SKPaymentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKPayment.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKPayment() {}
    @Deprecated protected SKPayment(long handle) { super(handle); }
    protected SKPayment(Handle h, long handle) { super(h, handle); }
    protected SKPayment(SkipInit skipInit) { super(skipInit); }
    public SKPayment(SKProduct product) { super((Handle) null, create(product)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "productIdentifier")
    public native String getProductIdentifier();
    /**
     * @deprecated Deprecated in iOS 18.0. Create Product.PurchaseOption.custom values to use in Product.purchase(confirmIn:options:).
     */
    @Deprecated
    @Property(selector = "requestData")
    public native NSData getRequestData();
    /**
     * @deprecated Deprecated in iOS 18.0. Create a Product.PurchaseOption.quantity to use in Product.purchase(confirmIn:options:).
     */
    @Deprecated
    @Property(selector = "quantity")
    public native @MachineSizedSInt long getQuantity();
    /**
     * @deprecated Deprecated in iOS 18.0. Create a Product.PurchaseOption.appAccountToken to use in Product.purchase(confirmIn:options:).
     */
    @Deprecated
    @Property(selector = "applicationUsername")
    public native String getApplicationUsername();
    /**
     * @since Available in iOS 8.3 and later.
     * @deprecated Deprecated in iOS 18.0. Create a Product.PurchaseOption.simulatesAskToBuyInSandbox to use in Product.purchase(confirmIn:options:).
     */
    @Deprecated
    @Property(selector = "simulatesAskToBuyInSandbox")
    public native boolean simulatesAskToBuyInSandbox();
    /**
     * @since Available in iOS 12.2 and later.
     * @deprecated Deprecated in iOS 18.0. Create a Product.PurchaseOption.promotionalOffer to use in Product.purchase(confirmIn:options:).
     */
    @Deprecated
    @Property(selector = "paymentDiscount")
    public native SKPaymentDiscount getPaymentDiscount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "paymentWithProduct:")
    protected static native @Pointer long create(SKProduct product);
    /*</methods>*/
}
