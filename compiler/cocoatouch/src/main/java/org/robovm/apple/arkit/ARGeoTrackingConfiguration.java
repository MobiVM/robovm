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
package org.robovm.apple.arkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARGeoTrackingConfiguration/*</name>*/ 
    extends /*<extends>*/ARConfiguration/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARGeoTrackingConfigurationPtr extends Ptr<ARGeoTrackingConfiguration, ARGeoTrackingConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARGeoTrackingConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ARGeoTrackingConfiguration() {}
    protected ARGeoTrackingConfiguration(Handle h, long handle) { super(h, handle); }
    protected ARGeoTrackingConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "environmentTexturing")
    public native AREnvironmentTexturing getEnvironmentTexturing();
    @Property(selector = "setEnvironmentTexturing:")
    public native void setEnvironmentTexturing(AREnvironmentTexturing v);
    @Property(selector = "wantsHDREnvironmentTextures")
    public native boolean wantsHDREnvironmentTextures();
    @Property(selector = "setWantsHDREnvironmentTextures:")
    public native void setWantsHDREnvironmentTextures(boolean v);
    @Property(selector = "planeDetection")
    public native ARPlaneDetection getPlaneDetection();
    @Property(selector = "setPlaneDetection:")
    public native void setPlaneDetection(ARPlaneDetection v);
    @Property(selector = "detectionImages")
    public native NSSet<ARReferenceImage> getDetectionImages();
    @Property(selector = "setDetectionImages:")
    public native void setDetectionImages(NSSet<ARReferenceImage> v);
    @Property(selector = "automaticImageScaleEstimationEnabled")
    public native boolean isAutomaticImageScaleEstimationEnabled();
    @Property(selector = "setAutomaticImageScaleEstimationEnabled:")
    public native void setAutomaticImageScaleEstimationEnabled(boolean v);
    @Property(selector = "maximumNumberOfTrackedImages")
    public native @MachineSizedSInt long getMaximumNumberOfTrackedImages();
    @Property(selector = "setMaximumNumberOfTrackedImages:")
    public native void setMaximumNumberOfTrackedImages(@MachineSizedSInt long v);
    @Property(selector = "detectionObjects")
    public native NSSet<ARReferenceObject> getDetectionObjects();
    @Property(selector = "setDetectionObjects:")
    public native void setDetectionObjects(NSSet<ARReferenceObject> v);
    /**
     * @since Available in iOS 14.3 and later.
     */
    @Property(selector = "appClipCodeTrackingEnabled")
    public native boolean isAppClipCodeTrackingEnabled();
    /**
     * @since Available in iOS 14.3 and later.
     */
    @Property(selector = "setAppClipCodeTrackingEnabled:")
    public native void setAppClipCodeTrackingEnabled(boolean v);
    /**
     * @since Available in iOS 14.3 and later.
     */
    @Property(selector = "supportsAppClipCodeTracking")
    public static native boolean supportsAppClipCodeTracking();
    @Property(selector = "isSupported")
    public static native boolean isSupported();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "supportedVideoFormats")
    public static native NSArray<ARVideoFormat> getSupportedVideoFormats();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "configurableCaptureDeviceForPrimaryCamera")
    public static native AVCaptureDevice getConfigurableCaptureDeviceForPrimaryCamera();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "recommendedVideoFormatFor4KResolution")
    public static native ARVideoFormat getRecommendedVideoFormatFor4KResolution();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "recommendedVideoFormatForHighResolutionFrameCapturing")
    public static native ARVideoFormat getRecommendedVideoFormatForHighResolutionFrameCapturing();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "checkAvailabilityWithCompletionHandler:")
    public static native void checkAvailability(@Block VoidBlock2<Boolean, NSError> completionHandler);
    @Method(selector = "checkAvailabilityAtCoordinate:completionHandler:")
    public static native void checkAvailability(@ByVal CLLocationCoordinate2D coordinate, @Block VoidBlock2<Boolean, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "supportsFrameSemantics:")
    public static native boolean supportsFrameSemantics(ARFrameSemantics frameSemantics);
    /*</methods>*/
}
