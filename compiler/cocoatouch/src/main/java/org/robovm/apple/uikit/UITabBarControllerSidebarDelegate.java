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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UITabBarControllerSidebarDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "tabBarController:sidebarVisibilityWillChange:animator:")
    void sidebarVisibilityWillChange(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITabBarControllerSidebarAnimating animator);
    @Method(selector = "tabBarController:sidebar:itemForRequest:")
    UITabSidebarItem getItem(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITabSidebarItemRequest request);
    @Method(selector = "tabBarController:sidebar:updateItem:")
    void updateItem(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITabSidebarItem item);
    @Method(selector = "tabBarController:sidebar:willBeginDisplayingTab:")
    void willBeginDisplayingTab(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITab tab);
    @Method(selector = "tabBarController:sidebar:didEndDisplayingTab:")
    void didEndDisplayingTab(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITab tab);
    @Method(selector = "tabBarController:sidebar:leadingSwipeActionsConfigurationForTab:")
    UISwipeActionsConfiguration getLeadingSwipeActionsConfiguration(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITab tab);
    @Method(selector = "tabBarController:sidebar:trailingSwipeActionsConfigurationForTab:")
    UISwipeActionsConfiguration getTrailingSwipeActionsConfiguration(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITab tab);
    @Method(selector = "tabBarController:sidebar:contextMenuConfigurationForTab:")
    UIContextMenuConfiguration getContextMenuConfiguration(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UITab tab);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "tabBarController:sidebar:itemsForBeginningDragSession:tab:")
    NSArray<UIDragItem> getItemsForBeginningDragSession(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UIDragSession dragSession, UITab tab);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "tabBarController:sidebar:itemsForAddingToDragSession:tab:")
    NSArray<UIDragItem> getItemsForAddingToDragSession(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UIDragSession dragSession, UITab tab);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "tabBarController:sidebar:sidebarAction:group:operationForAcceptingItemsFromDropSession:")
    UIDropOperation getOperationForAcceptingItems(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UIAction sidebarAction, UITabGroup group, UIDropSession session);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "tabBarController:sidebar:sidebarAction:group:acceptItemsFromDropSession:")
    void acceptItemsFromDropSession(UITabBarController tabBarController, UITabBarControllerSidebar sidebar, UIAction sidebarAction, UITabGroup group, UIDropSession session);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
