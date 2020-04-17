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
@Marshaler(/*<name>*/AVMetadataIdentifieriTunesMetadata/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataIdentifieriTunesMetadata/*</name>*/ 
    extends /*<extends>*/AVMetadataIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVMetadataIdentifieriTunesMetadata/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVMetadataIdentifieriTunesMetadata toObject(Class<AVMetadataIdentifieriTunesMetadata> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVMetadataIdentifieriTunesMetadata.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVMetadataIdentifieriTunesMetadata o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVMetadataIdentifieriTunesMetadata> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVMetadataIdentifieriTunesMetadata> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVMetadataIdentifieriTunesMetadata.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVMetadataIdentifieriTunesMetadata> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVMetadataIdentifieriTunesMetadata o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVMetadataIdentifieriTunesMetadata Album = new AVMetadataIdentifieriTunesMetadata("Album");
    public static final AVMetadataIdentifieriTunesMetadata Artist = new AVMetadataIdentifieriTunesMetadata("Artist");
    public static final AVMetadataIdentifieriTunesMetadata UserComment = new AVMetadataIdentifieriTunesMetadata("UserComment");
    public static final AVMetadataIdentifieriTunesMetadata CoverArt = new AVMetadataIdentifieriTunesMetadata("CoverArt");
    public static final AVMetadataIdentifieriTunesMetadata Copyright = new AVMetadataIdentifieriTunesMetadata("Copyright");
    public static final AVMetadataIdentifieriTunesMetadata ReleaseDate = new AVMetadataIdentifieriTunesMetadata("ReleaseDate");
    public static final AVMetadataIdentifieriTunesMetadata EncodedBy = new AVMetadataIdentifieriTunesMetadata("EncodedBy");
    public static final AVMetadataIdentifieriTunesMetadata PredefinedGenre = new AVMetadataIdentifieriTunesMetadata("PredefinedGenre");
    public static final AVMetadataIdentifieriTunesMetadata UserGenre = new AVMetadataIdentifieriTunesMetadata("UserGenre");
    public static final AVMetadataIdentifieriTunesMetadata SongName = new AVMetadataIdentifieriTunesMetadata("SongName");
    public static final AVMetadataIdentifieriTunesMetadata TrackSubTitle = new AVMetadataIdentifieriTunesMetadata("TrackSubTitle");
    public static final AVMetadataIdentifieriTunesMetadata EncodingTool = new AVMetadataIdentifieriTunesMetadata("EncodingTool");
    public static final AVMetadataIdentifieriTunesMetadata Composer = new AVMetadataIdentifieriTunesMetadata("Composer");
    public static final AVMetadataIdentifieriTunesMetadata AlbumArtist = new AVMetadataIdentifieriTunesMetadata("AlbumArtist");
    public static final AVMetadataIdentifieriTunesMetadata AccountKind = new AVMetadataIdentifieriTunesMetadata("AccountKind");
    public static final AVMetadataIdentifieriTunesMetadata AppleID = new AVMetadataIdentifieriTunesMetadata("AppleID");
    public static final AVMetadataIdentifieriTunesMetadata ArtistID = new AVMetadataIdentifieriTunesMetadata("ArtistID");
    public static final AVMetadataIdentifieriTunesMetadata SongID = new AVMetadataIdentifieriTunesMetadata("SongID");
    public static final AVMetadataIdentifieriTunesMetadata DiscCompilation = new AVMetadataIdentifieriTunesMetadata("DiscCompilation");
    public static final AVMetadataIdentifieriTunesMetadata DiscNumber = new AVMetadataIdentifieriTunesMetadata("DiscNumber");
    public static final AVMetadataIdentifieriTunesMetadata GenreID = new AVMetadataIdentifieriTunesMetadata("GenreID");
    public static final AVMetadataIdentifieriTunesMetadata Grouping = new AVMetadataIdentifieriTunesMetadata("Grouping");
    public static final AVMetadataIdentifieriTunesMetadata PlaylistID = new AVMetadataIdentifieriTunesMetadata("PlaylistID");
    public static final AVMetadataIdentifieriTunesMetadata ContentRating = new AVMetadataIdentifieriTunesMetadata("ContentRating");
    public static final AVMetadataIdentifieriTunesMetadata BeatsPerMin = new AVMetadataIdentifieriTunesMetadata("BeatsPerMin");
    public static final AVMetadataIdentifieriTunesMetadata TrackNumber = new AVMetadataIdentifieriTunesMetadata("TrackNumber");
    public static final AVMetadataIdentifieriTunesMetadata ArtDirector = new AVMetadataIdentifieriTunesMetadata("ArtDirector");
    public static final AVMetadataIdentifieriTunesMetadata Arranger = new AVMetadataIdentifieriTunesMetadata("Arranger");
    public static final AVMetadataIdentifieriTunesMetadata Author = new AVMetadataIdentifieriTunesMetadata("Author");
    public static final AVMetadataIdentifieriTunesMetadata Lyrics = new AVMetadataIdentifieriTunesMetadata("Lyrics");
    public static final AVMetadataIdentifieriTunesMetadata Acknowledgement = new AVMetadataIdentifieriTunesMetadata("Acknowledgement");
    public static final AVMetadataIdentifieriTunesMetadata Conductor = new AVMetadataIdentifieriTunesMetadata("Conductor");
    public static final AVMetadataIdentifieriTunesMetadata Description = new AVMetadataIdentifieriTunesMetadata("Description");
    public static final AVMetadataIdentifieriTunesMetadata Director = new AVMetadataIdentifieriTunesMetadata("Director");
    public static final AVMetadataIdentifieriTunesMetadata EQ = new AVMetadataIdentifieriTunesMetadata("EQ");
    public static final AVMetadataIdentifieriTunesMetadata LinerNotes = new AVMetadataIdentifieriTunesMetadata("LinerNotes");
    public static final AVMetadataIdentifieriTunesMetadata RecordCompany = new AVMetadataIdentifieriTunesMetadata("RecordCompany");
    public static final AVMetadataIdentifieriTunesMetadata OriginalArtist = new AVMetadataIdentifieriTunesMetadata("OriginalArtist");
    public static final AVMetadataIdentifieriTunesMetadata PhonogramRights = new AVMetadataIdentifieriTunesMetadata("PhonogramRights");
    public static final AVMetadataIdentifieriTunesMetadata Producer = new AVMetadataIdentifieriTunesMetadata("Producer");
    public static final AVMetadataIdentifieriTunesMetadata Performer = new AVMetadataIdentifieriTunesMetadata("Performer");
    public static final AVMetadataIdentifieriTunesMetadata Publisher = new AVMetadataIdentifieriTunesMetadata("Publisher");
    public static final AVMetadataIdentifieriTunesMetadata SoundEngineer = new AVMetadataIdentifieriTunesMetadata("SoundEngineer");
    public static final AVMetadataIdentifieriTunesMetadata Soloist = new AVMetadataIdentifieriTunesMetadata("Soloist");
    public static final AVMetadataIdentifieriTunesMetadata Credits = new AVMetadataIdentifieriTunesMetadata("Credits");
    public static final AVMetadataIdentifieriTunesMetadata Thanks = new AVMetadataIdentifieriTunesMetadata("Thanks");
    public static final AVMetadataIdentifieriTunesMetadata OnlineExtras = new AVMetadataIdentifieriTunesMetadata("OnlineExtras");
    public static final AVMetadataIdentifieriTunesMetadata ExecProducer = new AVMetadataIdentifieriTunesMetadata("ExecProducer");
    /*</constants>*/
    
    private static /*<name>*/AVMetadataIdentifieriTunesMetadata/*</name>*/[] values = new /*<name>*/AVMetadataIdentifieriTunesMetadata/*</name>*/[] {/*<value_list>*/Album, Artist, UserComment, CoverArt, Copyright, ReleaseDate, EncodedBy, PredefinedGenre, UserGenre, SongName, TrackSubTitle, EncodingTool, Composer, AlbumArtist, AccountKind, AppleID, ArtistID, SongID, DiscCompilation, DiscNumber, GenreID, Grouping, PlaylistID, ContentRating, BeatsPerMin, TrackNumber, ArtDirector, Arranger, Author, Lyrics, Acknowledgement, Conductor, Description, Director, EQ, LinerNotes, RecordCompany, OriginalArtist, PhonogramRights, Producer, Performer, Publisher, SoundEngineer, Soloist, Credits, Thanks, OnlineExtras, ExecProducer/*</value_list>*/};
    
    /*<name>*/AVMetadataIdentifieriTunesMetadata/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVMetadataIdentifieriTunesMetadata/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVMetadataIdentifieriTunesMetadata/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVMetadataIdentifieriTunesMetadata/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataAlbum", optional=true)
        public static native NSString Album();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataArtist", optional=true)
        public static native NSString Artist();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataUserComment", optional=true)
        public static native NSString UserComment();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataCoverArt", optional=true)
        public static native NSString CoverArt();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataCopyright", optional=true)
        public static native NSString Copyright();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataReleaseDate", optional=true)
        public static native NSString ReleaseDate();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataEncodedBy", optional=true)
        public static native NSString EncodedBy();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataPredefinedGenre", optional=true)
        public static native NSString PredefinedGenre();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataUserGenre", optional=true)
        public static native NSString UserGenre();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataSongName", optional=true)
        public static native NSString SongName();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataTrackSubTitle", optional=true)
        public static native NSString TrackSubTitle();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataEncodingTool", optional=true)
        public static native NSString EncodingTool();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataComposer", optional=true)
        public static native NSString Composer();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataAlbumArtist", optional=true)
        public static native NSString AlbumArtist();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataAccountKind", optional=true)
        public static native NSString AccountKind();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataAppleID", optional=true)
        public static native NSString AppleID();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataArtistID", optional=true)
        public static native NSString ArtistID();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataSongID", optional=true)
        public static native NSString SongID();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataDiscCompilation", optional=true)
        public static native NSString DiscCompilation();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataDiscNumber", optional=true)
        public static native NSString DiscNumber();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataGenreID", optional=true)
        public static native NSString GenreID();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataGrouping", optional=true)
        public static native NSString Grouping();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataPlaylistID", optional=true)
        public static native NSString PlaylistID();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataContentRating", optional=true)
        public static native NSString ContentRating();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataBeatsPerMin", optional=true)
        public static native NSString BeatsPerMin();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataTrackNumber", optional=true)
        public static native NSString TrackNumber();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataArtDirector", optional=true)
        public static native NSString ArtDirector();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataArranger", optional=true)
        public static native NSString Arranger();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataAuthor", optional=true)
        public static native NSString Author();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataLyrics", optional=true)
        public static native NSString Lyrics();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataAcknowledgement", optional=true)
        public static native NSString Acknowledgement();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataConductor", optional=true)
        public static native NSString Conductor();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataDescription", optional=true)
        public static native NSString Description();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataDirector", optional=true)
        public static native NSString Director();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataEQ", optional=true)
        public static native NSString EQ();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataLinerNotes", optional=true)
        public static native NSString LinerNotes();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataRecordCompany", optional=true)
        public static native NSString RecordCompany();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataOriginalArtist", optional=true)
        public static native NSString OriginalArtist();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataPhonogramRights", optional=true)
        public static native NSString PhonogramRights();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataProducer", optional=true)
        public static native NSString Producer();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataPerformer", optional=true)
        public static native NSString Performer();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataPublisher", optional=true)
        public static native NSString Publisher();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataSoundEngineer", optional=true)
        public static native NSString SoundEngineer();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataSoloist", optional=true)
        public static native NSString Soloist();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataCredits", optional=true)
        public static native NSString Credits();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataThanks", optional=true)
        public static native NSString Thanks();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataOnlineExtras", optional=true)
        public static native NSString OnlineExtras();
        @GlobalValue(symbol="AVMetadataIdentifieriTunesMetadataExecProducer", optional=true)
        public static native NSString ExecProducer();
        /*</values>*/
    }
}
