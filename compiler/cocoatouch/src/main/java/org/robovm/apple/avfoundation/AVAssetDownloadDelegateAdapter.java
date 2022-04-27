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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetDownloadDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSURLSessionTaskDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements AVAssetDownloadDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @NotImplemented("URLSession:assetDownloadTask:didFinishDownloadingToURL:")
    public void didFinishDownloadingToURL(NSURLSession session, AVAssetDownloadTask assetDownloadTask, NSURL location) {}
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("URLSession:assetDownloadTask:didLoadTimeRange:totalTimeRangesLoaded:timeRangeExpectedToLoad:")
    public void didLoadTimeRange(NSURLSession session, AVAssetDownloadTask assetDownloadTask, @ByVal CMTimeRange timeRange, @org.robovm.rt.bro.annotation.Marshaler(CMTimeRange.AsValuedListMarshaler.class) List<CMTimeRange> loadedTimeRanges, @ByVal CMTimeRange timeRangeExpectedToLoad) {}
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("URLSession:assetDownloadTask:didResolveMediaSelection:")
    public void didResolveMediaSelection(NSURLSession session, AVAssetDownloadTask assetDownloadTask, AVMediaSelection resolvedMediaSelection) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("URLSession:aggregateAssetDownloadTask:willDownloadToURL:")
    public void willDownloadToURL(NSURLSession session, AVAggregateAssetDownloadTask aggregateAssetDownloadTask, NSURL location) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("URLSession:aggregateAssetDownloadTask:didCompleteForMediaSelection:")
    public void didCompleteForMediaSelection(NSURLSession session, AVAggregateAssetDownloadTask aggregateAssetDownloadTask, AVMediaSelection mediaSelection) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("URLSession:aggregateAssetDownloadTask:didLoadTimeRange:totalTimeRangesLoaded:timeRangeExpectedToLoad:forMediaSelection:")
    public void didLoadTimeRange(NSURLSession session, AVAggregateAssetDownloadTask aggregateAssetDownloadTask, @ByVal CMTimeRange timeRange, NSArray<NSValue> loadedTimeRanges, @ByVal CMTimeRange timeRangeExpectedToLoad, AVMediaSelection mediaSelection) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("URLSession:assetDownloadTask:willDownloadVariants:")
    public void assetDownloadTask(NSURLSession session, AVAssetDownloadTask assetDownloadTask, NSArray<AVAssetVariant> variants) {}
    /*</methods>*/
}
