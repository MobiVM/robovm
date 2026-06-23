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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSpatialVideoConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVSpatialVideoConfigurationPtr extends Ptr<AVSpatialVideoConfiguration, AVSpatialVideoConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSpatialVideoConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVSpatialVideoConfiguration() {}
    protected AVSpatialVideoConfiguration(Handle h, long handle) { super(h, handle); }
    protected AVSpatialVideoConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFormatDescription:")
    public AVSpatialVideoConfiguration(CMFormatDescription formatDescription) { super((SkipInit) null); initObject(init(formatDescription)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cameraCalibrationDataLensCollection")
    public native NSArray<?> getCameraCalibrationDataLensCollection();
    @Property(selector = "setCameraCalibrationDataLensCollection:")
    public native void setCameraCalibrationDataLensCollection(NSArray<?> v);
    @Property(selector = "horizontalFieldOfView")
    public native NSNumber getHorizontalFieldOfView();
    @Property(selector = "setHorizontalFieldOfView:")
    public native void setHorizontalFieldOfView(NSNumber v);
    @Property(selector = "cameraSystemBaseline")
    public native NSNumber getCameraSystemBaseline();
    @Property(selector = "setCameraSystemBaseline:")
    public native void setCameraSystemBaseline(NSNumber v);
    @Property(selector = "disparityAdjustment")
    public native NSNumber getDisparityAdjustment();
    @Property(selector = "setDisparityAdjustment:")
    public native void setDisparityAdjustment(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFormatDescription:")
    protected native @Pointer long init(CMFormatDescription formatDescription);
    /*</methods>*/
}
