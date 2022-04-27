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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKBarcodeEventSignatureRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKBarcodeEventSignatureRequestPtr extends Ptr<PKBarcodeEventSignatureRequest, PKBarcodeEventSignatureRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKBarcodeEventSignatureRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKBarcodeEventSignatureRequest() {}
    protected PKBarcodeEventSignatureRequest(Handle h, long handle) { super(h, handle); }
    protected PKBarcodeEventSignatureRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "deviceAccountIdentifier")
    public native String getDeviceAccountIdentifier();
    @Property(selector = "transactionIdentifier")
    public native String getTransactionIdentifier();
    @Property(selector = "barcodeIdentifier")
    public native String getBarcodeIdentifier();
    @Property(selector = "rawMerchantName")
    public native String getRawMerchantName();
    @Property(selector = "merchantName")
    public native String getMerchantName();
    @Property(selector = "transactionDate")
    public native NSDate getTransactionDate();
    @Property(selector = "currencyCode")
    public native String getCurrencyCode();
    @Property(selector = "amount")
    public native NSNumber getAmount();
    @Property(selector = "transactionStatus")
    public native String getTransactionStatus();
    @Property(selector = "partialSignature")
    public native NSData getPartialSignature();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
