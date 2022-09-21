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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVFragmentedMovie/*</name>*/ 
    extends /*<extends>*/AVMovie/*</extends>*/ 
    /*<implements>*/implements AVFragmentMinding/*</implements>*/ {

    /*<ptr>*/public static class AVFragmentedMoviePtr extends Ptr<AVFragmentedMovie, AVFragmentedMoviePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVFragmentedMovie.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVFragmentedMovie() {}
    protected AVFragmentedMovie(Handle h, long handle) { super(h, handle); }
    protected AVFragmentedMovie(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:options:")
    public AVFragmentedMovie(NSURL URL, NSDictionary<NSString, ?> options) { super(URL, options); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithData:options:")
    public AVFragmentedMovie(NSData data, NSDictionary<NSString, ?> options) { super(data, options); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tracks")
    public native NSArray<AVFragmentedMovieTrack> getTracks();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "isAssociatedWithFragmentMinder")
    public native boolean isAssociatedWithFragmentMinder();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("AVFoundation")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVFragmentedMovieContainsMovieFragmentsDidChangeNotification", optional=true)
        public static native NSString ContainsMovieFragmentsDidChange();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVFragmentedMovieDurationDidChangeNotification", optional=true)
        public static native NSString DurationDidChange();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVFragmentedMovieWasDefragmentedNotification", optional=true)
        public static native NSString WasDefragmented();
    }
    
    @Method(selector = "movieTypes")
    public static native NSArray<NSString> movieTypes();
    /**
     * @deprecated Use loadTrackWithTrackID:completionHandler:
     */
    @Deprecated
    @Method(selector = "trackWithTrackID:")
    public native AVFragmentedMovieTrack getTrack(int trackID);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadTrackWithTrackID:completionHandler:")
    public native void loadTrack(int trackID, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    /**
     * @deprecated Use loadTracksWithMediaType:completionHandler:
     */
    @Deprecated
    @Method(selector = "tracksWithMediaType:")
    public native NSArray<AVAssetTrack> getTracksWithType(AVMediaType mediaType);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadTracksWithMediaType:completionHandler:")
    public native void loadTracksWithMediaType(String mediaType, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    /**
     * @deprecated loadTracksWithMediaCharacteristic:completionHandler:
     */
    @Deprecated
    @Method(selector = "tracksWithMediaCharacteristic:")
    public native NSArray<AVAssetTrack> getTracksWithCharacteristic(AVMediaCharacteristic mediaCharacteristic);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadTracksWithMediaCharacteristic:completionHandler:")
    public native void loadTracksWithMediaCharacteristic(String mediaCharacteristic, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    /*</methods>*/
}
