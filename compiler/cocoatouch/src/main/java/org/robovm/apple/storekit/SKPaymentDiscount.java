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
 * @since Available in iOS 12.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKPaymentDiscount/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKPaymentDiscountPtr extends Ptr<SKPaymentDiscount, SKPaymentDiscountPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKPaymentDiscount.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKPaymentDiscount() {}
    protected SKPaymentDiscount(Handle h, long handle) { super(h, handle); }
    protected SKPaymentDiscount(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:keyIdentifier:nonce:signature:timestamp:")
    public SKPaymentDiscount(String identifier, String keyIdentifier, NSUUID nonce, String signature, NSNumber timestamp) { super((SkipInit) null); initObject(init(identifier, keyIdentifier, nonce, signature, timestamp)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "keyIdentifier")
    public native String getKeyIdentifier();
    @Property(selector = "nonce")
    public native NSUUID getNonce();
    @Property(selector = "signature")
    public native String getSignature();
    @Property(selector = "timestamp")
    public native NSNumber getTimestamp();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:keyIdentifier:nonce:signature:timestamp:")
    protected native @Pointer long init(String identifier, String keyIdentifier, NSUUID nonce, String signature, NSNumber timestamp);
    /*</methods>*/
}
