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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTDecompressionSession/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VTDecompressionSessionPtr extends Ptr<VTDecompressionSession, VTDecompressionSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(VTDecompressionSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VTDecompressionSession() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="VTIsStereoMVHEVCEncodeSupported", optional=true)
    public static native boolean isStereoMVHEVCEncodeSupported();
    @Bridge(symbol="VTDecompressionSessionCreate", optional=true)
    public static native OSStatus create(CFAllocator allocator, CMVideoFormatDescription videoFormatDescription, CFDictionary videoDecoderSpecification, CFDictionary destinationImageBufferAttributes, VTDecompressionOutputCallbackRecord outputCallback, VTDecompressionSession.VTDecompressionSessionPtr decompressionSessionOut);
    @Bridge(symbol="VTDecompressionSessionInvalidate", optional=true)
    public native void invalidate();
    @Bridge(symbol="VTDecompressionSessionGetTypeID", optional=true)
    public static native @MachineSizedUInt long typeID();
    @Bridge(symbol="VTDecompressionSessionDecodeFrame", optional=true)
    public native OSStatus decodeFrame(CMSampleBuffer sampleBuffer, VTDecodeFrameFlags decodeFlags, VoidPtr sourceFrameRefCon, IntPtr infoFlagsOut);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="VTDecompressionSessionDecodeFrameWithOutputHandler", optional=true)
    public native OSStatus decodeFrameWithOutputHandler(CMSampleBuffer sampleBuffer, VTDecodeFrameFlags decodeFlags, IntPtr infoFlagsOut, @Block("(,,,@ByVal,@ByVal)") VoidBlock5<OSStatus, VTDecodeInfoFlags, CVImageBuffer, CMTime, CMTime> outputHandler);
    @Bridge(symbol="VTDecompressionSessionFinishDelayedFrames", optional=true)
    public native OSStatus finishDelayedFrames();
    @Bridge(symbol="VTDecompressionSessionCanAcceptFormatDescription", optional=true)
    public native boolean canAcceptFormatDescription(CMFormatDescription newFormatDesc);
    @Bridge(symbol="VTDecompressionSessionWaitForAsynchronousFrames", optional=true)
    public native OSStatus waitForAsynchronousFrames();
    @Bridge(symbol="VTDecompressionSessionCopyBlackPixelBuffer", optional=true)
    public native OSStatus copyBlackPixelBuffer(CVPixelBuffer.CVPixelBufferPtr pixelBufferOut);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Bridge(symbol="VTIsHardwareDecodeSupported", optional=true)
    public static native boolean isHardwareDecodeSupported(CMVideoCodecType codecType);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="VTIsStereoMVHEVCDecodeSupported", optional=true)
    public static native boolean isStereoMVHEVCDecodeSupported();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="VTDecompressionSessionSetMultiImageCallback", optional=true)
    public native OSStatus setMultiImageCallback(FunctionPtr outputMultiImageCallback, VoidPtr outputMultiImageRefcon);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="VTDecompressionSessionDecodeFrameWithMultiImageCapableOutputHandler", optional=true)
    public native OSStatus decodeFrameWithMultiImageCapableOutputHandler(CMSampleBuffer sampleBuffer, VTDecodeFrameFlags decodeFlags, IntPtr infoFlagsOut, @Block("(,,,,@ByVal,@ByVal)") VoidBlock6<OSStatus, VTDecodeInfoFlags, CVImageBuffer, CMTaggedBufferGroup, CMTime, CMTime> multiImageCapableOutputHandler);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="VTDecompressionSessionDecodeFrameWithOptions", optional=true)
    public native OSStatus decodeFrameWithOptions(CMSampleBuffer sampleBuffer, VTDecodeFrameFlags decodeFlags, CFDictionary frameOptions, VoidPtr sourceFrameRefCon, IntPtr infoFlagsOut);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Bridge(symbol="VTDecompressionSessionDecodeFrameWithOptionsAndOutputHandler", optional=true)
    public native OSStatus decodeFrameWithOptionsAndOutputHandler(CMSampleBuffer sampleBuffer, VTDecodeFrameFlags decodeFlags, CFDictionary frameOptions, IntPtr infoFlagsOut, @Block("(,,,@ByVal,@ByVal)") VoidBlock5<OSStatus, VTDecodeInfoFlags, CVImageBuffer, CMTime, CMTime> outputHandler);
    /*</methods>*/
}
