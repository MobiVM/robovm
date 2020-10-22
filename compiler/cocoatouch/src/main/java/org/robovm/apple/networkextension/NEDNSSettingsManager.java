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
package org.robovm.apple.networkextension;

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
import org.robovm.apple.security.*;
import org.robovm.apple.network.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEDNSSettingsManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEDNSSettingsManagerPtr extends Ptr<NEDNSSettingsManager, NEDNSSettingsManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEDNSSettingsManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEDNSSettingsManager() {}
    protected NEDNSSettingsManager(Handle h, long handle) { super(h, handle); }
    protected NEDNSSettingsManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setLocalizedDescription:")
    public native void setLocalizedDescription(String v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "dnsSettings")
    public native NEDNSSettings getDnsSettings();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setDnsSettings:")
    public native void setDnsSettings(NEDNSSettings v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "onDemandRules")
    public native NSArray<NEOnDemandRule> getOnDemandRules();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setOnDemandRules:")
    public native void setOnDemandRules(NSArray<NEOnDemandRule> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("NetworkExtension")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="NEDNSSettingsConfigurationDidChangeNotification", optional=true)
        public static native String DidChangeNotification();
    }
    
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "loadFromPreferencesWithCompletionHandler:")
    public native void loadFromPreferences(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "removeFromPreferencesWithCompletionHandler:")
    public native void removeFromPreferences(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "saveToPreferencesWithCompletionHandler:")
    public native void saveToPreferences(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "sharedManager")
    public static native NEDNSSettingsManager sharedManager();
    /*</methods>*/
}
