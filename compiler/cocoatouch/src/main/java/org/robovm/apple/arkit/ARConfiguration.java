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
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARConfigurationPtr extends Ptr<ARConfiguration, ARConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARConfiguration() {}
    protected ARConfiguration(Handle h, long handle) { super(h, handle); }
    protected ARConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isSupported")
    public static native boolean isSupported();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "supportedVideoFormats")
    public static native NSArray<ARVideoFormat> getSupportedVideoFormats();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "videoFormat")
    public native ARVideoFormat getVideoFormat();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setVideoFormat:")
    public native void setVideoFormat(ARVideoFormat v);
    @Property(selector = "worldAlignment")
    public native ARWorldAlignment getWorldAlignment();
    @Property(selector = "setWorldAlignment:")
    public native void setWorldAlignment(ARWorldAlignment v);
    @Property(selector = "isLightEstimationEnabled")
    public native boolean isLightEstimationEnabled();
    @Property(selector = "setLightEstimationEnabled:")
    public native void setLightEstimationEnabled(boolean v);
    @Property(selector = "providesAudioData")
    public native boolean providesAudioData();
    @Property(selector = "setProvidesAudioData:")
    public native void setProvidesAudioData(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
