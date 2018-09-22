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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIPresentationController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIAppearanceContainer, UITraitEnvironment, UIContentContainer, UIFocusEnvironment/*</implements>*/ {

    /*<ptr>*/public static class UIPresentationControllerPtr extends Ptr<UIPresentationController, UIPresentationControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIPresentationController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIPresentationController() {}
    protected UIPresentationController(Handle h, long handle) { super(h, handle); }
    protected UIPresentationController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPresentedViewController:presentingViewController:")
    public UIPresentationController(UIViewController presentedViewController, UIViewController presentingViewController) { super((SkipInit) null); initObject(init(presentedViewController, presentingViewController)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "presentingViewController")
    public native UIViewController getPresentingViewController();
    @Property(selector = "presentedViewController")
    public native UIViewController getPresentedViewController();
    @Property(selector = "presentationStyle")
    public native UIModalPresentationStyle getPresentationStyle();
    @Property(selector = "containerView")
    public native UIView getContainerView();
    @Property(selector = "delegate")
    public native UIAdaptivePresentationControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIAdaptivePresentationControllerDelegate v);
    @Property(selector = "adaptivePresentationStyle")
    public native UIModalPresentationStyle getAdaptivePresentationStyle();
    @Property(selector = "presentedView")
    public native UIView getPresentedView();
    @Property(selector = "frameOfPresentedViewInContainerView")
    public native @ByVal CGRect getFrameOfPresentedViewInContainerView();
    @Property(selector = "shouldPresentInFullscreen")
    public native boolean shouldPresentInFullscreen();
    @Property(selector = "shouldRemovePresentersView")
    public native boolean shouldRemovePresentersView();
    @Property(selector = "overrideTraitCollection")
    public native UITraitCollection getOverrideTraitCollection();
    @Property(selector = "setOverrideTraitCollection:")
    public native void setOverrideTraitCollection(UITraitCollection v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "traitCollection")
    public native UITraitCollection getTraitCollection();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "preferredContentSize")
    public native @ByVal CGSize getPreferredContentSize();
    @Property(selector = "preferredFocusEnvironments")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<UIFocusEnvironment> getPreferredFocusEnvironments();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "parentFocusEnvironment")
    public native UIFocusEnvironment getParentFocusEnvironment();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "focusItemContainer")
    public native UIFocusItemContainer getFocusItemContainer();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use -preferredFocusEnvironments instead.
     */
    @Deprecated
    @Property(selector = "preferredFocusedView")
    public native UIView getPreferredFocusedView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPresentedViewController:presentingViewController:")
    protected native @Pointer long init(UIViewController presentedViewController, UIViewController presentingViewController);
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Method(selector = "adaptivePresentationStyleForTraitCollection:")
    public native UIModalPresentationStyle getAdaptivePresentationStyleForTraitCollection(UITraitCollection traitCollection);
    @Method(selector = "containerViewWillLayoutSubviews")
    public native void containerViewWillLayoutSubviews();
    @Method(selector = "containerViewDidLayoutSubviews")
    public native void containerViewDidLayoutSubviews();
    @Method(selector = "presentationTransitionWillBegin")
    public native void presentationTransitionWillBegin();
    @Method(selector = "presentationTransitionDidEnd:")
    public native void presentationTransitionDidEnd(boolean completed);
    @Method(selector = "dismissalTransitionWillBegin")
    public native void dismissalTransitionWillBegin();
    @Method(selector = "dismissalTransitionDidEnd:")
    public native void dismissalTransitionDidEnd(boolean completed);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "preferredContentSizeDidChangeForChildContentContainer:")
    public native void preferredContentSizeDidChangeForChildContentContainer(UIContentContainer container);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "systemLayoutFittingSizeDidChangeForChildContentContainer:")
    public native void systemLayoutFittingSizeDidChangeForChildContentContainer(UIContentContainer container);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "sizeForChildContentContainer:withParentContainerSize:")
    public native @ByVal CGSize sizeForChildContentContainer(UIContentContainer container, @ByVal CGSize parentSize);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "viewWillTransitionToSize:withTransitionCoordinator:")
    public native void viewWillTransitionToSize(@ByVal CGSize size, UIViewControllerTransitionCoordinator coordinator);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "willTransitionToTraitCollection:withTransitionCoordinator:")
    public native void willTransitionToTraitCollection(UITraitCollection newCollection, UIViewControllerTransitionCoordinator coordinator);
    @Method(selector = "setNeedsFocusUpdate")
    public native void setNeedsFocusUpdate();
    @Method(selector = "updateFocusIfNeeded")
    public native void updateFocusIfNeeded();
    @Method(selector = "shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocus(UIFocusUpdateContext context);
    @Method(selector = "didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocus(UIFocusUpdateContext context, UIFocusAnimationCoordinator coordinator);
    /*</methods>*/
}
