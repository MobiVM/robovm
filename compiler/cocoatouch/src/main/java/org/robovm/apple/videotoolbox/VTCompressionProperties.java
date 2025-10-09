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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTCompressionProperties/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*/
    public static final int UnlimitedFrameDelayCount = -1;
    public static final int QPModulationLevelDefault = -1;
    public static final int QPModulationLevelDisable = 0;
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("VideoToolbox")
    public static class CameraCalibrationExtrinsicOriginSource {
        static { Bro.bind(CameraCalibrationExtrinsicOriginSource.class); }

        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCameraCalibrationExtrinsicOriginSource_StereoCameraSystemBaseline", optional=true)
        public static native CFString StereoCameraSystemBaseline();
    }

    @Library("VideoToolbox")
    public static class CameraCalibrationKeys {
        static { Bro.bind(CameraCalibrationKeys.class); }

        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_LensAlgorithmKind", optional=true)
        public static native CFString LensAlgorithmKind();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_LensDomain", optional=true)
        public static native CFString LensDomain();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_LensIdentifier", optional=true)
        public static native CFString LensIdentifier();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_LensRole", optional=true)
        public static native CFString LensRole();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_LensDistortions", optional=true)
        public static native CFString LensDistortions();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_RadialAngleLimit", optional=true)
        public static native CFString RadialAngleLimit();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_LensFrameAdjustmentsPolynomialX", optional=true)
        public static native CFString LensFrameAdjustmentsPolynomialX();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_LensFrameAdjustmentsPolynomialY", optional=true)
        public static native CFString LensFrameAdjustmentsPolynomialY();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_IntrinsicMatrix", optional=true)
        public static native CFString IntrinsicMatrix();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_IntrinsicMatrixProjectionOffset", optional=true)
        public static native CFString IntrinsicMatrixProjectionOffset();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_IntrinsicMatrixReferenceDimensions", optional=true)
        public static native CFString IntrinsicMatrixReferenceDimensions();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_ExtrinsicOriginSource", optional=true)
        public static native CFString ExtrinsicOriginSource();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyCameraCalibrationKey_ExtrinsicOrientationQuaternion", optional=true)
        public static native CFString ExtrinsicOrientationQuaternion();
    }

    @Library("VideoToolbox")
    public static class CameraCalibrationLensAlgorithmKind {
        static { Bro.bind(CameraCalibrationLensAlgorithmKind.class); }

        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCameraCalibrationLensAlgorithmKind_ParametricLens", optional=true)
        public static native CFString ParametricLens();
    }

    @Library("VideoToolbox")
    public static class CameraCalibrationLensDomain {
        static { Bro.bind(CameraCalibrationLensDomain.class); }

        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCameraCalibrationLensDomain_Color", optional=true)
        public static native CFString Color();
    }

    @Library("VideoToolbox")
    public static class CameraCalibrationLensRole {
        static { Bro.bind(CameraCalibrationLensRole.class); }

        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCameraCalibrationLensRole_Mono", optional=true)
        public static native CFString Mono();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCameraCalibrationLensRole_Left", optional=true)
        public static native CFString Left();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCameraCalibrationLensRole_Right", optional=true)
        public static native CFString Right();
    }

    @Library("VideoToolbox")
    public static class CompressionPreset {
        static { Bro.bind(CompressionPreset.class); }

        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPreset_HighQuality", optional=true)
        public static native CFString HighQuality();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPreset_Balanced", optional=true)
        public static native CFString Balanced();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPreset_HighSpeed", optional=true)
        public static native CFString HighSpeed();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPreset_VideoConferencing", optional=true)
        public static native CFString VideoConferencing();
    }

    @Library("VideoToolbox")
    public static class H264EntropyMode {
        static { Bro.bind(H264EntropyMode.class); }

        @GlobalValue(symbol="kVTH264EntropyMode_CAVLC", optional=true)
        public static native CFString CAVLC();
        @GlobalValue(symbol="kVTH264EntropyMode_CABAC", optional=true)
        public static native CFString CABAC();
    }

    @Library("VideoToolbox")
    public static class HDRMetadataInsertionMode {
        static { Bro.bind(HDRMetadataInsertionMode.class); }

        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kVTHDRMetadataInsertionMode_None", optional=true)
        public static native CFString None();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kVTHDRMetadataInsertionMode_Auto", optional=true)
        public static native CFString Auto();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTHDRMetadataInsertionMode_RequestSDRRangePreservation", optional=true)
        public static native CFString RequestSDRRangePreservation();
    }

    @Library("VideoToolbox")
    public static class HeroEye {
        static { Bro.bind(HeroEye.class); }

        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTHeroEye_Left", optional=true)
        public static native CFString Left();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTHeroEye_Right", optional=true)
        public static native CFString Right();
    }

    @Library("VideoToolbox")
    public static class Keys {
        static { Bro.bind(Keys.class); }

        @GlobalValue(symbol="kVTCompressionPropertyKey_NumberOfPendingFrames", optional=true)
        public static native CFString NumberOfPendingFrames();
        @GlobalValue(symbol="kVTCompressionPropertyKey_PixelBufferPoolIsShared", optional=true)
        public static native CFString PixelBufferPoolIsShared();
        @GlobalValue(symbol="kVTCompressionPropertyKey_VideoEncoderPixelBufferAttributes", optional=true)
        public static native CFString VideoEncoderPixelBufferAttributes();
        @GlobalValue(symbol="kVTCompressionPropertyKey_MaxKeyFrameInterval", optional=true)
        public static native CFString MaxKeyFrameInterval();
        @GlobalValue(symbol="kVTCompressionPropertyKey_MaxKeyFrameIntervalDuration", optional=true)
        public static native CFString MaxKeyFrameIntervalDuration();
        @GlobalValue(symbol="kVTCompressionPropertyKey_AllowTemporalCompression", optional=true)
        public static native CFString AllowTemporalCompression();
        @GlobalValue(symbol="kVTCompressionPropertyKey_AllowFrameReordering", optional=true)
        public static native CFString AllowFrameReordering();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_AllowOpenGOP", optional=true)
        public static native CFString AllowOpenGOP();
        @GlobalValue(symbol="kVTCompressionPropertyKey_AverageBitRate", optional=true)
        public static native CFString AverageBitRate();
        @GlobalValue(symbol="kVTCompressionPropertyKey_DataRateLimits", optional=true)
        public static native CFString DataRateLimits();
        @GlobalValue(symbol="kVTCompressionPropertyKey_Quality", optional=true)
        public static native CFString Quality();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_TargetQualityForAlpha", optional=true)
        public static native CFString TargetQualityForAlpha();
        @GlobalValue(symbol="kVTCompressionPropertyKey_MoreFramesBeforeStart", optional=true)
        public static native CFString MoreFramesBeforeStart();
        @GlobalValue(symbol="kVTCompressionPropertyKey_MoreFramesAfterEnd", optional=true)
        public static native CFString MoreFramesAfterEnd();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_PrioritizeEncodingSpeedOverQuality", optional=true)
        public static native CFString PrioritizeEncodingSpeedOverQuality();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_ConstantBitRate", optional=true)
        public static native CFString ConstantBitRate();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_EstimatedAverageBytesPerFrame", optional=true)
        public static native CFString EstimatedAverageBytesPerFrame();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_VariableBitRate", optional=true)
        public static native CFString VariableBitRate();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_VBVMaxBitRate", optional=true)
        public static native CFString VBVMaxBitRate();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_VBVBufferDuration", optional=true)
        public static native CFString VBVBufferDuration();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_VBVInitialDelayPercentage", optional=true)
        public static native CFString VBVInitialDelayPercentage();
        @GlobalValue(symbol="kVTCompressionPropertyKey_ProfileLevel", optional=true)
        public static native CFString ProfileLevel();
        /**
         * @since Available in iOS 15.4 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_OutputBitDepth", optional=true)
        public static native CFString OutputBitDepth();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_HDRMetadataInsertionMode", optional=true)
        public static native CFString HDRMetadataInsertionMode();
        @GlobalValue(symbol="kVTCompressionPropertyKey_H264EntropyMode", optional=true)
        public static native CFString H264EntropyMode();
        @GlobalValue(symbol="kVTCompressionPropertyKey_Depth", optional=true)
        public static native CFString Depth();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_PreserveAlphaChannel", optional=true)
        public static native CFString PreserveAlphaChannel();
        @GlobalValue(symbol="kVTCompressionPropertyKey_MaxFrameDelayCount", optional=true)
        public static native CFString MaxFrameDelayCount();
        @GlobalValue(symbol="kVTCompressionPropertyKey_MaxH264SliceBytes", optional=true)
        public static native CFString MaxH264SliceBytes();
        @GlobalValue(symbol="kVTCompressionPropertyKey_RealTime", optional=true)
        public static native CFString RealTime();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_MaximizePowerEfficiency", optional=true)
        public static native CFString MaximizePowerEfficiency();
        @GlobalValue(symbol="kVTCompressionPropertyKey_SourceFrameCount", optional=true)
        public static native CFString SourceFrameCount();
        @GlobalValue(symbol="kVTCompressionPropertyKey_ExpectedFrameRate", optional=true)
        public static native CFString ExpectedFrameRate();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_MaximumRealTimeFrameRate", optional=true)
        public static native CFString MaximumRealTimeFrameRate();
        /**
         * @since Available in iOS 14.5 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_BaseLayerFrameRateFraction", optional=true)
        public static native CFString BaseLayerFrameRateFraction();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_BaseLayerBitRateFraction", optional=true)
        public static native CFString BaseLayerBitRateFraction();
        @GlobalValue(symbol="kVTCompressionPropertyKey_ExpectedDuration", optional=true)
        public static native CFString ExpectedDuration();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_BaseLayerFrameRate", optional=true)
        public static native CFString BaseLayerFrameRate();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_ReferenceBufferCount", optional=true)
        public static native CFString ReferenceBufferCount();
        /**
         * @since Available in iOS 17.4 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_CalculateMeanSquaredError", optional=true)
        public static native CFString CalculateMeanSquaredError();
        /**
         * @since Available in iOS 17.4 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_UsingHardwareAcceleratedVideoEncoder", optional=true)
        public static native CFString UsingHardwareAcceleratedVideoEncoder();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_UsingGPURegistryID", optional=true)
        public static native CFString UsingGPURegistryID();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_SupportsBaseFrameQP", optional=true)
        public static native CFString SupportsBaseFrameQP();
        @GlobalValue(symbol="kVTCompressionPropertyKey_CleanAperture", optional=true)
        public static native CFString CleanAperture();
        @GlobalValue(symbol="kVTCompressionPropertyKey_PixelAspectRatio", optional=true)
        public static native CFString PixelAspectRatio();
        @GlobalValue(symbol="kVTCompressionPropertyKey_FieldCount", optional=true)
        public static native CFString FieldCount();
        @GlobalValue(symbol="kVTCompressionPropertyKey_FieldDetail", optional=true)
        public static native CFString FieldDetail();
        @GlobalValue(symbol="kVTCompressionPropertyKey_AspectRatio16x9", optional=true)
        public static native CFString AspectRatio16x9();
        @GlobalValue(symbol="kVTCompressionPropertyKey_ProgressiveScan", optional=true)
        public static native CFString ProgressiveScan();
        @GlobalValue(symbol="kVTCompressionPropertyKey_ColorPrimaries", optional=true)
        public static native CFString ColorPrimaries();
        @GlobalValue(symbol="kVTCompressionPropertyKey_TransferFunction", optional=true)
        public static native CFString TransferFunction();
        @GlobalValue(symbol="kVTCompressionPropertyKey_YCbCrMatrix", optional=true)
        public static native CFString YCbCrMatrix();
        @GlobalValue(symbol="kVTCompressionPropertyKey_ICCProfile", optional=true)
        public static native CFString ICCProfile();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_MasteringDisplayColorVolume", optional=true)
        public static native CFString MasteringDisplayColorVolume();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_ContentLightLevelInfo", optional=true)
        public static native CFString ContentLightLevelInfo();
        @GlobalValue(symbol="kVTCompressionPropertyKey_GammaLevel", optional=true)
        public static native CFString GammaLevel();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_AlphaChannelMode", optional=true)
        public static native CFString AlphaChannelMode();
        @GlobalValue(symbol="kVTCompressionPropertyKey_PixelTransferProperties", optional=true)
        public static native CFString PixelTransferProperties();
        @GlobalValue(symbol="kVTCompressionPropertyKey_MultiPassStorage", optional=true)
        public static native CFString MultiPassStorage();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_EncoderID", optional=true)
        public static native CFString EncoderID();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_RecommendedParallelizedSubdivisionMinimumFrameCount", optional=true)
        public static native CFString RecommendedParallelizedSubdivisionMinimumFrameCount();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_RecommendedParallelizedSubdivisionMinimumDuration", optional=true)
        public static native CFString RecommendedParallelizedSubdivisionMinimumDuration();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_PreserveDynamicHDRMetadata", optional=true)
        public static native CFString PreserveDynamicHDRMetadata();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_MaxAllowedFrameQP", optional=true)
        public static native CFString MaxAllowedFrameQP();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_MinAllowedFrameQP", optional=true)
        public static native CFString MinAllowedFrameQP();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_EnableLTR", optional=true)
        public static native CFString EnableLTR();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_MVHEVCVideoLayerIDs", optional=true)
        public static native CFString MVHEVCVideoLayerIDs();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_MVHEVCViewIDs", optional=true)
        public static native CFString MVHEVCViewIDs();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_MVHEVCLeftAndRightViewIDs", optional=true)
        public static native CFString MVHEVCLeftAndRightViewIDs();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_HeroEye", optional=true)
        public static native CFString HeroEye();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_StereoCameraBaseline", optional=true)
        public static native CFString StereoCameraBaseline();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_HorizontalDisparityAdjustment", optional=true)
        public static native CFString HorizontalDisparityAdjustment();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_HasLeftStereoEyeView", optional=true)
        public static native CFString HasLeftStereoEyeView();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_HasRightStereoEyeView", optional=true)
        public static native CFString HasRightStereoEyeView();
        /**
         * @since Available in iOS 17.4 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_HorizontalFieldOfView", optional=true)
        public static native CFString HorizontalFieldOfView();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_ProjectionKind", optional=true)
        public static native CFString ProjectionKind();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_ViewPackingKind", optional=true)
        public static native CFString ViewPackingKind();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_CameraCalibrationDataLensCollection", optional=true)
        public static native CFString CameraCalibrationDataLensCollection();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTCompressionPropertyKey_SupportedPresetDictionaries", optional=true)
        public static native CFString SupportedPresetDictionaries();
    }

    @Library("VideoToolbox")
    public static class ProfileLevels {
        static { Bro.bind(ProfileLevels.class); }

        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kVTProfileLevel_HEVC_Main_AutoLevel", optional=true)
        public static native CFString HEVC_Main_AutoLevel();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kVTProfileLevel_HEVC_Main10_AutoLevel", optional=true)
        public static native CFString HEVC_Main10_AutoLevel();
        /**
         * @since Available in iOS 15.4 and later.
         */
        @GlobalValue(symbol="kVTProfileLevel_HEVC_Main42210_AutoLevel", optional=true)
        public static native CFString HEVC_Main42210_AutoLevel();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="kVTProfileLevel_HEVC_Monochrome_AutoLevel", optional=true)
        public static native CFString HEVC_Monochrome_AutoLevel();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTProfileLevel_HEVC_Monochrome10_AutoLevel", optional=true)
        public static native CFString HEVC_Monochrome10_AutoLevel();
        @GlobalValue(symbol="kVTProfileLevel_H264_Baseline_1_3", optional=true)
        public static native CFString H264_Baseline_1_3();
        @GlobalValue(symbol="kVTProfileLevel_H264_Baseline_3_0", optional=true)
        public static native CFString H264_Baseline_3_0();
        @GlobalValue(symbol="kVTProfileLevel_H264_Baseline_3_1", optional=true)
        public static native CFString H264_Baseline_3_1();
        @GlobalValue(symbol="kVTProfileLevel_H264_Baseline_3_2", optional=true)
        public static native CFString H264_Baseline_3_2();
        @GlobalValue(symbol="kVTProfileLevel_H264_Baseline_4_0", optional=true)
        public static native CFString H264_Baseline_4_0();
        @GlobalValue(symbol="kVTProfileLevel_H264_Baseline_4_1", optional=true)
        public static native CFString H264_Baseline_4_1();
        @GlobalValue(symbol="kVTProfileLevel_H264_Baseline_4_2", optional=true)
        public static native CFString H264_Baseline_4_2();
        @GlobalValue(symbol="kVTProfileLevel_H264_Baseline_5_0", optional=true)
        public static native CFString H264_Baseline_5_0();
        @GlobalValue(symbol="kVTProfileLevel_H264_Baseline_5_1", optional=true)
        public static native CFString H264_Baseline_5_1();
        @GlobalValue(symbol="kVTProfileLevel_H264_Baseline_5_2", optional=true)
        public static native CFString H264_Baseline_5_2();
        @GlobalValue(symbol="kVTProfileLevel_H264_Baseline_AutoLevel", optional=true)
        public static native CFString H264_Baseline_AutoLevel();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kVTProfileLevel_H264_ConstrainedBaseline_AutoLevel", optional=true)
        public static native CFString H264_ConstrainedBaseline_AutoLevel();
        @GlobalValue(symbol="kVTProfileLevel_H264_Main_3_0", optional=true)
        public static native CFString H264_Main_3_0();
        @GlobalValue(symbol="kVTProfileLevel_H264_Main_3_1", optional=true)
        public static native CFString H264_Main_3_1();
        @GlobalValue(symbol="kVTProfileLevel_H264_Main_3_2", optional=true)
        public static native CFString H264_Main_3_2();
        @GlobalValue(symbol="kVTProfileLevel_H264_Main_4_0", optional=true)
        public static native CFString H264_Main_4_0();
        @GlobalValue(symbol="kVTProfileLevel_H264_Main_4_1", optional=true)
        public static native CFString H264_Main_4_1();
        @GlobalValue(symbol="kVTProfileLevel_H264_Main_4_2", optional=true)
        public static native CFString H264_Main_4_2();
        @GlobalValue(symbol="kVTProfileLevel_H264_Main_5_0", optional=true)
        public static native CFString H264_Main_5_0();
        @GlobalValue(symbol="kVTProfileLevel_H264_Main_5_1", optional=true)
        public static native CFString H264_Main_5_1();
        @GlobalValue(symbol="kVTProfileLevel_H264_Main_5_2", optional=true)
        public static native CFString H264_Main_5_2();
        @GlobalValue(symbol="kVTProfileLevel_H264_Main_AutoLevel", optional=true)
        public static native CFString H264_Main_AutoLevel();
        @GlobalValue(symbol="kVTProfileLevel_H264_Extended_5_0", optional=true)
        public static native CFString H264_Extended_5_0();
        @GlobalValue(symbol="kVTProfileLevel_H264_Extended_AutoLevel", optional=true)
        public static native CFString H264_Extended_AutoLevel();
        @GlobalValue(symbol="kVTProfileLevel_H264_High_3_0", optional=true)
        public static native CFString H264_High_3_0();
        @GlobalValue(symbol="kVTProfileLevel_H264_High_3_1", optional=true)
        public static native CFString H264_High_3_1();
        @GlobalValue(symbol="kVTProfileLevel_H264_High_3_2", optional=true)
        public static native CFString H264_High_3_2();
        @GlobalValue(symbol="kVTProfileLevel_H264_High_4_0", optional=true)
        public static native CFString H264_High_4_0();
        @GlobalValue(symbol="kVTProfileLevel_H264_High_4_1", optional=true)
        public static native CFString H264_High_4_1();
        @GlobalValue(symbol="kVTProfileLevel_H264_High_4_2", optional=true)
        public static native CFString H264_High_4_2();
        @GlobalValue(symbol="kVTProfileLevel_H264_High_5_0", optional=true)
        public static native CFString H264_High_5_0();
        @GlobalValue(symbol="kVTProfileLevel_H264_High_5_1", optional=true)
        public static native CFString H264_High_5_1();
        @GlobalValue(symbol="kVTProfileLevel_H264_High_5_2", optional=true)
        public static native CFString H264_High_5_2();
        @GlobalValue(symbol="kVTProfileLevel_H264_High_AutoLevel", optional=true)
        public static native CFString H264_High_AutoLevel();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kVTProfileLevel_H264_ConstrainedHigh_AutoLevel", optional=true)
        public static native CFString H264_ConstrainedHigh_AutoLevel();
        @GlobalValue(symbol="kVTProfileLevel_MP4V_Simple_L0", optional=true)
        public static native CFString MP4V_Simple_L0();
        @GlobalValue(symbol="kVTProfileLevel_MP4V_Simple_L1", optional=true)
        public static native CFString MP4V_Simple_L1();
        @GlobalValue(symbol="kVTProfileLevel_MP4V_Simple_L2", optional=true)
        public static native CFString MP4V_Simple_L2();
        @GlobalValue(symbol="kVTProfileLevel_MP4V_Simple_L3", optional=true)
        public static native CFString MP4V_Simple_L3();
        @GlobalValue(symbol="kVTProfileLevel_MP4V_Main_L2", optional=true)
        public static native CFString MP4V_Main_L2();
        @GlobalValue(symbol="kVTProfileLevel_MP4V_Main_L3", optional=true)
        public static native CFString MP4V_Main_L3();
        @GlobalValue(symbol="kVTProfileLevel_MP4V_Main_L4", optional=true)
        public static native CFString MP4V_Main_L4();
        @GlobalValue(symbol="kVTProfileLevel_MP4V_AdvancedSimple_L0", optional=true)
        public static native CFString MP4V_AdvancedSimple_L0();
        @GlobalValue(symbol="kVTProfileLevel_MP4V_AdvancedSimple_L1", optional=true)
        public static native CFString MP4V_AdvancedSimple_L1();
        @GlobalValue(symbol="kVTProfileLevel_MP4V_AdvancedSimple_L2", optional=true)
        public static native CFString MP4V_AdvancedSimple_L2();
        @GlobalValue(symbol="kVTProfileLevel_MP4V_AdvancedSimple_L3", optional=true)
        public static native CFString MP4V_AdvancedSimple_L3();
        @GlobalValue(symbol="kVTProfileLevel_MP4V_AdvancedSimple_L4", optional=true)
        public static native CFString MP4V_AdvancedSimple_L4();
        @GlobalValue(symbol="kVTProfileLevel_H263_Profile0_Level10", optional=true)
        public static native CFString H263_Profile0_Level10();
        @GlobalValue(symbol="kVTProfileLevel_H263_Profile0_Level45", optional=true)
        public static native CFString H263_Profile0_Level45();
        @GlobalValue(symbol="kVTProfileLevel_H263_Profile3_Level45", optional=true)
        public static native CFString H263_Profile3_Level45();
    }

    @Library("VideoToolbox")
    public static class ProjectionKind {
        static { Bro.bind(ProjectionKind.class); }

        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTProjectionKind_Rectilinear", optional=true)
        public static native CFString Rectilinear();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTProjectionKind_Equirectangular", optional=true)
        public static native CFString Equirectangular();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTProjectionKind_HalfEquirectangular", optional=true)
        public static native CFString HalfEquirectangular();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTProjectionKind_ParametricImmersive", optional=true)
        public static native CFString ParametricImmersive();
    }

    @Library("VideoToolbox")
    public static class SampleAttachmentKeys {
        static { Bro.bind(SampleAttachmentKeys.class); }

        /**
         * @since Available in iOS 17.4 and later.
         */
        @GlobalValue(symbol="kVTSampleAttachmentKey_QualityMetrics", optional=true)
        public static native CFString QualityMetrics();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kVTSampleAttachmentKey_RequireLTRAcknowledgementToken", optional=true)
        public static native CFString RequireLTRAcknowledgementToken();
    }

    @Library("VideoToolbox")
    public static class SampleAttachmentQualityMetricsKeys {
        static { Bro.bind(SampleAttachmentQualityMetricsKeys.class); }

        /**
         * @since Available in iOS 17.4 and later.
         */
        @GlobalValue(symbol="kVTSampleAttachmentQualityMetricsKey_LumaMeanSquaredError", optional=true)
        public static native CFString LumaMeanSquaredError();
        /**
         * @since Available in iOS 17.4 and later.
         */
        @GlobalValue(symbol="kVTSampleAttachmentQualityMetricsKey_ChromaBlueMeanSquaredError", optional=true)
        public static native CFString ChromaBlueMeanSquaredError();
        /**
         * @since Available in iOS 17.4 and later.
         */
        @GlobalValue(symbol="kVTSampleAttachmentQualityMetricsKey_ChromaRedMeanSquaredError", optional=true)
        public static native CFString ChromaRedMeanSquaredError();
    }

    @Library("VideoToolbox")
    public static class VTAlphaChannelMode {
        static { Bro.bind(VTAlphaChannelMode.class); }

        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTAlphaChannelMode_StraightAlpha", optional=true)
        public static native CFString StraightAlpha();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTAlphaChannelMode_PremultipliedAlpha", optional=true)
        public static native CFString PremultipliedAlpha();
    }

    @Library("VideoToolbox")
    public static class VTEncodeFrameOptionKeys {
        static { Bro.bind(VTEncodeFrameOptionKeys.class); }

        @GlobalValue(symbol="kVTEncodeFrameOptionKey_ForceKeyFrame", optional=true)
        public static native CFString ForceKeyFrame();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kVTEncodeFrameOptionKey_BaseFrameQP", optional=true)
        public static native CFString BaseFrameQP();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kVTEncodeFrameOptionKey_AcknowledgedLTRTokens", optional=true)
        public static native CFString AcknowledgedLTRTokens();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kVTEncodeFrameOptionKey_ForceLTRRefresh", optional=true)
        public static native CFString ForceLTRRefresh();
    }

    @Library("VideoToolbox")
    public static class VideoDecoderSpecification {
        static { Bro.bind(VideoDecoderSpecification.class); }

        /**
         * @since Available in iOS 17.4 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderSpecification_EnableHardwareAcceleratedVideoEncoder", optional=true)
        public static native CFString EnableHardwareAcceleratedVideoEncoder();
        /**
         * @since Available in iOS 17.4 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderSpecification_RequireHardwareAcceleratedVideoEncoder", optional=true)
        public static native CFString RequireHardwareAcceleratedVideoEncoder();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderSpecification_RequiredEncoderGPURegistryID", optional=true)
        public static native CFString RequiredEncoderGPURegistryID();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderSpecification_PreferredEncoderGPURegistryID", optional=true)
        public static native CFString PreferredEncoderGPURegistryID();
        /**
         * @since Available in iOS 14.5 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderSpecification_EnableLowLatencyRateControl", optional=true)
        public static native CFString EnableLowLatencyRateControl();
        @GlobalValue(symbol="kVTVideoEncoderSpecification_EncoderID", optional=true)
        public static native CFString EncoderID();
    }

    @Library("VideoToolbox")
    public static class ViewPackingKind {
        static { Bro.bind(ViewPackingKind.class); }

        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTViewPackingKind_SideBySide", optional=true)
        public static native CFString SideBySide();
        /**
         * @since Available in iOS 26.0 and later.
         */
        @GlobalValue(symbol="kVTViewPackingKind_OverUnder", optional=true)
        public static native CFString OverUnder();
    }
    /*</methods>*/
}
