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
package org.robovm.apple.assetslibrary;

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
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.0 and later.
 * @deprecated Deprecated in iOS 9.0. Use PHPhotoLibrary from the Photos framework instead
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Library("AssetsLibrary") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAssetsLibrary/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObject observeChanged(ALAssetsLibrary object, final VoidBlock2<ALAssetsLibrary, ALAssetsLibraryChangedNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ChangedNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    ALAssetsLibraryChangedNotification userInfo = null;
                    NSDictionary<?, ?> dict = a.getUserInfo();
                    if (dict != null) {
                        userInfo = new ALAssetsLibraryChangedNotification(dict);
                    }
                    block.invoke((ALAssetsLibrary)a.getObject(), userInfo);
                }
            });
        }
    }
    
    /*<ptr>*/public static class ALAssetsLibraryPtr extends Ptr<ALAssetsLibrary, ALAssetsLibraryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALAssetsLibrary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ALAssetsLibrary() {}
    protected ALAssetsLibrary(Handle h, long handle) { super(h, handle); }
    protected ALAssetsLibrary(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use photoLibraryDidChange: notification from the Photos framework instead
     */
    @Deprecated
    @GlobalValue(symbol="ALAssetsLibraryChangedNotification", optional=true)
    public static native NSString ChangedNotification();
    
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use the PHFetchResult returned by one of the fetch... methods on PHAssetCollection from the Photos framework to enumerate asset collections instead
     */
    @Deprecated
    @Method(selector = "enumerateGroupsWithTypes:usingBlock:failureBlock:")
    public native void enumerateGroups(ALAssetsGroupType types, @Block VoidBlock2<ALAssetsGroup, BooleanPtr> enumerationBlock, @Block VoidBlock1<NSError> failureBlock);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use fetchAssetsWithLocalIdentifiers:options: on PHAsset to fetch assets by local identifier (or to lookup PHAssets by a previously known ALAssetPropertyAssetURL use fetchAssetsWithALAssetURLs:options:) from the Photos framework instead
     */
    @Deprecated
    @Method(selector = "assetForURL:resultBlock:failureBlock:")
    public native void getAsset(NSURL assetURL, @Block VoidBlock1<ALAsset> resultBlock, @Block VoidBlock1<NSError> failureBlock);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use fetchAssetCollectionsWithLocalIdentifiers:options: on PHAssetCollection to fetch the asset collections by local identifier (or to lookup PHAssetCollections by a previously known ALAssetsGroupPropertyURL use fetchAssetCollectionsWithALAssetGroupURLs:options:) from the Photos framework instead
     */
    @Deprecated
    @Method(selector = "groupForURL:resultBlock:failureBlock:")
    public native void getGroup(NSURL groupURL, @Block VoidBlock1<ALAssetsGroup> resultBlock, @Block VoidBlock1<NSError> failureBlock);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use creationRequestForAssetCollectionWithTitle: on PHAssetCollectionChangeRequest from the Photos framework to create a new asset collection instead
     */
    @Deprecated
    @Method(selector = "addAssetsGroupAlbumWithName:resultBlock:failureBlock:")
    public native void addAssetsGroupAlbum(String name, @Block VoidBlock1<ALAssetsGroup> resultBlock, @Block VoidBlock1<NSError> failureBlock);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use creationRequestForAssetFromImage: on PHAssetChangeRequest from the Photos framework to create a new asset instead
     */
    @Deprecated
    @WeaklyLinked
    @Method(selector = "writeImageToSavedPhotosAlbum:orientation:completionBlock:")
    public native void writeImageToSavedPhotosAlbum(CGImage imageRef, ALAssetOrientation orientation, @Block VoidBlock2<NSURL, NSError> completionBlock);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 9.0. Use creationRequestForAssetFromImage: on PHAssetChangeRequest from the Photos framework to create a new asset instead
     */
    @Deprecated
    @WeaklyLinked
    @Method(selector = "writeImageToSavedPhotosAlbum:metadata:completionBlock:")
    public native void writeImageToSavedPhotosAlbum(CGImage imageRef, CGImageProperties metadata, @Block VoidBlock2<NSURL, NSError> completionBlock);
    /**
     * @since Available in iOS 4.1 and later.
     * @deprecated Deprecated in iOS 9.0. Use creationRequestForAssetFromImageData: on PHAssetChangeRequest from the Photos framework to create a new asset instead
     */
    @Deprecated
    @WeaklyLinked
    @Method(selector = "writeImageDataToSavedPhotosAlbum:metadata:completionBlock:")
    public native void writeImageDataToSavedPhotosAlbum(NSData imageData, CGImageProperties metadata, @Block VoidBlock2<NSURL, NSError> completionBlock);
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use creationRequestForAssetFromVideoAtFilePath: on PHAssetChangeRequest from the Photos framework to create a new asset instead
     */
    @Deprecated
    @Method(selector = "writeVideoAtPathToSavedPhotosAlbum:completionBlock:")
    public native void writeVideoToSavedPhotosAlbum(NSURL videoPathURL, @Block VoidBlock2<NSURL, NSError> completionBlock);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use isCompatibleWithSavedPhotosAlbum on AVAsset instead
     */
    @Deprecated
    @Method(selector = "videoAtPathIsCompatibleWithSavedPhotosAlbum:")
    public native boolean isVideoCompatibleWithSavedPhotosAlbum(NSURL videoPathURL);
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use authorizationStatus on the shared PHPhotoLibrary from the Photos framework instead
     */
    @Deprecated
    @Method(selector = "authorizationStatus")
    public static native ALAuthorizationStatus getAuthorizationStatus();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 9.0. Use the Photos framework instead
     */
    @Deprecated
    @Method(selector = "disableSharedPhotoStreamsSupport")
    public static native void disableSharedPhotoStreamsSupport();
    /*</methods>*/
}
