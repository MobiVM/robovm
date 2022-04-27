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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARFaceTrackingConfiguration/*</name>*/ 
    extends /*<extends>*/ARConfiguration/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARFaceTrackingConfigurationPtr extends Ptr<ARFaceTrackingConfiguration, ARFaceTrackingConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARFaceTrackingConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARFaceTrackingConfiguration(Handle h, long handle) { super(h, handle); }
    protected ARFaceTrackingConfiguration(SkipInit skipInit) { super(skipInit); }
    public ARFaceTrackingConfiguration() { super((Handle) null, create()); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "supportedNumberOfTrackedFaces")
    public static native @MachineSizedSInt long getSupportedNumberOfTrackedFaces();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "maximumNumberOfTrackedFaces")
    public native @MachineSizedSInt long getMaximumNumberOfTrackedFaces();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setMaximumNumberOfTrackedFaces:")
    public native void setMaximumNumberOfTrackedFaces(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "supportsWorldTracking")
    public static native boolean supportsWorldTracking();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isWorldTrackingEnabled")
    public native boolean isWorldTrackingEnabled();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setWorldTrackingEnabled:")
    public native void setWorldTrackingEnabled(boolean v);
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
    @Method(selector = "new")
    protected static native @Pointer long create();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "supportsFrameSemantics:")
    public static native boolean supportsFrameSemantics(ARFrameSemantics frameSemantics);
    /*</methods>*/
}
