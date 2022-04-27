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
@Marshaler(/*<name>*/AVMetadataKeyQuickTimeMetadata/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataKeyQuickTimeMetadata/*</name>*/ 
    extends /*<extends>*/AVMetadataKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVMetadataKeyQuickTimeMetadata/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVMetadataKeyQuickTimeMetadata toObject(Class<AVMetadataKeyQuickTimeMetadata> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVMetadataKeyQuickTimeMetadata.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVMetadataKeyQuickTimeMetadata o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVMetadataKeyQuickTimeMetadata> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVMetadataKeyQuickTimeMetadata> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVMetadataKeyQuickTimeMetadata.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVMetadataKeyQuickTimeMetadata> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVMetadataKeyQuickTimeMetadata o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVMetadataKeyQuickTimeMetadata Author = new AVMetadataKeyQuickTimeMetadata("Author");
    public static final AVMetadataKeyQuickTimeMetadata Comment = new AVMetadataKeyQuickTimeMetadata("Comment");
    public static final AVMetadataKeyQuickTimeMetadata Copyright = new AVMetadataKeyQuickTimeMetadata("Copyright");
    public static final AVMetadataKeyQuickTimeMetadata CreationDate = new AVMetadataKeyQuickTimeMetadata("CreationDate");
    public static final AVMetadataKeyQuickTimeMetadata Director = new AVMetadataKeyQuickTimeMetadata("Director");
    public static final AVMetadataKeyQuickTimeMetadata DisplayName = new AVMetadataKeyQuickTimeMetadata("DisplayName");
    public static final AVMetadataKeyQuickTimeMetadata Information = new AVMetadataKeyQuickTimeMetadata("Information");
    public static final AVMetadataKeyQuickTimeMetadata Keywords = new AVMetadataKeyQuickTimeMetadata("Keywords");
    public static final AVMetadataKeyQuickTimeMetadata Producer = new AVMetadataKeyQuickTimeMetadata("Producer");
    public static final AVMetadataKeyQuickTimeMetadata Publisher = new AVMetadataKeyQuickTimeMetadata("Publisher");
    public static final AVMetadataKeyQuickTimeMetadata Album = new AVMetadataKeyQuickTimeMetadata("Album");
    public static final AVMetadataKeyQuickTimeMetadata Artist = new AVMetadataKeyQuickTimeMetadata("Artist");
    public static final AVMetadataKeyQuickTimeMetadata Artwork = new AVMetadataKeyQuickTimeMetadata("Artwork");
    public static final AVMetadataKeyQuickTimeMetadata Description = new AVMetadataKeyQuickTimeMetadata("Description");
    public static final AVMetadataKeyQuickTimeMetadata Software = new AVMetadataKeyQuickTimeMetadata("Software");
    public static final AVMetadataKeyQuickTimeMetadata Year = new AVMetadataKeyQuickTimeMetadata("Year");
    public static final AVMetadataKeyQuickTimeMetadata Genre = new AVMetadataKeyQuickTimeMetadata("Genre");
    public static final AVMetadataKeyQuickTimeMetadata iXML = new AVMetadataKeyQuickTimeMetadata("iXML");
    public static final AVMetadataKeyQuickTimeMetadata LocationISO6709 = new AVMetadataKeyQuickTimeMetadata("LocationISO6709");
    public static final AVMetadataKeyQuickTimeMetadata Make = new AVMetadataKeyQuickTimeMetadata("Make");
    public static final AVMetadataKeyQuickTimeMetadata Model = new AVMetadataKeyQuickTimeMetadata("Model");
    public static final AVMetadataKeyQuickTimeMetadata Arranger = new AVMetadataKeyQuickTimeMetadata("Arranger");
    public static final AVMetadataKeyQuickTimeMetadata EncodedBy = new AVMetadataKeyQuickTimeMetadata("EncodedBy");
    public static final AVMetadataKeyQuickTimeMetadata OriginalArtist = new AVMetadataKeyQuickTimeMetadata("OriginalArtist");
    public static final AVMetadataKeyQuickTimeMetadata Performer = new AVMetadataKeyQuickTimeMetadata("Performer");
    public static final AVMetadataKeyQuickTimeMetadata Composer = new AVMetadataKeyQuickTimeMetadata("Composer");
    public static final AVMetadataKeyQuickTimeMetadata Credits = new AVMetadataKeyQuickTimeMetadata("Credits");
    public static final AVMetadataKeyQuickTimeMetadata PhonogramRights = new AVMetadataKeyQuickTimeMetadata("PhonogramRights");
    public static final AVMetadataKeyQuickTimeMetadata CameraIdentifier = new AVMetadataKeyQuickTimeMetadata("CameraIdentifier");
    public static final AVMetadataKeyQuickTimeMetadata CameraFrameReadoutTime = new AVMetadataKeyQuickTimeMetadata("CameraFrameReadoutTime");
    public static final AVMetadataKeyQuickTimeMetadata Title = new AVMetadataKeyQuickTimeMetadata("Title");
    public static final AVMetadataKeyQuickTimeMetadata CollectionUser = new AVMetadataKeyQuickTimeMetadata("CollectionUser");
    public static final AVMetadataKeyQuickTimeMetadata RatingUser = new AVMetadataKeyQuickTimeMetadata("RatingUser");
    public static final AVMetadataKeyQuickTimeMetadata LocationName = new AVMetadataKeyQuickTimeMetadata("LocationName");
    public static final AVMetadataKeyQuickTimeMetadata LocationBody = new AVMetadataKeyQuickTimeMetadata("LocationBody");
    public static final AVMetadataKeyQuickTimeMetadata LocationNote = new AVMetadataKeyQuickTimeMetadata("LocationNote");
    public static final AVMetadataKeyQuickTimeMetadata LocationRole = new AVMetadataKeyQuickTimeMetadata("LocationRole");
    public static final AVMetadataKeyQuickTimeMetadata LocationDate = new AVMetadataKeyQuickTimeMetadata("LocationDate");
    public static final AVMetadataKeyQuickTimeMetadata DirectionFacing = new AVMetadataKeyQuickTimeMetadata("DirectionFacing");
    public static final AVMetadataKeyQuickTimeMetadata DirectionMotion = new AVMetadataKeyQuickTimeMetadata("DirectionMotion");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final AVMetadataKeyQuickTimeMetadata ContentIdentifier = new AVMetadataKeyQuickTimeMetadata("ContentIdentifier");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final AVMetadataKeyQuickTimeMetadata AccessibilityDescription = new AVMetadataKeyQuickTimeMetadata("AccessibilityDescription");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final AVMetadataKeyQuickTimeMetadata IsMontage = new AVMetadataKeyQuickTimeMetadata("IsMontage");
    /*</constants>*/
    
    private static /*<name>*/AVMetadataKeyQuickTimeMetadata/*</name>*/[] values = new /*<name>*/AVMetadataKeyQuickTimeMetadata/*</name>*/[] {/*<value_list>*/Author, Comment, Copyright, CreationDate, Director, DisplayName, Information, Keywords, Producer, Publisher, Album, Artist, Artwork, Description, Software, Year, Genre, iXML, LocationISO6709, Make, Model, Arranger, EncodedBy, OriginalArtist, Performer, Composer, Credits, PhonogramRights, CameraIdentifier, CameraFrameReadoutTime, Title, CollectionUser, RatingUser, LocationName, LocationBody, LocationNote, LocationRole, LocationDate, DirectionFacing, DirectionMotion, ContentIdentifier, AccessibilityDescription, IsMontage/*</value_list>*/};
    
    /*<name>*/AVMetadataKeyQuickTimeMetadata/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVMetadataKeyQuickTimeMetadata/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVMetadataKeyQuickTimeMetadata/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVMetadataKeyQuickTimeMetadata/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyAuthor", optional=true)
        public static native NSString Author();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyComment", optional=true)
        public static native NSString Comment();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyCopyright", optional=true)
        public static native NSString Copyright();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyCreationDate", optional=true)
        public static native NSString CreationDate();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyDirector", optional=true)
        public static native NSString Director();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyDisplayName", optional=true)
        public static native NSString DisplayName();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyInformation", optional=true)
        public static native NSString Information();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyKeywords", optional=true)
        public static native NSString Keywords();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyProducer", optional=true)
        public static native NSString Producer();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyPublisher", optional=true)
        public static native NSString Publisher();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyAlbum", optional=true)
        public static native NSString Album();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyArtist", optional=true)
        public static native NSString Artist();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyArtwork", optional=true)
        public static native NSString Artwork();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyDescription", optional=true)
        public static native NSString Description();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeySoftware", optional=true)
        public static native NSString Software();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyYear", optional=true)
        public static native NSString Year();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyGenre", optional=true)
        public static native NSString Genre();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyiXML", optional=true)
        public static native NSString iXML();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyLocationISO6709", optional=true)
        public static native NSString LocationISO6709();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyMake", optional=true)
        public static native NSString Make();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyModel", optional=true)
        public static native NSString Model();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyArranger", optional=true)
        public static native NSString Arranger();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyEncodedBy", optional=true)
        public static native NSString EncodedBy();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyOriginalArtist", optional=true)
        public static native NSString OriginalArtist();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyPerformer", optional=true)
        public static native NSString Performer();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyComposer", optional=true)
        public static native NSString Composer();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyCredits", optional=true)
        public static native NSString Credits();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyPhonogramRights", optional=true)
        public static native NSString PhonogramRights();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyCameraIdentifier", optional=true)
        public static native NSString CameraIdentifier();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyCameraFrameReadoutTime", optional=true)
        public static native NSString CameraFrameReadoutTime();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyTitle", optional=true)
        public static native NSString Title();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyCollectionUser", optional=true)
        public static native NSString CollectionUser();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyRatingUser", optional=true)
        public static native NSString RatingUser();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyLocationName", optional=true)
        public static native NSString LocationName();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyLocationBody", optional=true)
        public static native NSString LocationBody();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyLocationNote", optional=true)
        public static native NSString LocationNote();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyLocationRole", optional=true)
        public static native NSString LocationRole();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyLocationDate", optional=true)
        public static native NSString LocationDate();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyDirectionFacing", optional=true)
        public static native NSString DirectionFacing();
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyDirectionMotion", optional=true)
        public static native NSString DirectionMotion();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyContentIdentifier", optional=true)
        public static native NSString ContentIdentifier();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyAccessibilityDescription", optional=true)
        public static native NSString AccessibilityDescription();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVMetadataQuickTimeMetadataKeyIsMontage", optional=true)
        public static native NSString IsMontage();
        /*</values>*/
    }
}
