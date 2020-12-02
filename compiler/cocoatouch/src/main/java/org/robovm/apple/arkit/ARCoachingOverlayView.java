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
package org.robovm.apple.arkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARCoachingOverlayView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARCoachingOverlayViewPtr extends Ptr<ARCoachingOverlayView, ARCoachingOverlayViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARCoachingOverlayView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ARCoachingOverlayView() {}
    protected ARCoachingOverlayView(Handle h, long handle) { super(h, handle); }
    protected ARCoachingOverlayView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public ARCoachingOverlayView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public ARCoachingOverlayView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native ARCoachingOverlayViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(ARCoachingOverlayViewDelegate v);
    @Property(selector = "sessionProvider")
    public native ARSessionProviding getSessionProvider();
    @Property(selector = "setSessionProvider:", strongRef = true)
    public native void setSessionProvider(ARSessionProviding v);
    @Property(selector = "session")
    public native ARSession getSession();
    @Property(selector = "setSession:")
    public native void setSession(ARSession v);
    @Property(selector = "goal")
    public native ARCoachingGoal getGoal();
    @Property(selector = "setGoal:")
    public native void setGoal(ARCoachingGoal v);
    @Property(selector = "activatesAutomatically")
    public native boolean isActivatesAutomatically();
    @Property(selector = "setActivatesAutomatically:")
    public native void setActivatesAutomatically(boolean v);
    @Property(selector = "isActive")
    public native boolean isActive();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setActive:animated:")
    public native void setActive(boolean active, boolean animated);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
