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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/WKWebExtensionTab/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "windowForWebExtensionContext:")
    WKWebExtensionWindow windowForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "indexInWindowForWebExtensionContext:")
    @MachineSizedUInt long indexInWindowForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "parentTabForWebExtensionContext:")
    WKWebExtensionTab parentTabForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "setParentTab:forWebExtensionContext:completionHandler:")
    void setParentTab(WKWebExtensionTab parentTab, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "webViewForWebExtensionContext:")
    WKWebView webViewForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "titleForWebExtensionContext:")
    String titleForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "isPinnedForWebExtensionContext:")
    boolean isPinnedForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "setPinned:forWebExtensionContext:completionHandler:")
    void setPinned(boolean pinned, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "isReaderModeAvailableForWebExtensionContext:")
    boolean isReaderModeAvailableForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "isReaderModeActiveForWebExtensionContext:")
    boolean isReaderModeActiveForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "setReaderModeActive:forWebExtensionContext:completionHandler:")
    void setReaderModeActive(boolean active, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "isPlayingAudioForWebExtensionContext:")
    boolean isPlayingAudioForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "isMutedForWebExtensionContext:")
    boolean isMutedForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "setMuted:forWebExtensionContext:completionHandler:")
    void setMuted(boolean muted, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "sizeForWebExtensionContext:")
    @ByVal CGSize sizeForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "zoomFactorForWebExtensionContext:")
    double zoomFactorForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "setZoomFactor:forWebExtensionContext:completionHandler:")
    void setZoomFactor(double zoomFactor, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "urlForWebExtensionContext:")
    NSURL urlForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "pendingURLForWebExtensionContext:")
    NSURL pendingURLForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "isLoadingCompleteForWebExtensionContext:")
    boolean isLoadingCompleteForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "detectWebpageLocaleForWebExtensionContext:completionHandler:")
    void detectWebpageLocale(WKWebExtensionContext context, @Block VoidBlock2<NSLocale, NSError> completionHandler);
    @Method(selector = "takeSnapshotUsingConfiguration:forWebExtensionContext:completionHandler:")
    void takeSnapshot(WKSnapshotConfiguration configuration, WKWebExtensionContext context, @Block VoidBlock2<UIImage, NSError> completionHandler);
    @Method(selector = "loadURL:forWebExtensionContext:completionHandler:")
    void loadURL(NSURL url, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "reloadFromOrigin:forWebExtensionContext:completionHandler:")
    void reloadFromOrigin(boolean fromOrigin, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "goBackForWebExtensionContext:completionHandler:")
    void goBack(WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "goForwardForWebExtensionContext:completionHandler:")
    void goForward(WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "activateForWebExtensionContext:completionHandler:")
    void activate(WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "isSelectedForWebExtensionContext:")
    boolean isSelectedForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "setSelected:forWebExtensionContext:completionHandler:")
    void setSelected(boolean selected, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "duplicateUsingConfiguration:forWebExtensionContext:completionHandler:")
    void duplicateUsingConfiguration(WKWebExtensionTabConfiguration configuration, WKWebExtensionContext context, @Block VoidBlock2<WKWebExtensionTab, NSError> completionHandler);
    @Method(selector = "closeForWebExtensionContext:completionHandler:")
    void close(WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "shouldGrantPermissionsOnUserGestureForWebExtensionContext:")
    boolean shouldGrantPermissionsOnUserGestureForWebExtensionContext(WKWebExtensionContext context);
    @Method(selector = "shouldBypassPermissionsForWebExtensionContext:")
    boolean shouldBypassPermissionsForWebExtensionContext(WKWebExtensionContext context);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
