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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISplitViewControllerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UISplitViewControllerDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("splitViewController:willChangeToDisplayMode:")
    public void willChangeToDisplayMode(UISplitViewController svc, UISplitViewControllerDisplayMode displayMode) {}
    @NotImplemented("targetDisplayModeForActionInSplitViewController:")
    public UISplitViewControllerDisplayMode getTargetDisplayMode(UISplitViewController svc) { return null; }
    @NotImplemented("splitViewController:showViewController:sender:")
    public boolean showViewController(UISplitViewController splitViewController, UIViewController vc, NSObject sender) { return false; }
    @NotImplemented("splitViewController:showDetailViewController:sender:")
    public boolean showDetailViewController(UISplitViewController splitViewController, UIViewController vc, NSObject sender) { return false; }
    @NotImplemented("primaryViewControllerForCollapsingSplitViewController:")
    public UIViewController getPrimaryViewControllerForCollapsing(UISplitViewController splitViewController) { return null; }
    @NotImplemented("primaryViewControllerForExpandingSplitViewController:")
    public UIViewController getPrimaryViewControllerForExpanding(UISplitViewController splitViewController) { return null; }
    @NotImplemented("splitViewController:collapseSecondaryViewController:ontoPrimaryViewController:")
    public boolean collapseSecondaryViewController(UISplitViewController splitViewController, UIViewController secondaryViewController, UIViewController primaryViewController) { return false; }
    @NotImplemented("splitViewController:separateSecondaryViewControllerFromPrimaryViewController:")
    public UIViewController separateSecondaryViewController(UISplitViewController splitViewController, UIViewController primaryViewController) { return null; }
    @NotImplemented("splitViewControllerSupportedInterfaceOrientations:")
    public UIInterfaceOrientationMask getSupportedInterfaceOrientations(UISplitViewController splitViewController) { return null; }
    @NotImplemented("splitViewControllerPreferredInterfaceOrientationForPresentation:")
    public UIInterfaceOrientation getPreferredInterfaceOrientation(UISplitViewController splitViewController) { return null; }
    /**
     * @deprecated Deprecated in iOS 8.0. Use splitViewController:willChangeToDisplayMode: and displayModeButtonItem instead
     */
    @Deprecated
    @NotImplemented("splitViewController:willHideViewController:withBarButtonItem:forPopoverController:")
    public void willHideViewController(UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem, UIPopoverController pc) {}
    /**
     * @deprecated Deprecated in iOS 8.0. Use splitViewController:willChangeToDisplayMode: and displayModeButtonItem instead
     */
    @Deprecated
    @NotImplemented("splitViewController:willShowViewController:invalidatingBarButtonItem:")
    public void willShowViewController(UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem) {}
    /**
     * @deprecated Deprecated in iOS 8.0. Use splitViewController:willChangeToDisplayMode:
     */
    @Deprecated
    @NotImplemented("splitViewController:popoverController:willPresentViewController:")
    public void willPresentViewController(UISplitViewController svc, UIPopoverController pc, UIViewController aViewController) {}
    /**
     * @deprecated Deprecated in iOS 8.0. Use preferredDisplayMode
     */
    @Deprecated
    @NotImplemented("splitViewController:shouldHideViewController:inOrientation:")
    public boolean shouldHideViewController(UISplitViewController svc, UIViewController vc, UIInterfaceOrientation orientation) { return false; }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("splitViewController:topColumnForCollapsingToProposedTopColumn:")
    public UISplitViewControllerColumn getTopColumnForCollapsingToProposedTopColumn(UISplitViewController svc, UISplitViewControllerColumn proposedTopColumn) { return null; }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("splitViewController:displayModeForExpandingToProposedDisplayMode:")
    public UISplitViewControllerDisplayMode getDisplayModeForExpandingToProposedDisplayMode(UISplitViewController svc, UISplitViewControllerDisplayMode proposedDisplayMode) { return null; }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("splitViewControllerDidCollapse:")
    public void didCollapse(UISplitViewController svc) {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("splitViewControllerDidExpand:")
    public void didExpand(UISplitViewController svc) {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("splitViewController:willShowColumn:")
    public void willShowColumn(UISplitViewController svc, UISplitViewControllerColumn column) {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("splitViewController:willHideColumn:")
    public void willHideColumn(UISplitViewController svc, UISplitViewControllerColumn column) {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("splitViewControllerInteractivePresentationGestureWillBegin:")
    public void interactivePresentationGestureWillBegin(UISplitViewController svc) {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("splitViewControllerInteractivePresentationGestureDidEnd:")
    public void interactivePresentationGestureDidEnd(UISplitViewController svc) {}
    /*</methods>*/
}
