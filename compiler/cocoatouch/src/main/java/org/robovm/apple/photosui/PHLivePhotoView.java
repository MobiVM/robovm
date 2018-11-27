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
package org.robovm.apple.photosui;

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
import org.robovm.apple.photos.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PhotosUI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHLivePhotoView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHLivePhotoViewPtr extends Ptr<PHLivePhotoView, PHLivePhotoViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHLivePhotoView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHLivePhotoView() {}
    protected PHLivePhotoView(Handle h, long handle) { super(h, handle); }
    protected PHLivePhotoView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public PHLivePhotoView(@ByVal org.robovm.apple.coregraphics.CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public PHLivePhotoView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native PHLivePhotoViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PHLivePhotoViewDelegate v);
    @Property(selector = "livePhoto")
    public native PHLivePhoto getLivePhoto();
    @Property(selector = "setLivePhoto:")
    public native void setLivePhoto(PHLivePhoto v);
    @Property(selector = "isMuted")
    public native boolean isMuted();
    @Property(selector = "setMuted:")
    public native void setMuted(boolean v);
    @Property(selector = "playbackGestureRecognizer")
    public native UIGestureRecognizer getPlaybackGestureRecognizer();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startPlaybackWithStyle:")
    public native void startPlayback(PHLivePhotoViewPlaybackStyle playbackStyle);
    @Method(selector = "stopPlayback")
    public native void stopPlayback();
    @Method(selector = "livePhotoBadgeImageWithOptions:")
    public static native UIImage createLivePhotoBadgeImage(PHLivePhotoBadgeOptions badgeOptions);
    /*</methods>*/
}
