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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSpeechSynthesizer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVSpeechSynthesizerPtr extends Ptr<AVSpeechSynthesizer, AVSpeechSynthesizerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSpeechSynthesizer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVSpeechSynthesizer() {}
    protected AVSpeechSynthesizer(Handle h, long handle) { super(h, handle); }
    protected AVSpeechSynthesizer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native AVSpeechSynthesizerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(AVSpeechSynthesizerDelegate v);
    @Property(selector = "isSpeaking")
    public native boolean isSpeaking();
    @Property(selector = "isPaused")
    public native boolean isPaused();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "outputChannels")
    public native NSArray<AVAudioSessionChannelDescription> getOutputChannels();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setOutputChannels:")
    public native void setOutputChannels(NSArray<AVAudioSessionChannelDescription> v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "usesApplicationAudioSession")
    public native boolean usesApplicationAudioSession();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setUsesApplicationAudioSession:")
    public native void setUsesApplicationAudioSession(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "mixToTelephonyUplink")
    public native boolean isMixToTelephonyUplink();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setMixToTelephonyUplink:")
    public native void setMixToTelephonyUplink(boolean v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "personalVoiceAuthorizationStatus")
    public static native AVSpeechSynthesisPersonalVoiceAuthorizationStatus getPersonalVoiceAuthorizationStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "speakUtterance:")
    public native void enqueueSpeakUtterance(AVSpeechUtterance utterance);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "writeUtterance:toBufferCallback:")
    public native void writeUtterance(AVSpeechUtterance utterance, @Block VoidBlock1<AVAudioBuffer> bufferCallback);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "writeUtterance:toBufferCallback:toMarkerCallback:")
    public native void writeUtterance(AVSpeechUtterance utterance, @Block VoidBlock1<AVAudioBuffer> bufferCallback, @Block VoidBlock1<NSArray<AVSpeechSynthesisMarker>> markerCallback);
    @Method(selector = "stopSpeakingAtBoundary:")
    public native boolean stopSpeaking(AVSpeechBoundary boundary);
    @Method(selector = "pauseSpeakingAtBoundary:")
    public native boolean pauseSpeaking(AVSpeechBoundary boundary);
    @Method(selector = "continueSpeaking")
    public native boolean continueSpeaking();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "requestPersonalVoiceAuthorizationWithCompletionHandler:")
    public static native void requestPersonalVoiceAuthorization(@Block VoidBlock1<AVSpeechSynthesisPersonalVoiceAuthorizationStatus> handler);
    /*</methods>*/
}
