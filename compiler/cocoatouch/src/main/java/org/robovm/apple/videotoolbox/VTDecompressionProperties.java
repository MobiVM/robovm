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
package org.robovm.apple.videotoolbox;

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
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("VideoToolbox")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTDecompressionProperties/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(VTDecompressionProperties.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="kVTDecompressionProperty_TemporalLevelLimit", optional=true)
    public static native CFString TemporalLevelLimit();
    @Library("VideoToolbox")
    public static class DecodeFrameOptionKeys {
        static { Bro.bind(DecodeFrameOptionKeys.class); }

        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTDecodeFrameOptionKey_ContentAnalyzerRotation", optional=true)
        public static native CFString ContentAnalyzerRotation();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTDecodeFrameOptionKey_ContentAnalyzerCropRectangle", optional=true)
        public static native CFString ContentAnalyzerCropRectangle();
    }

    @Library("VideoToolbox")
    public static class DeinterlaceMode {
        static { Bro.bind(DeinterlaceMode.class); }

        @GlobalValue(symbol="kVTDecompressionProperty_DeinterlaceMode_VerticalFilter", optional=true)
        public static native CFString VerticalFilter();
        @GlobalValue(symbol="kVTDecompressionProperty_DeinterlaceMode_Temporal", optional=true)
        public static native CFString Temporal();
    }

    @Library("VideoToolbox")
    public static class FieldMode {
        static { Bro.bind(FieldMode.class); }

        @GlobalValue(symbol="kVTDecompressionProperty_FieldMode_BothFields", optional=true)
        public static native CFString BothFields();
        @GlobalValue(symbol="kVTDecompressionProperty_FieldMode_TopFieldOnly", optional=true)
        public static native CFString TopFieldOnly();
        @GlobalValue(symbol="kVTDecompressionProperty_FieldMode_BottomFieldOnly", optional=true)
        public static native CFString BottomFieldOnly();
        @GlobalValue(symbol="kVTDecompressionProperty_FieldMode_SingleField", optional=true)
        public static native CFString SingleField();
        @GlobalValue(symbol="kVTDecompressionProperty_FieldMode_DeinterlaceFields", optional=true)
        public static native CFString DeinterlaceFields();
    }

    @Library("VideoToolbox")
    public static class Keys {
        static { Bro.bind(Keys.class); }

        @GlobalValue(symbol="kVTDecompressionPropertyKey_PixelBufferPool", optional=true)
        public static native CFString PixelBufferPool();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_PixelBufferPoolIsShared", optional=true)
        public static native CFString PixelBufferPoolIsShared();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_OutputPoolRequestedMinimumBufferCount", optional=true)
        public static native CFString OutputPoolRequestedMinimumBufferCount();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_NumberOfFramesBeingDecoded", optional=true)
        public static native CFString NumberOfFramesBeingDecoded();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_MinOutputPresentationTimeStampOfFramesBeingDecoded", optional=true)
        public static native CFString MinOutputPresentationTimeStampOfFramesBeingDecoded();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_MaxOutputPresentationTimeStampOfFramesBeingDecoded", optional=true)
        public static native CFString MaxOutputPresentationTimeStampOfFramesBeingDecoded();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_ContentHasInterframeDependencies", optional=true)
        public static native CFString ContentHasInterframeDependencies();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTDecompressionPropertyKey_UsingHardwareAcceleratedVideoDecoder", optional=true)
        public static native CFString UsingHardwareAcceleratedVideoDecoder();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_RealTime", optional=true)
        public static native CFString RealTime();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_MaximizePowerEfficiency", optional=true)
        public static native CFString MaximizePowerEfficiency();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_ThreadCount", optional=true)
        public static native CFString ThreadCount();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_FieldMode", optional=true)
        public static native CFString FieldMode();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_DeinterlaceMode", optional=true)
        public static native CFString DeinterlaceMode();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_ReducedResolutionDecode", optional=true)
        public static native CFString ReducedResolutionDecode();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_ReducedCoefficientDecode", optional=true)
        public static native CFString ReducedCoefficientDecode();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_ReducedFrameDelivery", optional=true)
        public static native CFString ReducedFrameDelivery();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_OnlyTheseFrames", optional=true)
        public static native CFString OnlyTheseFrames();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_SuggestedQualityOfServiceTiers", optional=true)
        public static native CFString SuggestedQualityOfServiceTiers();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_SupportedPixelFormatsOrderedByQuality", optional=true)
        public static native CFString SupportedPixelFormatsOrderedByQuality();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_SupportedPixelFormatsOrderedByPerformance", optional=true)
        public static native CFString SupportedPixelFormatsOrderedByPerformance();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_PixelFormatsWithReducedResolutionSupport", optional=true)
        public static native CFString PixelFormatsWithReducedResolutionSupport();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="kVTDecompressionPropertyKey_AllowBitstreamToChangeFrameDimensions", optional=true)
        public static native CFString AllowBitstreamToChangeFrameDimensions();
        @GlobalValue(symbol="kVTDecompressionPropertyKey_PixelTransferProperties", optional=true)
        public static native CFString PixelTransferProperties();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTDecompressionPropertyKey_UsingGPURegistryID", optional=true)
        public static native CFString UsingGPURegistryID();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kVTDecompressionPropertyKey_PropagatePerFrameHDRDisplayMetadata", optional=true)
        public static native CFString PropagatePerFrameHDRDisplayMetadata();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTDecompressionPropertyKey_GeneratePerFrameHDRDisplayMetadata", optional=true)
        public static native CFString GeneratePerFrameHDRDisplayMetadata();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTDecompressionPropertyKey_RequestedMVHEVCVideoLayerIDs", optional=true)
        public static native CFString RequestedMVHEVCVideoLayerIDs();
    }

    @Library("VideoToolbox")
    public static class OnlyTheseFrames {
        static { Bro.bind(OnlyTheseFrames.class); }

        @GlobalValue(symbol="kVTDecompressionProperty_OnlyTheseFrames_AllFrames", optional=true)
        public static native CFString AllFrames();
        @GlobalValue(symbol="kVTDecompressionProperty_OnlyTheseFrames_NonDroppableFrames", optional=true)
        public static native CFString NonDroppableFrames();
        @GlobalValue(symbol="kVTDecompressionProperty_OnlyTheseFrames_IFrames", optional=true)
        public static native CFString IFrames();
        @GlobalValue(symbol="kVTDecompressionProperty_OnlyTheseFrames_KeyFrames", optional=true)
        public static native CFString KeyFrames();
    }

    @Library("VideoToolbox")
    public static class ResolutionKeys {
        static { Bro.bind(ResolutionKeys.class); }

        @GlobalValue(symbol="kVTDecompressionResolutionKey_Width", optional=true)
        public static native CFString Width();
        @GlobalValue(symbol="kVTDecompressionResolutionKey_Height", optional=true)
        public static native CFString Height();
    }

    @Library("VideoToolbox")
    public static class VideoDecoderSpecification {
        static { Bro.bind(VideoDecoderSpecification.class); }

        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTVideoDecoderSpecification_EnableHardwareAcceleratedVideoDecoder", optional=true)
        public static native CFString EnableHardwareAcceleratedVideoDecoder();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTVideoDecoderSpecification_RequireHardwareAcceleratedVideoDecoder", optional=true)
        public static native CFString RequireHardwareAcceleratedVideoDecoder();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kVTVideoDecoderSpecification_RequiredDecoderGPURegistryID", optional=true)
        public static native CFString RequiredDecoderGPURegistryID();
        /**
         * @since Available in iOS 11.3 and later.
         */
        @GlobalValue(symbol="kVTVideoDecoderSpecification_PreferredDecoderGPURegistryID", optional=true)
        public static native CFString PreferredDecoderGPURegistryID();
    }
    /*</methods>*/
}
