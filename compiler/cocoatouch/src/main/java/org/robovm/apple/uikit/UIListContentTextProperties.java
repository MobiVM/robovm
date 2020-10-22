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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIListContentTextProperties/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIListContentTextPropertiesPtr extends Ptr<UIListContentTextProperties, UIListContentTextPropertiesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIListContentTextProperties.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIListContentTextProperties() {}
    protected UIListContentTextProperties(Handle h, long handle) { super(h, handle); }
    protected UIListContentTextProperties(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIListContentTextProperties(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "font")
    public native UIFont getFont();
    @Property(selector = "setFont:")
    public native void setFont(UIFont v);
    @Property(selector = "color")
    public native UIColor getColor();
    @Property(selector = "setColor:")
    public native void setColor(UIColor v);
    @Property(selector = "colorTransformer")
    public native @Block Block1<UIColor, UIColor> getColorTransformer();
    @Property(selector = "setColorTransformer:")
    public native void setColorTransformer(@Block Block1<UIColor, UIColor> v);
    @Property(selector = "alignment")
    public native UIListContentTextAlignment getAlignment();
    @Property(selector = "setAlignment:")
    public native void setAlignment(UIListContentTextAlignment v);
    @Property(selector = "lineBreakMode")
    public native NSLineBreakMode getLineBreakMode();
    @Property(selector = "setLineBreakMode:")
    public native void setLineBreakMode(NSLineBreakMode v);
    @Property(selector = "numberOfLines")
    public native @MachineSizedSInt long getNumberOfLines();
    @Property(selector = "setNumberOfLines:")
    public native void setNumberOfLines(@MachineSizedSInt long v);
    @Property(selector = "adjustsFontSizeToFitWidth")
    public native boolean adjustsFontSizeToFitWidth();
    @Property(selector = "setAdjustsFontSizeToFitWidth:")
    public native void setAdjustsFontSizeToFitWidth(boolean v);
    @Property(selector = "minimumScaleFactor")
    public native @MachineSizedFloat double getMinimumScaleFactor();
    @Property(selector = "setMinimumScaleFactor:")
    public native void setMinimumScaleFactor(@MachineSizedFloat double v);
    @Property(selector = "allowsDefaultTighteningForTruncation")
    public native boolean allowsDefaultTighteningForTruncation();
    @Property(selector = "setAllowsDefaultTighteningForTruncation:")
    public native void setAllowsDefaultTighteningForTruncation(boolean v);
    @Property(selector = "adjustsFontForContentSizeCategory")
    public native boolean adjustsFontForContentSizeCategory();
    @Property(selector = "setAdjustsFontForContentSizeCategory:")
    public native void setAdjustsFontForContentSizeCategory(boolean v);
    @Property(selector = "transform")
    public native UIListContentTextTransform getTransform();
    @Property(selector = "setTransform:")
    public native void setTransform(UIListContentTextTransform v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "resolvedColor")
    public native UIColor resolvedColor();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
