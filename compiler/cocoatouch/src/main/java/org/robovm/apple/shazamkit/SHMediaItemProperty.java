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
package org.robovm.apple.shazamkit;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ShazamKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/SHMediaItemProperty/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SHMediaItemProperty/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/SHMediaItemProperty/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static SHMediaItemProperty toObject(Class<SHMediaItemProperty> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return SHMediaItemProperty.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(SHMediaItemProperty o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<SHMediaItemProperty> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<SHMediaItemProperty> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(SHMediaItemProperty.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<SHMediaItemProperty> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (SHMediaItemProperty o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty ShazamID = new SHMediaItemProperty("ShazamID");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty Title = new SHMediaItemProperty("Title");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty Subtitle = new SHMediaItemProperty("Subtitle");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty Artist = new SHMediaItemProperty("Artist");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty WebURL = new SHMediaItemProperty("WebURL");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty AppleMusicID = new SHMediaItemProperty("AppleMusicID");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty AppleMusicURL = new SHMediaItemProperty("AppleMusicURL");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty ArtworkURL = new SHMediaItemProperty("ArtworkURL");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty VideoURL = new SHMediaItemProperty("VideoURL");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty ExplicitContent = new SHMediaItemProperty("ExplicitContent");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty Genres = new SHMediaItemProperty("Genres");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty ISRC = new SHMediaItemProperty("ISRC");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final SHMediaItemProperty TimeRanges = new SHMediaItemProperty("TimeRanges");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final SHMediaItemProperty FrequencySkewRanges = new SHMediaItemProperty("FrequencySkewRanges");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final SHMediaItemProperty CreationDate = new SHMediaItemProperty("CreationDate");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty MatchOffset = new SHMediaItemProperty("MatchOffset");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SHMediaItemProperty FrequencySkew = new SHMediaItemProperty("FrequencySkew");
    /*</constants>*/
    
    private static /*<name>*/SHMediaItemProperty/*</name>*/[] values = new /*<name>*/SHMediaItemProperty/*</name>*/[] {/*<value_list>*/ShazamID, Title, Subtitle, Artist, WebURL, AppleMusicID, AppleMusicURL, ArtworkURL, VideoURL, ExplicitContent, Genres, ISRC, TimeRanges, FrequencySkewRanges, CreationDate, MatchOffset, FrequencySkew/*</value_list>*/};
    
    /*<name>*/SHMediaItemProperty/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/SHMediaItemProperty/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/SHMediaItemProperty/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/SHMediaItemProperty/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("ShazamKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemShazamID", optional=true)
        public static native NSString ShazamID();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemTitle", optional=true)
        public static native NSString Title();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemSubtitle", optional=true)
        public static native NSString Subtitle();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemArtist", optional=true)
        public static native NSString Artist();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemWebURL", optional=true)
        public static native NSString WebURL();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemAppleMusicID", optional=true)
        public static native NSString AppleMusicID();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemAppleMusicURL", optional=true)
        public static native NSString AppleMusicURL();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemArtworkURL", optional=true)
        public static native NSString ArtworkURL();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemVideoURL", optional=true)
        public static native NSString VideoURL();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemExplicitContent", optional=true)
        public static native NSString ExplicitContent();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemGenres", optional=true)
        public static native NSString Genres();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemISRC", optional=true)
        public static native NSString ISRC();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemTimeRanges", optional=true)
        public static native NSString TimeRanges();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemFrequencySkewRanges", optional=true)
        public static native NSString FrequencySkewRanges();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemCreationDate", optional=true)
        public static native NSString CreationDate();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemMatchOffset", optional=true)
        public static native NSString MatchOffset();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SHMediaItemFrequencySkew", optional=true)
        public static native NSString FrequencySkew();
        /*</values>*/
    }
}
