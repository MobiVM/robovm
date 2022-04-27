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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPictureInPictureController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPictureInPictureControllerPtr extends Ptr<AVPictureInPictureController, AVPictureInPictureControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPictureInPictureController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVPictureInPictureController() {}
    protected AVPictureInPictureController(Handle h, long handle) { super(h, handle); }
    protected AVPictureInPictureController(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithContentSource:")
    public AVPictureInPictureController(AVPictureInPictureControllerContentSource contentSource) { super((SkipInit) null); initObject(init(contentSource)); }
    @Method(selector = "initWithPlayerLayer:")
    public AVPictureInPictureController(AVPlayerLayer playerLayer) { super((SkipInit) null); initObject(init(playerLayer)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "pictureInPictureButtonStartImage")
    public static native UIImage getPictureInPictureButtonStartImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "pictureInPictureButtonStopImage")
    public static native UIImage getPictureInPictureButtonStopImage();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "contentSource")
    public native AVPictureInPictureControllerContentSource getContentSource();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setContentSource:")
    public native void setContentSource(AVPictureInPictureControllerContentSource v);
    @Property(selector = "playerLayer")
    public native AVPlayerLayer getPlayerLayer();
    @Property(selector = "delegate")
    public native AVPictureInPictureControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(AVPictureInPictureControllerDelegate v);
    @Property(selector = "isPictureInPicturePossible")
    public native boolean isPictureInPicturePossible();
    @Property(selector = "isPictureInPictureActive")
    public native boolean isPictureInPictureActive();
    @Property(selector = "isPictureInPictureSuspended")
    public native boolean isPictureInPictureSuspended();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "requiresLinearPlayback")
    public native boolean requiresLinearPlayback();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setRequiresLinearPlayback:")
    public native void setRequiresLinearPlayback(boolean v);
    /**
     * @since Available in iOS 14.2 and later.
     */
    @Property(selector = "canStartPictureInPictureAutomaticallyFromInline")
    public native boolean canStartPictureInPictureAutomaticallyFromInline();
    /**
     * @since Available in iOS 14.2 and later.
     */
    @Property(selector = "setCanStartPictureInPictureAutomaticallyFromInline:")
    public native void setCanStartPictureInPictureAutomaticallyFromInline(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithContentSource:")
    protected native @Pointer long init(AVPictureInPictureControllerContentSource contentSource);
    @Method(selector = "initWithPlayerLayer:")
    protected native @Pointer long init(AVPlayerLayer playerLayer);
    @Method(selector = "startPictureInPicture")
    public native void startPictureInPicture();
    @Method(selector = "stopPictureInPicture")
    public native void stopPictureInPicture();
    @Method(selector = "isPictureInPictureSupported")
    public static native boolean isPictureInPictureSupported();
    @Method(selector = "pictureInPictureButtonStartImageCompatibleWithTraitCollection:")
    public static native UIImage getPictureInPictureButtonStartImage(UITraitCollection traitCollection);
    @Method(selector = "pictureInPictureButtonStopImageCompatibleWithTraitCollection:")
    public static native UIImage getPictureInPictureButtonStopImage(UITraitCollection traitCollection);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "invalidatePlaybackState")
    public native void invalidatePlaybackState();
    /*</methods>*/
}
