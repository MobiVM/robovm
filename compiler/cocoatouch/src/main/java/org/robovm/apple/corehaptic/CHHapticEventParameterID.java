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
package org.robovm.apple.corehaptic;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreHaptics")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CHHapticEventParameterID/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CHHapticEventParameterID.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticEventParameterIDHapticIntensity", optional=true)
    public static native NSString HapticIntensity();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticEventParameterIDHapticSharpness", optional=true)
    public static native NSString HapticSharpness();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticEventParameterIDAttackTime", optional=true)
    public static native NSString AttackTime();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticEventParameterIDDecayTime", optional=true)
    public static native NSString DecayTime();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticEventParameterIDReleaseTime", optional=true)
    public static native NSString ReleaseTime();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticEventParameterIDSustained", optional=true)
    public static native NSString Sustained();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticEventParameterIDAudioVolume", optional=true)
    public static native NSString AudioVolume();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticEventParameterIDAudioPitch", optional=true)
    public static native NSString AudioPitch();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticEventParameterIDAudioPan", optional=true)
    public static native NSString AudioPan();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticEventParameterIDAudioBrightness", optional=true)
    public static native NSString AudioBrightness();
    /*</methods>*/
}
