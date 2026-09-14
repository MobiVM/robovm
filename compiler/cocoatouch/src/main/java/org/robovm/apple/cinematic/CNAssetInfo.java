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
package org.robovm.apple.cinematic;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Cinematic") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNAssetInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CNAssetInfoPtr extends Ptr<CNAssetInfo, CNAssetInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CNAssetInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CNAssetInfo() {}
    protected CNAssetInfo(Handle h, long handle) { super(h, handle); }
    protected CNAssetInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "asset")
    public native AVAsset getAsset();
    @Property(selector = "allCinematicTracks")
    public native NSArray<AVAssetTrack> getAllCinematicTracks();
    @Property(selector = "cinematicVideoTrack")
    public native AVAssetTrack getCinematicVideoTrack();
    @Property(selector = "cinematicDisparityTrack")
    public native AVAssetTrack getCinematicDisparityTrack();
    @Property(selector = "cinematicMetadataTrack")
    public native AVAssetTrack getCinematicMetadataTrack();
    @Property(selector = "timeRange")
    public native @ByVal CMTimeRange getTimeRange();
    @Property(selector = "naturalSize")
    public native @ByVal CGSize getNaturalSize();
    @Property(selector = "preferredSize")
    public native @ByVal CGSize getPreferredSize();
    @Property(selector = "preferredTransform")
    public native @ByVal CGAffineTransform getPreferredTransform();
    @Property(selector = "frameTimingTrack")
    public native AVAssetTrack getFrameTimingTrack();
    @Property(selector = "videoCompositionTracks")
    public native NSArray<AVAssetTrack> getVideoCompositionTracks();
    @Property(selector = "videoCompositionTrackIDs")
    public native NSArray<NSNumber> getVideoCompositionTrackIDs();
    @Property(selector = "sampleDataTrackIDs")
    public native NSArray<NSNumber> getSampleDataTrackIDs();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "defaultResourceDownloadTimeout")
    public static native double getDefaultResourceDownloadTimeout();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "isPreprocessed")
    public native boolean isPreprocessed();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "cinematicCapability")
    public native CNCinematicCapability getCinematicCapability();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "resourceStatus")
    public native CNResourceStatus getResourceStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "checkCinematicCapabilityForAsset:completionHandler:")
    public static native void checkCinematicCapability(AVAsset asset, @Block VoidBlock1<CNCinematicCapability> completionHandler);
    /**
     * @since Available in iOS 17.0 and later.
     * @deprecated Deprecated in iOS 27.0. Use checkCinematicCapabilityForAsset:completionHandler:
     */
    @Deprecated
    @Method(selector = "checkIfCinematic:completionHandler:")
    public static native void checkIfCinematic(AVAsset asset, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "loadFromAsset:completionHandler:")
    public static native void load(AVAsset asset, @Block VoidBlock2<CNAssetInfo, NSError> completionHandler);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "downloadResourcesWithTimeout:completionHandler:")
    public native NSProgress downloadResources(double downloadTimeout, @Block VoidBlock2<CNAssetInfo, NSError> completionHandler);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "preprocessAssetWithConfiguration:completionHandler:")
    public native NSProgress preprocess(CNAssetPreprocessConfiguration configuration, @Block VoidBlock2<CNAssetInfo, NSError> completionHandler);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "resourceStatusForVersions:")
    public static native CNResourceStatus resourceStatusForVersions(NSSet<NSNumber> resourceVersions);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "downloadResourcesForVersions:timeout:completionHandler:")
    public static native NSProgress downloadResources(NSSet<NSNumber> resourceVersions, double downloadTimeout, @Block VoidBlock1<NSError> completionHandler);
    /*</methods>*/
}
