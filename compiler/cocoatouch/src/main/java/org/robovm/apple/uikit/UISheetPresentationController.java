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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISheetPresentationController/*</name>*/ 
    extends /*<extends>*/UIPresentationController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UISheetPresentationControllerPtr extends Ptr<UISheetPresentationController, UISheetPresentationControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISheetPresentationController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UISheetPresentationController() {}
    protected UISheetPresentationController(Handle h, long handle) { super(h, handle); }
    protected UISheetPresentationController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPresentedViewController:presentingViewController:")
    public UISheetPresentationController(UIViewController presentedViewController, UIViewController presentingViewController) { super(presentedViewController, presentingViewController); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native UISheetPresentationControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UISheetPresentationControllerDelegate v);
    @Property(selector = "sourceView")
    public native UIView getSourceView();
    @Property(selector = "setSourceView:")
    public native void setSourceView(UIView v);
    @Property(selector = "prefersEdgeAttachedInCompactHeight")
    public native boolean prefersEdgeAttachedInCompactHeight();
    @Property(selector = "setPrefersEdgeAttachedInCompactHeight:")
    public native void setPrefersEdgeAttachedInCompactHeight(boolean v);
    @Property(selector = "widthFollowsPreferredContentSizeWhenEdgeAttached")
    public native boolean isWidthFollowsPreferredContentSizeWhenEdgeAttached();
    @Property(selector = "setWidthFollowsPreferredContentSizeWhenEdgeAttached:")
    public native void setWidthFollowsPreferredContentSizeWhenEdgeAttached(boolean v);
    @Property(selector = "prefersGrabberVisible")
    public native boolean prefersGrabberVisible();
    @Property(selector = "setPrefersGrabberVisible:")
    public native void setPrefersGrabberVisible(boolean v);
    @Property(selector = "preferredCornerRadius")
    public native @MachineSizedFloat double getPreferredCornerRadius();
    @Property(selector = "setPreferredCornerRadius:")
    public native void setPreferredCornerRadius(@MachineSizedFloat double v);
    @Property(selector = "detents")
    public native NSArray<UISheetPresentationControllerDetent> getDetents();
    @Property(selector = "setDetents:")
    public native void setDetents(NSArray<UISheetPresentationControllerDetent> v);
    @Property(selector = "selectedDetentIdentifier")
    public native UISheetPresentationControllerDetentIdentifier getSelectedDetentIdentifier();
    @Property(selector = "setSelectedDetentIdentifier:")
    public native void setSelectedDetentIdentifier(UISheetPresentationControllerDetentIdentifier v);
    @Property(selector = "largestUndimmedDetentIdentifier")
    public native UISheetPresentationControllerDetentIdentifier getLargestUndimmedDetentIdentifier();
    @Property(selector = "setLargestUndimmedDetentIdentifier:")
    public native void setLargestUndimmedDetentIdentifier(UISheetPresentationControllerDetentIdentifier v);
    @Property(selector = "prefersScrollingExpandsWhenScrolledToEdge")
    public native boolean prefersScrollingExpandsWhenScrolledToEdge();
    @Property(selector = "setPrefersScrollingExpandsWhenScrolledToEdge:")
    public native void setPrefersScrollingExpandsWhenScrolledToEdge(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="UISheetPresentationControllerAutomaticDimension", optional=true)
    public static native @MachineSizedFloat double AutomaticDimension();
    
    @Method(selector = "animateChanges:")
    public native void animateChanges(@Block Runnable changes);
    /*</methods>*/
}
