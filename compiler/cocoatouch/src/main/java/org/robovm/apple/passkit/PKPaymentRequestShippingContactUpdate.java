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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPaymentRequestShippingContactUpdate/*</name>*/ 
    extends /*<extends>*/PKPaymentRequestUpdate/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKPaymentRequestShippingContactUpdatePtr extends Ptr<PKPaymentRequestShippingContactUpdate, PKPaymentRequestShippingContactUpdatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKPaymentRequestShippingContactUpdate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKPaymentRequestShippingContactUpdate() {}
    protected PKPaymentRequestShippingContactUpdate(Handle h, long handle) { super(h, handle); }
    protected PKPaymentRequestShippingContactUpdate(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithErrors:paymentSummaryItems:shippingMethods:")
    public PKPaymentRequestShippingContactUpdate(NSArray<NSError> errors, NSArray<PKPaymentSummaryItem> paymentSummaryItems, NSArray<PKShippingMethod> shippingMethods) { super((SkipInit) null); initObject(init(errors, paymentSummaryItems, shippingMethods)); }
    @Method(selector = "initWithPaymentSummaryItems:")
    public PKPaymentRequestShippingContactUpdate(NSArray<PKPaymentSummaryItem> paymentSummaryItems) { super(paymentSummaryItems); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shippingMethods")
    public native NSArray<PKShippingMethod> getShippingMethods();
    @Property(selector = "setShippingMethods:")
    public native void setShippingMethods(NSArray<PKShippingMethod> v);
    @Property(selector = "errors")
    public native NSArray<NSError> getErrors();
    @Property(selector = "setErrors:")
    public native void setErrors(NSArray<NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithErrors:paymentSummaryItems:shippingMethods:")
    protected native @Pointer long init(NSArray<NSError> errors, NSArray<PKPaymentSummaryItem> paymentSummaryItems, NSArray<PKShippingMethod> shippingMethods);
    /*</methods>*/
}
