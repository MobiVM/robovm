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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPaymentTokenContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKPaymentTokenContextPtr extends Ptr<PKPaymentTokenContext, PKPaymentTokenContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKPaymentTokenContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKPaymentTokenContext() {}
    protected PKPaymentTokenContext(Handle h, long handle) { super(h, handle); }
    protected PKPaymentTokenContext(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMerchantIdentifier:externalIdentifier:merchantName:merchantDomain:amount:")
    public PKPaymentTokenContext(String merchantIdentifier, String externalIdentifier, String merchantName, String merchantDomain, NSDecimalNumber amount) { super((SkipInit) null); initObject(init(merchantIdentifier, externalIdentifier, merchantName, merchantDomain, amount)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "merchantIdentifier")
    public native String getMerchantIdentifier();
    @Property(selector = "setMerchantIdentifier:")
    public native void setMerchantIdentifier(String v);
    @Property(selector = "externalIdentifier")
    public native String getExternalIdentifier();
    @Property(selector = "setExternalIdentifier:")
    public native void setExternalIdentifier(String v);
    @Property(selector = "merchantName")
    public native String getMerchantName();
    @Property(selector = "setMerchantName:")
    public native void setMerchantName(String v);
    @Property(selector = "merchantDomain")
    public native String getMerchantDomain();
    @Property(selector = "setMerchantDomain:")
    public native void setMerchantDomain(String v);
    @Property(selector = "amount")
    public native NSDecimalNumber getAmount();
    @Property(selector = "setAmount:")
    public native void setAmount(NSDecimalNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMerchantIdentifier:externalIdentifier:merchantName:merchantDomain:amount:")
    protected native @Pointer long init(String merchantIdentifier, String externalIdentifier, String merchantName, String merchantDomain, NSDecimalNumber amount);
    /*</methods>*/
}
