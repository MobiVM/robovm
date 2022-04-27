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
import org.robovm.rt.annotation.WeaklyLinked;

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMoviePlayerController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPMediaPlayback/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeIsPreparedToPlayDidChange(MPMoviePlayerController object, final VoidBlock1<MPMediaPlayback> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(IsPreparedToPlayDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMediaPlayback) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeDurationAvailable(MPMoviePlayerController object, final VoidBlock1<MPMoviePlayerController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DurationAvailableNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeMediaTypesAvailable(MPMoviePlayerController object, final VoidBlock1<MPMoviePlayerController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(MediaTypesAvailableNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeNaturalSizeAvailable(MPMoviePlayerController object, final VoidBlock1<MPMoviePlayerController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(NaturalSizeAvailableNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeDidEnterFullscreen(MPMoviePlayerController object, final VoidBlock1<MPMoviePlayerController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidEnterFullscreenNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeDidExitFullscreen(MPMoviePlayerController object, final VoidBlock1<MPMoviePlayerController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidExitFullscreenNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 5.0 and later.
         */
        public static NSObjectProtocol observeIsAirPlayVideoActiveDidChange(MPMoviePlayerController object, final VoidBlock1<MPMoviePlayerController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(IsAirPlayVideoActiveDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeLoadStateDidChange(MPMoviePlayerController object, final VoidBlock1<MPMoviePlayerController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(LoadStateDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeNowPlayingMovieDidChange(MPMoviePlayerController object, final VoidBlock1<MPMoviePlayerController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(NowPlayingMovieDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject());
                }
            });
        }
        public static NSObjectProtocol observePlaybackDidFinish(MPMoviePlayerController object, final VoidBlock3<MPMoviePlayerController, MPMovieFinishReason, NSError> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(PlaybackDidFinishNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    NSDictionary<?, ?> data = a.getUserInfo();
                    NSNumber val = (NSNumber) data.get(PlaybackDidFinishReasonUserInfoKey());
                    NSError error = (NSError) data.get("error");
                    block.invoke((MPMoviePlayerController) a.getObject(), MPMovieFinishReason.valueOf(val.intValue()), error);
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observePlaybackStateDidChange(MPMoviePlayerController object, final VoidBlock1<MPMoviePlayerController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(PlaybackStateDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeScalingModeDidChange(MPMoviePlayerController object, final VoidBlock1<MPMoviePlayerController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ScalingModeDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeThumbnailImageRequestDidFinish(MPMoviePlayerController object, final VoidBlock2<MPMoviePlayerController, MPMoviePlayerThumbnailRequest> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ThumbnailImageRequestDidFinishNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject(), new MPMoviePlayerThumbnailRequest(a.getUserInfo()));
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeWillEnterFullscreen(MPMoviePlayerController object, final VoidBlock2<MPMoviePlayerController, MPMoviePlayerFullscreenAnimation> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillEnterFullscreenNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject(), new MPMoviePlayerFullscreenAnimation(a.getUserInfo()));
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeWillExitFullscreen(MPMoviePlayerController object, final VoidBlock2<MPMoviePlayerController, MPMoviePlayerFullscreenAnimation> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillExitFullscreenNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject(), new MPMoviePlayerFullscreenAnimation(a.getUserInfo()));
                }
            });
        }
        /**
         * @since Available in iOS 3.2 and later.
         */
        public static NSObjectProtocol observeNewSourceTypeAvailable(MPMoviePlayerController object, final VoidBlock1<MPMoviePlayerController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(SourceTypeAvailableNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 6.0 and later.
         */
        public static NSObjectProtocol observeReadyForDisplayDidChange(MPMoviePlayerController object, final VoidBlock1<MPMoviePlayerController> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ReadyForDisplayDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPMoviePlayerController) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObjectProtocol observeTimedMetadataUpdated(MPMoviePlayerController object, final VoidBlock2<MPMoviePlayerController, NSArray<MPTimedMetadata>> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(TimedMetadataUpdatedNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @SuppressWarnings("unchecked")
                @Override
                public void invoke (NSNotification a) {
                    NSDictionary<?, ?> userInfo = a.getUserInfo();
                    NSArray<MPTimedMetadata> arr = (NSArray<MPTimedMetadata>) userInfo.get(TimedMetadataUserInfoKey());
                    block.invoke((MPMoviePlayerController) a.getObject(), arr);
                }
            });
        }
    }
    
    /*<ptr>*/public static class MPMoviePlayerControllerPtr extends Ptr<MPMoviePlayerController, MPMoviePlayerControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMoviePlayerController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPMoviePlayerController() {}
    protected MPMoviePlayerController(Handle h, long handle) { super(h, handle); }
    protected MPMoviePlayerController(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Method(selector = "initWithContentURL:")
    public MPMoviePlayerController(NSURL url) { super((SkipInit) null); initObject(init(url)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "contentURL")
    public native NSURL getContentURL();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "setContentURL:")
    public native void setContentURL(NSURL v);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "view")
    public native UIView getView();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "backgroundView")
    public native UIView getBackgroundView();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "playbackState")
    public native MPMoviePlaybackState getPlaybackState();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "loadState")
    public native MPMovieLoadState getLoadState();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "controlStyle")
    public native MPMovieControlStyle getControlStyle();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "setControlStyle:")
    public native void setControlStyle(MPMovieControlStyle v);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "repeatMode")
    public native MPMovieRepeatMode getRepeatMode();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "setRepeatMode:")
    public native void setRepeatMode(MPMovieRepeatMode v);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "shouldAutoplay")
    public native boolean shouldAutoplay();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "setShouldAutoplay:")
    public native void setShouldAutoplay(boolean v);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "isFullscreen")
    public native boolean isFullscreen();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "setFullscreen:")
    public native void setFullscreen(boolean v);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "scalingMode")
    public native MPMovieScalingMode getScalingMode();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "setScalingMode:")
    public native void setScalingMode(MPMovieScalingMode v);
    @Property(selector = "readyForDisplay")
    public native boolean isReadyForDisplay();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "movieMediaTypes")
    public native MPMovieMediaTypeMask getMovieMediaTypes();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "movieSourceType")
    public native MPMovieSourceType getMovieSourceType();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "setMovieSourceType:")
    public native void setMovieSourceType(MPMovieSourceType v);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "duration")
    public native double getDuration();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "playableDuration")
    public native double getPlayableDuration();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "naturalSize")
    public native @ByVal CGSize getNaturalSize();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "initialPlaybackTime")
    public native double getInitialPlaybackTime();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "setInitialPlaybackTime:")
    public native void setInitialPlaybackTime(double v);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "endPlaybackTime")
    public native double getEndPlaybackTime();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "setEndPlaybackTime:")
    public native void setEndPlaybackTime(double v);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "allowsAirPlay")
    public native boolean allowsAirPlay();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "setAllowsAirPlay:")
    public native void setAllowsAirPlay(boolean v);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "isAirPlayVideoActive")
    public native boolean isAirPlayVideoActive();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit.
     */
    @Deprecated
    @Property(selector = "timedMetadata")
    public native NSArray<MPTimedMetadata> getTimedMetadata();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVFoundation.
     */
    @Deprecated
    @Property(selector = "accessLog")
    public native MPMovieAccessLog getAccessLog();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVFoundation.
     */
    @Deprecated
    @Property(selector = "errorLog")
    public native MPMovieErrorLog getErrorLog();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit.
     */
    @Deprecated
    @Property(selector = "useApplicationAudioSession")
    public native boolean usesApplicationAudioSession();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit.
     */
    @Deprecated
    @Property(selector = "setUseApplicationAudioSession:")
    public native void setUsesApplicationAudioSession(boolean v);
    @Property(selector = "isPreparedToPlay")
    public native boolean isPreparedToPlay();
    @Property(selector = "currentPlaybackTime")
    public native double getCurrentPlaybackTime();
    @Property(selector = "setCurrentPlaybackTime:")
    public native void setCurrentPlaybackTime(double v);
    @Property(selector = "currentPlaybackRate")
    public native float getCurrentPlaybackRate();
    @Property(selector = "setCurrentPlaybackRate:")
    public native void setCurrentPlaybackRate(float v);
    /*</properties>*/
    
    /* iAd extensions */
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void playPrerollAd(@Block VoidBlock1<NSError> completionHandler) {
        org.robovm.apple.iad.MPMoviePlayerControllerExtensions.playPrerollAd(this, completionHandler);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void preparePrerollAds() {
        org.robovm.apple.iad.MPMoviePlayerControllerExtensions.preparePrerollAds();
    }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @WeaklyLinked
    public void cancelPreroll() {
        org.robovm.apple.iad.MPMoviePlayerControllerExtensions.cancelPreroll(this);
    }
    
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalValue(symbol="MPMediaPlaybackIsPreparedToPlayDidChangeNotification", optional=true)
    public static native NSString IsPreparedToPlayDidChangeNotification();
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerScalingModeDidChangeNotification", optional=true)
    public static native NSString ScalingModeDidChangeNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerPlaybackDidFinishNotification", optional=true)
    public static native NSString PlaybackDidFinishNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerPlaybackDidFinishReasonUserInfoKey", optional=true)
    protected static native NSString PlaybackDidFinishReasonUserInfoKey();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerPlaybackStateDidChangeNotification", optional=true)
    public static native NSString PlaybackStateDidChangeNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerLoadStateDidChangeNotification", optional=true)
    public static native NSString LoadStateDidChangeNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerNowPlayingMovieDidChangeNotification", optional=true)
    public static native NSString NowPlayingMovieDidChangeNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerWillEnterFullscreenNotification", optional=true)
    public static native NSString WillEnterFullscreenNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerDidEnterFullscreenNotification", optional=true)
    public static native NSString DidEnterFullscreenNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerWillExitFullscreenNotification", optional=true)
    public static native NSString WillExitFullscreenNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerDidExitFullscreenNotification", optional=true)
    public static native NSString DidExitFullscreenNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerIsAirPlayVideoActiveDidChangeNotification", optional=true)
    public static native NSString IsAirPlayVideoActiveDidChangeNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit.
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerReadyForDisplayDidChangeNotification", optional=true)
    public static native NSString ReadyForDisplayDidChangeNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMovieMediaTypesAvailableNotification", optional=true)
    public static native NSString MediaTypesAvailableNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMovieSourceTypeAvailableNotification", optional=true)
    public static native NSString SourceTypeAvailableNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMovieDurationAvailableNotification", optional=true)
    public static native NSString DurationAvailableNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMovieNaturalSizeAvailableNotification", optional=true)
    public static native NSString NaturalSizeAvailableNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerThumbnailImageRequestDidFinishNotification", optional=true)
    public static native NSString ThumbnailImageRequestDidFinishNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVFoundation.
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerTimedMetadataUpdatedNotification", optional=true)
    public static native NSString TimedMetadataUpdatedNotification();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVFoundation.
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerTimedMetadataUserInfoKey", optional=true)
    protected static native NSString TimedMetadataUserInfoKey();
    
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Method(selector = "initWithContentURL:")
    protected native @Pointer long init(NSURL url);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Method(selector = "setFullscreen:animated:")
    public native void setFullscreen(boolean fullscreen, boolean animated);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Method(selector = "thumbnailImageAtTime:timeOption:")
    public native UIImage getThumbnailImage(double playbackTime, MPMovieTimeOption option);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Method(selector = "requestThumbnailImagesAtTimes:timeOption:")
    public native void requestThumbnailImages(NSArray<NSNumber> playbackTimes, MPMovieTimeOption option);
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Method(selector = "cancelAllThumbnailImageRequests")
    public native void cancelAllThumbnailImageRequests();
    @Method(selector = "prepareToPlay")
    public native void prepareToPlay();
    @Method(selector = "play")
    public native void play();
    @Method(selector = "pause")
    public native void pause();
    @Method(selector = "stop")
    public native void stop();
    @Method(selector = "beginSeekingForward")
    public native void beginSeekingForward();
    @Method(selector = "beginSeekingBackward")
    public native void beginSeekingBackward();
    @Method(selector = "endSeeking")
    public native void endSeeking();
    /*</methods>*/
}
