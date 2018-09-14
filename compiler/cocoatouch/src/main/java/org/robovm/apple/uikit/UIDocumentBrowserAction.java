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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDocumentBrowserAction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIDocumentBrowserActionPtr extends Ptr<UIDocumentBrowserAction, UIDocumentBrowserActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIDocumentBrowserAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIDocumentBrowserAction() {}
    protected UIDocumentBrowserAction(Handle h, long handle) { super(h, handle); }
    protected UIDocumentBrowserAction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:localizedTitle:availability:handler:")
    public UIDocumentBrowserAction(String identifier, String localizedTitle, UIDocumentBrowserActionAvailability availability, @Block VoidBlock1<NSArray<NSURL>> handler) { super((SkipInit) null); initObject(init(identifier, localizedTitle, availability, handler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "localizedTitle")
    public native String getLocalizedTitle();
    @Property(selector = "availability")
    public native UIDocumentBrowserActionAvailability getAvailability();
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "supportedContentTypes")
    public native NSArray<NSString> getSupportedContentTypes();
    @Property(selector = "setSupportedContentTypes:")
    public native void setSupportedContentTypes(NSArray<NSString> v);
    @Property(selector = "supportsMultipleItems")
    public native boolean supportsMultipleItems();
    @Property(selector = "setSupportsMultipleItems:")
    public native void setSupportsMultipleItems(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:localizedTitle:availability:handler:")
    protected native @Pointer long init(String identifier, String localizedTitle, UIDocumentBrowserActionAvailability availability, @Block VoidBlock1<NSArray<NSURL>> handler);
    /*</methods>*/
}
