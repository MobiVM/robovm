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
package org.robovm.apple.homekit;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMCameraSettingsControl/*</name>*/ 
    extends /*<extends>*/HMCameraControl/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMCameraSettingsControlPtr extends Ptr<HMCameraSettingsControl, HMCameraSettingsControlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMCameraSettingsControl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HMCameraSettingsControl() {}
    protected HMCameraSettingsControl(Handle h, long handle) { super(h, handle); }
    protected HMCameraSettingsControl(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nightVision")
    public native HMCharacteristic getNightVision();
    @Property(selector = "currentHorizontalTilt")
    public native HMCharacteristic getCurrentHorizontalTilt();
    @Property(selector = "targetHorizontalTilt")
    public native HMCharacteristic getTargetHorizontalTilt();
    @Property(selector = "currentVerticalTilt")
    public native HMCharacteristic getCurrentVerticalTilt();
    @Property(selector = "targetVerticalTilt")
    public native HMCharacteristic getTargetVerticalTilt();
    @Property(selector = "opticalZoom")
    public native HMCharacteristic getOpticalZoom();
    @Property(selector = "digitalZoom")
    public native HMCharacteristic getDigitalZoom();
    @Property(selector = "imageRotation")
    public native HMCharacteristic getImageRotation();
    @Property(selector = "imageMirroring")
    public native HMCharacteristic getImageMirroring();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
