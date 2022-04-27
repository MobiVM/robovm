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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMovie/*</name>*/ 
    extends /*<extends>*/AVAsset/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVMoviePtr extends Ptr<AVMovie, AVMoviePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMovie.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVMovie() {}
    protected AVMovie(Handle h, long handle) { super(h, handle); }
    protected AVMovie(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:options:")
    public AVMovie(NSURL URL, NSDictionary<NSString, ?> options) { super((SkipInit) null); initObject(init(URL, options)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithData:options:")
    public AVMovie(NSData data, NSDictionary<NSString, ?> options) { super((SkipInit) null); initObject(init(data, options)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "URL")
    public native NSURL getURL();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "data")
    public native NSData getData();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "defaultMediaDataStorage")
    public native AVMediaDataStorage getDefaultMediaDataStorage();
    @Property(selector = "tracks")
    public native NSArray<? extends AVMovieTrack> getTracks();
    @Property(selector = "canContainMovieFragments")
    public native boolean canContainMovieFragments();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "containsMovieFragments")
    public native boolean containsMovieFragments();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="AVMovieReferenceRestrictionsKey", optional=true)
    public static native NSString referenceRestrictionsKey();
    
    @Method(selector = "initWithURL:options:")
    protected native @Pointer long init(NSURL URL, NSDictionary<NSString, ?> options);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithData:options:")
    protected native @Pointer long init(NSData data, NSDictionary<NSString, ?> options);
    @Method(selector = "movieTypes")
    public static native NSArray<NSString> movieTypes();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "movieHeaderWithFileType:error:")
    public native NSData getMmovieHeader(String fileType, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "writeMovieHeaderToURL:fileType:options:error:")
    public native boolean writeMovieHeader(NSURL URL, String fileType, AVMovieWritingOptions options, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "isCompatibleWithFileType:")
    public native boolean isCompatibleWithFileType(String fileType);
    @Method(selector = "trackWithTrackID:")
    public native AVMovieTrack getTrack(int trackID);
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
    /*</methods>*/
}
