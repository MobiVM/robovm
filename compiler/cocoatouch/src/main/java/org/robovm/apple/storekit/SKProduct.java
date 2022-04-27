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
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKProduct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKProductPtr extends Ptr<SKProduct, SKProductPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKProduct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKProduct() {}
    protected SKProduct(Handle h, long handle) { super(h, handle); }
    protected SKProduct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "localizedTitle")
    public native String getLocalizedTitle();
    @Property(selector = "price")
    public native NSDecimalNumber getPrice();
    @Property(selector = "priceLocale")
    public native NSLocale getPriceLocale();
    @Property(selector = "productIdentifier")
    public native String getProductIdentifier();
    @Property(selector = "isDownloadable")
    public native boolean isDownloadable();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isFamilyShareable")
    public native boolean isFamilyShareable();
    @Property(selector = "downloadContentLengths")
    public native NSArray<NSNumber> getDownloadContentLengths();
    @Property(selector = "contentVersion")
    public native String getContentVersion();
    @Property(selector = "downloadContentVersion")
    public native String getDownloadContentVersion();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "subscriptionPeriod")
    public native SKProductSubscriptionPeriod getSubscriptionPeriod();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "introductoryPrice")
    public native SKProductDiscount getIntroductoryPrice();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "subscriptionGroupIdentifier")
    public native String getSubscriptionGroupIdentifier();
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "discounts")
    public native NSArray<SKProductDiscount> getDiscounts();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
