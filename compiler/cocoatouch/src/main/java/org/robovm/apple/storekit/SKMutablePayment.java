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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKMutablePayment/*</name>*/ 
    extends /*<extends>*/SKPayment/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKMutablePaymentPtr extends Ptr<SKMutablePayment, SKMutablePaymentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKMutablePayment.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKMutablePayment() {}
    protected SKMutablePayment(Handle h, long handle) { super(h, handle); }
    protected SKMutablePayment(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /**
     * @since Available in iOS 3.0 and later.
     */
    public SKMutablePayment(SKProduct product) {
        super(create(product));
        retain(getHandle());
    }
    @Method(selector = "paymentWithProduct:")
    protected static native @Pointer long create(SKProduct product);
    /*<properties>*/
    @Property(selector = "applicationUsername")
    public native String getApplicationUsername();
    @Property(selector = "setApplicationUsername:")
    public native void setApplicationUsername(String v);
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "paymentDiscount")
    public native SKPaymentDiscount getPaymentDiscount();
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "setPaymentDiscount:")
    public native void setPaymentDiscount(SKPaymentDiscount v);
    @Property(selector = "productIdentifier")
    public native String getProductIdentifier();
    @Property(selector = "setProductIdentifier:")
    public native void setProductIdentifier(String v);
    @Property(selector = "quantity")
    public native @MachineSizedSInt long getQuantity();
    @Property(selector = "setQuantity:")
    public native void setQuantity(@MachineSizedSInt long v);
    @Property(selector = "requestData")
    public native NSData getRequestData();
    @Property(selector = "setRequestData:")
    public native void setRequestData(NSData v);
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Property(selector = "simulatesAskToBuyInSandbox")
    public native boolean simulatesAskToBuyInSandbox();
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Property(selector = "setSimulatesAskToBuyInSandbox:")
    public native void setSimulatesAskToBuyInSandbox(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
