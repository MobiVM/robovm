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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlayerItemIntegratedTimeline/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPlayerItemIntegratedTimelinePtr extends Ptr<AVPlayerItemIntegratedTimeline, AVPlayerItemIntegratedTimelinePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlayerItemIntegratedTimeline.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVPlayerItemIntegratedTimeline() {}
    protected AVPlayerItemIntegratedTimeline(Handle h, long handle) { super(h, handle); }
    protected AVPlayerItemIntegratedTimeline(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "currentSnapshot")
    public native AVPlayerItemIntegratedTimelineSnapshot getCurrentSnapshot();
    @Property(selector = "currentTime")
    public native @ByVal CMTime getCurrentTime();
    @Property(selector = "currentDate")
    public native NSDate getCurrentDate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "seekToTime:toleranceBefore:toleranceAfter:completionHandler:")
    public native void seekToTime(@ByVal CMTime time, @ByVal CMTime toleranceBefore, @ByVal CMTime toleranceAfter, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "seekToDate:completionHandler:")
    public native void seekToDate(NSDate date, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "addPeriodicTimeObserverForInterval:queue:usingBlock:")
    public native AVPlayerItemIntegratedTimelineObserver addPeriodicTimeObserver(@ByVal CMTime interval, DispatchQueue queue, @Block("(@ByVal)") VoidBlock1<CMTime> block);
    @Method(selector = "addBoundaryTimeObserverForSegment:offsetsIntoSegment:queue:usingBlock:")
    public native AVPlayerItemIntegratedTimelineObserver addBoundaryTimeObserver(AVPlayerItemSegment segment, NSArray<?> offsetsIntoSegment, DispatchQueue queue, @Block VoidBooleanBlock block);
    @Method(selector = "removeTimeObserver:")
    public native void removeTimeObserver(AVPlayerItemIntegratedTimelineObserver observer);
    /*</methods>*/
}
