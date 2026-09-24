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
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/AVMetadataKey3GPUserData/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataKey3GPUserData/*</name>*/ 
    extends /*<extends>*/AVMetadataKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVMetadataKey3GPUserData/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVMetadataKey3GPUserData toObject(Class<AVMetadataKey3GPUserData> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVMetadataKey3GPUserData.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVMetadataKey3GPUserData o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVMetadataKey3GPUserData> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVMetadataKey3GPUserData> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVMetadataKey3GPUserData.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVMetadataKey3GPUserData> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVMetadataKey3GPUserData o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVMetadataKey3GPUserData Copyright = new AVMetadataKey3GPUserData("Copyright");
    public static final AVMetadataKey3GPUserData Author = new AVMetadataKey3GPUserData("Author");
    public static final AVMetadataKey3GPUserData Performer = new AVMetadataKey3GPUserData("Performer");
    public static final AVMetadataKey3GPUserData Genre = new AVMetadataKey3GPUserData("Genre");
    public static final AVMetadataKey3GPUserData RecordingYear = new AVMetadataKey3GPUserData("RecordingYear");
    public static final AVMetadataKey3GPUserData Location = new AVMetadataKey3GPUserData("Location");
    public static final AVMetadataKey3GPUserData Title = new AVMetadataKey3GPUserData("Title");
    public static final AVMetadataKey3GPUserData Description = new AVMetadataKey3GPUserData("Description");
    public static final AVMetadataKey3GPUserData Collection = new AVMetadataKey3GPUserData("Collection");
    public static final AVMetadataKey3GPUserData UserRating = new AVMetadataKey3GPUserData("UserRating");
    public static final AVMetadataKey3GPUserData Thumbnail = new AVMetadataKey3GPUserData("Thumbnail");
    public static final AVMetadataKey3GPUserData AlbumAndTrack = new AVMetadataKey3GPUserData("AlbumAndTrack");
    public static final AVMetadataKey3GPUserData KeywordList = new AVMetadataKey3GPUserData("KeywordList");
    public static final AVMetadataKey3GPUserData MediaClassification = new AVMetadataKey3GPUserData("MediaClassification");
    public static final AVMetadataKey3GPUserData MediaRating = new AVMetadataKey3GPUserData("MediaRating");
    /*</constants>*/
    
    private static /*<name>*/AVMetadataKey3GPUserData/*</name>*/[] values = new /*<name>*/AVMetadataKey3GPUserData/*</name>*/[] {/*<value_list>*/Copyright, Author, Performer, Genre, RecordingYear, Location, Title, Description, Collection, UserRating, Thumbnail, AlbumAndTrack, KeywordList, MediaClassification, MediaRating/*</value_list>*/};
    
    /*<name>*/AVMetadataKey3GPUserData/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVMetadataKey3GPUserData/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVMetadataKey3GPUserData/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVMetadataKey3GPUserData/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyCopyright", optional=true)
        public static native NSString Copyright();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyAuthor", optional=true)
        public static native NSString Author();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyPerformer", optional=true)
        public static native NSString Performer();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyGenre", optional=true)
        public static native NSString Genre();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyRecordingYear", optional=true)
        public static native NSString RecordingYear();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyLocation", optional=true)
        public static native NSString Location();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyTitle", optional=true)
        public static native NSString Title();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyDescription", optional=true)
        public static native NSString Description();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyCollection", optional=true)
        public static native NSString Collection();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyUserRating", optional=true)
        public static native NSString UserRating();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyThumbnail", optional=true)
        public static native NSString Thumbnail();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyAlbumAndTrack", optional=true)
        public static native NSString AlbumAndTrack();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyKeywordList", optional=true)
        public static native NSString KeywordList();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyMediaClassification", optional=true)
        public static native NSString MediaClassification();
        @GlobalValue(symbol="AVMetadata3GPUserDataKeyMediaRating", optional=true)
        public static native NSString MediaRating();
        /*</values>*/
    }
}
