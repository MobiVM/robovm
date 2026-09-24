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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSampleCursor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVSampleCursorPtr extends Ptr<AVSampleCursor, AVSampleCursorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSampleCursor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVSampleCursor() {}
    protected AVSampleCursor(Handle h, long handle) { super(h, handle); }
    protected AVSampleCursor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "presentationTimeStamp")
    public native @ByVal CMTime getPresentationTimeStamp();
    @Property(selector = "decodeTimeStamp")
    public native @ByVal CMTime getDecodeTimeStamp();
    @Property(selector = "currentSampleDuration")
    public native @ByVal CMTime getCurrentSampleDuration();
    @Property(selector = "currentSampleSyncInfo")
    public native @ByVal AVSampleCursorSyncInfo getCurrentSampleSyncInfo();
    @Property(selector = "currentSampleDependencyInfo")
    public native @ByVal AVSampleCursorDependencyInfo getCurrentSampleDependencyInfo();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "currentSampleDependencyAttachments")
    public native NSDictionary<?, ?> getCurrentSampleDependencyAttachments();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "currentSampleAudioDependencyInfo")
    public native @ByVal AVSampleCursorAudioDependencyInfo getCurrentSampleAudioDependencyInfo();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "samplesRequiredForDecoderRefresh")
    public native @MachineSizedSInt long getSamplesRequiredForDecoderRefresh();
    @Property(selector = "currentChunkStorageURL")
    public native NSURL getCurrentChunkStorageURL();
    @Property(selector = "currentChunkStorageRange")
    public native @ByVal AVSampleCursorStorageRange getCurrentChunkStorageRange();
    @Property(selector = "currentChunkInfo")
    public native @ByVal AVSampleCursorChunkInfo getCurrentChunkInfo();
    @Property(selector = "currentSampleIndexInChunk")
    public native long getCurrentSampleIndexInChunk();
    @Property(selector = "currentSampleStorageRange")
    public native @ByVal AVSampleCursorStorageRange getCurrentSampleStorageRange();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "stepInDecodeOrderByCount:")
    public native long stepInDecodeOrderByCount(long stepCount);
    @Method(selector = "stepInPresentationOrderByCount:")
    public native long stepInPresentationOrderByCount(long stepCount);
    @Method(selector = "stepByDecodeTime:wasPinned:")
    public native @ByVal CMTime stepByDecodeTime(@ByVal CMTime deltaDecodeTime, BooleanPtr outWasPinned);
    @Method(selector = "stepByPresentationTime:wasPinned:")
    public native @ByVal CMTime stepByPresentationTime(@ByVal CMTime deltaPresentationTime, BooleanPtr outWasPinned);
    @Method(selector = "comparePositionInDecodeOrderWithPositionOfCursor:")
    public native NSComparisonResult comparePositionInDecodeOrder(AVSampleCursor cursor);
    @Method(selector = "samplesWithEarlierDecodeTimeStampsMayHaveLaterPresentationTimeStampsThanCursor:")
    public native boolean samplesWithEarlierDecodeTimeStampsMayHaveLaterPresentationTimeStampsThanCursor(AVSampleCursor cursor);
    @Method(selector = "samplesWithLaterDecodeTimeStampsMayHaveEarlierPresentationTimeStampsThanCursor:")
    public native boolean samplesWithLaterDecodeTimeStampsMayHaveEarlierPresentationTimeStampsThanCursor(AVSampleCursor cursor);
    @Method(selector = "copyCurrentSampleFormatDescription")
    public native CMFormatDescription copyCurrentSampleFormatDescription();
    /*</methods>*/
}
