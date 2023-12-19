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
    public UITraitCollection(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
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
    /**
     * @since Available in iOS 13.0 and later.
     */
    public UITraitCollection(UIAccessibilityContrast accessibilityContrast) { super((Handle) null, create(accessibilityContrast)); retain(getHandle()); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public UITraitCollection(UIUserInterfaceLevel userInterfaceLevel) { super((Handle) null, create(userInterfaceLevel)); retain(getHandle()); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public UITraitCollection(UILegibilityWeight legibilityWeight) { super((Handle) null, create(legibilityWeight)); retain(getHandle()); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public UITraitCollection(UIUserInterfaceActiveAppearance userInterfaceActiveAppearance) { super((Handle) null, create(userInterfaceActiveAppearance)); retain(getHandle()); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    public UITraitCollection(UIImageDynamicRange imageDynamicRange) { super((Handle) null, create(imageDynamicRange)); retain(getHandle()); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    public UITraitCollection(String language) { super((Handle) null, create(language)); retain(getHandle()); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    public UITraitCollection(UISceneCaptureState sceneCaptureState) { super((Handle) null, create(sceneCaptureState)); retain(getHandle()); }
    public UITraitCollection(@Block VoidBlock1<UIMutableTraits> mutations) { super((Handle) null, create(mutations)); retain(getHandle()); }
    public UITraitCollection(@MachineSizedFloat double value, Class<?> trait) { super((Handle) null, create(value, trait)); retain(getHandle()); }
    public UITraitCollection(@MachineSizedSInt long value, Class<?> trait) { super((Handle) null, create(value, trait)); retain(getHandle()); }
    public UITraitCollection(NSObject object, Class<?> trait) { super((Handle) null, create(object, trait)); retain(getHandle()); }
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
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "accessibilityContrast")
    public native UIAccessibilityContrast getAccessibilityContrast();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "userInterfaceLevel")
    public native UIUserInterfaceLevel getUserInterfaceLevel();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "legibilityWeight")
    public native UILegibilityWeight getLegibilityWeight();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "activeAppearance")
    public native UIUserInterfaceActiveAppearance getActiveAppearance();
    @Property(selector = "toolbarItemPresentationSize")
    public native UINSToolbarItemPresentationSize getToolbarItemPresentationSize();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "imageDynamicRange")
    public native UIImageDynamicRange getImageDynamicRange();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "typesettingLanguage")
    public native String getTypesettingLanguage();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "sceneCaptureState")
    public native UISceneCaptureState getSceneCaptureState();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "currentTraitCollection")
    public static native UITraitCollection getCurrentTraitCollection();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setCurrentTraitCollection:")
    public static native void setCurrentTraitCollection(UITraitCollection v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "imageConfiguration")
    public native UIImageConfiguration getImageConfiguration();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /**
     * @deprecated Deprecated in iOS 17.0. Compare values for specific traits in the trait collections instead
     */
    @Deprecated
    @Method(selector = "containsTraitsInCollection:")
    public native boolean containsTraits(UITraitCollection trait);
    /**
     * @deprecated Deprecated in iOS 17.0. Use +[UITraitCollection traitCollectionWithTraits:] and -[UITraitCollection traitCollectionByModifyingTraits:] to create and modify trait collections
     */
    @Deprecated
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
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "traitCollectionWithAccessibilityContrast:")
    protected static native @Pointer long create(UIAccessibilityContrast accessibilityContrast);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "traitCollectionWithUserInterfaceLevel:")
    protected static native @Pointer long create(UIUserInterfaceLevel userInterfaceLevel);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "traitCollectionWithLegibilityWeight:")
    protected static native @Pointer long create(UILegibilityWeight legibilityWeight);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "traitCollectionWithActiveAppearance:")
    protected static native @Pointer long create(UIUserInterfaceActiveAppearance userInterfaceActiveAppearance);
    @Method(selector = "traitCollectionWithToolbarItemPresentationSize:")
    public static native UITraitCollection createWithToolbarItemPresentationSize(UINSToolbarItemPresentationSize toolbarItemPresentationSize);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "traitCollectionWithImageDynamicRange:")
    protected static native @Pointer long create(UIImageDynamicRange imageDynamicRange);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "traitCollectionWithTypesettingLanguage:")
    protected static native @Pointer long create(String language);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "traitCollectionWithSceneCaptureState:")
    protected static native @Pointer long create(UISceneCaptureState sceneCaptureState);
    @Method(selector = "traitCollectionByModifyingTraits:")
    public native UITraitCollection traitCollectionByModifyingTraits(@Block VoidBlock1<UIMutableTraits> mutations);
    @Method(selector = "traitCollectionByReplacingCGFloatValue:forTrait:")
    public native UITraitCollection traitCollectionByReplacing(@MachineSizedFloat double value, Class<?> trait);
    @Method(selector = "valueForCGFloatTrait:")
    public native @MachineSizedFloat double valueForCGFloatTrait(Class<?> trait);
    @Method(selector = "traitCollectionByReplacingNSIntegerValue:forTrait:")
    public native UITraitCollection traitCollectionByReplacing(@MachineSizedSInt long value, Class<?> trait);
    @Method(selector = "valueForNSIntegerTrait:")
    public native @MachineSizedSInt long valueForNSIntegerTrait(Class<?> trait);
    @Method(selector = "traitCollectionByReplacingObject:forTrait:")
    public native UITraitCollection traitCollectionByReplacing(NSObject object, Class<?> trait);
    @Method(selector = "objectForTrait:")
    public native NSObject objectForTrait(Class<?> trait);
    @Method(selector = "traitCollectionWithTraits:")
    protected static native @Pointer long create(@Block VoidBlock1<UIMutableTraits> mutations);
    @Method(selector = "traitCollectionWithCGFloatValue:forTrait:")
    protected static native @Pointer long create(@MachineSizedFloat double value, Class<?> trait);
    @Method(selector = "traitCollectionWithNSIntegerValue:forTrait:")
    protected static native @Pointer long create(@MachineSizedSInt long value, Class<?> trait);
    @Method(selector = "traitCollectionWithObject:forTrait:")
    protected static native @Pointer long create(NSObject object, Class<?> trait);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "performAsCurrentTraitCollection:")
    public native void performAsCurrentTraitCollection(@Block Runnable actions);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "hasDifferentColorAppearanceComparedToTraitCollection:")
    public native boolean hasDifferentColorAppearanceComparedToTraitCollection(UITraitCollection traitCollection);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
