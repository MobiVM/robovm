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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISlider/*</name>*/ 
    extends /*<extends>*/UIControl/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UISliderPtr extends Ptr<UISlider, UISliderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISlider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UISlider() {}
    protected UISlider(Handle h, long handle) { super(h, handle); }
    protected UISlider(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UISlider(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UISlider(NSCoder coder) { super(coder); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public UISlider(@ByVal CGRect frame, UIAction primaryAction) { super(frame, primaryAction); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "value")
    public native float getValue();
    @Property(selector = "setValue:")
    public native void setValue(float v);
    @Property(selector = "minimumValue")
    public native float getMinimumValue();
    @Property(selector = "setMinimumValue:")
    public native void setMinimumValue(float v);
    @Property(selector = "maximumValue")
    public native float getMaximumValue();
    @Property(selector = "setMaximumValue:")
    public native void setMaximumValue(float v);
    @Property(selector = "minimumValueImage")
    public native UIImage getMinimumValueImage();
    @Property(selector = "setMinimumValueImage:")
    public native void setMinimumValueImage(UIImage v);
    @Property(selector = "maximumValueImage")
    public native UIImage getMaximumValueImage();
    @Property(selector = "setMaximumValueImage:")
    public native void setMaximumValueImage(UIImage v);
    @Property(selector = "isContinuous")
    public native boolean isContinuous();
    @Property(selector = "setContinuous:")
    public native void setContinuous(boolean v);
    @Property(selector = "minimumTrackTintColor")
    public native UIColor getMinimumTrackTintColor();
    @Property(selector = "setMinimumTrackTintColor:")
    public native void setMinimumTrackTintColor(UIColor v);
    @Property(selector = "maximumTrackTintColor")
    public native UIColor getMaximumTrackTintColor();
    @Property(selector = "setMaximumTrackTintColor:")
    public native void setMaximumTrackTintColor(UIColor v);
    @Property(selector = "thumbTintColor")
    public native UIColor getThumbTintColor();
    @Property(selector = "setThumbTintColor:")
    public native void setThumbTintColor(UIColor v);
    @Property(selector = "currentThumbImage")
    public native UIImage getCurrentThumbImage();
    @Property(selector = "currentMinimumTrackImage")
    public native UIImage getCurrentMinimumTrackImage();
    @Property(selector = "currentMaximumTrackImage")
    public native UIImage getCurrentMaximumTrackImage();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "behavioralStyle")
    public native UIBehavioralStyle getBehavioralStyle();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "preferredBehavioralStyle")
    public native UIBehavioralStyle getPreferredBehavioralStyle();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setPreferredBehavioralStyle:")
    public native void setPreferredBehavioralStyle(UIBehavioralStyle v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setValue:animated:")
    public native void setValue(float value, boolean animated);
    @Method(selector = "setThumbImage:forState:")
    public native void setThumbImage(UIImage image, UIControlState state);
    @Method(selector = "setMinimumTrackImage:forState:")
    public native void setMinimumTrackImage(UIImage image, UIControlState state);
    @Method(selector = "setMaximumTrackImage:forState:")
    public native void setMaximumTrackImage(UIImage image, UIControlState state);
    @Method(selector = "thumbImageForState:")
    public native UIImage getThumbImage(UIControlState state);
    @Method(selector = "minimumTrackImageForState:")
    public native UIImage getMinimumTrackImage(UIControlState state);
    @Method(selector = "maximumTrackImageForState:")
    public native UIImage getMaximumTrackImage(UIControlState state);
    @Method(selector = "minimumValueImageRectForBounds:")
    public native @ByVal CGRect getMinimumValueImageRect(@ByVal CGRect bounds);
    @Method(selector = "maximumValueImageRectForBounds:")
    public native @ByVal CGRect getMaximumValueImageRect(@ByVal CGRect bounds);
    @Method(selector = "trackRectForBounds:")
    public native @ByVal CGRect getTrackRect(@ByVal CGRect bounds);
    @Method(selector = "thumbRectForBounds:trackRect:value:")
    public native @ByVal CGRect getThumbRect(@ByVal CGRect bounds, @ByVal CGRect rect, float value);
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
