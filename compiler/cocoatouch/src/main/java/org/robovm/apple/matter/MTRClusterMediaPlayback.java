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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterMediaPlayback/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterMediaPlaybackPtr extends Ptr<MTRClusterMediaPlayback, MTRClusterMediaPlaybackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterMediaPlayback.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterMediaPlayback() {}
    protected MTRClusterMediaPlayback(Handle h, long handle) { super(h, handle); }
    protected MTRClusterMediaPlayback(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterMediaPlayback(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRDevice device, NSNumber endpointID, DispatchQueue queue);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "playWithParams:expectedValues:expectedValueInterval:completion:")
    public native void play(MTRMediaPlaybackClusterPlayParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "playWithExpectedValues:expectedValueInterval:completion:")
    public native void play(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "pauseWithParams:expectedValues:expectedValueInterval:completion:")
    public native void pause(MTRMediaPlaybackClusterPauseParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "pauseWithExpectedValues:expectedValueInterval:completion:")
    public native void pause(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stopWithParams:expectedValues:expectedValueInterval:completion:")
    public native void stop(MTRMediaPlaybackClusterStopParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "stopWithExpectedValues:expectedValueInterval:completion:")
    public native void stop(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "startOverWithParams:expectedValues:expectedValueInterval:completion:")
    public native void startOver(MTRMediaPlaybackClusterStartOverParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "startOverWithExpectedValues:expectedValueInterval:completion:")
    public native void startOver(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "previousWithParams:expectedValues:expectedValueInterval:completion:")
    public native void previous(MTRMediaPlaybackClusterPreviousParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "previousWithExpectedValues:expectedValueInterval:completion:")
    public native void previous(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "nextWithParams:expectedValues:expectedValueInterval:completion:")
    public native void next(MTRMediaPlaybackClusterNextParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "nextWithExpectedValues:expectedValueInterval:completion:")
    public native void next(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "rewindWithParams:expectedValues:expectedValueInterval:completion:")
    public native void rewind(MTRMediaPlaybackClusterRewindParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "rewindWithExpectedValues:expectedValueInterval:completion:")
    public native void rewind(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "fastForwardWithParams:expectedValues:expectedValueInterval:completion:")
    public native void fastForward(MTRMediaPlaybackClusterFastForwardParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "fastForwardWithExpectedValues:expectedValueInterval:completion:")
    public native void fastForward(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "skipForwardWithParams:expectedValues:expectedValueInterval:completion:")
    public native void skipForward(MTRMediaPlaybackClusterSkipForwardParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "skipBackwardWithParams:expectedValues:expectedValueInterval:completion:")
    public native void skipBackward(MTRMediaPlaybackClusterSkipBackwardParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "seekWithParams:expectedValues:expectedValueInterval:completion:")
    public native void seek(MTRMediaPlaybackClusterSeekParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRMediaPlaybackClusterPlaybackResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeCurrentStateWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCurrentState(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeStartTimeWithParams:")
    public native NSDictionary<NSString, ?> readAttributeStartTime(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeDurationWithParams:")
    public native NSDictionary<NSString, ?> readAttributeDuration(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSampledPositionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSampledPosition(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributePlaybackSpeedWithParams:")
    public native NSDictionary<NSString, ?> readAttributePlaybackSpeed(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSeekRangeEndWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSeekRangeEnd(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeSeekRangeStartWithParams:")
    public native NSDictionary<NSString, ?> readAttributeSeekRangeStart(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGeneratedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcceptedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeAttributeListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAttributeList(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFeatureMap(MTRReadParams params);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeClusterRevision(MTRReadParams params);
    /*</methods>*/
}
