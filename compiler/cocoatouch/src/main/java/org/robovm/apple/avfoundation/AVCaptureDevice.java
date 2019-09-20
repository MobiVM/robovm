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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureDevice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObject observeWasConnected(final VoidBlock1<AVCaptureDevice> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WasConnectedNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((AVCaptureDevice) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObject observeWasDisconnected(final VoidBlock1<AVCaptureDevice> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WasDisconnectedNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((AVCaptureDevice) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 5.0 and later.
         */
        public static NSObject observeSubjectAreaDidChange(AVCaptureDevice object, final VoidBlock1<AVCaptureDevice> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(SubjectAreaDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((AVCaptureDevice) a.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class AVCaptureDevicePtr extends Ptr<AVCaptureDevice, AVCaptureDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureDevice() {}
    protected AVCaptureDevice(Handle h, long handle) { super(h, handle); }
    protected AVCaptureDevice(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "uniqueID")
    public native String getUniqueID();
    @Property(selector = "modelID")
    public native String getModelID();
    @Property(selector = "localizedName")
    public native String getLocalizedName();
    @Property(selector = "isConnected")
    public native boolean isConnected();
    @Property(selector = "formats")
    public native NSArray<AVCaptureDeviceFormat> getFormats();
    @Property(selector = "activeFormat")
    public native AVCaptureDeviceFormat getActiveFormat();
    @Property(selector = "setActiveFormat:")
    public native void setActiveFormat(AVCaptureDeviceFormat v);
    @Property(selector = "activeVideoMinFrameDuration")
    public native @ByVal CMTime getActiveVideoMinFrameDuration();
    @Property(selector = "setActiveVideoMinFrameDuration:")
    public native void setActiveVideoMinFrameDuration(@ByVal CMTime v);
    @Property(selector = "activeVideoMaxFrameDuration")
    public native @ByVal CMTime getActiveVideoMaxFrameDuration();
    @Property(selector = "setActiveVideoMaxFrameDuration:")
    public native void setActiveVideoMaxFrameDuration(@ByVal CMTime v);
    @Property(selector = "position")
    public native AVCaptureDevicePosition getPosition();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "deviceType")
    public native String getDeviceType();
    /**
     * @since Available in iOS 11.1 and later.
     */
    @Property(selector = "systemPressureState")
    public native AVCaptureSystemPressureState getSystemPressureState();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isVirtualDevice")
    public native boolean isVirtualDevice();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "constituentDevices")
    public native NSArray<AVCaptureDevice> getConstituentDevices();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "virtualDeviceSwitchOverVideoZoomFactors")
    public native NSArray<NSNumber> getVirtualDeviceSwitchOverVideoZoomFactors();
    @Property(selector = "hasFlash")
    public native boolean hasFlash();
    @Property(selector = "isFlashAvailable")
    public native boolean isFlashAvailable();
    /**
     * @deprecated Deprecated in iOS 10.0. Use AVCapturePhotoOutput's -isFlashScene instead.
     */
    @Deprecated
    @Property(selector = "isFlashActive")
    public native boolean isFlashActive();
    /**
     * @deprecated Deprecated in iOS 10.0. Use AVCapturePhotoSettings.flashMode instead.
     */
    @Deprecated
    @Property(selector = "flashMode")
    public native AVCaptureFlashMode getFlashMode();
    /**
     * @deprecated Deprecated in iOS 10.0. Use AVCapturePhotoSettings.flashMode instead.
     */
    @Deprecated
    @Property(selector = "setFlashMode:")
    public native void setFlashMode(AVCaptureFlashMode v);
    @Property(selector = "hasTorch")
    public native boolean hasTorch();
    @Property(selector = "isTorchAvailable")
    public native boolean isTorchAvailable();
    @Property(selector = "isTorchActive")
    public native boolean isTorchActive();
    @Property(selector = "torchLevel")
    public native float getTorchLevel();
    @Property(selector = "torchMode")
    public native AVCaptureTorchMode getTorchMode();
    @Property(selector = "setTorchMode:")
    public native void setTorchMode(AVCaptureTorchMode v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "isLockingFocusWithCustomLensPositionSupported")
    public native boolean isLockingFocusWithCustomLensPositionSupported();
    @Property(selector = "focusMode")
    public native AVCaptureFocusMode getFocusMode();
    @Property(selector = "setFocusMode:")
    public native void setFocusMode(AVCaptureFocusMode v);
    @Property(selector = "isFocusPointOfInterestSupported")
    public native boolean isFocusPointOfInterestSupported();
    @Property(selector = "focusPointOfInterest")
    public native @ByVal CGPoint getFocusPointOfInterest();
    @Property(selector = "setFocusPointOfInterest:")
    public native void setFocusPointOfInterest(@ByVal CGPoint v);
    @Property(selector = "isAdjustingFocus")
    public native boolean isAdjustingFocus();
    @Property(selector = "isAutoFocusRangeRestrictionSupported")
    public native boolean isAutoFocusRangeRestrictionSupported();
    @Property(selector = "autoFocusRangeRestriction")
    public native AVCaptureAutoFocusRangeRestriction getAutoFocusRangeRestriction();
    @Property(selector = "setAutoFocusRangeRestriction:")
    public native void setAutoFocusRangeRestriction(AVCaptureAutoFocusRangeRestriction v);
    @Property(selector = "isSmoothAutoFocusSupported")
    public native boolean isSmoothAutoFocusSupported();
    @Property(selector = "isSmoothAutoFocusEnabled")
    public native boolean isSmoothAutoFocusEnabled();
    @Property(selector = "setSmoothAutoFocusEnabled:")
    public native void setSmoothAutoFocusEnabled(boolean v);
    @Property(selector = "lensPosition")
    public native float getLensPosition();
    @Property(selector = "exposureMode")
    public native AVCaptureExposureMode getExposureMode();
    @Property(selector = "setExposureMode:")
    public native void setExposureMode(AVCaptureExposureMode v);
    @Property(selector = "isExposurePointOfInterestSupported")
    public native boolean isExposurePointOfInterestSupported();
    @Property(selector = "exposurePointOfInterest")
    public native @ByVal CGPoint getExposurePointOfInterest();
    @Property(selector = "setExposurePointOfInterest:")
    public native void setExposurePointOfInterest(@ByVal CGPoint v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "activeMaxExposureDuration")
    public native @ByVal CMTime getActiveMaxExposureDuration();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setActiveMaxExposureDuration:")
    public native void setActiveMaxExposureDuration(@ByVal CMTime v);
    @Property(selector = "isAdjustingExposure")
    public native boolean isAdjustingExposure();
    @Property(selector = "lensAperture")
    public native float getLensAperture();
    @Property(selector = "exposureDuration")
    public native @ByVal CMTime getExposureDuration();
    @Property(selector = "ISO")
    public native float getISO();
    @Property(selector = "exposureTargetOffset")
    public native float getExposureTargetOffset();
    @Property(selector = "exposureTargetBias")
    public native float getExposureTargetBias();
    @Property(selector = "minExposureTargetBias")
    public native float getMinExposureTargetBias();
    @Property(selector = "maxExposureTargetBias")
    public native float getMaxExposureTargetBias();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isGlobalToneMappingEnabled")
    public native boolean isGlobalToneMappingEnabled();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setGlobalToneMappingEnabled:")
    public native void setGlobalToneMappingEnabled(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "isLockingWhiteBalanceWithCustomDeviceGainsSupported")
    public native boolean isLockingWhiteBalanceWithCustomDeviceGainsSupported();
    @Property(selector = "whiteBalanceMode")
    public native AVCaptureWhiteBalanceMode getWhiteBalanceMode();
    @Property(selector = "setWhiteBalanceMode:")
    public native void setWhiteBalanceMode(AVCaptureWhiteBalanceMode v);
    @Property(selector = "isAdjustingWhiteBalance")
    public native boolean isAdjustingWhiteBalance();
    @Property(selector = "deviceWhiteBalanceGains")
    public native @ByVal AVCaptureWhiteBalanceGains getDeviceWhiteBalanceGains();
    @Property(selector = "grayWorldDeviceWhiteBalanceGains")
    public native @ByVal AVCaptureWhiteBalanceGains getGrayWorldDeviceWhiteBalanceGains();
    @Property(selector = "maxWhiteBalanceGain")
    public native float getMaxWhiteBalanceGain();
    @Property(selector = "isSubjectAreaChangeMonitoringEnabled")
    public native boolean isSubjectAreaChangeMonitoringEnabled();
    @Property(selector = "setSubjectAreaChangeMonitoringEnabled:")
    public native void setSubjectAreaChangeMonitoringEnabled(boolean v);
    @Property(selector = "isLowLightBoostSupported")
    public native boolean isLowLightBoostSupported();
    @Property(selector = "isLowLightBoostEnabled")
    public native boolean isLowLightBoostEnabled();
    @Property(selector = "automaticallyEnablesLowLightBoostWhenAvailable")
    public native boolean automaticallyEnablesLowLightBoostWhenAvailable();
    @Property(selector = "setAutomaticallyEnablesLowLightBoostWhenAvailable:")
    public native void setAutomaticallyEnablesLowLightBoostWhenAvailable(boolean v);
    @Property(selector = "videoZoomFactor")
    public native @MachineSizedFloat double getVideoZoomFactor();
    @Property(selector = "setVideoZoomFactor:")
    public native void setVideoZoomFactor(@MachineSizedFloat double v);
    @Property(selector = "isRampingVideoZoom")
    public native boolean isRampingVideoZoom();
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use virtualDeviceSwitchOverVideoZoomFactors
     */
    @Deprecated
    @Property(selector = "dualCameraSwitchOverVideoZoomFactor")
    public native @MachineSizedFloat double getDualCameraSwitchOverVideoZoomFactor();
    @Property(selector = "automaticallyAdjustsVideoHDREnabled")
    public native boolean automaticallyAdjustsVideoHDREnabled();
    @Property(selector = "setAutomaticallyAdjustsVideoHDREnabled:")
    public native void setAutomaticallyAdjustsVideoHDREnabled(boolean v);
    @Property(selector = "isVideoHDREnabled")
    public native boolean isVideoHDREnabled();
    @Property(selector = "setVideoHDREnabled:")
    public native void setVideoHDREnabled(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "activeColorSpace")
    public native AVCaptureColorSpace getActiveColorSpace();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setActiveColorSpace:")
    public native void setActiveColorSpace(AVCaptureColorSpace v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "activeDepthDataFormat")
    public native AVCaptureDeviceFormat getActiveDepthDataFormat();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setActiveDepthDataFormat:")
    public native void setActiveDepthDataFormat(AVCaptureDeviceFormat v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "activeDepthDataMinFrameDuration")
    public native @ByVal CMTime getActiveDepthDataMinFrameDuration();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setActiveDepthDataMinFrameDuration:")
    public native void setActiveDepthDataMinFrameDuration(@ByVal CMTime v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "minAvailableVideoZoomFactor")
    public native @MachineSizedFloat double getMinAvailableVideoZoomFactor();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "maxAvailableVideoZoomFactor")
    public native @MachineSizedFloat double getMaxAvailableVideoZoomFactor();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isGeometricDistortionCorrectionSupported")
    public native boolean isGeometricDistortionCorrectionSupported();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isGeometricDistortionCorrectionEnabled")
    public native boolean isGeometricDistortionCorrectionEnabled();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setGeometricDistortionCorrectionEnabled:")
    public native void setGeometricDistortionCorrectionEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="AVCaptureDeviceWasConnectedNotification", optional=true)
    public static native NSString WasConnectedNotification();
    @GlobalValue(symbol="AVCaptureDeviceWasDisconnectedNotification", optional=true)
    public static native NSString WasDisconnectedNotification();
    @GlobalValue(symbol="AVCaptureDeviceSubjectAreaDidChangeNotification", optional=true)
    public static native NSString SubjectAreaDidChangeNotification();
    @GlobalValue(symbol="AVCaptureMaxAvailableTorchLevel", optional=true)
    public static native float getMaxAvailableTorchLevel();
    @GlobalValue(symbol="AVCaptureLensPositionCurrent", optional=true)
    public static native float getLensPositionCurrent();
    @GlobalValue(symbol="AVCaptureExposureDurationCurrent", optional=true)
    public static native @ByVal CMTime getExposureDurationCurrent();
    @GlobalValue(symbol="AVCaptureISOCurrent", optional=true)
    public static native float getISOCurrent();
    @GlobalValue(symbol="AVCaptureExposureTargetBiasCurrent", optional=true)
    public static native float getExposureTargetBiasCurrent();
    @GlobalValue(symbol="AVCaptureWhiteBalanceGainsCurrent", optional=true)
    public static native @ByVal AVCaptureWhiteBalanceGains getWhiteBalanceGainsCurrent();
    
    @Method(selector = "hasMediaType:")
    public native boolean hasMediaType(AVMediaType mediaType);
    public boolean lockForConfiguration() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = lockForConfiguration(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "lockForConfiguration:")
    private native boolean lockForConfiguration(NSError.NSErrorPtr outError);
    @Method(selector = "unlockForConfiguration")
    public native void unlockForConfiguration();
    @Method(selector = "supportsAVCaptureSessionPreset:")
    public native boolean supportsAVCaptureSessionPreset(AVCaptureSessionPreset preset);
    /**
     * @deprecated Deprecated in iOS 10.0. Use AVCaptureDeviceDiscoverySession instead.
     */
    @Deprecated
    @Method(selector = "devices")
    public static native NSArray<AVCaptureDevice> getDevices();
    /**
     * @deprecated Deprecated in iOS 10.0. Use AVCaptureDeviceDiscoverySession instead.
     */
    @Deprecated
    @Method(selector = "devicesWithMediaType:")
    public static native NSArray<AVCaptureDevice> getDevicesForMediaType(AVMediaType mediaType);
    @Method(selector = "defaultDeviceWithMediaType:")
    public static native AVCaptureDevice getDefaultDeviceForMediaType(AVMediaType mediaType);
    @Method(selector = "deviceWithUniqueID:")
    public static native AVCaptureDevice getDeviceWithUniqueID(String deviceUniqueID);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "defaultDeviceWithDeviceType:mediaType:position:")
    public static native AVCaptureDevice getDefaultDevice(String deviceType, AVMediaType mediaType, AVCaptureDevicePosition position);
    /**
     * @deprecated Deprecated in iOS 10.0. Use AVCapturePhotoOutput's -supportedFlashModes instead.
     */
    @Deprecated
    @Method(selector = "isFlashModeSupported:")
    public native boolean isFlashModeSupported(AVCaptureFlashMode flashMode);
    @Method(selector = "isTorchModeSupported:")
    public native boolean isTorchModeSupported(AVCaptureTorchMode torchMode);
    public boolean setTorchModeOn(float torchLevel) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setTorchModeOn(torchLevel, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setTorchModeOnWithLevel:error:")
    private native boolean setTorchModeOn(float torchLevel, NSError.NSErrorPtr outError);
    @Method(selector = "isFocusModeSupported:")
    public native boolean isFocusModeSupported(AVCaptureFocusMode focusMode);
    @Method(selector = "setFocusModeLockedWithLensPosition:completionHandler:")
    public native void setFocusModeLocked(float lensPosition, @Block VoidBlock1<CMTime> handler);
    @Method(selector = "isExposureModeSupported:")
    public native boolean isExposureModeSupported(AVCaptureExposureMode exposureMode);
    @Method(selector = "setExposureModeCustomWithDuration:ISO:completionHandler:")
    public native void setExposureModeCustom(@ByVal CMTime duration, float ISO, @Block VoidBlock1<CMTime> handler);
    @Method(selector = "setExposureTargetBias:completionHandler:")
    public native void setExposureTargetBias(float bias, @Block VoidBlock1<CMTime> handler);
    @Method(selector = "isWhiteBalanceModeSupported:")
    public native boolean isWhiteBalanceModeSupported(AVCaptureWhiteBalanceMode whiteBalanceMode);
    @Method(selector = "setWhiteBalanceModeLockedWithDeviceWhiteBalanceGains:completionHandler:")
    public native void setWhiteBalanceModeLocked(@ByVal AVCaptureWhiteBalanceGains whiteBalanceGains, @Block VoidBlock1<CMTime> handler);
    @Method(selector = "chromaticityValuesForDeviceWhiteBalanceGains:")
    public native @ByVal AVCaptureWhiteBalanceChromaticityValues convertDeviceWhiteBalanceGainsToChromaticityValues(@ByVal AVCaptureWhiteBalanceGains whiteBalanceGains);
    @Method(selector = "deviceWhiteBalanceGainsForChromaticityValues:")
    public native @ByVal AVCaptureWhiteBalanceGains convertChromaticityValuesToDeviceWhiteBalanceGains(@ByVal AVCaptureWhiteBalanceChromaticityValues chromaticityValues);
    @Method(selector = "temperatureAndTintValuesForDeviceWhiteBalanceGains:")
    public native @ByVal AVCaptureWhiteBalanceTemperatureAndTintValues convertDeviceWhiteBalanceGainsToTemperatureAndTintValues(@ByVal AVCaptureWhiteBalanceGains whiteBalanceGains);
    @Method(selector = "deviceWhiteBalanceGainsForTemperatureAndTintValues:")
    public native @ByVal AVCaptureWhiteBalanceGains convertTemperatureAndTintValuesToDeviceWhiteBalanceGains(@ByVal AVCaptureWhiteBalanceTemperatureAndTintValues tempAndTintValues);
    @Method(selector = "rampToVideoZoomFactor:withRate:")
    public native void rampToVideoZoomFactor(@MachineSizedFloat double factor, float rate);
    @Method(selector = "cancelVideoZoomRamp")
    public native void cancelVideoZoomRamp();
    @Method(selector = "authorizationStatusForMediaType:")
    public static native AVAuthorizationStatus getAuthorizationStatusForMediaType(AVMediaType mediaType);
    @Method(selector = "requestAccessForMediaType:completionHandler:")
    public static native void requestAccessForMediaType(AVMediaType mediaType, @Block VoidBooleanBlock handler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "extrinsicMatrixFromDevice:toDevice:")
    public static native NSData getExtrinsicMatrix(AVCaptureDevice fromDevice, AVCaptureDevice toDevice);
    /*</methods>*/
}
