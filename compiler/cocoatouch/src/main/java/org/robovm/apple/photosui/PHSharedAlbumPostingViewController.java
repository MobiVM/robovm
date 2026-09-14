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
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PhotosUI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHSharedAlbumPostingViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHSharedAlbumPostingViewControllerPtr extends Ptr<PHSharedAlbumPostingViewController, PHSharedAlbumPostingViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHSharedAlbumPostingViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHSharedAlbumPostingViewController() {}
    protected PHSharedAlbumPostingViewController(Handle h, long handle) { super(h, handle); }
    protected PHSharedAlbumPostingViewController(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "initWithItems:defaultAlbumIdentifier:photoLibrary:")
    public PHSharedAlbumPostingViewController(NSArray<PHPickerResult> items, String defaultAlbumIdentifier, PHPhotoLibrary photoLibrary) { super((SkipInit) null); initObject(init(items, defaultAlbumIdentifier, photoLibrary)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "delegate")
    public native PHSharedAlbumPostingViewControllerDelegate getDelegate();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PHSharedAlbumPostingViewControllerDelegate v);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "albumIdentifier")
    public native String getAlbumIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "initWithItems:defaultAlbumIdentifier:photoLibrary:")
    protected native @Pointer long init(NSArray<PHPickerResult> items, String defaultAlbumIdentifier, PHPhotoLibrary photoLibrary);
    /*</methods>*/
}
