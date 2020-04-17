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
package org.robovm.apple.corevideo;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreVideo")/*</annotations>*/
@Marshaler(/*<name>*/CVImageBufferAttributes/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CVImageBufferAttributes/*</name>*/ 
    extends /*<extends>*/CVBufferAttributes/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CVImageBufferAttributes toObject(Class<CVImageBufferAttributes> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CVImageBufferAttributes(o);
        }
        @MarshalsPointer
        public static long toNative(CVImageBufferAttributes o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CVImageBufferAttributes> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CVImageBufferAttributes> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CVImageBufferAttributes(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CVImageBufferAttributes> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CVImageBufferAttributes i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CVImageBufferAttributes(CFDictionary data) {
        super(data);
    }
    public CVImageBufferAttributes() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(CVImageBufferAttribute key) {
        return data.containsKey(key.value());
    }
    public <T extends NativeObject> T get(CVImageBufferAttribute key, Class<T> type) {
        if (has(key)) {
            return data.get(key.value(), type);
        }
        return null;
    }
    public CVImageBufferAttributes set(CVImageBufferAttribute key, NativeObject value) {
        data.put(key.value(), value);
        return this;
    }
    

    public CGColorSpace getCGColorSpace() {
        if (has(CVImageBufferAttribute.CGColorSpace)) {
            CGColorSpace val = get(CVImageBufferAttribute.CGColorSpace, CGColorSpace.class);
            return val;
        }
        return null;
    }
    public CVImageBufferAttributes setCGColorSpace(CGColorSpace cGColorSpace) {
        set(CVImageBufferAttribute.CGColorSpace, cGColorSpace);
        return this;
    }
    public CVImageBufferCleanAperture getCleanAperture() {
        if (has(CVImageBufferAttribute.CleanAperture)) {
            CFDictionary val = get(CVImageBufferAttribute.CleanAperture, CFDictionary.class);
            return new CVImageBufferCleanAperture(val);
        }
        return null;
    }
    public CVImageBufferAttributes setCleanAperture(CVImageBufferCleanAperture cleanAperture) {
        set(CVImageBufferAttribute.CleanAperture, cleanAperture.getDictionary());
        return this;
    }
    public CVImageBufferCleanAperture getPreferredCleanAperture() {
        if (has(CVImageBufferAttribute.PreferredCleanAperture)) {
            CFDictionary val = get(CVImageBufferAttribute.PreferredCleanAperture, CFDictionary.class);
            return new CVImageBufferCleanAperture(val);
        }
        return null;
    }
    public CVImageBufferAttributes setPreferredCleanAperture(CVImageBufferCleanAperture preferredCleanAperture) {
        set(CVImageBufferAttribute.PreferredCleanAperture, preferredCleanAperture.getDictionary());
        return this;
    }
    public int getFieldCount() {
        if (has(CVImageBufferAttribute.FieldCount)) {
            CFNumber val = get(CVImageBufferAttribute.FieldCount, CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CVImageBufferAttributes setFieldCount(int fieldCount) {
        set(CVImageBufferAttribute.FieldCount, CFNumber.valueOf(fieldCount));
        return this;
    }
    public CVImageBufferFieldDetail getFieldDetail() {
        if (has(CVImageBufferAttribute.FieldDetail)) {
            CFString val = get(CVImageBufferAttribute.FieldDetail, CFString.class);
            return CVImageBufferFieldDetail.valueOf(val);
        }
        return null;
    }
    public CVImageBufferAttributes setFieldDetail(CVImageBufferFieldDetail fieldDetail) {
        set(CVImageBufferAttribute.FieldDetail, fieldDetail.value());
        return this;
    }
    public CVImageBufferPixelAspectRatio getPixelAspectRatio() {
        if (has(CVImageBufferAttribute.PixelAspectRatio)) {
            CFDictionary val = get(CVImageBufferAttribute.PixelAspectRatio, CFDictionary.class);
            return new CVImageBufferPixelAspectRatio(val);
        }
        return null;
    }
    public CVImageBufferAttributes setPixelAspectRatio(CVImageBufferPixelAspectRatio pixelAspectRatio) {
        set(CVImageBufferAttribute.PixelAspectRatio, pixelAspectRatio.getDictionary());
        return this;
    }
    public CVImageBufferDisplayDimensions getDisplayDimensions() {
        if (has(CVImageBufferAttribute.DisplayDimensions)) {
            CFDictionary val = get(CVImageBufferAttribute.DisplayDimensions, CFDictionary.class);
            return new CVImageBufferDisplayDimensions(val);
        }
        return null;
    }
    public CVImageBufferAttributes setDisplayDimensions(CVImageBufferDisplayDimensions displayDimensions) {
        set(CVImageBufferAttribute.DisplayDimensions, displayDimensions.getDictionary());
        return this;
    }
    public double getGammaLevel() {
        if (has(CVImageBufferAttribute.GammaLevel)) {
            CFNumber val = get(CVImageBufferAttribute.GammaLevel, CFNumber.class);
            return val.doubleValue();
        }
        return 0;
    }
    public CVImageBufferAttributes setGammaLevel(double gammaLevel) {
        set(CVImageBufferAttribute.GammaLevel, CFNumber.valueOf(gammaLevel));
        return this;
    }
    public NSData getICCProfile() {
        if (has(CVImageBufferAttribute.ICCProfile)) {
            NSData val = get(CVImageBufferAttribute.ICCProfile, NSData.class);
            return val;
        }
        return null;
    }
    public CVImageBufferAttributes setICCProfile(NSData iCCProfile) {
        set(CVImageBufferAttribute.ICCProfile, iCCProfile);
        return this;
    }
    public CVImageBufferYCbCrMatrix getYCbCrMatrix() {
        if (has(CVImageBufferAttribute.YCbCrMatrix)) {
            CFString val = get(CVImageBufferAttribute.YCbCrMatrix, CFString.class);
            return CVImageBufferYCbCrMatrix.valueOf(val);
        }
        return null;
    }
    public CVImageBufferAttributes setYCbCrMatrix(CVImageBufferYCbCrMatrix yCbCrMatrix) {
        set(CVImageBufferAttribute.YCbCrMatrix, yCbCrMatrix.value());
        return this;
    }
    public CVImageBufferColorPrimaries getColorPrimaries() {
        if (has(CVImageBufferAttribute.ColorPrimaries)) {
            CFString val = get(CVImageBufferAttribute.ColorPrimaries, CFString.class);
            return CVImageBufferColorPrimaries.valueOf(val);
        }
        return null;
    }
    public CVImageBufferAttributes setColorPrimaries(CVImageBufferColorPrimaries colorPrimaries) {
        set(CVImageBufferAttribute.ColorPrimaries, colorPrimaries.value());
        return this;
    }
    public CVImageBufferTransferFunction getTransferFunction() {
        if (has(CVImageBufferAttribute.TransferFunction)) {
            CFString val = get(CVImageBufferAttribute.TransferFunction, CFString.class);
            return CVImageBufferTransferFunction.valueOf(val);
        }
        return null;
    }
    public CVImageBufferAttributes setTransferFunction(CVImageBufferTransferFunction transferFunction) {
        set(CVImageBufferAttribute.TransferFunction, transferFunction.value());
        return this;
    }
    public CVImageBufferChromaLocation getChromaLocationTopField() {
        if (has(CVImageBufferAttribute.ChromaLocationTopField)) {
            CFString val = get(CVImageBufferAttribute.ChromaLocationTopField, CFString.class);
            return CVImageBufferChromaLocation.valueOf(val);
        }
        return null;
    }
    public CVImageBufferAttributes setChromaLocationTopField(CVImageBufferChromaLocation chromaLocationTopField) {
        set(CVImageBufferAttribute.ChromaLocationTopField, chromaLocationTopField.value());
        return this;
    }
    public CVImageBufferChromaLocation getChromaLocationBottomField() {
        if (has(CVImageBufferAttribute.ChromaLocationBottomField)) {
            CFString val = get(CVImageBufferAttribute.ChromaLocationBottomField, CFString.class);
            return CVImageBufferChromaLocation.valueOf(val);
        }
        return null;
    }
    public CVImageBufferAttributes setChromaLocationBottomField(CVImageBufferChromaLocation chromaLocationBottomField) {
        set(CVImageBufferAttribute.ChromaLocationBottomField, chromaLocationBottomField.value());
        return this;
    }
    public CVImageBufferChromaSubsampling getChromaSubsampling() {
        if (has(CVImageBufferAttribute.ChromaSubsampling)) {
            CFString val = get(CVImageBufferAttribute.ChromaSubsampling, CFString.class);
            return CVImageBufferChromaSubsampling.valueOf(val);
        }
        return null;
    }
    public CVImageBufferAttributes setChromaSubsampling(CVImageBufferChromaSubsampling chromaSubsampling) {
        set(CVImageBufferAttribute.ChromaSubsampling, chromaSubsampling.value());
        return this;
    }
    public boolean isAlphaChannelOpaque() {
        if (has(CVImageBufferAttribute.AlphaChannelIsOpaque)) {
            CFBoolean val = get(CVImageBufferAttribute.AlphaChannelIsOpaque, CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVImageBufferAttributes setAlphaChannelOpaque(boolean alphaChannelOpaque) {
        set(CVImageBufferAttribute.AlphaChannelIsOpaque, CFBoolean.valueOf(alphaChannelOpaque));
        return this;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CVImageBufferAlphaChannelMode getAlphaChannelMode() {
        if (has(CVImageBufferAttribute.AlphaChannelMode)) {
            CFString val = get(CVImageBufferAttribute.AlphaChannelMode, CFString.class);
            return CVImageBufferAlphaChannelMode.valueOf(val);
        }
        return null;
    }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public CVImageBufferAttributes setAlphaChannelMode(CVImageBufferAlphaChannelMode alphaChannelMode) {
        set(CVImageBufferAttribute.AlphaChannelMode, alphaChannelMode.value());
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    /*</keys>*/
}
