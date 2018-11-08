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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDocumentBrowserViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UIDocumentBrowserViewControllerPtr extends Ptr<UIDocumentBrowserViewController, UIDocumentBrowserViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIDocumentBrowserViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIDocumentBrowserViewController() {}
    protected UIDocumentBrowserViewController(Handle h, long handle) { super(h, handle); }
    protected UIDocumentBrowserViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initForOpeningFilesWithContentTypes:")
    public UIDocumentBrowserViewController(NSArray<NSString> allowedContentTypes) { super((SkipInit) null); initObject(initForOpeningFilesWithContentTypes(allowedContentTypes)); }
    @Method(selector = "initWithCoder:")
    public UIDocumentBrowserViewController(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native UIDocumentBrowserViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIDocumentBrowserViewControllerDelegate v);
    @Property(selector = "allowsDocumentCreation")
    public native boolean allowsDocumentCreation();
    @Property(selector = "setAllowsDocumentCreation:")
    public native void setAllowsDocumentCreation(boolean v);
    @Property(selector = "allowsPickingMultipleItems")
    public native boolean allowsPickingMultipleItems();
    @Property(selector = "setAllowsPickingMultipleItems:")
    public native void setAllowsPickingMultipleItems(boolean v);
    @Property(selector = "allowedContentTypes")
    public native NSArray<NSString> getAllowedContentTypes();
    @Property(selector = "additionalLeadingNavigationBarButtonItems")
    public native NSArray<UIBarButtonItem> getAdditionalLeadingNavigationBarButtonItems();
    @Property(selector = "setAdditionalLeadingNavigationBarButtonItems:")
    public native void setAdditionalLeadingNavigationBarButtonItems(NSArray<UIBarButtonItem> v);
    @Property(selector = "additionalTrailingNavigationBarButtonItems")
    public native NSArray<UIBarButtonItem> getAdditionalTrailingNavigationBarButtonItems();
    @Property(selector = "setAdditionalTrailingNavigationBarButtonItems:")
    public native void setAdditionalTrailingNavigationBarButtonItems(NSArray<UIBarButtonItem> v);
    @Property(selector = "customActions")
    public native NSArray<UIDocumentBrowserAction> getCustomActions();
    @Property(selector = "setCustomActions:")
    public native void setCustomActions(NSArray<UIDocumentBrowserAction> v);
    @Property(selector = "browserUserInterfaceStyle")
    public native UIDocumentBrowserUserInterfaceStyle getBrowserUserInterfaceStyle();
    @Property(selector = "setBrowserUserInterfaceStyle:")
    public native void setBrowserUserInterfaceStyle(UIDocumentBrowserUserInterfaceStyle v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initForOpeningFilesWithContentTypes:")
    protected native @Pointer long initForOpeningFilesWithContentTypes(NSArray<NSString> allowedContentTypes);
    @Method(selector = "revealDocumentAtURL:importIfNeeded:completion:")
    public native void revealDocument(NSURL url, boolean importIfNeeded, @Block VoidBlock2<NSURL, NSError> completion);
    @Method(selector = "importDocumentAtURL:nextToDocumentAtURL:mode:completionHandler:")
    public native void importDocument(NSURL documentURL, NSURL neighbourURL, UIDocumentBrowserImportMode importMode, @Block VoidBlock2<NSURL, NSError> completion);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "transitionControllerForDocumentAtURL:")
    public native UIDocumentBrowserTransitionController transitionControllerForDocumentAtURL(NSURL documentURL);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 12.0.
     */
    @Deprecated
    @Method(selector = "transitionControllerForDocumentURL:")
    public native UIDocumentBrowserTransitionController transitionControllerForDocumentURL(NSURL documentURL);
    /*</methods>*/
}
