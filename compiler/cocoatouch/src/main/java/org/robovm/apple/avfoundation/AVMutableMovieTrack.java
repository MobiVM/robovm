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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMutableMovieTrack/*</name>*/ 
    extends /*<extends>*/AVMovieTrack/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVMutableMovieTrackPtr extends Ptr<AVMutableMovieTrack, AVMutableMovieTrackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMutableMovieTrack.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVMutableMovieTrack() {}
    protected AVMutableMovieTrack(Handle h, long handle) { super(h, handle); }
    protected AVMutableMovieTrack(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mediaDataStorage")
    public native AVMediaDataStorage getMediaDataStorage();
    @Property(selector = "setMediaDataStorage:")
    public native void setMediaDataStorage(AVMediaDataStorage v);
    @Property(selector = "sampleReferenceBaseURL")
    public native NSURL getSampleReferenceBaseURL();
    @Property(selector = "setSampleReferenceBaseURL:")
    public native void setSampleReferenceBaseURL(NSURL v);
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "alternateGroupID")
    public native @MachineSizedSInt long getAlternateGroupID();
    @Property(selector = "setAlternateGroupID:")
    public native void setAlternateGroupID(@MachineSizedSInt long v);
    @Property(selector = "isModified")
    public native boolean isModified();
    @Property(selector = "setModified:")
    public native void setModified(boolean v);
    @Property(selector = "hasProtectedContent")
    public native boolean hasProtectedContent();
    @Property(selector = "timescale")
    public native int getTimescale();
    @Property(selector = "setTimescale:")
    public native void setTimescale(int v);
    @Property(selector = "languageCode")
    public native String getLanguageCode();
    @Property(selector = "setLanguageCode:")
    public native void setLanguageCode(String v);
    @Property(selector = "extendedLanguageTag")
    public native String getExtendedLanguageTag();
    @Property(selector = "setExtendedLanguageTag:")
    public native void setExtendedLanguageTag(String v);
    @Property(selector = "naturalSize")
    public native @ByVal CGSize getNaturalSize();
    @Property(selector = "setNaturalSize:")
    public native void setNaturalSize(@ByVal CGSize v);
    @Property(selector = "preferredTransform")
    public native @ByVal CGAffineTransform getPreferredTransform();
    @Property(selector = "setPreferredTransform:")
    public native void setPreferredTransform(@ByVal CGAffineTransform v);
    @Property(selector = "layer")
    public native @MachineSizedSInt long getLayer();
    @Property(selector = "setLayer:")
    public native void setLayer(@MachineSizedSInt long v);
    @Property(selector = "cleanApertureDimensions")
    public native @ByVal CGSize getCleanApertureDimensions();
    @Property(selector = "setCleanApertureDimensions:")
    public native void setCleanApertureDimensions(@ByVal CGSize v);
    @Property(selector = "productionApertureDimensions")
    public native @ByVal CGSize getProductionApertureDimensions();
    @Property(selector = "setProductionApertureDimensions:")
    public native void setProductionApertureDimensions(@ByVal CGSize v);
    @Property(selector = "encodedPixelsDimensions")
    public native @ByVal CGSize getEncodedPixelsDimensions();
    @Property(selector = "setEncodedPixelsDimensions:")
    public native void setEncodedPixelsDimensions(@ByVal CGSize v);
    @Property(selector = "preferredVolume")
    public native float getPreferredVolume();
    @Property(selector = "setPreferredVolume:")
    public native void setPreferredVolume(float v);
    @Property(selector = "preferredMediaChunkSize")
    public native @MachineSizedSInt long getPreferredMediaChunkSize();
    @Property(selector = "setPreferredMediaChunkSize:")
    public native void setPreferredMediaChunkSize(@MachineSizedSInt long v);
    @Property(selector = "preferredMediaChunkDuration")
    public native @ByVal CMTime getPreferredMediaChunkDuration();
    @Property(selector = "setPreferredMediaChunkDuration:")
    public native void setPreferredMediaChunkDuration(@ByVal CMTime v);
    @Property(selector = "preferredMediaChunkAlignment")
    public native @MachineSizedSInt long getPreferredMediaChunkAlignment();
    @Property(selector = "setPreferredMediaChunkAlignment:")
    public native void setPreferredMediaChunkAlignment(@MachineSizedSInt long v);
    @Property(selector = "metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSArray<AVMetadataItem> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "insertTimeRange:ofTrack:atTime:copySampleData:error:")
    public native boolean insertTimeRange(@ByVal CMTimeRange timeRange, AVAssetTrack track, @ByVal CMTime startTime, boolean copySampleData, NSError.NSErrorPtr outError);
    @Method(selector = "insertEmptyTimeRange:")
    public native void insertEmptyTimeRange(@ByVal CMTimeRange timeRange);
    @Method(selector = "removeTimeRange:")
    public native void removeTimeRange(@ByVal CMTimeRange timeRange);
    @Method(selector = "scaleTimeRange:toDuration:")
    public native void scaleTimeRange(@ByVal CMTimeRange timeRange, @ByVal CMTime duration);
    @Method(selector = "addTrackAssociationToTrack:type:")
    public native void addTrackAssociationToTrack(AVMovieTrack movieTrack, String trackAssociationType);
    @Method(selector = "removeTrackAssociationToTrack:type:")
    public native void removeTrackAssociationToTrack(AVMovieTrack movieTrack, String trackAssociationType);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "replaceFormatDescription:withFormatDescription:")
    public native void replaceFormatDescription(CMFormatDescription formatDescription, CMFormatDescription newFormatDescription);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "appendSampleBuffer:decodeTime:presentationTime:error:")
    public native boolean appendSampleBuffer(CMSampleBuffer sampleBuffer, CMTime outDecodeTime, CMTime outPresentationTime, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "insertMediaTimeRange:intoTimeRange:")
    public native boolean insertMediaTimeRange(@ByVal CMTimeRange mediaTimeRange, @ByVal CMTimeRange trackTimeRange);
    @Method(selector = "hasMediaCharacteristic:")
    public native boolean hasMediaCharacteristic(AVMediaCharacteristic mediaCharacteristic);
    @Method(selector = "segmentForTrackTime:")
    public native AVAssetTrackSegment getSegment(@ByVal CMTime trackTime);
    @Method(selector = "samplePresentationTimeForTrackTime:")
    public native @ByVal CMTime getSamplePresentationTime(@ByVal CMTime trackTime);
    @Method(selector = "metadataForFormat:")
    public native NSArray<AVMetadataItem> getMetadataForFormat(AVMetadataFormat format);
    @Method(selector = "associatedTracksOfType:")
    public native NSArray<AVAssetTrack> getAssociatedTracksOfType(AVTrackAssociationType trackAssociationType);
    /*</methods>*/
}
