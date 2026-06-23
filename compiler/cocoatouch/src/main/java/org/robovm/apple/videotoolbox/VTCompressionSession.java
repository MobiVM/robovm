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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTCompressionSession/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VTCompressionSessionPtr extends Ptr<VTCompressionSession, VTCompressionSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(VTCompressionSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VTCompressionSession() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="VTCompressionSessionCreate", optional=true)
    public static native OSStatus create(CFAllocator allocator, int width, int height, CMVideoCodecType codecType, CFDictionary encoderSpecification, CFDictionary sourceImageBufferAttributes, CFAllocator compressedDataAllocator, FunctionPtr outputCallback, VoidPtr outputCallbackRefCon, VTCompressionSession.VTCompressionSessionPtr compressionSessionOut);
    @Bridge(symbol="VTCompressionSessionInvalidate", optional=true)
    public native void invalidate();
    @Bridge(symbol="VTCompressionSessionGetTypeID", optional=true)
    public static native @MachineSizedUInt long typeID();
    @Bridge(symbol="VTCompressionSessionGetPixelBufferPool", optional=true)
    public native CVPixelBufferPool getPixelBufferPool();
    @Bridge(symbol="VTCompressionSessionPrepareToEncodeFrames", optional=true)
    public native OSStatus prepareToEncodeFrames();
    @Bridge(symbol="VTCompressionSessionEncodeFrame", optional=true)
    public native OSStatus encodeFrame(CVImageBuffer imageBuffer, @ByVal CMTime presentationTimeStamp, @ByVal CMTime duration, CFDictionary frameProperties, VoidPtr sourceFrameRefcon, IntPtr infoFlagsOut);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Bridge(symbol="VTCompressionSessionEncodeFrameWithOutputHandler", optional=true)
    public native OSStatus encodeFrameWithOutputHandler(CVImageBuffer imageBuffer, @ByVal CMTime presentationTimeStamp, @ByVal CMTime duration, CFDictionary frameProperties, IntPtr infoFlagsOut, @Block VoidBlock3<OSStatus, VTEncodeInfoFlags, CMSampleBuffer> outputHandler);
    @Bridge(symbol="VTCompressionSessionCompleteFrames", optional=true)
    public native OSStatus completeFrames(@ByVal CMTime completeUntilPresentationTimeStamp);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="VTCompressionSessionEncodeMultiImageFrame", optional=true)
    public native OSStatus encodeMultiImageFrame(CMTaggedBufferGroup taggedBufferGroup, @ByVal CMTime presentationTimeStamp, @ByVal CMTime duration, CFDictionary frameProperties, VoidPtr sourceFrameRefcon, IntPtr infoFlagsOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="VTCompressionSessionEncodeMultiImageFrameWithOutputHandler", optional=true)
    public native OSStatus encodeMultiImageFrameWithOutputHandler(CMTaggedBufferGroup taggedBufferGroup, @ByVal CMTime presentationTimeStamp, @ByVal CMTime duration, CFDictionary frameProperties, IntPtr infoFlagsOut, @Block VoidBlock3<OSStatus, VTEncodeInfoFlags, CMSampleBuffer> outputHandler);
    @Bridge(symbol="VTCompressionSessionBeginPass", optional=true)
    public native OSStatus beginPass(VTCompressionSessionOptionFlags beginPassFlags, IntPtr reserved);
    @Bridge(symbol="VTCompressionSessionEndPass", optional=true)
    public native OSStatus endPass(BooleanPtr furtherPassesRequestedOut, IntPtr reserved);
    @Bridge(symbol="VTCompressionSessionGetTimeRangesForNextPass", optional=true)
    public native OSStatus getTimeRangesForNextPass(MachineSizedSIntPtr timeRangeCountOut, CMTimeRange.CMTimeRangePtr timeRangeArrayOut);
    /*</methods>*/
}
