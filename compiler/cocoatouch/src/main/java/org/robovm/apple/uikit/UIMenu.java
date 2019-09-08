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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIMenu/*</name>*/ 
    extends /*<extends>*/UIMenuElement/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIMenuPtr extends Ptr<UIMenu, UIMenuPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIMenu.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIMenu() {}
    protected UIMenu(Handle h, long handle) { super(h, handle); }
    protected UIMenu(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIMenu(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    public UIMenu(String title, NSArray<UIMenuElement> children) { super((Handle) null, create(title, children)); retain(getHandle()); }
    public UIMenu(String title, UIImage image, UIMenuIdentifier identifier, UIMenuOptions options, NSArray<UIMenuElement> children) { super((Handle) null, create(title, image, identifier, options, children)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native UIMenuIdentifier getIdentifier();
    @Property(selector = "options")
    public native UIMenuOptions getOptions();
    @Property(selector = "children")
    public native NSArray<UIMenuElement> getChildren();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "menuByReplacingChildren:")
    public native UIMenu menuByReplacingChildren(NSArray<UIMenuElement> newChildren);
    @Method(selector = "menuWithTitle:children:")
    protected static native @Pointer long create(String title, NSArray<UIMenuElement> children);
    @Method(selector = "menuWithTitle:image:identifier:options:children:")
    protected static native @Pointer long create(String title, UIImage image, UIMenuIdentifier identifier, UIMenuOptions options, NSArray<UIMenuElement> children);
    /*</methods>*/
}
