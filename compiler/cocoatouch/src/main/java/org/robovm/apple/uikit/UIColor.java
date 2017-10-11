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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 2.0 and later.
 */
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
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "initWithCIColor:")
    public UIColor(CIColor ciColor) { super((SkipInit) null); initObject(init(ciColor)); }
    @Method(selector = "initWithCoder:")
    public UIColor(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
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
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "CIColor")
    public native CIColor getCIColor();
    @Property(selector = "lightTextColor")
    public static native UIColor lightText();
    @Property(selector = "darkTextColor")
    public static native UIColor darkText();
    @Property(selector = "groupTableViewBackgroundColor")
    public static native UIColor groupTableViewBackground();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "viewFlipsideBackgroundColor")
    public static native UIColor viewFlipsideBackground();
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "scrollViewTexturedBackgroundColor")
    public static native UIColor scrollViewTexturedBackground();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "underPageBackgroundColor")
    public static native UIColor underPageBackground();
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
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "initWithCIColor:")
    protected native @Pointer long init(CIColor ciColor);
    @Method(selector = "set")
    public native void setFillAndStroke();
    @Method(selector = "setFill")
    public native void setFill();
    @Method(selector = "setStroke")
    public native void setStroke();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "getWhite:alpha:")
    protected native boolean getWhiteAlpha(MachineSizedFloatPtr white, MachineSizedFloatPtr alpha);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "getHue:saturation:brightness:alpha:")
    protected native boolean getHSBA(MachineSizedFloatPtr hue, MachineSizedFloatPtr saturation, MachineSizedFloatPtr brightness, MachineSizedFloatPtr alpha);
    /**
     * @since Available in iOS 5.0 and later.
     */
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
    /**
     * @since Available in iOS 5.0 and later.
     */
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
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
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
