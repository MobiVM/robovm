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
/*<annotations>*/@Library("AVFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVFoundation/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(AVFoundation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVAudioSessionSpatialAudioEnabledKey", optional=true)
    public static native String Value__AVAudioSessionSpatialAudioEnabledKey();
    @GlobalValue(symbol="AVCoreAnimationBeginTimeAtZero", optional=true)
    public static native double CoreAnimationBeginTimeAtZero();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVVideoRangeSDR", optional=true)
    public static native String Value__AVVideoRangeSDR();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVVideoRangeHLG", optional=true)
    public static native String Value__AVVideoRangeHLG();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVVideoRangePQ", optional=true)
    public static native String Value__AVVideoRangePQ();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="AVMovieShouldSupportAliasDataReferencesKey", optional=true)
    public static native String Value__AVMovieShouldSupportAliasDataReferencesKey();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVPlayerRateDidChangeReasonKey", optional=true)
    public static native String Value__AVPlayerRateDidChangeReasonKey();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVPlayerRateDidChangeOriginatingParticipantKey", optional=true)
    public static native String Value__AVPlayerRateDidChangeOriginatingParticipantKey();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVPlayerRateDidChangeReasonSetRateCalled", optional=true)
    public static native String Value__AVPlayerRateDidChangeReasonSetRateCalled();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVPlayerRateDidChangeReasonSetRateFailed", optional=true)
    public static native String Value__AVPlayerRateDidChangeReasonSetRateFailed();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVPlayerRateDidChangeReasonAudioSessionInterrupted", optional=true)
    public static native String Value__AVPlayerRateDidChangeReasonAudioSessionInterrupted();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVPlayerRateDidChangeReasonAppBackgrounded", optional=true)
    public static native String Value__AVPlayerRateDidChangeReasonAppBackgrounded();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVCoordinatedPlaybackSuspensionReasonAudioSessionInterrupted", optional=true)
    public static native String Value__AVCoordinatedPlaybackSuspensionReasonAudioSessionInterrupted();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVCoordinatedPlaybackSuspensionReasonStallRecovery", optional=true)
    public static native String Value__AVCoordinatedPlaybackSuspensionReasonStallRecovery();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVCoordinatedPlaybackSuspensionReasonPlayingInterstitial", optional=true)
    public static native String Value__AVCoordinatedPlaybackSuspensionReasonPlayingInterstitial();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVCoordinatedPlaybackSuspensionReasonCoordinatedPlaybackNotPossible", optional=true)
    public static native String Value__AVCoordinatedPlaybackSuspensionReasonCoordinatedPlaybackNotPossible();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVCoordinatedPlaybackSuspensionReasonUserActionRequired", optional=true)
    public static native String Value__AVCoordinatedPlaybackSuspensionReasonUserActionRequired();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVCoordinatedPlaybackSuspensionReasonUserIsChangingCurrentTime", optional=true)
    public static native String Value__AVCoordinatedPlaybackSuspensionReasonUserIsChangingCurrentTime();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVPlaybackCoordinatorOtherParticipantsDidChangeNotification", optional=true)
    public static native String Value__AVPlaybackCoordinatorOtherParticipantsDidChangeNotification();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVPlaybackCoordinatorSuspensionReasonsDidChangeNotification", optional=true)
    public static native String Value__AVPlaybackCoordinatorSuspensionReasonsDidChangeNotification();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVPlayerItemTimeJumpedOriginatingParticipantKey", optional=true)
    public static native String Value__AVPlayerItemTimeJumpedOriginatingParticipantKey();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="AVSampleBufferAudioRendererOutputConfigurationDidChangeNotification", optional=true)
    public static native String Value__AVSampleBufferAudioRendererOutputConfigurationDidChangeNotification();
    
    @Bridge(symbol="AVMakeRectWithAspectRatioInsideRect", optional=true)
    public static native @ByVal CGRect createRectWithAspectRatioInsideRect(@ByVal CGSize aspectRatio, @ByVal CGRect boundingRect);
    /*</methods>*/
}
