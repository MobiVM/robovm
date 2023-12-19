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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIMutableTraits/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "userInterfaceIdiom")
    UIUserInterfaceIdiom getUserInterfaceIdiom();
    @Property(selector = "setUserInterfaceIdiom:")
    void setUserInterfaceIdiom(UIUserInterfaceIdiom v);
    @Property(selector = "userInterfaceStyle")
    UIUserInterfaceStyle getUserInterfaceStyle();
    @Property(selector = "setUserInterfaceStyle:")
    void setUserInterfaceStyle(UIUserInterfaceStyle v);
    @Property(selector = "layoutDirection")
    UITraitEnvironmentLayoutDirection getLayoutDirection();
    @Property(selector = "setLayoutDirection:")
    void setLayoutDirection(UITraitEnvironmentLayoutDirection v);
    @Property(selector = "displayScale")
    @MachineSizedFloat double getDisplayScale();
    @Property(selector = "setDisplayScale:")
    void setDisplayScale(@MachineSizedFloat double v);
    @Property(selector = "horizontalSizeClass")
    UIUserInterfaceSizeClass getHorizontalSizeClass();
    @Property(selector = "setHorizontalSizeClass:")
    void setHorizontalSizeClass(UIUserInterfaceSizeClass v);
    @Property(selector = "verticalSizeClass")
    UIUserInterfaceSizeClass getVerticalSizeClass();
    @Property(selector = "setVerticalSizeClass:")
    void setVerticalSizeClass(UIUserInterfaceSizeClass v);
    @Property(selector = "forceTouchCapability")
    UIForceTouchCapability getForceTouchCapability();
    @Property(selector = "setForceTouchCapability:")
    void setForceTouchCapability(UIForceTouchCapability v);
    @Property(selector = "preferredContentSizeCategory")
    String getPreferredContentSizeCategory();
    @Property(selector = "setPreferredContentSizeCategory:")
    void setPreferredContentSizeCategory(String v);
    @Property(selector = "displayGamut")
    UIDisplayGamut getDisplayGamut();
    @Property(selector = "setDisplayGamut:")
    void setDisplayGamut(UIDisplayGamut v);
    @Property(selector = "accessibilityContrast")
    UIAccessibilityContrast getAccessibilityContrast();
    @Property(selector = "setAccessibilityContrast:")
    void setAccessibilityContrast(UIAccessibilityContrast v);
    @Property(selector = "userInterfaceLevel")
    UIUserInterfaceLevel getUserInterfaceLevel();
    @Property(selector = "setUserInterfaceLevel:")
    void setUserInterfaceLevel(UIUserInterfaceLevel v);
    @Property(selector = "legibilityWeight")
    UILegibilityWeight getLegibilityWeight();
    @Property(selector = "setLegibilityWeight:")
    void setLegibilityWeight(UILegibilityWeight v);
    @Property(selector = "activeAppearance")
    UIUserInterfaceActiveAppearance getActiveAppearance();
    @Property(selector = "setActiveAppearance:")
    void setActiveAppearance(UIUserInterfaceActiveAppearance v);
    @Property(selector = "toolbarItemPresentationSize")
    UINSToolbarItemPresentationSize getToolbarItemPresentationSize();
    @Property(selector = "setToolbarItemPresentationSize:")
    void setToolbarItemPresentationSize(UINSToolbarItemPresentationSize v);
    @Property(selector = "imageDynamicRange")
    UIImageDynamicRange getImageDynamicRange();
    @Property(selector = "setImageDynamicRange:")
    void setImageDynamicRange(UIImageDynamicRange v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "sceneCaptureState")
    UISceneCaptureState getSceneCaptureState();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setSceneCaptureState:")
    void setSceneCaptureState(UISceneCaptureState v);
    @Property(selector = "typesettingLanguage")
    String getTypesettingLanguage();
    @Property(selector = "setTypesettingLanguage:")
    void setTypesettingLanguage(String v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "setCGFloatValue:forTrait:")
    void setFloatValue(@MachineSizedFloat double value, Class<?> trait);
    @Method(selector = "valueForCGFloatTrait:")
    @MachineSizedFloat double valueForCGFloatTrait(Class<?> trait);
    @Method(selector = "setNSIntegerValue:forTrait:")
    void setInteger(@MachineSizedSInt long value, Class<?> trait);
    @Method(selector = "valueForNSIntegerTrait:")
    @MachineSizedSInt long valueForNSIntegerTrait(Class<?> trait);
    @Method(selector = "setObject:forTrait:")
    void setObject(NSObject object, Class<?> trait);
    @Method(selector = "objectForTrait:")
    NSObject objectForTrait(Class<?> trait);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
