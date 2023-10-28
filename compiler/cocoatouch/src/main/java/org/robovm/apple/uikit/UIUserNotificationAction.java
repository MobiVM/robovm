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
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's UNNotificationAction
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIUserNotificationAction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIUserNotificationActionPtr extends Ptr<UIUserNotificationAction, UIUserNotificationActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIUserNotificationAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIUserNotificationAction() {}
    protected UIUserNotificationAction(Handle h, long handle) { super(h, handle); }
    protected UIUserNotificationAction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIUserNotificationAction(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "title")
    public native String getTitle();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "behavior")
    public native UIUserNotificationActionBehavior getBehavior();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "parameters")
    public native NSDictionary<?, ?> getParameters();
    @Property(selector = "activationMode")
    public native UIUserNotificationActivationMode getActivationMode();
    @Property(selector = "isAuthenticationRequired")
    public native boolean isAuthenticationRequired();
    @Property(selector = "isDestructive")
    public native boolean isDestructive();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    public void setIdentifier(String v) {
        throw new UnsupportedOperationException("UIUserNotificationAction is immutable");
    }

    public void setTitle(String v) {
        throw new UnsupportedOperationException("UIUserNotificationAction is immutable");
    }

    public void setBehavior(UIUserNotificationActionBehavior v) {
        throw new UnsupportedOperationException("UIUserNotificationAction is immutable");
    }

    public void setParameters(NSDictionary<?, ?> v) {
        throw new UnsupportedOperationException("UIUserNotificationAction is immutable");
    }

    public void setActivationMode(UIUserNotificationActivationMode v) {
        throw new UnsupportedOperationException("UIUserNotificationAction is immutable");
    }

    public void setAuthenticationRequired(boolean v) {
        throw new UnsupportedOperationException("UIUserNotificationAction is immutable");
    }

    public void setDestructive(boolean v) {
        throw new UnsupportedOperationException("UIUserNotificationAction is immutable");
    }
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
