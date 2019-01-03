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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCapturePhoto/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCapturePhotoPtr extends Ptr<AVCapturePhoto, AVCapturePhotoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCapturePhoto.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCapturePhoto() {}
    protected AVCapturePhoto(Handle h, long handle) { super(h, handle); }
    protected AVCapturePhoto(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "timestamp")
    public native @ByVal CMTime getTimestamp();
    @Property(selector = "isRawPhoto")
    public native boolean isRawPhoto();
    @Property(selector = "pixelBuffer")
    public native CVPixelBuffer getPixelBuffer();
    @Property(selector = "previewPixelBuffer")
    public native CVPixelBuffer getPreviewPixelBuffer();
    @Property(selector = "embeddedThumbnailPhotoFormat")
    public native NSDictionary<NSString, ?> getEmbeddedThumbnailPhotoFormat();
    @Property(selector = "depthData")
    public native AVDepthData getDepthData();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "portraitEffectsMatte")
    public native AVPortraitEffectsMatte getPortraitEffectsMatte();
    @Property(selector = "metadata")
    public native NSDictionary<NSString, ?> getMetadata();
    @Property(selector = "cameraCalibrationData")
    public native AVCameraCalibrationData getCameraCalibrationData();
    @Property(selector = "resolvedSettings")
    public native AVCaptureResolvedPhotoSettings getResolvedSettings();
    @Property(selector = "photoCount")
    public native @MachineSizedSInt long getPhotoCount();
    @Property(selector = "sourceDeviceType")
    public native String getSourceDeviceType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "bracketSettings")
    public native AVCaptureBracketedStillImageSettings getBracketSettings();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "sequenceCount")
    public native @MachineSizedSInt long getSequenceCount();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "lensStabilizationStatus")
    public native AVCaptureLensStabilizationStatus getLensStabilizationStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "fileDataRepresentation")
    public native NSData fileDataRepresentation();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "fileDataRepresentationWithCustomizer:")
    public native NSData fileDataRepresentation(AVCapturePhotoFileDataRepresentationCustomizer customizer);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 12.0. Use fileDataRepresentationWithCustomizer: instead
     */
    @Deprecated
    @Method(selector = "fileDataRepresentationWithReplacementMetadata:replacementEmbeddedThumbnailPhotoFormat:replacementEmbeddedThumbnailPixelBuffer:replacementDepthData:")
    public native NSData fileDataRepresentation(NSDictionary<NSString, ?> replacementMetadata, NSDictionary<NSString, ?> replacementEmbeddedThumbnailPhotoFormat, CVPixelBuffer replacementEmbeddedThumbnailPixelBuffer, AVDepthData replacementDepthData);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "CGImageRepresentation")
    public native CGImage CGImageRepresentation();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "previewCGImageRepresentation")
    public native CGImage previewCGImageRepresentation();
    /*</methods>*/
}
