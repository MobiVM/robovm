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
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITraitCollection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UITraitCollectionPtr extends Ptr<UITraitCollection, UITraitCollectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITraitCollection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITraitCollection() {}
    protected UITraitCollection(Handle h, long handle) { super(h, handle); }
    protected UITraitCollection(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UITraitCollection(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    public UITraitCollection(UIUserInterfaceStyle userInterfaceStyle) { super((Handle) null, create(userInterfaceStyle)); retain(getHandle()); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    public UITraitCollection(UITraitEnvironmentLayoutDirection layoutDirection) { super((Handle) null, create(layoutDirection)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public UITraitCollection(UIForceTouchCapability capability) { super((Handle) null, create(capability)); retain(getHandle()); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    public UITraitCollection(UIContentSizeCategory preferredContentSizeCategory) { super((Handle) null, create(preferredContentSizeCategory)); retain(getHandle()); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    public UITraitCollection(UIDisplayGamut displayGamut) { super((Handle) null, create(displayGamut)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userInterfaceIdiom")
    public native UIUserInterfaceIdiom getUserInterfaceIdiom();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "userInterfaceStyle")
    public native UIUserInterfaceStyle getUserInterfaceStyle();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "layoutDirection")
    public native UITraitEnvironmentLayoutDirection getLayoutDirection();
    @Property(selector = "displayScale")
    public native @MachineSizedFloat double getDisplayScale();
    @Property(selector = "horizontalSizeClass")
    public native UIUserInterfaceSizeClass getHorizontalSizeClass();
    @Property(selector = "verticalSizeClass")
    public native UIUserInterfaceSizeClass getVerticalSizeClass();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "forceTouchCapability")
    public native UIForceTouchCapability getForceTouchCapability();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "preferredContentSizeCategory")
    public native String getPreferredContentSizeCategory();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "displayGamut")
    public native UIDisplayGamut getDisplayGamut();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    @Method(selector = "containsTraitsInCollection:")
    public native boolean containsTraits(UITraitCollection trait);
    @Method(selector = "traitCollectionWithTraitsFromCollections:")
    public static native UITraitCollection createWithTraits(NSArray<UITraitCollection> traitCollections);
    @Method(selector = "traitCollectionWithUserInterfaceIdiom:")
    public static native UITraitCollection createWithUserInterfaceIdiom(UIUserInterfaceIdiom idiom);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "traitCollectionWithUserInterfaceStyle:")
    protected static native @Pointer long create(UIUserInterfaceStyle userInterfaceStyle);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "traitCollectionWithLayoutDirection:")
    protected static native @Pointer long create(UITraitEnvironmentLayoutDirection layoutDirection);
    @Method(selector = "traitCollectionWithDisplayScale:")
    public static native UITraitCollection createWithDisplayScale(@MachineSizedFloat double scale);
    @Method(selector = "traitCollectionWithHorizontalSizeClass:")
    public static native UITraitCollection createWithHorizontalSizeClass(UIUserInterfaceSizeClass horizontalSizeClass);
    @Method(selector = "traitCollectionWithVerticalSizeClass:")
    public static native UITraitCollection createWithVerticalSizeClass(UIUserInterfaceSizeClass verticalSizeClass);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "traitCollectionWithForceTouchCapability:")
    protected static native @Pointer long create(UIForceTouchCapability capability);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "traitCollectionWithPreferredContentSizeCategory:")
    protected static native @Pointer long create(UIContentSizeCategory preferredContentSizeCategory);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "traitCollectionWithDisplayGamut:")
    protected static native @Pointer long create(UIDisplayGamut displayGamut);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
