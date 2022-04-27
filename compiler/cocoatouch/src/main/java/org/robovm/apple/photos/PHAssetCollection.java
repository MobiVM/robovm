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
package org.robovm.apple.photos;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHAssetCollection/*</name>*/ 
    extends /*<extends>*/PHCollection/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHAssetCollectionPtr extends Ptr<PHAssetCollection, PHAssetCollectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHAssetCollection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHAssetCollection() {}
    protected PHAssetCollection(Handle h, long handle) { super(h, handle); }
    protected PHAssetCollection(SkipInit skipInit) { super(skipInit); }
    public PHAssetCollection(NSArray<PHAsset> assets, String title) { super((Handle) null, createTransientAssetCollection(assets, title)); retain(getHandle()); }
    public PHAssetCollection(PHFetchResult<PHAsset> fetchResult, String title) { super((Handle) null, createTransientAssetCollection(fetchResult, title)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "assetCollectionType")
    public native PHAssetCollectionType getAssetCollectionType();
    @Property(selector = "assetCollectionSubtype")
    public native PHAssetCollectionSubtype getAssetCollectionSubtype();
    @Property(selector = "estimatedAssetCount")
    public native @MachineSizedUInt long getEstimatedAssetCount();
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @WeaklyLinked
    @Property(selector = "approximateLocation")
    public native CLLocation getApproximateLocation();
    @Property(selector = "localizedLocationNames")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getLocalizedLocationNames();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fetchAssetCollectionsWithLocalIdentifiers:options:")
    public static native PHFetchResult<PHAssetCollection> fetchAssetCollectionsWithLocalIdentifiers(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> identifiers, PHFetchOptions options);
    @Method(selector = "fetchAssetCollectionsWithType:subtype:options:")
    public static native PHFetchResult<PHAssetCollection> fetchAssetCollectionsWithType(PHAssetCollectionType type, PHAssetCollectionSubtype subtype, PHFetchOptions options);
    @Method(selector = "fetchAssetCollectionsContainingAsset:withType:options:")
    public static native PHFetchResult<PHAssetCollection> fetchAssetCollectionsContainingAsset(PHAsset asset, PHAssetCollectionType type, PHFetchOptions options);
    @Method(selector = "fetchAssetCollectionsWithALAssetGroupURLs:options:")
    public static native PHFetchResult<PHAssetCollection> fetchAssetCollectionsWithALAssetGroupURLs(NSArray<NSURL> assetGroupURLs, PHFetchOptions options);
    /**
     * @deprecated Deprecated in iOS 13.0. Will be removed in a future release
     */
    @Deprecated
    @Method(selector = "fetchMomentsInMomentList:options:")
    public static native PHFetchResult<PHAssetCollection> fetchMomentsInMomentList(PHCollectionList momentList, PHFetchOptions options);
    /**
     * @deprecated Deprecated in iOS 13.0. Will be removed in a future release
     */
    @Deprecated
    @Method(selector = "fetchMomentsWithOptions:")
    public static native PHFetchResult<PHAssetCollection> fetchMoments(PHFetchOptions options);
    @Method(selector = "transientAssetCollectionWithAssets:title:")
    protected static native @Pointer long createTransientAssetCollection(NSArray<PHAsset> assets, String title);
    @Method(selector = "transientAssetCollectionWithAssetFetchResult:title:")
    protected static native @Pointer long createTransientAssetCollection(PHFetchResult<PHAsset> fetchResult, String title);
    @Method(selector = "fetchCollectionsInCollectionList:options:")
    public static native PHFetchResult<PHCollection> fetchCollectionsInCollectionList(PHCollectionList collectionList, PHFetchOptions options);
    @Method(selector = "fetchTopLevelUserCollectionsWithOptions:")
    public static native PHFetchResult<PHCollection> fetchTopLevelUserCollections(PHFetchOptions options);
    /*</methods>*/
}
