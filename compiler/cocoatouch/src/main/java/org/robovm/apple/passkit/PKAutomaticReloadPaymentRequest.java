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
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKAutomaticReloadPaymentRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKAutomaticReloadPaymentRequestPtr extends Ptr<PKAutomaticReloadPaymentRequest, PKAutomaticReloadPaymentRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKAutomaticReloadPaymentRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKAutomaticReloadPaymentRequest() {}
    protected PKAutomaticReloadPaymentRequest(Handle h, long handle) { super(h, handle); }
    protected PKAutomaticReloadPaymentRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPaymentDescription:automaticReloadBilling:managementURL:")
    public PKAutomaticReloadPaymentRequest(String paymentDescription, PKAutomaticReloadPaymentSummaryItem automaticReloadBilling, NSURL managementURL) { super((SkipInit) null); initObject(init(paymentDescription, automaticReloadBilling, managementURL)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "paymentDescription")
    public native String getPaymentDescription();
    @Property(selector = "setPaymentDescription:")
    public native void setPaymentDescription(String v);
    @Property(selector = "automaticReloadBilling")
    public native PKAutomaticReloadPaymentSummaryItem getAutomaticReloadBilling();
    @Property(selector = "setAutomaticReloadBilling:")
    public native void setAutomaticReloadBilling(PKAutomaticReloadPaymentSummaryItem v);
    @Property(selector = "billingAgreement")
    public native String getBillingAgreement();
    @Property(selector = "setBillingAgreement:")
    public native void setBillingAgreement(String v);
    @Property(selector = "managementURL")
    public native NSURL getManagementURL();
    @Property(selector = "setManagementURL:")
    public native void setManagementURL(NSURL v);
    @Property(selector = "tokenNotificationURL")
    public native NSURL getTokenNotificationURL();
    @Property(selector = "setTokenNotificationURL:")
    public native void setTokenNotificationURL(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPaymentDescription:automaticReloadBilling:managementURL:")
    protected native @Pointer long init(String paymentDescription, PKAutomaticReloadPaymentSummaryItem automaticReloadBilling, NSURL managementURL);
    /*</methods>*/
}
