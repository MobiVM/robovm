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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("VideoSubscriberAccount") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VSAccountMetadataRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VSAccountMetadataRequestPtr extends Ptr<VSAccountMetadataRequest, VSAccountMetadataRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VSAccountMetadataRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VSAccountMetadataRequest() {}
    protected VSAccountMetadataRequest(Handle h, long handle) { super(h, handle); }
    protected VSAccountMetadataRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "channelIdentifier")
    public native String getChannelIdentifier();
    @Property(selector = "setChannelIdentifier:")
    public native void setChannelIdentifier(String v);
    @Property(selector = "supportedAccountProviderIdentifiers")
    public native NSArray<NSString> getSupportedAccountProviderIdentifiers();
    @Property(selector = "setSupportedAccountProviderIdentifiers:")
    public native void setSupportedAccountProviderIdentifiers(NSArray<NSString> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "featuredAccountProviderIdentifiers")
    public native NSArray<NSString> getFeaturedAccountProviderIdentifiers();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setFeaturedAccountProviderIdentifiers:")
    public native void setFeaturedAccountProviderIdentifiers(NSArray<NSString> v);
    @Property(selector = "verificationToken")
    public native String getVerificationToken();
    @Property(selector = "setVerificationToken:")
    public native void setVerificationToken(String v);
    @Property(selector = "includeAccountProviderIdentifier")
    public native boolean isIncludeAccountProviderIdentifier();
    @Property(selector = "setIncludeAccountProviderIdentifier:")
    public native void setIncludeAccountProviderIdentifier(boolean v);
    @Property(selector = "includeAuthenticationExpirationDate")
    public native boolean isIncludeAuthenticationExpirationDate();
    @Property(selector = "setIncludeAuthenticationExpirationDate:")
    public native void setIncludeAuthenticationExpirationDate(boolean v);
    @Property(selector = "localizedVideoTitle")
    public native String getLocalizedVideoTitle();
    @Property(selector = "setLocalizedVideoTitle:")
    public native void setLocalizedVideoTitle(String v);
    @Property(selector = "isInterruptionAllowed")
    public native boolean isInterruptionAllowed();
    @Property(selector = "setInterruptionAllowed:")
    public native void setInterruptionAllowed(boolean v);
    @Property(selector = "forceAuthentication")
    public native boolean isForceAuthentication();
    @Property(selector = "setForceAuthentication:")
    public native void setForceAuthentication(boolean v);
    @Property(selector = "attributeNames")
    public native NSArray<NSString> getAttributeNames();
    @Property(selector = "setAttributeNames:")
    public native void setAttributeNames(NSArray<NSString> v);
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Property(selector = "supportedAuthenticationSchemes")
    public native NSArray<NSString> getSupportedAuthenticationSchemes();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Property(selector = "setSupportedAuthenticationSchemes:")
    public native void setSupportedAuthenticationSchemes(NSArray<NSString> v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accountProviderAuthenticationToken")
    public native String getAccountProviderAuthenticationToken();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAccountProviderAuthenticationToken:")
    public native void setAccountProviderAuthenticationToken(String v);
    /**
     * @since Available in iOS 14.2 and later.
     */
    @Property(selector = "applicationAccountProviders")
    public native NSArray<VSAccountApplicationProvider> getApplicationAccountProviders();
    /**
     * @since Available in iOS 14.2 and later.
     */
    @Property(selector = "setApplicationAccountProviders:")
    public native void setApplicationAccountProviders(NSArray<VSAccountApplicationProvider> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
