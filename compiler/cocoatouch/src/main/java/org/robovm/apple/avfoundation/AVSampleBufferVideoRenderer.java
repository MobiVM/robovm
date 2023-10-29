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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSampleBufferVideoRenderer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements AVQueuedSampleBufferRendering/*</implements>*/ {

    /*<ptr>*/public static class AVSampleBufferVideoRendererPtr extends Ptr<AVSampleBufferVideoRenderer, AVSampleBufferVideoRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSampleBufferVideoRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVSampleBufferVideoRenderer() {}
    protected AVSampleBufferVideoRenderer(Handle h, long handle) { super(h, handle); }
    protected AVSampleBufferVideoRenderer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "status")
    public native AVQueuedSampleBufferRenderingStatus getStatus();
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "requiresFlushToResumeDecoding")
    public native boolean requiresFlushToResumeDecoding();
    @Property(selector = "timebase")
    public native CMTimebase getTimebase();
    @Property(selector = "isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "hasSufficientMediaDataForReliablePlaybackStart")
    public native boolean hasSufficientMediaDataForReliablePlaybackStart();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("AVFoundation")
    public static class Keys {
        static { Bro.bind(Keys.class); }

        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVSampleBufferVideoRendererDidFailToDecodeNotificationErrorKey", optional=true)
        public static native NSString DidFailToDecodeNotificationError();
    }

    @Library("AVFoundation")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVSampleBufferVideoRendererDidFailToDecodeNotification", optional=true)
        public static native NSString DidFailToDecode();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="AVSampleBufferVideoRendererRequiresFlushToResumeDecodingDidChangeNotification", optional=true)
        public static native NSString RequiresFlushToResumeDecodingDidChange();
    }
    
    @Method(selector = "flushWithRemovalOfDisplayedImage:completionHandler:")
    public native void flush(boolean removeDisplayedImage, @Block Runnable handler);
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
