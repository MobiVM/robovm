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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebExtensionTabAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements WKWebExtensionTab/*</implements>*/ {

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
    @NotImplemented("windowForWebExtensionContext:")
    public WKWebExtensionWindow windowForWebExtensionContext(WKWebExtensionContext context) { return null; }
    @NotImplemented("indexInWindowForWebExtensionContext:")
    public @MachineSizedUInt long indexInWindowForWebExtensionContext(WKWebExtensionContext context) { return 0; }
    @NotImplemented("parentTabForWebExtensionContext:")
    public WKWebExtensionTab parentTabForWebExtensionContext(WKWebExtensionContext context) { return null; }
    @NotImplemented("setParentTab:forWebExtensionContext:completionHandler:")
    public void setParentTab(WKWebExtensionTab parentTab, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("webViewForWebExtensionContext:")
    public WKWebView webViewForWebExtensionContext(WKWebExtensionContext context) { return null; }
    @NotImplemented("titleForWebExtensionContext:")
    public String titleForWebExtensionContext(WKWebExtensionContext context) { return null; }
    @NotImplemented("isPinnedForWebExtensionContext:")
    public boolean isPinnedForWebExtensionContext(WKWebExtensionContext context) { return false; }
    @NotImplemented("setPinned:forWebExtensionContext:completionHandler:")
    public void setPinned(boolean pinned, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("isReaderModeAvailableForWebExtensionContext:")
    public boolean isReaderModeAvailableForWebExtensionContext(WKWebExtensionContext context) { return false; }
    @NotImplemented("isReaderModeActiveForWebExtensionContext:")
    public boolean isReaderModeActiveForWebExtensionContext(WKWebExtensionContext context) { return false; }
    @NotImplemented("setReaderModeActive:forWebExtensionContext:completionHandler:")
    public void setReaderModeActive(boolean active, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("isPlayingAudioForWebExtensionContext:")
    public boolean isPlayingAudioForWebExtensionContext(WKWebExtensionContext context) { return false; }
    @NotImplemented("isMutedForWebExtensionContext:")
    public boolean isMutedForWebExtensionContext(WKWebExtensionContext context) { return false; }
    @NotImplemented("setMuted:forWebExtensionContext:completionHandler:")
    public void setMuted(boolean muted, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("sizeForWebExtensionContext:")
    public @ByVal CGSize sizeForWebExtensionContext(WKWebExtensionContext context) { return null; }
    @NotImplemented("zoomFactorForWebExtensionContext:")
    public double zoomFactorForWebExtensionContext(WKWebExtensionContext context) { return 0; }
    @NotImplemented("setZoomFactor:forWebExtensionContext:completionHandler:")
    public void setZoomFactor(double zoomFactor, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("urlForWebExtensionContext:")
    public NSURL urlForWebExtensionContext(WKWebExtensionContext context) { return null; }
    @NotImplemented("pendingURLForWebExtensionContext:")
    public NSURL pendingURLForWebExtensionContext(WKWebExtensionContext context) { return null; }
    @NotImplemented("isLoadingCompleteForWebExtensionContext:")
    public boolean isLoadingCompleteForWebExtensionContext(WKWebExtensionContext context) { return false; }
    @NotImplemented("detectWebpageLocaleForWebExtensionContext:completionHandler:")
    public void detectWebpageLocale(WKWebExtensionContext context, @Block VoidBlock2<NSLocale, NSError> completionHandler) {}
    @NotImplemented("takeSnapshotUsingConfiguration:forWebExtensionContext:completionHandler:")
    public void takeSnapshot(WKSnapshotConfiguration configuration, WKWebExtensionContext context, @Block VoidBlock2<UIImage, NSError> completionHandler) {}
    @NotImplemented("loadURL:forWebExtensionContext:completionHandler:")
    public void loadURL(NSURL url, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("reloadFromOrigin:forWebExtensionContext:completionHandler:")
    public void reloadFromOrigin(boolean fromOrigin, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("goBackForWebExtensionContext:completionHandler:")
    public void goBack(WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("goForwardForWebExtensionContext:completionHandler:")
    public void goForward(WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("activateForWebExtensionContext:completionHandler:")
    public void activate(WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("isSelectedForWebExtensionContext:")
    public boolean isSelectedForWebExtensionContext(WKWebExtensionContext context) { return false; }
    @NotImplemented("setSelected:forWebExtensionContext:completionHandler:")
    public void setSelected(boolean selected, WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("duplicateUsingConfiguration:forWebExtensionContext:completionHandler:")
    public void duplicateUsingConfiguration(WKWebExtensionTabConfiguration configuration, WKWebExtensionContext context, @Block VoidBlock2<WKWebExtensionTab, NSError> completionHandler) {}
    @NotImplemented("closeForWebExtensionContext:completionHandler:")
    public void close(WKWebExtensionContext context, @Block VoidBlock1<NSError> completionHandler) {}
    @NotImplemented("shouldGrantPermissionsOnUserGestureForWebExtensionContext:")
    public boolean shouldGrantPermissionsOnUserGestureForWebExtensionContext(WKWebExtensionContext context) { return false; }
    @NotImplemented("shouldBypassPermissionsForWebExtensionContext:")
    public boolean shouldBypassPermissionsForWebExtensionContext(WKWebExtensionContext context) { return false; }
    /*</methods>*/
}
