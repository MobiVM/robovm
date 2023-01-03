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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGColorSpace/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGColorSpacePtr extends Ptr<CGColorSpace, CGColorSpacePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CGColorSpace.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CGColorSpace() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    
    public static CGColorSpace createCalibratedGray(double[] whitePoint, double[] blackPoint, double gamma) {
        if (whitePoint == null) {
            throw new NullPointerException("whitePoint");
        }
        if (blackPoint == null) {
            throw new NullPointerException("blackPoint");
        }
        if (whitePoint.length != 3) {
            throw new IllegalArgumentException("whitePoint.length != 3 (" + whitePoint.length + ")");
        }
        if (blackPoint.length != 3) {
            throw new IllegalArgumentException("blackPoint.length != 3 (" + blackPoint.length + ")");
        }
        return createCalibratedGray(
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(whitePoint)), 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(blackPoint)), 
                gamma);
    }

    public static CGColorSpace createCalibratedGray(float[] whitePoint, float[] blackPoint, double gamma) {
        if (whitePoint == null) {
            throw new NullPointerException("whitePoint");
        }
        if (blackPoint == null) {
            throw new NullPointerException("blackPoint");
        }
        if (whitePoint.length != 3) {
            throw new IllegalArgumentException("whitePoint.length != 3 (" + whitePoint.length + ")");
        }
        if (blackPoint.length != 3) {
            throw new IllegalArgumentException("blackPoint.length != 3 (" + blackPoint.length + ")");
        }
        return createCalibratedGray(
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(whitePoint)), 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(blackPoint)), 
                gamma);
    }

    public static CGColorSpace createCalibratedRGB(double[] whitePoint, double[] blackPoint, double[] gamma, double[] matrix) {
        if (whitePoint == null) {
            throw new NullPointerException("whitePoint");
        }
        if (blackPoint == null) {
            throw new NullPointerException("blackPoint");
        }
        if (gamma == null) {
            throw new NullPointerException("gamma");
        }
        if (matrix == null) {
            throw new NullPointerException("matrix");
        }
        if (whitePoint.length != 3) {
            throw new IllegalArgumentException("whitePoint.length != 3 (" + whitePoint.length + ")");
        }
        if (blackPoint.length != 3) {
            throw new IllegalArgumentException("blackPoint.length != 3 (" + blackPoint.length + ")");
        }
        if (gamma.length != 3) {
            throw new IllegalArgumentException("gamma.length != 3 (" + gamma.length + ")");
        }
        if (matrix.length != 9) {
            throw new IllegalArgumentException("matrix.length != 9 (" + matrix.length + ")");
        }
        return createCalibratedRGB(
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(whitePoint)), 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(blackPoint)), 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(gamma)), 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(matrix)));
    }

    public static CGColorSpace createCalibratedRGB(float[] whitePoint, float[] blackPoint, float[] gamma, float[] matrix) {
        if (whitePoint == null) {
            throw new NullPointerException("whitePoint");
        }
        if (blackPoint == null) {
            throw new NullPointerException("blackPoint");
        }
        if (gamma == null) {
            throw new NullPointerException("gamma");
        }
        if (matrix == null) {
            throw new NullPointerException("matrix");
        }
        if (whitePoint.length != 3) {
            throw new IllegalArgumentException("whitePoint.length != 3 (" + whitePoint.length + ")");
        }
        if (blackPoint.length != 3) {
            throw new IllegalArgumentException("blackPoint.length != 3 (" + blackPoint.length + ")");
        }
        if (gamma.length != 3) {
            throw new IllegalArgumentException("gamma.length != 3 (" + gamma.length + ")");
        }
        if (matrix.length != 9) {
            throw new IllegalArgumentException("matrix.length != 9 (" + matrix.length + ")");
        }
        return createCalibratedRGB(
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(whitePoint)), 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(blackPoint)), 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(gamma)), 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(matrix)));
    }
    
    public static CGColorSpace createICCBased(long nComponents, double[] range, CGDataProvider profile, CGColorSpace alternate) {
        if (range == null) {
            throw new NullPointerException("range");
        }
        if (range.length != nComponents * 2) {
            throw new IllegalArgumentException("range.length != " + nComponents * 2 + " (" + range.length + ")");
        }
        return createICCBased(nComponents, 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(range)), 
                profile, alternate);
    }

    public static CGColorSpace createICCBased(long nComponents, float[] range, CGDataProvider profile, CGColorSpace alternate) {
        if (range == null) {
            throw new NullPointerException("range");
        }
        if (range.length != nComponents * 2) {
            throw new IllegalArgumentException("range.length != " + nComponents * 2 + " (" + range.length + ")");
        }
        return createICCBased(nComponents, 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(range)), 
                profile, alternate);
    }

    public static CGColorSpace createLab(double[] whitePoint, double[] blackPoint, double[] range) {
        if (whitePoint == null) {
            throw new NullPointerException("whitePoint");
        }
        if (blackPoint == null) {
            throw new NullPointerException("blackPoint");
        }
        if (range == null) {
            throw new NullPointerException("range");
        }
        if (whitePoint.length != 3) {
            throw new IllegalArgumentException("whitePoint.length != 3 (" + whitePoint.length + ")");
        }
        if (blackPoint.length != 3) {
            throw new IllegalArgumentException("blackPoint.length != 3 (" + blackPoint.length + ")");
        }
        if (range.length != 4) {
            throw new IllegalArgumentException("range.length != 4 (" + range.length + ")");
        }
        return createLab(
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(whitePoint)), 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(blackPoint)), 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(range)));
    }
    
    public static CGColorSpace createLab(float[] whitePoint, float[] blackPoint, float[] range) {
        if (whitePoint == null) {
            throw new NullPointerException("whitePoint");
        }
        if (blackPoint == null) {
            throw new NullPointerException("blackPoint");
        }
        if (range == null) {
            throw new NullPointerException("range");
        }
        if (whitePoint.length != 3) {
            throw new IllegalArgumentException("whitePoint.length != 3 (" + whitePoint.length + ")");
        }
        if (blackPoint.length != 3) {
            throw new IllegalArgumentException("blackPoint.length != 3 (" + blackPoint.length + ")");
        }
        if (range.length != 4) {
            throw new IllegalArgumentException("range.length != 4 (" + range.length + ")");
        }
        return createLab(
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(whitePoint)), 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(blackPoint)), 
                VM.getArrayValuesAddress(CoreGraphics.toMachineSizedFloatArray(range)));
    }
    
    public static CGColorSpace createIndexed(CGColorSpace baseSpace, long lastIndex, byte[] colorTable) {
        if (baseSpace == null) {
            throw new NullPointerException("baseSpace");
        }
        if (colorTable == null) {
            throw new NullPointerException("colorTable");
        }
        long m = baseSpace.getNumberOfComponents();
        if (colorTable.length != m * (lastIndex + 1)) {
            throw new IllegalArgumentException("colorTable.length != " + (m * (lastIndex + 1)) 
                    + " (" + colorTable.length + ")");
        }
        return createIndexed(baseSpace, lastIndex, VM.getArrayValuesAddress(colorTable));
    }
    
    public byte[] getColorTable() {
        long len = getColorTableCount();
        if (len == 0) {
            throw new IllegalStateException("Not an indexed color space");
        }
        byte[] table = new byte[(int) len];
        getColorTable(VM.getArrayValuesAddress(table));
        return table;
    }
    
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceGenericGray", optional=true)
    public static native String GenericGray();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceGenericRGB", optional=true)
    public static native String GenericRGB();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceGenericCMYK", optional=true)
    public static native String GenericCMYK();
    /**
     * @since Available in iOS 9.3 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceDisplayP3", optional=true)
    public static native String DisplayP3();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceGenericRGBLinear", optional=true)
    public static native String GenericRGBLinear();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceAdobeRGB1998", optional=true)
    public static native String AdobeRGB1998();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceSRGB", optional=true)
    public static native String SRGB();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceGenericGrayGamma2_2", optional=true)
    public static native String GenericGrayGamma2_2();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceGenericXYZ", optional=true)
    public static native String GenericXYZ();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceGenericLab", optional=true)
    public static native String GenericLab();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceACESCGLinear", optional=true)
    public static native String ACESCGLinear();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceITUR_709", optional=true)
    public static native String ITUR_709();
    /**
     * @since Available in iOS 15.1 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceITUR_709_PQ", optional=true)
    public static native String ITUR_709_PQ();
    /**
     * @since Available in iOS 15.1 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceITUR_709_HLG", optional=true)
    public static native String ITUR_709_HLG();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceITUR_2020", optional=true)
    public static native String ITUR_2020();
    /**
     * @since Available in iOS 15.1 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceITUR_2020_sRGBGamma", optional=true)
    public static native String ITUR_2020_sRGBGamma();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceROMMRGB", optional=true)
    public static native String ROMMRGB();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceDCIP3", optional=true)
    public static native String DCIP3();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceLinearITUR_2020", optional=true)
    public static native String LinearITUR_2020();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceExtendedITUR_2020", optional=true)
    public static native String ExtendedITUR_2020();
    /**
     * @since Available in iOS 12.3 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceExtendedLinearITUR_2020", optional=true)
    public static native String ExtendedLinearITUR_2020();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceLinearDisplayP3", optional=true)
    public static native String LinearDisplayP3();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceExtendedDisplayP3", optional=true)
    public static native String ExtendedDisplayP3();
    /**
     * @since Available in iOS 12.3 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceExtendedLinearDisplayP3", optional=true)
    public static native String ExtendedLinearDisplayP3();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceITUR_2100_PQ", optional=true)
    public static native String ITUR_2100_PQ();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceITUR_2100_HLG", optional=true)
    public static native String ITUR_2100_HLG();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceDisplayP3_PQ", optional=true)
    public static native String DisplayP3_PQ();
    /**
     * @since Available in iOS 12.6 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceDisplayP3_HLG", optional=true)
    public static native String DisplayP3_HLG();
    /**
     * @since Available in iOS 13.4 and later.
     * @deprecated Deprecated in iOS 14.0. No longer supported
     */
    @Deprecated
    @GlobalValue(symbol="kCGColorSpaceITUR_2020_PQ", optional=true)
    public static native String ITUR_2020_PQ();
    /**
     * @since Available in iOS 12.6 and later.
     * @deprecated Deprecated in iOS 14.0. No longer supported
     */
    @Deprecated
    @GlobalValue(symbol="kCGColorSpaceITUR_2020_HLG", optional=true)
    public static native String ITUR_2020_HLG();
    /**
     * @since Available in iOS 12.6 and later.
     * @deprecated Deprecated in iOS 13.4. No longer supported
     */
    @Deprecated
    @GlobalValue(symbol="kCGColorSpaceDisplayP3_PQ_EOTF", optional=true)
    public static native String DisplayP3_PQ_EOTF();
    /**
     * @since Available in iOS 12.6 and later.
     * @deprecated Deprecated in iOS 13.4. No longer supported
     */
    @Deprecated
    @GlobalValue(symbol="kCGColorSpaceITUR_2020_PQ_EOTF", optional=true)
    public static native String ITUR_2020_PQ_EOTF();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceExtendedSRGB", optional=true)
    public static native String ExtendedSRGB();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceLinearSRGB", optional=true)
    public static native String LinearSRGB();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceExtendedLinearSRGB", optional=true)
    public static native String ExtendedLinearSRGB();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceExtendedGray", optional=true)
    public static native String ExtendedGray();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceLinearGray", optional=true)
    public static native String LinearGray();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="kCGColorSpaceExtendedLinearGray", optional=true)
    public static native String ExtendedLinearGray();
    @GlobalValue(symbol="kCGColorSpaceExtendedRange", optional=true)
    public static native String ExtendedRange();
    
    @Bridge(symbol="CGColorSpaceCreateDeviceGray", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createDeviceGray();
    @Bridge(symbol="CGColorSpaceCreateDeviceRGB", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createDeviceRGB();
    @Bridge(symbol="CGColorSpaceCreateDeviceCMYK", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createDeviceCMYK();
    @Bridge(symbol="CGColorSpaceCreateCalibratedGray", optional=true)
    private static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createCalibratedGray(@Pointer long whitePoint, @Pointer long blackPoint, @MachineSizedFloat double gamma);
    @Bridge(symbol="CGColorSpaceCreateCalibratedRGB", optional=true)
    private static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createCalibratedRGB(@Pointer long whitePoint, @Pointer long blackPoint, @Pointer long gamma, @Pointer long matrix);
    @Bridge(symbol="CGColorSpaceCreateLab", optional=true)
    private static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createLab(@Pointer long whitePoint, @Pointer long blackPoint, @Pointer long range);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="CGColorSpaceCreateWithICCData", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createWithICCData(CFType data);
    @Bridge(symbol="CGColorSpaceCreateICCBased", optional=true)
    private static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createICCBased(@MachineSizedUInt long nComponents, @Pointer long range, CGDataProvider profile, CGColorSpace alternate);
    @Bridge(symbol="CGColorSpaceCreateIndexed", optional=true)
    private static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createIndexed(CGColorSpace baseSpace, @MachineSizedUInt long lastIndex, @Pointer long colorTable);
    @Bridge(symbol="CGColorSpaceCreatePattern", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createPattern(CGColorSpace baseSpace);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="CGColorSpaceCreateWithColorSyncProfile", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createWithColorSyncProfile(ColorSyncProfile p0, NSDictionary options);
    @Bridge(symbol="CGColorSpaceCreateWithName", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace create(String name);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="CGColorSpaceGetName", optional=true)
    public native String getName();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="CGColorSpaceCopyName", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFString.AsStringNoRetainMarshaler.class) String copyName();
    @Bridge(symbol="CGColorSpaceGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    @Bridge(symbol="CGColorSpaceGetNumberOfComponents", optional=true)
    public native @MachineSizedUInt long getNumberOfComponents();
    @Bridge(symbol="CGColorSpaceGetModel", optional=true)
    public native CGColorSpaceModel getModel();
    @Bridge(symbol="CGColorSpaceGetBaseColorSpace", optional=true)
    public native CGColorSpace getBaseColorSpace();
    @Bridge(symbol="CGColorSpaceGetColorTableCount", optional=true)
    public native @MachineSizedUInt long getColorTableCount();
    @Bridge(symbol="CGColorSpaceGetColorTable", optional=true)
    private native void getColorTable(@Pointer long table);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="CGColorSpaceCopyICCData", optional=true)
    public native NSData copyICCData();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="CGColorSpaceIsWideGamutRGB", optional=true)
    public native boolean isWideGamutRGB();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 13.4. No longer supported
     */
    @Deprecated
    @Bridge(symbol="CGColorSpaceIsHDR", optional=true)
    public native boolean isHDR();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="CGColorSpaceUsesITUR_2100TF", optional=true)
    public native boolean usesITUR_2100TF();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="CGColorSpaceIsPQBased", optional=true)
    public native boolean isPQBased();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="CGColorSpaceIsHLGBased", optional=true)
    public native boolean isHLGBased();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="CGColorSpaceSupportsOutput", optional=true)
    public native boolean supportsOutput();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="CGColorSpaceCopyPropertyList", optional=true)
    public native CFType copyPropertyList();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="CGColorSpaceCreateWithPropertyList", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createWithPropertyList(CFType plist);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol="CGColorSpaceUsesExtendedRange", optional=true)
    public native boolean usesExtendedRange();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="CGColorSpaceCreateLinearized", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createLinearized(CGColorSpace space);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="CGColorSpaceCreateExtended", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createExtended(CGColorSpace space);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="CGColorSpaceCreateExtendedLinearized", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createExtendedLinearized(CGColorSpace space);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Bridge(symbol="CGColorSpaceCreateCopyWithStandardRange", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createCopyWithStandardRange(CGColorSpace s);
    /**
     * @deprecated Deprecated in iOS 11.0. No longer supported
     */
    @Deprecated
    @Bridge(symbol="CGColorSpaceCreateWithICCProfile", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGColorSpace createWithICCProfile(NSData data);
    /**
     * @deprecated Deprecated in iOS 11.0. No longer supported
     */
    @Deprecated
    @Bridge(symbol="CGColorSpaceCopyICCProfile", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(NSObject.NoRetainMarshaler.class) NSData getICCProfile();
    /*</methods>*/
}
