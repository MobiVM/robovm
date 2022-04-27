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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer")/*</annotations>*/
@Marshaler(/*<name>*/MPMoviePlayerThumbnailRequest/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMoviePlayerThumbnailRequest/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static MPMoviePlayerThumbnailRequest toObject(Class<MPMoviePlayerThumbnailRequest> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new MPMoviePlayerThumbnailRequest(o);
        }
        @MarshalsPointer
        public static long toNative(MPMoviePlayerThumbnailRequest o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<MPMoviePlayerThumbnailRequest> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<MPMoviePlayerThumbnailRequest> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new MPMoviePlayerThumbnailRequest(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<MPMoviePlayerThumbnailRequest> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (MPMoviePlayerThumbnailRequest i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    MPMoviePlayerThumbnailRequest(NSDictionary data) {
        super(data);
    }
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    

    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    public UIImage getImage() {
        if (has(Keys.Image())) {
            UIImage val = (UIImage) get(Keys.Image());
            return val;
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    public double getTime() {
        if (has(Keys.Time())) {
            NSNumber val = (NSNumber) get(Keys.Time());
            return val.doubleValue();
        }
        return 0;
    }
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    public NSError getError() {
        if (has(Keys.Error())) {
            NSError val = (NSError) get(Keys.Error());
            return val;
        }
        return null;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("MediaPlayer")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
         */
        @Deprecated
        @GlobalValue(symbol="MPMoviePlayerThumbnailImageKey", optional=true)
        public static native NSString Image();
        /**
         * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
         */
        @Deprecated
        @GlobalValue(symbol="MPMoviePlayerThumbnailTimeKey", optional=true)
        public static native NSString Time();
        /**
         * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
         */
        @Deprecated
        @GlobalValue(symbol="MPMoviePlayerThumbnailErrorKey", optional=true)
        public static native NSString Error();
    }
    /*</keys>*/
}
