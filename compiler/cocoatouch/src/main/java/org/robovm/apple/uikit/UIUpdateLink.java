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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIUpdateLink/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIUpdateLinkPtr extends Ptr<UIUpdateLink, UIUpdateLinkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIUpdateLink.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIUpdateLink() {}
    protected UIUpdateLink(Handle h, long handle) { super(h, handle); }
    protected UIUpdateLink(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "requiresContinuousUpdates")
    public native boolean requiresContinuousUpdates();
    @Property(selector = "setRequiresContinuousUpdates:")
    public native void setRequiresContinuousUpdates(boolean v);
    @Property(selector = "wantsLowLatencyEventDispatch")
    public native boolean wantsLowLatencyEventDispatch();
    @Property(selector = "setWantsLowLatencyEventDispatch:")
    public native void setWantsLowLatencyEventDispatch(boolean v);
    @Property(selector = "wantsImmediatePresentation")
    public native boolean wantsImmediatePresentation();
    @Property(selector = "setWantsImmediatePresentation:")
    public native void setWantsImmediatePresentation(boolean v);
    @Property(selector = "preferredFrameRateRange")
    public native @ByVal CAFrameRateRange getPreferredFrameRateRange();
    @Property(selector = "setPreferredFrameRateRange:")
    public native void setPreferredFrameRateRange(@ByVal CAFrameRateRange v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addActionToPhase:handler:")
    public native void addAction(UIUpdateActionPhase phase, @Block VoidBlock2<UIUpdateLink, UIUpdateInfo> handler);
    @Method(selector = "addActionToPhase:target:selector:")
    public native void addAction(UIUpdateActionPhase phase, NSObject target, Selector selector);
    @Method(selector = "currentUpdateInfo")
    public native UIUpdateInfo currentUpdateInfo();
    @Method(selector = "updateLinkForWindowScene:")
    public static native UIUpdateLink updateLinkForWindowScene(UIWindowScene windowScene);
    @Method(selector = "updateLinkForView:")
    public static native UIUpdateLink updateLinkForView(UIView view);
    @Method(selector = "addActionWithHandler:")
    public native void addAction(@Block VoidBlock2<UIUpdateLink, UIUpdateInfo> handler);
    @Method(selector = "addActionWithTarget:selector:")
    public native void addAction(NSObject target, Selector selector);
    @Method(selector = "updateLinkForWindowScene:actionHandler:")
    public static native UIUpdateLink updateLink(UIWindowScene windowScene, @Block VoidBlock2<UIUpdateLink, UIUpdateInfo> handler);
    @Method(selector = "updateLinkForWindowScene:actionTarget:selector:")
    public static native UIUpdateLink updateLink(UIWindowScene windowScene, NSObject target, Selector selector);
    @Method(selector = "updateLinkForView:actionHandler:")
    public static native UIUpdateLink updateLink(UIView view, @Block VoidBlock2<UIUpdateLink, UIUpdateInfo> handler);
    @Method(selector = "updateLinkForView:actionTarget:selector:")
    public static native UIUpdateLink updateLink(UIView view, NSObject target, Selector selector);
    /*</methods>*/
}
