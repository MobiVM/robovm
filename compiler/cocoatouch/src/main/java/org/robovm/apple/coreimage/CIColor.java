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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIColor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CIColorPtr extends Ptr<CIColor, CIColorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIColor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIColor() {}
    protected CIColor(Handle h, long handle) { super(h, handle); }
    protected CIColor(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithRed:green:blue:alpha:colorSpace:")
    public CIColor(@MachineSizedFloat double r, @MachineSizedFloat double g, @MachineSizedFloat double b, @MachineSizedFloat double a, CGColorSpace colorSpace) { super((SkipInit) null); initObject(init(r, g, b, a, colorSpace)); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithRed:green:blue:colorSpace:")
    public CIColor(@MachineSizedFloat double r, @MachineSizedFloat double g, @MachineSizedFloat double b, CGColorSpace colorSpace) { super((SkipInit) null); initObject(init(r, g, b, colorSpace)); }
    @Method(selector = "initWithCoder:")
    public CIColor(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    
    public CIColor(double r, double g, double b, double a) {
        super((Handle)null, create(r, g, b, a));
    }
    public CIColor(double r, double g, double b) {
        super((Handle)null, create(r, g, b));
    }
    public CIColor(String representation) {
        super((Handle)null, create(representation));
    }
    
    /*<properties>*/
    @Property(selector = "numberOfComponents")
    public native @MachineSizedUInt long getNumberOfComponents();
    @Property(selector = "components")
    protected native MachineSizedFloatPtr getComponents();
    @Property(selector = "alpha")
    public native @MachineSizedFloat double getAlpha();
    @Property(selector = "colorSpace")
    public native CGColorSpace getColorSpace();
    @Property(selector = "red")
    public native @MachineSizedFloat double getRed();
    @Property(selector = "green")
    public native @MachineSizedFloat double getGreen();
    @Property(selector = "blue")
    public native @MachineSizedFloat double getBlue();
    @Property(selector = "stringRepresentation")
    public native String getStringRepresentation();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "blackColor")
    public static native CIColor blackColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "whiteColor")
    public static native CIColor whiteColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "grayColor")
    public static native CIColor grayColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "redColor")
    public static native CIColor redColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "greenColor")
    public static native CIColor greenColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "blueColor")
    public static native CIColor blueColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "cyanColor")
    public static native CIColor cyanColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "magentaColor")
    public static native CIColor magentaColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "yellowColor")
    public static native CIColor yellowColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "clearColor")
    public static native CIColor clearColor();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public double[] getComponentsD() {
        return getComponents().toDoubleArray((int) getNumberOfComponents());
    }

    public float[] getComponentsF() {
        return getComponents().toFloatArray((int) getNumberOfComponents());
    }

    /* UIKit extensions */
    @WeaklyLinked
    public static CIColor fromUIColor(org.robovm.apple.uikit.UIColor color) {
        return CIColorExtensions.create(color);
    }
    
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithRed:green:blue:alpha:colorSpace:")
    protected native @Pointer long init(@MachineSizedFloat double r, @MachineSizedFloat double g, @MachineSizedFloat double b, @MachineSizedFloat double a, CGColorSpace colorSpace);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithRed:green:blue:colorSpace:")
    protected native @Pointer long init(@MachineSizedFloat double r, @MachineSizedFloat double g, @MachineSizedFloat double b, CGColorSpace colorSpace);
    @Method(selector = "colorWithCGColor:")
    protected static native @Pointer long create(CGColor c);
    @Method(selector = "colorWithRed:green:blue:alpha:")
    protected static native @Pointer long create(@MachineSizedFloat double r, @MachineSizedFloat double g, @MachineSizedFloat double b, @MachineSizedFloat double a);
    @Method(selector = "colorWithRed:green:blue:")
    protected static native @Pointer long create(@MachineSizedFloat double r, @MachineSizedFloat double g, @MachineSizedFloat double b);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "colorWithRed:green:blue:alpha:colorSpace:")
    protected static native @Pointer long create(@MachineSizedFloat double r, @MachineSizedFloat double g, @MachineSizedFloat double b, @MachineSizedFloat double a, CGColorSpace colorSpace);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "colorWithRed:green:blue:colorSpace:")
    protected static native @Pointer long create(@MachineSizedFloat double r, @MachineSizedFloat double g, @MachineSizedFloat double b, CGColorSpace colorSpace);
    @Method(selector = "colorWithString:")
    protected static native @Pointer long create(String representation);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
