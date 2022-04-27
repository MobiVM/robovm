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
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAsynchronousVideoCompositionRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAsynchronousVideoCompositionRequestPtr extends Ptr<AVAsynchronousVideoCompositionRequest, AVAsynchronousVideoCompositionRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAsynchronousVideoCompositionRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAsynchronousVideoCompositionRequest() {}
    protected AVAsynchronousVideoCompositionRequest(Handle h, long handle) { super(h, handle); }
    protected AVAsynchronousVideoCompositionRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "renderContext")
    public native AVVideoCompositionRenderContext getRenderContext();
    @Property(selector = "compositionTime")
    public native @ByVal CMTime getCompositionTime();
    @Property(selector = "sourceTrackIDs")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getSourceTrackIDs();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "sourceSampleDataTrackIDs")
    public native NSArray<NSNumber> getSourceSampleDataTrackIDs();
    @Property(selector = "videoCompositionInstruction")
    public native AVVideoCompositionInstructionProtocol getVideoCompositionInstruction();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @WeaklyLinked
    @Method(selector = "sourceFrameByTrackID:")
    public native CVPixelBuffer getSourceFrame(int trackID);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "sourceSampleBufferByTrackID:")
    public native CMSampleBuffer sourceSampleBufferByTrackID(int trackID);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "sourceTimedMetadataByTrackID:")
    public native AVTimedMetadataGroup sourceTimedMetadataByTrackID(int trackID);
    @WeaklyLinked
    @Method(selector = "finishWithComposedVideoFrame:")
    public native void finish(CVPixelBuffer composedVideoFrame);
    @Method(selector = "finishWithError:")
    public native void finish(NSError error);
    @Method(selector = "finishCancelledRequest")
    public native void finishCancelledRequest();
    /*</methods>*/
}
