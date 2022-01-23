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
    public static final SHMediaItemProperty ShazamID = new SHMediaItemProperty("ShazamID");
    public static final SHMediaItemProperty Title = new SHMediaItemProperty("Title");
    public static final SHMediaItemProperty Subtitle = new SHMediaItemProperty("Subtitle");
    public static final SHMediaItemProperty Artist = new SHMediaItemProperty("Artist");
    public static final SHMediaItemProperty WebURL = new SHMediaItemProperty("WebURL");
    public static final SHMediaItemProperty AppleMusicID = new SHMediaItemProperty("AppleMusicID");
    public static final SHMediaItemProperty AppleMusicURL = new SHMediaItemProperty("AppleMusicURL");
    public static final SHMediaItemProperty ArtworkURL = new SHMediaItemProperty("ArtworkURL");
    public static final SHMediaItemProperty VideoURL = new SHMediaItemProperty("VideoURL");
    public static final SHMediaItemProperty ExplicitContent = new SHMediaItemProperty("ExplicitContent");
    public static final SHMediaItemProperty Genres = new SHMediaItemProperty("Genres");
    public static final SHMediaItemProperty ISRC = new SHMediaItemProperty("ISRC");
    public static final SHMediaItemProperty MatchOffset = new SHMediaItemProperty("MatchOffset");
    public static final SHMediaItemProperty FrequencySkew = new SHMediaItemProperty("FrequencySkew");
    /*</constants>*/
    
    private static /*<name>*/SHMediaItemProperty/*</name>*/[] values = new /*<name>*/SHMediaItemProperty/*</name>*/[] {/*<value_list>*/ShazamID, Title, Subtitle, Artist, WebURL, AppleMusicID, AppleMusicURL, ArtworkURL, VideoURL, ExplicitContent, Genres, ISRC, MatchOffset, FrequencySkew/*</value_list>*/};
    
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
        @GlobalValue(symbol="SHMediaItemShazamID", optional=true)
        public static native NSString ShazamID();
        @GlobalValue(symbol="SHMediaItemTitle", optional=true)
        public static native NSString Title();
        @GlobalValue(symbol="SHMediaItemSubtitle", optional=true)
        public static native NSString Subtitle();
        @GlobalValue(symbol="SHMediaItemArtist", optional=true)
        public static native NSString Artist();
        @GlobalValue(symbol="SHMediaItemWebURL", optional=true)
        public static native NSString WebURL();
        @GlobalValue(symbol="SHMediaItemAppleMusicID", optional=true)
        public static native NSString AppleMusicID();
        @GlobalValue(symbol="SHMediaItemAppleMusicURL", optional=true)
        public static native NSString AppleMusicURL();
        @GlobalValue(symbol="SHMediaItemArtworkURL", optional=true)
        public static native NSString ArtworkURL();
        @GlobalValue(symbol="SHMediaItemVideoURL", optional=true)
        public static native NSString VideoURL();
        @GlobalValue(symbol="SHMediaItemExplicitContent", optional=true)
        public static native NSString ExplicitContent();
        @GlobalValue(symbol="SHMediaItemGenres", optional=true)
        public static native NSString Genres();
        @GlobalValue(symbol="SHMediaItemISRC", optional=true)
        public static native NSString ISRC();
        @GlobalValue(symbol="SHMediaItemMatchOffset", optional=true)
        public static native NSString MatchOffset();
        @GlobalValue(symbol="SHMediaItemFrequencySkew", optional=true)
        public static native NSString FrequencySkew();
        /*</values>*/
    }
}
