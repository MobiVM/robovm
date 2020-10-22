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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIColor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, NSItemProviderReading, NSItemProviderWriting/*</implements>*/ {

    /*<ptr>*/public static class UIColorPtr extends Ptr<UIColor, UIColorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIColor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIColor() {}
    protected UIColor(Handle h, long handle) { super(h, handle); }
    protected UIColor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRed:green:blue:alpha:")
    public UIColor(@MachineSizedFloat double red, @MachineSizedFloat double green, @MachineSizedFloat double blue, @MachineSizedFloat double alpha) { super((SkipInit) null); initObject(init(red, green, blue, alpha)); }
    @Method(selector = "initWithCGColor:")
    public UIColor(CGColor cgColor) { super((SkipInit) null); initObject(init(cgColor)); }
    @Method(selector = "initWithCIColor:")
    public UIColor(CIColor ciColor) { super((SkipInit) null); initObject(init(ciColor)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithDynamicProvider:")
    public UIColor(@Block Block1<UITraitCollection, UIColor> dynamicProvider) { super((SkipInit) null); initObject(init(dynamicProvider)); }
    @Method(selector = "initWithCoder:")
    public UIColor(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "blackColor")
    public static native UIColor black();
    @Property(selector = "darkGrayColor")
    public static native UIColor darkGray();
    @Property(selector = "lightGrayColor")
    public static native UIColor lightGray();
    @Property(selector = "whiteColor")
    public static native UIColor white();
    @Property(selector = "grayColor")
    public static native UIColor gray();
    @Property(selector = "redColor")
    public static native UIColor red();
    @Property(selector = "greenColor")
    public static native UIColor green();
    @Property(selector = "blueColor")
    public static native UIColor blue();
    @Property(selector = "cyanColor")
    public static native UIColor cyan();
    @Property(selector = "yellowColor")
    public static native UIColor yellow();
    @Property(selector = "magentaColor")
    public static native UIColor magenta();
    @Property(selector = "orangeColor")
    public static native UIColor orange();
    @Property(selector = "purpleColor")
    public static native UIColor purple();
    @Property(selector = "brownColor")
    public static native UIColor brown();
    @Property(selector = "clearColor")
    public static native UIColor clear();
    @Property(selector = "CGColor")
    public native CGColor getCGColor();
    @Property(selector = "CIColor")
    public native CIColor getCIColor();
    @Property(selector = "systemRedColor")
    public static native UIColor systemRed();
    @Property(selector = "systemGreenColor")
    public static native UIColor systemGreen();
    @Property(selector = "systemBlueColor")
    public static native UIColor systemBlue();
    @Property(selector = "systemOrangeColor")
    public static native UIColor systemOrange();
    @Property(selector = "systemYellowColor")
    public static native UIColor systemYellow();
    @Property(selector = "systemPinkColor")
    public static native UIColor systemPink();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "systemPurpleColor")
    public static native UIColor systemPurple();
    @Property(selector = "systemTealColor")
    public static native UIColor systemTeal();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "systemIndigoColor")
    public static native UIColor systemIndigo();
    @Property(selector = "systemGrayColor")
    public static native UIColor systemGray();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "systemGray2Color")
    public static native UIColor systemGray2();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "systemGray3Color")
    public static native UIColor systemGray3();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "systemGray4Color")
    public static native UIColor systemGray4();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "systemGray5Color")
    public static native UIColor systemGray5();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "systemGray6Color")
    public static native UIColor systemGray6();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "labelColor")
    public static native UIColor label();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "secondaryLabelColor")
    public static native UIColor secondaryLabel();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "tertiaryLabelColor")
    public static native UIColor tertiaryLabel();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "quaternaryLabelColor")
    public static native UIColor quaternaryLabel();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "linkColor")
    public static native UIColor link();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "placeholderTextColor")
    public static native UIColor placeholderText();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "separatorColor")
    public static native UIColor separator();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "opaqueSeparatorColor")
    public static native UIColor opaqueSeparator();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "systemBackgroundColor")
    public static native UIColor systemBackground();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "secondarySystemBackgroundColor")
    public static native UIColor secondarySystemBackground();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "tertiarySystemBackgroundColor")
    public static native UIColor tertiarySystemBackground();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "systemGroupedBackgroundColor")
    public static native UIColor systemGroupedBackground();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "secondarySystemGroupedBackgroundColor")
    public static native UIColor secondarySystemGroupedBackground();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "tertiarySystemGroupedBackgroundColor")
    public static native UIColor tertiarySystemGroupedBackground();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "systemFillColor")
    public static native UIColor systemFill();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "secondarySystemFillColor")
    public static native UIColor secondarySystemFill();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "tertiarySystemFillColor")
    public static native UIColor tertiarySystemFill();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "quaternarySystemFillColor")
    public static native UIColor quaternarySystemFill();
    @Property(selector = "lightTextColor")
    public static native UIColor lightText();
    @Property(selector = "darkTextColor")
    public static native UIColor darkText();
    /**
     * @deprecated Deprecated in iOS 13.0. Use systemGroupedBackgroundColor
     */
    @Deprecated
    @Property(selector = "groupTableViewBackgroundColor")
    public static native UIColor groupTableViewBackground();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "viewFlipsideBackgroundColor")
    public static native UIColor viewFlipsideBackground();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "scrollViewTexturedBackgroundColor")
    public static native UIColor scrollViewTexturedBackground();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "underPageBackgroundColor")
    public static native UIColor underPageBackground();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "accessibilityName")
    public native String getAccessibilityName();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "readableTypeIdentifiersForItemProvider")
    public static native NSArray<NSString> getReadableTypeIdentifiersForItemProvider();
    @Property(selector = "writableTypeIdentifiersForItemProvider")
    public static native NSArray<NSString> getWritableTypeIdentifiersForItemProvider0();
    @Property(selector = "writableTypeIdentifiersForItemProvider")
    public native NSArray<NSString> getWritableTypeIdentifiersForItemProvider();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public double[] getWhiteAlpha() {
        MachineSizedFloatPtr white = new MachineSizedFloatPtr();
        MachineSizedFloatPtr alpha = new MachineSizedFloatPtr();
        boolean ret = getWhiteAlpha(white, alpha);
        if (ret) {
            double[] whiteAlpha = new double[2];
            whiteAlpha[0] = white.get();
            whiteAlpha[1] = alpha.get();
            return whiteAlpha;
        }
        return null;
    }

    public double[] getHSBA() {
        MachineSizedFloatPtr hue = new MachineSizedFloatPtr();
        MachineSizedFloatPtr saturation = new MachineSizedFloatPtr();
        MachineSizedFloatPtr brightness = new MachineSizedFloatPtr();
        MachineSizedFloatPtr alpha = new MachineSizedFloatPtr();
        boolean ret = getHSBA(hue, saturation, brightness, alpha);
        if (ret) {
            double[] hsba = new double[4];
            hsba[0] = hue.get();
            hsba[1] = saturation.get();
            hsba[2] = brightness.get();
            hsba[3] = alpha.get();
            return hsba;
        }
        return null;
    }

    public double[] getRGBA() {
        MachineSizedFloatPtr red = new MachineSizedFloatPtr();
        MachineSizedFloatPtr green = new MachineSizedFloatPtr();
        MachineSizedFloatPtr blue = new MachineSizedFloatPtr();
        MachineSizedFloatPtr alpha = new MachineSizedFloatPtr();
        boolean ret = getRGBA(red, green, blue, alpha);
        if (ret) {
            double[] rgba = new double[4];
            rgba[0] = red.get();
            rgba[1] = green.get();
            rgba[2] = blue.get();
            rgba[3] = alpha.get();
            return rgba;
        }
        return null;
    }
    
    /*<methods>*/
    @Method(selector = "initWithRed:green:blue:alpha:")
    protected native @Pointer long init(@MachineSizedFloat double red, @MachineSizedFloat double green, @MachineSizedFloat double blue, @MachineSizedFloat double alpha);
    @Method(selector = "initWithCGColor:")
    protected native @Pointer long init(CGColor cgColor);
    @Method(selector = "initWithCIColor:")
    protected native @Pointer long init(CIColor ciColor);
    @Method(selector = "set")
    public native void setFillAndStroke();
    @Method(selector = "setFill")
    public native void setFill();
    @Method(selector = "setStroke")
    public native void setStroke();
    @Method(selector = "getWhite:alpha:")
    protected native boolean getWhiteAlpha(MachineSizedFloatPtr white, MachineSizedFloatPtr alpha);
    @Method(selector = "getHue:saturation:brightness:alpha:")
    protected native boolean getHSBA(MachineSizedFloatPtr hue, MachineSizedFloatPtr saturation, MachineSizedFloatPtr brightness, MachineSizedFloatPtr alpha);
    @Method(selector = "getRed:green:blue:alpha:")
    protected native boolean getRGBA(MachineSizedFloatPtr red, MachineSizedFloatPtr green, MachineSizedFloatPtr blue, MachineSizedFloatPtr alpha);
    @Method(selector = "colorWithAlphaComponent:")
    public native UIColor addAlpha(@MachineSizedFloat double alpha);
    @Method(selector = "colorWithWhite:alpha:")
    public static native UIColor fromWhiteAlpha(@MachineSizedFloat double white, @MachineSizedFloat double alpha);
    @Method(selector = "colorWithHue:saturation:brightness:alpha:")
    public static native UIColor fromHSBA(@MachineSizedFloat double hue, @MachineSizedFloat double saturation, @MachineSizedFloat double brightness, @MachineSizedFloat double alpha);
    @Method(selector = "colorWithRed:green:blue:alpha:")
    public static native UIColor fromRGBA(@MachineSizedFloat double red, @MachineSizedFloat double green, @MachineSizedFloat double blue, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "colorWithDisplayP3Red:green:blue:alpha:")
    public static native UIColor fromDisplayP3(@MachineSizedFloat double displayP3Red, @MachineSizedFloat double green, @MachineSizedFloat double blue, @MachineSizedFloat double alpha);
    @Method(selector = "colorWithCGColor:")
    public static native UIColor fromCGColor(CGColor cgColor);
    @Method(selector = "colorWithPatternImage:")
    public static native UIColor fromPatternImage(UIImage image);
    @Method(selector = "colorWithCIColor:")
    public static native UIColor fromCIColor(CIColor ciColor);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "colorNamed:")
    public static native UIColor colorNamed(String name);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "colorNamed:inBundle:compatibleWithTraitCollection:")
    public static native UIColor fromResourceBundle(String name, NSBundle bundle, UITraitCollection traitCollection);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithDynamicProvider:")
    protected native @Pointer long init(@Block Block1<UITraitCollection, UIColor> dynamicProvider);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resolvedColorWithTraitCollection:")
    public native UIColor resolvedColorWithTraitCollection(UITraitCollection traitCollection);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    public static UIColor createProviderDataObject(NSData data, String typeIdentifier) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       UIColor result = createProviderDataObject(data, typeIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "objectWithItemProviderData:typeIdentifier:error:")
    private static native UIColor createProviderDataObject(NSData data, String typeIdentifier, NSError.NSErrorPtr outError);
    @Method(selector = "itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    public native NSItemProviderRepresentationVisibility getItemProviderVisibility(String typeIdentifier);
    @Method(selector = "loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadData(String typeIdentifier, @Block VoidBlock2<NSData, NSError> completionHandler);
    @Method(selector = "itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    public static native NSItemProviderRepresentationVisibility getItemProviderVisibility0(String typeIdentifier);
    /*</methods>*/
}
