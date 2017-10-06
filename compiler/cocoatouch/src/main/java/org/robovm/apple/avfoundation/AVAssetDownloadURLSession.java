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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetDownloadURLSession/*</name>*/ 
    extends /*<extends>*/NSURLSession/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAssetDownloadURLSessionPtr extends Ptr<AVAssetDownloadURLSession, AVAssetDownloadURLSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetDownloadURLSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAssetDownloadURLSession() {}
    protected AVAssetDownloadURLSession(Handle h, long handle) { super(h, handle); }
    protected AVAssetDownloadURLSession(SkipInit skipInit) { super(skipInit); }
    public AVAssetDownloadURLSession(NSURLSessionConfiguration configuration, AVAssetDownloadDelegate delegate, NSOperationQueue delegateQueue) { super((Handle) null, create(configuration, delegate, delegateQueue)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "assetDownloadTaskWithURLAsset:destinationURL:options:")
    public native AVAssetDownloadTask newAssetDownloadTask(AVURLAsset URLAsset, NSURL destinationURL, AVAssetDownloadTaskOptions options);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "assetDownloadTaskWithURLAsset:assetTitle:assetArtworkData:options:")
    public native AVAssetDownloadTask newAssetDownloadTask(AVURLAsset URLAsset, String title, NSData artworkData, AVAssetDownloadTaskOptions options);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "aggregateAssetDownloadTaskWithURLAsset:mediaSelections:assetTitle:assetArtworkData:options:")
    public native AVAggregateAssetDownloadTask aggregateAssetDownloadTaskWithURLAsset(AVURLAsset URLAsset, NSArray<AVMediaSelection> mediaSelections, String title, NSData artworkData, NSDictionary<NSString, ?> options);
    @Method(selector = "sessionWithConfiguration:assetDownloadDelegate:delegateQueue:")
    protected static native @Pointer long create(NSURLSessionConfiguration configuration, AVAssetDownloadDelegate delegate, NSOperationQueue delegateQueue);
    /*</methods>*/
}
