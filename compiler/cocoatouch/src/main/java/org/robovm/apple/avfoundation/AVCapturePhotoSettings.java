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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCapturePhotoSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCapturePhotoSettingsPtr extends Ptr<AVCapturePhotoSettings, AVCapturePhotoSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCapturePhotoSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCapturePhotoSettings() {}
    protected AVCapturePhotoSettings(Handle h, long handle) { super(h, handle); }
    protected AVCapturePhotoSettings(SkipInit skipInit) { super(skipInit); }
    public AVCapturePhotoSettings(NSDictionary<NSString, ?> format) { super((Handle) null, create(format)); retain(getHandle()); }
    public AVCapturePhotoSettings(int rawPixelFormatType) { super((Handle) null, create(rawPixelFormatType)); retain(getHandle()); }
    public AVCapturePhotoSettings(int rawPixelFormatType, NSDictionary<NSString, ?> processedFormat) { super((Handle) null, create(rawPixelFormatType, processedFormat)); retain(getHandle()); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public AVCapturePhotoSettings(int rawPixelFormatType, String rawFileType, NSDictionary<NSString, ?> processedFormat, String processedFileType) { super((Handle) null, create(rawPixelFormatType, rawFileType, processedFormat, processedFileType)); retain(getHandle()); }
    public AVCapturePhotoSettings(AVCapturePhotoSettings photoSettings) { super((Handle) null, create(photoSettings)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "uniqueID")
    public native long getUniqueID();
    @Property(selector = "format")
    public native NSDictionary<NSString, ?> getFormat();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "processedFileType")
    public native String getProcessedFileType();
    @Property(selector = "rawPhotoPixelFormatType")
    public native int getRawPhotoPixelFormatType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "rawFileType")
    public native String getRawFileType();
    @Property(selector = "flashMode")
    public native AVCaptureFlashMode getFlashMode();
    @Property(selector = "setFlashMode:")
    public native void setFlashMode(AVCaptureFlashMode v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "isAutoRedEyeReductionEnabled")
    public native boolean isAutoRedEyeReductionEnabled();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setAutoRedEyeReductionEnabled:")
    public native void setAutoRedEyeReductionEnabled(boolean v);
    @Property(selector = "isAutoStillImageStabilizationEnabled")
    public native boolean isAutoStillImageStabilizationEnabled();
    @Property(selector = "setAutoStillImageStabilizationEnabled:")
    public native void setAutoStillImageStabilizationEnabled(boolean v);
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Property(selector = "isAutoDualCameraFusionEnabled")
    public native boolean isAutoDualCameraFusionEnabled();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Property(selector = "setAutoDualCameraFusionEnabled:")
    public native void setAutoDualCameraFusionEnabled(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isDualCameraDualPhotoDeliveryEnabled")
    public native boolean isDualCameraDualPhotoDeliveryEnabled();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDualCameraDualPhotoDeliveryEnabled:")
    public native void setDualCameraDualPhotoDeliveryEnabled(boolean v);
    @Property(selector = "isHighResolutionPhotoEnabled")
    public native boolean isHighResolutionPhotoEnabled();
    @Property(selector = "setHighResolutionPhotoEnabled:")
    public native void setHighResolutionPhotoEnabled(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isDepthDataDeliveryEnabled")
    public native boolean isDepthDataDeliveryEnabled();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDepthDataDeliveryEnabled:")
    public native void setDepthDataDeliveryEnabled(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "embedsDepthDataInPhoto")
    public native boolean embedsDepthDataInPhoto();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setEmbedsDepthDataInPhoto:")
    public native void setEmbedsDepthDataInPhoto(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isDepthDataFiltered")
    public native boolean isDepthDataFiltered();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDepthDataFiltered:")
    public native void setDepthDataFiltered(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isCameraCalibrationDataDeliveryEnabled")
    public native boolean isCameraCalibrationDataDeliveryEnabled();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setCameraCalibrationDataDeliveryEnabled:")
    public native void setCameraCalibrationDataDeliveryEnabled(boolean v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "isPortraitEffectsMatteDeliveryEnabled")
    public native boolean isPortraitEffectsMatteDeliveryEnabled();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setPortraitEffectsMatteDeliveryEnabled:")
    public native void setPortraitEffectsMatteDeliveryEnabled(boolean v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "embedsPortraitEffectsMatteInPhoto")
    public native boolean embedsPortraitEffectsMatteInPhoto();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setEmbedsPortraitEffectsMatteInPhoto:")
    public native void setEmbedsPortraitEffectsMatteInPhoto(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "metadata")
    public native NSDictionary<NSString, ?> getMetadata();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSDictionary<NSString, ?> v);
    @Property(selector = "livePhotoMovieFileURL")
    public native NSURL getLivePhotoMovieFileURL();
    @Property(selector = "setLivePhotoMovieFileURL:")
    public native void setLivePhotoMovieFileURL(NSURL v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "livePhotoVideoCodecType")
    public native NSString getLivePhotoVideoCodecType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setLivePhotoVideoCodecType:")
    public native void setLivePhotoVideoCodecType(NSString v);
    @Property(selector = "livePhotoMovieMetadata")
    public native NSArray<AVMetadataItem> getLivePhotoMovieMetadata();
    @Property(selector = "setLivePhotoMovieMetadata:")
    public native void setLivePhotoMovieMetadata(NSArray<AVMetadataItem> v);
    @Property(selector = "availablePreviewPhotoPixelFormatTypes")
    public native NSArray<NSNumber> getAvailablePreviewPhotoPixelFormatTypes();
    @Property(selector = "previewPhotoFormat")
    public native NSDictionary<NSString, ?> getPreviewPhotoFormat();
    @Property(selector = "setPreviewPhotoFormat:")
    public native void setPreviewPhotoFormat(NSDictionary<NSString, ?> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "availableEmbeddedThumbnailPhotoCodecTypes")
    public native NSArray<NSString> getAvailableEmbeddedThumbnailPhotoCodecTypes();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "embeddedThumbnailPhotoFormat")
    public native NSDictionary<NSString, ?> getEmbeddedThumbnailPhotoFormat();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setEmbeddedThumbnailPhotoFormat:")
    public native void setEmbeddedThumbnailPhotoFormat(NSDictionary<NSString, ?> v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "availableRawEmbeddedThumbnailPhotoCodecTypes")
    public native NSArray<NSString> getAvailableRawEmbeddedThumbnailPhotoCodecTypes();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "rawEmbeddedThumbnailPhotoFormat")
    public native NSDictionary<NSString, ?> getRawEmbeddedThumbnailPhotoFormat();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setRawEmbeddedThumbnailPhotoFormat:")
    public native void setRawEmbeddedThumbnailPhotoFormat(NSDictionary<NSString, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "photoSettingsWithFormat:")
    protected static native @Pointer long create(NSDictionary<NSString, ?> format);
    @Method(selector = "photoSettingsWithRawPixelFormatType:")
    protected static native @Pointer long create(int rawPixelFormatType);
    @Method(selector = "photoSettingsWithRawPixelFormatType:processedFormat:")
    protected static native @Pointer long create(int rawPixelFormatType, NSDictionary<NSString, ?> processedFormat);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "photoSettingsWithRawPixelFormatType:rawFileType:processedFormat:processedFileType:")
    protected static native @Pointer long create(int rawPixelFormatType, String rawFileType, NSDictionary<NSString, ?> processedFormat, String processedFileType);
    @Method(selector = "photoSettingsFromPhotoSettings:")
    protected static native @Pointer long create(AVCapturePhotoSettings photoSettings);
    /*</methods>*/
}
