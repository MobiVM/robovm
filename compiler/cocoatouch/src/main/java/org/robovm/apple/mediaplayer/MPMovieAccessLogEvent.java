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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 9.0. Use AVFoundation.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMovieAccessLogEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPMovieAccessLogEventPtr extends Ptr<MPMovieAccessLogEvent, MPMovieAccessLogEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMovieAccessLogEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPMovieAccessLogEvent() {}
    protected MPMovieAccessLogEvent(Handle h, long handle) { super(h, handle); }
    protected MPMovieAccessLogEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "numberOfSegmentsDownloaded")
    public native @MachineSizedUInt long getNumberOfSegmentsDownloaded();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "playbackStartDate")
    public native NSDate getPlaybackStartDate();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "URI")
    public native String getURI();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "serverAddress")
    public native String getServerAddress();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "numberOfServerAddressChanges")
    public native @MachineSizedUInt long getNumberOfServerAddressChanges();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "playbackSessionID")
    public native String getPlaybackSessionID();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "playbackStartOffset")
    public native double getPlaybackStartOffset();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "segmentsDownloadedDuration")
    public native double getSegmentsDownloadedDuration();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "durationWatched")
    public native double getDurationWatched();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "numberOfStalls")
    public native @MachineSizedSInt long getNumberOfStalls();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "numberOfBytesTransferred")
    public native long getNumberOfBytesTransferred();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "observedBitrate")
    public native double getObservedBitrate();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "indicatedBitrate")
    public native double getIndicatedBitrate();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "numberOfDroppedVideoFrames")
    public native @MachineSizedSInt long getNumberOfDroppedVideoFrames();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
