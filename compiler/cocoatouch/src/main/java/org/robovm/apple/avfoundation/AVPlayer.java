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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlayer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPlayerPtr extends Ptr<AVPlayer, AVPlayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVPlayer() {}
    protected AVPlayer(Handle h, long handle) { super(h, handle); }
    protected AVPlayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:")
    public AVPlayer(NSURL URL) { super((SkipInit) null); initObject(init(URL)); }
    @Method(selector = "initWithPlayerItem:")
    public AVPlayer(AVPlayerItem item) { super((SkipInit) null); initObject(init(item)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "status")
    public native AVPlayerStatus getStatus();
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "rate")
    public native float getRate();
    @Property(selector = "setRate:")
    public native void setRate(float v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "timeControlStatus")
    public native AVPlayerTimeControlStatus getTimeControlStatus();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "reasonForWaitingToPlay")
    public native String getReasonForWaitingToPlay();
    @Property(selector = "currentItem")
    public native AVPlayerItem getCurrentItem();
    @Property(selector = "actionAtItemEnd")
    public native AVPlayerActionAtItemEnd getActionAtItemEnd();
    @Property(selector = "setActionAtItemEnd:")
    public native void setActionAtItemEnd(AVPlayerActionAtItemEnd v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "automaticallyWaitsToMinimizeStalling")
    public native boolean automaticallyWaitsToMinimizeStalling();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setAutomaticallyWaitsToMinimizeStalling:")
    public native void setAutomaticallyWaitsToMinimizeStalling(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "sourceClock")
    public native CMClock getSourceClock();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setSourceClock:")
    public native void setSourceClock(CMClock v);
    @Property(selector = "volume")
    public native float getVolume();
    @Property(selector = "setVolume:")
    public native void setVolume(float v);
    @Property(selector = "isMuted")
    public native boolean isMuted();
    @Property(selector = "setMuted:")
    public native void setMuted(boolean v);
    @Property(selector = "appliesMediaSelectionCriteriaAutomatically")
    public native boolean appliesMediaSelectionCriteriaAutomatically();
    @Property(selector = "setAppliesMediaSelectionCriteriaAutomatically:")
    public native void setAppliesMediaSelectionCriteriaAutomatically(boolean v);
    @Property(selector = "allowsExternalPlayback")
    public native boolean allowsExternalPlayback();
    @Property(selector = "setAllowsExternalPlayback:")
    public native void setAllowsExternalPlayback(boolean v);
    @Property(selector = "isExternalPlaybackActive")
    public native boolean isExternalPlaybackActive();
    @Property(selector = "usesExternalPlaybackWhileExternalScreenIsActive")
    public native boolean usesExternalPlaybackWhileExternalScreenIsActive();
    @Property(selector = "setUsesExternalPlaybackWhileExternalScreenIsActive:")
    public native void setUsesExternalPlaybackWhileExternalScreenIsActive(boolean v);
    @Property(selector = "externalPlaybackVideoGravity")
    public native String getExternalPlaybackVideoGravity();
    @Property(selector = "setExternalPlaybackVideoGravity:")
    public native void setExternalPlaybackVideoGravity(String v);
    @Property(selector = "outputObscuredDueToInsufficientExternalProtection")
    public native boolean outputObscuredDueToInsufficientExternalProtection();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @Property(selector = "availableHDRModes")
    public static native AVPlayerHDRMode getAvailableHDRModes();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "eligibleForHDRPlayback")
    public static native boolean isEligibleForHDRPlayback();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "preventsDisplaySleepDuringVideoPlayback")
    public native boolean isPreventsDisplaySleepDuringVideoPlayback();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setPreventsDisplaySleepDuringVideoPlayback:")
    public native void setPreventsDisplaySleepDuringVideoPlayback(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "audiovisualBackgroundPlaybackPolicy")
    public native AVPlayerAudiovisualBackgroundPlaybackPolicy getAudiovisualBackgroundPlaybackPolicy();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setAudiovisualBackgroundPlaybackPolicy:")
    public native void setAudiovisualBackgroundPlaybackPolicy(AVPlayerAudiovisualBackgroundPlaybackPolicy v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "playbackCoordinator")
    public native AVPlayerPlaybackCoordinator getPlaybackCoordinator();
    /**
     * @deprecated Deprecated in iOS 11.0. Allow AVPlayer to enable closed captions automatically according to user preferences by ensuring that the value of appliesMediaSelectionCriteriaAutomatically is YES.
     */
    @Deprecated
    @Property(selector = "isClosedCaptionDisplayEnabled")
    public native boolean isClosedCaptionDisplayEnabled();
    /**
     * @deprecated Deprecated in iOS 11.0. Allow AVPlayer to enable closed captions automatically according to user preferences by ensuring that the value of appliesMediaSelectionCriteriaAutomatically is YES.
     */
    @Deprecated
    @Property(selector = "setClosedCaptionDisplayEnabled:")
    public native void setClosedCaptionDisplayEnabled(boolean v);
    /**
     * @deprecated Use sourceClock
     */
    @Deprecated
    @Property(selector = "masterClock")
    public native CMClock getMasterClock();
    /**
     * @deprecated Use sourceClock
     */
    @Deprecated
    @Property(selector = "setMasterClock:")
    public native void setMasterClock(CMClock v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="AVPlayerWaitingToMinimizeStallsReason", optional=true)
    public static native NSString WaitingToMinimizeStallsReason();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="AVPlayerWaitingWhileEvaluatingBufferingRateReason", optional=true)
    public static native NSString WaitingWhileEvaluatingBufferingRateReason();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="AVPlayerWaitingWithNoItemToPlayReason", optional=true)
    public static native NSString WaitingWithNoItemToPlayReason();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVPlayerWaitingForCoordinatedPlaybackReason", optional=true)
    public static native NSString WaitingForCoordinatedPlaybackReason();
    /**
     * @since Available in iOS 11.2 and later.
     */
    @GlobalValue(symbol="AVPlayerAvailableHDRModesDidChangeNotification", optional=true)
    public static native String AvailableHDRModesDidChangeNotification();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVPlayerWaitingDuringInterstitialEventReason", optional=true)
    public static native NSString WaitingDuringInterstitialEventReason();
    @Library("AVFoundation")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVPlayerRateDidChangeNotification", optional=true)
        public static native NSString RateDidChange();
        /**
         * @since Available in iOS 13.4 and later.
         */
        @GlobalValue(symbol="AVPlayerEligibleForHDRPlaybackDidChangeNotification", optional=true)
        public static native NSString EligibleForHDRPlaybackDidChange();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVPlayerInterstitialEventMonitorEventsDidChangeNotification", optional=true)
        public static native NSString InterstitialEventMonitorEventsDidChange();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVPlayerInterstitialEventMonitorCurrentEventDidChangeNotification", optional=true)
        public static native NSString InterstitialEventMonitorCurrentEventDidChange();
    }
    
    @Method(selector = "initWithURL:")
    protected native @Pointer long init(NSURL URL);
    @Method(selector = "initWithPlayerItem:")
    protected native @Pointer long init(AVPlayerItem item);
    @Method(selector = "play")
    public native void play();
    @Method(selector = "pause")
    public native void pause();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "playImmediatelyAtRate:")
    public native void playImmediatelyAtRate(float rate);
    @Method(selector = "replaceCurrentItemWithPlayerItem:")
    public native void replaceCurrentItem(AVPlayerItem item);
    @Method(selector = "currentTime")
    public native @ByVal CMTime getCurrentTime();
    @Method(selector = "seekToDate:")
    public native void seekToDate(NSDate date);
    @Method(selector = "seekToDate:completionHandler:")
    public native void seekToDate(NSDate date, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "seekToTime:")
    public native void seekToTime(@ByVal CMTime time);
    @Method(selector = "seekToTime:toleranceBefore:toleranceAfter:")
    public native void seekToTime(@ByVal CMTime time, @ByVal CMTime toleranceBefore, @ByVal CMTime toleranceAfter);
    @Method(selector = "seekToTime:completionHandler:")
    public native void seekToTime(@ByVal CMTime time, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "seekToTime:toleranceBefore:toleranceAfter:completionHandler:")
    public native void seekToTime(@ByVal CMTime time, @ByVal CMTime toleranceBefore, @ByVal CMTime toleranceAfter, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "setRate:time:atHostTime:")
    public native void setRate(float rate, @ByVal CMTime itemTime, @ByVal CMTime hostClockTime);
    @Method(selector = "prerollAtRate:completionHandler:")
    public native void prerollAtRate(float rate, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "cancelPendingPrerolls")
    public native void cancelPendingPrerolls();
    @WeaklyLinked
    @Method(selector = "addPeriodicTimeObserverForInterval:queue:usingBlock:")
    public native NSObject addPeriodicTimeObserver(@ByVal CMTime interval, DispatchQueue queue, @Block("(@ByVal)") VoidBlock1<CMTime> block);
    @WeaklyLinked
    @Method(selector = "addBoundaryTimeObserverForTimes:queue:usingBlock:")
    public native NSObject addBoundaryTimeObserver(@org.robovm.rt.bro.annotation.Marshaler(CMTime.AsValuedListMarshaler.class) List<CMTime> times, DispatchQueue queue, @Block Runnable block);
    @Method(selector = "removeTimeObserver:")
    public native void removeTimeObserver(NSObject observer);
    @Method(selector = "setMediaSelectionCriteria:forMediaCharacteristic:")
    public native void setMediaSelectionCriteria(AVPlayerMediaSelectionCriteria criteria, String mediaCharacteristic);
    @Method(selector = "mediaSelectionCriteriaForMediaCharacteristic:")
    public native AVPlayerMediaSelectionCriteria getMediaSelectionCriteria(String mediaCharacteristic);
    /*</methods>*/
}
