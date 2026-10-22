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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetVideoTrackPlan/*</name>*/ 
    extends /*<extends>*/AVAssetTrackPlan/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAssetVideoTrackPlanPtr extends Ptr<AVAssetVideoTrackPlan, AVAssetVideoTrackPlanPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetVideoTrackPlan.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAssetVideoTrackPlan() {}
    protected AVAssetVideoTrackPlan(Handle h, long handle) { super(h, handle); }
    protected AVAssetVideoTrackPlan(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithVideoCodecType:encoderSpecification:mediaType:segmentConfigurations:assemblyTrackID:")
    public AVAssetVideoTrackPlan(AVVideoCodecType videoCodecType, NSDictionary<?, ?> encoderSpecification, String mediaType, NSArray<AVPlannedSegmentConfiguration> segmentConfigurations, int trackID) { super((SkipInit) null); initObject(init(videoCodecType, encoderSpecification, mediaType, segmentConfigurations, trackID)); }
    @Method(selector = "initWithMediaType:segmentConfigurations:assemblyTrackID:")
    public AVAssetVideoTrackPlan(String mediaType, NSArray<AVPlannedSegmentConfiguration> segmentConfigurations, int trackID) { super(mediaType, segmentConfigurations, trackID); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "videoCodecType")
    public native AVVideoCodecType getVideoCodecType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithVideoCodecType:encoderSpecification:mediaType:segmentConfigurations:assemblyTrackID:")
    protected native @Pointer long init(AVVideoCodecType videoCodecType, NSDictionary<?, ?> encoderSpecification, String mediaType, NSArray<AVPlannedSegmentConfiguration> segmentConfigurations, int trackID);
    /*</methods>*/
}
