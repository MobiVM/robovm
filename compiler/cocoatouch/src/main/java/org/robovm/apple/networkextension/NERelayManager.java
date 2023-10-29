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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NERelayManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NERelayManagerPtr extends Ptr<NERelayManager, NERelayManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NERelayManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NERelayManager() {}
    protected NERelayManager(Handle h, long handle) { super(h, handle); }
    protected NERelayManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "setLocalizedDescription:")
    public native void setLocalizedDescription(String v);
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "relays")
    public native NSArray<NERelay> getRelays();
    @Property(selector = "setRelays:")
    public native void setRelays(NSArray<NERelay> v);
    @Property(selector = "matchDomains")
    public native NSArray<NSString> getMatchDomains();
    @Property(selector = "setMatchDomains:")
    public native void setMatchDomains(NSArray<NSString> v);
    @Property(selector = "excludedDomains")
    public native NSArray<NSString> getExcludedDomains();
    @Property(selector = "setExcludedDomains:")
    public native void setExcludedDomains(NSArray<NSString> v);
    @Property(selector = "onDemandRules")
    public native NSArray<NEOnDemandRule> getOnDemandRules();
    @Property(selector = "setOnDemandRules:")
    public native void setOnDemandRules(NSArray<NEOnDemandRule> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadFromPreferencesWithCompletionHandler:")
    public native void loadFromPreferences(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "removeFromPreferencesWithCompletionHandler:")
    public native void removeFromPreferences(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "saveToPreferencesWithCompletionHandler:")
    public native void saveToPreferences(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "sharedManager")
    public static native NERelayManager sharedManager();
    @Method(selector = "loadAllManagersFromPreferencesWithCompletionHandler:")
    public static native void loadAllManagersFromPreferences(@Block VoidBlock2<NSArray<NERelayManager>, NSError> completionHandler);
    /*</methods>*/
}
