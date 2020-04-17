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
@Marshaler(/*<name>*/AVMetadataIdentifierQuickTimeMetadata/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataIdentifierQuickTimeMetadata/*</name>*/ 
    extends /*<extends>*/AVMetadataIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVMetadataIdentifierQuickTimeMetadata/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVMetadataIdentifierQuickTimeMetadata toObject(Class<AVMetadataIdentifierQuickTimeMetadata> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVMetadataIdentifierQuickTimeMetadata.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVMetadataIdentifierQuickTimeMetadata o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVMetadataIdentifierQuickTimeMetadata> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVMetadataIdentifierQuickTimeMetadata> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVMetadataIdentifierQuickTimeMetadata.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVMetadataIdentifierQuickTimeMetadata> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVMetadataIdentifierQuickTimeMetadata o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVMetadataIdentifierQuickTimeMetadata Author = new AVMetadataIdentifierQuickTimeMetadata("Author");
    public static final AVMetadataIdentifierQuickTimeMetadata Comment = new AVMetadataIdentifierQuickTimeMetadata("Comment");
    public static final AVMetadataIdentifierQuickTimeMetadata Copyright = new AVMetadataIdentifierQuickTimeMetadata("Copyright");
    public static final AVMetadataIdentifierQuickTimeMetadata CreationDate = new AVMetadataIdentifierQuickTimeMetadata("CreationDate");
    public static final AVMetadataIdentifierQuickTimeMetadata Director = new AVMetadataIdentifierQuickTimeMetadata("Director");
    public static final AVMetadataIdentifierQuickTimeMetadata DisplayName = new AVMetadataIdentifierQuickTimeMetadata("DisplayName");
    public static final AVMetadataIdentifierQuickTimeMetadata Information = new AVMetadataIdentifierQuickTimeMetadata("Information");
    public static final AVMetadataIdentifierQuickTimeMetadata Keywords = new AVMetadataIdentifierQuickTimeMetadata("Keywords");
    public static final AVMetadataIdentifierQuickTimeMetadata Producer = new AVMetadataIdentifierQuickTimeMetadata("Producer");
    public static final AVMetadataIdentifierQuickTimeMetadata Publisher = new AVMetadataIdentifierQuickTimeMetadata("Publisher");
    public static final AVMetadataIdentifierQuickTimeMetadata Album = new AVMetadataIdentifierQuickTimeMetadata("Album");
    public static final AVMetadataIdentifierQuickTimeMetadata Artist = new AVMetadataIdentifierQuickTimeMetadata("Artist");
    public static final AVMetadataIdentifierQuickTimeMetadata Artwork = new AVMetadataIdentifierQuickTimeMetadata("Artwork");
    public static final AVMetadataIdentifierQuickTimeMetadata Description = new AVMetadataIdentifierQuickTimeMetadata("Description");
    public static final AVMetadataIdentifierQuickTimeMetadata Software = new AVMetadataIdentifierQuickTimeMetadata("Software");
    public static final AVMetadataIdentifierQuickTimeMetadata Year = new AVMetadataIdentifierQuickTimeMetadata("Year");
    public static final AVMetadataIdentifierQuickTimeMetadata Genre = new AVMetadataIdentifierQuickTimeMetadata("Genre");
    public static final AVMetadataIdentifierQuickTimeMetadata iXML = new AVMetadataIdentifierQuickTimeMetadata("iXML");
    public static final AVMetadataIdentifierQuickTimeMetadata LocationISO6709 = new AVMetadataIdentifierQuickTimeMetadata("LocationISO6709");
    public static final AVMetadataIdentifierQuickTimeMetadata Make = new AVMetadataIdentifierQuickTimeMetadata("Make");
    public static final AVMetadataIdentifierQuickTimeMetadata Model = new AVMetadataIdentifierQuickTimeMetadata("Model");
    public static final AVMetadataIdentifierQuickTimeMetadata Arranger = new AVMetadataIdentifierQuickTimeMetadata("Arranger");
    public static final AVMetadataIdentifierQuickTimeMetadata EncodedBy = new AVMetadataIdentifierQuickTimeMetadata("EncodedBy");
    public static final AVMetadataIdentifierQuickTimeMetadata OriginalArtist = new AVMetadataIdentifierQuickTimeMetadata("OriginalArtist");
    public static final AVMetadataIdentifierQuickTimeMetadata Performer = new AVMetadataIdentifierQuickTimeMetadata("Performer");
    public static final AVMetadataIdentifierQuickTimeMetadata Composer = new AVMetadataIdentifierQuickTimeMetadata("Composer");
    public static final AVMetadataIdentifierQuickTimeMetadata Credits = new AVMetadataIdentifierQuickTimeMetadata("Credits");
    public static final AVMetadataIdentifierQuickTimeMetadata PhonogramRights = new AVMetadataIdentifierQuickTimeMetadata("PhonogramRights");
    public static final AVMetadataIdentifierQuickTimeMetadata CameraIdentifier = new AVMetadataIdentifierQuickTimeMetadata("CameraIdentifier");
    public static final AVMetadataIdentifierQuickTimeMetadata CameraFrameReadoutTime = new AVMetadataIdentifierQuickTimeMetadata("CameraFrameReadoutTime");
    public static final AVMetadataIdentifierQuickTimeMetadata Title = new AVMetadataIdentifierQuickTimeMetadata("Title");
    public static final AVMetadataIdentifierQuickTimeMetadata CollectionUser = new AVMetadataIdentifierQuickTimeMetadata("CollectionUser");
    public static final AVMetadataIdentifierQuickTimeMetadata RatingUser = new AVMetadataIdentifierQuickTimeMetadata("RatingUser");
    public static final AVMetadataIdentifierQuickTimeMetadata LocationName = new AVMetadataIdentifierQuickTimeMetadata("LocationName");
    public static final AVMetadataIdentifierQuickTimeMetadata LocationBody = new AVMetadataIdentifierQuickTimeMetadata("LocationBody");
    public static final AVMetadataIdentifierQuickTimeMetadata LocationNote = new AVMetadataIdentifierQuickTimeMetadata("LocationNote");
    public static final AVMetadataIdentifierQuickTimeMetadata LocationRole = new AVMetadataIdentifierQuickTimeMetadata("LocationRole");
    public static final AVMetadataIdentifierQuickTimeMetadata LocationDate = new AVMetadataIdentifierQuickTimeMetadata("LocationDate");
    public static final AVMetadataIdentifierQuickTimeMetadata DirectionFacing = new AVMetadataIdentifierQuickTimeMetadata("DirectionFacing");
    public static final AVMetadataIdentifierQuickTimeMetadata DirectionMotion = new AVMetadataIdentifierQuickTimeMetadata("DirectionMotion");
    public static final AVMetadataIdentifierQuickTimeMetadata PreferredAffineTransform = new AVMetadataIdentifierQuickTimeMetadata("PreferredAffineTransform");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final AVMetadataIdentifierQuickTimeMetadata DetectedFace = new AVMetadataIdentifierQuickTimeMetadata("DetectedFace");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataIdentifierQuickTimeMetadata DetectedHumanBody = new AVMetadataIdentifierQuickTimeMetadata("DetectedHumanBody");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataIdentifierQuickTimeMetadata DetectedCatBody = new AVMetadataIdentifierQuickTimeMetadata("DetectedCatBody");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataIdentifierQuickTimeMetadata DetectedDogBody = new AVMetadataIdentifierQuickTimeMetadata("DetectedDogBody");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataIdentifierQuickTimeMetadata DetectedSalientObject = new AVMetadataIdentifierQuickTimeMetadata("DetectedSalientObject");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final AVMetadataIdentifierQuickTimeMetadata VideoOrientation = new AVMetadataIdentifierQuickTimeMetadata("VideoOrientation");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final AVMetadataIdentifierQuickTimeMetadata ContentIdentifier = new AVMetadataIdentifierQuickTimeMetadata("ContentIdentifier");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataIdentifierQuickTimeMetadata AutoLivePhoto = new AVMetadataIdentifierQuickTimeMetadata("AutoLivePhoto");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataIdentifierQuickTimeMetadata LivePhotoVitalityScore = new AVMetadataIdentifierQuickTimeMetadata("LivePhotoVitalityScore");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataIdentifierQuickTimeMetadata LivePhotoVitalityScoringVersion = new AVMetadataIdentifierQuickTimeMetadata("LivePhotoVitalityScoringVersion");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataIdentifierQuickTimeMetadata SpatialOverCaptureQualityScore = new AVMetadataIdentifierQuickTimeMetadata("SpatialOverCaptureQualityScore");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final AVMetadataIdentifierQuickTimeMetadata SpatialOverCaptureQualityScoringVersion = new AVMetadataIdentifierQuickTimeMetadata("SpatialOverCaptureQualityScoringVersion");
    /*</constants>*/
    
    private static /*<name>*/AVMetadataIdentifierQuickTimeMetadata/*</name>*/[] values = new /*<name>*/AVMetadataIdentifierQuickTimeMetadata/*</name>*/[] {/*<value_list>*/Author, Comment, Copyright, CreationDate, Director, DisplayName, Information, Keywords, Producer, Publisher, Album, Artist, Artwork, Description, Software, Year, Genre, iXML, LocationISO6709, Make, Model, Arranger, EncodedBy, OriginalArtist, Performer, Composer, Credits, PhonogramRights, CameraIdentifier, CameraFrameReadoutTime, Title, CollectionUser, RatingUser, LocationName, LocationBody, LocationNote, LocationRole, LocationDate, DirectionFacing, DirectionMotion, PreferredAffineTransform, DetectedFace, DetectedHumanBody, DetectedCatBody, DetectedDogBody, DetectedSalientObject, VideoOrientation, ContentIdentifier, AutoLivePhoto, LivePhotoVitalityScore, LivePhotoVitalityScoringVersion, SpatialOverCaptureQualityScore, SpatialOverCaptureQualityScoringVersion/*</value_list>*/};
    
    /*<name>*/AVMetadataIdentifierQuickTimeMetadata/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVMetadataIdentifierQuickTimeMetadata/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVMetadataIdentifierQuickTimeMetadata/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVMetadataIdentifierQuickTimeMetadata/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataAuthor", optional=true)
        public static native NSString Author();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataComment", optional=true)
        public static native NSString Comment();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataCopyright", optional=true)
        public static native NSString Copyright();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataCreationDate", optional=true)
        public static native NSString CreationDate();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataDirector", optional=true)
        public static native NSString Director();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataDisplayName", optional=true)
        public static native NSString DisplayName();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataInformation", optional=true)
        public static native NSString Information();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataKeywords", optional=true)
        public static native NSString Keywords();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataProducer", optional=true)
        public static native NSString Producer();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataPublisher", optional=true)
        public static native NSString Publisher();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataAlbum", optional=true)
        public static native NSString Album();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataArtist", optional=true)
        public static native NSString Artist();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataArtwork", optional=true)
        public static native NSString Artwork();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataDescription", optional=true)
        public static native NSString Description();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataSoftware", optional=true)
        public static native NSString Software();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataYear", optional=true)
        public static native NSString Year();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataGenre", optional=true)
        public static native NSString Genre();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataiXML", optional=true)
        public static native NSString iXML();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataLocationISO6709", optional=true)
        public static native NSString LocationISO6709();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataMake", optional=true)
        public static native NSString Make();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataModel", optional=true)
        public static native NSString Model();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataArranger", optional=true)
        public static native NSString Arranger();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataEncodedBy", optional=true)
        public static native NSString EncodedBy();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataOriginalArtist", optional=true)
        public static native NSString OriginalArtist();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataPerformer", optional=true)
        public static native NSString Performer();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataComposer", optional=true)
        public static native NSString Composer();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataCredits", optional=true)
        public static native NSString Credits();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataPhonogramRights", optional=true)
        public static native NSString PhonogramRights();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataCameraIdentifier", optional=true)
        public static native NSString CameraIdentifier();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataCameraFrameReadoutTime", optional=true)
        public static native NSString CameraFrameReadoutTime();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataTitle", optional=true)
        public static native NSString Title();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataCollectionUser", optional=true)
        public static native NSString CollectionUser();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataRatingUser", optional=true)
        public static native NSString RatingUser();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataLocationName", optional=true)
        public static native NSString LocationName();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataLocationBody", optional=true)
        public static native NSString LocationBody();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataLocationNote", optional=true)
        public static native NSString LocationNote();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataLocationRole", optional=true)
        public static native NSString LocationRole();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataLocationDate", optional=true)
        public static native NSString LocationDate();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataDirectionFacing", optional=true)
        public static native NSString DirectionFacing();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataDirectionMotion", optional=true)
        public static native NSString DirectionMotion();
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataPreferredAffineTransform", optional=true)
        public static native NSString PreferredAffineTransform();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataDetectedFace", optional=true)
        public static native NSString DetectedFace();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataDetectedHumanBody", optional=true)
        public static native NSString DetectedHumanBody();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataDetectedCatBody", optional=true)
        public static native NSString DetectedCatBody();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataDetectedDogBody", optional=true)
        public static native NSString DetectedDogBody();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataDetectedSalientObject", optional=true)
        public static native NSString DetectedSalientObject();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataVideoOrientation", optional=true)
        public static native NSString VideoOrientation();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataContentIdentifier", optional=true)
        public static native NSString ContentIdentifier();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataAutoLivePhoto", optional=true)
        public static native NSString AutoLivePhoto();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataLivePhotoVitalityScore", optional=true)
        public static native NSString LivePhotoVitalityScore();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataLivePhotoVitalityScoringVersion", optional=true)
        public static native NSString LivePhotoVitalityScoringVersion();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataSpatialOverCaptureQualityScore", optional=true)
        public static native NSString SpatialOverCaptureQualityScore();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="AVMetadataIdentifierQuickTimeMetadataSpatialOverCaptureQualityScoringVersion", optional=true)
        public static native NSString SpatialOverCaptureQualityScoringVersion();
        /*</values>*/
    }
}
