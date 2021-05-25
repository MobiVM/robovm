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
/*<annotations>*/@Library("AVFoundation") @NativeClass @WeaklyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSampleBufferDisplayLayer/*</name>*/ 
    extends /*<extends>*/CALayer/*</extends>*/ 
    /*<implements>*/implements AVQueuedSampleBufferRendering/*</implements>*/ {
    
    public static class Notifications {
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeFailedToDecode(AVSampleBufferDisplayLayer object, final VoidBlock2<AVSampleBufferDisplayLayer, NSError> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(FailedToDecodeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> data = a.getUserInfo();
                    NSError error = null;
                    if (data.containsKey(FailedToDecodeNotificationErrorKey())) {
                        error = (NSError) data.get(FailedToDecodeNotificationErrorKey());
                    }
                    block.invoke((AVSampleBufferDisplayLayer)a.getObject(), error);
                }
            });
        }
    }

    /*<ptr>*/public static class AVSampleBufferDisplayLayerPtr extends Ptr<AVSampleBufferDisplayLayer, AVSampleBufferDisplayLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSampleBufferDisplayLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVSampleBufferDisplayLayer() {}
    protected AVSampleBufferDisplayLayer(Handle h, long handle) { super(h, handle); }
    protected AVSampleBufferDisplayLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLayer:")
    public AVSampleBufferDisplayLayer(CALayer layer) { super(layer); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "controlTimebase")
    public native CMTimebase getControlTimebase();
    @Property(selector = "setControlTimebase:")
    public native void setControlTimebase(CMTimebase v);
    @Property(selector = "videoGravity")
    public native AVLayerVideoGravity getVideoGravity();
    @Property(selector = "setVideoGravity:")
    public native void setVideoGravity(AVLayerVideoGravity v);
    @Property(selector = "status")
    public native AVQueuedSampleBufferRenderingStatus getStatus();
    @Property(selector = "error")
    public native NSError getError();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "requiresFlushToResumeDecoding")
    public native boolean requiresFlushToResumeDecoding();
    @Property(selector = "isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "preventsCapture")
    public native boolean isPreventsCapture();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setPreventsCapture:")
    public native void setPreventsCapture(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "preventsDisplaySleepDuringVideoPlayback")
    public native boolean isPreventsDisplaySleepDuringVideoPlayback();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setPreventsDisplaySleepDuringVideoPlayback:")
    public native void setPreventsDisplaySleepDuringVideoPlayback(boolean v);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "outputObscuredDueToInsufficientExternalProtection")
    public native boolean isOutputObscuredDueToInsufficientExternalProtection();
    @Property(selector = "timebase")
    public native CMTimebase getTimebase();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "hasSufficientMediaDataForReliablePlaybackStart")
    public native boolean hasSufficientMediaDataForReliablePlaybackStart();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="AVSampleBufferDisplayLayerFailedToDecodeNotification", optional=true)
    public static native NSString FailedToDecodeNotification();
    @GlobalValue(symbol="AVSampleBufferDisplayLayerFailedToDecodeNotificationErrorKey", optional=true)
    protected static native NSString FailedToDecodeNotificationErrorKey();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="AVSampleBufferDisplayLayerRequiresFlushToResumeDecodingDidChangeNotification", optional=true)
    public static native NSString RequiresFlushToResumeDecodingDidChangeNotification();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @GlobalValue(symbol="AVSampleBufferDisplayLayerOutputObscuredDueToInsufficientExternalProtectionDidChangeNotification", optional=true)
    public static native NSString OutputObscuredDueToInsufficientExternalProtectionDidChangeNotification();
    
    @Method(selector = "defaultValueForKey:")
    public static native NSObject getDefaultValue(String key);
    @Method(selector = "needsDisplayForKey:")
    public static native boolean needsDisplay(String key);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cornerCurveExpansionFactor:")
    public static native @MachineSizedFloat double cornerCurveExpansionFactor(CALayerCornerCurve curve);
    @Method(selector = "defaultActionForKey:")
    public static native CAAction getDefaultAction(String event);
    @Method(selector = "enqueueSampleBuffer:")
    public native void enqueueSampleBuffer(CMSampleBuffer sampleBuffer);
    @Method(selector = "flush")
    public native void flush();
    @Method(selector = "flushAndRemoveImage")
    public native void flushAndRemoveImage();
    @WeaklyLinked
    @Method(selector = "requestMediaDataWhenReadyOnQueue:usingBlock:")
    public native void requestMediaDataWhenReadyOnQueue(DispatchQueue queue, @Block Runnable block);
    @Method(selector = "stopRequestingMediaData")
    public native void stopRequestingMediaData();
    /*</methods>*/
}
