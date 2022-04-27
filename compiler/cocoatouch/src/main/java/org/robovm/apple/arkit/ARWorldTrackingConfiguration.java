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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARWorldTrackingConfiguration/*</name>*/ 
    extends /*<extends>*/ARConfiguration/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARWorldTrackingConfigurationPtr extends Ptr<ARWorldTrackingConfiguration, ARWorldTrackingConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARWorldTrackingConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARWorldTrackingConfiguration(Handle h, long handle) { super(h, handle); }
    protected ARWorldTrackingConfiguration(SkipInit skipInit) { super(skipInit); }
    public ARWorldTrackingConfiguration() { super((Handle) null, create()); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "isAutoFocusEnabled")
    public native boolean isAutoFocusEnabled();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setAutoFocusEnabled:")
    public native void setAutoFocusEnabled(boolean v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "environmentTexturing")
    public native AREnvironmentTexturing getEnvironmentTexturing();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setEnvironmentTexturing:")
    public native void setEnvironmentTexturing(AREnvironmentTexturing v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "wantsHDREnvironmentTextures")
    public native boolean wantsHDREnvironmentTextures();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setWantsHDREnvironmentTextures:")
    public native void setWantsHDREnvironmentTextures(boolean v);
    @Property(selector = "planeDetection")
    public native ARPlaneDetection getPlaneDetection();
    @Property(selector = "setPlaneDetection:")
    public native void setPlaneDetection(ARPlaneDetection v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "initialWorldMap")
    public native ARWorldMap getInitialWorldMap();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setInitialWorldMap:")
    public native void setInitialWorldMap(ARWorldMap v);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "detectionImages")
    public native NSSet<ARReferenceImage> getDetectionImages();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setDetectionImages:")
    public native void setDetectionImages(NSSet<ARReferenceImage> v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "automaticImageScaleEstimationEnabled")
    public native boolean isAutomaticImageScaleEstimationEnabled();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAutomaticImageScaleEstimationEnabled:")
    public native void setAutomaticImageScaleEstimationEnabled(boolean v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "maximumNumberOfTrackedImages")
    public native @MachineSizedSInt long getMaximumNumberOfTrackedImages();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setMaximumNumberOfTrackedImages:")
    public native void setMaximumNumberOfTrackedImages(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "detectionObjects")
    public native NSSet<ARReferenceObject> getDetectionObjects();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setDetectionObjects:")
    public native void setDetectionObjects(NSSet<ARReferenceObject> v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isCollaborationEnabled")
    public native boolean isCollaborationEnabled();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setCollaborationEnabled:")
    public native void setCollaborationEnabled(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "supportsUserFaceTracking")
    public static native boolean supportsUserFaceTracking();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "userFaceTrackingEnabled")
    public native boolean isUserFaceTrackingEnabled();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setUserFaceTrackingEnabled:")
    public native void setUserFaceTrackingEnabled(boolean v);
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
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "sceneReconstruction")
    public native ARSceneReconstruction getSceneReconstruction();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "setSceneReconstruction:")
    public native void setSceneReconstruction(ARSceneReconstruction v);
    @Property(selector = "isSupported")
    public static native boolean isSupported();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "supportedVideoFormats")
    public static native NSArray<ARVideoFormat> getSupportedVideoFormats();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "supportsSceneReconstruction:")
    public static native boolean supportsSceneReconstruction(ARSceneReconstruction sceneReconstruction);
    @Method(selector = "new")
    protected static native @Pointer long create();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "supportsFrameSemantics:")
    public static native boolean supportsFrameSemantics(ARFrameSemantics frameSemantics);
    /*</methods>*/
}
