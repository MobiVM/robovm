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
/**
 * @since Available in iOS 14.5 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKAdImpression/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKAdImpressionPtr extends Ptr<SKAdImpression, SKAdImpressionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKAdImpression.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKAdImpression() {}
    protected SKAdImpression(Handle h, long handle) { super(h, handle); }
    protected SKAdImpression(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceAppStoreItemIdentifier")
    public native NSNumber getSourceAppStoreItemIdentifier();
    @Property(selector = "setSourceAppStoreItemIdentifier:")
    public native void setSourceAppStoreItemIdentifier(NSNumber v);
    @Property(selector = "advertisedAppStoreItemIdentifier")
    public native NSNumber getAdvertisedAppStoreItemIdentifier();
    @Property(selector = "setAdvertisedAppStoreItemIdentifier:")
    public native void setAdvertisedAppStoreItemIdentifier(NSNumber v);
    @Property(selector = "adNetworkIdentifier")
    public native String getAdNetworkIdentifier();
    @Property(selector = "setAdNetworkIdentifier:")
    public native void setAdNetworkIdentifier(String v);
    @Property(selector = "adCampaignIdentifier")
    public native NSNumber getAdCampaignIdentifier();
    @Property(selector = "setAdCampaignIdentifier:")
    public native void setAdCampaignIdentifier(NSNumber v);
    @Property(selector = "adImpressionIdentifier")
    public native String getAdImpressionIdentifier();
    @Property(selector = "setAdImpressionIdentifier:")
    public native void setAdImpressionIdentifier(String v);
    @Property(selector = "adType")
    public native String getAdType();
    @Property(selector = "setAdType:")
    public native void setAdType(String v);
    @Property(selector = "adDescription")
    public native String getAdDescription();
    @Property(selector = "setAdDescription:")
    public native void setAdDescription(String v);
    @Property(selector = "adPurchaserName")
    public native String getAdPurchaserName();
    @Property(selector = "setAdPurchaserName:")
    public native void setAdPurchaserName(String v);
    @Property(selector = "timestamp")
    public native NSNumber getTimestamp();
    @Property(selector = "setTimestamp:")
    public native void setTimestamp(NSNumber v);
    @Property(selector = "signature")
    public native String getSignature();
    @Property(selector = "setSignature:")
    public native void setSignature(String v);
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "setVersion:")
    public native void setVersion(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
