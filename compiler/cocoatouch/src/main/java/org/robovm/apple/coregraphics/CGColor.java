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
package org.robovm.apple.coregraphics;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreGraphics")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGColor/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<?> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            return o.toList(CGColor.class);
        }
        @MarshalsPointer
        public static long toNative(List<? extends CFType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray o = null;
            if (l instanceof CFArray) {
                o = (CFArray) l;
            } else {
                o = CFArray.create((List<? extends CFType>) l);
            }
            return CFType.Marshaler.toNative(o, flags);
        }
    }
    
    /*<ptr>*/public static class CGColorPtr extends Ptr<CGColor, CGColorPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CGColor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CGColor() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public static CGColor create(CGColorSpace space, float[] components) {
        return create(space, components, components != null ? components.length : 0);
    }
    public static CGColor create(CGColorSpace space, double[] components) {
        return create(space, components, components != null ? components.length : 0);
    }
    private static CGColor create(CGColorSpace space, Object components, int componentsLength) {
        if (space == null) {
            throw new NullPointerException("space == null");
        }
        if (components == null) {
            throw new NullPointerException("components == null");
        }
        if (componentsLength != space.getNumberOfComponents() + 1) {
            throw new IllegalArgumentException("components.length != space.numberOfComponents + 1");
        }
        return create(space, VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(components)));
    }
    
    public static CGColor create(CGColorSpace space, CGPattern pattern, float[] components) {
        return create(space, pattern, components, components != null ? components.length : 0);
    }
    public static CGColor create(CGColorSpace space, CGPattern pattern, double[] components) {
        return create(space, pattern, components, components != null ? components.length : 0);
    }
    private static CGColor create(CGColorSpace space, CGPattern pattern, Object components, int componentsLength) {
        if (space == null) {
            throw new NullPointerException("space == null");
        }
        if (components == null) {
            throw new NullPointerException("components == null");
        }
        if (componentsLength != space.getNumberOfComponents() + 1) {
            throw new IllegalArgumentException("components.length != space.numberOfComponents + 1");
        }
        return create(space, pattern, VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(components)));
    }
    
    public double[] getComponentsD() {
        return getComponents(this).toDoubleArray((int) getNumberOfComponents());
    }
    public float[] getComponentsF() {
        return getComponents(this).toFloatArray((int) getNumberOfComponents());
    }
    /*<methods>*/
    @Library("CoreGraphics")
    public static class ConstantColors {
        static { Bro.bind(ConstantColors.class); }

        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGColorWhite", optional=true)
        public static native String White();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGColorBlack", optional=true)
        public static native String Black();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGColorClear", optional=true)
        public static native String Clear();
    }
    
    @Bridge(symbol="CGColorCreate", optional=true)
    private static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColor create(CGColorSpace space, @Pointer long components);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="CGColorCreateGenericGray", optional=true)
    public static native CGColor createGenericGray(@MachineSizedFloat double gray, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="CGColorCreateGenericRGB", optional=true)
    public static native CGColor createGenericRGB(@MachineSizedFloat double red, @MachineSizedFloat double green, @MachineSizedFloat double blue, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="CGColorCreateGenericCMYK", optional=true)
    public static native CGColor createGenericCMYK(@MachineSizedFloat double cyan, @MachineSizedFloat double magenta, @MachineSizedFloat double yellow, @MachineSizedFloat double black, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="CGColorCreateGenericGrayGamma2_2", optional=true)
    public static native CGColor createGenericGrayGamma2_2(@MachineSizedFloat double gray, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="CGColorCreateSRGB", optional=true)
    public static native CGColor createSRGB(@MachineSizedFloat double red, @MachineSizedFloat double green, @MachineSizedFloat double blue, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="CGColorGetConstantColor", optional=true)
    public static native CGColor getConstantColor(String colorName);
    @Bridge(symbol="CGColorCreateWithPattern", optional=true)
    private static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColor create(CGColorSpace space, CGPattern pattern, @Pointer long components);
    @Bridge(symbol="CGColorCreateCopy", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColor createCopy(CGColor color);
    @Bridge(symbol="CGColorCreateCopyWithAlpha", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColor createCopy(CGColor color, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="CGColorCreateCopyByMatchingToColorSpace", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColor createCopy(CGColorSpace p0, CGColorRenderingIntent intent, CGColor color, NSDictionary options);
    @Bridge(symbol="CGColorEqualToColor", optional=true)
    public native boolean equalsTo(CGColor color2);
    @Bridge(symbol="CGColorGetNumberOfComponents", optional=true)
    public native @MachineSizedUInt long getNumberOfComponents();
    @Bridge(symbol="CGColorGetComponents", optional=true)
    private static native MachineSizedFloatPtr getComponents(CGColor color);
    @Bridge(symbol="CGColorGetAlpha", optional=true)
    public native @MachineSizedFloat double getAlpha();
    @Bridge(symbol="CGColorGetColorSpace", optional=true)
    public native CGColorSpace getColorSpace();
    @Bridge(symbol="CGColorGetPattern", optional=true)
    public native CGPattern getPattern();
    @Bridge(symbol="CGColorGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    /*</methods>*/
}
