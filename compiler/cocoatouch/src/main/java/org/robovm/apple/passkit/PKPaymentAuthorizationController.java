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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPaymentAuthorizationController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKPaymentAuthorizationControllerPtr extends Ptr<PKPaymentAuthorizationController, PKPaymentAuthorizationControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKPaymentAuthorizationController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKPaymentAuthorizationController() {}
    protected PKPaymentAuthorizationController(Handle h, long handle) { super(h, handle); }
    protected PKPaymentAuthorizationController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPaymentRequest:")
    public PKPaymentAuthorizationController(PKPaymentRequest request) { super((SkipInit) null); initObject(init(request)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native PKPaymentAuthorizationControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PKPaymentAuthorizationControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPaymentRequest:")
    protected native @Pointer long init(PKPaymentRequest request);
    @Method(selector = "presentWithCompletion:")
    public native void present(@Block VoidBooleanBlock completion);
    @Method(selector = "dismissWithCompletion:")
    public native void dismiss(@Block Runnable completion);
    @Method(selector = "canMakePayments")
    public static native boolean canMakePayments();
    @Method(selector = "canMakePaymentsUsingNetworks:")
    public static native boolean canMakePaymentsUsingNetworks(NSArray<?> supportedNetworks);
    @Method(selector = "canMakePaymentsUsingNetworks:capabilities:")
    public static native boolean canMakePayments(NSArray<?> supportedNetworks, PKMerchantCapability capabilties);
    /*</methods>*/
}
