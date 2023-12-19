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
import org.robovm.apple.iad.ADInterstitialPresentationPolicy;
import org.robovm.apple.mediaplayer.MPMoviePlayerViewController;

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIViewController/*</name>*/ 
    extends /*<extends>*/UIResponder/*</extends>*/ 
    /*<implements>*/implements NSCoding, UIAppearanceContainer, UITraitEnvironment, UIContentContainer, UIFocusEnvironment, UIStateRestoring, NSExtensionRequestHandling, UITraitChangeObservable/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeDidEnterBackground(UIViewController object, final VoidBlock1<UIViewController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ShowDetailTargetDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UIViewController)a.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class UIViewControllerPtr extends Ptr<UIViewController, UIViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIViewController() {}
    @Deprecated protected UIViewController(long handle) { super(handle); }
    protected UIViewController(Handle h, long handle) { super(h, handle); }
    protected UIViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNibName:bundle:")
    public UIViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super((SkipInit) null); initObject(init(nibNameOrNil, nibBundleOrNil)); }
    @Method(selector = "initWithCoder:")
    public UIViewController(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "view")
    public native UIView getView();
    @Property(selector = "setView:")
    public native void setView(UIView v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "viewIfLoaded")
    public native UIView getViewIfLoaded();
    @Property(selector = "isViewLoaded")
    public native boolean isViewLoaded();
    @Property(selector = "nibName")
    public native String getNibName();
    @Property(selector = "nibBundle")
    public native NSBundle getNibBundle();
    @Property(selector = "storyboard")
    public native UIStoryboard getStoryboard();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "parentViewController")
    public native UIViewController getParentViewController();
    @Property(selector = "presentedViewController")
    public native UIViewController getPresentedViewController();
    @Property(selector = "presentingViewController")
    public native UIViewController getPresentingViewController();
    @Property(selector = "definesPresentationContext")
    public native boolean definesPresentationContext();
    @Property(selector = "setDefinesPresentationContext:")
    public native void setDefinesPresentationContext(boolean v);
    @Property(selector = "providesPresentationContextTransitionStyle")
    public native boolean providesPresentationContextTransitionStyle();
    @Property(selector = "setProvidesPresentationContextTransitionStyle:")
    public native void setProvidesPresentationContextTransitionStyle(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "restoresFocusAfterTransition")
    public native boolean isRestoresFocusAfterTransition();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setRestoresFocusAfterTransition:")
    public native void setRestoresFocusAfterTransition(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "focusGroupIdentifier")
    public native String getFocusGroupIdentifier();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setFocusGroupIdentifier:")
    public native void setFocusGroupIdentifier(String v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "interactionActivityTrackingBaseName")
    public native String getInteractionActivityTrackingBaseName();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setInteractionActivityTrackingBaseName:")
    public native void setInteractionActivityTrackingBaseName(String v);
    @Property(selector = "isBeingPresented")
    public native boolean isBeingPresented();
    @Property(selector = "isBeingDismissed")
    public native boolean isBeingDismissed();
    @Property(selector = "isMovingToParentViewController")
    public native boolean isMovingToParentViewController();
    @Property(selector = "isMovingFromParentViewController")
    public native boolean isMovingFromParentViewController();
    @Property(selector = "modalTransitionStyle")
    public native UIModalTransitionStyle getModalTransitionStyle();
    @Property(selector = "setModalTransitionStyle:")
    public native void setModalTransitionStyle(UIModalTransitionStyle v);
    @Property(selector = "modalPresentationStyle")
    public native UIModalPresentationStyle getModalPresentationStyle();
    @Property(selector = "setModalPresentationStyle:")
    public native void setModalPresentationStyle(UIModalPresentationStyle v);
    @Property(selector = "modalPresentationCapturesStatusBarAppearance")
    public native boolean modalPresentationCapturesStatusBarAppearance();
    @Property(selector = "setModalPresentationCapturesStatusBarAppearance:")
    public native void setModalPresentationCapturesStatusBarAppearance(boolean v);
    @Property(selector = "disablesAutomaticKeyboardDismissal")
    public native boolean disablesAutomaticKeyboardDismissal();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "wantsFullScreenLayout")
    public native boolean wantsFullScreenLayout();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "setWantsFullScreenLayout:")
    public native void setWantsFullScreenLayout(boolean v);
    @Property(selector = "edgesForExtendedLayout")
    public native UIRectEdge getEdgesForExtendedLayout();
    @Property(selector = "setEdgesForExtendedLayout:")
    public native void setEdgesForExtendedLayout(UIRectEdge v);
    @Property(selector = "extendedLayoutIncludesOpaqueBars")
    public native boolean extendedLayoutIncludesOpaqueBars();
    @Property(selector = "setExtendedLayoutIncludesOpaqueBars:")
    public native void setExtendedLayoutIncludesOpaqueBars(boolean v);
    /**
     * @deprecated Deprecated in iOS 11.0. Use UIScrollView's contentInsetAdjustmentBehavior instead
     */
    @Deprecated
    @Property(selector = "automaticallyAdjustsScrollViewInsets")
    public native boolean automaticallyAdjustsScrollViewInsets();
    /**
     * @deprecated Deprecated in iOS 11.0. Use UIScrollView's contentInsetAdjustmentBehavior instead
     */
    @Deprecated
    @Property(selector = "setAutomaticallyAdjustsScrollViewInsets:")
    public native void setAutomaticallyAdjustsScrollViewInsets(boolean v);
    @Property(selector = "preferredContentSize")
    public native @ByVal CGSize getPreferredContentSize();
    @Property(selector = "setPreferredContentSize:")
    public native void setPreferredContentSize(@ByVal CGSize v);
    @Property(selector = "preferredStatusBarStyle")
    public native UIStatusBarStyle getPreferredStatusBarStyle();
    @Property(selector = "prefersStatusBarHidden")
    public native boolean prefersStatusBarHidden();
    @Property(selector = "preferredStatusBarUpdateAnimation")
    public native UIStatusBarAnimation getPreferredStatusBarUpdateAnimation();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "overrideUserInterfaceStyle")
    public native UIUserInterfaceStyle getOverrideUserInterfaceStyle();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setOverrideUserInterfaceStyle:")
    public native void setOverrideUserInterfaceStyle(UIUserInterfaceStyle v);
    /**
     * @deprecated Deprecated in iOS 16.0. Update supported interface orientations and call setNeedsUpdateOfSupportedInterfaceOrientations to indicate a change.
     */
    @Deprecated
    @Property(selector = "shouldAutorotate")
    public native boolean shouldAutorotate();
    @Property(selector = "supportedInterfaceOrientations")
    public native UIInterfaceOrientationMask getSupportedInterfaceOrientations();
    @Property(selector = "preferredInterfaceOrientationForPresentation")
    public native UIInterfaceOrientation getPreferredInterfaceOrientationForPresentation();
    /**
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Property(selector = "interfaceOrientation")
    public native UIInterfaceOrientation getInterfaceOrientation();
    @Property(selector = "isEditing")
    public native boolean isEditing();
    @Property(selector = "setEditing:")
    public native void setEditing(boolean v);
    @Property(selector = "editButtonItem")
    public native UIBarButtonItem getEditButtonItem();
    /**
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Property(selector = "searchDisplayController")
    public native UISearchDisplayController getSearchDisplayController();
    @Property(selector = "childViewControllers")
    public native NSArray<UIViewController> getChildViewControllers();
    @Property(selector = "childViewControllerForStatusBarStyle")
    public native UIViewController getChildViewControllerForStatusBarStyle();
    @Property(selector = "childViewControllerForStatusBarHidden")
    public native UIViewController getChildViewControllerForStatusBarHidden();
    @Property(selector = "shouldAutomaticallyForwardAppearanceMethods")
    public native boolean shouldAutomaticallyForwardAppearanceMethods();
    @Property(selector = "restorationIdentifier")
    public native String getRestorationIdentifier();
    @Property(selector = "setRestorationIdentifier:")
    public native void setRestorationIdentifier(String v);
    @Property(selector = "restorationClass")
    public native ObjCClass getRestorationClass();
    @Property(selector = "setRestorationClass:", strongRef = true)
    public native void setRestorationClass(ObjCClass v);
    @Property(selector = "transitioningDelegate")
    public native UIViewControllerTransitioningDelegate getTransitioningDelegate();
    @Property(selector = "setTransitioningDelegate:", strongRef = true)
    public native void setTransitioningDelegate(UIViewControllerTransitioningDelegate v);
    /**
     * @deprecated Deprecated in iOS 11.0. Use view.safeAreaLayoutGuide.topAnchor instead of topLayoutGuide.bottomAnchor
     */
    @Deprecated
    @Property(selector = "topLayoutGuide")
    public native UILayoutSupport getTopLayoutGuide();
    /**
     * @deprecated Deprecated in iOS 11.0. Use view.safeAreaLayoutGuide.bottomAnchor instead of bottomLayoutGuide.topAnchor
     */
    @Deprecated
    @Property(selector = "bottomLayoutGuide")
    public native UILayoutSupport getBottomLayoutGuide();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "additionalSafeAreaInsets")
    public native @ByVal UIEdgeInsets getAdditionalSafeAreaInsets();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAdditionalSafeAreaInsets:")
    public native void setAdditionalSafeAreaInsets(@ByVal UIEdgeInsets v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "systemMinimumLayoutMargins")
    public native @ByVal NSDirectionalEdgeInsets getSystemMinimumLayoutMargins();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "viewRespectsSystemMinimumLayoutMargins")
    public native boolean isViewRespectsSystemMinimumLayoutMargins();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setViewRespectsSystemMinimumLayoutMargins:")
    public native void setViewRespectsSystemMinimumLayoutMargins(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "performsActionsWhilePresentingModally")
    public native boolean performsActionsWhilePresentingModally();
    @Property(selector = "extensionContext")
    public native NSExtensionContext getExtensionContext();
    @Property(selector = "presentationController")
    public native UIPresentationController getPresentationController();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "sheetPresentationController")
    public native UISheetPresentationController getSheetPresentationController();
    @Property(selector = "popoverPresentationController")
    public native UIPopoverPresentationController getPopoverPresentationController();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "activePresentationController")
    public native UIPresentationController getActivePresentationController();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isModalInPresentation")
    public native boolean isModalInPresentation();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setModalInPresentation:")
    public native void setModalInPresentation(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "childViewControllerForScreenEdgesDeferringSystemGestures")
    public native UIViewController getChildViewControllerForScreenEdgesDeferringSystemGestures();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "preferredScreenEdgesDeferringSystemGestures")
    public native UIRectEdge getPreferredScreenEdgesDeferringSystemGestures();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "childViewControllerForHomeIndicatorAutoHidden")
    public native UIViewController getChildViewControllerForHomeIndicatorAutoHidden();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "prefersHomeIndicatorAutoHidden")
    public native boolean prefersHomeIndicatorAutoHidden();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "childViewControllerForPointerLock")
    public native UIViewController getChildViewControllerForPointerLock();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "prefersPointerLocked")
    public native boolean prefersPointerLocked();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "contentUnavailableConfiguration")
    public native UIContentConfiguration getContentUnavailableConfiguration();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setContentUnavailableConfiguration:")
    public native void setContentUnavailableConfiguration(UIContentConfiguration v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "contentUnavailableConfigurationState")
    public native UIContentUnavailableConfigurationState getContentUnavailableConfigurationState();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 13.0. UIViewControllerPreviewing is deprecated. Please use UIContextMenuInteraction.
     */
    @Deprecated
    @Property(selector = "previewActionItems")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<UIPreviewActionItem> getPreviewActionItems();
    @Property(selector = "traitOverrides")
    public native UITraitOverrides getTraitOverrides();
    @Property(selector = "navigationItem")
    public native UINavigationItem getNavigationItem();
    @Property(selector = "hidesBottomBarWhenPushed")
    public native boolean hidesBottomBarWhenPushed();
    @Property(selector = "setHidesBottomBarWhenPushed:")
    public native void setHidesBottomBarWhenPushed(boolean v);
    @Property(selector = "navigationController")
    public native UINavigationController getNavigationController();
    @Property(selector = "toolbarItems")
    public native NSArray<UIBarButtonItem> getToolbarItems();
    @Property(selector = "setToolbarItems:")
    public native void setToolbarItems(NSArray<UIBarButtonItem> v);
    /**
     * @deprecated Deprecated in iOS 13.0. Use modalInPresentation
     */
    @Deprecated
    @Property(selector = "isModalInPopover")
    public native boolean isModalInPopover();
    /**
     * @deprecated Deprecated in iOS 13.0. Use modalInPresentation
     */
    @Deprecated
    @Property(selector = "setModalInPopover:")
    public native void setModalInPopover(boolean v);
    /**
     * @deprecated Deprecated in iOS 7.0. Use preferredContentSize
     */
    @Deprecated
    @Property(selector = "contentSizeForViewInPopover")
    public native @ByVal CGSize getContentSizeForViewInPopover();
    /**
     * @deprecated Deprecated in iOS 7.0. Use preferredContentSize
     */
    @Deprecated
    @Property(selector = "setContentSizeForViewInPopover:")
    public native void setContentSizeForViewInPopover(@ByVal CGSize v);
    @Property(selector = "transitionCoordinator")
    public native UIViewControllerTransitionCoordinator getTransitionCoordinator();
    @Property(selector = "splitViewController")
    public native UISplitViewController getSplitViewController();
    @Property(selector = "tabBarItem")
    public native UITabBarItem getTabBarItem();
    @Property(selector = "setTabBarItem:")
    public native void setTabBarItem(UITabBarItem v);
    @Property(selector = "tabBarController")
    public native UITabBarController getTabBarController();
    @Property(selector = "traitCollection")
    public native UITraitCollection getTraitCollection();
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
     * @deprecated Deprecated in iOS 10.0. Use preferredFocusEnvironments
     */
    @Deprecated
    @Property(selector = "preferredFocusedView")
    public native UIView getPreferredFocusedView();
    @Property(selector = "restorationParent")
    public native UIStateRestoring getRestorationParent();
    @Property(selector = "objectRestorationClass")
    public native Class<?> getObjectRestorationClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    /* iAd extensions */
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public ADInterstitialPresentationPolicy getInterstitialPresentationPolicy() {
        return org.robovm.apple.iad.UIViewControllerExtensions.getInterstitialPresentationPolicy(this);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void setInterstitialPresentationPolicy(ADInterstitialPresentationPolicy v) {
        org.robovm.apple.iad.UIViewControllerExtensions.setInterstitialPresentationPolicy(this, v);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public boolean isCanDisplayBannerAds() {
        return org.robovm.apple.iad.UIViewControllerExtensions.canDisplayBannerAds(this);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void setCanDisplayBannerAds(boolean v) {
        org.robovm.apple.iad.UIViewControllerExtensions.setCanDisplayBannerAds(this, v);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public UIView getOriginalContentView() {
        return org.robovm.apple.iad.UIViewControllerExtensions.getOriginalContentView(this);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public boolean isPresentingFullScreenAd() {
        return org.robovm.apple.iad.UIViewControllerExtensions.isPresentingFullScreenAd(this);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public boolean isDisplayingBannerAd() {
        return org.robovm.apple.iad.UIViewControllerExtensions.isDisplayingBannerAd(this);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public boolean requestInterstitialAdPresentation() {
        return org.robovm.apple.iad.UIViewControllerExtensions.requestInterstitialAdPresentation(this);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public boolean shouldPresentInterstitialAd() {
        return org.robovm.apple.iad.UIViewControllerExtensions.shouldPresentInterstitialAd(this);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void prepareInterstitialAds() {
        org.robovm.apple.iad.UIViewControllerExtensions.prepareInterstitialAds();
    }
    
    /* MediaPlayer extensions */
    @WeaklyLinked
    public void presentMoviePlayerViewController(MPMoviePlayerViewController moviePlayerViewController) {
        org.robovm.apple.mediaplayer.UIViewControllerExtensions.presentMoviePlayerViewController(this, moviePlayerViewController);
    }
    @WeaklyLinked
    public void dismissMoviePlayerViewController() {
        org.robovm.apple.mediaplayer.UIViewControllerExtensions.dismissMoviePlayerViewController(this);
    }
    
    /*<methods>*/
    @GlobalValue(symbol="UIViewControllerShowDetailTargetDidChangeNotification", optional=true)
    public static native NSString ShowDetailTargetDidChangeNotification();
    
    @Method(selector = "initWithNibName:bundle:")
    protected native @Pointer long init(String nibNameOrNil, NSBundle nibBundleOrNil);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "loadView")
    public native void loadView();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "loadViewIfNeeded")
    public native void loadViewIfNeeded();
    @Method(selector = "viewDidLoad")
    public native void viewDidLoad();
    @Method(selector = "performSegueWithIdentifier:sender:")
    public native void performSegue(String identifier, NSObject sender);
    @Method(selector = "shouldPerformSegueWithIdentifier:sender:")
    public native boolean shouldPerformSegue(String identifier, NSObject sender);
    @Method(selector = "prepareForSegue:sender:")
    public native void prepareForSegue(UIStoryboardSegue segue, NSObject sender);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "canPerformUnwindSegueAction:fromViewController:sender:")
    public native boolean canPerformUnwindSegueAction(Selector action, UIViewController fromViewController, NSObject sender);
    /**
     * @deprecated Deprecated in iOS 13.0. Use canPerformUnwindSegueAction:fromViewController:sender:
     */
    @Deprecated
    @Method(selector = "canPerformUnwindSegueAction:fromViewController:withSender:")
    public native boolean canPerformUnwind(Selector action, UIViewController fromViewController, NSObject sender);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "allowedChildViewControllersForUnwindingFromSource:")
    public native NSArray<UIViewController> getAllowedChildViewControllersForUnwinding(UIStoryboardUnwindSegueSource source);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "childViewControllerContainingSegueSource:")
    public native UIViewController getChildViewControllerContainingSegueSource(UIStoryboardUnwindSegueSource source);
    /**
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Method(selector = "viewControllerForUnwindSegueAction:fromViewController:withSender:")
    public native UIViewController getViewControllerForUnwind(Selector action, UIViewController fromViewController, NSObject sender);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "unwindForSegue:towardsViewController:")
    public native void unwind(UIStoryboardSegue unwindSegue, UIViewController subsequentVC);
    /**
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Method(selector = "segueForUnwindingToViewController:fromViewController:identifier:")
    public native UIStoryboardSegue getSegueForUnwinding(UIViewController toViewController, UIViewController fromViewController, String identifier);
    @Method(selector = "viewWillAppear:")
    public native void viewWillAppear(boolean animated);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "viewIsAppearing:")
    public native void viewIsAppearing(boolean animated);
    @Method(selector = "viewDidAppear:")
    public native void viewDidAppear(boolean animated);
    @Method(selector = "viewWillDisappear:")
    public native void viewWillDisappear(boolean animated);
    @Method(selector = "viewDidDisappear:")
    public native void viewDidDisappear(boolean animated);
    @Method(selector = "viewWillLayoutSubviews")
    public native void viewWillLayoutSubviews();
    @Method(selector = "viewDidLayoutSubviews")
    public native void viewDidLayoutSubviews();
    @Method(selector = "didReceiveMemoryWarning")
    public native void didReceiveMemoryWarning();
    @Method(selector = "presentViewController:animated:completion:")
    public native void presentViewController(UIViewController viewControllerToPresent, boolean animated, @Block Runnable completion);
    @Method(selector = "dismissViewControllerAnimated:completion:")
    public native void dismissViewController(boolean animated, @Block Runnable completion);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "setContentScrollView:forEdge:")
    public native void setContentScrollView(UIScrollView scrollView, NSDirectionalRectEdge edge);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "contentScrollViewForEdge:")
    public native UIScrollView contentScrollViewForEdge(NSDirectionalRectEdge edge);
    @Method(selector = "setNeedsStatusBarAppearanceUpdate")
    public native void setNeedsStatusBarAppearanceUpdate();
    @Method(selector = "targetViewControllerForAction:sender:")
    public native UIViewController getTargetViewControllerForAction(Selector action, NSObject sender);
    @Method(selector = "showViewController:sender:")
    public native void showViewController(UIViewController vc, NSObject sender);
    @Method(selector = "showDetailViewController:sender:")
    public native void showDetailViewController(UIViewController vc, NSObject sender);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "setNeedsUpdateOfSupportedInterfaceOrientations")
    public native void setNeedsUpdateOfSupportedInterfaceOrientations();
    /**
     * @deprecated Deprecated in iOS 8.0. Header views are animated along with the rest of the view hierarchy
     */
    @Deprecated
    @Method(selector = "rotatingHeaderView")
    public native UIView getRotatingHeaderView();
    /**
     * @deprecated Deprecated in iOS 8.0. Footer views are animated along with the rest of the view hierarchy
     */
    @Deprecated
    @Method(selector = "rotatingFooterView")
    public native UIView getRotatingFooterView();
    /**
     * @deprecated Deprecated in iOS 8.0. Implement viewWillTransitionToSize:withTransitionCoordinator: instead
     */
    @Deprecated
    @Method(selector = "willRotateToInterfaceOrientation:duration:")
    public native void willRotate(UIInterfaceOrientation toInterfaceOrientation, double duration);
    /**
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "didRotateFromInterfaceOrientation:")
    public native void didRotate(UIInterfaceOrientation fromInterfaceOrientation);
    /**
     * @deprecated Deprecated in iOS 8.0. Implement viewWillTransitionToSize:withTransitionCoordinator: instead
     */
    @Deprecated
    @Method(selector = "willAnimateRotationToInterfaceOrientation:duration:")
    public native void willAnimateRotation(UIInterfaceOrientation toInterfaceOrientation, double duration);
    /**
     * @deprecated Deprecated in iOS 16.0. Please use instance method `setNeedsUpdateOfSupportedInterfaceOrientations`.
     */
    @Deprecated
    @Method(selector = "attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();
    @Method(selector = "setEditing:animated:")
    public native void setEditing(boolean editing, boolean animated);
    @Method(selector = "addChildViewController:")
    public native void addChildViewController(UIViewController childController);
    @Method(selector = "removeFromParentViewController")
    public native void removeFromParentViewController();
    @Method(selector = "transitionFromViewController:toViewController:duration:options:animations:completion:")
    public native void transition(UIViewController fromViewController, UIViewController toViewController, double duration, UIViewAnimationOptions options, @Block Runnable animations, @Block VoidBooleanBlock completion);
    @Method(selector = "beginAppearanceTransition:animated:")
    public native void beginAppearanceTransition(boolean isAppearing, boolean animated);
    @Method(selector = "endAppearanceTransition")
    public native void endAppearanceTransition();
    /**
     * @deprecated Deprecated in iOS 17.0. Use the traitOverrides property on the child view controller instead
     */
    @Deprecated
    @Method(selector = "setOverrideTraitCollection:forChildViewController:")
    public native void setOverrideTraitCollection(UITraitCollection collection, UIViewController childViewController);
    /**
     * @deprecated Deprecated in iOS 17.0. Use the traitOverrides property on the child view controller instead
     */
    @Deprecated
    @Method(selector = "overrideTraitCollectionForChildViewController:")
    public native UITraitCollection getOverrideTraitCollection(UIViewController childViewController);
    /**
     * @deprecated Deprecated in iOS 8.0. Manually forward viewWillTransitionToSize:withTransitionCoordinator: if necessary
     */
    @Deprecated
    @Method(selector = "shouldAutomaticallyForwardRotationMethods")
    public native boolean shouldAutomaticallyForwardRotationMethods();
    @Method(selector = "willMoveToParentViewController:")
    public native void willMoveToParentViewController(UIViewController parent);
    @Method(selector = "didMoveToParentViewController:")
    public native void didMoveToParentViewController(UIViewController parent);
    @Method(selector = "encodeRestorableStateWithCoder:")
    public native void encodeRestorableState(NSCoder coder);
    @Method(selector = "decodeRestorableStateWithCoder:")
    public native void decodeRestorableState(NSCoder coder);
    @Method(selector = "applicationFinishedRestoringState")
    public native void applicationFinishedRestoringState();
    @Method(selector = "updateViewConstraints")
    public native void updateViewConstraints();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "viewLayoutMarginsDidChange")
    public native void viewLayoutMarginsDidChange();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "viewSafeAreaInsetsDidChange")
    public native void viewSafeAreaInsetsDidChange();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "addKeyCommand:")
    public native void addKeyCommand(UIKeyCommand keyCommand);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "removeKeyCommand:")
    public native void removeKeyCommand(UIKeyCommand keyCommand);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 13.0. UIViewControllerPreviewing is deprecated. Please use UIContextMenuInteraction.
     */
    @Deprecated
    @Method(selector = "registerForPreviewingWithDelegate:sourceView:")
    public native UIViewControllerPreviewing registerForPreviewing(UIViewControllerPreviewingDelegate delegate, UIView sourceView);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 13.0. UIViewControllerPreviewing is deprecated. Please use UIContextMenuInteraction.
     */
    @Deprecated
    @Method(selector = "unregisterForPreviewingWithContext:")
    public native void unregisterForPreviewing(UIViewControllerPreviewing previewing);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setNeedsUpdateOfScreenEdgesDeferringSystemGestures")
    public native void setNeedsUpdateOfScreenEdgesDeferringSystemGestures();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setNeedsUpdateOfHomeIndicatorAutoHidden")
    public native void setNeedsUpdateOfHomeIndicatorAutoHidden();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "setNeedsUpdateOfPrefersPointerLocked")
    public native void setNeedsUpdateOfPrefersPointerLocked();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "setNeedsUpdateContentUnavailableConfiguration")
    public native void setNeedsUpdateContentUnavailableConfiguration();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "updateContentUnavailableConfigurationUsingState:")
    public native void updateContentUnavailableConfigurationUsingState(UIContentUnavailableConfigurationState state);
    @Method(selector = "updateTraitsIfNeeded")
    public native void updateTraitsIfNeeded();
    @Method(selector = "setToolbarItems:animated:")
    public native void setToolbarItems(NSArray<UIBarButtonItem> toolbarItems, boolean animated);
    @Method(selector = "collapseSecondaryViewController:forSplitViewController:")
    public native void collapseSecondaryViewController(UIViewController secondaryViewController, UISplitViewController splitViewController);
    @Method(selector = "separateSecondaryViewControllerForSplitViewController:")
    public native UIViewController separateSecondaryViewController(UISplitViewController splitViewController);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /**
     * @deprecated Deprecated in iOS 17.0. Use the trait change registration APIs declared in the UITraitChangeObservable protocol
     */
    @Deprecated
    @Method(selector = "traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);
    @Method(selector = "preferredContentSizeDidChangeForChildContentContainer:")
    public native void preferredContentSizeDidChangeForChildContentContainer(UIContentContainer container);
    @Method(selector = "systemLayoutFittingSizeDidChangeForChildContentContainer:")
    public native void systemLayoutFittingSizeDidChangeForChildContentContainer(UIContentContainer container);
    @Method(selector = "sizeForChildContentContainer:withParentContainerSize:")
    public native @ByVal CGSize sizeForChildContentContainer(UIContentContainer container, @ByVal CGSize parentSize);
    @Method(selector = "viewWillTransitionToSize:withTransitionCoordinator:")
    public native void viewWillTransitionToSize(@ByVal CGSize size, UIViewControllerTransitionCoordinator coordinator);
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
    @Method(selector = "beginRequestWithExtensionContext:")
    public native void beginRequest(NSExtensionContext context);
    @Method(selector = "unregisterForTraitChanges:")
    public native void unregisterForTraitChanges(UITraitChangeRegistration registration);
    /*</methods>*/
}
