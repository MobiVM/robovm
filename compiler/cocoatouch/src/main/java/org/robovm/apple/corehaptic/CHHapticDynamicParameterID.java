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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CHHapticDynamicParameterID/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CHHapticDynamicParameterID.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticDynamicParameterIDHapticIntensityControl", optional=true)
    public static native NSString HapticIntensityControl();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticDynamicParameterIDHapticSharpnessControl", optional=true)
    public static native NSString HapticSharpnessControl();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticDynamicParameterIDHapticAttackTimeControl", optional=true)
    public static native NSString HapticAttackTimeControl();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticDynamicParameterIDHapticDecayTimeControl", optional=true)
    public static native NSString HapticDecayTimeControl();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticDynamicParameterIDHapticReleaseTimeControl", optional=true)
    public static native NSString HapticReleaseTimeControl();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticDynamicParameterIDAudioVolumeControl", optional=true)
    public static native NSString AudioVolumeControl();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticDynamicParameterIDAudioPanControl", optional=true)
    public static native NSString AudioPanControl();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticDynamicParameterIDAudioBrightnessControl", optional=true)
    public static native NSString AudioBrightnessControl();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticDynamicParameterIDAudioPitchControl", optional=true)
    public static native NSString AudioPitchControl();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticDynamicParameterIDAudioAttackTimeControl", optional=true)
    public static native NSString AudioAttackTimeControl();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticDynamicParameterIDAudioDecayTimeControl", optional=true)
    public static native NSString AudioDecayTimeControl();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticDynamicParameterIDAudioReleaseTimeControl", optional=true)
    public static native NSString AudioReleaseTimeControl();
    /*</methods>*/
}
