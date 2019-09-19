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
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/AVMetadataIdentifierQuickTimeUserData/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataIdentifierQuickTimeUserData/*</name>*/ 
    extends /*<extends>*/AVMetadataIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVMetadataIdentifierQuickTimeUserData/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVMetadataIdentifierQuickTimeUserData toObject(Class<AVMetadataIdentifierQuickTimeUserData> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVMetadataIdentifierQuickTimeUserData.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVMetadataIdentifierQuickTimeUserData o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVMetadataIdentifierQuickTimeUserData> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVMetadataIdentifierQuickTimeUserData> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVMetadataIdentifierQuickTimeUserData.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVMetadataIdentifierQuickTimeUserData> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVMetadataIdentifierQuickTimeUserData o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVMetadataIdentifierQuickTimeUserData Album = new AVMetadataIdentifierQuickTimeUserData("Album");
    public static final AVMetadataIdentifierQuickTimeUserData Arranger = new AVMetadataIdentifierQuickTimeUserData("Arranger");
    public static final AVMetadataIdentifierQuickTimeUserData Artist = new AVMetadataIdentifierQuickTimeUserData("Artist");
    public static final AVMetadataIdentifierQuickTimeUserData Author = new AVMetadataIdentifierQuickTimeUserData("Author");
    public static final AVMetadataIdentifierQuickTimeUserData Chapter = new AVMetadataIdentifierQuickTimeUserData("Chapter");
    public static final AVMetadataIdentifierQuickTimeUserData Comment = new AVMetadataIdentifierQuickTimeUserData("Comment");
    public static final AVMetadataIdentifierQuickTimeUserData Composer = new AVMetadataIdentifierQuickTimeUserData("Composer");
    public static final AVMetadataIdentifierQuickTimeUserData Copyright = new AVMetadataIdentifierQuickTimeUserData("Copyright");
    public static final AVMetadataIdentifierQuickTimeUserData CreationDate = new AVMetadataIdentifierQuickTimeUserData("CreationDate");
    public static final AVMetadataIdentifierQuickTimeUserData Description = new AVMetadataIdentifierQuickTimeUserData("Description");
    public static final AVMetadataIdentifierQuickTimeUserData Director = new AVMetadataIdentifierQuickTimeUserData("Director");
    public static final AVMetadataIdentifierQuickTimeUserData Disclaimer = new AVMetadataIdentifierQuickTimeUserData("Disclaimer");
    public static final AVMetadataIdentifierQuickTimeUserData EncodedBy = new AVMetadataIdentifierQuickTimeUserData("EncodedBy");
    public static final AVMetadataIdentifierQuickTimeUserData FullName = new AVMetadataIdentifierQuickTimeUserData("FullName");
    public static final AVMetadataIdentifierQuickTimeUserData Genre = new AVMetadataIdentifierQuickTimeUserData("Genre");
    public static final AVMetadataIdentifierQuickTimeUserData HostComputer = new AVMetadataIdentifierQuickTimeUserData("HostComputer");
    public static final AVMetadataIdentifierQuickTimeUserData Information = new AVMetadataIdentifierQuickTimeUserData("Information");
    public static final AVMetadataIdentifierQuickTimeUserData Keywords = new AVMetadataIdentifierQuickTimeUserData("Keywords");
    public static final AVMetadataIdentifierQuickTimeUserData Make = new AVMetadataIdentifierQuickTimeUserData("Make");
    public static final AVMetadataIdentifierQuickTimeUserData Model = new AVMetadataIdentifierQuickTimeUserData("Model");
    public static final AVMetadataIdentifierQuickTimeUserData OriginalArtist = new AVMetadataIdentifierQuickTimeUserData("OriginalArtist");
    public static final AVMetadataIdentifierQuickTimeUserData OriginalFormat = new AVMetadataIdentifierQuickTimeUserData("OriginalFormat");
    public static final AVMetadataIdentifierQuickTimeUserData OriginalSource = new AVMetadataIdentifierQuickTimeUserData("OriginalSource");
    public static final AVMetadataIdentifierQuickTimeUserData Performers = new AVMetadataIdentifierQuickTimeUserData("Performers");
    public static final AVMetadataIdentifierQuickTimeUserData Producer = new AVMetadataIdentifierQuickTimeUserData("Producer");
    public static final AVMetadataIdentifierQuickTimeUserData Publisher = new AVMetadataIdentifierQuickTimeUserData("Publisher");
    public static final AVMetadataIdentifierQuickTimeUserData Product = new AVMetadataIdentifierQuickTimeUserData("Product");
    public static final AVMetadataIdentifierQuickTimeUserData Software = new AVMetadataIdentifierQuickTimeUserData("Software");
    public static final AVMetadataIdentifierQuickTimeUserData SpecialPlaybackRequirements = new AVMetadataIdentifierQuickTimeUserData("SpecialPlaybackRequirements");
    public static final AVMetadataIdentifierQuickTimeUserData Track = new AVMetadataIdentifierQuickTimeUserData("Track");
    public static final AVMetadataIdentifierQuickTimeUserData Warning = new AVMetadataIdentifierQuickTimeUserData("Warning");
    public static final AVMetadataIdentifierQuickTimeUserData Writer = new AVMetadataIdentifierQuickTimeUserData("Writer");
    public static final AVMetadataIdentifierQuickTimeUserData URLLink = new AVMetadataIdentifierQuickTimeUserData("URLLink");
    public static final AVMetadataIdentifierQuickTimeUserData LocationISO6709 = new AVMetadataIdentifierQuickTimeUserData("LocationISO6709");
    public static final AVMetadataIdentifierQuickTimeUserData TrackName = new AVMetadataIdentifierQuickTimeUserData("TrackName");
    public static final AVMetadataIdentifierQuickTimeUserData Credits = new AVMetadataIdentifierQuickTimeUserData("Credits");
    public static final AVMetadataIdentifierQuickTimeUserData PhonogramRights = new AVMetadataIdentifierQuickTimeUserData("PhonogramRights");
    public static final AVMetadataIdentifierQuickTimeUserData TaggedCharacteristic = new AVMetadataIdentifierQuickTimeUserData("TaggedCharacteristic");
    /*</constants>*/
    
    private static /*<name>*/AVMetadataIdentifierQuickTimeUserData/*</name>*/[] values = new /*<name>*/AVMetadataIdentifierQuickTimeUserData/*</name>*/[] {/*<value_list>*/Album, Arranger, Artist, Author, Chapter, Comment, Composer, Copyright, CreationDate, Description, Director, Disclaimer, EncodedBy, FullName, Genre, HostComputer, Information, Keywords, Make, Model, OriginalArtist, OriginalFormat, OriginalSource, Performers, Producer, Publisher, Product, Software, SpecialPlaybackRequirements, Track, Warning, Writer, URLLink, LocationISO6709, TrackName, Credits, PhonogramRights, TaggedCharacteristic/*</value_list>*/};
    
    /*<name>*/AVMetadataIdentifierQuickTimeUserData/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVMetadataIdentifierQuickTimeUserData/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVMetadataIdentifierQuickTimeUserData/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVMetadataIdentifierQuickTimeUserData/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataAlbum", optional=true)
        public static native NSString Album();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataArranger", optional=true)
        public static native NSString Arranger();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataArtist", optional=true)
        public static native NSString Artist();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataAuthor", optional=true)
        public static native NSString Author();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataChapter", optional=true)
        public static native NSString Chapter();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataComment", optional=true)
        public static native NSString Comment();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataComposer", optional=true)
        public static native NSString Composer();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataCopyright", optional=true)
        public static native NSString Copyright();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataCreationDate", optional=true)
        public static native NSString CreationDate();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataDescription", optional=true)
        public static native NSString Description();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataDirector", optional=true)
        public static native NSString Director();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataDisclaimer", optional=true)
        public static native NSString Disclaimer();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataEncodedBy", optional=true)
        public static native NSString EncodedBy();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataFullName", optional=true)
        public static native NSString FullName();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataGenre", optional=true)
        public static native NSString Genre();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataHostComputer", optional=true)
        public static native NSString HostComputer();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataInformation", optional=true)
        public static native NSString Information();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataKeywords", optional=true)
        public static native NSString Keywords();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataMake", optional=true)
        public static native NSString Make();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataModel", optional=true)
        public static native NSString Model();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataOriginalArtist", optional=true)
        public static native NSString OriginalArtist();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataOriginalFormat", optional=true)
        public static native NSString OriginalFormat();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataOriginalSource", optional=true)
        public static native NSString OriginalSource();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataPerformers", optional=true)
        public static native NSString Performers();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataProducer", optional=true)
        public static native NSString Producer();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataPublisher", optional=true)
        public static native NSString Publisher();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataProduct", optional=true)
        public static native NSString Product();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataSoftware", optional=true)
        public static native NSString Software();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataSpecialPlaybackRequirements", optional=true)
        public static native NSString SpecialPlaybackRequirements();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataTrack", optional=true)
        public static native NSString Track();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataWarning", optional=true)
        public static native NSString Warning();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataWriter", optional=true)
        public static native NSString Writer();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataURLLink", optional=true)
        public static native NSString URLLink();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataLocationISO6709", optional=true)
        public static native NSString LocationISO6709();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataTrackName", optional=true)
        public static native NSString TrackName();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataCredits", optional=true)
        public static native NSString Credits();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataPhonogramRights", optional=true)
        public static native NSString PhonogramRights();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeUserDataTaggedCharacteristic", optional=true)
        public static native NSString TaggedCharacteristic();
        /*</values>*/
    }
}
