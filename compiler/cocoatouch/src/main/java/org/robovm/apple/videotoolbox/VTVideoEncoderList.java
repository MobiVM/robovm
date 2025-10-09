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
/*<annotations>*/@Library("VideoToolbox")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTVideoEncoderList/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(VTVideoEncoderList.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("VideoToolbox")
    public static class Options {
        static { Bro.bind(Options.class); }

        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderListOption_IncludeStandardDefinitionDVEncoders", optional=true)
        public static native CFString IncludeStandardDefinitionDVEncoders();
        @GlobalValue(symbol="kVTVideoEncoderList_CodecType", optional=true)
        public static native CFString CodecType();
        @GlobalValue(symbol="kVTVideoEncoderList_EncoderID", optional=true)
        public static native CFString EncoderID();
        @GlobalValue(symbol="kVTVideoEncoderList_CodecName", optional=true)
        public static native CFString CodecName();
        @GlobalValue(symbol="kVTVideoEncoderList_EncoderName", optional=true)
        public static native CFString EncoderName();
        @GlobalValue(symbol="kVTVideoEncoderList_DisplayName", optional=true)
        public static native CFString DisplayName();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderList_GPURegistryID", optional=true)
        public static native CFString GPURegistryID();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderList_SupportedSelectionProperties", optional=true)
        public static native CFString SupportedSelectionProperties();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderList_PerformanceRating", optional=true)
        public static native CFString PerformanceRating();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderList_QualityRating", optional=true)
        public static native CFString QualityRating();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderList_InstanceLimit", optional=true)
        public static native CFString InstanceLimit();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderList_IsHardwareAccelerated", optional=true)
        public static native CFString IsHardwareAccelerated();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="kVTVideoEncoderList_SupportsFrameReordering", optional=true)
        public static native CFString SupportsFrameReordering();
    }
    
    @Bridge(symbol="VTCopyVideoEncoderList", optional=true)
    public static native OSStatus copyVideoEncoderList(CFDictionary options, CFArray.CFArrayPtr listOfVideoEncodersOut);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="VTCopySupportedPropertyDictionaryForEncoder", optional=true)
    public static native OSStatus copySupportedPropertyDictionaryForEncoder(int width, int height, CMVideoCodecType codecType, CFDictionary encoderSpecification, CFString.CFStringPtr encoderIDOut, CFDictionary.CFDictionaryPtr supportedPropertiesOut);
    /*</methods>*/
}
