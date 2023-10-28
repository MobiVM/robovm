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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIBarButtonItemGroup/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UIBarButtonItemGroupPtr extends Ptr<UIBarButtonItemGroup, UIBarButtonItemGroupPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIBarButtonItemGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIBarButtonItemGroup() {}
    protected UIBarButtonItemGroup(Handle h, long handle) { super(h, handle); }
    protected UIBarButtonItemGroup(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBarButtonItems:representativeItem:")
    public UIBarButtonItemGroup(NSArray<UIBarButtonItem> barButtonItems, UIBarButtonItem representativeItem) { super((SkipInit) null); initObject(init(barButtonItems, representativeItem)); }
    @Method(selector = "initWithCoder:")
    public UIBarButtonItemGroup(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "barButtonItems")
    public native NSArray<UIBarButtonItem> getBarButtonItems();
    @Property(selector = "setBarButtonItems:")
    public native void setBarButtonItems(NSArray<UIBarButtonItem> v);
    @Property(selector = "representativeItem")
    public native UIBarButtonItem getRepresentativeItem();
    @Property(selector = "setRepresentativeItem:")
    public native void setRepresentativeItem(UIBarButtonItem v);
    @Property(selector = "isDisplayingRepresentativeItem")
    public native boolean isDisplayingRepresentativeItem();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "alwaysAvailable")
    public native boolean alwaysAvailable();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setAlwaysAvailable:")
    public native void setAlwaysAvailable(boolean v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "menuRepresentation")
    public native UIMenuElement getMenuRepresentation();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setMenuRepresentation:")
    public native void setMenuRepresentation(UIMenuElement v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "isHidden")
    public native boolean isHidden();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setHidden:")
    public native void setHidden(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBarButtonItems:representativeItem:")
    protected native @Pointer long init(NSArray<UIBarButtonItem> barButtonItems, UIBarButtonItem representativeItem);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "fixedGroupWithRepresentativeItem:items:")
    public static native UIBarButtonItemGroup createfixedGroup(UIBarButtonItem representativeItem, NSArray<UIBarButtonItem> items);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "movableGroupWithCustomizationIdentifier:representativeItem:items:")
    public static native UIBarButtonItemGroup createMovableGroup(String customizationIdentifier, UIBarButtonItem representativeItem, NSArray<UIBarButtonItem> items);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "optionalGroupWithCustomizationIdentifier:inDefaultCustomization:representativeItem:items:")
    public static native UIBarButtonItemGroup createOptionalGroup(String customizationIdentifier, boolean inDefaultCustomization, UIBarButtonItem representativeItem, NSArray<UIBarButtonItem> items);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
