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
package org.robovm.apple.coretelephony;

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
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreTelephony") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTTelephonyNetworkInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObject observeRadioAccessTechnologyDidChange(CTTelephonyNetworkInfo object, final VoidBlock1<CTTelephonyNetworkInfo> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(RadioAccessTechnologyDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((CTTelephonyNetworkInfo) a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class CTTelephonyNetworkInfoPtr extends Ptr<CTTelephonyNetworkInfo, CTTelephonyNetworkInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CTTelephonyNetworkInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CTTelephonyNetworkInfo() {}
    protected CTTelephonyNetworkInfo(Handle h, long handle) { super(h, handle); }
    protected CTTelephonyNetworkInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "dataServiceIdentifier")
    public native String getDataServiceIdentifier();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "delegate")
    public native CTTelephonyNetworkInfoDelegate getDelegate();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CTTelephonyNetworkInfoDelegate v);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 16.0. Deprecated with no replacement
     */
    @Deprecated
    @Property(selector = "serviceSubscriberCellularProviders")
    public native NSDictionary<NSString, CTCarrier> getServiceSubscriberCellularProviders();
    /**
     * @deprecated Deprecated in iOS 12.0. Use serviceSubscriberCellularProviders
     */
    @Deprecated
    @Property(selector = "subscriberCellularProvider")
    public native CTCarrier getSubscriberCellularProvider();
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 16.0. Deprecated with no replacement
     */
    @Deprecated
    @Property(selector = "serviceSubscriberCellularProvidersDidUpdateNotifier")
    public native @Block VoidBlock1<NSString> getServiceSubscriberCellularProvidersDidUpdateNotifier();
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 16.0. Deprecated with no replacement
     */
    @Deprecated
    @Property(selector = "setServiceSubscriberCellularProvidersDidUpdateNotifier:")
    public native void setServiceSubscriberCellularProvidersDidUpdateNotifier(@Block VoidBlock1<NSString> v);
    /**
     * @deprecated Deprecated in iOS 12.0. Use serviceSubscriberCellularProvidersDidUpdateNotifier
     */
    @Deprecated
    @Property(selector = "subscriberCellularProviderDidUpdateNotifier")
    public native @Block VoidBlock1<CTCarrier> getSubscriberCellularProviderDidUpdateNotifier();
    /**
     * @deprecated Deprecated in iOS 12.0. Use serviceSubscriberCellularProvidersDidUpdateNotifier
     */
    @Deprecated
    @Property(selector = "setSubscriberCellularProviderDidUpdateNotifier:")
    public native void setSubscriberCellularProviderDidUpdateNotifier(@Block VoidBlock1<CTCarrier> v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "serviceCurrentRadioAccessTechnology")
    public native NSDictionary<NSString, NSString> getServiceCurrentRadioAccessTechnology();
    /**
     * @deprecated Deprecated in iOS 12.0. Use serviceCurrentRadioAccessTechnology
     */
    @Deprecated
    @Property(selector = "currentRadioAccessTechnology")
    public native CTRadioAccessTechnology getCurrentRadioAccessTechnology();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="CTServiceRadioAccessTechnologyDidChangeNotification", optional=true)
    public static native NSString ServiceRadioAccessTechnologyDidChangeNotification();
    /**
     * @deprecated Deprecated in iOS 12.0. Use CTServiceRadioAccessTechnologyDidChangeNotification
     */
    @Deprecated
    @GlobalValue(symbol="CTRadioAccessTechnologyDidChangeNotification", optional=true)
    public static native NSString RadioAccessTechnologyDidChangeNotification();
    
    
    /*</methods>*/
}
