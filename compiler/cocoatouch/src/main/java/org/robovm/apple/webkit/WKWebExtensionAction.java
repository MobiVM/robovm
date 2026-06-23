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
/*<annotations>*/@Library("WebKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebExtensionAction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WKWebExtensionActionPtr extends Ptr<WKWebExtensionAction, WKWebExtensionActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKWebExtensionAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected WKWebExtensionAction() {}
    protected WKWebExtensionAction(Handle h, long handle) { super(h, handle); }
    protected WKWebExtensionAction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "webExtensionContext")
    public native WKWebExtensionContext getWebExtensionContext();
    @Property(selector = "associatedTab")
    public native WKWebExtensionTab getAssociatedTab();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "badgeText")
    public native String getBadgeText();
    @Property(selector = "hasUnreadBadgeText")
    public native boolean hasUnreadBadgeText();
    @Property(selector = "setHasUnreadBadgeText:")
    public native void setHasUnreadBadgeText(boolean v);
    @Property(selector = "inspectionName")
    public native String getInspectionName();
    @Property(selector = "setInspectionName:")
    public native void setInspectionName(String v);
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "menuItems")
    public native NSArray<UIMenuElement> getMenuItems();
    @Property(selector = "presentsPopup")
    public native boolean presentsPopup();
    @Property(selector = "popupViewController")
    public native UIViewController getPopupViewController();
    @Property(selector = "popupWebView")
    public native WKWebView getPopupWebView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "iconForSize:")
    public native UIImage iconForSize(@ByVal CGSize size);
    @Method(selector = "closePopup")
    public native void closePopup();
    /*</methods>*/
}
