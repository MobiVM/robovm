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

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlayerItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 5.0 and later.
         */
        public static NSObject observeTimeJumped(AVPlayerItem object, final VoidBlock1<AVPlayerItem> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(TimeJumpedNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification notification) {
                    block.invoke((AVPlayerItem)notification.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObject observeDidPlayToEndTime(AVPlayerItem object, final VoidBlock1<AVPlayerItem> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidPlayToEndTimeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification notification) {
                    block.invoke((AVPlayerItem)notification.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 4.3 and later.
         */
        public static NSObject observeFailedToPlayToEndTime(AVPlayerItem object, final VoidBlock2<AVPlayerItem, NSError> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(FailedToPlayToEndTimeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification notification) {
                    NSDictionary<?, ?> data = notification.getUserInfo();
                    NSError error = null;
                    if (data.containsKey(FailedToPlayToEndTimeErrorKey())) {
                        error = (NSError) data.get(FailedToPlayToEndTimeErrorKey());
                    }
                    block.invoke((AVPlayerItem)notification.getObject(), error);
                }
            });
        }
        /**
         * @since Available in iOS 6.0 and later.
         */
        public static NSObject observePlaybackStalled(AVPlayerItem object, final VoidBlock1<AVPlayerItem> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(PlaybackStalledNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification notification) {
                    block.invoke((AVPlayerItem)notification.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 6.0 and later.
         */
        public static NSObject observeNewAccessLogEntry(AVPlayerItem object, final VoidBlock1<AVPlayerItem> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(NewAccessLogEntryNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification notification) {
                    block.invoke((AVPlayerItem)notification.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 6.0 and later.
         */
        public static NSObject observeNewErrorLogEntry(AVPlayerItem object, final VoidBlock1<AVPlayerItem> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(NewErrorLogEntryNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification notification) {
                    block.invoke((AVPlayerItem)notification.getObject());
                }
            });
        }
    }
    
    
    /*<ptr>*/public static class AVPlayerItemPtr extends Ptr<AVPlayerItem, AVPlayerItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlayerItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVPlayerItem() {}
    protected AVPlayerItem(Handle h, long handle) { super(h, handle); }
    protected AVPlayerItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:")
    public AVPlayerItem(NSURL URL) { super((SkipInit) null); initObject(init(URL)); }
    @Method(selector = "initWithAsset:")
    public AVPlayerItem(AVAsset asset) { super((SkipInit) null); initObject(init(asset)); }
    @Method(selector = "initWithAsset:automaticallyLoadedAssetKeys:")
    public AVPlayerItem(AVAsset asset, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> automaticallyLoadedAssetKeys) { super((SkipInit) null); initObject(init(asset, automaticallyLoadedAssetKeys)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "status")
    public native AVPlayerItemStatus getStatus();
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "asset")
    public native AVAsset getAsset();
    @Property(selector = "tracks")
    public native NSArray<AVPlayerItemTrack> getTracks();
    @Property(selector = "duration")
    public native @ByVal CMTime getDuration();
    @Property(selector = "presentationSize")
    public native @ByVal CGSize getPresentationSize();
    /**
     * @deprecated Deprecated in iOS 13.0. Use AVPlayerItemMetadataOutput to obtain timed metadata
     */
    @Deprecated
    @Property(selector = "timedMetadata")
    public native NSArray<AVMetadataItem> getTimedMetadata();
    @Property(selector = "automaticallyLoadedAssetKeys")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAutomaticallyLoadedAssetKeys();
    @Property(selector = "canPlayFastForward")
    public native boolean canPlayFastForward();
    @Property(selector = "canPlaySlowForward")
    public native boolean canPlaySlowForward();
    @Property(selector = "canPlayReverse")
    public native boolean canPlayReverse();
    @Property(selector = "canPlaySlowReverse")
    public native boolean canPlaySlowReverse();
    @Property(selector = "canPlayFastReverse")
    public native boolean canPlayFastReverse();
    @Property(selector = "canStepForward")
    public native boolean canStepForward();
    @Property(selector = "canStepBackward")
    public native boolean canStepBackward();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "configuredTimeOffsetFromLive")
    public native @ByVal CMTime getConfiguredTimeOffsetFromLive();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setConfiguredTimeOffsetFromLive:")
    public native void setConfiguredTimeOffsetFromLive(@ByVal CMTime v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "recommendedTimeOffsetFromLive")
    public native @ByVal CMTime getRecommendedTimeOffsetFromLive();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "automaticallyPreservesTimeOffsetFromLive")
    public native boolean automaticallyPreservesTimeOffsetFromLive();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAutomaticallyPreservesTimeOffsetFromLive:")
    public native void setAutomaticallyPreservesTimeOffsetFromLive(boolean v);
    @Property(selector = "forwardPlaybackEndTime")
    public native @ByVal CMTime getForwardPlaybackEndTime();
    @Property(selector = "setForwardPlaybackEndTime:")
    public native void setForwardPlaybackEndTime(@ByVal CMTime v);
    @Property(selector = "reversePlaybackEndTime")
    public native @ByVal CMTime getReversePlaybackEndTime();
    @Property(selector = "setReversePlaybackEndTime:")
    public native void setReversePlaybackEndTime(@ByVal CMTime v);
    @Property(selector = "seekableTimeRanges")
    public native @org.robovm.rt.bro.annotation.Marshaler(CMTimeRange.AsValuedListMarshaler.class) List<CMTimeRange> getSeekableTimeRanges();
    @Property(selector = "timebase")
    public native CMTimebase getTimebase();
    @Property(selector = "videoComposition")
    public native AVVideoComposition getVideoComposition();
    @Property(selector = "setVideoComposition:")
    public native void setVideoComposition(AVVideoComposition v);
    @Property(selector = "customVideoCompositor")
    public native AVVideoCompositing getCustomVideoCompositor();
    @Property(selector = "seekingWaitsForVideoCompositionRendering")
    public native boolean seekingWaitsForVideoCompositionRendering();
    @Property(selector = "setSeekingWaitsForVideoCompositionRendering:")
    public native void seekingWaitsForVideoCompositionRendering(boolean v);
    @Property(selector = "textStyleRules")
    public native NSArray<AVTextStyleRule> getTextStyleRules();
    @Property(selector = "setTextStyleRules:")
    public native void setTextStyleRules(NSArray<AVTextStyleRule> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "videoApertureMode")
    public native AVVideoApertureMode getVideoApertureMode();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setVideoApertureMode:")
    public native void setVideoApertureMode(AVVideoApertureMode v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "appliesPerFrameHDRDisplayMetadata")
    public native boolean appliesPerFrameHDRDisplayMetadata();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAppliesPerFrameHDRDisplayMetadata:")
    public native void setAppliesPerFrameHDRDisplayMetadata(boolean v);
    @Property(selector = "audioTimePitchAlgorithm")
    public native String getAudioTimePitchAlgorithm();
    @Property(selector = "setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(String v);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Use allowedAudioSpatializationFormats
     */
    @Deprecated
    @Property(selector = "isAudioSpatializationAllowed")
    public native boolean isAudioSpatializationAllowed();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Use allowedAudioSpatializationFormats
     */
    @Deprecated
    @Property(selector = "setAudioSpatializationAllowed:")
    public native void setAudioSpatializationAllowed(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allowedAudioSpatializationFormats")
    public native AVAudioSpatializationFormats getAllowedAudioSpatializationFormats();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAllowedAudioSpatializationFormats:")
    public native void setAllowedAudioSpatializationFormats(AVAudioSpatializationFormats v);
    @Property(selector = "audioMix")
    public native AVAudioMix getAudioMix();
    @Property(selector = "setAudioMix:")
    public native void setAudioMix(AVAudioMix v);
    @Property(selector = "loadedTimeRanges")
    public native @org.robovm.rt.bro.annotation.Marshaler(CMTimeRange.AsValuedListMarshaler.class) List<CMTimeRange> getLoadedTimeRanges();
    @Property(selector = "isPlaybackLikelyToKeepUp")
    public native boolean isPlaybackLikelyToKeepUp();
    @Property(selector = "isPlaybackBufferFull")
    public native boolean isPlaybackBufferFull();
    @Property(selector = "isPlaybackBufferEmpty")
    public native boolean isPlaybackBufferEmpty();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "canUseNetworkResourcesForLiveStreamingWhilePaused")
    public native boolean canUseNetworkResourcesForLiveStreamingWhilePaused();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setCanUseNetworkResourcesForLiveStreamingWhilePaused:")
    public native void setCanUseNetworkResourcesForLiveStreamingWhilePaused(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "preferredForwardBufferDuration")
    public native double getPreferredForwardBufferDuration();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setPreferredForwardBufferDuration:")
    public native void setPreferredForwardBufferDuration(double v);
    @Property(selector = "preferredPeakBitRate")
    public native double getPreferredPeakBitRate();
    @Property(selector = "setPreferredPeakBitRate:")
    public native void setPreferredPeakBitRate(double v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "preferredPeakBitRateForExpensiveNetworks")
    public native double getPreferredPeakBitRateForExpensiveNetworks();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setPreferredPeakBitRateForExpensiveNetworks:")
    public native void setPreferredPeakBitRateForExpensiveNetworks(double v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "preferredMaximumResolution")
    public native @ByVal CGSize getPreferredMaximumResolution();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPreferredMaximumResolution:")
    public native void setPreferredMaximumResolution(@ByVal CGSize v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "preferredMaximumResolutionForExpensiveNetworks")
    public native @ByVal CGSize getPreferredMaximumResolutionForExpensiveNetworks();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setPreferredMaximumResolutionForExpensiveNetworks:")
    public native void setPreferredMaximumResolutionForExpensiveNetworks(@ByVal CGSize v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "startsOnFirstEligibleVariant")
    public native boolean isStartsOnFirstEligibleVariant();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setStartsOnFirstEligibleVariant:")
    public native void setStartsOnFirstEligibleVariant(boolean v);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "variantPreferences")
    public native AVVariantPreferences getVariantPreferences();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "setVariantPreferences:")
    public native void setVariantPreferences(AVVariantPreferences v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "currentMediaSelection")
    public native AVMediaSelection getCurrentMediaSelection();
    @Property(selector = "outputs")
    public native NSArray<AVPlayerItemOutput> getOutputs();
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Property(selector = "mediaDataCollectors")
    public native NSArray<AVPlayerItemMediaDataCollector> getMediaDataCollectors();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "automaticallyHandlesInterstitialEvents")
    public native boolean automaticallyHandlesInterstitialEvents();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setAutomaticallyHandlesInterstitialEvents:")
    public native void setAutomaticallyHandlesInterstitialEvents(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "templatePlayerItem")
    public native AVPlayerItem getTemplatePlayerItem();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="AVPlayerItemTimeJumpedNotification", optional=true)
    public static native NSString TimeJumpedNotification();
    @GlobalValue(symbol="AVPlayerItemDidPlayToEndTimeNotification", optional=true)
    public static native NSString DidPlayToEndTimeNotification();
    @GlobalValue(symbol="AVPlayerItemFailedToPlayToEndTimeNotification", optional=true)
    public static native NSString FailedToPlayToEndTimeNotification();
    @GlobalValue(symbol="AVPlayerItemPlaybackStalledNotification", optional=true)
    public static native NSString PlaybackStalledNotification();
    @GlobalValue(symbol="AVPlayerItemNewAccessLogEntryNotification", optional=true)
    public static native NSString NewAccessLogEntryNotification();
    @GlobalValue(symbol="AVPlayerItemNewErrorLogEntryNotification", optional=true)
    public static native NSString NewErrorLogEntryNotification();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="AVPlayerItemRecommendedTimeOffsetFromLiveDidChangeNotification", optional=true)
    public static native NSString RecommendedTimeOffsetFromLiveDidChangeNotification();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="AVPlayerItemMediaSelectionDidChangeNotification", optional=true)
    public static native NSString MediaSelectionDidChangeNotification();
    @GlobalValue(symbol="AVPlayerItemFailedToPlayToEndTimeErrorKey", optional=true)
    protected static native NSString FailedToPlayToEndTimeErrorKey();
    
    @Method(selector = "initWithURL:")
    protected native @Pointer long init(NSURL URL);
    @Method(selector = "initWithAsset:")
    protected native @Pointer long init(AVAsset asset);
    @Method(selector = "initWithAsset:automaticallyLoadedAssetKeys:")
    protected native @Pointer long init(AVAsset asset, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> automaticallyLoadedAssetKeys);
    @Method(selector = "copyWithZone:")
    public native NSObject copyWithZone(NSZone zone);
    @Method(selector = "copy")
    public native NSObject copy();
    @Method(selector = "currentTime")
    public native @ByVal CMTime getCurrentTime();
    @Method(selector = "seekToTime:completionHandler:")
    public native void seekToTime(@ByVal CMTime time, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "seekToTime:toleranceBefore:toleranceAfter:completionHandler:")
    public native void seekToTime(@ByVal CMTime time, @ByVal CMTime toleranceBefore, @ByVal CMTime toleranceAfter, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "cancelPendingSeeks")
    public native void cancelPendingSeeks();
    @Method(selector = "currentDate")
    public native NSDate getCurrentDate();
    @Method(selector = "seekToDate:completionHandler:")
    public native boolean seekToDate(NSDate date, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "stepByCount:")
    public native void stepByCount(@MachineSizedSInt long stepCount);
    @Method(selector = "selectMediaOption:inMediaSelectionGroup:")
    public native void selectMediaOption(AVMediaSelectionOption mediaSelectionOption, AVMediaSelectionGroup mediaSelectionGroup);
    @Method(selector = "selectMediaOptionAutomaticallyInMediaSelectionGroup:")
    public native void selectMediaOptionAutomatically(AVMediaSelectionGroup mediaSelectionGroup);
    @Method(selector = "accessLog")
    public native AVPlayerItemAccessLog getAccessLog();
    @Method(selector = "errorLog")
    public native AVPlayerItemErrorLog getErrorLog();
    @Method(selector = "addOutput:")
    public native void addOutput(AVPlayerItemOutput output);
    @Method(selector = "removeOutput:")
    public native void removeOutput(AVPlayerItemOutput output);
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "addMediaDataCollector:")
    public native void addMediaDataCollector(AVPlayerItemMediaDataCollector collector);
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "removeMediaDataCollector:")
    public native void removeMediaDataCollector(AVPlayerItemMediaDataCollector collector);
    /**
     * @deprecated Deprecated in iOS 11.0. Use -seekToTime:completionHandler:, passing nil for the completionHandler if you don't require notification of completion
     */
    @Deprecated
    @Method(selector = "seekToTime:")
    public native void seekToTime(@ByVal CMTime time);
    /**
     * @deprecated Deprecated in iOS 11.0. Use -seekToTime:toleranceBefore:toleranceAfter:completionHandler:, passing nil for the completionHandler if you don't require notification of completion
     */
    @Deprecated
    @Method(selector = "seekToTime:toleranceBefore:toleranceAfter:")
    public native void seekToTime(@ByVal CMTime time, @ByVal CMTime toleranceBefore, @ByVal CMTime toleranceAfter);
    /**
     * @deprecated Deprecated in iOS 11.0. Use -seekToDate:completionHandler:, passing nil for the completionHandler if you don't require notification of completion
     */
    @Deprecated
    @Method(selector = "seekToDate:")
    public native boolean seekToDate(NSDate date);
    /**
     * @deprecated Deprecated in iOS 11.0. Use currentMediaSelection to obtain an instance of AVMediaSelection, which encompasses the currently selected AVMediaSelectionOption in each of the available AVMediaSelectionGroups
     */
    @Deprecated
    @Method(selector = "selectedMediaOptionInMediaSelectionGroup:")
    public native AVMediaSelectionOption getSelectedMediaOption(AVMediaSelectionGroup mediaSelectionGroup);
    /*</methods>*/
}
