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

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.NotImplemented;
import org.robovm.rt.bro.annotation.MachineSizedSInt;

public class UIPageViewControllerModel extends NSObject implements UIPageViewControllerDelegate, UIPageViewControllerDataSource {
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("pageViewController:willTransitionToViewControllers:")
    public void willTransition(UIPageViewController pageViewController, NSArray<UIViewController> pendingViewControllers) {}
    @NotImplemented("pageViewController:didFinishAnimating:previousViewControllers:transitionCompleted:")
    public void didFinishAnimating(UIPageViewController pageViewController, boolean finished, NSArray<UIViewController> previousViewControllers, boolean completed) {}
    @NotImplemented("pageViewController:spineLocationForInterfaceOrientation:")
    public UIPageViewControllerSpineLocation getSpineLocation(UIPageViewController pageViewController, UIInterfaceOrientation orientation) { return null; }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("pageViewControllerSupportedInterfaceOrientations:")
    public UIInterfaceOrientationMask getSupportedInterfaceOrientations(UIPageViewController pageViewController) { return null; }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("pageViewControllerPreferredInterfaceOrientationForPresentation:")
    public UIInterfaceOrientation getPreferredInterfaceOrientation(UIPageViewController pageViewController) { return null; }
    
    @NotImplemented("pageViewController:viewControllerBeforeViewController:")
    public UIViewController getViewControllerBefore(UIPageViewController pageViewController, UIViewController viewController) { return null; }
    @NotImplemented("pageViewController:viewControllerAfterViewController:")
    public UIViewController getViewControllerAfter(UIPageViewController pageViewController, UIViewController viewController) { return null; }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("presentationCountForPageViewController:")
    public @MachineSizedSInt long getPresentationCount(UIPageViewController pageViewController) { return 0; }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("presentationIndexForPageViewController:")
    public @MachineSizedSInt long getPresentationIndex(UIPageViewController pageViewController) { return 0; }
}
