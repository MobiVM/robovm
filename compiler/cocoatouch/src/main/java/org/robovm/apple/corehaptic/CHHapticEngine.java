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
package org.robovm.apple.corehaptic;

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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreHaptics") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CHHapticEngine/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CHHapticEnginePtr extends Ptr<CHHapticEngine, CHHapticEnginePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CHHapticEngine.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CHHapticEngine(Handle h, long handle) { super(h, handle); }
    protected CHHapticEngine(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initAndReturnError:")
    public CHHapticEngine() throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    @Method(selector = "initWithAudioSession:error:")
    public CHHapticEngine(AVAudioSession audioSession) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(audioSession, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "currentTime")
    public native double getCurrentTime();
    @Property(selector = "stoppedHandler")
    public native @Block VoidBlock1<CHHapticEngineStoppedReason> getStoppedHandler();
    @Property(selector = "setStoppedHandler:")
    public native void setStoppedHandler(@Block VoidBlock1<CHHapticEngineStoppedReason> v);
    @Property(selector = "resetHandler")
    public native @Block Runnable getResetHandler();
    @Property(selector = "setResetHandler:")
    public native void setResetHandler(@Block Runnable v);
    @Property(selector = "playsHapticsOnly")
    public native boolean isPlaysHapticsOnly();
    @Property(selector = "setPlaysHapticsOnly:")
    public native void setPlaysHapticsOnly(boolean v);
    @Property(selector = "isMutedForAudio")
    public native boolean isMutedForAudio();
    @Property(selector = "setIsMutedForAudio:")
    public native void setIsMutedForAudio(boolean v);
    @Property(selector = "isMutedForHaptics")
    public native boolean isMutedForHaptics();
    @Property(selector = "setIsMutedForHaptics:")
    public native void setIsMutedForHaptics(boolean v);
    @Property(selector = "isAutoShutdownEnabled")
    public native boolean isAutoShutdownEnabled();
    @Property(selector = "setAutoShutdownEnabled:")
    public native void setAutoShutdownEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("CoreHaptics")
    public static class AudioResourceKeys {
        static { Bro.bind(AudioResourceKeys.class); }

        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="CHHapticAudioResourceKeyUseVolumeEnvelope", optional=true)
        public static native String UseVolumeEnvelope();
    }
    
    @Method(selector = "initAndReturnError:")
    private native @Pointer long init(NSError.NSErrorPtr error);
    @Method(selector = "initWithAudioSession:error:")
    private native @Pointer long init(AVAudioSession audioSession, NSError.NSErrorPtr error);
    @Method(selector = "startWithCompletionHandler:")
    public native void start(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "startAndReturnError:")
    public native boolean startAndReturnError(NSError.NSErrorPtr outError);
    @Method(selector = "stopWithCompletionHandler:")
    public native void stop(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "notifyWhenPlayersFinished:")
    public native void notifyWhenPlayersFinished(@Block Block1<NSError, CHHapticEngineFinishedAction> finishedHandler);
    public CHHapticPatternPlayer createPlayer(CHHapticPattern pattern) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       CHHapticPatternPlayer result = createPlayer(pattern, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "createPlayerWithPattern:error:")
    private native CHHapticPatternPlayer createPlayer(CHHapticPattern pattern, NSError.NSErrorPtr outError);
    public CHHapticAdvancedPatternPlayer createAdvancedPlayer(CHHapticPattern pattern) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       CHHapticAdvancedPatternPlayer result = createAdvancedPlayer(pattern, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "createAdvancedPlayerWithPattern:error:")
    private native CHHapticAdvancedPatternPlayer createAdvancedPlayer(CHHapticPattern pattern, NSError.NSErrorPtr outError);
    public @MachineSizedUInt long registerAudioResource(NSURL resourceURL, NSDictionary<?, ?> options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long result = registerAudioResource(resourceURL, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "registerAudioResource:options:error:")
    private native @MachineSizedUInt long registerAudioResource(NSURL resourceURL, NSDictionary<?, ?> options, NSError.NSErrorPtr outError);
    public boolean unregisterAudioResource(@MachineSizedUInt long resourceID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = unregisterAudioResource(resourceID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "unregisterAudioResource:error:")
    private native boolean unregisterAudioResource(@MachineSizedUInt long resourceID, NSError.NSErrorPtr outError);
    public boolean playPattern(NSURL fileURL) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = playPattern(fileURL, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "playPatternFromURL:error:")
    private native boolean playPattern(NSURL fileURL, NSError.NSErrorPtr outError);
    public boolean playPattern(NSData data) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = playPattern(data, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "playPatternFromData:error:")
    private native boolean playPattern(NSData data, NSError.NSErrorPtr outError);
    @Method(selector = "capabilitiesForHardware")
    public static native CHHapticDeviceCapability capabilitiesForHardware();
    /*</methods>*/
}
