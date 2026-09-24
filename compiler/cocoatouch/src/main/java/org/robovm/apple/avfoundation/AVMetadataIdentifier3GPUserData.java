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
@Marshaler(/*<name>*/AVMetadataIdentifier3GPUserData/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataIdentifier3GPUserData/*</name>*/ 
    extends /*<extends>*/AVMetadataIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVMetadataIdentifier3GPUserData/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVMetadataIdentifier3GPUserData toObject(Class<AVMetadataIdentifier3GPUserData> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVMetadataIdentifier3GPUserData.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVMetadataIdentifier3GPUserData o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVMetadataIdentifier3GPUserData> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVMetadataIdentifier3GPUserData> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVMetadataIdentifier3GPUserData.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVMetadataIdentifier3GPUserData> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVMetadataIdentifier3GPUserData o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVMetadataIdentifier3GPUserData Copyright = new AVMetadataIdentifier3GPUserData("Copyright");
    public static final AVMetadataIdentifier3GPUserData Author = new AVMetadataIdentifier3GPUserData("Author");
    public static final AVMetadataIdentifier3GPUserData Performer = new AVMetadataIdentifier3GPUserData("Performer");
    public static final AVMetadataIdentifier3GPUserData Genre = new AVMetadataIdentifier3GPUserData("Genre");
    public static final AVMetadataIdentifier3GPUserData RecordingYear = new AVMetadataIdentifier3GPUserData("RecordingYear");
    public static final AVMetadataIdentifier3GPUserData Location = new AVMetadataIdentifier3GPUserData("Location");
    public static final AVMetadataIdentifier3GPUserData Title = new AVMetadataIdentifier3GPUserData("Title");
    public static final AVMetadataIdentifier3GPUserData Description = new AVMetadataIdentifier3GPUserData("Description");
    public static final AVMetadataIdentifier3GPUserData Collection = new AVMetadataIdentifier3GPUserData("Collection");
    public static final AVMetadataIdentifier3GPUserData UserRating = new AVMetadataIdentifier3GPUserData("UserRating");
    public static final AVMetadataIdentifier3GPUserData Thumbnail = new AVMetadataIdentifier3GPUserData("Thumbnail");
    public static final AVMetadataIdentifier3GPUserData AlbumAndTrack = new AVMetadataIdentifier3GPUserData("AlbumAndTrack");
    public static final AVMetadataIdentifier3GPUserData KeywordList = new AVMetadataIdentifier3GPUserData("KeywordList");
    public static final AVMetadataIdentifier3GPUserData MediaClassification = new AVMetadataIdentifier3GPUserData("MediaClassification");
    public static final AVMetadataIdentifier3GPUserData MediaRating = new AVMetadataIdentifier3GPUserData("MediaRating");
    /*</constants>*/
    
    private static /*<name>*/AVMetadataIdentifier3GPUserData/*</name>*/[] values = new /*<name>*/AVMetadataIdentifier3GPUserData/*</name>*/[] {/*<value_list>*/Copyright, Author, Performer, Genre, RecordingYear, Location, Title, Description, Collection, UserRating, Thumbnail, AlbumAndTrack, KeywordList, MediaClassification, MediaRating/*</value_list>*/};
    
    /*<name>*/AVMetadataIdentifier3GPUserData/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVMetadataIdentifier3GPUserData/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVMetadataIdentifier3GPUserData/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVMetadataIdentifier3GPUserData/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataCopyright", optional=true)
        public static native NSString Copyright();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataAuthor", optional=true)
        public static native NSString Author();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataPerformer", optional=true)
        public static native NSString Performer();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataGenre", optional=true)
        public static native NSString Genre();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataRecordingYear", optional=true)
        public static native NSString RecordingYear();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataLocation", optional=true)
        public static native NSString Location();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataTitle", optional=true)
        public static native NSString Title();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataDescription", optional=true)
        public static native NSString Description();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataCollection", optional=true)
        public static native NSString Collection();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataUserRating", optional=true)
        public static native NSString UserRating();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataThumbnail", optional=true)
        public static native NSString Thumbnail();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataAlbumAndTrack", optional=true)
        public static native NSString AlbumAndTrack();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataKeywordList", optional=true)
        public static native NSString KeywordList();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataMediaClassification", optional=true)
        public static native NSString MediaClassification();
        @GlobalValue(symbol="AVMetadataIdentifier3GPUserDataMediaRating", optional=true)
        public static native NSString MediaRating();
        /*</values>*/
    }
}
