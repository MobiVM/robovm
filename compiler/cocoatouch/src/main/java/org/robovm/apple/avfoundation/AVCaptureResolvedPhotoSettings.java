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
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureResolvedPhotoSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureResolvedPhotoSettingsPtr extends Ptr<AVCaptureResolvedPhotoSettings, AVCaptureResolvedPhotoSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureResolvedPhotoSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureResolvedPhotoSettings() {}
    protected AVCaptureResolvedPhotoSettings(Handle h, long handle) { super(h, handle); }
    protected AVCaptureResolvedPhotoSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "uniqueID")
    public native long getUniqueID();
    @Property(selector = "photoDimensions")
    public native @ByVal CMVideoDimensions getPhotoDimensions();
    @Property(selector = "rawPhotoDimensions")
    public native @ByVal CMVideoDimensions getRawPhotoDimensions();
    @Property(selector = "previewDimensions")
    public native @ByVal CMVideoDimensions getPreviewDimensions();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "embeddedThumbnailDimensions")
    public native @ByVal CMVideoDimensions getEmbeddedThumbnailDimensions();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "rawEmbeddedThumbnailDimensions")
    public native @ByVal CMVideoDimensions getRawEmbeddedThumbnailDimensions();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "portraitEffectsMatteDimensions")
    public native @ByVal CMVideoDimensions getPortraitEffectsMatteDimensions();
    @Property(selector = "livePhotoMovieDimensions")
    public native @ByVal CMVideoDimensions getLivePhotoMovieDimensions();
    @Property(selector = "isFlashEnabled")
    public native boolean isFlashEnabled();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "isRedEyeReductionEnabled")
    public native boolean isRedEyeReductionEnabled();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "deferredPhotoProxyDimensions")
    public native @ByVal CMVideoDimensions getDeferredPhotoProxyDimensions();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use photoProcessingTimeRange
     */
    @Deprecated
    @Property(selector = "isStillImageStabilizationEnabled")
    public native boolean isStillImageStabilizationEnabled();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isVirtualDeviceFusionEnabled")
    public native boolean isVirtualDeviceFusionEnabled();
    /**
     * @since Available in iOS 10.2 and later.
     * @deprecated Deprecated in iOS 13.0. Use virtualDeviceFusionEnabled
     */
    @Deprecated
    @Property(selector = "isDualCameraFusionEnabled")
    public native boolean isDualCameraFusionEnabled();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "expectedPhotoCount")
    public native @MachineSizedUInt long getExpectedPhotoCount();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "photoProcessingTimeRange")
    public native @ByVal CMTimeRange getPhotoProcessingTimeRange();
    /**
     * @since Available in iOS 14.1 and later.
     */
    @Property(selector = "isContentAwareDistortionCorrectionEnabled")
    public native boolean isContentAwareDistortionCorrectionEnabled();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "isFastCapturePrioritizationEnabled")
    public native boolean isFastCapturePrioritizationEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "dimensionsForSemanticSegmentationMatteOfType:")
    public native @ByVal CMVideoDimensions dimensionsForSemanticSegmentationMatteOfType(AVSemanticSegmentationMatteType semanticSegmentationMatteType);
    /*</methods>*/
}
