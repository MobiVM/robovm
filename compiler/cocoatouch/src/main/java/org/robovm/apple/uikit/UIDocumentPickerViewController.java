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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDocumentPickerViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIDocumentPickerViewControllerPtr extends Ptr<UIDocumentPickerViewController, UIDocumentPickerViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIDocumentPickerViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIDocumentPickerViewController() {}
    protected UIDocumentPickerViewController(Handle h, long handle) { super(h, handle); }
    protected UIDocumentPickerViewController(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Deprecated in iOS 14.0. use initForOpeningContentTypes:asCopy: or initForOpeningContentTypes: instead
     */
    @Deprecated
    @Method(selector = "initWithDocumentTypes:inMode:")
    public UIDocumentPickerViewController(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> allowedUTIs, UIDocumentPickerMode mode) { super((SkipInit) null); initObject(init(allowedUTIs, mode)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initForOpeningContentTypes:asCopy:")
    public static  UIDocumentPickerViewController createForOpeningContentTypes(NSArray<org.robovm.apple.uniformtypeid.UTType> contentTypes, boolean asCopy) {
       UIDocumentPickerViewController res = new UIDocumentPickerViewController((SkipInit) null);
       res.initObject(res.initForOpeningContentTypesAsCopy(contentTypes, asCopy));
       return res;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initForOpeningContentTypes:")
    public static  UIDocumentPickerViewController createForOpeningContentTypes(NSArray<org.robovm.apple.uniformtypeid.UTType> contentTypes) {
       UIDocumentPickerViewController res = new UIDocumentPickerViewController((SkipInit) null);
       res.initObject(res.initForOpeningContentTypes(contentTypes));
       return res;
    }
    @Method(selector = "initWithCoder:")
    public UIDocumentPickerViewController(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /**
     * @deprecated Deprecated in iOS 14.0. use initForExportingURLs:asCopy: or initForExportingURLs: instead
     */
    @Deprecated
    @Method(selector = "initWithURL:inMode:")
    public UIDocumentPickerViewController(NSURL url, UIDocumentPickerMode mode) { super((SkipInit) null); initObject(init(url, mode)); }
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 14.0. use initForExportingURLs:asCopy: or initForExportingURLs: instead
     */
    @Deprecated
    @Method(selector = "initWithURLs:inMode:")
    public UIDocumentPickerViewController(NSArray<NSURL> urls, UIDocumentPickerMode mode) { super((SkipInit) null); initObject(init(urls, mode)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initForExportingURLs:asCopy:")
    public static  UIDocumentPickerViewController createForExportingURLs(NSArray<NSURL> urls, boolean asCopy) {
       UIDocumentPickerViewController res = new UIDocumentPickerViewController((SkipInit) null);
       res.initObject(res.initForExportingURLsAsCopy(urls, asCopy));
       return res;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initForExportingURLs:")
    public UIDocumentPickerViewController(NSArray<NSURL> urls) { super((SkipInit) null); initObject(initForExportingURLs(urls)); }
    @Method(selector = "initWithNibName:bundle:")
    public UIDocumentPickerViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native UIDocumentPickerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIDocumentPickerDelegate v);
    /**
     * @deprecated Deprecated in iOS 14.0. Use appropriate initializers instead
     */
    @Deprecated
    @Property(selector = "documentPickerMode")
    public native UIDocumentPickerMode getDocumentPickerMode();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "allowsMultipleSelection")
    public native boolean allowsMultipleSelection();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "shouldShowFileExtensions")
    public native boolean shouldShowFileExtensions();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setShouldShowFileExtensions:")
    public native void setShouldShowFileExtensions(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "directoryURL")
    public native NSURL getDirectoryURL();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setDirectoryURL:")
    public native void setDirectoryURL(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 14.0. use initForOpeningContentTypes:asCopy: or initForOpeningContentTypes: instead
     */
    @Deprecated
    @Method(selector = "initWithDocumentTypes:inMode:")
    protected native @Pointer long init(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> allowedUTIs, UIDocumentPickerMode mode);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initForOpeningContentTypes:asCopy:")
    protected native @Pointer long initForOpeningContentTypesAsCopy(NSArray<org.robovm.apple.uniformtypeid.UTType> contentTypes, boolean asCopy);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initForOpeningContentTypes:")
    protected native @Pointer long initForOpeningContentTypes(NSArray<org.robovm.apple.uniformtypeid.UTType> contentTypes);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /**
     * @deprecated Deprecated in iOS 14.0. use initForExportingURLs:asCopy: or initForExportingURLs: instead
     */
    @Deprecated
    @Method(selector = "initWithURL:inMode:")
    protected native @Pointer long init(NSURL url, UIDocumentPickerMode mode);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 14.0. use initForExportingURLs:asCopy: or initForExportingURLs: instead
     */
    @Deprecated
    @Method(selector = "initWithURLs:inMode:")
    protected native @Pointer long init(NSArray<NSURL> urls, UIDocumentPickerMode mode);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initForExportingURLs:asCopy:")
    protected native @Pointer long initForExportingURLsAsCopy(NSArray<NSURL> urls, boolean asCopy);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initForExportingURLs:")
    protected native @Pointer long initForExportingURLs(NSArray<NSURL> urls);
    /*</methods>*/
}
