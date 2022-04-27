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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIFont/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIFontPtr extends Ptr<UIFont, UIFontPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIFont.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIFont() {}
    protected UIFont(Handle h, long handle) { super(h, handle); }
    protected UIFont(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UIFont(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "familyNames")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getFamilyNames();
    @Property(selector = "familyName")
    public native String getFamilyName();
    @Property(selector = "fontName")
    public native String getFontName();
    @Property(selector = "pointSize")
    public native @MachineSizedFloat double getPointSize();
    @Property(selector = "ascender")
    public native @MachineSizedFloat double getAscender();
    @Property(selector = "descender")
    public native @MachineSizedFloat double getDescender();
    @Property(selector = "capHeight")
    public native @MachineSizedFloat double getCapHeight();
    @Property(selector = "xHeight")
    public native @MachineSizedFloat double getXHeight();
    @Property(selector = "lineHeight")
    public native @MachineSizedFloat double getLineHeight();
    @Property(selector = "leading")
    public native @MachineSizedFloat double getLeading();
    @Property(selector = "fontDescriptor")
    public native UIFontDescriptor getFontDescriptor();
    @Property(selector = "labelFontSize")
    public static native @MachineSizedFloat double getLabelFontSize();
    @Property(selector = "buttonFontSize")
    public static native @MachineSizedFloat double getButtonFontSize();
    @Property(selector = "smallSystemFontSize")
    public static native @MachineSizedFloat double getSmallSystemFontSize();
    @Property(selector = "systemFontSize")
    public static native @MachineSizedFloat double getSystemFontSize();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 8.2 and later.
     */
    public static UIFont getSystemFont(double fontSize, UIFontWeight weight) {
        return getSystemFont(fontSize, weight.value());
    }
    /*<methods>*/
    @Method(selector = "fontWithSize:")
    public native UIFont newWithSize(@MachineSizedFloat double fontSize);
    @Method(selector = "preferredFontForTextStyle:")
    public static native UIFont getPreferredFont(UIFontTextStyle style);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "preferredFontForTextStyle:compatibleWithTraitCollection:")
    public static native UIFont getPreferredFont(UIFontTextStyle style, UITraitCollection traitCollection);
    @Method(selector = "fontWithName:size:")
    public static native UIFont getFont(String fontName, @MachineSizedFloat double fontSize);
    @Method(selector = "fontNamesForFamilyName:")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getFontNamesForFamilyName(String familyName);
    @Method(selector = "systemFontOfSize:")
    public static native UIFont getSystemFont(@MachineSizedFloat double fontSize);
    @Method(selector = "boldSystemFontOfSize:")
    public static native UIFont getBoldSystemFont(@MachineSizedFloat double fontSize);
    @Method(selector = "italicSystemFontOfSize:")
    public static native UIFont getItalicSystemFont(@MachineSizedFloat double fontSize);
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Method(selector = "systemFontOfSize:weight:")
    public static native UIFont getSystemFont(@MachineSizedFloat double fontSize, @MachineSizedFloat double weight);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "monospacedDigitSystemFontOfSize:weight:")
    public static native UIFont getMonospacedDigitSystemFont(@MachineSizedFloat double fontSize, @MachineSizedFloat double weight);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "monospacedSystemFontOfSize:weight:")
    public static native UIFont getMonospacedSystemFont(@MachineSizedFloat double fontSize, @MachineSizedFloat double weight);
    @Method(selector = "fontWithDescriptor:size:")
    public static native UIFont getFont(UIFontDescriptor descriptor, @MachineSizedFloat double pointSize);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
