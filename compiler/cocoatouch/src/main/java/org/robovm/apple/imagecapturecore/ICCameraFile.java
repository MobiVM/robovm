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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ICCameraFile/*</name>*/ 
    extends /*<extends>*/ICCameraItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ICCameraFilePtr extends Ptr<ICCameraFile, ICCameraFilePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ICCameraFile.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ICCameraFile() {}
    protected ICCameraFile(Handle h, long handle) { super(h, handle); }
    protected ICCameraFile(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "width")
    public native @MachineSizedSInt long getWidth();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "height")
    public native @MachineSizedSInt long getHeight();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "originalFilename")
    public native String getOriginalFilename();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "createdFilename")
    public native String getCreatedFilename();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "fileSize")
    public native long getFileSize();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "orientation")
    public native ICEXIFOrientationType getOrientation();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setOrientation:")
    public native void setOrientation(ICEXIFOrientationType v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "duration")
    public native double getDuration();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "highFramerate")
    public native boolean isHighFramerate();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "timeLapse")
    public native boolean isTimeLapse();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "firstPicked")
    public native boolean isFirstPicked();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "originatingAssetID")
    public native String getOriginatingAssetID();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "groupUUID")
    public native String getGroupUUID();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "gpsString")
    public native String getGpsString();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "relatedUUID")
    public native String getRelatedUUID();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "burstUUID")
    public native String getBurstUUID();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "burstFavorite")
    public native boolean isBurstFavorite();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "burstPicked")
    public native boolean isBurstPicked();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "sidecarFiles")
    public native NSArray<ICCameraItem> getSidecarFiles();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "pairedRawImage")
    public native ICCameraFile getPairedRawImage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "fileCreationDate")
    public native NSDate getFileCreationDate();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "fileModificationDate")
    public native NSDate getFileModificationDate();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "exifCreationDate")
    public native NSDate getExifCreationDate();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "exifModificationDate")
    public native NSDate getExifModificationDate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestThumbnailDataWithOptions:completion:")
    public native void requestThumbnailData(NSDictionary<NSString, ?> options, @Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestMetadataDictionaryWithOptions:completion:")
    public native void requestMetadataDictionary(NSDictionary<NSString, ?> options, @Block VoidBlock2<NSDictionary<?, ?>, NSError> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestDownloadWithOptions:completion:")
    public native NSProgress requestDownload(NSDictionary<NSString, ?> options, @Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestReadDataAtOffset:length:completion:")
    public native void requestReadData(long offset, long length, @Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "requestSecurityScopedURLWithCompletion:")
    public native void requestSecurityScopedURL(@Block VoidBlock2<NSURL, NSError> completion);
    /*</methods>*/
}
