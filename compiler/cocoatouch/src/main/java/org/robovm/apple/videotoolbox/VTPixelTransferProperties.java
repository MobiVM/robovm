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
package org.robovm.apple.videotoolbox;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTPixelTransferProperties/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("VideoToolbox")
    public static class DownsamplingMode {
        static { Bro.bind(DownsamplingMode.class); }

        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTDownsamplingMode_Decimate", optional=true)
        public static native CFString Decimate();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTDownsamplingMode_Average", optional=true)
        public static native CFString Average();
    }

    @Library("VideoToolbox")
    public static class Keys {
        static { Bro.bind(Keys.class); }

        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTPixelTransferPropertyKey_ScalingMode", optional=true)
        public static native CFString ScalingMode();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTPixelTransferPropertyKey_DestinationCleanAperture", optional=true)
        public static native CFString DestinationCleanAperture();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTPixelTransferPropertyKey_DestinationPixelAspectRatio", optional=true)
        public static native CFString DestinationPixelAspectRatio();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTPixelTransferPropertyKey_DownsamplingMode", optional=true)
        public static native CFString DownsamplingMode();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTPixelTransferPropertyKey_DestinationColorPrimaries", optional=true)
        public static native CFString DestinationColorPrimaries();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTPixelTransferPropertyKey_DestinationTransferFunction", optional=true)
        public static native CFString DestinationTransferFunction();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTPixelTransferPropertyKey_DestinationICCProfile", optional=true)
        public static native CFString DestinationICCProfile();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTPixelTransferPropertyKey_DestinationYCbCrMatrix", optional=true)
        public static native CFString DestinationYCbCrMatrix();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTPixelTransferPropertyKey_RealTime", optional=true)
        public static native CFString RealTime();
    }

    @Library("VideoToolbox")
    public static class ScalingMode {
        static { Bro.bind(ScalingMode.class); }

        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTScalingMode_Normal", optional=true)
        public static native CFString Normal();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTScalingMode_CropSourceToCleanAperture", optional=true)
        public static native CFString CropSourceToCleanAperture();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTScalingMode_Letterbox", optional=true)
        public static native CFString Letterbox();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kVTScalingMode_Trim", optional=true)
        public static native CFString Trim();
    }
    /*</methods>*/
}
