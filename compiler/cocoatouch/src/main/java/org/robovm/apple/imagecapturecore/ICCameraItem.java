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
package org.robovm.apple.imagecapturecore;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ImageCaptureCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ICCameraItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ICCameraItemPtr extends Ptr<ICCameraItem, ICCameraItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ICCameraItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ICCameraItem() {}
    protected ICCameraItem(Handle h, long handle) { super(h, handle); }
    protected ICCameraItem(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "device")
    public native ICCameraDevice getDevice();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "parentFolder")
    public native ICCameraFolder getParentFolder();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "UTI")
    public native String getUTI();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isLocked")
    public native boolean isLocked();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isRaw")
    public native boolean isRaw();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isInTemporaryStore")
    public native boolean isInTemporaryStore();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "creationDate")
    public native NSDate getCreationDate();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "modificationDate")
    public native NSDate getModificationDate();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "thumbnail")
    public native CGImage getThumbnail();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "metadata")
    public native NSDictionary<?, ?> getMetadata();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "userData")
    public native NSMutableDictionary<?, ?> getUserData();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "ptpObjectHandle")
    public native int getPtpObjectHandle();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "wasAddedAfterContentCatalogCompleted")
    public native boolean isAddedAfterContentCatalogCompleted();
    @Property(selector = "thumbnailIfAvailable")
    public native CGImage getThumbnailIfAvailable();
    @Property(selector = "largeThumbnailIfAvailable")
    public native CGImage getLargeThumbnailIfAvailable();
    @Property(selector = "metadataIfAvailable")
    public native NSDictionary<NSString, ?> getMetadataIfAvailable();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestThumbnail")
    public native void requestThumbnail();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestMetadata")
    public native void requestMetadata();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "flushThumbnailCache")
    public native void flushThumbnailCache();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "flushMetadataCache")
    public native void flushMetadataCache();
    /*</methods>*/
}
