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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UISplitViewControllerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "splitViewController:willChangeToDisplayMode:")
    void willChangeToDisplayMode(UISplitViewController svc, UISplitViewControllerDisplayMode displayMode);
    @Method(selector = "targetDisplayModeForActionInSplitViewController:")
    UISplitViewControllerDisplayMode getTargetDisplayMode(UISplitViewController svc);
    @Method(selector = "splitViewController:showViewController:sender:")
    boolean showViewController(UISplitViewController splitViewController, UIViewController vc, NSObject sender);
    @Method(selector = "splitViewController:showDetailViewController:sender:")
    boolean showDetailViewController(UISplitViewController splitViewController, UIViewController vc, NSObject sender);
    @Method(selector = "primaryViewControllerForCollapsingSplitViewController:")
    UIViewController getPrimaryViewControllerForCollapsing(UISplitViewController splitViewController);
    @Method(selector = "primaryViewControllerForExpandingSplitViewController:")
    UIViewController getPrimaryViewControllerForExpanding(UISplitViewController splitViewController);
    @Method(selector = "splitViewController:collapseSecondaryViewController:ontoPrimaryViewController:")
    boolean collapseSecondaryViewController(UISplitViewController splitViewController, UIViewController secondaryViewController, UIViewController primaryViewController);
    @Method(selector = "splitViewController:separateSecondaryViewControllerFromPrimaryViewController:")
    UIViewController separateSecondaryViewController(UISplitViewController splitViewController, UIViewController primaryViewController);
    @Method(selector = "splitViewControllerSupportedInterfaceOrientations:")
    UIInterfaceOrientationMask getSupportedInterfaceOrientations(UISplitViewController splitViewController);
    @Method(selector = "splitViewControllerPreferredInterfaceOrientationForPresentation:")
    UIInterfaceOrientation getPreferredInterfaceOrientation(UISplitViewController splitViewController);
    /**
     * @deprecated Deprecated in iOS 8.0. Use splitViewController:willChangeToDisplayMode: and displayModeButtonItem instead
     */
    @Deprecated
    @Method(selector = "splitViewController:willHideViewController:withBarButtonItem:forPopoverController:")
    void willHideViewController(UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem, UIPopoverController pc);
    /**
     * @deprecated Deprecated in iOS 8.0. Use splitViewController:willChangeToDisplayMode: and displayModeButtonItem instead
     */
    @Deprecated
    @Method(selector = "splitViewController:willShowViewController:invalidatingBarButtonItem:")
    void willShowViewController(UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem);
    /**
     * @deprecated Deprecated in iOS 8.0. Use splitViewController:willChangeToDisplayMode:
     */
    @Deprecated
    @Method(selector = "splitViewController:popoverController:willPresentViewController:")
    void willPresentViewController(UISplitViewController svc, UIPopoverController pc, UIViewController aViewController);
    /**
     * @deprecated Deprecated in iOS 8.0. Use preferredDisplayMode
     */
    @Deprecated
    @Method(selector = "splitViewController:shouldHideViewController:inOrientation:")
    boolean shouldHideViewController(UISplitViewController svc, UIViewController vc, UIInterfaceOrientation orientation);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
