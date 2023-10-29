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
package org.robovm.apple.imageio;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ImageIO")/*</annotations>*/
@Marshaler(/*<name>*/CGImageProperties/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImageProperties/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CGImageProperties toObject(Class<CGImageProperties> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CGImageProperties(o);
        }
        @MarshalsPointer
        public static long toNative(CGImageProperties o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CGImageProperties> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CGImageProperties> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CGImageProperties(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CGImageProperties> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CGImageProperties i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    public CGImageProperties(CFDictionary data) {
        super(data);
    }
    public CGImageProperties() {}
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
    public CGImageProperties set(CFString key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    

    public CGImagePropertyTIFFData getTIFFData() {
        if (has(Keys.TIFFDictionary())) {
            CFDictionary val = get(Keys.TIFFDictionary(), CFDictionary.class);
            return new CGImagePropertyTIFFData(val);
        }
        return null;
    }
    public CGImageProperties setTIFFData(CGImagePropertyTIFFData tIFFData) {
        set(Keys.TIFFDictionary(), tIFFData.getDictionary());
        return this;
    }
    public CGImagePropertyGIFData getGIFData() {
        if (has(Keys.GIFDictionary())) {
            CFDictionary val = get(Keys.GIFDictionary(), CFDictionary.class);
            return new CGImagePropertyGIFData(val);
        }
        return null;
    }
    public CGImageProperties setGIFData(CGImagePropertyGIFData gIFData) {
        set(Keys.GIFDictionary(), gIFData.getDictionary());
        return this;
    }
    public CGImagePropertyJFIFData getJFIFData() {
        if (has(Keys.JFIFDictionary())) {
            CFDictionary val = get(Keys.JFIFDictionary(), CFDictionary.class);
            return new CGImagePropertyJFIFData(val);
        }
        return null;
    }
    public CGImageProperties setJFIFData(CGImagePropertyJFIFData jFIFData) {
        set(Keys.JFIFDictionary(), jFIFData.getDictionary());
        return this;
    }
    public CGImagePropertyExifData getExifData() {
        if (has(Keys.ExifDictionary())) {
            CFDictionary val = get(Keys.ExifDictionary(), CFDictionary.class);
            return new CGImagePropertyExifData(val);
        }
        return null;
    }
    public CGImageProperties setExifData(CGImagePropertyExifData exifData) {
        set(Keys.ExifDictionary(), exifData.getDictionary());
        return this;
    }
    public CGImagePropertyPNGData getPNGData() {
        if (has(Keys.PNGDictionary())) {
            CFDictionary val = get(Keys.PNGDictionary(), CFDictionary.class);
            return new CGImagePropertyPNGData(val);
        }
        return null;
    }
    public CGImageProperties setPNGData(CGImagePropertyPNGData pNGData) {
        set(Keys.PNGDictionary(), pNGData.getDictionary());
        return this;
    }
    public CGImagePropertyIPTCData getIPTCData() {
        if (has(Keys.IPTCDictionary())) {
            CFDictionary val = get(Keys.IPTCDictionary(), CFDictionary.class);
            return new CGImagePropertyIPTCData(val);
        }
        return null;
    }
    public CGImageProperties setIPTCData(CGImagePropertyIPTCData iPTCData) {
        set(Keys.IPTCDictionary(), iPTCData.getDictionary());
        return this;
    }
    public CGImagePropertyGPSData getGPSData() {
        if (has(Keys.GPSDictionary())) {
            CFDictionary val = get(Keys.GPSDictionary(), CFDictionary.class);
            return new CGImagePropertyGPSData(val);
        }
        return null;
    }
    public CGImageProperties setGPSData(CGImagePropertyGPSData gPSData) {
        set(Keys.GPSDictionary(), gPSData.getDictionary());
        return this;
    }
    public CFDictionary getRawData() {
        if (has(Keys.RawDictionary())) {
            CFDictionary val = get(Keys.RawDictionary(), CFDictionary.class);
            return val;
        }
        return null;
    }
    public CGImageProperties setRawData(CFDictionary rawData) {
        set(Keys.RawDictionary(), rawData);
        return this;
    }
    public CGImagePropertyCIFFData getCIFFData() {
        if (has(Keys.CIFFDictionary())) {
            CFDictionary val = get(Keys.CIFFDictionary(), CFDictionary.class);
            return new CGImagePropertyCIFFData(val);
        }
        return null;
    }
    public CGImageProperties setCIFFData(CGImagePropertyCIFFData cIFFData) {
        set(Keys.CIFFDictionary(), cIFFData.getDictionary());
        return this;
    }
    public CGImagePropertyCanonData getMakerCanonData() {
        if (has(Keys.MakerCanonDictionary())) {
            CFDictionary val = get(Keys.MakerCanonDictionary(), CFDictionary.class);
            return new CGImagePropertyCanonData(val);
        }
        return null;
    }
    public CGImageProperties setMakerCanonData(CGImagePropertyCanonData makerCanonData) {
        set(Keys.MakerCanonDictionary(), makerCanonData.getDictionary());
        return this;
    }
    public CGImagePropertyNikonData getMakerNikonData() {
        if (has(Keys.MakerNikonDictionary())) {
            CFDictionary val = get(Keys.MakerNikonDictionary(), CFDictionary.class);
            return new CGImagePropertyNikonData(val);
        }
        return null;
    }
    public CGImageProperties setMakerNikonData(CGImagePropertyNikonData makerNikonData) {
        set(Keys.MakerNikonDictionary(), makerNikonData.getDictionary());
        return this;
    }
    public CFDictionary getMakerMinoltaData() {
        if (has(Keys.MakerMinoltaDictionary())) {
            CFDictionary val = get(Keys.MakerMinoltaDictionary(), CFDictionary.class);
            return val;
        }
        return null;
    }
    public CGImageProperties setMakerMinoltaData(CFDictionary makerMinoltaData) {
        set(Keys.MakerMinoltaDictionary(), makerMinoltaData);
        return this;
    }
    public CFDictionary getMakerFujiData() {
        if (has(Keys.MakerFujiDictionary())) {
            CFDictionary val = get(Keys.MakerFujiDictionary(), CFDictionary.class);
            return val;
        }
        return null;
    }
    public CGImageProperties setMakerFujiData(CFDictionary makerFujiData) {
        set(Keys.MakerFujiDictionary(), makerFujiData);
        return this;
    }
    public CFDictionary getMakerOlympusData() {
        if (has(Keys.MakerOlympusDictionary())) {
            CFDictionary val = get(Keys.MakerOlympusDictionary(), CFDictionary.class);
            return val;
        }
        return null;
    }
    public CGImageProperties setMakerOlympusData(CFDictionary makerOlympusData) {
        set(Keys.MakerOlympusDictionary(), makerOlympusData);
        return this;
    }
    public CFDictionary getMakerPentaxData() {
        if (has(Keys.MakerPentaxDictionary())) {
            CFDictionary val = get(Keys.MakerPentaxDictionary(), CFDictionary.class);
            return val;
        }
        return null;
    }
    public CGImageProperties setMakerPentaxData(CFDictionary makerPentaxData) {
        set(Keys.MakerPentaxDictionary(), makerPentaxData);
        return this;
    }
    public CGImageProperty8BIMData getData() {
        if (has(Keys._8BIMDictionary())) {
            CFDictionary val = get(Keys._8BIMDictionary(), CFDictionary.class);
            return new CGImageProperty8BIMData(val);
        }
        return null;
    }
    public CGImageProperties set8BIMData(CGImageProperty8BIMData data) {
        set(Keys._8BIMDictionary(), data.getDictionary());
        return this;
    }
    public CGImagePropertyDNGData getDNGData() {
        if (has(Keys.DNGDictionary())) {
            CFDictionary val = get(Keys.DNGDictionary(), CFDictionary.class);
            return new CGImagePropertyDNGData(val);
        }
        return null;
    }
    public CGImageProperties setDNGData(CGImagePropertyDNGData dNGData) {
        set(Keys.DNGDictionary(), dNGData.getDictionary());
        return this;
    }
    public CGImagePropertyExifAuxData getExifAuxData() {
        if (has(Keys.ExifAuxDictionary())) {
            CFDictionary val = get(Keys.ExifAuxDictionary(), CFDictionary.class);
            return new CGImagePropertyExifAuxData(val);
        }
        return null;
    }
    public CGImageProperties setExifAuxData(CGImagePropertyExifAuxData exifAuxData) {
        set(Keys.ExifAuxDictionary(), exifAuxData.getDictionary());
        return this;
    }
    public long getFileSize() {
        if (has(Keys.FileSize())) {
            CFNumber val = get(Keys.FileSize(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CGImageProperties setFileSize(long fileSize) {
        set(Keys.FileSize(), CFNumber.valueOf(fileSize));
        return this;
    }
    public long getPixelHeight() {
        if (has(Keys.PixelHeight())) {
            CFNumber val = get(Keys.PixelHeight(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CGImageProperties setPixelHeight(long pixelHeight) {
        set(Keys.PixelHeight(), CFNumber.valueOf(pixelHeight));
        return this;
    }
    public long getPixelWidth() {
        if (has(Keys.PixelWidth())) {
            CFNumber val = get(Keys.PixelWidth(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CGImageProperties setPixelWidth(long pixelWidth) {
        set(Keys.PixelWidth(), CFNumber.valueOf(pixelWidth));
        return this;
    }
    public long getDPIHeight() {
        if (has(Keys.DPIHeight())) {
            CFNumber val = get(Keys.DPIHeight(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CGImageProperties setDPIHeight(long dPIHeight) {
        set(Keys.DPIHeight(), CFNumber.valueOf(dPIHeight));
        return this;
    }
    public long getDPIWidth() {
        if (has(Keys.DPIWidth())) {
            CFNumber val = get(Keys.DPIWidth(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CGImageProperties setDPIWidth(long dPIWidth) {
        set(Keys.DPIWidth(), CFNumber.valueOf(dPIWidth));
        return this;
    }
    public int getDepth() {
        if (has(Keys.Depth())) {
            CFNumber val = get(Keys.Depth(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CGImageProperties setDepth(int depth) {
        set(Keys.Depth(), CFNumber.valueOf(depth));
        return this;
    }
    public CGImagePropertyOrientation getOrientation() {
        if (has(Keys.Orientation())) {
            CFNumber val = get(Keys.Orientation(), CFNumber.class);
            return CGImagePropertyOrientation.valueOf(val.longValue());
        }
        return null;
    }
    public CGImageProperties setOrientation(CGImagePropertyOrientation orientation) {
        set(Keys.Orientation(), CFNumber.valueOf(orientation.value()));
        return this;
    }
    public boolean containsFloatingPointPixels() {
        if (has(Keys.IsFloat())) {
            CFBoolean val = get(Keys.IsFloat(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CGImageProperties setContainsFloatingPointPixels(boolean containsFloatingPointPixels) {
        set(Keys.IsFloat(), CFBoolean.valueOf(containsFloatingPointPixels));
        return this;
    }
    public boolean isIndexed() {
        if (has(Keys.IsIndexed())) {
            CFBoolean val = get(Keys.IsIndexed(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CGImageProperties setIsIndexed(boolean isIndexed) {
        set(Keys.IsIndexed(), CFBoolean.valueOf(isIndexed));
        return this;
    }
    public boolean hasAlphaChannel() {
        if (has(Keys.HasAlpha())) {
            CFBoolean val = get(Keys.HasAlpha(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CGImageProperties setHasAlphaChannel(boolean hasAlphaChannel) {
        set(Keys.HasAlpha(), CFBoolean.valueOf(hasAlphaChannel));
        return this;
    }
    public CGImagePropertyColorModel getColorModel() {
        if (has(Keys.ColorModel())) {
            CFString val = get(Keys.ColorModel(), CFString.class);
            return CGImagePropertyColorModel.valueOf(val);
        }
        return null;
    }
    public CGImageProperties setColorModel(CGImagePropertyColorModel colorModel) {
        set(Keys.ColorModel(), colorModel.value());
        return this;
    }
    public String getICCProfile() {
        if (has(Keys.ProfileName())) {
            CFString val = get(Keys.ProfileName(), CFString.class);
            return val.toString();
        }
        return null;
    }
    public CGImageProperties setICCProfile(String iCCProfile) {
        set(Keys.ProfileName(), new CFString(iCCProfile));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("ImageIO")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="kCGImagePropertyTIFFDictionary", optional=true)
        public static native CFString TIFFDictionary();
        @GlobalValue(symbol="kCGImagePropertyGIFDictionary", optional=true)
        public static native CFString GIFDictionary();
        @GlobalValue(symbol="kCGImagePropertyJFIFDictionary", optional=true)
        public static native CFString JFIFDictionary();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyHEIFDictionary", optional=true)
        public static native CFString HEIFDictionary();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyHEICSDictionary", optional=true)
        public static native CFString HEICSDictionary();
        @GlobalValue(symbol="kCGImagePropertyExifDictionary", optional=true)
        public static native CFString ExifDictionary();
        @GlobalValue(symbol="kCGImagePropertyPNGDictionary", optional=true)
        public static native CFString PNGDictionary();
        @GlobalValue(symbol="kCGImagePropertyIPTCDictionary", optional=true)
        public static native CFString IPTCDictionary();
        @GlobalValue(symbol="kCGImagePropertyGPSDictionary", optional=true)
        public static native CFString GPSDictionary();
        @GlobalValue(symbol="kCGImagePropertyRawDictionary", optional=true)
        public static native CFString RawDictionary();
        @GlobalValue(symbol="kCGImagePropertyCIFFDictionary", optional=true)
        public static native CFString CIFFDictionary();
        @GlobalValue(symbol="kCGImagePropertyMakerCanonDictionary", optional=true)
        public static native CFString MakerCanonDictionary();
        @GlobalValue(symbol="kCGImagePropertyMakerNikonDictionary", optional=true)
        public static native CFString MakerNikonDictionary();
        @GlobalValue(symbol="kCGImagePropertyMakerMinoltaDictionary", optional=true)
        public static native CFString MakerMinoltaDictionary();
        @GlobalValue(symbol="kCGImagePropertyMakerFujiDictionary", optional=true)
        public static native CFString MakerFujiDictionary();
        @GlobalValue(symbol="kCGImagePropertyMakerOlympusDictionary", optional=true)
        public static native CFString MakerOlympusDictionary();
        @GlobalValue(symbol="kCGImagePropertyMakerPentaxDictionary", optional=true)
        public static native CFString MakerPentaxDictionary();
        @GlobalValue(symbol="kCGImageProperty8BIMDictionary", optional=true)
        public static native CFString _8BIMDictionary();
        @GlobalValue(symbol="kCGImagePropertyDNGDictionary", optional=true)
        public static native CFString DNGDictionary();
        @GlobalValue(symbol="kCGImagePropertyExifAuxDictionary", optional=true)
        public static native CFString ExifAuxDictionary();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyOpenEXRDictionary", optional=true)
        public static native CFString OpenEXRDictionary();
        @GlobalValue(symbol="kCGImagePropertyMakerAppleDictionary", optional=true)
        public static native CFString MakerAppleDictionary();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyFileContentsDictionary", optional=true)
        public static native CFString FileContentsDictionary();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyWebPDictionary", optional=true)
        public static native CFString WebPDictionary();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyAVISDictionary", optional=true)
        public static native CFString AVISDictionary();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyTGADictionary", optional=true)
        public static native CFString TGADictionary();
        @GlobalValue(symbol="kCGImagePropertyFileSize", optional=true)
        public static native CFString FileSize();
        @GlobalValue(symbol="kCGImagePropertyPixelHeight", optional=true)
        public static native CFString PixelHeight();
        @GlobalValue(symbol="kCGImagePropertyPixelWidth", optional=true)
        public static native CFString PixelWidth();
        @GlobalValue(symbol="kCGImagePropertyDPIHeight", optional=true)
        public static native CFString DPIHeight();
        @GlobalValue(symbol="kCGImagePropertyDPIWidth", optional=true)
        public static native CFString DPIWidth();
        @GlobalValue(symbol="kCGImagePropertyDepth", optional=true)
        public static native CFString Depth();
        @GlobalValue(symbol="kCGImagePropertyOrientation", optional=true)
        public static native CFString Orientation();
        @GlobalValue(symbol="kCGImagePropertyIsFloat", optional=true)
        public static native CFString IsFloat();
        @GlobalValue(symbol="kCGImagePropertyIsIndexed", optional=true)
        public static native CFString IsIndexed();
        @GlobalValue(symbol="kCGImagePropertyHasAlpha", optional=true)
        public static native CFString HasAlpha();
        @GlobalValue(symbol="kCGImagePropertyColorModel", optional=true)
        public static native CFString ColorModel();
        @GlobalValue(symbol="kCGImagePropertyProfileName", optional=true)
        public static native CFString ProfileName();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyPrimaryImage", optional=true)
        public static native CFString PrimaryImage();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyHEICSLoopCount", optional=true)
        public static native CFString HEICSLoopCount();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyHEICSDelayTime", optional=true)
        public static native CFString HEICSDelayTime();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyHEICSUnclampedDelayTime", optional=true)
        public static native CFString HEICSUnclampedDelayTime();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyHEICSCanvasPixelWidth", optional=true)
        public static native CFString HEICSCanvasPixelWidth();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyHEICSCanvasPixelHeight", optional=true)
        public static native CFString HEICSCanvasPixelHeight();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyHEICSFrameInfoArray", optional=true)
        public static native CFString HEICSFrameInfoArray();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyWebPLoopCount", optional=true)
        public static native CFString WebPLoopCount();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyWebPDelayTime", optional=true)
        public static native CFString WebPDelayTime();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyWebPUnclampedDelayTime", optional=true)
        public static native CFString WebPUnclampedDelayTime();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyWebPFrameInfoArray", optional=true)
        public static native CFString WebPFrameInfoArray();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyWebPCanvasPixelWidth", optional=true)
        public static native CFString WebPCanvasPixelWidth();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyWebPCanvasPixelHeight", optional=true)
        public static native CFString WebPCanvasPixelHeight();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyTGACompression", optional=true)
        public static native CFString TGACompression();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyImageCount", optional=true)
        public static native CFString ImageCount();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyWidth", optional=true)
        public static native CFString Width();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyHeight", optional=true)
        public static native CFString Height();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyBytesPerRow", optional=true)
        public static native CFString BytesPerRow();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyNamedColorSpace", optional=true)
        public static native CFString NamedColorSpace();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyPixelFormat", optional=true)
        public static native CFString PixelFormat();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyImages", optional=true)
        public static native CFString Images();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyThumbnailImages", optional=true)
        public static native CFString ThumbnailImages();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyAuxiliaryData", optional=true)
        public static native CFString AuxiliaryData();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyAuxiliaryDataType", optional=true)
        public static native CFString AuxiliaryDataType();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyImageIndex", optional=true)
        public static native CFString ImageIndex();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroups", optional=true)
        public static native CFString Groups();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroupIndex", optional=true)
        public static native CFString GroupIndex();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroupType", optional=true)
        public static native CFString GroupType();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroupTypeStereoPair", optional=true)
        public static native CFString GroupTypeStereoPair();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroupTypeAlternate", optional=true)
        public static native CFString GroupTypeAlternate();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroupImagesAlternate", optional=true)
        public static native CFString GroupImagesAlternate();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroupImageIndexLeft", optional=true)
        public static native CFString GroupImageIndexLeft();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroupImageIndexRight", optional=true)
        public static native CFString GroupImageIndexRight();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroupImageIsLeftImage", optional=true)
        public static native CFString GroupImageIsLeftImage();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroupImageIsRightImage", optional=true)
        public static native CFString GroupImageIsRightImage();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroupImageIsAlternateImage", optional=true)
        public static native CFString GroupImageIsAlternateImage();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroupImageBaseline", optional=true)
        public static native CFString GroupImageBaseline();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="kCGImagePropertyGroupImageDisparityAdjustment", optional=true)
        public static native CFString GroupImageDisparityAdjustment();
    }
    /*</keys>*/
}
