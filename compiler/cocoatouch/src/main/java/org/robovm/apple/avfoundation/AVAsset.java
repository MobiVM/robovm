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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAsset/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements AVAsynchronousKeyValueLoading/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 9.0 and later.
         */
        public static NSObject observeDurationDidChange(AVAsset object, final VoidBlock1<AVAsset> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DurationDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification notification) {
                    block.invoke((AVAsset) notification.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 9.0 and later.
         */
        public static NSObject observeChapterMetadataGroupsDidChange(AVAsset object, final VoidBlock1<AVAsset> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ChapterMetadataGroupsDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification notification) {
                    block.invoke((AVAsset) notification.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 9.0 and later.
         */
        public static NSObject observeMediaSelectionGroupsDidChange(AVAsset object, final VoidBlock1<AVAsset> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(MediaSelectionGroupsDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification notification) {
                    block.invoke((AVAsset) notification.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class AVAssetPtr extends Ptr<AVAsset, AVAssetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAsset.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAsset() {}
    @Deprecated protected AVAsset(long handle) { super(handle); }
    protected AVAsset(Handle h, long handle) { super(h, handle); }
    protected AVAsset(SkipInit skipInit) { super(skipInit); }
    public AVAsset(NSURL URL) { super((Handle) null, create(URL)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "duration")
    public native @ByVal CMTime getDuration();
    @Property(selector = "preferredRate")
    public native float getPreferredRate();
    @Property(selector = "preferredVolume")
    public native float getPreferredVolume();
    @Property(selector = "preferredTransform")
    public native @ByVal CGAffineTransform getPreferredTransform();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "minimumTimeOffsetFromLive")
    public native @ByVal CMTime getMinimumTimeOffsetFromLive();
    @Property(selector = "providesPreciseDurationAndTiming")
    public native boolean providesPreciseDurationAndTiming();
    @Property(selector = "referenceRestrictions")
    public native AVAssetReferenceRestrictions getReferenceRestrictions();
    @Property(selector = "tracks")
    public native NSArray<? extends AVAssetTrack> getTracks();
    @Property(selector = "trackGroups")
    public native NSArray<AVAssetTrackGroup> getTrackGroups();
    @Property(selector = "creationDate")
    public native AVMetadataItem getCreationDate();
    @Property(selector = "lyrics")
    public native String getLyrics();
    @Property(selector = "commonMetadata")
    public native NSArray<AVMetadataItem> getCommonMetadata();
    @Property(selector = "metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Property(selector = "availableMetadataFormats")
    public native @org.robovm.rt.bro.annotation.Marshaler(AVMetadataFormat.AsListMarshaler.class) List<AVMetadataFormat> getAvailableMetadataFormats();
    @Property(selector = "availableChapterLocales")
    public native NSArray<NSLocale> getAvailableChapterLocales();
    @Property(selector = "availableMediaCharacteristicsWithMediaSelectionOptions")
    public native @org.robovm.rt.bro.annotation.Marshaler(AVMediaCharacteristic.AsListMarshaler.class) List<AVMediaCharacteristic> getAvailableMediaCharacteristicsWithMediaSelectionOptions();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "preferredMediaSelection")
    public native AVMediaSelection getPreferredMediaSelection();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "allMediaSelections")
    public native NSArray<AVMediaSelection> getAllMediaSelections();
    @Property(selector = "hasProtectedContent")
    public native boolean hasProtectedContent();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "canContainFragments")
    public native boolean canContainFragments();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "containsFragments")
    public native boolean containsFragments();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @Property(selector = "overallDurationHint")
    public native @ByVal CMTime getOverallDurationHint();
    @Property(selector = "isPlayable")
    public native boolean isPlayable();
    @Property(selector = "isExportable")
    public native boolean isExportable();
    @Property(selector = "isReadable")
    public native boolean isReadable();
    @Property(selector = "isComposable")
    public native boolean isComposable();
    @Property(selector = "isCompatibleWithSavedPhotosAlbum")
    public native boolean isCompatibleWithSavedPhotosAlbum();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isCompatibleWithAirPlayVideo")
    public native boolean isCompatibleWithAirPlayVideo();
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
    @GlobalValue(symbol="AVAssetDurationDidChangeNotification", optional=true)
    public static native NSString DurationDidChangeNotification();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="AVAssetContainsFragmentsDidChangeNotification", optional=true)
    public static native NSString ContainsFragmentsDidChangeNotification();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="AVAssetWasDefragmentedNotification", optional=true)
    public static native NSString WasDefragmentedNotification();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="AVAssetChapterMetadataGroupsDidChangeNotification", optional=true)
    public static native NSString ChapterMetadataGroupsDidChangeNotification();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="AVAssetMediaSelectionGroupsDidChangeNotification", optional=true)
    public static native NSString MediaSelectionGroupsDidChangeNotification();
    
    @Method(selector = "assetWithURL:")
    protected static native @Pointer long create(NSURL URL);
    @Method(selector = "cancelLoading")
    public native void cancelLoading();
    @Method(selector = "trackWithTrackID:")
    public native AVAssetTrack getTrack(int trackID);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadTrackWithTrackID:completionHandler:")
    public native void loadTrack(int trackID, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    @Method(selector = "tracksWithMediaType:")
    public native NSArray<AVAssetTrack> getTracksWithType(AVMediaType mediaType);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadTracksWithMediaType:completionHandler:")
    public native void loadTracksWithMediaType(String mediaType, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    @Method(selector = "tracksWithMediaCharacteristic:")
    public native NSArray<AVAssetTrack> getTracksWithCharacteristic(AVMediaCharacteristic mediaCharacteristic);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadTracksWithMediaCharacteristic:completionHandler:")
    public native void loadTracksWithMediaCharacteristic(String mediaCharacteristic, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    @Method(selector = "metadataForFormat:")
    public native NSArray<AVMetadataItem> getMetadata(AVMetadataFormat format);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadMetadataForFormat:completionHandler:")
    public native void loadMetadataForFormat(String format, @Block VoidBlock2<NSArray<AVMetadataItem>, NSError> completionHandler);
    @Method(selector = "chapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:")
    public native NSArray<AVTimedMetadataGroup> getChapterMetadataGroupsContainingItemsWithCommonKeys(NSLocale locale, @org.robovm.rt.bro.annotation.Marshaler(AVMetadataKey.AsListMarshaler.class) List<AVMetadataKey> commonKeys);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadChapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:completionHandler:")
    public native void loadChapterMetadataGroups(NSLocale locale, NSArray<NSString> commonKeys, @Block VoidBlock2<NSArray<AVTimedMetadataGroup>, NSError> completionHandler);
    @Method(selector = "chapterMetadataGroupsBestMatchingPreferredLanguages:")
    public native NSArray<AVTimedMetadataGroup> getChapterMetadataGroupsBestMatchingPreferredLanguages(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> preferredLanguages);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadChapterMetadataGroupsBestMatchingPreferredLanguages:completionHandler:")
    public native void loadChapterMetadataGroupsBestMatchingPreferredLanguages(NSArray<NSString> preferredLanguages, @Block VoidBlock2<NSArray<AVTimedMetadataGroup>, NSError> completionHandler);
    @Method(selector = "mediaSelectionGroupForMediaCharacteristic:")
    public native AVMediaSelectionGroup getMediaSelectionGroup(AVMediaCharacteristic mediaCharacteristic);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadMediaSelectionGroupForMediaCharacteristic:completionHandler:")
    public native void loadMediaSelectionGroupForMediaCharacteristic(String mediaCharacteristic, @Block VoidBlock2<AVMediaSelectionGroup, NSError> completionHandler);
    @Method(selector = "unusedTrackID")
    public native int getUnusedTrackID();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "findUnusedTrackIDWithCompletionHandler:")
    public native void findUnusedTrackID(@Block VoidBlock2<Integer, NSError> completionHandler);
    @Method(selector = "statusOfValueForKey:error:")
    public native AVKeyValueStatus getStatusOfValue(AVMetadataKey key, NSError.NSErrorPtr outError);
    @Method(selector = "loadValuesAsynchronouslyForKeys:completionHandler:")
    public native void loadValuesAsynchronously(@org.robovm.rt.bro.annotation.Marshaler(AVMetadataKey.AsListMarshaler.class) List<AVMetadataKey> keys, @Block Runnable handler);
    /*</methods>*/
}
