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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTHDRPerFrameMetadataGenerationSession/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VTHDRPerFrameMetadataGenerationSessionPtr extends Ptr<VTHDRPerFrameMetadataGenerationSession, VTHDRPerFrameMetadataGenerationSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(VTHDRPerFrameMetadataGenerationSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VTHDRPerFrameMetadataGenerationSession() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("VideoToolbox")
    public static class HDRFormatType {
        static { Bro.bind(HDRFormatType.class); }

        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="kVTHDRPerFrameMetadataGenerationHDRFormatType_DolbyVision", optional=true)
        public static native CFString DolbyVision();
    }

    @Library("VideoToolbox")
    public static class OptionsKeys {
        static { Bro.bind(OptionsKeys.class); }

        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="kVTHDRPerFrameMetadataGenerationOptionsKey_HDRFormats", optional=true)
        public static native CFString HDRFormats();
    }
    
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="VTHDRPerFrameMetadataGenerationSessionGetTypeID", optional=true)
    public static native @MachineSizedUInt long typeID();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="VTHDRPerFrameMetadataGenerationSessionCreate", optional=true)
    public static native OSStatus create(CFAllocator allocator, float framesPerSecond, CFDictionary options, VTHDRPerFrameMetadataGenerationSession.VTHDRPerFrameMetadataGenerationSessionPtr hdrPerFrameMetadataGenerationSessionOut);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="VTHDRPerFrameMetadataGenerationSessionAttachMetadata", optional=true)
    public native OSStatus attachMetadata(CVPixelBuffer pixelBuffer, boolean sceneChange);
    /*</methods>*/
}
