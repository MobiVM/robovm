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
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSampleBufferAudioRenderer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements AVQueuedSampleBufferRendering/*</implements>*/ {

    /*<ptr>*/public static class AVSampleBufferAudioRendererPtr extends Ptr<AVSampleBufferAudioRenderer, AVSampleBufferAudioRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSampleBufferAudioRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVSampleBufferAudioRenderer() {}
    protected AVSampleBufferAudioRenderer(Handle h, long handle) { super(h, handle); }
    protected AVSampleBufferAudioRenderer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "status")
    public native AVQueuedSampleBufferRenderingStatus getStatus();
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "audioTimePitchAlgorithm")
    public native String getAudioTimePitchAlgorithm();
    @Property(selector = "setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(String v);
    @Property(selector = "volume")
    public native float getVolume();
    @Property(selector = "setVolume:")
    public native void setVolume(float v);
    @Property(selector = "isMuted")
    public native boolean isMuted();
    @Property(selector = "setMuted:")
    public native void setMuted(boolean v);
    @Property(selector = "timebase")
    public native CMTimebase getTimebase();
    @Property(selector = "isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVSampleBufferAudioRendererWasFlushedAutomaticallyNotification", optional=true)
    public static native String WasFlushedAutomaticallyNotification();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVSampleBufferAudioRendererFlushTimeKey", optional=true)
    public static native String FlushTimeKey();
    
    @Method(selector = "flushFromSourceTime:completionHandler:")
    public native void flushFromSourceTime(@ByVal CMTime time, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "enqueueSampleBuffer:")
    public native void enqueueSampleBuffer(CMSampleBuffer sampleBuffer);
    @Method(selector = "flush")
    public native void flush();
    @Method(selector = "requestMediaDataWhenReadyOnQueue:usingBlock:")
    public native void requestMediaDataWhenReadyOnQueue(DispatchQueue queue, @Block Runnable block);
    @Method(selector = "stopRequestingMediaData")
    public native void stopRequestingMediaData();
    /*</methods>*/
}
