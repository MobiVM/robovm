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
package org.robovm.apple.videosubscriberaccount;

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
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("VideoSubscriberAccount") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VSUserAccount/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VSUserAccountPtr extends Ptr<VSUserAccount, VSUserAccountPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VSUserAccount.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VSUserAccount() {}
    protected VSUserAccount(Handle h, long handle) { super(h, handle); }
    protected VSUserAccount(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAccountType:updateURL:")
    public VSUserAccount(VSUserAccountType accountType, NSURL url) { super((SkipInit) null); initObject(init(accountType, url)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "updateURL")
    public native NSURL getUpdateURL();
    @Property(selector = "setUpdateURL:")
    public native void setUpdateURL(NSURL v);
    @Property(selector = "requiresSystemTrust")
    public native boolean requiresSystemTrust();
    @Property(selector = "setRequiresSystemTrust:")
    public native void setRequiresSystemTrust(boolean v);
    @Property(selector = "accountProviderIdentifier")
    public native String getAccountProviderIdentifier();
    @Property(selector = "setAccountProviderIdentifier:")
    public native void setAccountProviderIdentifier(String v);
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    @Property(selector = "accountType")
    public native VSUserAccountType getAccountType();
    @Property(selector = "setAccountType:")
    public native void setAccountType(VSUserAccountType v);
    @Property(selector = "isSignedOut")
    public native boolean isSignedOut();
    @Property(selector = "setSignedOut:")
    public native void setSignedOut(boolean v);
    @Property(selector = "subscriptionBillingCycleEndDate")
    public native NSDate getSubscriptionBillingCycleEndDate();
    @Property(selector = "setSubscriptionBillingCycleEndDate:")
    public native void setSubscriptionBillingCycleEndDate(NSDate v);
    @Property(selector = "tierIdentifiers")
    public native NSArray<NSString> getTierIdentifiers();
    @Property(selector = "setTierIdentifiers:")
    public native void setTierIdentifiers(NSArray<NSString> v);
    @Property(selector = "billingIdentifier")
    public native String getBillingIdentifier();
    @Property(selector = "setBillingIdentifier:")
    public native void setBillingIdentifier(String v);
    @Property(selector = "authenticationData")
    public native String getAuthenticationData();
    @Property(selector = "setAuthenticationData:")
    public native void setAuthenticationData(String v);
    @Property(selector = "isFromCurrentDevice")
    public native boolean isFromCurrentDevice();
    @Property(selector = "deviceCategory")
    public native VSOriginatingDeviceCategory getDeviceCategory();
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Property(selector = "appleSubscription")
    public native VSAppleSubscription getAppleSubscription();
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Property(selector = "setAppleSubscription:")
    public native void setAppleSubscription(VSAppleSubscription v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAccountType:updateURL:")
    protected native @Pointer long init(VSUserAccountType accountType, NSURL url);
    /*</methods>*/
}
