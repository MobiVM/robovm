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

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureDeviceFormat/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureDeviceFormatPtr extends Ptr<AVCaptureDeviceFormat, AVCaptureDeviceFormatPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureDeviceFormat.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureDeviceFormat() {}
    protected AVCaptureDeviceFormat(Handle h, long handle) { super(h, handle); }
    protected AVCaptureDeviceFormat(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mediaType")
    public native AVMediaType getMediaType();
    @Property(selector = "formatDescription")
    public native CMFormatDescription getFormatDescription();
    @Property(selector = "videoSupportedFrameRateRanges")
    public native NSArray<AVFrameRateRange> getVideoSupportedFrameRateRanges();
    @Property(selector = "videoFieldOfView")
    public native float getVideoFieldOfView();
    @Property(selector = "isVideoBinned")
    public native boolean isVideoBinned();
    /**
     * @deprecated Deprecated in iOS 8.0. Use isVideoStabilizationModeSupported: instead.
     */
    @Deprecated
    @Property(selector = "isVideoStabilizationSupported")
    public native boolean isVideoStabilizationSupported();
    @Property(selector = "videoMaxZoomFactor")
    public native @MachineSizedFloat double getVideoMaxZoomFactor();
    @Property(selector = "videoZoomFactorUpscaleThreshold")
    public native @MachineSizedFloat double getVideoZoomFactorUpscaleThreshold();
    @Property(selector = "minExposureDuration")
    public native @ByVal CMTime getMinExposureDuration();
    @Property(selector = "maxExposureDuration")
    public native @ByVal CMTime getMaxExposureDuration();
    @Property(selector = "minISO")
    public native float getMinISO();
    @Property(selector = "maxISO")
    public native float getMaxISO();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isGlobalToneMappingSupported")
    public native boolean isGlobalToneMappingSupported();
    @Property(selector = "isVideoHDRSupported")
    public native boolean isVideoHDRSupported();
    @Property(selector = "highResolutionStillImageDimensions")
    public native @ByVal CMVideoDimensions getHighResolutionStillImageDimensions();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isHighestPhotoQualitySupported")
    public native boolean isHighestPhotoQualitySupported();
    @Property(selector = "autoFocusSystem")
    public native AVCaptureAutoFocusSystem getAutoFocusSystem();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "supportedColorSpaces")
    public native NSArray<NSNumber> getSupportedColorSpaces();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "videoMinZoomFactorForDepthDataDelivery")
    public native @MachineSizedFloat double getVideoMinZoomFactorForDepthDataDelivery();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "videoMaxZoomFactorForDepthDataDelivery")
    public native @MachineSizedFloat double getVideoMaxZoomFactorForDepthDataDelivery();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "supportedDepthDataFormats")
    public native NSArray<AVCaptureDeviceFormat> getSupportedDepthDataFormats();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "unsupportedCaptureOutputClasses")
    public native NSArray<?> getUnsupportedCaptureOutputClasses();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "isPortraitEffectsMatteStillImageDeliverySupported")
    public native boolean isPortraitEffectsMatteStillImageDeliverySupported();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isMultiCamSupported")
    public native boolean isMultiCamSupported();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "geometricDistortionCorrectedVideoFieldOfView")
    public native float getGeometricDistortionCorrectedVideoFieldOfView();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "isCenterStageSupported")
    public native boolean isCenterStageSupported();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "videoMinZoomFactorForCenterStage")
    public native @MachineSizedFloat double getVideoMinZoomFactorForCenterStage();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "videoMaxZoomFactorForCenterStage")
    public native @MachineSizedFloat double getVideoMaxZoomFactorForCenterStage();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "videoFrameRateRangeForCenterStage")
    public native AVFrameRateRange getVideoFrameRateRangeForCenterStage();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isVideoStabilizationModeSupported:")
    public native boolean isVideoStabilizationModeSupported(AVCaptureVideoStabilizationMode videoStabilizationMode);
    /*</methods>*/
}
