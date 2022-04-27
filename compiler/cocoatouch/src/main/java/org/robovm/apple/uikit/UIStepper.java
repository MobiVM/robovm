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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIStepper/*</name>*/ 
    extends /*<extends>*/UIControl/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIStepperPtr extends Ptr<UIStepper, UIStepperPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIStepper.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIStepper() {}
    protected UIStepper(Handle h, long handle) { super(h, handle); }
    protected UIStepper(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UIStepper(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UIStepper(NSCoder coder) { super(coder); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public UIStepper(@ByVal CGRect frame, UIAction primaryAction) { super(frame, primaryAction); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isContinuous")
    public native boolean isContinuous();
    @Property(selector = "setContinuous:")
    public native void setContinuous(boolean v);
    @Property(selector = "autorepeat")
    public native boolean isAutorepeat();
    @Property(selector = "setAutorepeat:")
    public native void setAutorepeat(boolean v);
    @Property(selector = "wraps")
    public native boolean isWraps();
    @Property(selector = "setWraps:")
    public native void setWraps(boolean v);
    @Property(selector = "value")
    public native double getValue();
    @Property(selector = "setValue:")
    public native void setValue(double v);
    @Property(selector = "minimumValue")
    public native double getMinimumValue();
    @Property(selector = "setMinimumValue:")
    public native void setMinimumValue(double v);
    @Property(selector = "maximumValue")
    public native double getMaximumValue();
    @Property(selector = "setMaximumValue:")
    public native void setMaximumValue(double v);
    @Property(selector = "stepValue")
    public native double getStepValue();
    @Property(selector = "setStepValue:")
    public native void setStepValue(double v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setBackgroundImage:forState:")
    public native void setBackgroundImage(UIImage image, UIControlState state);
    @Method(selector = "backgroundImageForState:")
    public native UIImage getBackgroundImage(UIControlState state);
    @Method(selector = "setDividerImage:forLeftSegmentState:rightSegmentState:")
    public native void setDividerImage(UIImage image, UIControlState leftState, UIControlState rightState);
    @Method(selector = "dividerImageForLeftSegmentState:rightSegmentState:")
    public native UIImage getDividerImage(UIControlState leftState, UIControlState rightState);
    @Method(selector = "setIncrementImage:forState:")
    public native void setIncrementImage(UIImage image, UIControlState state);
    @Method(selector = "incrementImageForState:")
    public native UIImage getIncrementImage(UIControlState state);
    @Method(selector = "setDecrementImage:forState:")
    public native void setDecrementImage(UIImage image, UIControlState state);
    @Method(selector = "decrementImageForState:")
    public native UIImage getDecrementImage(UIControlState state);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
