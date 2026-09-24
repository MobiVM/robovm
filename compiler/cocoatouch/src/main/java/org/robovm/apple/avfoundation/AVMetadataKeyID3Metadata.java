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
@Marshaler(/*<name>*/AVMetadataKeyID3Metadata/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataKeyID3Metadata/*</name>*/ 
    extends /*<extends>*/AVMetadataKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVMetadataKeyID3Metadata/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVMetadataKeyID3Metadata toObject(Class<AVMetadataKeyID3Metadata> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVMetadataKeyID3Metadata.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVMetadataKeyID3Metadata o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVMetadataKeyID3Metadata> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVMetadataKeyID3Metadata> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVMetadataKeyID3Metadata.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVMetadataKeyID3Metadata> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVMetadataKeyID3Metadata o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVMetadataKeyID3Metadata AudioEncryption = new AVMetadataKeyID3Metadata("AudioEncryption");
    public static final AVMetadataKeyID3Metadata AttachedPicture = new AVMetadataKeyID3Metadata("AttachedPicture");
    public static final AVMetadataKeyID3Metadata AudioSeekPointIndex = new AVMetadataKeyID3Metadata("AudioSeekPointIndex");
    public static final AVMetadataKeyID3Metadata Comments = new AVMetadataKeyID3Metadata("Comments");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final AVMetadataKeyID3Metadata Commercial = new AVMetadataKeyID3Metadata("Commercial");
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVMetadataID3MetadataKeyCommercial
     */
    @Deprecated
    public static final AVMetadataKeyID3Metadata Commerical = new AVMetadataKeyID3Metadata("Commerical");
    public static final AVMetadataKeyID3Metadata Encryption = new AVMetadataKeyID3Metadata("Encryption");
    public static final AVMetadataKeyID3Metadata Equalization = new AVMetadataKeyID3Metadata("Equalization");
    public static final AVMetadataKeyID3Metadata Equalization2 = new AVMetadataKeyID3Metadata("Equalization2");
    public static final AVMetadataKeyID3Metadata EventTimingCodes = new AVMetadataKeyID3Metadata("EventTimingCodes");
    public static final AVMetadataKeyID3Metadata GeneralEncapsulatedObject = new AVMetadataKeyID3Metadata("GeneralEncapsulatedObject");
    public static final AVMetadataKeyID3Metadata GroupIdentifier = new AVMetadataKeyID3Metadata("GroupIdentifier");
    public static final AVMetadataKeyID3Metadata InvolvedPeopleList_v23 = new AVMetadataKeyID3Metadata("InvolvedPeopleList_v23");
    public static final AVMetadataKeyID3Metadata Link = new AVMetadataKeyID3Metadata("Link");
    public static final AVMetadataKeyID3Metadata MusicCDIdentifier = new AVMetadataKeyID3Metadata("MusicCDIdentifier");
    public static final AVMetadataKeyID3Metadata MPEGLocationLookupTable = new AVMetadataKeyID3Metadata("MPEGLocationLookupTable");
    public static final AVMetadataKeyID3Metadata Ownership = new AVMetadataKeyID3Metadata("Ownership");
    public static final AVMetadataKeyID3Metadata Private = new AVMetadataKeyID3Metadata("Private");
    public static final AVMetadataKeyID3Metadata PlayCounter = new AVMetadataKeyID3Metadata("PlayCounter");
    public static final AVMetadataKeyID3Metadata Popularimeter = new AVMetadataKeyID3Metadata("Popularimeter");
    public static final AVMetadataKeyID3Metadata PositionSynchronization = new AVMetadataKeyID3Metadata("PositionSynchronization");
    public static final AVMetadataKeyID3Metadata RecommendedBufferSize = new AVMetadataKeyID3Metadata("RecommendedBufferSize");
    public static final AVMetadataKeyID3Metadata RelativeVolumeAdjustment = new AVMetadataKeyID3Metadata("RelativeVolumeAdjustment");
    public static final AVMetadataKeyID3Metadata RelativeVolumeAdjustment2 = new AVMetadataKeyID3Metadata("RelativeVolumeAdjustment2");
    public static final AVMetadataKeyID3Metadata Reverb = new AVMetadataKeyID3Metadata("Reverb");
    public static final AVMetadataKeyID3Metadata Seek = new AVMetadataKeyID3Metadata("Seek");
    public static final AVMetadataKeyID3Metadata Signature = new AVMetadataKeyID3Metadata("Signature");
    public static final AVMetadataKeyID3Metadata SynchronizedLyric = new AVMetadataKeyID3Metadata("SynchronizedLyric");
    public static final AVMetadataKeyID3Metadata SynchronizedTempoCodes = new AVMetadataKeyID3Metadata("SynchronizedTempoCodes");
    public static final AVMetadataKeyID3Metadata AlbumTitle = new AVMetadataKeyID3Metadata("AlbumTitle");
    public static final AVMetadataKeyID3Metadata BeatsPerMinute = new AVMetadataKeyID3Metadata("BeatsPerMinute");
    public static final AVMetadataKeyID3Metadata Composer = new AVMetadataKeyID3Metadata("Composer");
    public static final AVMetadataKeyID3Metadata ContentType = new AVMetadataKeyID3Metadata("ContentType");
    public static final AVMetadataKeyID3Metadata Copyright = new AVMetadataKeyID3Metadata("Copyright");
    public static final AVMetadataKeyID3Metadata Date = new AVMetadataKeyID3Metadata("Date");
    public static final AVMetadataKeyID3Metadata EncodingTime = new AVMetadataKeyID3Metadata("EncodingTime");
    public static final AVMetadataKeyID3Metadata PlaylistDelay = new AVMetadataKeyID3Metadata("PlaylistDelay");
    public static final AVMetadataKeyID3Metadata OriginalReleaseTime = new AVMetadataKeyID3Metadata("OriginalReleaseTime");
    public static final AVMetadataKeyID3Metadata RecordingTime = new AVMetadataKeyID3Metadata("RecordingTime");
    public static final AVMetadataKeyID3Metadata ReleaseTime = new AVMetadataKeyID3Metadata("ReleaseTime");
    public static final AVMetadataKeyID3Metadata TaggingTime = new AVMetadataKeyID3Metadata("TaggingTime");
    public static final AVMetadataKeyID3Metadata EncodedBy = new AVMetadataKeyID3Metadata("EncodedBy");
    public static final AVMetadataKeyID3Metadata Lyricist = new AVMetadataKeyID3Metadata("Lyricist");
    public static final AVMetadataKeyID3Metadata FileType = new AVMetadataKeyID3Metadata("FileType");
    public static final AVMetadataKeyID3Metadata Time = new AVMetadataKeyID3Metadata("Time");
    public static final AVMetadataKeyID3Metadata InvolvedPeopleList_v24 = new AVMetadataKeyID3Metadata("InvolvedPeopleList_v24");
    public static final AVMetadataKeyID3Metadata ContentGroupDescription = new AVMetadataKeyID3Metadata("ContentGroupDescription");
    public static final AVMetadataKeyID3Metadata TitleDescription = new AVMetadataKeyID3Metadata("TitleDescription");
    public static final AVMetadataKeyID3Metadata SubTitle = new AVMetadataKeyID3Metadata("SubTitle");
    public static final AVMetadataKeyID3Metadata InitialKey = new AVMetadataKeyID3Metadata("InitialKey");
    public static final AVMetadataKeyID3Metadata Language = new AVMetadataKeyID3Metadata("Language");
    public static final AVMetadataKeyID3Metadata Length = new AVMetadataKeyID3Metadata("Length");
    public static final AVMetadataKeyID3Metadata MusicianCreditsList = new AVMetadataKeyID3Metadata("MusicianCreditsList");
    public static final AVMetadataKeyID3Metadata MediaType = new AVMetadataKeyID3Metadata("MediaType");
    public static final AVMetadataKeyID3Metadata Mood = new AVMetadataKeyID3Metadata("Mood");
    public static final AVMetadataKeyID3Metadata OriginalAlbumTitle = new AVMetadataKeyID3Metadata("OriginalAlbumTitle");
    public static final AVMetadataKeyID3Metadata OriginalFilename = new AVMetadataKeyID3Metadata("OriginalFilename");
    public static final AVMetadataKeyID3Metadata OriginalLyricist = new AVMetadataKeyID3Metadata("OriginalLyricist");
    public static final AVMetadataKeyID3Metadata OriginalArtist = new AVMetadataKeyID3Metadata("OriginalArtist");
    public static final AVMetadataKeyID3Metadata OriginalReleaseYear = new AVMetadataKeyID3Metadata("OriginalReleaseYear");
    public static final AVMetadataKeyID3Metadata FileOwner = new AVMetadataKeyID3Metadata("FileOwner");
    public static final AVMetadataKeyID3Metadata LeadPerformer = new AVMetadataKeyID3Metadata("LeadPerformer");
    public static final AVMetadataKeyID3Metadata Band = new AVMetadataKeyID3Metadata("Band");
    public static final AVMetadataKeyID3Metadata Conductor = new AVMetadataKeyID3Metadata("Conductor");
    public static final AVMetadataKeyID3Metadata ModifiedBy = new AVMetadataKeyID3Metadata("ModifiedBy");
    public static final AVMetadataKeyID3Metadata PartOfASet = new AVMetadataKeyID3Metadata("PartOfASet");
    public static final AVMetadataKeyID3Metadata ProducedNotice = new AVMetadataKeyID3Metadata("ProducedNotice");
    public static final AVMetadataKeyID3Metadata Publisher = new AVMetadataKeyID3Metadata("Publisher");
    public static final AVMetadataKeyID3Metadata TrackNumber = new AVMetadataKeyID3Metadata("TrackNumber");
    public static final AVMetadataKeyID3Metadata RecordingDates = new AVMetadataKeyID3Metadata("RecordingDates");
    public static final AVMetadataKeyID3Metadata InternetRadioStationName = new AVMetadataKeyID3Metadata("InternetRadioStationName");
    public static final AVMetadataKeyID3Metadata InternetRadioStationOwner = new AVMetadataKeyID3Metadata("InternetRadioStationOwner");
    public static final AVMetadataKeyID3Metadata Size = new AVMetadataKeyID3Metadata("Size");
    public static final AVMetadataKeyID3Metadata AlbumSortOrder = new AVMetadataKeyID3Metadata("AlbumSortOrder");
    public static final AVMetadataKeyID3Metadata PerformerSortOrder = new AVMetadataKeyID3Metadata("PerformerSortOrder");
    public static final AVMetadataKeyID3Metadata TitleSortOrder = new AVMetadataKeyID3Metadata("TitleSortOrder");
    public static final AVMetadataKeyID3Metadata InternationalStandardRecordingCode = new AVMetadataKeyID3Metadata("InternationalStandardRecordingCode");
    public static final AVMetadataKeyID3Metadata EncodedWith = new AVMetadataKeyID3Metadata("EncodedWith");
    public static final AVMetadataKeyID3Metadata SetSubtitle = new AVMetadataKeyID3Metadata("SetSubtitle");
    public static final AVMetadataKeyID3Metadata Year = new AVMetadataKeyID3Metadata("Year");
    public static final AVMetadataKeyID3Metadata UserText = new AVMetadataKeyID3Metadata("UserText");
    public static final AVMetadataKeyID3Metadata UniqueFileIdentifier = new AVMetadataKeyID3Metadata("UniqueFileIdentifier");
    public static final AVMetadataKeyID3Metadata TermsOfUse = new AVMetadataKeyID3Metadata("TermsOfUse");
    public static final AVMetadataKeyID3Metadata UnsynchronizedLyric = new AVMetadataKeyID3Metadata("UnsynchronizedLyric");
    public static final AVMetadataKeyID3Metadata CommercialInformation = new AVMetadataKeyID3Metadata("CommercialInformation");
    public static final AVMetadataKeyID3Metadata CopyrightInformation = new AVMetadataKeyID3Metadata("CopyrightInformation");
    public static final AVMetadataKeyID3Metadata OfficialAudioFileWebpage = new AVMetadataKeyID3Metadata("OfficialAudioFileWebpage");
    public static final AVMetadataKeyID3Metadata OfficialArtistWebpage = new AVMetadataKeyID3Metadata("OfficialArtistWebpage");
    public static final AVMetadataKeyID3Metadata OfficialAudioSourceWebpage = new AVMetadataKeyID3Metadata("OfficialAudioSourceWebpage");
    public static final AVMetadataKeyID3Metadata OfficialInternetRadioStationHomepage = new AVMetadataKeyID3Metadata("OfficialInternetRadioStationHomepage");
    public static final AVMetadataKeyID3Metadata Payment = new AVMetadataKeyID3Metadata("Payment");
    public static final AVMetadataKeyID3Metadata OfficialPublisherWebpage = new AVMetadataKeyID3Metadata("OfficialPublisherWebpage");
    public static final AVMetadataKeyID3Metadata UserURL = new AVMetadataKeyID3Metadata("UserURL");
    /*</constants>*/
    
    private static /*<name>*/AVMetadataKeyID3Metadata/*</name>*/[] values = new /*<name>*/AVMetadataKeyID3Metadata/*</name>*/[] {/*<value_list>*/AudioEncryption, AttachedPicture, AudioSeekPointIndex, Comments, Commercial, Commerical, Encryption, Equalization, Equalization2, EventTimingCodes, GeneralEncapsulatedObject, GroupIdentifier, InvolvedPeopleList_v23, Link, MusicCDIdentifier, MPEGLocationLookupTable, Ownership, Private, PlayCounter, Popularimeter, PositionSynchronization, RecommendedBufferSize, RelativeVolumeAdjustment, RelativeVolumeAdjustment2, Reverb, Seek, Signature, SynchronizedLyric, SynchronizedTempoCodes, AlbumTitle, BeatsPerMinute, Composer, ContentType, Copyright, Date, EncodingTime, PlaylistDelay, OriginalReleaseTime, RecordingTime, ReleaseTime, TaggingTime, EncodedBy, Lyricist, FileType, Time, InvolvedPeopleList_v24, ContentGroupDescription, TitleDescription, SubTitle, InitialKey, Language, Length, MusicianCreditsList, MediaType, Mood, OriginalAlbumTitle, OriginalFilename, OriginalLyricist, OriginalArtist, OriginalReleaseYear, FileOwner, LeadPerformer, Band, Conductor, ModifiedBy, PartOfASet, ProducedNotice, Publisher, TrackNumber, RecordingDates, InternetRadioStationName, InternetRadioStationOwner, Size, AlbumSortOrder, PerformerSortOrder, TitleSortOrder, InternationalStandardRecordingCode, EncodedWith, SetSubtitle, Year, UserText, UniqueFileIdentifier, TermsOfUse, UnsynchronizedLyric, CommercialInformation, CopyrightInformation, OfficialAudioFileWebpage, OfficialArtistWebpage, OfficialAudioSourceWebpage, OfficialInternetRadioStationHomepage, Payment, OfficialPublisherWebpage, UserURL/*</value_list>*/};
    
    /*<name>*/AVMetadataKeyID3Metadata/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVMetadataKeyID3Metadata/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVMetadataKeyID3Metadata/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVMetadataKeyID3Metadata/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVMetadataID3MetadataKeyAudioEncryption", optional=true)
        public static native NSString AudioEncryption();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyAttachedPicture", optional=true)
        public static native NSString AttachedPicture();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyAudioSeekPointIndex", optional=true)
        public static native NSString AudioSeekPointIndex();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyComments", optional=true)
        public static native NSString Comments();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="AVMetadataID3MetadataKeyCommercial", optional=true)
        public static native NSString Commercial();
        /**
         * @deprecated Deprecated in iOS 9.0. Use AVMetadataID3MetadataKeyCommercial
         */
        @Deprecated
        @GlobalValue(symbol="AVMetadataID3MetadataKeyCommerical", optional=true)
        public static native NSString Commerical();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyEncryption", optional=true)
        public static native NSString Encryption();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyEqualization", optional=true)
        public static native NSString Equalization();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyEqualization2", optional=true)
        public static native NSString Equalization2();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyEventTimingCodes", optional=true)
        public static native NSString EventTimingCodes();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyGeneralEncapsulatedObject", optional=true)
        public static native NSString GeneralEncapsulatedObject();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyGroupIdentifier", optional=true)
        public static native NSString GroupIdentifier();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyInvolvedPeopleList_v23", optional=true)
        public static native NSString InvolvedPeopleList_v23();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyLink", optional=true)
        public static native NSString Link();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyMusicCDIdentifier", optional=true)
        public static native NSString MusicCDIdentifier();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyMPEGLocationLookupTable", optional=true)
        public static native NSString MPEGLocationLookupTable();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyOwnership", optional=true)
        public static native NSString Ownership();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyPrivate", optional=true)
        public static native NSString Private();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyPlayCounter", optional=true)
        public static native NSString PlayCounter();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyPopularimeter", optional=true)
        public static native NSString Popularimeter();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyPositionSynchronization", optional=true)
        public static native NSString PositionSynchronization();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyRecommendedBufferSize", optional=true)
        public static native NSString RecommendedBufferSize();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyRelativeVolumeAdjustment", optional=true)
        public static native NSString RelativeVolumeAdjustment();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyRelativeVolumeAdjustment2", optional=true)
        public static native NSString RelativeVolumeAdjustment2();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyReverb", optional=true)
        public static native NSString Reverb();
        @GlobalValue(symbol="AVMetadataID3MetadataKeySeek", optional=true)
        public static native NSString Seek();
        @GlobalValue(symbol="AVMetadataID3MetadataKeySignature", optional=true)
        public static native NSString Signature();
        @GlobalValue(symbol="AVMetadataID3MetadataKeySynchronizedLyric", optional=true)
        public static native NSString SynchronizedLyric();
        @GlobalValue(symbol="AVMetadataID3MetadataKeySynchronizedTempoCodes", optional=true)
        public static native NSString SynchronizedTempoCodes();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyAlbumTitle", optional=true)
        public static native NSString AlbumTitle();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyBeatsPerMinute", optional=true)
        public static native NSString BeatsPerMinute();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyComposer", optional=true)
        public static native NSString Composer();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyContentType", optional=true)
        public static native NSString ContentType();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyCopyright", optional=true)
        public static native NSString Copyright();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyDate", optional=true)
        public static native NSString Date();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyEncodingTime", optional=true)
        public static native NSString EncodingTime();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyPlaylistDelay", optional=true)
        public static native NSString PlaylistDelay();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyOriginalReleaseTime", optional=true)
        public static native NSString OriginalReleaseTime();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyRecordingTime", optional=true)
        public static native NSString RecordingTime();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyReleaseTime", optional=true)
        public static native NSString ReleaseTime();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyTaggingTime", optional=true)
        public static native NSString TaggingTime();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyEncodedBy", optional=true)
        public static native NSString EncodedBy();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyLyricist", optional=true)
        public static native NSString Lyricist();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyFileType", optional=true)
        public static native NSString FileType();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyTime", optional=true)
        public static native NSString Time();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyInvolvedPeopleList_v24", optional=true)
        public static native NSString InvolvedPeopleList_v24();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyContentGroupDescription", optional=true)
        public static native NSString ContentGroupDescription();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyTitleDescription", optional=true)
        public static native NSString TitleDescription();
        @GlobalValue(symbol="AVMetadataID3MetadataKeySubTitle", optional=true)
        public static native NSString SubTitle();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyInitialKey", optional=true)
        public static native NSString InitialKey();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyLanguage", optional=true)
        public static native NSString Language();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyLength", optional=true)
        public static native NSString Length();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyMusicianCreditsList", optional=true)
        public static native NSString MusicianCreditsList();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyMediaType", optional=true)
        public static native NSString MediaType();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyMood", optional=true)
        public static native NSString Mood();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyOriginalAlbumTitle", optional=true)
        public static native NSString OriginalAlbumTitle();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyOriginalFilename", optional=true)
        public static native NSString OriginalFilename();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyOriginalLyricist", optional=true)
        public static native NSString OriginalLyricist();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyOriginalArtist", optional=true)
        public static native NSString OriginalArtist();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyOriginalReleaseYear", optional=true)
        public static native NSString OriginalReleaseYear();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyFileOwner", optional=true)
        public static native NSString FileOwner();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyLeadPerformer", optional=true)
        public static native NSString LeadPerformer();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyBand", optional=true)
        public static native NSString Band();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyConductor", optional=true)
        public static native NSString Conductor();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyModifiedBy", optional=true)
        public static native NSString ModifiedBy();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyPartOfASet", optional=true)
        public static native NSString PartOfASet();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyProducedNotice", optional=true)
        public static native NSString ProducedNotice();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyPublisher", optional=true)
        public static native NSString Publisher();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyTrackNumber", optional=true)
        public static native NSString TrackNumber();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyRecordingDates", optional=true)
        public static native NSString RecordingDates();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyInternetRadioStationName", optional=true)
        public static native NSString InternetRadioStationName();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyInternetRadioStationOwner", optional=true)
        public static native NSString InternetRadioStationOwner();
        @GlobalValue(symbol="AVMetadataID3MetadataKeySize", optional=true)
        public static native NSString Size();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyAlbumSortOrder", optional=true)
        public static native NSString AlbumSortOrder();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyPerformerSortOrder", optional=true)
        public static native NSString PerformerSortOrder();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyTitleSortOrder", optional=true)
        public static native NSString TitleSortOrder();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyInternationalStandardRecordingCode", optional=true)
        public static native NSString InternationalStandardRecordingCode();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyEncodedWith", optional=true)
        public static native NSString EncodedWith();
        @GlobalValue(symbol="AVMetadataID3MetadataKeySetSubtitle", optional=true)
        public static native NSString SetSubtitle();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyYear", optional=true)
        public static native NSString Year();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyUserText", optional=true)
        public static native NSString UserText();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyUniqueFileIdentifier", optional=true)
        public static native NSString UniqueFileIdentifier();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyTermsOfUse", optional=true)
        public static native NSString TermsOfUse();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyUnsynchronizedLyric", optional=true)
        public static native NSString UnsynchronizedLyric();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyCommercialInformation", optional=true)
        public static native NSString CommercialInformation();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyCopyrightInformation", optional=true)
        public static native NSString CopyrightInformation();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyOfficialAudioFileWebpage", optional=true)
        public static native NSString OfficialAudioFileWebpage();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyOfficialArtistWebpage", optional=true)
        public static native NSString OfficialArtistWebpage();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyOfficialAudioSourceWebpage", optional=true)
        public static native NSString OfficialAudioSourceWebpage();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyOfficialInternetRadioStationHomepage", optional=true)
        public static native NSString OfficialInternetRadioStationHomepage();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyPayment", optional=true)
        public static native NSString Payment();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyOfficialPublisherWebpage", optional=true)
        public static native NSString OfficialPublisherWebpage();
        @GlobalValue(symbol="AVMetadataID3MetadataKeyUserURL", optional=true)
        public static native NSString UserURL();
        /*</values>*/
    }
}
