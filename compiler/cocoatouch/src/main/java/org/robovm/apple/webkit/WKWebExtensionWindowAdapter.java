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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebExtensionWindowAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements WKWebExtensionWindow/*</implements>*/ {

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
    @NotImplemented("tabsForWebExtensionContext:")
    public NSArray<?> tabsForWebExtensionContext(WKWebExtensionContext context) { return null; }
    @NotImplemented("activeTabForWebExtensionContext:")
    public WKWebExtensionTab activeTabForWebExtensionContext(WKWebExtensionContext context) { return null; }
    @NotImplemented("windowTypeForWebExtensionContext:")
    public WKWebExtensionWindowType windowTypeForWebExtensionContext(WKWebExtensionContext context) { return null; }
    @NotImplemented("windowStateForWebExtensionContext:")
    public WKWebExtensionWindowState windowStateForWebExtensionContext(WKWebExtensionContext context) { return null; }
    @NotImplemented("setWindowState:forWebExtensionContext:completionHandler:")
    public void setWindowState(WKWebExtensionWindowState state, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("isPrivateForWebExtensionContext:")
    public boolean isPrivateForWebExtensionContext(WKWebExtensionContext context) { return false; }
    @NotImplemented("frameForWebExtensionContext:")
    public @ByVal CGRect frameForWebExtensionContext(WKWebExtensionContext context) { return null; }
    @NotImplemented("setFrame:forWebExtensionContext:completionHandler:")
    public void setFrame(@ByVal CGRect frame, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("focusForWebExtensionContext:completionHandler:")
    public void focus(WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("closeForWebExtensionContext:completionHandler:")
    public void close(WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    /*</methods>*/
}
