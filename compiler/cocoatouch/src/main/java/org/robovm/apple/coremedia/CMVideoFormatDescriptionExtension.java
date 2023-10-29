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
package org.robovm.apple.coremedia;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreMedia")/*</annotations>*/
@Marshaler(/*<name>*/CMVideoFormatDescriptionExtension/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMVideoFormatDescriptionExtension/*</name>*/ 
    extends /*<extends>*/CFDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CMVideoFormatDescriptionExtension toObject(Class<CMVideoFormatDescriptionExtension> cls, long handle, long flags) {
            CFDictionary o = (CFDictionary) CFType.Marshaler.toObject(CFDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CMVideoFormatDescriptionExtension(o);
        }
        @MarshalsPointer
        public static long toNative(CMVideoFormatDescriptionExtension o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CMVideoFormatDescriptionExtension> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CMVideoFormatDescriptionExtension> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CMVideoFormatDescriptionExtension(o.get(i, CFDictionary.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CMVideoFormatDescriptionExtension> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CMVideoFormatDescriptionExtension i : l) {
                array.add(i.getDictionary());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CMVideoFormatDescriptionExtension(CFDictionary data) {
        super(data);
    }
    public CMVideoFormatDescriptionExtension() {}
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
    public CMVideoFormatDescriptionExtension set(CFString key, NativeObject value) {
        data.put(key, value);
        return this;
    }
    

    public String getFormatName() {
        if (has(Keys.FormatName())) {
            CFString val = get(Keys.FormatName(), CFString.class);
            return val.toString();
        }
        return null;
    }
    public CMVideoFormatDescriptionExtension setFormatName(String formatName) {
        set(Keys.FormatName(), new CFString(formatName));
        return this;
    }
    public int getDepth() {
        if (has(Keys.Depth())) {
            CFNumber val = get(Keys.Depth(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CMVideoFormatDescriptionExtension setDepth(int depth) {
        set(Keys.Depth(), CFNumber.valueOf(depth));
        return this;
    }
    public NSArray<NSNumber> getCleanApertureWidthRational() {
        if (has(Keys.CleanApertureWidthRational())) {
            NSArray<NSNumber> val = get(Keys.CleanApertureWidthRational(), NSArray.class);
            return val;
        }
        return null;
    }
    public CMVideoFormatDescriptionExtension setCleanApertureWidthRational(NSArray<NSNumber> cleanApertureWidthRational) {
        set(Keys.CleanApertureWidthRational(), cleanApertureWidthRational);
        return this;
    }
    public NSArray<NSNumber> getCleanApertureHeightRational() {
        if (has(Keys.CleanApertureHeightRational())) {
            NSArray<NSNumber> val = get(Keys.CleanApertureHeightRational(), NSArray.class);
            return val;
        }
        return null;
    }
    public CMVideoFormatDescriptionExtension setCleanApertureHeightRational(NSArray<NSNumber> cleanApertureHeightRational) {
        set(Keys.CleanApertureHeightRational(), cleanApertureHeightRational);
        return this;
    }
    public NSArray<NSNumber> getCleanApertureHorizontalOffsetRational() {
        if (has(Keys.CleanApertureHorizontalOffsetRational())) {
            NSArray<NSNumber> val = get(Keys.CleanApertureHorizontalOffsetRational(), NSArray.class);
            return val;
        }
        return null;
    }
    public CMVideoFormatDescriptionExtension setCleanApertureHorizontalOffsetRational(NSArray<NSNumber> cleanApertureHorizontalOffsetRational) {
        set(Keys.CleanApertureHorizontalOffsetRational(), cleanApertureHorizontalOffsetRational);
        return this;
    }
    public NSArray<NSNumber> getCleanApertureVerticalOffsetRational() {
        if (has(Keys.CleanApertureVerticalOffsetRational())) {
            NSArray<NSNumber> val = get(Keys.CleanApertureVerticalOffsetRational(), NSArray.class);
            return val;
        }
        return null;
    }
    public CMVideoFormatDescriptionExtension setCleanApertureVerticalOffsetRational(NSArray<NSNumber> cleanApertureVerticalOffsetRational) {
        set(Keys.CleanApertureVerticalOffsetRational(), cleanApertureVerticalOffsetRational);
        return this;
    }
    public boolean isFullRangeVideo() {
        if (has(Keys.FullRangeVideo())) {
            CFBoolean val = get(Keys.FullRangeVideo(), CFBoolean.class);
            return val.booleanValue();
        }
        return false;
    }
    public CMVideoFormatDescriptionExtension setFullRangeVideo(boolean fullRangeVideo) {
        set(Keys.FullRangeVideo(), CFBoolean.valueOf(fullRangeVideo));
        return this;
    }
    public NSData getICCProfile() {
        if (has(Keys.ICCProfile())) {
            NSData val = get(Keys.ICCProfile(), NSData.class);
            return val;
        }
        return null;
    }
    public CMVideoFormatDescriptionExtension setICCProfile(NSData iCCProfile) {
        set(Keys.ICCProfile(), iCCProfile);
        return this;
    }
    public long getBytesPerRow() {
        if (has(Keys.BytesPerRow())) {
            CFNumber val = get(Keys.BytesPerRow(), CFNumber.class);
            return val.longValue();
        }
        return 0;
    }
    public CMVideoFormatDescriptionExtension setBytesPerRow(long bytesPerRow) {
        set(Keys.BytesPerRow(), CFNumber.valueOf(bytesPerRow));
        return this;
    }
    public CMMPEG2VideoProfile getConformsToMPEG2VideoProfile() {
        if (has(Keys.ConformsToMPEG2VideoProfile())) {
            CFNumber val = get(Keys.ConformsToMPEG2VideoProfile(), CFNumber.class);
            return CMMPEG2VideoProfile.valueOf(val.longValue());
        }
        return null;
    }
    public CMVideoFormatDescriptionExtension setConformsToMPEG2VideoProfile(CMMPEG2VideoProfile conformsToMPEG2VideoProfile) {
        set(Keys.ConformsToMPEG2VideoProfile(), CFNumber.valueOf(conformsToMPEG2VideoProfile.value()));
        return this;
    }
    public int getTemporalQuality() {
        if (has(Keys.TemporalQuality())) {
            CFNumber val = get(Keys.TemporalQuality(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CMVideoFormatDescriptionExtension setTemporalQuality(int temporalQuality) {
        set(Keys.TemporalQuality(), CFNumber.valueOf(temporalQuality));
        return this;
    }
    public int getSpatialQuality() {
        if (has(Keys.SpatialQuality())) {
            CFNumber val = get(Keys.SpatialQuality(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CMVideoFormatDescriptionExtension setSpatialQuality(int spatialQuality) {
        set(Keys.SpatialQuality(), CFNumber.valueOf(spatialQuality));
        return this;
    }
    public int getVersion() {
        if (has(Keys.Version())) {
            CFNumber val = get(Keys.Version(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CMVideoFormatDescriptionExtension setVersion(int version) {
        set(Keys.Version(), CFNumber.valueOf(version));
        return this;
    }
    public int getRevisionLevel() {
        if (has(Keys.RevisionLevel())) {
            CFNumber val = get(Keys.RevisionLevel(), CFNumber.class);
            return val.intValue();
        }
        return 0;
    }
    public CMVideoFormatDescriptionExtension setRevisionLevel(int revisionLevel) {
        set(Keys.RevisionLevel(), CFNumber.valueOf(revisionLevel));
        return this;
    }
    public CMFormatDescriptionVendor getVendor() {
        if (has(Keys.Vendor())) {
            CFString val = get(Keys.Vendor(), CFString.class);
            return CMFormatDescriptionVendor.valueOf(val);
        }
        return null;
    }
    public CMVideoFormatDescriptionExtension setVendor(CMFormatDescriptionVendor vendor) {
        set(Keys.Vendor(), vendor.value());
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreMedia")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="kCMFormatDescriptionExtension_FormatName", optional=true)
        public static native CFString FormatName();
        @GlobalValue(symbol="kCMFormatDescriptionExtension_Depth", optional=true)
        public static native CFString Depth();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_CleanAperture", optional=true)
        public static native CFString CleanAperture();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionKey_CleanApertureWidth", optional=true)
        public static native CFString CleanApertureWidth();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionKey_CleanApertureHeight", optional=true)
        public static native CFString CleanApertureHeight();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionKey_CleanApertureHorizontalOffset", optional=true)
        public static native CFString CleanApertureHorizontalOffset();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionKey_CleanApertureVerticalOffset", optional=true)
        public static native CFString CleanApertureVerticalOffset();
        @GlobalValue(symbol="kCMFormatDescriptionKey_CleanApertureWidthRational", optional=true)
        public static native CFString CleanApertureWidthRational();
        @GlobalValue(symbol="kCMFormatDescriptionKey_CleanApertureHeightRational", optional=true)
        public static native CFString CleanApertureHeightRational();
        @GlobalValue(symbol="kCMFormatDescriptionKey_CleanApertureHorizontalOffsetRational", optional=true)
        public static native CFString CleanApertureHorizontalOffsetRational();
        @GlobalValue(symbol="kCMFormatDescriptionKey_CleanApertureVerticalOffsetRational", optional=true)
        public static native CFString CleanApertureVerticalOffsetRational();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_FieldCount", optional=true)
        public static native CFString FieldCount();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_FieldDetail", optional=true)
        public static native CFString FieldDetail();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_PixelAspectRatio", optional=true)
        public static native CFString PixelAspectRatio();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionKey_PixelAspectRatioHorizontalSpacing", optional=true)
        public static native CFString PixelAspectRatioHorizontalSpacing();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionKey_PixelAspectRatioVerticalSpacing", optional=true)
        public static native CFString PixelAspectRatioVerticalSpacing();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_ColorPrimaries", optional=true)
        public static native CFString ColorPrimaries();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_TransferFunction", optional=true)
        public static native CFString TransferFunction();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_GammaLevel", optional=true)
        public static native CFString GammaLevel();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_YCbCrMatrix", optional=true)
        public static native CFString YCbCrMatrix();
        @GlobalValue(symbol="kCMFormatDescriptionExtension_FullRangeVideo", optional=true)
        public static native CFString FullRangeVideo();
        @GlobalValue(symbol="kCMFormatDescriptionExtension_ICCProfile", optional=true)
        public static native CFString ICCProfile();
        @GlobalValue(symbol="kCMFormatDescriptionExtension_BytesPerRow", optional=true)
        public static native CFString BytesPerRow();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_ChromaLocationTopField", optional=true)
        public static native CFString ChromaLocationTopField();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_ChromaLocationBottomField", optional=true)
        public static native CFString ChromaLocationBottomField();
        @GlobalValue(symbol="kCMFormatDescriptionConformsToMPEG2VideoProfile", optional=true)
        public static native CFString ConformsToMPEG2VideoProfile();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_ProtectedContentOriginalFormat", optional=true)
        public static native CFString ProtectedContentOriginalFormat();
        @GlobalValue(symbol="kCMFormatDescriptionExtension_TemporalQuality", optional=true)
        public static native CFString TemporalQuality();
        @GlobalValue(symbol="kCMFormatDescriptionExtension_SpatialQuality", optional=true)
        public static native CFString SpatialQuality();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_VerbatimImageDescription", optional=true)
        public static native CFString VerbatimImageDescription();
        @GlobalValue(symbol="kCMFormatDescriptionExtension_Version", optional=true)
        public static native CFString Version();
        @GlobalValue(symbol="kCMFormatDescriptionExtension_RevisionLevel", optional=true)
        public static native CFString RevisionLevel();
        @GlobalValue(symbol="kCMFormatDescriptionExtension_Vendor", optional=true)
        public static native CFString Vendor();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_MasteringDisplayColorVolume", optional=true)
        public static native CFString MasteringDisplayColorVolume();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_ContentLightLevelInfo", optional=true)
        public static native CFString ContentLightLevelInfo();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_ContentColorVolume", optional=true)
        public static native CFString ContentColorVolume();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_AlternativeTransferCharacteristics", optional=true)
        public static native CFString AlternativeTransferCharacteristics();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_AuxiliaryTypeInfo", optional=true)
        public static native CFString AuxiliaryTypeInfo();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_AlphaChannelMode", optional=true)
        public static native CFString AlphaChannelMode();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_ContainsAlphaChannel", optional=true)
        public static native CFString ContainsAlphaChannel();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_BitsPerComponent", optional=true)
        public static native CFString BitsPerComponent();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_HorizontalFieldOfView", optional=true)
        public static native CFString HorizontalFieldOfView();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_StereoCameraBaseline", optional=true)
        public static native CFString StereoCameraBaseline();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_HorizontalDisparityAdjustment", optional=true)
        public static native CFString HorizontalDisparityAdjustment();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kCMFormatDescriptionExtension_AmbientViewingEnvironment", optional=true)
        public static native CFString AmbientViewingEnvironment();
    }
    /*</keys>*/
}
