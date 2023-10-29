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
 * @since Available in iOS 17.0 and later.
 */
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
    @Method(selector = "initWithMerchantIdentifier:currencyCode:regionCode:supportedNetworks:merchantCapabilities:summaryItems:")
    public PKDisbursementRequest(String merchantIdentifier, String currencyCode, String regionCode, NSArray<NSString> supportedNetworks, PKMerchantCapability merchantCapabilities, NSArray<PKPaymentSummaryItem> summaryItems) { super((SkipInit) null); initObject(init(merchantIdentifier, currencyCode, regionCode, supportedNetworks, merchantCapabilities, summaryItems)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "merchantIdentifier")
    public native String getMerchantIdentifier();
    @Property(selector = "setMerchantIdentifier:")
    public native void setMerchantIdentifier(String v);
    @Property(selector = "regionCode")
    public native String getRegionCode();
    @Property(selector = "setRegionCode:")
    public native void setRegionCode(String v);
    @Property(selector = "supportedNetworks")
    public native NSArray<NSString> getSupportedNetworks();
    @Property(selector = "setSupportedNetworks:")
    public native void setSupportedNetworks(NSArray<NSString> v);
    @Property(selector = "merchantCapabilities")
    public native PKMerchantCapability getMerchantCapabilities();
    @Property(selector = "setMerchantCapabilities:")
    public native void setMerchantCapabilities(PKMerchantCapability v);
    @Property(selector = "summaryItems")
    public native NSArray<PKPaymentSummaryItem> getSummaryItems();
    @Property(selector = "setSummaryItems:")
    public native void setSummaryItems(NSArray<PKPaymentSummaryItem> v);
    @Property(selector = "currencyCode")
    public native String getCurrencyCode();
    @Property(selector = "setCurrencyCode:")
    public native void setCurrencyCode(String v);
    @Property(selector = "requiredRecipientContactFields")
    public native NSArray<NSString> getRequiredRecipientContactFields();
    @Property(selector = "setRequiredRecipientContactFields:")
    public native void setRequiredRecipientContactFields(NSArray<NSString> v);
    @Property(selector = "recipientContact")
    public native PKContact getRecipientContact();
    @Property(selector = "setRecipientContact:")
    public native void setRecipientContact(PKContact v);
    @Property(selector = "supportedRegions")
    public native NSArray<NSString> getSupportedRegions();
    @Property(selector = "setSupportedRegions:")
    public native void setSupportedRegions(NSArray<NSString> v);
    @Property(selector = "applicationData")
    public native NSData getApplicationData();
    @Property(selector = "setApplicationData:")
    public native void setApplicationData(NSData v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMerchantIdentifier:currencyCode:regionCode:supportedNetworks:merchantCapabilities:summaryItems:")
    protected native @Pointer long init(String merchantIdentifier, String currencyCode, String regionCode, NSArray<NSString> supportedNetworks, PKMerchantCapability merchantCapabilities, NSArray<PKPaymentSummaryItem> summaryItems);
    @Method(selector = "disbursementContactInvalidErrorWithContactField:localizedDescription:")
    public static native NSError createDisbursementContactInvalidError(String field, String localizedDescription);
    @Method(selector = "disbursementCardUnsupportedError")
    public static native NSError disbursementCardUnsupportedError();
    /*</methods>*/
}
