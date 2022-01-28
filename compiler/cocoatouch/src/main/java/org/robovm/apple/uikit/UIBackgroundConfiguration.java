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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIBackgroundConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIBackgroundConfigurationPtr extends Ptr<UIBackgroundConfiguration, UIBackgroundConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIBackgroundConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIBackgroundConfiguration() {}
    protected UIBackgroundConfiguration(Handle h, long handle) { super(h, handle); }
    protected UIBackgroundConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIBackgroundConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "customView")
    public native UIView getCustomView();
    @Property(selector = "setCustomView:")
    public native void setCustomView(UIView v);
    @Property(selector = "cornerRadius")
    public native @MachineSizedFloat double getCornerRadius();
    @Property(selector = "setCornerRadius:")
    public native void setCornerRadius(@MachineSizedFloat double v);
    @Property(selector = "backgroundInsets")
    public native @ByVal NSDirectionalEdgeInsets getBackgroundInsets();
    @Property(selector = "setBackgroundInsets:")
    public native void setBackgroundInsets(@ByVal NSDirectionalEdgeInsets v);
    @Property(selector = "edgesAddingLayoutMarginsToBackgroundInsets")
    public native NSDirectionalRectEdge getEdgesAddingLayoutMarginsToBackgroundInsets();
    @Property(selector = "setEdgesAddingLayoutMarginsToBackgroundInsets:")
    public native void setEdgesAddingLayoutMarginsToBackgroundInsets(NSDirectionalRectEdge v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "backgroundColorTransformer")
    public native @Block Block1<UIColor, UIColor> getBackgroundColorTransformer();
    @Property(selector = "setBackgroundColorTransformer:")
    public native void setBackgroundColorTransformer(@Block Block1<UIColor, UIColor> v);
    @Property(selector = "visualEffect")
    public native UIVisualEffect getVisualEffect();
    @Property(selector = "setVisualEffect:")
    public native void setVisualEffect(UIVisualEffect v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "image")
    public native UIImage getImage();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "imageContentMode")
    public native UIViewContentMode getImageContentMode();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setImageContentMode:")
    public native void setImageContentMode(UIViewContentMode v);
    @Property(selector = "strokeColor")
    public native UIColor getStrokeColor();
    @Property(selector = "setStrokeColor:")
    public native void setStrokeColor(UIColor v);
    @Property(selector = "strokeColorTransformer")
    public native @Block Block1<UIColor, UIColor> getStrokeColorTransformer();
    @Property(selector = "setStrokeColorTransformer:")
    public native void setStrokeColorTransformer(@Block Block1<UIColor, UIColor> v);
    @Property(selector = "strokeWidth")
    public native @MachineSizedFloat double getStrokeWidth();
    @Property(selector = "setStrokeWidth:")
    public native void setStrokeWidth(@MachineSizedFloat double v);
    @Property(selector = "strokeOutset")
    public native @MachineSizedFloat double getStrokeOutset();
    @Property(selector = "setStrokeOutset:")
    public native void setStrokeOutset(@MachineSizedFloat double v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "updatedConfigurationForState:")
    public native UIBackgroundConfiguration updatedConfigurationForState(UIConfigurationState state);
    @Method(selector = "resolvedBackgroundColorForTintColor:")
    public native UIColor resolvedBackgroundColorForTintColor(UIColor tintColor);
    @Method(selector = "resolvedStrokeColorForTintColor:")
    public native UIColor resolvedStrokeColorForTintColor(UIColor tintColor);
    @Method(selector = "clearConfiguration")
    public static native UIBackgroundConfiguration clearConfiguration();
    @Method(selector = "listPlainCellConfiguration")
    public static native UIBackgroundConfiguration listPlainCellConfiguration();
    @Method(selector = "listPlainHeaderFooterConfiguration")
    public static native UIBackgroundConfiguration listPlainHeaderFooterConfiguration();
    @Method(selector = "listGroupedCellConfiguration")
    public static native UIBackgroundConfiguration listGroupedCellConfiguration();
    @Method(selector = "listGroupedHeaderFooterConfiguration")
    public static native UIBackgroundConfiguration listGroupedHeaderFooterConfiguration();
    @Method(selector = "listSidebarHeaderConfiguration")
    public static native UIBackgroundConfiguration listSidebarHeaderConfiguration();
    @Method(selector = "listSidebarCellConfiguration")
    public static native UIBackgroundConfiguration listSidebarCellConfiguration();
    @Method(selector = "listAccompaniedSidebarCellConfiguration")
    public static native UIBackgroundConfiguration listAccompaniedSidebarCellConfiguration();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
