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
import org.robovm.apple.coreanimation.*;
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
    public PHLivePhotoView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "delegate")
    public native PHLivePhotoViewDelegate getDelegate();
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PHLivePhotoViewDelegate v);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "livePhoto")
    public native PHLivePhoto getLivePhoto();
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "setLivePhoto:")
    public native void setLivePhoto(PHLivePhoto v);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "isMuted")
    public native boolean isMuted();
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "setMuted:")
    public native void setMuted(boolean v);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "playbackGestureRecognizer")
    public native UIGestureRecognizer getPlaybackGestureRecognizer();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Method(selector = "startPlaybackWithStyle:")
    public native void startPlayback(PHLivePhotoViewPlaybackStyle playbackStyle);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Method(selector = "stopPlayback")
    public native void stopPlayback();
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Method(selector = "livePhotoBadgeImageWithOptions:")
    public static native UIImage createLivePhotoBadgeImage(PHLivePhotoBadgeOptions badgeOptions);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
