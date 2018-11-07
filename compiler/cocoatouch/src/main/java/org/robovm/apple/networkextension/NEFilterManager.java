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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEFilterManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEFilterManagerPtr extends Ptr<NEFilterManager, NEFilterManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEFilterManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEFilterManager() {}
    protected NEFilterManager(Handle h, long handle) { super(h, handle); }
    protected NEFilterManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setLocalizedDescription:")
    public native void setLocalizedDescription(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "providerConfiguration")
    public native NEFilterProviderConfiguration getProviderConfiguration();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setProviderConfiguration:")
    public native void setProviderConfiguration(NEFilterProviderConfiguration v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="NEFilterConfigurationDidChangeNotification", optional=true)
    public static native String ConfigurationDidChangeNotification();
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "loadFromPreferencesWithCompletionHandler:")
    public native void loadFromPreferences(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "removeFromPreferencesWithCompletionHandler:")
    public native void removeFromPreferences(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "saveToPreferencesWithCompletionHandler:")
    public native void saveToPreferences(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "sharedManager")
    public static native NEFilterManager sharedManager();
    /*</methods>*/
}
