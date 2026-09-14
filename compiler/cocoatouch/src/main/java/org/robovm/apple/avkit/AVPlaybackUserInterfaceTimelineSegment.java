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
package org.robovm.apple.avkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.iad.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avrouting.*;
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlaybackUserInterfaceTimelineSegment/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class AVPlaybackUserInterfaceTimelineSegmentPtr extends Ptr<AVPlaybackUserInterfaceTimelineSegment, AVPlaybackUserInterfaceTimelineSegmentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlaybackUserInterfaceTimelineSegment.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVPlaybackUserInterfaceTimelineSegment() {}
    protected AVPlaybackUserInterfaceTimelineSegment(Handle h, long handle) { super(h, handle); }
    protected AVPlaybackUserInterfaceTimelineSegment(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTimeRange:segmentType:marked:requiresLinearPlayback:identifier:")
    public AVPlaybackUserInterfaceTimelineSegment(@ByVal CMTimeRange timeRange, AVPlaybackUserInterfaceTimelineSegmentType segmentType, boolean marked, boolean requiresLinearPlayback, String identifier) { super((SkipInit) null); initObject(init(timeRange, segmentType, marked, requiresLinearPlayback, identifier)); }
    @Method(selector = "initWithCoder:")
    public AVPlaybackUserInterfaceTimelineSegment(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "timeRange")
    public native @ByVal CMTimeRange getTimeRange();
    @Property(selector = "segmentType")
    public native AVPlaybackUserInterfaceTimelineSegmentType getSegmentType();
    @Property(selector = "isMarked")
    public native boolean isMarked();
    @Property(selector = "requiresLinearPlayback")
    public native boolean requiresLinearPlayback();
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTimeRange:segmentType:marked:requiresLinearPlayback:identifier:")
    protected native @Pointer long init(@ByVal CMTimeRange timeRange, AVPlaybackUserInterfaceTimelineSegmentType segmentType, boolean marked, boolean requiresLinearPlayback, String identifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
