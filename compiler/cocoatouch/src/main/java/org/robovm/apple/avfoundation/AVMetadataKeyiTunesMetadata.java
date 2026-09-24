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
@Marshaler(/*<name>*/AVMetadataKeyiTunesMetadata/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataKeyiTunesMetadata/*</name>*/ 
    extends /*<extends>*/AVMetadataKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVMetadataKeyiTunesMetadata/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVMetadataKeyiTunesMetadata toObject(Class<AVMetadataKeyiTunesMetadata> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVMetadataKeyiTunesMetadata.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVMetadataKeyiTunesMetadata o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVMetadataKeyiTunesMetadata> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVMetadataKeyiTunesMetadata> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVMetadataKeyiTunesMetadata.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVMetadataKeyiTunesMetadata> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVMetadataKeyiTunesMetadata o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVMetadataKeyiTunesMetadata Album = new AVMetadataKeyiTunesMetadata("Album");
    public static final AVMetadataKeyiTunesMetadata Artist = new AVMetadataKeyiTunesMetadata("Artist");
    public static final AVMetadataKeyiTunesMetadata UserComment = new AVMetadataKeyiTunesMetadata("UserComment");
    public static final AVMetadataKeyiTunesMetadata CoverArt = new AVMetadataKeyiTunesMetadata("CoverArt");
    public static final AVMetadataKeyiTunesMetadata Copyright = new AVMetadataKeyiTunesMetadata("Copyright");
    public static final AVMetadataKeyiTunesMetadata ReleaseDate = new AVMetadataKeyiTunesMetadata("ReleaseDate");
    public static final AVMetadataKeyiTunesMetadata EncodedBy = new AVMetadataKeyiTunesMetadata("EncodedBy");
    public static final AVMetadataKeyiTunesMetadata PredefinedGenre = new AVMetadataKeyiTunesMetadata("PredefinedGenre");
    public static final AVMetadataKeyiTunesMetadata UserGenre = new AVMetadataKeyiTunesMetadata("UserGenre");
    public static final AVMetadataKeyiTunesMetadata SongName = new AVMetadataKeyiTunesMetadata("SongName");
    public static final AVMetadataKeyiTunesMetadata TrackSubTitle = new AVMetadataKeyiTunesMetadata("TrackSubTitle");
    public static final AVMetadataKeyiTunesMetadata EncodingTool = new AVMetadataKeyiTunesMetadata("EncodingTool");
    public static final AVMetadataKeyiTunesMetadata Composer = new AVMetadataKeyiTunesMetadata("Composer");
    public static final AVMetadataKeyiTunesMetadata AlbumArtist = new AVMetadataKeyiTunesMetadata("AlbumArtist");
    public static final AVMetadataKeyiTunesMetadata AccountKind = new AVMetadataKeyiTunesMetadata("AccountKind");
    public static final AVMetadataKeyiTunesMetadata AppleID = new AVMetadataKeyiTunesMetadata("AppleID");
    public static final AVMetadataKeyiTunesMetadata ArtistID = new AVMetadataKeyiTunesMetadata("ArtistID");
    public static final AVMetadataKeyiTunesMetadata SongID = new AVMetadataKeyiTunesMetadata("SongID");
    public static final AVMetadataKeyiTunesMetadata DiscCompilation = new AVMetadataKeyiTunesMetadata("DiscCompilation");
    public static final AVMetadataKeyiTunesMetadata DiscNumber = new AVMetadataKeyiTunesMetadata("DiscNumber");
    public static final AVMetadataKeyiTunesMetadata GenreID = new AVMetadataKeyiTunesMetadata("GenreID");
    public static final AVMetadataKeyiTunesMetadata Grouping = new AVMetadataKeyiTunesMetadata("Grouping");
    public static final AVMetadataKeyiTunesMetadata PlaylistID = new AVMetadataKeyiTunesMetadata("PlaylistID");
    public static final AVMetadataKeyiTunesMetadata ContentRating = new AVMetadataKeyiTunesMetadata("ContentRating");
    public static final AVMetadataKeyiTunesMetadata BeatsPerMin = new AVMetadataKeyiTunesMetadata("BeatsPerMin");
    public static final AVMetadataKeyiTunesMetadata TrackNumber = new AVMetadataKeyiTunesMetadata("TrackNumber");
    public static final AVMetadataKeyiTunesMetadata ArtDirector = new AVMetadataKeyiTunesMetadata("ArtDirector");
    public static final AVMetadataKeyiTunesMetadata Arranger = new AVMetadataKeyiTunesMetadata("Arranger");
    public static final AVMetadataKeyiTunesMetadata Author = new AVMetadataKeyiTunesMetadata("Author");
    public static final AVMetadataKeyiTunesMetadata Lyrics = new AVMetadataKeyiTunesMetadata("Lyrics");
    public static final AVMetadataKeyiTunesMetadata Acknowledgement = new AVMetadataKeyiTunesMetadata("Acknowledgement");
    public static final AVMetadataKeyiTunesMetadata Conductor = new AVMetadataKeyiTunesMetadata("Conductor");
    public static final AVMetadataKeyiTunesMetadata Description = new AVMetadataKeyiTunesMetadata("Description");
    public static final AVMetadataKeyiTunesMetadata Director = new AVMetadataKeyiTunesMetadata("Director");
    public static final AVMetadataKeyiTunesMetadata EQ = new AVMetadataKeyiTunesMetadata("EQ");
    public static final AVMetadataKeyiTunesMetadata LinerNotes = new AVMetadataKeyiTunesMetadata("LinerNotes");
    public static final AVMetadataKeyiTunesMetadata RecordCompany = new AVMetadataKeyiTunesMetadata("RecordCompany");
    public static final AVMetadataKeyiTunesMetadata OriginalArtist = new AVMetadataKeyiTunesMetadata("OriginalArtist");
    public static final AVMetadataKeyiTunesMetadata PhonogramRights = new AVMetadataKeyiTunesMetadata("PhonogramRights");
    public static final AVMetadataKeyiTunesMetadata Producer = new AVMetadataKeyiTunesMetadata("Producer");
    public static final AVMetadataKeyiTunesMetadata Performer = new AVMetadataKeyiTunesMetadata("Performer");
    public static final AVMetadataKeyiTunesMetadata Publisher = new AVMetadataKeyiTunesMetadata("Publisher");
    public static final AVMetadataKeyiTunesMetadata SoundEngineer = new AVMetadataKeyiTunesMetadata("SoundEngineer");
    public static final AVMetadataKeyiTunesMetadata Soloist = new AVMetadataKeyiTunesMetadata("Soloist");
    public static final AVMetadataKeyiTunesMetadata Credits = new AVMetadataKeyiTunesMetadata("Credits");
    public static final AVMetadataKeyiTunesMetadata Thanks = new AVMetadataKeyiTunesMetadata("Thanks");
    public static final AVMetadataKeyiTunesMetadata OnlineExtras = new AVMetadataKeyiTunesMetadata("OnlineExtras");
    public static final AVMetadataKeyiTunesMetadata ExecProducer = new AVMetadataKeyiTunesMetadata("ExecProducer");
    /*</constants>*/
    
    private static /*<name>*/AVMetadataKeyiTunesMetadata/*</name>*/[] values = new /*<name>*/AVMetadataKeyiTunesMetadata/*</name>*/[] {/*<value_list>*/Album, Artist, UserComment, CoverArt, Copyright, ReleaseDate, EncodedBy, PredefinedGenre, UserGenre, SongName, TrackSubTitle, EncodingTool, Composer, AlbumArtist, AccountKind, AppleID, ArtistID, SongID, DiscCompilation, DiscNumber, GenreID, Grouping, PlaylistID, ContentRating, BeatsPerMin, TrackNumber, ArtDirector, Arranger, Author, Lyrics, Acknowledgement, Conductor, Description, Director, EQ, LinerNotes, RecordCompany, OriginalArtist, PhonogramRights, Producer, Performer, Publisher, SoundEngineer, Soloist, Credits, Thanks, OnlineExtras, ExecProducer/*</value_list>*/};
    
    /*<name>*/AVMetadataKeyiTunesMetadata/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVMetadataKeyiTunesMetadata/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVMetadataKeyiTunesMetadata/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVMetadataKeyiTunesMetadata/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyAlbum", optional=true)
        public static native NSString Album();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyArtist", optional=true)
        public static native NSString Artist();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyUserComment", optional=true)
        public static native NSString UserComment();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyCoverArt", optional=true)
        public static native NSString CoverArt();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyCopyright", optional=true)
        public static native NSString Copyright();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyReleaseDate", optional=true)
        public static native NSString ReleaseDate();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyEncodedBy", optional=true)
        public static native NSString EncodedBy();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyPredefinedGenre", optional=true)
        public static native NSString PredefinedGenre();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyUserGenre", optional=true)
        public static native NSString UserGenre();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeySongName", optional=true)
        public static native NSString SongName();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyTrackSubTitle", optional=true)
        public static native NSString TrackSubTitle();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyEncodingTool", optional=true)
        public static native NSString EncodingTool();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyComposer", optional=true)
        public static native NSString Composer();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyAlbumArtist", optional=true)
        public static native NSString AlbumArtist();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyAccountKind", optional=true)
        public static native NSString AccountKind();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyAppleID", optional=true)
        public static native NSString AppleID();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyArtistID", optional=true)
        public static native NSString ArtistID();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeySongID", optional=true)
        public static native NSString SongID();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyDiscCompilation", optional=true)
        public static native NSString DiscCompilation();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyDiscNumber", optional=true)
        public static native NSString DiscNumber();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyGenreID", optional=true)
        public static native NSString GenreID();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyGrouping", optional=true)
        public static native NSString Grouping();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyPlaylistID", optional=true)
        public static native NSString PlaylistID();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyContentRating", optional=true)
        public static native NSString ContentRating();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyBeatsPerMin", optional=true)
        public static native NSString BeatsPerMin();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyTrackNumber", optional=true)
        public static native NSString TrackNumber();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyArtDirector", optional=true)
        public static native NSString ArtDirector();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyArranger", optional=true)
        public static native NSString Arranger();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyAuthor", optional=true)
        public static native NSString Author();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyLyrics", optional=true)
        public static native NSString Lyrics();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyAcknowledgement", optional=true)
        public static native NSString Acknowledgement();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyConductor", optional=true)
        public static native NSString Conductor();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyDescription", optional=true)
        public static native NSString Description();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyDirector", optional=true)
        public static native NSString Director();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyEQ", optional=true)
        public static native NSString EQ();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyLinerNotes", optional=true)
        public static native NSString LinerNotes();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyRecordCompany", optional=true)
        public static native NSString RecordCompany();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyOriginalArtist", optional=true)
        public static native NSString OriginalArtist();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyPhonogramRights", optional=true)
        public static native NSString PhonogramRights();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyProducer", optional=true)
        public static native NSString Producer();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyPerformer", optional=true)
        public static native NSString Performer();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyPublisher", optional=true)
        public static native NSString Publisher();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeySoundEngineer", optional=true)
        public static native NSString SoundEngineer();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeySoloist", optional=true)
        public static native NSString Soloist();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyCredits", optional=true)
        public static native NSString Credits();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyThanks", optional=true)
        public static native NSString Thanks();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyOnlineExtras", optional=true)
        public static native NSString OnlineExtras();
        @GlobalValue(symbol="AVMetadataiTunesMetadataKeyExecProducer", optional=true)
        public static native NSString ExecProducer();
        /*</values>*/
    }
}
