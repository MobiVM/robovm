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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CHHapticPatternKey/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CHHapticPatternKey.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyVersion", optional=true)
    public static native NSString Version();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyPattern", optional=true)
    public static native NSString Pattern();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyEvent", optional=true)
    public static native NSString Event();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyEventType", optional=true)
    public static native NSString EventType();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyTime", optional=true)
    public static native NSString Time();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyEventDuration", optional=true)
    public static native NSString EventDuration();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyEventWaveformPath", optional=true)
    public static native NSString EventWaveformPath();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyEventParameters", optional=true)
    public static native NSString EventParameters();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyParameter", optional=true)
    public static native NSString Parameter();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyParameterID", optional=true)
    public static native NSString ParameterID();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyParameterValue", optional=true)
    public static native NSString ParameterValue();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyParameterCurve", optional=true)
    public static native NSString ParameterCurve();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="CHHapticPatternKeyParameterCurveControlPoints", optional=true)
    public static native NSString ParameterCurveControlPoints();
    /*</methods>*/
}
