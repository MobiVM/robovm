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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's UNNotificationAction
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIMutableUserNotificationAction/*</name>*/ 
    extends /*<extends>*/UIUserNotificationAction/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIMutableUserNotificationActionPtr extends Ptr<UIMutableUserNotificationAction, UIMutableUserNotificationActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIMutableUserNotificationAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIMutableUserNotificationAction() {}
    protected UIMutableUserNotificationAction(Handle h, long handle) { super(h, handle); }
    protected UIMutableUserNotificationAction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIMutableUserNotificationAction(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "behavior")
    public native UIUserNotificationActionBehavior getBehavior();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setBehavior:")
    public native void setBehavior(UIUserNotificationActionBehavior v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "parameters")
    public native NSDictionary<?, ?> getParameters();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setParameters:")
    public native void setParameters(NSDictionary<?, ?> v);
    @Property(selector = "activationMode")
    public native UIUserNotificationActivationMode getActivationMode();
    @Property(selector = "setActivationMode:")
    public native void setActivationMode(UIUserNotificationActivationMode v);
    @Property(selector = "isAuthenticationRequired")
    public native boolean isAuthenticationRequired();
    @Property(selector = "setAuthenticationRequired:")
    public native void setAuthenticationRequired(boolean v);
    @Property(selector = "isDestructive")
    public native boolean isDestructive();
    @Property(selector = "setDestructive:")
    public native void setDestructive(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
