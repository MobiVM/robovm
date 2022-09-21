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
@Marshaler(/*<name>*/CVPixelFormatDescription/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CVPixelFormatDescription/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CVPixelFormatDescription toObject(Class<CVPixelFormatDescription> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CVPixelFormatDescription(o);
        }
        @MarshalsPointer
        public static long toNative(CVPixelFormatDescription o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CVPixelFormatDescription> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CVPixelFormatDescription> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CVPixelFormatDescription(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CVPixelFormatDescription> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CVPixelFormatDescription i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    public interface FillExtendedPixelsCallback {
        boolean fillExtendedPixels(CVPixelBuffer pixelBuffer);
    }
    
    private static java.util.concurrent.atomic.AtomicLong refconId = new java.util.concurrent.atomic.AtomicLong();
    private static LongMap<FillExtendedPixelsCallback> callbacks = new LongMap<>();
    private static final java.lang.reflect.Method cbFillExtendedPixels;
    
    static {
        try {
            cbFillExtendedPixels = CVPixelFormatDescription.class.getDeclaredMethod("cbFillExtendedPixels", CVPixelBuffer.class, long.class);
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
    
    @Callback
    private static boolean cbFillExtendedPixels(CVPixelBuffer pixelBuffer, long refcon) {
        FillExtendedPixelsCallback callback = null;
        synchronized (callbacks) {
            callback = callbacks.get(refcon);
        }
        return callback.fillExtendedPixels(pixelBuffer);
    }
    
    /*<constructors>*/
    CVPixelFormatDescription(CFDictionary data) {
        super(data);
    }
    public CVPixelFormatDescription() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(CFString key) {
        return data.containsKey(key);
    }
    public <T extends NativeObject> T get(CFString key, Class<T> type) {
        if (has(key)) {
            return data.get(key, type);
        }
        return null;
    }
    public CVPixelFormatDescription set(CFString key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    

    public String getName() {
        if (has(Keys.Name())) {
            CFString val = get(Keys.Name(), CFString.class);
            return val.toString();
        }
        return null;
    }
    public CVPixelFormatDescription setName(String name) {
        set(Keys.Name(), new CFString(name));
        return this;
    }
    public long getConstant() {
        if (has(Keys.Constant())) {
            CFNumber val = get(Keys.Constant(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CVPixelFormatDescription setConstant(long constant) {
        set(Keys.Constant(), CFNumber.valueOf(constant));
        return this;
    }
    public String getCodecType() {
        if (has(Keys.CodecType())) {
            CFString val = get(Keys.CodecType(), CFString.class);
            return val.toString();
        }
        return null;
    }
    public CVPixelFormatDescription setCodecType(String codecType) {
        set(Keys.CodecType(), new CFString(codecType));
        return this;
    }
    public String getFourCC() {
        if (has(Keys.FourCC())) {
            CFString val = get(Keys.FourCC(), CFString.class);
            return val.toString();
        }
        return null;
    }
    public CVPixelFormatDescription setFourCC(String fourCC) {
        set(Keys.FourCC(), new CFString(fourCC));
        return this;
    }
    public boolean containsAlpha() {
        if (has(Keys.ContainsAlpha())) {
            CFBoolean val = get(Keys.ContainsAlpha(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelFormatDescription setContainsAlpha(boolean containsAlpha) {
        set(Keys.ContainsAlpha(), CFBoolean.valueOf(containsAlpha));
        return this;
    }
    public boolean containsYCbCr() {
        if (has(Keys.ContainsYCbCr())) {
            CFBoolean val = get(Keys.ContainsYCbCr(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelFormatDescription setContainsYCbCr(boolean containsYCbCr) {
        set(Keys.ContainsYCbCr(), CFBoolean.valueOf(containsYCbCr));
        return this;
    }
    public boolean containsRGB() {
        if (has(Keys.ContainsRGB())) {
            CFBoolean val = get(Keys.ContainsRGB(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelFormatDescription setContainsRGB(boolean containsRGB) {
        set(Keys.ContainsRGB(), CFBoolean.valueOf(containsRGB));
        return this;
    }
    public int getPlanes() {
        if (has(Keys.Planes())) {
            CFNumber val = get(Keys.Planes(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CVPixelFormatDescription setPlanes(int planes) {
        set(Keys.Planes(), CFNumber.valueOf(planes));
        return this;
    }
    public int getBlockWidth() {
        if (has(Keys.BlockWidth())) {
            CFNumber val = get(Keys.BlockWidth(), CFNumber.class);
            return val.intValue();
        }
        return 1;
    }
    public CVPixelFormatDescription setBlockWidth(int blockWidth) {
        set(Keys.BlockWidth(), CFNumber.valueOf(blockWidth));
        return this;
    }
    public int getBlockHeight() {
        if (has(Keys.BlockHeight())) {
            CFNumber val = get(Keys.BlockHeight(), CFNumber.class);
            return val.intValue();
        }
        return 1;
    }
    public CVPixelFormatDescription setBlockHeight(int blockHeight) {
        set(Keys.BlockHeight(), CFNumber.valueOf(blockHeight));
        return this;
    }
    public int getBitsPerBlock() {
        if (has(Keys.BitsPerBlock())) {
            CFNumber val = get(Keys.BitsPerBlock(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CVPixelFormatDescription setBitsPerBlock(int bitsPerBlock) {
        set(Keys.BitsPerBlock(), CFNumber.valueOf(bitsPerBlock));
        return this;
    }
    public int getBlockHorizontalAlignment() {
        if (has(Keys.BlockHorizontalAlignment())) {
            CFNumber val = get(Keys.BlockHorizontalAlignment(), CFNumber.class);
            return val.intValue();
        }
        return 1;
    }
    public CVPixelFormatDescription setBlockHorizontalAlignment(int blockHorizontalAlignment) {
        set(Keys.BlockHorizontalAlignment(), CFNumber.valueOf(blockHorizontalAlignment));
        return this;
    }
    public int getBlockVerticalAlignment() {
        if (has(Keys.BlockVerticalAlignment())) {
            CFNumber val = get(Keys.BlockVerticalAlignment(), CFNumber.class);
            return val.intValue();
        }
        return 1;
    }
    public CVPixelFormatDescription setBlockVerticalAlignment(int blockVerticalAlignment) {
        set(Keys.BlockVerticalAlignment(), CFNumber.valueOf(blockVerticalAlignment));
        return this;
    }
    public NSData getBlackBlock() {
        if (has(Keys.BlackBlock())) {
            NSData val = get(Keys.BlackBlock(), NSData.class);
            return val;
        }
        return null;
    }
    public CVPixelFormatDescription setBlackBlock(NSData blackBlock) {
        set(Keys.BlackBlock(), blackBlock);
        return this;
    }
    public int getHorizontalSubsampling() {
        if (has(Keys.HorizontalSubsampling())) {
            CFNumber val = get(Keys.HorizontalSubsampling(), CFNumber.class);
            return val.intValue();
        }
        return 1;
    }
    public CVPixelFormatDescription setHorizontalSubsampling(int horizontalSubsampling) {
        set(Keys.HorizontalSubsampling(), CFNumber.valueOf(horizontalSubsampling));
        return this;
    }
    public int getVerticalSubsampling() {
        if (has(Keys.VerticalSubsampling())) {
            CFNumber val = get(Keys.VerticalSubsampling(), CFNumber.class);
            return val.intValue();
        }
        return 1;
    }
    public CVPixelFormatDescription setVerticalSubsampling(int verticalSubsampling) {
        set(Keys.VerticalSubsampling(), CFNumber.valueOf(verticalSubsampling));
        return this;
    }
    public int getOpenGLFormat() {
        if (has(Keys.OpenGLFormat())) {
            CFNumber val = get(Keys.OpenGLFormat(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CVPixelFormatDescription setOpenGLFormat(int openGLFormat) {
        set(Keys.OpenGLFormat(), CFNumber.valueOf(openGLFormat));
        return this;
    }
    public int getOpenGLType() {
        if (has(Keys.OpenGLType())) {
            CFNumber val = get(Keys.OpenGLType(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CVPixelFormatDescription setOpenGLType(int openGLType) {
        set(Keys.OpenGLType(), CFNumber.valueOf(openGLType));
        return this;
    }
    public int getOpenGLInternalFormat() {
        if (has(Keys.OpenGLInternalFormat())) {
            CFNumber val = get(Keys.OpenGLInternalFormat(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CVPixelFormatDescription setOpenGLInternalFormat(int openGLInternalFormat) {
        set(Keys.OpenGLInternalFormat(), CFNumber.valueOf(openGLInternalFormat));
        return this;
    }
    public CGBitmapInfo getCGBitmapInfo() {
        if (has(Keys.CGBitmapInfo())) {
            CFNumber val = get(Keys.CGBitmapInfo(), CFNumber.class);
            return new CGBitmapInfo(val.longValue());
        }
        return null;
    }
    public CVPixelFormatDescription setCGBitmapInfo(CGBitmapInfo cGBitmapInfo) {
        set(Keys.CGBitmapInfo(), CFNumber.valueOf(cGBitmapInfo.value()));
        return this;
    }
    public boolean isCompatibleWithQD() {
        if (has(Keys.QDCompatibility())) {
            CFBoolean val = get(Keys.QDCompatibility(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelFormatDescription setCompatibleWithQD(boolean compatibleWithQD) {
        set(Keys.QDCompatibility(), CFBoolean.valueOf(compatibleWithQD));
        return this;
    }
    public boolean isCompatibleWithCGBitmapContext() {
        if (has(Keys.CGBitmapContextCompatibility())) {
            CFBoolean val = get(Keys.CGBitmapContextCompatibility(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelFormatDescription setCompatibleWithCGBitmapContext(boolean compatibleWithCGBitmapContext) {
        set(Keys.CGBitmapContextCompatibility(), CFBoolean.valueOf(compatibleWithCGBitmapContext));
        return this;
    }
    public boolean isCompatibleWithCGImage() {
        if (has(Keys.CGImageCompatibility())) {
            CFBoolean val = get(Keys.CGImageCompatibility(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelFormatDescription setCompatibleWithCGImage(boolean compatibleWithCGImage) {
        set(Keys.CGImageCompatibility(), CFBoolean.valueOf(compatibleWithCGImage));
        return this;
    }
    public boolean isCompatibleWithOpenGL() {
        if (has(Keys.OpenGLCompatibility())) {
            CFBoolean val = get(Keys.OpenGLCompatibility(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelFormatDescription setCompatibleWithOpenGL(boolean compatibleWithOpenGL) {
        set(Keys.OpenGLCompatibility(), CFBoolean.valueOf(compatibleWithOpenGL));
        return this;
    }
    public boolean isCompatibleWithOpenGLES() {
        if (has(Keys.OpenGLESCompatibility())) {
            CFBoolean val = get(Keys.OpenGLESCompatibility(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CVPixelFormatDescription setCompatibleWithOpenGLES(boolean compatibleWithOpenGLES) {
        set(Keys.OpenGLESCompatibility(), CFBoolean.valueOf(compatibleWithOpenGLES));
        return this;
    }
    
    @Bridge(symbol="CVPixelFormatDescriptionCreateWithPixelFormatType", optional=true)
    public static native CVPixelFormatDescription create(CFAllocator allocator, CVPixelFormatType pixelFormat);
    @Bridge(symbol="CVPixelFormatDescriptionArrayCreateWithAllPixelFormatTypes", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CVPixelFormatType.AsListMarshaler.class) List<CVPixelFormatType> getAllPixelFormatTypes(CFAllocator allocator);
    @Bridge(symbol="CVPixelFormatDescriptionRegisterDescriptionWithPixelFormatType", optional=true)
    public static native void registerDescription(CVPixelFormatDescription description, CVPixelFormatType pixelFormat);
    /*</methods>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static CVPixelFormatDescription create(CVPixelFormatType pixelFormat) {
        return create(null, pixelFormat);
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static List<CVPixelFormatType> getAllPixelFormatTypes() {
        return getAllPixelFormatTypes(null);
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public void register(CVPixelFormatType pixelFormat) {
        registerDescription(this, pixelFormat);
    }
    
    private long refcon = -1;
    
    public CVPixelFormatDescription setFillExtendedPixelsCallback(FillExtendedPixelsCallback callback) {
        if (refcon == -1) {
            refcon = CVPixelFormatDescription.refconId.getAndIncrement();
        }
        CVFillExtendedPixelsCallBackData data = new CVFillExtendedPixelsCallBackData(1, new FunctionPtr(cbFillExtendedPixels), refcon);
        NSData val = new NSData(data);
        set(Keys.FillExtendedPixelsCallback(), val);
        synchronized (callbacks) {
            callbacks.put(refcon, callback);
        }
        
        return this;
    }
    
    /*<keys>*/
    @Library("CoreVideo")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="kCVPixelFormatName", optional=true)
        public static native CFString Name();
        @GlobalValue(symbol="kCVPixelFormatConstant", optional=true)
        public static native CFString Constant();
        @GlobalValue(symbol="kCVPixelFormatCodecType", optional=true)
        public static native CFString CodecType();
        @GlobalValue(symbol="kCVPixelFormatFourCC", optional=true)
        public static native CFString FourCC();
        @GlobalValue(symbol="kCVPixelFormatContainsAlpha", optional=true)
        public static native CFString ContainsAlpha();
        @GlobalValue(symbol="kCVPixelFormatContainsYCbCr", optional=true)
        public static native CFString ContainsYCbCr();
        @GlobalValue(symbol="kCVPixelFormatContainsRGB", optional=true)
        public static native CFString ContainsRGB();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCVPixelFormatContainsGrayscale", optional=true)
        public static native CFString ContainsGrayscale();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="kCVPixelFormatContainsSenselArray", optional=true)
        public static native CFString ContainsSenselArray();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCVPixelFormatComponentRange", optional=true)
        public static native CFString ComponentRange();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCVPixelFormatComponentRange_VideoRange", optional=true)
        public static native CFString ComponentRange_VideoRange();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCVPixelFormatComponentRange_FullRange", optional=true)
        public static native CFString ComponentRange_FullRange();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCVPixelFormatComponentRange_WideRange", optional=true)
        public static native CFString ComponentRange_WideRange();
        @GlobalValue(symbol="kCVPixelFormatPlanes", optional=true)
        public static native CFString Planes();
        @GlobalValue(symbol="kCVPixelFormatBlockWidth", optional=true)
        public static native CFString BlockWidth();
        @GlobalValue(symbol="kCVPixelFormatBlockHeight", optional=true)
        public static native CFString BlockHeight();
        @GlobalValue(symbol="kCVPixelFormatBitsPerBlock", optional=true)
        public static native CFString BitsPerBlock();
        @GlobalValue(symbol="kCVPixelFormatBlockHorizontalAlignment", optional=true)
        public static native CFString BlockHorizontalAlignment();
        @GlobalValue(symbol="kCVPixelFormatBlockVerticalAlignment", optional=true)
        public static native CFString BlockVerticalAlignment();
        @GlobalValue(symbol="kCVPixelFormatBlackBlock", optional=true)
        public static native CFString BlackBlock();
        @GlobalValue(symbol="kCVPixelFormatHorizontalSubsampling", optional=true)
        public static native CFString HorizontalSubsampling();
        @GlobalValue(symbol="kCVPixelFormatVerticalSubsampling", optional=true)
        public static native CFString VerticalSubsampling();
        @GlobalValue(symbol="kCVPixelFormatOpenGLFormat", optional=true)
        public static native CFString OpenGLFormat();
        @GlobalValue(symbol="kCVPixelFormatOpenGLType", optional=true)
        public static native CFString OpenGLType();
        @GlobalValue(symbol="kCVPixelFormatOpenGLInternalFormat", optional=true)
        public static native CFString OpenGLInternalFormat();
        @GlobalValue(symbol="kCVPixelFormatCGBitmapInfo", optional=true)
        public static native CFString CGBitmapInfo();
        @GlobalValue(symbol="kCVPixelFormatQDCompatibility", optional=true)
        public static native CFString QDCompatibility();
        @GlobalValue(symbol="kCVPixelFormatCGBitmapContextCompatibility", optional=true)
        public static native CFString CGBitmapContextCompatibility();
        @GlobalValue(symbol="kCVPixelFormatCGImageCompatibility", optional=true)
        public static native CFString CGImageCompatibility();
        @GlobalValue(symbol="kCVPixelFormatOpenGLCompatibility", optional=true)
        public static native CFString OpenGLCompatibility();
        @GlobalValue(symbol="kCVPixelFormatOpenGLESCompatibility", optional=true)
        public static native CFString OpenGLESCompatibility();
        @GlobalValue(symbol="kCVPixelFormatFillExtendedPixelsCallback", optional=true)
        public static native CFString FillExtendedPixelsCallback();
    }
    /*</keys>*/
}
