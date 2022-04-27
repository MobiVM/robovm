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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/WKUIDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "webView:createWebViewWithConfiguration:forNavigationAction:windowFeatures:")
    WKWebView createWebView(WKWebView webView, WKWebViewConfiguration configuration, WKNavigationAction navigationAction, WKWindowFeatures windowFeatures);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "webViewDidClose:")
    void didClose(WKWebView webView);
    @Method(selector = "webView:runJavaScriptAlertPanelWithMessage:initiatedByFrame:completionHandler:")
    void runJavaScriptAlertPanel(WKWebView webView, String message, WKFrameInfo frame, @Block Runnable completionHandler);
    @Method(selector = "webView:runJavaScriptConfirmPanelWithMessage:initiatedByFrame:completionHandler:")
    void runJavaScriptConfirmPanel(WKWebView webView, String message, WKFrameInfo frame, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "webView:runJavaScriptTextInputPanelWithPrompt:defaultText:initiatedByFrame:completionHandler:")
    void runJavaScriptTextInputPanel(WKWebView webView, String prompt, String defaultText, WKFrameInfo frame, @Block VoidBlock1<NSString> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "webView:requestMediaCapturePermissionForOrigin:initiatedByFrame:type:decisionHandler:")
    void requestMediaCapturePermission(WKWebView webView, WKSecurityOrigin origin, WKFrameInfo frame, WKMediaCaptureType type, @Block VoidBlock1<WKPermissionDecision> decisionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "webView:requestDeviceOrientationAndMotionPermissionForOrigin:initiatedByFrame:decisionHandler:")
    void requestDeviceOrientationAndMotionPermission(WKWebView webView, WKSecurityOrigin origin, WKFrameInfo frame, @Block VoidBlock1<WKPermissionDecision> decisionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use webView:contextMenuConfigurationForElement:completionHandler:
     */
    @Deprecated
    @Method(selector = "webView:shouldPreviewElement:")
    boolean shouldPreviewElement(WKWebView webView, WKPreviewElementInfo elementInfo);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use webView:contextMenuConfigurationForElement:completionHandler:
     */
    @Deprecated
    @Method(selector = "webView:previewingViewControllerForElement:defaultActions:")
    UIViewController getPreviewingViewControllerForElement(WKWebView webView, WKPreviewElementInfo elementInfo, NSArray<?> previewActions);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use webView:contextMenuForElement:willCommitWithAnimator:
     */
    @Deprecated
    @Method(selector = "webView:commitPreviewingViewController:")
    void commitPreviewingViewController(WKWebView webView, UIViewController previewingViewController);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webView:contextMenuConfigurationForElement:completionHandler:")
    void getContextMenuConfiguration(WKWebView webView, WKContextMenuElementInfo elementInfo, @Block VoidBlock1<UIContextMenuConfiguration> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webView:contextMenuWillPresentForElement:")
    void contextMenuWillPresent(WKWebView webView, WKContextMenuElementInfo elementInfo);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webView:contextMenuForElement:willCommitWithAnimator:")
    void getContextMenu(WKWebView webView, WKContextMenuElementInfo elementInfo, UIContextMenuInteractionCommitAnimating animator);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webView:contextMenuDidEndForElement:")
    void contextMenuDidEnd(WKWebView webView, WKContextMenuElementInfo elementInfo);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
