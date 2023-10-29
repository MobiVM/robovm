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

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureConnection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureConnectionPtr extends Ptr<AVCaptureConnection, AVCaptureConnectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureConnection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureConnection() {}
    protected AVCaptureConnection(Handle h, long handle) { super(h, handle); }
    protected AVCaptureConnection(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithInputPorts:output:")
    public AVCaptureConnection(NSArray<AVCaptureInputPort> ports, AVCaptureOutput output) { super((SkipInit) null); initObject(init(ports, output)); }
    @Method(selector = "initWithInputPort:videoPreviewLayer:")
    public AVCaptureConnection(AVCaptureInputPort port, AVCaptureVideoPreviewLayer layer) { super((SkipInit) null); initObject(init(port, layer)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputPorts")
    public native NSArray<AVCaptureInputPort> getInputPorts();
    @Property(selector = "output")
    public native AVCaptureOutput getOutput();
    @Property(selector = "videoPreviewLayer")
    public native AVCaptureVideoPreviewLayer getVideoPreviewLayer();
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "isActive")
    public native boolean isActive();
    @Property(selector = "audioChannels")
    public native NSArray<AVCaptureAudioChannel> getAudioChannels();
    @Property(selector = "isVideoMirroringSupported")
    public native boolean supportsVideoMirroring();
    @Property(selector = "isVideoMirrored")
    public native boolean isVideoMirrored();
    @Property(selector = "setVideoMirrored:")
    public native void setVideoMirrored(boolean v);
    @Property(selector = "automaticallyAdjustsVideoMirroring")
    public native boolean automaticallyAdjustsVideoMirroring();
    @Property(selector = "setAutomaticallyAdjustsVideoMirroring:")
    public native void setAutomaticallyAdjustsVideoMirroring(boolean v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "videoRotationAngle")
    public native @MachineSizedFloat double getVideoRotationAngle();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setVideoRotationAngle:")
    public native void setVideoRotationAngle(@MachineSizedFloat double v);
    /**
     * @deprecated Deprecated in iOS 17.0. Use -isVideoRotationAngleSupported: instead
     */
    @Deprecated
    @Property(selector = "isVideoOrientationSupported")
    public native boolean supportsVideoOrientation();
    /**
     * @deprecated Deprecated in iOS 17.0. Use -videoRotationAngle instead
     */
    @Deprecated
    @Property(selector = "videoOrientation")
    public native AVCaptureVideoOrientation getVideoOrientation();
    /**
     * @deprecated Deprecated in iOS 17.0. Use -videoRotationAngle instead
     */
    @Deprecated
    @Property(selector = "setVideoOrientation:")
    public native void setVideoOrientation(AVCaptureVideoOrientation v);
    /**
     * @deprecated Deprecated in iOS 7.0. Use AVCaptureDevice's activeFormat.videoSupportedFrameRateRanges instead.
     */
    @Deprecated
    @Property(selector = "isVideoMinFrameDurationSupported")
    public native boolean supportsVideoMinFrameDuration();
    /**
     * @deprecated Deprecated in iOS 7.0. Use AVCaptureDevice's activeVideoMinFrameDuration instead.
     */
    @Deprecated
    @Property(selector = "videoMinFrameDuration")
    public native @ByVal CMTime getVideoMinFrameDuration();
    /**
     * @deprecated Deprecated in iOS 7.0. Use AVCaptureDevice's activeVideoMinFrameDuration instead.
     */
    @Deprecated
    @Property(selector = "setVideoMinFrameDuration:")
    public native void setVideoMinFrameDuration(@ByVal CMTime v);
    /**
     * @deprecated Deprecated in iOS 7.0. Use AVCaptureDevice's activeFormat.videoSupportedFrameRateRanges instead.
     */
    @Deprecated
    @Property(selector = "isVideoMaxFrameDurationSupported")
    public native boolean supportsVideoMaxFrameDuration();
    /**
     * @deprecated Deprecated in iOS 7.0. Use AVCaptureDevice's activeVideoMaxFrameDuration instead.
     */
    @Deprecated
    @Property(selector = "videoMaxFrameDuration")
    public native @ByVal CMTime getVideoMaxFrameDuration();
    /**
     * @deprecated Deprecated in iOS 7.0. Use AVCaptureDevice's activeVideoMaxFrameDuration instead.
     */
    @Deprecated
    @Property(selector = "setVideoMaxFrameDuration:")
    public native void setVideoMaxFrameDuration(@ByVal CMTime v);
    @Property(selector = "videoMaxScaleAndCropFactor")
    public native @MachineSizedFloat double getVideoMaxScaleAndCropFactor();
    @Property(selector = "videoScaleAndCropFactor")
    public native @MachineSizedFloat double getVideoScaleAndCropFactor();
    @Property(selector = "setVideoScaleAndCropFactor:")
    public native void setVideoScaleAndCropFactor(@MachineSizedFloat double v);
    @Property(selector = "preferredVideoStabilizationMode")
    public native AVCaptureVideoStabilizationMode getPreferredVideoStabilizationMode();
    @Property(selector = "setPreferredVideoStabilizationMode:")
    public native void setPreferredVideoStabilizationMode(AVCaptureVideoStabilizationMode v);
    @Property(selector = "activeVideoStabilizationMode")
    public native AVCaptureVideoStabilizationMode getActiveVideoStabilizationMode();
    @Property(selector = "isVideoStabilizationSupported")
    public native boolean supportsVideoStabilization();
    /**
     * @deprecated Deprecated in iOS 8.0. Use activeVideoStabilizationMode instead.
     */
    @Deprecated
    @Property(selector = "isVideoStabilizationEnabled")
    public native boolean isVideoStabilizationEnabled();
    /**
     * @deprecated Deprecated in iOS 8.0. Use preferredVideoStabilizationMode instead.
     */
    @Deprecated
    @Property(selector = "enablesVideoStabilizationWhenAvailable")
    public native boolean enablesVideoStabilizationWhenAvailable();
    /**
     * @deprecated Deprecated in iOS 8.0. Use preferredVideoStabilizationMode instead.
     */
    @Deprecated
    @Property(selector = "setEnablesVideoStabilizationWhenAvailable:")
    public native void setEnablesVideoStabilizationWhenAvailable(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isCameraIntrinsicMatrixDeliverySupported")
    public native boolean isCameraIntrinsicMatrixDeliverySupported();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isCameraIntrinsicMatrixDeliveryEnabled")
    public native boolean isCameraIntrinsicMatrixDeliveryEnabled();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setCameraIntrinsicMatrixDeliveryEnabled:")
    public native void setCameraIntrinsicMatrixDeliveryEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithInputPorts:output:")
    protected native @Pointer long init(NSArray<AVCaptureInputPort> ports, AVCaptureOutput output);
    @Method(selector = "initWithInputPort:videoPreviewLayer:")
    protected native @Pointer long init(AVCaptureInputPort port, AVCaptureVideoPreviewLayer layer);
    @Method(selector = "isVideoRotationAngleSupported:")
    public native boolean isVideoRotationAngleSupported(@MachineSizedFloat double videoRotationAngle);
    /*</methods>*/
}
