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
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.videotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetWritingPlanner/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAssetWritingPlannerPtr extends Ptr<AVAssetWritingPlanner, AVAssetWritingPlannerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetWritingPlanner.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAssetWritingPlanner() {}
    protected AVAssetWritingPlanner(Handle h, long handle) { super(h, handle); }
    protected AVAssetWritingPlanner(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDirectoryForTemporaryFiles:")
    public AVAssetWritingPlanner(NSURL directoryForTemporaryFiles) { super((SkipInit) null); initObject(init(directoryForTemporaryFiles)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "progress")
    public native AVAssetWritingPlannerProgress getProgress();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDirectoryForTemporaryFiles:")
    protected native @Pointer long init(NSURL directoryForTemporaryFiles);
    @Method(selector = "planTrack:withSegmentsGeneratedBy:")
    public native void planTrack(AVAssetTrackPlan trackPlan, @Block VoidBlock1<AVPlannedSegmentWritingRequest> writingSegmentCallbackBlock);
    @Method(selector = "executePlanWithCompletionHandler:")
    public native void executePlan(@Block VoidBlock2<AVComposition, NSError> completionHandler);
    @Method(selector = "executePlanOnQueue:withCompletionHandler:")
    public native void executePlan(DispatchQueue executionQueue, @Block VoidBlock2<AVComposition, NSError> completionHandler);
    @Method(selector = "segmentBoundaryGuidelinesForVideoCodecType:videoEncoderSpecification:")
    public static native @ByVal AVPlannedVideoSegmentBoundaryGuidelines segmentBoundaryGuidelines(AVVideoCodecType videoCodecType, NSDictionary<?, ?> videoEncoderSpecification);
    @Method(selector = "segmentBoundaryRecommendationsForVideoAVAssetTrack:minimumSegmentDuration:minimumSegmentFrameCount:")
    public static native NSArray<AVPlannedVideoSegmentConfiguration> segmentBoundaryRecommendations(AVAssetTrack videoAssetTrack, @ByVal CMTime minimumSegmentDuration, @MachineSizedSInt long minimumSegmentFrameCount);
    /*</methods>*/
}
