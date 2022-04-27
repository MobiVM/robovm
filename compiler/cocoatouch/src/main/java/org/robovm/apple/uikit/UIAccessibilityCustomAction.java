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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIAccessibilityCustomAction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIAccessibilityCustomActionPtr extends Ptr<UIAccessibilityCustomAction, UIAccessibilityCustomActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIAccessibilityCustomAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIAccessibilityCustomAction() {}
    protected UIAccessibilityCustomAction(Handle h, long handle) { super(h, handle); }
    protected UIAccessibilityCustomAction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:target:selector:")
    public UIAccessibilityCustomAction(String name, NSObject target, Selector selector) { super((SkipInit) null); initObject(init(name, target, selector)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithAttributedName:target:selector:")
    public UIAccessibilityCustomAction(NSAttributedString attributedName, NSObject target, Selector selector) { super((SkipInit) null); initObject(init(attributedName, target, selector)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithName:image:target:selector:")
    public UIAccessibilityCustomAction(String name, UIImage image, NSObject target, Selector selector) { super((SkipInit) null); initObject(init(name, image, target, selector)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithAttributedName:image:target:selector:")
    public UIAccessibilityCustomAction(NSAttributedString attributedName, UIImage image, NSObject target, Selector selector) { super((SkipInit) null); initObject(init(attributedName, image, target, selector)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithName:actionHandler:")
    public UIAccessibilityCustomAction(String name, @Block Block1<UIAccessibilityCustomAction, Boolean> actionHandler) { super((SkipInit) null); initObject(init(name, actionHandler)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithAttributedName:actionHandler:")
    public UIAccessibilityCustomAction(NSAttributedString attributedName, @Block Block1<UIAccessibilityCustomAction, Boolean> actionHandler) { super((SkipInit) null); initObject(init(attributedName, actionHandler)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithName:image:actionHandler:")
    public UIAccessibilityCustomAction(String name, UIImage image, @Block Block1<UIAccessibilityCustomAction, Boolean> actionHandler) { super((SkipInit) null); initObject(init(name, image, actionHandler)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithAttributedName:image:actionHandler:")
    public UIAccessibilityCustomAction(NSAttributedString attributedName, UIImage image, @Block Block1<UIAccessibilityCustomAction, Boolean> actionHandler) { super((SkipInit) null); initObject(init(attributedName, image, actionHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "attributedName")
    public native NSAttributedString getAttributedName();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAttributedName:")
    public native void setAttributedName(NSAttributedString v);
    @Property(selector = "target")
    public native NSObject getTarget();
    @Property(selector = "setTarget:", strongRef = true)
    public native void setTarget(NSObject v);
    @Property(selector = "selector")
    public native Selector getSelector();
    @Property(selector = "setSelector:", strongRef = true)
    public native void setSelector(Selector v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "actionHandler")
    public native @Block Block1<UIAccessibilityCustomAction, Boolean> getActionHandler();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setActionHandler:")
    public native void setActionHandler(@Block Block1<UIAccessibilityCustomAction, Boolean> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:target:selector:")
    protected native @Pointer long init(String name, NSObject target, Selector selector);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithAttributedName:target:selector:")
    protected native @Pointer long init(NSAttributedString attributedName, NSObject target, Selector selector);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithName:image:target:selector:")
    protected native @Pointer long init(String name, UIImage image, NSObject target, Selector selector);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithAttributedName:image:target:selector:")
    protected native @Pointer long init(NSAttributedString attributedName, UIImage image, NSObject target, Selector selector);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithName:actionHandler:")
    protected native @Pointer long init(String name, @Block Block1<UIAccessibilityCustomAction, Boolean> actionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithAttributedName:actionHandler:")
    protected native @Pointer long init(NSAttributedString attributedName, @Block Block1<UIAccessibilityCustomAction, Boolean> actionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithName:image:actionHandler:")
    protected native @Pointer long init(String name, UIImage image, @Block Block1<UIAccessibilityCustomAction, Boolean> actionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithAttributedName:image:actionHandler:")
    protected native @Pointer long init(NSAttributedString attributedName, UIImage image, @Block Block1<UIAccessibilityCustomAction, Boolean> actionHandler);
    /*</methods>*/
}
