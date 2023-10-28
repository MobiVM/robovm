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
 * @deprecated Deprecated in iOS 11.0. UIDocumentMenuViewController is deprecated. Use UIDocumentPickerViewController directly.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDocumentMenuViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIDocumentMenuViewControllerPtr extends Ptr<UIDocumentMenuViewController, UIDocumentMenuViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIDocumentMenuViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIDocumentMenuViewController() {}
    protected UIDocumentMenuViewController(Handle h, long handle) { super(h, handle); }
    protected UIDocumentMenuViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDocumentTypes:inMode:")
    public UIDocumentMenuViewController(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> allowedUTIs, UIDocumentPickerMode mode) { super((SkipInit) null); initObject(init(allowedUTIs, mode)); }
    @Method(selector = "initWithURL:inMode:")
    public UIDocumentMenuViewController(NSURL url, UIDocumentPickerMode mode) { super((SkipInit) null); initObject(init(url, mode)); }
    @Method(selector = "initWithCoder:")
    public UIDocumentMenuViewController(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithNibName:bundle:")
    public UIDocumentMenuViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native UIDocumentMenuDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIDocumentMenuDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDocumentTypes:inMode:")
    protected native @Pointer long init(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> allowedUTIs, UIDocumentPickerMode mode);
    @Method(selector = "initWithURL:inMode:")
    protected native @Pointer long init(NSURL url, UIDocumentPickerMode mode);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "addOptionWithTitle:image:order:handler:")
    public native void addOption(String title, UIImage image, UIDocumentMenuOrder order, @Block Runnable handler);
    /*</methods>*/
}
