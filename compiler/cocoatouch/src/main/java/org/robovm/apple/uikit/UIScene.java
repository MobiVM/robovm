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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIScene/*</name>*/ 
    extends /*<extends>*/UIResponder/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIScenePtr extends Ptr<UIScene, UIScenePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIScene.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIScene() {}
    protected UIScene(Handle h, long handle) { super(h, handle); }
    protected UIScene(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSession:connectionOptions:")
    public UIScene(UISceneSession session, UISceneConnectionOptions connectionOptions) { super((SkipInit) null); initObject(init(session, connectionOptions)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "session")
    public native UISceneSession getSession();
    @Property(selector = "delegate")
    public native UISceneDelegate getDelegate();
    @Property(selector = "setDelegate:")
    public native void setDelegate(UISceneDelegate v);
    @Property(selector = "activationState")
    public native UISceneActivationState getActivationState();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "subtitle")
    public native String getSubtitle();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setSubtitle:")
    public native void setSubtitle(String v);
    @Property(selector = "activationConditions")
    public native UISceneActivationConditions getActivationConditions();
    @Property(selector = "setActivationConditions:")
    public native void setActivationConditions(UISceneActivationConditions v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "pointerLockState")
    public native UIPointerLockState getPointerLockState();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSession:connectionOptions:")
    protected native @Pointer long init(UISceneSession session, UISceneConnectionOptions connectionOptions);
    @Method(selector = "openURL:options:completionHandler:")
    public native void openURL(NSURL url, UISceneOpenExternalURLOptions options, @Block VoidBooleanBlock completion);
    @Method(selector = "extendStateRestoration")
    public native void extendStateRestoration();
    @Method(selector = "completeStateRestoration")
    public native void completeStateRestoration();
    @Method(selector = "getDefaultAudioSessionWithCompletionHandler:")
    public native void getDefaultAudioSession(@Block VoidBlock1<org.robovm.apple.avfoundation.AVAudioSession> handler);
    /*</methods>*/
}
