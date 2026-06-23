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
package org.robovm.apple.webkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebExtensionControllerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements WKWebExtensionControllerDelegate/*</implements>*/ {

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
    @NotImplemented("webExtensionController:openWindowsForExtensionContext:")
    public NSArray<?> openWindows(WKWebExtensionController controller, WKWebExtensionContext extensionContext) { return null; }
    @NotImplemented("webExtensionController:focusedWindowForExtensionContext:")
    public WKWebExtensionWindow focusedWindow(WKWebExtensionController controller, WKWebExtensionContext extensionContext) { return null; }
    @NotImplemented("webExtensionController:openNewWindowUsingConfiguration:forExtensionContext:completionHandler:")
    public void openNewWindow(WKWebExtensionController controller, WKWebExtensionWindowConfiguration configuration, WKWebExtensionContext extensionContext, @Block VoidBlock2<WKWebExtensionWindow, NSError> completionHandler) {}
    @NotImplemented("webExtensionController:openNewTabUsingConfiguration:forExtensionContext:completionHandler:")
    public void openNewTab(WKWebExtensionController controller, WKWebExtensionTabConfiguration configuration, WKWebExtensionContext extensionContext, @Block VoidBlock2<WKWebExtensionTab, NSError> completionHandler) {}
    @NotImplemented("webExtensionController:openOptionsPageForExtensionContext:completionHandler:")
    public void openOptionsPage(WKWebExtensionController controller, WKWebExtensionContext extensionContext, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("webExtensionController:promptForPermissions:inTab:forExtensionContext:completionHandler:")
    public void promptForPermissions(WKWebExtensionController controller, NSSet<NSString> permissions, WKWebExtensionTab tab, WKWebExtensionContext extensionContext, @Block VoidBlock2<NSSet<NSString>, NSDate> completionHandler) {}
    @NotImplemented("webExtensionController:promptForPermissionToAccessURLs:inTab:forExtensionContext:completionHandler:")
    public void promptForPermission(WKWebExtensionController controller, NSSet<NSURL> urls, WKWebExtensionTab tab, WKWebExtensionContext extensionContext, @Block VoidBlock2<NSSet<NSURL>, NSDate> completionHandler) {}
    @NotImplemented("webExtensionController:promptForPermissionMatchPatterns:inTab:forExtensionContext:completionHandler:")
    public void promptForPermissionMatchPatterns(WKWebExtensionController controller, NSSet<WKWebExtensionMatchPattern> matchPatterns, WKWebExtensionTab tab, WKWebExtensionContext extensionContext, @Block VoidBlock2<NSSet<WKWebExtensionMatchPattern>, NSDate> completionHandler) {}
    @NotImplemented("webExtensionController:didUpdateAction:forExtensionContext:")
    public void didUpdateAction(WKWebExtensionController controller, WKWebExtensionAction action, WKWebExtensionContext context) {}
    @NotImplemented("webExtensionController:presentPopupForAction:forExtensionContext:completionHandler:")
    public void presentPopup(WKWebExtensionController controller, WKWebExtensionAction action, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("webExtensionController:sendMessage:toApplicationWithIdentifier:forExtensionContext:replyHandler:")
    public void sendMessage(WKWebExtensionController controller, NSObject message, String applicationIdentifier, WKWebExtensionContext extensionContext, @Block VoidBlock2<NSObject, NSError> replyHandler) {}
    @NotImplemented("webExtensionController:connectUsingMessagePort:forExtensionContext:completionHandler:")
    public void connectUsingMessagePort(WKWebExtensionController controller, WKWebExtensionMessagePort port, WKWebExtensionContext extensionContext, @Block VoidBlock1<NSError> completionHandler) {}
    /*</methods>*/
}
