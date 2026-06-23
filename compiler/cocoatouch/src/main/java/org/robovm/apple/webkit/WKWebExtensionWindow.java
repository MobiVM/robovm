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
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/WKWebExtensionWindow/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "tabsForWebExtensionContext:")
    NSArray<?> tabsForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "activeTabForWebExtensionContext:")
    WKWebExtensionTab activeTabForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "windowTypeForWebExtensionContext:")
    WKWebExtensionWindowType windowTypeForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "windowStateForWebExtensionContext:")
    WKWebExtensionWindowState windowStateForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "setWindowState:forWebExtensionContext:completionHandler:")
    void setWindowState(WKWebExtensionWindowState state, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "isPrivateForWebExtensionContext:")
    boolean isPrivateForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "frameForWebExtensionContext:")
    @ByVal CGRect frameForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "setFrame:forWebExtensionContext:completionHandler:")
    void setFrame(@ByVal CGRect frame, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "focusForWebExtensionContext:completionHandler:")
    void focus(WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "closeForWebExtensionContext:completionHandler:")
    void close(WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
