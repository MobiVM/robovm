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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPaymentRequestShippingMethodUpdate/*</name>*/ 
    extends /*<extends>*/PKPaymentRequestUpdate/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKPaymentRequestShippingMethodUpdatePtr extends Ptr<PKPaymentRequestShippingMethodUpdate, PKPaymentRequestShippingMethodUpdatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKPaymentRequestShippingMethodUpdate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKPaymentRequestShippingMethodUpdate() {}
    protected PKPaymentRequestShippingMethodUpdate(Handle h, long handle) { super(h, handle); }
    protected PKPaymentRequestShippingMethodUpdate(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPaymentSummaryItems:")
    public PKPaymentRequestShippingMethodUpdate(NSArray<PKPaymentSummaryItem> paymentSummaryItems) { super(paymentSummaryItems); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
