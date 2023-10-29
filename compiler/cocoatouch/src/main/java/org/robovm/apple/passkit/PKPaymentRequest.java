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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPaymentRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKPaymentRequestPtr extends Ptr<PKPaymentRequest, PKPaymentRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKPaymentRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKPaymentRequest() {}
    protected PKPaymentRequest(Handle h, long handle) { super(h, handle); }
    protected PKPaymentRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "merchantIdentifier")
    public native String getMerchantIdentifier();
    @Property(selector = "setMerchantIdentifier:")
    public native void setMerchantIdentifier(String v);
    @Property(selector = "countryCode")
    public native String getCountryCode();
    @Property(selector = "setCountryCode:")
    public native void setCountryCode(String v);
    @Property(selector = "supportedNetworks")
    public native @org.robovm.rt.bro.annotation.Marshaler(PKPaymentNetwork.AsListMarshaler.class) List<PKPaymentNetwork> getSupportedNetworks();
    @Property(selector = "setSupportedNetworks:")
    public native void setSupportedNetworks(@org.robovm.rt.bro.annotation.Marshaler(PKPaymentNetwork.AsListMarshaler.class) List<PKPaymentNetwork> v);
    @Property(selector = "merchantCapabilities")
    public native PKMerchantCapability getMerchantCapabilities();
    @Property(selector = "setMerchantCapabilities:")
    public native void setMerchantCapabilities(PKMerchantCapability v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "supportsCouponCode")
    public native boolean supportsCouponCode();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setSupportsCouponCode:")
    public native void setSupportsCouponCode(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "couponCode")
    public native String getCouponCode();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setCouponCode:")
    public native void setCouponCode(String v);
    @Property(selector = "paymentSummaryItems")
    public native NSArray<PKPaymentSummaryItem> getPaymentSummaryItems();
    @Property(selector = "setPaymentSummaryItems:")
    public native void setPaymentSummaryItems(NSArray<PKPaymentSummaryItem> v);
    @Property(selector = "currencyCode")
    public native String getCurrencyCode();
    @Property(selector = "setCurrencyCode:")
    public native void setCurrencyCode(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "requiredBillingContactFields")
    public native NSSet<NSString> getRequiredBillingContactFields();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setRequiredBillingContactFields:")
    public native void setRequiredBillingContactFields(NSSet<NSString> v);
    /**
     * @deprecated Deprecated in iOS 11.0. Use requiredBillingContactFields
     */
    @Deprecated
    @Property(selector = "requiredBillingAddressFields")
    public native PKAddressField getRequiredBillingAddressFields();
    /**
     * @deprecated Deprecated in iOS 11.0. Use requiredBillingContactFields
     */
    @Deprecated
    @Property(selector = "setRequiredBillingAddressFields:")
    public native void setRequiredBillingAddressFields(PKAddressField v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "billingContact")
    public native PKContact getBillingContact();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setBillingContact:")
    public native void setBillingContact(PKContact v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "requiredShippingContactFields")
    public native NSSet<NSString> getRequiredShippingContactFields();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setRequiredShippingContactFields:")
    public native void setRequiredShippingContactFields(NSSet<NSString> v);
    /**
     * @deprecated Deprecated in iOS 11.0. Use requiredShippingContactFields
     */
    @Deprecated
    @Property(selector = "requiredShippingAddressFields")
    public native PKAddressField getRequiredShippingAddressFields();
    /**
     * @deprecated Deprecated in iOS 11.0. Use requiredShippingContactFields
     */
    @Deprecated
    @Property(selector = "setRequiredShippingAddressFields:")
    public native void setRequiredShippingAddressFields(PKAddressField v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "shippingContact")
    public native PKContact getShippingContact();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setShippingContact:")
    public native void setShippingContact(PKContact v);
    @Property(selector = "shippingMethods")
    public native NSArray<PKShippingMethod> getShippingMethods();
    @Property(selector = "setShippingMethods:")
    public native void setShippingMethods(NSArray<PKShippingMethod> v);
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Property(selector = "shippingType")
    public native PKShippingType getShippingType();
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Property(selector = "setShippingType:")
    public native void setShippingType(PKShippingType v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "shippingContactEditingMode")
    public native PKShippingContactEditingMode getShippingContactEditingMode();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setShippingContactEditingMode:")
    public native void setShippingContactEditingMode(PKShippingContactEditingMode v);
    @Property(selector = "applicationData")
    public native NSData getApplicationData();
    @Property(selector = "setApplicationData:")
    public native void setApplicationData(NSData v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "supportedCountries")
    public native NSSet<NSString> getSupportedCountries();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSupportedCountries:")
    public native void setSupportedCountries(NSSet<NSString> v);
    /**
     * @deprecated Deprecated in iOS 9.0. ABRecordRef has been deprecated, and does not support all available address properties. You should migrate to shippingContact.
     */
    @Deprecated
    @Property(selector = "shippingAddress")
    public native ABRecord getShippingAddress();
    /**
     * @deprecated Deprecated in iOS 9.0. ABRecordRef has been deprecated, and does not support all available address properties. You should migrate to shippingContact.
     */
    @Deprecated
    @Property(selector = "setShippingAddress:", strongRef = true)
    public native void setShippingAddress(ABRecord v);
    /**
     * @deprecated Deprecated in iOS 9.0. ABRecordRef has been deprecated, and does not support all available address properties. You should migrate to billingContact.
     */
    @Deprecated
    @Property(selector = "billingAddress")
    public native ABRecord getBillingAddress();
    /**
     * @deprecated Deprecated in iOS 9.0. ABRecordRef has been deprecated, and does not support all available address properties. You should migrate to billingContact.
     */
    @Deprecated
    @Property(selector = "setBillingAddress:", strongRef = true)
    public native void setBillingAddress(ABRecord v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "multiTokenContexts")
    public native NSArray<PKPaymentTokenContext> getMultiTokenContexts();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setMultiTokenContexts:")
    public native void setMultiTokenContexts(NSArray<PKPaymentTokenContext> v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "recurringPaymentRequest")
    public native PKRecurringPaymentRequest getRecurringPaymentRequest();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setRecurringPaymentRequest:")
    public native void setRecurringPaymentRequest(PKRecurringPaymentRequest v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "automaticReloadPaymentRequest")
    public native PKAutomaticReloadPaymentRequest getAutomaticReloadPaymentRequest();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setAutomaticReloadPaymentRequest:")
    public native void setAutomaticReloadPaymentRequest(PKAutomaticReloadPaymentRequest v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "deferredPaymentRequest")
    public native PKDeferredPaymentRequest getDeferredPaymentRequest();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setDeferredPaymentRequest:")
    public native void setDeferredPaymentRequest(PKDeferredPaymentRequest v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "applePayLaterAvailability")
    public native PKApplePayLaterAvailability getApplePayLaterAvailability();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setApplePayLaterAvailability:")
    public native void setApplePayLaterAvailability(PKApplePayLaterAvailability v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "availableNetworks")
    public static native NSArray<NSString> availableNetworks();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "paymentContactInvalidErrorWithContactField:localizedDescription:")
    public static native NSError createPaymentContactInvalidError(String field, String localizedDescription);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "paymentShippingAddressInvalidErrorWithKey:localizedDescription:")
    public static native NSError createPaymentShippingAddressInvalidError(String postalAddressKey, String localizedDescription);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "paymentBillingAddressInvalidErrorWithKey:localizedDescription:")
    public static native NSError createPaymentBillingAddressInvalidError(String postalAddressKey, String localizedDescription);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "paymentShippingAddressUnserviceableErrorWithLocalizedDescription:")
    public static native NSError createPaymentShippingAddressUnserviceableError(String localizedDescription);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "paymentCouponCodeInvalidErrorWithLocalizedDescription:")
    public static native NSError createPaymentCouponCodeInvalidError(String localizedDescription);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "paymentCouponCodeExpiredErrorWithLocalizedDescription:")
    public static native NSError createPaymentCouponCodeExpiredError(String localizedDescription);
    /*</methods>*/
}
