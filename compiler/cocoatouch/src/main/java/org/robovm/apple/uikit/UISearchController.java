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

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISearchController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements UIViewControllerTransitioningDelegate, UIViewControllerAnimatedTransitioning/*</implements>*/ {

    /*<ptr>*/public static class UISearchControllerPtr extends Ptr<UISearchController, UISearchControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISearchController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UISearchController() {}
    protected UISearchController(Handle h, long handle) { super(h, handle); }
    protected UISearchController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSearchResultsController:")
    public UISearchController(UIViewController searchResultsController) { super((SkipInit) null); initObject(init(searchResultsController)); }
    @Method(selector = "initWithNibName:bundle:")
    public UISearchController(String nibNameOrNil, NSBundle nibBundleOrNil) { super((SkipInit) null); initObject(init(nibNameOrNil, nibBundleOrNil)); }
    @Method(selector = "initWithCoder:")
    public UISearchController(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "searchResultsUpdater")
    public native UISearchResultsUpdating getSearchResultsUpdater();
    @Property(selector = "setSearchResultsUpdater:", strongRef = true)
    public native void setSearchResultsUpdater(UISearchResultsUpdating v);
    @Property(selector = "isActive")
    public native boolean isActive();
    @Property(selector = "setActive:")
    public native void setActive(boolean v);
    @Property(selector = "delegate")
    public native UISearchControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UISearchControllerDelegate v);
    /**
     * @deprecated Deprecated in iOS 12.0. Use obscuresBackgroundDuringPresentation
     */
    @Deprecated
    @Property(selector = "dimsBackgroundDuringPresentation")
    public native boolean dimsBackgroundDuringPresentation();
    /**
     * @deprecated Deprecated in iOS 12.0. Use obscuresBackgroundDuringPresentation
     */
    @Deprecated
    @Property(selector = "setDimsBackgroundDuringPresentation:")
    public native void setDimsBackgroundDuringPresentation(boolean v);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "obscuresBackgroundDuringPresentation")
    public native boolean obscuresBackgroundDuringPresentation();
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "setObscuresBackgroundDuringPresentation:")
    public native void setObscuresBackgroundDuringPresentation(boolean v);
    @Property(selector = "hidesNavigationBarDuringPresentation")
    public native boolean hidesNavigationBarDuringPresentation();
    @Property(selector = "setHidesNavigationBarDuringPresentation:")
    public native void setHidesNavigationBarDuringPresentation(boolean v);
    @Property(selector = "searchResultsController")
    public native UIViewController getSearchResultsController();
    @Property(selector = "searchBar")
    public native UISearchBar getSearchBar();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "searchBarPlacement")
    public native UINavigationItemSearchBarPlacement getSearchBarPlacement();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "automaticallyShowsSearchResultsController")
    public native boolean automaticallyShowsSearchResultsController();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAutomaticallyShowsSearchResultsController:")
    public native void setAutomaticallyShowsSearchResultsController(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "showsSearchResultsController")
    public native boolean showsSearchResultsController();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setShowsSearchResultsController:")
    public native void setShowsSearchResultsController(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "automaticallyShowsCancelButton")
    public native boolean automaticallyShowsCancelButton();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAutomaticallyShowsCancelButton:")
    public native void setAutomaticallyShowsCancelButton(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Use scopeBarActivation instead
     */
    @Deprecated
    @Property(selector = "automaticallyShowsScopeBar")
    public native boolean automaticallyShowsScopeBar();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Use scopeBarActivation instead
     */
    @Deprecated
    @Property(selector = "setAutomaticallyShowsScopeBar:")
    public native void setAutomaticallyShowsScopeBar(boolean v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "scopeBarActivation")
    public native UISearchControllerScopeBarActivation getScopeBarActivation();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setScopeBarActivation:")
    public native void setScopeBarActivation(UISearchControllerScopeBarActivation v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "searchSuggestions")
    public native NSArray<?> getSearchSuggestions();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setSearchSuggestions:")
    public native void setSearchSuggestions(NSArray<?> v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "ignoresSearchSuggestionsForSearchBarPlacementStacked")
    public native boolean ignoresSearchSuggestionsForSearchBarPlacementStacked();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setIgnoresSearchSuggestionsForSearchBarPlacementStacked:")
    public native void setIgnoresSearchSuggestionsForSearchBarPlacementStacked(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSearchResultsController:")
    protected native @Pointer long init(UIViewController searchResultsController);
    @Method(selector = "initWithNibName:bundle:")
    protected native @Pointer long init(String nibNameOrNil, NSBundle nibBundleOrNil);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "animationControllerForPresentedController:presentingController:sourceController:")
    public native UIViewControllerAnimatedTransitioning getAnimationControllerForPresentedController(UIViewController presented, UIViewController presenting, UIViewController source);
    @Method(selector = "animationControllerForDismissedController:")
    public native UIViewControllerAnimatedTransitioning getAnimationControllerForDismissedController(UIViewController dismissed);
    @Method(selector = "interactionControllerForPresentation:")
    public native UIViewControllerInteractiveTransitioning getInteractionControllerForPresentation(UIViewControllerAnimatedTransitioning animator);
    @Method(selector = "interactionControllerForDismissal:")
    public native UIViewControllerInteractiveTransitioning getInteractionControllerForDismissal(UIViewControllerAnimatedTransitioning animator);
    @Method(selector = "presentationControllerForPresentedViewController:presentingViewController:sourceViewController:")
    public native UIPresentationController getPresentationControllerForPresentedViewController(UIViewController presented, UIViewController presenting, UIViewController source);
    @Method(selector = "transitionDuration:")
    public native double getTransitionDuration(UIViewControllerContextTransitioning transitionContext);
    @Method(selector = "animateTransition:")
    public native void animateTransition(UIViewControllerContextTransitioning transitionContext);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "interruptibleAnimatorForTransition:")
    public native UIViewImplicitlyAnimating getInterruptibleAnimator(UIViewControllerContextTransitioning transitionContext);
    @Method(selector = "animationEnded:")
    public native void animationEnded(boolean transitionCompleted);
    /*</methods>*/
}
