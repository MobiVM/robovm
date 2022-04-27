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
/**
 * @deprecated Deprecated in iOS 14.0. Use enumeration based NSFileProviderExtension instead
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDocumentPickerExtensionViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIDocumentPickerExtensionViewControllerPtr extends Ptr<UIDocumentPickerExtensionViewController, UIDocumentPickerExtensionViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIDocumentPickerExtensionViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIDocumentPickerExtensionViewController() {}
    protected UIDocumentPickerExtensionViewController(Handle h, long handle) { super(h, handle); }
    protected UIDocumentPickerExtensionViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNibName:bundle:")
    public UIDocumentPickerExtensionViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public UIDocumentPickerExtensionViewController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "documentPickerMode")
    public native UIDocumentPickerMode getDocumentPickerMode();
    @Property(selector = "originalURL")
    public native NSURL getOriginalURL();
    @Property(selector = "validTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getValidTypes();
    @Property(selector = "providerIdentifier")
    public native String getProviderIdentifier();
    @Property(selector = "documentStorageURL")
    public native NSURL getDocumentStorageURL();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "dismissGrantingAccessToURL:")
    public native void dismissGrantingAccessToURL(NSURL url);
    @Method(selector = "prepareForPresentationInMode:")
    public native void prepareForPresentation(UIDocumentPickerMode mode);
    /*</methods>*/
}
