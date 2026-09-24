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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetricPlayerItemPlaybackSummaryEvent/*</name>*/ 
    extends /*<extends>*/AVMetricEvent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVMetricPlayerItemPlaybackSummaryEventPtr extends Ptr<AVMetricPlayerItemPlaybackSummaryEvent, AVMetricPlayerItemPlaybackSummaryEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMetricPlayerItemPlaybackSummaryEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVMetricPlayerItemPlaybackSummaryEvent() {}
    protected AVMetricPlayerItemPlaybackSummaryEvent(Handle h, long handle) { super(h, handle); }
    protected AVMetricPlayerItemPlaybackSummaryEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "errorEvent")
    public native AVMetricErrorEvent getErrorEvent();
    @Property(selector = "recoverableErrorCount")
    public native @MachineSizedSInt long getRecoverableErrorCount();
    @Property(selector = "stallCount")
    public native @MachineSizedSInt long getStallCount();
    @Property(selector = "variantSwitchCount")
    public native @MachineSizedSInt long getVariantSwitchCount();
    @Property(selector = "playbackDuration")
    public native @MachineSizedSInt long getPlaybackDuration();
    @Property(selector = "mediaResourceRequestCount")
    public native @MachineSizedSInt long getMediaResourceRequestCount();
    @Property(selector = "timeSpentRecoveringFromStall")
    public native double getTimeSpentRecoveringFromStall();
    @Property(selector = "timeSpentInInitialStartup")
    public native double getTimeSpentInInitialStartup();
    @Property(selector = "timeWeightedAverageBitrate")
    public native @MachineSizedSInt long getTimeWeightedAverageBitrate();
    @Property(selector = "timeWeightedPeakBitrate")
    public native @MachineSizedSInt long getTimeWeightedPeakBitrate();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
