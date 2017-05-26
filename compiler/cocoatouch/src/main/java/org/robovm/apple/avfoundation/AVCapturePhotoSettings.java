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
import org.robovm.apple.audiounit.*;
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
    public AVCapturePhotoSettings(NSDictionary<?, ?> format) { super((Handle) null, create(format)); retain(getHandle()); }
    public AVCapturePhotoSettings(int rawPixelFormatType) { super((Handle) null, create(rawPixelFormatType)); retain(getHandle()); }
    public AVCapturePhotoSettings(int rawPixelFormatType, NSDictionary<?, ?> processedFormat) { super((Handle) null, create(rawPixelFormatType, processedFormat)); retain(getHandle()); }
    public AVCapturePhotoSettings(AVCapturePhotoSettings photoSettings) { super((Handle) null, create(photoSettings)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "uniqueID")
    public native long getUniqueID();
    @Property(selector = "format")
    public native NSDictionary<?, ?> getFormat();
    @Property(selector = "rawPhotoPixelFormatType")
    public native int getRawPhotoPixelFormatType();
    @Property(selector = "flashMode")
    public native AVCaptureFlashMode getFlashMode();
    @Property(selector = "setFlashMode:")
    public native void setFlashMode(AVCaptureFlashMode v);
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
    @Property(selector = "isHighResolutionPhotoEnabled")
    public native boolean isHighResolutionPhotoEnabled();
    @Property(selector = "setHighResolutionPhotoEnabled:")
    public native void setHighResolutionPhotoEnabled(boolean v);
    @Property(selector = "livePhotoMovieFileURL")
    public native NSURL getLivePhotoMovieFileURL();
    @Property(selector = "setLivePhotoMovieFileURL:")
    public native void setLivePhotoMovieFileURL(NSURL v);
    @Property(selector = "livePhotoMovieMetadata")
    public native NSArray<AVMetadataItem> getLivePhotoMovieMetadata();
    @Property(selector = "setLivePhotoMovieMetadata:")
    public native void setLivePhotoMovieMetadata(NSArray<AVMetadataItem> v);
    @Property(selector = "availablePreviewPhotoPixelFormatTypes")
    public native NSArray<NSNumber> getAvailablePreviewPhotoPixelFormatTypes();
    @Property(selector = "previewPhotoFormat")
    public native NSDictionary<?, ?> getPreviewPhotoFormat();
    @Property(selector = "setPreviewPhotoFormat:")
    public native void setPreviewPhotoFormat(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "photoSettingsWithFormat:")
    protected static native @Pointer long create(NSDictionary<?, ?> format);
    @Method(selector = "photoSettingsWithRawPixelFormatType:")
    protected static native @Pointer long create(int rawPixelFormatType);
    @Method(selector = "photoSettingsWithRawPixelFormatType:processedFormat:")
    protected static native @Pointer long create(int rawPixelFormatType, NSDictionary<?, ?> processedFormat);
    @Method(selector = "photoSettingsFromPhotoSettings:")
    protected static native @Pointer long create(AVCapturePhotoSettings photoSettings);
    /*</methods>*/
}
