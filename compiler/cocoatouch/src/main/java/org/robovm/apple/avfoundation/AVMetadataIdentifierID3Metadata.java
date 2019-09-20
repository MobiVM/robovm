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
@Marshaler(/*<name>*/AVMetadataIdentifierID3Metadata/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataIdentifierID3Metadata/*</name>*/ 
    extends /*<extends>*/AVMetadataIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVMetadataIdentifierID3Metadata/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVMetadataIdentifierID3Metadata toObject(Class<AVMetadataIdentifierID3Metadata> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVMetadataIdentifierID3Metadata.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVMetadataIdentifierID3Metadata o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVMetadataIdentifierID3Metadata> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVMetadataIdentifierID3Metadata> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVMetadataIdentifierID3Metadata.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVMetadataIdentifierID3Metadata> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVMetadataIdentifierID3Metadata o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVMetadataIdentifierID3Metadata AudioEncryption = new AVMetadataIdentifierID3Metadata("AudioEncryption");
    public static final AVMetadataIdentifierID3Metadata AttachedPicture = new AVMetadataIdentifierID3Metadata("AttachedPicture");
    public static final AVMetadataIdentifierID3Metadata AudioSeekPointIndex = new AVMetadataIdentifierID3Metadata("AudioSeekPointIndex");
    public static final AVMetadataIdentifierID3Metadata Comments = new AVMetadataIdentifierID3Metadata("Comments");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final AVMetadataIdentifierID3Metadata Commercial = new AVMetadataIdentifierID3Metadata("Commercial");
    /**
     * @deprecated Deprecated in iOS 9.0. No longer supported
     */
    @Deprecated
    public static final AVMetadataIdentifierID3Metadata Commerical = new AVMetadataIdentifierID3Metadata("Commerical");
    public static final AVMetadataIdentifierID3Metadata Encryption = new AVMetadataIdentifierID3Metadata("Encryption");
    public static final AVMetadataIdentifierID3Metadata Equalization = new AVMetadataIdentifierID3Metadata("Equalization");
    public static final AVMetadataIdentifierID3Metadata Equalization2 = new AVMetadataIdentifierID3Metadata("Equalization2");
    public static final AVMetadataIdentifierID3Metadata EventTimingCodes = new AVMetadataIdentifierID3Metadata("EventTimingCodes");
    public static final AVMetadataIdentifierID3Metadata GeneralEncapsulatedObject = new AVMetadataIdentifierID3Metadata("GeneralEncapsulatedObject");
    public static final AVMetadataIdentifierID3Metadata GroupIdentifier = new AVMetadataIdentifierID3Metadata("GroupIdentifier");
    public static final AVMetadataIdentifierID3Metadata InvolvedPeopleList_v23 = new AVMetadataIdentifierID3Metadata("InvolvedPeopleList_v23");
    public static final AVMetadataIdentifierID3Metadata Link = new AVMetadataIdentifierID3Metadata("Link");
    public static final AVMetadataIdentifierID3Metadata MusicCDIdentifier = new AVMetadataIdentifierID3Metadata("MusicCDIdentifier");
    public static final AVMetadataIdentifierID3Metadata MPEGLocationLookupTable = new AVMetadataIdentifierID3Metadata("MPEGLocationLookupTable");
    public static final AVMetadataIdentifierID3Metadata Ownership = new AVMetadataIdentifierID3Metadata("Ownership");
    public static final AVMetadataIdentifierID3Metadata Private = new AVMetadataIdentifierID3Metadata("Private");
    public static final AVMetadataIdentifierID3Metadata PlayCounter = new AVMetadataIdentifierID3Metadata("PlayCounter");
    public static final AVMetadataIdentifierID3Metadata Popularimeter = new AVMetadataIdentifierID3Metadata("Popularimeter");
    public static final AVMetadataIdentifierID3Metadata PositionSynchronization = new AVMetadataIdentifierID3Metadata("PositionSynchronization");
    public static final AVMetadataIdentifierID3Metadata RecommendedBufferSize = new AVMetadataIdentifierID3Metadata("RecommendedBufferSize");
    public static final AVMetadataIdentifierID3Metadata RelativeVolumeAdjustment = new AVMetadataIdentifierID3Metadata("RelativeVolumeAdjustment");
    public static final AVMetadataIdentifierID3Metadata RelativeVolumeAdjustment2 = new AVMetadataIdentifierID3Metadata("RelativeVolumeAdjustment2");
    public static final AVMetadataIdentifierID3Metadata Reverb = new AVMetadataIdentifierID3Metadata("Reverb");
    public static final AVMetadataIdentifierID3Metadata Seek = new AVMetadataIdentifierID3Metadata("Seek");
    public static final AVMetadataIdentifierID3Metadata Signature = new AVMetadataIdentifierID3Metadata("Signature");
    public static final AVMetadataIdentifierID3Metadata SynchronizedLyric = new AVMetadataIdentifierID3Metadata("SynchronizedLyric");
    public static final AVMetadataIdentifierID3Metadata SynchronizedTempoCodes = new AVMetadataIdentifierID3Metadata("SynchronizedTempoCodes");
    public static final AVMetadataIdentifierID3Metadata AlbumTitle = new AVMetadataIdentifierID3Metadata("AlbumTitle");
    public static final AVMetadataIdentifierID3Metadata BeatsPerMinute = new AVMetadataIdentifierID3Metadata("BeatsPerMinute");
    public static final AVMetadataIdentifierID3Metadata Composer = new AVMetadataIdentifierID3Metadata("Composer");
    public static final AVMetadataIdentifierID3Metadata ContentType = new AVMetadataIdentifierID3Metadata("ContentType");
    public static final AVMetadataIdentifierID3Metadata Copyright = new AVMetadataIdentifierID3Metadata("Copyright");
    public static final AVMetadataIdentifierID3Metadata Date = new AVMetadataIdentifierID3Metadata("Date");
    public static final AVMetadataIdentifierID3Metadata EncodingTime = new AVMetadataIdentifierID3Metadata("EncodingTime");
    public static final AVMetadataIdentifierID3Metadata PlaylistDelay = new AVMetadataIdentifierID3Metadata("PlaylistDelay");
    public static final AVMetadataIdentifierID3Metadata OriginalReleaseTime = new AVMetadataIdentifierID3Metadata("OriginalReleaseTime");
    public static final AVMetadataIdentifierID3Metadata RecordingTime = new AVMetadataIdentifierID3Metadata("RecordingTime");
    public static final AVMetadataIdentifierID3Metadata ReleaseTime = new AVMetadataIdentifierID3Metadata("ReleaseTime");
    public static final AVMetadataIdentifierID3Metadata TaggingTime = new AVMetadataIdentifierID3Metadata("TaggingTime");
    public static final AVMetadataIdentifierID3Metadata EncodedBy = new AVMetadataIdentifierID3Metadata("EncodedBy");
    public static final AVMetadataIdentifierID3Metadata Lyricist = new AVMetadataIdentifierID3Metadata("Lyricist");
    public static final AVMetadataIdentifierID3Metadata FileType = new AVMetadataIdentifierID3Metadata("FileType");
    public static final AVMetadataIdentifierID3Metadata Time = new AVMetadataIdentifierID3Metadata("Time");
    public static final AVMetadataIdentifierID3Metadata InvolvedPeopleList_v24 = new AVMetadataIdentifierID3Metadata("InvolvedPeopleList_v24");
    public static final AVMetadataIdentifierID3Metadata ContentGroupDescription = new AVMetadataIdentifierID3Metadata("ContentGroupDescription");
    public static final AVMetadataIdentifierID3Metadata TitleDescription = new AVMetadataIdentifierID3Metadata("TitleDescription");
    public static final AVMetadataIdentifierID3Metadata SubTitle = new AVMetadataIdentifierID3Metadata("SubTitle");
    public static final AVMetadataIdentifierID3Metadata InitialKey = new AVMetadataIdentifierID3Metadata("InitialKey");
    public static final AVMetadataIdentifierID3Metadata Language = new AVMetadataIdentifierID3Metadata("Language");
    public static final AVMetadataIdentifierID3Metadata Length = new AVMetadataIdentifierID3Metadata("Length");
    public static final AVMetadataIdentifierID3Metadata MusicianCreditsList = new AVMetadataIdentifierID3Metadata("MusicianCreditsList");
    public static final AVMetadataIdentifierID3Metadata MediaType = new AVMetadataIdentifierID3Metadata("MediaType");
    public static final AVMetadataIdentifierID3Metadata Mood = new AVMetadataIdentifierID3Metadata("Mood");
    public static final AVMetadataIdentifierID3Metadata OriginalAlbumTitle = new AVMetadataIdentifierID3Metadata("OriginalAlbumTitle");
    public static final AVMetadataIdentifierID3Metadata OriginalFilename = new AVMetadataIdentifierID3Metadata("OriginalFilename");
    public static final AVMetadataIdentifierID3Metadata OriginalLyricist = new AVMetadataIdentifierID3Metadata("OriginalLyricist");
    public static final AVMetadataIdentifierID3Metadata OriginalArtist = new AVMetadataIdentifierID3Metadata("OriginalArtist");
    public static final AVMetadataIdentifierID3Metadata OriginalReleaseYear = new AVMetadataIdentifierID3Metadata("OriginalReleaseYear");
    public static final AVMetadataIdentifierID3Metadata FileOwner = new AVMetadataIdentifierID3Metadata("FileOwner");
    public static final AVMetadataIdentifierID3Metadata LeadPerformer = new AVMetadataIdentifierID3Metadata("LeadPerformer");
    public static final AVMetadataIdentifierID3Metadata Band = new AVMetadataIdentifierID3Metadata("Band");
    public static final AVMetadataIdentifierID3Metadata Conductor = new AVMetadataIdentifierID3Metadata("Conductor");
    public static final AVMetadataIdentifierID3Metadata ModifiedBy = new AVMetadataIdentifierID3Metadata("ModifiedBy");
    public static final AVMetadataIdentifierID3Metadata PartOfASet = new AVMetadataIdentifierID3Metadata("PartOfASet");
    public static final AVMetadataIdentifierID3Metadata ProducedNotice = new AVMetadataIdentifierID3Metadata("ProducedNotice");
    public static final AVMetadataIdentifierID3Metadata Publisher = new AVMetadataIdentifierID3Metadata("Publisher");
    public static final AVMetadataIdentifierID3Metadata TrackNumber = new AVMetadataIdentifierID3Metadata("TrackNumber");
    public static final AVMetadataIdentifierID3Metadata RecordingDates = new AVMetadataIdentifierID3Metadata("RecordingDates");
    public static final AVMetadataIdentifierID3Metadata InternetRadioStationName = new AVMetadataIdentifierID3Metadata("InternetRadioStationName");
    public static final AVMetadataIdentifierID3Metadata InternetRadioStationOwner = new AVMetadataIdentifierID3Metadata("InternetRadioStationOwner");
    public static final AVMetadataIdentifierID3Metadata Size = new AVMetadataIdentifierID3Metadata("Size");
    public static final AVMetadataIdentifierID3Metadata AlbumSortOrder = new AVMetadataIdentifierID3Metadata("AlbumSortOrder");
    public static final AVMetadataIdentifierID3Metadata PerformerSortOrder = new AVMetadataIdentifierID3Metadata("PerformerSortOrder");
    public static final AVMetadataIdentifierID3Metadata TitleSortOrder = new AVMetadataIdentifierID3Metadata("TitleSortOrder");
    public static final AVMetadataIdentifierID3Metadata InternationalStandardRecordingCode = new AVMetadataIdentifierID3Metadata("InternationalStandardRecordingCode");
    public static final AVMetadataIdentifierID3Metadata EncodedWith = new AVMetadataIdentifierID3Metadata("EncodedWith");
    public static final AVMetadataIdentifierID3Metadata SetSubtitle = new AVMetadataIdentifierID3Metadata("SetSubtitle");
    public static final AVMetadataIdentifierID3Metadata Year = new AVMetadataIdentifierID3Metadata("Year");
    public static final AVMetadataIdentifierID3Metadata UserText = new AVMetadataIdentifierID3Metadata("UserText");
    public static final AVMetadataIdentifierID3Metadata UniqueFileIdentifier = new AVMetadataIdentifierID3Metadata("UniqueFileIdentifier");
    public static final AVMetadataIdentifierID3Metadata TermsOfUse = new AVMetadataIdentifierID3Metadata("TermsOfUse");
    public static final AVMetadataIdentifierID3Metadata UnsynchronizedLyric = new AVMetadataIdentifierID3Metadata("UnsynchronizedLyric");
    public static final AVMetadataIdentifierID3Metadata CommercialInformation = new AVMetadataIdentifierID3Metadata("CommercialInformation");
    public static final AVMetadataIdentifierID3Metadata CopyrightInformation = new AVMetadataIdentifierID3Metadata("CopyrightInformation");
    public static final AVMetadataIdentifierID3Metadata OfficialAudioFileWebpage = new AVMetadataIdentifierID3Metadata("OfficialAudioFileWebpage");
    public static final AVMetadataIdentifierID3Metadata OfficialArtistWebpage = new AVMetadataIdentifierID3Metadata("OfficialArtistWebpage");
    public static final AVMetadataIdentifierID3Metadata OfficialAudioSourceWebpage = new AVMetadataIdentifierID3Metadata("OfficialAudioSourceWebpage");
    public static final AVMetadataIdentifierID3Metadata OfficialInternetRadioStationHomepage = new AVMetadataIdentifierID3Metadata("OfficialInternetRadioStationHomepage");
    public static final AVMetadataIdentifierID3Metadata Payment = new AVMetadataIdentifierID3Metadata("Payment");
    public static final AVMetadataIdentifierID3Metadata OfficialPublisherWebpage = new AVMetadataIdentifierID3Metadata("OfficialPublisherWebpage");
    public static final AVMetadataIdentifierID3Metadata UserURL = new AVMetadataIdentifierID3Metadata("UserURL");
    /*</constants>*/
    
    private static /*<name>*/AVMetadataIdentifierID3Metadata/*</name>*/[] values = new /*<name>*/AVMetadataIdentifierID3Metadata/*</name>*/[] {/*<value_list>*/AudioEncryption, AttachedPicture, AudioSeekPointIndex, Comments, Commercial, Commerical, Encryption, Equalization, Equalization2, EventTimingCodes, GeneralEncapsulatedObject, GroupIdentifier, InvolvedPeopleList_v23, Link, MusicCDIdentifier, MPEGLocationLookupTable, Ownership, Private, PlayCounter, Popularimeter, PositionSynchronization, RecommendedBufferSize, RelativeVolumeAdjustment, RelativeVolumeAdjustment2, Reverb, Seek, Signature, SynchronizedLyric, SynchronizedTempoCodes, AlbumTitle, BeatsPerMinute, Composer, ContentType, Copyright, Date, EncodingTime, PlaylistDelay, OriginalReleaseTime, RecordingTime, ReleaseTime, TaggingTime, EncodedBy, Lyricist, FileType, Time, InvolvedPeopleList_v24, ContentGroupDescription, TitleDescription, SubTitle, InitialKey, Language, Length, MusicianCreditsList, MediaType, Mood, OriginalAlbumTitle, OriginalFilename, OriginalLyricist, OriginalArtist, OriginalReleaseYear, FileOwner, LeadPerformer, Band, Conductor, ModifiedBy, PartOfASet, ProducedNotice, Publisher, TrackNumber, RecordingDates, InternetRadioStationName, InternetRadioStationOwner, Size, AlbumSortOrder, PerformerSortOrder, TitleSortOrder, InternationalStandardRecordingCode, EncodedWith, SetSubtitle, Year, UserText, UniqueFileIdentifier, TermsOfUse, UnsynchronizedLyric, CommercialInformation, CopyrightInformation, OfficialAudioFileWebpage, OfficialArtistWebpage, OfficialAudioSourceWebpage, OfficialInternetRadioStationHomepage, Payment, OfficialPublisherWebpage, UserURL/*</value_list>*/};
    
    /*<name>*/AVMetadataIdentifierID3Metadata/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVMetadataIdentifierID3Metadata/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVMetadataIdentifierID3Metadata/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVMetadataIdentifierID3Metadata/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataAudioEncryption", optional=true)
        public static native NSString AudioEncryption();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataAttachedPicture", optional=true)
        public static native NSString AttachedPicture();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataAudioSeekPointIndex", optional=true)
        public static native NSString AudioSeekPointIndex();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataComments", optional=true)
        public static native NSString Comments();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataCommercial", optional=true)
        public static native NSString Commercial();
        /**
         * @deprecated Deprecated in iOS 9.0. No longer supported
         */
        @Deprecated
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataCommerical", optional=true)
        public static native NSString Commerical();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataEncryption", optional=true)
        public static native NSString Encryption();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataEqualization", optional=true)
        public static native NSString Equalization();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataEqualization2", optional=true)
        public static native NSString Equalization2();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataEventTimingCodes", optional=true)
        public static native NSString EventTimingCodes();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataGeneralEncapsulatedObject", optional=true)
        public static native NSString GeneralEncapsulatedObject();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataGroupIdentifier", optional=true)
        public static native NSString GroupIdentifier();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataInvolvedPeopleList_v23", optional=true)
        public static native NSString InvolvedPeopleList_v23();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataLink", optional=true)
        public static native NSString Link();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataMusicCDIdentifier", optional=true)
        public static native NSString MusicCDIdentifier();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataMPEGLocationLookupTable", optional=true)
        public static native NSString MPEGLocationLookupTable();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataOwnership", optional=true)
        public static native NSString Ownership();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataPrivate", optional=true)
        public static native NSString Private();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataPlayCounter", optional=true)
        public static native NSString PlayCounter();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataPopularimeter", optional=true)
        public static native NSString Popularimeter();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataPositionSynchronization", optional=true)
        public static native NSString PositionSynchronization();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataRecommendedBufferSize", optional=true)
        public static native NSString RecommendedBufferSize();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataRelativeVolumeAdjustment", optional=true)
        public static native NSString RelativeVolumeAdjustment();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataRelativeVolumeAdjustment2", optional=true)
        public static native NSString RelativeVolumeAdjustment2();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataReverb", optional=true)
        public static native NSString Reverb();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataSeek", optional=true)
        public static native NSString Seek();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataSignature", optional=true)
        public static native NSString Signature();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataSynchronizedLyric", optional=true)
        public static native NSString SynchronizedLyric();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataSynchronizedTempoCodes", optional=true)
        public static native NSString SynchronizedTempoCodes();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataAlbumTitle", optional=true)
        public static native NSString AlbumTitle();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataBeatsPerMinute", optional=true)
        public static native NSString BeatsPerMinute();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataComposer", optional=true)
        public static native NSString Composer();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataContentType", optional=true)
        public static native NSString ContentType();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataCopyright", optional=true)
        public static native NSString Copyright();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataDate", optional=true)
        public static native NSString Date();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataEncodingTime", optional=true)
        public static native NSString EncodingTime();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataPlaylistDelay", optional=true)
        public static native NSString PlaylistDelay();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataOriginalReleaseTime", optional=true)
        public static native NSString OriginalReleaseTime();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataRecordingTime", optional=true)
        public static native NSString RecordingTime();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataReleaseTime", optional=true)
        public static native NSString ReleaseTime();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataTaggingTime", optional=true)
        public static native NSString TaggingTime();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataEncodedBy", optional=true)
        public static native NSString EncodedBy();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataLyricist", optional=true)
        public static native NSString Lyricist();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataFileType", optional=true)
        public static native NSString FileType();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataTime", optional=true)
        public static native NSString Time();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataInvolvedPeopleList_v24", optional=true)
        public static native NSString InvolvedPeopleList_v24();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataContentGroupDescription", optional=true)
        public static native NSString ContentGroupDescription();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataTitleDescription", optional=true)
        public static native NSString TitleDescription();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataSubTitle", optional=true)
        public static native NSString SubTitle();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataInitialKey", optional=true)
        public static native NSString InitialKey();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataLanguage", optional=true)
        public static native NSString Language();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataLength", optional=true)
        public static native NSString Length();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataMusicianCreditsList", optional=true)
        public static native NSString MusicianCreditsList();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataMediaType", optional=true)
        public static native NSString MediaType();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataMood", optional=true)
        public static native NSString Mood();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataOriginalAlbumTitle", optional=true)
        public static native NSString OriginalAlbumTitle();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataOriginalFilename", optional=true)
        public static native NSString OriginalFilename();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataOriginalLyricist", optional=true)
        public static native NSString OriginalLyricist();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataOriginalArtist", optional=true)
        public static native NSString OriginalArtist();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataOriginalReleaseYear", optional=true)
        public static native NSString OriginalReleaseYear();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataFileOwner", optional=true)
        public static native NSString FileOwner();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataLeadPerformer", optional=true)
        public static native NSString LeadPerformer();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataBand", optional=true)
        public static native NSString Band();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataConductor", optional=true)
        public static native NSString Conductor();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataModifiedBy", optional=true)
        public static native NSString ModifiedBy();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataPartOfASet", optional=true)
        public static native NSString PartOfASet();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataProducedNotice", optional=true)
        public static native NSString ProducedNotice();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataPublisher", optional=true)
        public static native NSString Publisher();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataTrackNumber", optional=true)
        public static native NSString TrackNumber();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataRecordingDates", optional=true)
        public static native NSString RecordingDates();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataInternetRadioStationName", optional=true)
        public static native NSString InternetRadioStationName();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataInternetRadioStationOwner", optional=true)
        public static native NSString InternetRadioStationOwner();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataSize", optional=true)
        public static native NSString Size();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataAlbumSortOrder", optional=true)
        public static native NSString AlbumSortOrder();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataPerformerSortOrder", optional=true)
        public static native NSString PerformerSortOrder();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataTitleSortOrder", optional=true)
        public static native NSString TitleSortOrder();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataInternationalStandardRecordingCode", optional=true)
        public static native NSString InternationalStandardRecordingCode();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataEncodedWith", optional=true)
        public static native NSString EncodedWith();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataSetSubtitle", optional=true)
        public static native NSString SetSubtitle();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataYear", optional=true)
        public static native NSString Year();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataUserText", optional=true)
        public static native NSString UserText();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataUniqueFileIdentifier", optional=true)
        public static native NSString UniqueFileIdentifier();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataTermsOfUse", optional=true)
        public static native NSString TermsOfUse();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataUnsynchronizedLyric", optional=true)
        public static native NSString UnsynchronizedLyric();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataCommercialInformation", optional=true)
        public static native NSString CommercialInformation();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataCopyrightInformation", optional=true)
        public static native NSString CopyrightInformation();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataOfficialAudioFileWebpage", optional=true)
        public static native NSString OfficialAudioFileWebpage();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataOfficialArtistWebpage", optional=true)
        public static native NSString OfficialArtistWebpage();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataOfficialAudioSourceWebpage", optional=true)
        public static native NSString OfficialAudioSourceWebpage();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataOfficialInternetRadioStationHomepage", optional=true)
        public static native NSString OfficialInternetRadioStationHomepage();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataPayment", optional=true)
        public static native NSString Payment();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataOfficialPublisherWebpage", optional=true)
        public static native NSString OfficialPublisherWebpage();
        @GlobalValue(symbol="AVMetadataIdentifierID3MetadataUserURL", optional=true)
        public static native NSString UserURL();
        /*</values>*/
    }
}
