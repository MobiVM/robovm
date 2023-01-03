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
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMutableMovie/*</name>*/ 
    extends /*<extends>*/AVMovie/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVMutableMoviePtr extends Ptr<AVMutableMovie, AVMutableMoviePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMutableMovie.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVMutableMovie() {}
    protected AVMutableMovie(Handle h, long handle) { super(h, handle); }
    protected AVMutableMovie(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:options:error:")
    public AVMutableMovie(NSURL URL, NSDictionary<NSString, ?> options, NSError.NSErrorPtr outError) { super((SkipInit) null); initObject(init(URL, options, outError)); }
    @Method(selector = "initWithData:options:error:")
    public AVMutableMovie(NSData data, NSDictionary<NSString, ?> options, NSError.NSErrorPtr outError) { super((SkipInit) null); initObject(init(data, options, outError)); }
    @Method(selector = "initWithSettingsFromMovie:options:error:")
    public AVMutableMovie(AVMovie movie, NSDictionary<NSString, ?> options) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(movie, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    @Method(selector = "initWithURL:options:")
    public AVMutableMovie(NSURL URL, NSDictionary<NSString, ?> options) { super(URL, options); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithData:options:")
    public AVMutableMovie(NSData data, NSDictionary<NSString, ?> options) { super(data, options); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "preferredRate")
    public native float getPreferredRate();
    @Property(selector = "setPreferredRate:")
    public native void setPreferredRate(float v);
    @Property(selector = "preferredVolume")
    public native float getPreferredVolume();
    @Property(selector = "setPreferredVolume:")
    public native void setPreferredVolume(float v);
    @Property(selector = "preferredTransform")
    public native @ByVal CGAffineTransform getPreferredTransform();
    @Property(selector = "setPreferredTransform:")
    public native void setPreferredTransform(@ByVal CGAffineTransform v);
    @Property(selector = "timescale")
    public native int getTimescale();
    @Property(selector = "setTimescale:")
    public native void setTimescale(int v);
    @Property(selector = "tracks")
    public native NSArray<AVMutableMovieTrack> getTracks();
    @Property(selector = "isModified")
    public native boolean isModified();
    @Property(selector = "setModified:")
    public native void setModified(boolean v);
    @Property(selector = "defaultMediaDataStorage")
    public native AVMediaDataStorage getDefaultMediaDataStorage();
    @Property(selector = "setDefaultMediaDataStorage:")
    public native void setDefaultMediaDataStorage(AVMediaDataStorage v);
    @Property(selector = "interleavingPeriod")
    public native @ByVal CMTime getInterleavingPeriod();
    @Property(selector = "setInterleavingPeriod:")
    public native void setInterleavingPeriod(@ByVal CMTime v);
    @Property(selector = "metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSArray<AVMetadataItem> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:options:error:")
    protected native @Pointer long init(NSURL URL, NSDictionary<NSString, ?> options, NSError.NSErrorPtr outError);
    @Method(selector = "initWithData:options:error:")
    protected native @Pointer long init(NSData data, NSDictionary<NSString, ?> options, NSError.NSErrorPtr outError);
    @Method(selector = "initWithSettingsFromMovie:options:error:")
    private native @Pointer long init(AVMovie movie, NSDictionary<NSString, ?> options, NSError.NSErrorPtr outError);
    @Method(selector = "movieTypes")
    public static native NSArray<NSString> movieTypes();
    @Method(selector = "insertTimeRange:ofAsset:atTime:copySampleData:error:")
    public native boolean insertTimeRange(@ByVal CMTimeRange timeRange, AVAsset asset, @ByVal CMTime startTime, boolean copySampleData, NSError.NSErrorPtr outError);
    @Method(selector = "insertEmptyTimeRange:")
    public native void insertEmptyTimeRange(@ByVal CMTimeRange timeRange);
    @Method(selector = "removeTimeRange:")
    public native void removeTimeRange(@ByVal CMTimeRange timeRange);
    @Method(selector = "scaleTimeRange:toDuration:")
    public native void scaleTimeRange(@ByVal CMTimeRange timeRange, @ByVal CMTime duration);
    @Method(selector = "mutableTrackCompatibleWithTrack:")
    public native AVMutableMovieTrack mutableTrackCompatibleWithTrack(AVAssetTrack track);
    @Method(selector = "addMutableTrackWithMediaType:copySettingsFromTrack:options:")
    public native AVMutableMovieTrack addMutableTrack(String mediaType, AVAssetTrack track, NSDictionary<NSString, ?> options);
    @Method(selector = "addMutableTracksCopyingSettingsFromTracks:options:")
    public native NSArray<AVMutableMovieTrack> addMutableTracksCopyingSettings(NSArray<AVAssetTrack> existingTracks, NSDictionary<NSString, ?> options);
    @Method(selector = "removeTrack:")
    public native void removeTrack(AVMovieTrack track);
    @Method(selector = "trackWithTrackID:")
    public native AVMutableMovieTrack getTrack(int trackID);
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
    @Method(selector = "chapterMetadataGroupsWithTitleLocale:containingItemsWithCommonKeys:")
    public native NSArray<AVTimedMetadataGroup> getChapterMetadataGroupsContainingItemsWithCommonKeys(NSLocale locale, @org.robovm.rt.bro.annotation.Marshaler(AVMetadataKey.AsListMarshaler.class) List<AVMetadataKey> commonKeys);
    @Method(selector = "chapterMetadataGroupsBestMatchingPreferredLanguages:")
    public native NSArray<AVTimedMetadataGroup> getChapterMetadataGroupsBestMatchingPreferredLanguages(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> preferredLanguages);
    @Method(selector = "mediaSelectionGroupForMediaCharacteristic:")
    public native AVMediaSelectionGroup getMediaSelectionGroup(AVMediaCharacteristic mediaCharacteristic);
    @Method(selector = "unusedTrackID")
    public native int getUnusedTrackID();
    /*</methods>*/
}
