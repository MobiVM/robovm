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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKProductDiscount/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKProductDiscountPtr extends Ptr<SKProductDiscount, SKProductDiscountPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKProductDiscount.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKProductDiscount() {}
    protected SKProductDiscount(Handle h, long handle) { super(h, handle); }
    protected SKProductDiscount(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "price")
    public native NSDecimalNumber getPrice();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "priceLocale")
    public native NSLocale getPriceLocale();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "subscriptionPeriod")
    public native SKProductSubscriptionPeriod getSubscriptionPeriod();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "numberOfPeriods")
    public native @MachineSizedUInt long getNumberOfPeriods();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "paymentMode")
    public native SKProductDiscountPaymentMode getPaymentMode();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
