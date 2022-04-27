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
package org.robovm.apple.avkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.iad.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPictureInPictureControllerContentSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPictureInPictureControllerContentSourcePtr extends Ptr<AVPictureInPictureControllerContentSource, AVPictureInPictureControllerContentSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPictureInPictureControllerContentSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVPictureInPictureControllerContentSource() {}
    protected AVPictureInPictureControllerContentSource(Handle h, long handle) { super(h, handle); }
    protected AVPictureInPictureControllerContentSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlayerLayer:")
    public AVPictureInPictureControllerContentSource(AVPlayerLayer playerLayer) { super((SkipInit) null); initObject(init(playerLayer)); }
    @Method(selector = "initWithSampleBufferDisplayLayer:playbackDelegate:")
    public AVPictureInPictureControllerContentSource(AVSampleBufferDisplayLayer sampleBufferDisplayLayer, AVPictureInPictureSampleBufferPlaybackDelegate playbackDelegate) { super((SkipInit) null); initObject(init(sampleBufferDisplayLayer, playbackDelegate)); }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithActiveVideoCallSourceView:contentViewController:")
    public AVPictureInPictureControllerContentSource(UIView sourceView, AVPictureInPictureVideoCallViewController contentViewController) { super((SkipInit) null); initObject(init(sourceView, contentViewController)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "playerLayer")
    public native AVPlayerLayer getPlayerLayer();
    @Property(selector = "sampleBufferDisplayLayer")
    public native AVSampleBufferDisplayLayer getSampleBufferDisplayLayer();
    @Property(selector = "sampleBufferPlaybackDelegate")
    public native AVPictureInPictureSampleBufferPlaybackDelegate getSampleBufferPlaybackDelegate();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "activeVideoCallSourceView")
    public native UIView getActiveVideoCallSourceView();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "activeVideoCallContentViewController")
    public native AVPictureInPictureVideoCallViewController getActiveVideoCallContentViewController();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlayerLayer:")
    protected native @Pointer long init(AVPlayerLayer playerLayer);
    @Method(selector = "initWithSampleBufferDisplayLayer:playbackDelegate:")
    protected native @Pointer long init(AVSampleBufferDisplayLayer sampleBufferDisplayLayer, AVPictureInPictureSampleBufferPlaybackDelegate playbackDelegate);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithActiveVideoCallSourceView:contentViewController:")
    protected native @Pointer long init(UIView sourceView, AVPictureInPictureVideoCallViewController contentViewController);
    /*</methods>*/
}
