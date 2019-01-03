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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureDeviceType/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(AVCaptureDeviceType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="AVCaptureDeviceTypeBuiltInMicrophone", optional=true)
    public static native String BuiltInMicrophone();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="AVCaptureDeviceTypeBuiltInWideAngleCamera", optional=true)
    public static native String BuiltInWideAngleCamera();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="AVCaptureDeviceTypeBuiltInTelephotoCamera", optional=true)
    public static native String BuiltInTelephotoCamera();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="AVCaptureDeviceTypeBuiltInDualCamera", optional=true)
    public static native String BuiltInDualCamera();
    /**
     * @since Available in iOS 11.1 and later.
     */
    @GlobalValue(symbol="AVCaptureDeviceTypeBuiltInTrueDepthCamera", optional=true)
    public static native String BuiltInTrueDepthCamera();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.2. Use AVCaptureDeviceTypeBuiltInDualCamera instead.
     */
    @Deprecated
    @GlobalValue(symbol="AVCaptureDeviceTypeBuiltInDuoCamera", optional=true)
    public static native String BuiltInDuoCamera();
    /*</methods>*/
}
