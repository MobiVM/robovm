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
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetTrack/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements AVAsynchronousKeyValueLoading/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 9.0 and later.
         */
        public static NSObjectProtocol observeTrackAssociationsDidChange(AVAssetTrack object, final VoidBlock1<AVAssetTrack> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(TrackAssociationsDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification notification) {
                    block.invoke((AVAssetTrack) notification.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class AVAssetTrackPtr extends Ptr<AVAssetTrack, AVAssetTrackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetTrack.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAssetTrack() {}
    protected AVAssetTrack(Handle h, long handle) { super(h, handle); }
    protected AVAssetTrack(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "asset")
    public native AVAsset getAsset();
    @Property(selector = "trackID")
    public native int getTrackID();
    @Property(selector = "mediaType")
    public native String getMediaType();
    @Property(selector = "formatDescriptions")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<CMFormatDescription> getFormatDescriptions();
    @Property(selector = "isPlayable")
    public native boolean isPlayable();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isDecodable")
    public native boolean isDecodable();
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "isSelfContained")
    public native boolean isSelfContained();
    @Property(selector = "totalSampleDataLength")
    public native long getTotalSampleDataLength();
    @Property(selector = "timeRange")
    public native @ByVal CMTimeRange getTimeRange();
    @Property(selector = "naturalTimeScale")
    public native int getNaturalTimeScale();
    @Property(selector = "estimatedDataRate")
    public native float getEstimatedDataRate();
    @Property(selector = "languageCode")
    public native String getLanguageCode();
    @Property(selector = "extendedLanguageTag")
    public native String getExtendedLanguageTag();
    @Property(selector = "naturalSize")
    public native @ByVal CGSize getNaturalSize();
    @Property(selector = "preferredTransform")
    public native @ByVal CGAffineTransform getPreferredTransform();
    @Property(selector = "preferredVolume")
    public native float getPreferredVolume();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "hasAudioSampleDependencies")
    public native boolean hasAudioSampleDependencies();
    @Property(selector = "nominalFrameRate")
    public native float getNominalFrameRate();
    @Property(selector = "minFrameDuration")
    public native @ByVal CMTime getMinFrameDuration();
    @Property(selector = "requiresFrameReordering")
    public native boolean requiresFrameReordering();
    @Property(selector = "segments")
    public native NSArray<AVAssetTrackSegment> getSegments();
    @Property(selector = "commonMetadata")
    public native NSArray<AVMetadataItem> getCommonMetadata();
    @Property(selector = "metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Property(selector = "availableMetadataFormats")
    public native @org.robovm.rt.bro.annotation.Marshaler(AVMetadataFormat.AsListMarshaler.class) List<AVMetadataFormat> getAvailableMetadataFormats();
    @Property(selector = "availableTrackAssociationTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(AVTrackAssociationType.AsListMarshaler.class) List<AVTrackAssociationType> getAvailableTrackAssociationTypes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * 
     * @param key
     * @return
     * @throws NSErrorException
     */
    public AVKeyValueStatus getStatusOfValue(AVMetadataKey key) throws NSErrorException {
        NSError.NSErrorPtr err = new NSError.NSErrorPtr();
        AVKeyValueStatus result = getStatusOfValue(key, err);
        if (err.get() != null) {
            throw new NSErrorException(err.get());
        }
        return result;
    }
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="AVAssetTrackTrackAssociationsDidChangeNotification", optional=true)
    public static native NSString TrackAssociationsDidChangeNotification();
    
    @Method(selector = "hasMediaCharacteristic:")
    public native boolean hasMediaCharacteristic(AVMediaCharacteristic mediaCharacteristic);
    @Method(selector = "segmentForTrackTime:")
    public native AVAssetTrackSegment getSegment(@ByVal CMTime trackTime);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadSegmentForTrackTime:completionHandler:")
    public native void loadSegmentForTrackTime(@ByVal CMTime trackTime, @Block VoidBlock2<AVAssetTrackSegment, NSError> completionHandler);
    @Method(selector = "samplePresentationTimeForTrackTime:")
    public native @ByVal CMTime getSamplePresentationTime(@ByVal CMTime trackTime);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadSamplePresentationTimeForTrackTime:completionHandler:")
    public native void loadSamplePresentationTimeForTrackTime(@ByVal CMTime trackTime, @Block("(@ByVal,)") VoidBlock2<CMTime, NSError> completionHandler);
    @Method(selector = "metadataForFormat:")
    public native NSArray<AVMetadataItem> getMetadataForFormat(AVMetadataFormat format);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadMetadataForFormat:completionHandler:")
    public native void loadMetadataForFormat(String format, @Block VoidBlock2<NSArray<AVMetadataItem>, NSError> completionHandler);
    @Method(selector = "associatedTracksOfType:")
    public native NSArray<AVAssetTrack> getAssociatedTracksOfType(AVTrackAssociationType trackAssociationType);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadAssociatedTracksOfType:completionHandler:")
    public native void loadAssociatedTracksOfType(String trackAssociationType, @Block VoidBlock2<NSArray<AVAssetTrack>, NSError> completionHandler);
    @Method(selector = "statusOfValueForKey:error:")
    public native AVKeyValueStatus getStatusOfValue(AVMetadataKey key, NSError.NSErrorPtr outError);
    @Method(selector = "loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronously(@org.robovm.rt.bro.annotation.Marshaler(AVMetadataKey.AsListMarshaler.class) List<AVMetadataKey> keys, @Block Runnable handler);
    /*</methods>*/
}
