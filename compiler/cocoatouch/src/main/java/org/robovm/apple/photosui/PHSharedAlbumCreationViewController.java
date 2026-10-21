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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHSharedAlbumCreationViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHSharedAlbumCreationViewControllerPtr extends Ptr<PHSharedAlbumCreationViewController, PHSharedAlbumCreationViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHSharedAlbumCreationViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHSharedAlbumCreationViewController() {}
    protected PHSharedAlbumCreationViewController(Handle h, long handle) { super(h, handle); }
    protected PHSharedAlbumCreationViewController(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "initWithConfiguration:")
    public PHSharedAlbumCreationViewController(PHSharedAlbumCreationConfiguration configuration) { super((SkipInit) null); initObject(init(configuration)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "delegate")
    public native PHSharedAlbumCreationViewControllerDelegate getDelegate();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PHSharedAlbumCreationViewControllerDelegate v);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "creationResult")
    public native PHSharedAlbumCreationResult getCreationResult();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "initWithConfiguration:")
    protected native @Pointer long init(PHSharedAlbumCreationConfiguration configuration);
    /*</methods>*/
}
