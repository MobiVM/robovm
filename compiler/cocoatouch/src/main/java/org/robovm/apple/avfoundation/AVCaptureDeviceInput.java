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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureDeviceInput/*</name>*/ 
    extends /*<extends>*/AVCaptureInput/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureDeviceInputPtr extends Ptr<AVCaptureDeviceInput, AVCaptureDeviceInputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureDeviceInput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureDeviceInput() {}
    protected AVCaptureDeviceInput(Handle h, long handle) { super(h, handle); }
    protected AVCaptureDeviceInput(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:error:")
    public AVCaptureDeviceInput(AVCaptureDevice device) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(device, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "device")
    public native AVCaptureDevice getDevice();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "unifiedAutoExposureDefaultsEnabled")
    public native boolean isUnifiedAutoExposureDefaultsEnabled();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setUnifiedAutoExposureDefaultsEnabled:")
    public native void setUnifiedAutoExposureDefaultsEnabled(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "videoMinFrameDurationOverride")
    public native @ByVal CMTime getVideoMinFrameDurationOverride();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setVideoMinFrameDurationOverride:")
    public native void setVideoMinFrameDurationOverride(@ByVal CMTime v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "isLockedVideoFrameDurationSupported")
    public native boolean isLockedVideoFrameDurationSupported();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "activeLockedVideoFrameDuration")
    public native @ByVal CMTime getActiveLockedVideoFrameDuration();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setActiveLockedVideoFrameDuration:")
    public native void setActiveLockedVideoFrameDuration(@ByVal CMTime v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "isExternalSyncSupported")
    public native boolean isExternalSyncSupported();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "activeExternalSyncVideoFrameDuration")
    public native @ByVal CMTime getActiveExternalSyncVideoFrameDuration();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "externalSyncDevice")
    public native AVExternalSyncDevice getExternalSyncDevice();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "multichannelAudioMode")
    public native AVCaptureMultichannelAudioMode getMultichannelAudioMode();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setMultichannelAudioMode:")
    public native void setMultichannelAudioMode(AVCaptureMultichannelAudioMode v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "isWindNoiseRemovalSupported")
    public native boolean isWindNoiseRemovalSupported();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "isWindNoiseRemovalEnabled")
    public native boolean isWindNoiseRemovalEnabled();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "setWindNoiseRemovalEnabled:")
    public native void setWindNoiseRemovalEnabled(boolean v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "isCinematicVideoCaptureSupported")
    public native boolean isCinematicVideoCaptureSupported();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "isCinematicVideoCaptureEnabled")
    public native boolean isCinematicVideoCaptureEnabled();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setCinematicVideoCaptureEnabled:")
    public native void setCinematicVideoCaptureEnabled(boolean v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "simulatedAperture")
    public native float getSimulatedAperture();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setSimulatedAperture:")
    public native void setSimulatedAperture(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:error:")
    private native @Pointer long init(AVCaptureDevice device, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "portsWithMediaType:sourceDeviceType:sourceDevicePosition:")
    public native NSArray<AVCaptureInputPort> getPorts(String mediaType, String sourceDeviceType, AVCaptureDevicePosition sourceDevicePosition);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "followExternalSyncDevice:videoFrameDuration:delegate:")
    public native void followExternalSyncDevice(AVExternalSyncDevice externalSyncDevice, @ByVal CMTime frameDuration, AVExternalSyncDeviceDelegate delegate);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "unfollowExternalSyncDevice")
    public native void unfollowExternalSyncDevice();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "isMultichannelAudioModeSupported:")
    public native boolean isMultichannelAudioModeSupported(AVCaptureMultichannelAudioMode multichannelAudioMode);
    /*</methods>*/
}
