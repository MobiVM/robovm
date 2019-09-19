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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIAccessibilityAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIAccessibility/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("isAccessibilityElement")
    public boolean isAccessibilityElement() { return false; }
    @NotImplemented("setIsAccessibilityElement:")
    public void setAccessibilityElement(boolean v) {}
    @NotImplemented("accessibilityLabel")
    public String getAccessibilityLabel() { return null; }
    @NotImplemented("setAccessibilityLabel:")
    public void setAccessibilityLabel(String v) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("accessibilityAttributedLabel")
    public NSAttributedString getAccessibilityAttributedLabel() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("setAccessibilityAttributedLabel:")
    public void setAccessibilityAttributedLabel(NSAttributedString v) {}
    @NotImplemented("accessibilityHint")
    public String getAccessibilityHint() { return null; }
    @NotImplemented("setAccessibilityHint:")
    public void setAccessibilityHint(String v) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("accessibilityAttributedHint")
    public NSAttributedString getAccessibilityAttributedHint() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("setAccessibilityAttributedHint:")
    public void setAccessibilityAttributedHint(NSAttributedString v) {}
    @NotImplemented("accessibilityValue")
    public String getAccessibilityValue() { return null; }
    @NotImplemented("setAccessibilityValue:")
    public void setAccessibilityValue(String v) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("accessibilityAttributedValue")
    public NSAttributedString getAccessibilityAttributedValue() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("setAccessibilityAttributedValue:")
    public void setAccessibilityAttributedValue(NSAttributedString v) {}
    @NotImplemented("accessibilityTraits")
    public UIAccessibilityTraits getAccessibilityTraits() { return null; }
    @NotImplemented("setAccessibilityTraits:")
    public void setAccessibilityTraits(UIAccessibilityTraits v) {}
    @NotImplemented("accessibilityFrame")
    public @ByVal CGRect getAccessibilityFrame() { return null; }
    @NotImplemented("setAccessibilityFrame:")
    public void setAccessibilityFrame(@ByVal CGRect v) {}
    @NotImplemented("accessibilityPath")
    public UIBezierPath getAccessibilityPath() { return null; }
    @NotImplemented("setAccessibilityPath:")
    public void setAccessibilityPath(UIBezierPath v) {}
    @NotImplemented("accessibilityActivationPoint")
    public @ByVal CGPoint getAccessibilityActivationPoint() { return null; }
    @NotImplemented("setAccessibilityActivationPoint:")
    public void setAccessibilityActivationPoint(@ByVal CGPoint v) {}
    @NotImplemented("accessibilityLanguage")
    public String getAccessibilityLanguage() { return null; }
    @NotImplemented("setAccessibilityLanguage:")
    public void setAccessibilityLanguage(String v) {}
    @NotImplemented("accessibilityElementsHidden")
    public boolean areAccessibilityElementsHidden() { return false; }
    @NotImplemented("setAccessibilityElementsHidden:")
    public void setAccessibilityElementsHidden(boolean v) {}
    @NotImplemented("accessibilityViewIsModal")
    public boolean isAccessibilityViewModal() { return false; }
    @NotImplemented("setAccessibilityViewIsModal:")
    public void setAccessibilityViewModal(boolean v) {}
    @NotImplemented("shouldGroupAccessibilityChildren")
    public boolean shouldGroupAccessibilityChildren() { return false; }
    @NotImplemented("setShouldGroupAccessibilityChildren:")
    public void setShouldGroupAccessibilityChildren(boolean v) {}
    @NotImplemented("accessibilityNavigationStyle")
    public UIAccessibilityNavigationStyle getAccessibilityNavigationStyle() { return null; }
    @NotImplemented("setAccessibilityNavigationStyle:")
    public void setAccessibilityNavigationStyle(UIAccessibilityNavigationStyle v) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("accessibilityRespondsToUserInteraction")
    public boolean isAccessibilityRespondsToUserInteraction() { return false; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("setAccessibilityRespondsToUserInteraction:")
    public void setAccessibilityRespondsToUserInteraction(boolean v) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("accessibilityUserInputLabels")
    public NSArray<NSString> getAccessibilityUserInputLabels() { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("setAccessibilityUserInputLabels:")
    public void setAccessibilityUserInputLabels(NSArray<NSString> v) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("accessibilityAttributedUserInputLabels")
    public NSArray<NSAttributedString> getAccessibilityAttributedUserInputLabels() { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("setAccessibilityAttributedUserInputLabels:")
    public void setAccessibilityAttributedUserInputLabels(NSArray<NSAttributedString> v) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("accessibilityTextualContext")
    public String getAccessibilityTextualContext() { return null; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("setAccessibilityTextualContext:")
    public void setAccessibilityTextualContext(String v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
