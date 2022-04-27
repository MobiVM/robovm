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
package org.robovm.apple.passkit;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKDisbursementRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKDisbursementRequestPtr extends Ptr<PKDisbursementRequest, PKDisbursementRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKDisbursementRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKDisbursementRequest() {}
    protected PKDisbursementRequest(Handle h, long handle) { super(h, handle); }
    protected PKDisbursementRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "amount")
    public native NSDecimalNumber getAmount();
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "setAmount:")
    public native void setAmount(NSDecimalNumber v);
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "currencyCode")
    public native String getCurrencyCode();
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "setCurrencyCode:")
    public native void setCurrencyCode(String v);
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "countryCode")
    public native String getCountryCode();
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "setCountryCode:")
    public native void setCountryCode(String v);
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "requestSchedule")
    public native PKDisbursementRequestSchedule getRequestSchedule();
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "setRequestSchedule:")
    public native void setRequestSchedule(PKDisbursementRequestSchedule v);
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "summaryItems")
    public native NSArray<PKPaymentSummaryItem> getSummaryItems();
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "setSummaryItems:")
    public native void setSummaryItems(NSArray<PKPaymentSummaryItem> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
