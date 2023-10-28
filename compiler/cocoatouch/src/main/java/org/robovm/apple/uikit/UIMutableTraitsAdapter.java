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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIMutableTraitsAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIMutableTraits/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("userInterfaceIdiom")
    public UIUserInterfaceIdiom getUserInterfaceIdiom() { return null; }
    @NotImplemented("setUserInterfaceIdiom:")
    public void setUserInterfaceIdiom(UIUserInterfaceIdiom v) {}
    @NotImplemented("userInterfaceStyle")
    public UIUserInterfaceStyle getUserInterfaceStyle() { return null; }
    @NotImplemented("setUserInterfaceStyle:")
    public void setUserInterfaceStyle(UIUserInterfaceStyle v) {}
    @NotImplemented("layoutDirection")
    public UITraitEnvironmentLayoutDirection getLayoutDirection() { return null; }
    @NotImplemented("setLayoutDirection:")
    public void setLayoutDirection(UITraitEnvironmentLayoutDirection v) {}
    @NotImplemented("displayScale")
    public @MachineSizedFloat double getDisplayScale() { return 0; }
    @NotImplemented("setDisplayScale:")
    public void setDisplayScale(@MachineSizedFloat double v) {}
    @NotImplemented("horizontalSizeClass")
    public UIUserInterfaceSizeClass getHorizontalSizeClass() { return null; }
    @NotImplemented("setHorizontalSizeClass:")
    public void setHorizontalSizeClass(UIUserInterfaceSizeClass v) {}
    @NotImplemented("verticalSizeClass")
    public UIUserInterfaceSizeClass getVerticalSizeClass() { return null; }
    @NotImplemented("setVerticalSizeClass:")
    public void setVerticalSizeClass(UIUserInterfaceSizeClass v) {}
    @NotImplemented("forceTouchCapability")
    public UIForceTouchCapability getForceTouchCapability() { return null; }
    @NotImplemented("setForceTouchCapability:")
    public void setForceTouchCapability(UIForceTouchCapability v) {}
    @NotImplemented("preferredContentSizeCategory")
    public String getPreferredContentSizeCategory() { return null; }
    @NotImplemented("setPreferredContentSizeCategory:")
    public void setPreferredContentSizeCategory(String v) {}
    @NotImplemented("displayGamut")
    public UIDisplayGamut getDisplayGamut() { return null; }
    @NotImplemented("setDisplayGamut:")
    public void setDisplayGamut(UIDisplayGamut v) {}
    @NotImplemented("accessibilityContrast")
    public UIAccessibilityContrast getAccessibilityContrast() { return null; }
    @NotImplemented("setAccessibilityContrast:")
    public void setAccessibilityContrast(UIAccessibilityContrast v) {}
    @NotImplemented("userInterfaceLevel")
    public UIUserInterfaceLevel getUserInterfaceLevel() { return null; }
    @NotImplemented("setUserInterfaceLevel:")
    public void setUserInterfaceLevel(UIUserInterfaceLevel v) {}
    @NotImplemented("legibilityWeight")
    public UILegibilityWeight getLegibilityWeight() { return null; }
    @NotImplemented("setLegibilityWeight:")
    public void setLegibilityWeight(UILegibilityWeight v) {}
    @NotImplemented("activeAppearance")
    public UIUserInterfaceActiveAppearance getActiveAppearance() { return null; }
    @NotImplemented("setActiveAppearance:")
    public void setActiveAppearance(UIUserInterfaceActiveAppearance v) {}
    @NotImplemented("toolbarItemPresentationSize")
    public UINSToolbarItemPresentationSize getToolbarItemPresentationSize() { return null; }
    @NotImplemented("setToolbarItemPresentationSize:")
    public void setToolbarItemPresentationSize(UINSToolbarItemPresentationSize v) {}
    @NotImplemented("imageDynamicRange")
    public UIImageDynamicRange getImageDynamicRange() { return null; }
    @NotImplemented("setImageDynamicRange:")
    public void setImageDynamicRange(UIImageDynamicRange v) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("sceneCaptureState")
    public UISceneCaptureState getSceneCaptureState() { return null; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setSceneCaptureState:")
    public void setSceneCaptureState(UISceneCaptureState v) {}
    @NotImplemented("typesettingLanguage")
    public String getTypesettingLanguage() { return null; }
    @NotImplemented("setTypesettingLanguage:")
    public void setTypesettingLanguage(String v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("setCGFloatValue:forTrait:")
    public void setFloatValue(@MachineSizedFloat double value, Class<?> trait) {}
    @NotImplemented("valueForCGFloatTrait:")
    public @MachineSizedFloat double valueForCGFloatTrait(Class<?> trait) { return 0; }
    @NotImplemented("setNSIntegerValue:forTrait:")
    public void setInteger(@MachineSizedSInt long value, Class<?> trait) {}
    @NotImplemented("valueForNSIntegerTrait:")
    public @MachineSizedSInt long valueForNSIntegerTrait(Class<?> trait) { return 0; }
    @NotImplemented("setObject:forTrait:")
    public void setObject(NSObject object, Class<?> trait) {}
    @NotImplemented("objectForTrait:")
    public NSObject objectForTrait(Class<?> trait) { return null; }
    /*</methods>*/
}
