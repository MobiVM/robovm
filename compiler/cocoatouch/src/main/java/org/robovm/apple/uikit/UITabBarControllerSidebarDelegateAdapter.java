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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITabBarControllerSidebarDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UITabBarControllerSidebarDelegate/*</implements>*/ {

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
    @NotImplemented("tabBarController:sidebarVisibilityWillChange:animator:")
    public void sidebarVisibilityWillChange(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITabBarControllerSidebarAnimating animator) {}
    @NotImplemented("tabBarController:sidebar:itemForRequest:")
    public UITabSidebarItem getItem(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITabSidebarItemRequest request) { return null; }
    @NotImplemented("tabBarController:sidebar:updateItem:")
    public void updateItem(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITabSidebarItem item) {}
    @NotImplemented("tabBarController:sidebar:willBeginDisplayingTab:")
    public void willBeginDisplayingTab(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITab tab) {}
    @NotImplemented("tabBarController:sidebar:didEndDisplayingTab:")
    public void didEndDisplayingTab(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITab tab) {}
    @NotImplemented("tabBarController:sidebar:leadingSwipeActionsConfigurationForTab:")
    public UISwipeActionsConfiguration getLeadingSwipeActionsConfiguration(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITab tab) { return null; }
    @NotImplemented("tabBarController:sidebar:trailingSwipeActionsConfigurationForTab:")
    public UISwipeActionsConfiguration getTrailingSwipeActionsConfiguration(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITab tab) { return null; }
    @NotImplemented("tabBarController:sidebar:contextMenuConfigurationForTab:")
    public UIContextMenuConfiguration getContextMenuConfiguration(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITab tab) { return null; }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @NotImplemented("tabBarController:sidebar:itemsForBeginningDragSession:tab:")
    public NSArray<UIDragItem> getItemsForBeginningDragSession(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UIDragSession dragSession, UITab tab) { return null; }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @NotImplemented("tabBarController:sidebar:itemsForAddingToDragSession:tab:")
    public NSArray<UIDragItem> getItemsForAddingToDragSession(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UIDragSession dragSession, UITab tab) { return null; }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @NotImplemented("tabBarController:sidebar:sidebarAction:group:operationForAcceptingItemsFromDropSession:")
    public UIDropOperation getOperationForAcceptingItems(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UIAction sidebarAction, UITabGroup group, UIDropSession session) { return null; }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @NotImplemented("tabBarController:sidebar:sidebarAction:group:acceptItemsFromDropSession:")
    public void acceptItemsFromDropSession(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UIAction sidebarAction, UITabGroup group, UIDropSession session) {}
    /*</methods>*/
}
