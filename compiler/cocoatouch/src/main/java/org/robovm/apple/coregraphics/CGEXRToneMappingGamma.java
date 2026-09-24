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
package org.robovm.apple.coregraphics;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreGraphics")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGEXRToneMappingGamma/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CGEXRToneMappingGamma.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.0 and later.
     */
    @GlobalValue(symbol="kCGEXRToneMappingGammaDefog", optional=true)
    public static native String Defog();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @GlobalValue(symbol="kCGEXRToneMappingGammaExposure", optional=true)
    public static native String Exposure();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @GlobalValue(symbol="kCGEXRToneMappingGammaKneeLow", optional=true)
    public static native String KneeLow();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @GlobalValue(symbol="kCGEXRToneMappingGammaKneeHigh", optional=true)
    public static native String KneeHigh();
    
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Bridge(symbol="CGEXRToneMappingGammaGetDefaultOptions", optional=true)
    public static native NSDictionary getDefaultOptions();
    /*</methods>*/
}
