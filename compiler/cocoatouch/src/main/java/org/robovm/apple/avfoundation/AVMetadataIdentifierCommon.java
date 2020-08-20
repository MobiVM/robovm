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
@Marshaler(/*<name>*/AVMetadataIdentifierCommon/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataIdentifierCommon/*</name>*/ 
    extends /*<extends>*/AVMetadataIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVMetadataIdentifierCommon/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVMetadataIdentifierCommon toObject(Class<AVMetadataIdentifierCommon> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVMetadataIdentifierCommon.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVMetadataIdentifierCommon o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVMetadataIdentifierCommon> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVMetadataIdentifierCommon> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVMetadataIdentifierCommon.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVMetadataIdentifierCommon> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVMetadataIdentifierCommon o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVMetadataIdentifierCommon Title = new AVMetadataIdentifierCommon("Title");
    public static final AVMetadataIdentifierCommon Creator = new AVMetadataIdentifierCommon("Creator");
    public static final AVMetadataIdentifierCommon Subject = new AVMetadataIdentifierCommon("Subject");
    public static final AVMetadataIdentifierCommon Description = new AVMetadataIdentifierCommon("Description");
    public static final AVMetadataIdentifierCommon Publisher = new AVMetadataIdentifierCommon("Publisher");
    public static final AVMetadataIdentifierCommon Contributor = new AVMetadataIdentifierCommon("Contributor");
    public static final AVMetadataIdentifierCommon CreationDate = new AVMetadataIdentifierCommon("CreationDate");
    public static final AVMetadataIdentifierCommon LastModifiedDate = new AVMetadataIdentifierCommon("LastModifiedDate");
    public static final AVMetadataIdentifierCommon Type = new AVMetadataIdentifierCommon("Type");
    public static final AVMetadataIdentifierCommon Format = new AVMetadataIdentifierCommon("Format");
    public static final AVMetadataIdentifierCommon AssetIdentifier = new AVMetadataIdentifierCommon("AssetIdentifier");
    public static final AVMetadataIdentifierCommon Source = new AVMetadataIdentifierCommon("Source");
    public static final AVMetadataIdentifierCommon Language = new AVMetadataIdentifierCommon("Language");
    public static final AVMetadataIdentifierCommon Relation = new AVMetadataIdentifierCommon("Relation");
    public static final AVMetadataIdentifierCommon Location = new AVMetadataIdentifierCommon("Location");
    public static final AVMetadataIdentifierCommon Copyrights = new AVMetadataIdentifierCommon("Copyrights");
    public static final AVMetadataIdentifierCommon AlbumName = new AVMetadataIdentifierCommon("AlbumName");
    public static final AVMetadataIdentifierCommon Author = new AVMetadataIdentifierCommon("Author");
    public static final AVMetadataIdentifierCommon Artist = new AVMetadataIdentifierCommon("Artist");
    public static final AVMetadataIdentifierCommon Artwork = new AVMetadataIdentifierCommon("Artwork");
    public static final AVMetadataIdentifierCommon Make = new AVMetadataIdentifierCommon("Make");
    public static final AVMetadataIdentifierCommon Model = new AVMetadataIdentifierCommon("Model");
    public static final AVMetadataIdentifierCommon Software = new AVMetadataIdentifierCommon("Software");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final AVMetadataIdentifierCommon AccessibilityDescription = new AVMetadataIdentifierCommon("AccessibilityDescription");
    /*</constants>*/
    
    private static /*<name>*/AVMetadataIdentifierCommon/*</name>*/[] values = new /*<name>*/AVMetadataIdentifierCommon/*</name>*/[] {/*<value_list>*/Title, Creator, Subject, Description, Publisher, Contributor, CreationDate, LastModifiedDate, Type, Format, AssetIdentifier, Source, Language, Relation, Location, Copyrights, AlbumName, Author, Artist, Artwork, Make, Model, Software, AccessibilityDescription/*</value_list>*/};
    
    /*<name>*/AVMetadataIdentifierCommon/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVMetadataIdentifierCommon/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVMetadataIdentifierCommon/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVMetadataIdentifierCommon/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVMetadataCommonIdentifierTitle", optional=true)
        public static native NSString Title();
        @GlobalValue(symbol="AVMetadataCommonIdentifierCreator", optional=true)
        public static native NSString Creator();
        @GlobalValue(symbol="AVMetadataCommonIdentifierSubject", optional=true)
        public static native NSString Subject();
        @GlobalValue(symbol="AVMetadataCommonIdentifierDescription", optional=true)
        public static native NSString Description();
        @GlobalValue(symbol="AVMetadataCommonIdentifierPublisher", optional=true)
        public static native NSString Publisher();
        @GlobalValue(symbol="AVMetadataCommonIdentifierContributor", optional=true)
        public static native NSString Contributor();
        @GlobalValue(symbol="AVMetadataCommonIdentifierCreationDate", optional=true)
        public static native NSString CreationDate();
        @GlobalValue(symbol="AVMetadataCommonIdentifierLastModifiedDate", optional=true)
        public static native NSString LastModifiedDate();
        @GlobalValue(symbol="AVMetadataCommonIdentifierType", optional=true)
        public static native NSString Type();
        @GlobalValue(symbol="AVMetadataCommonIdentifierFormat", optional=true)
        public static native NSString Format();
        @GlobalValue(symbol="AVMetadataCommonIdentifierAssetIdentifier", optional=true)
        public static native NSString AssetIdentifier();
        @GlobalValue(symbol="AVMetadataCommonIdentifierSource", optional=true)
        public static native NSString Source();
        @GlobalValue(symbol="AVMetadataCommonIdentifierLanguage", optional=true)
        public static native NSString Language();
        @GlobalValue(symbol="AVMetadataCommonIdentifierRelation", optional=true)
        public static native NSString Relation();
        @GlobalValue(symbol="AVMetadataCommonIdentifierLocation", optional=true)
        public static native NSString Location();
        @GlobalValue(symbol="AVMetadataCommonIdentifierCopyrights", optional=true)
        public static native NSString Copyrights();
        @GlobalValue(symbol="AVMetadataCommonIdentifierAlbumName", optional=true)
        public static native NSString AlbumName();
        @GlobalValue(symbol="AVMetadataCommonIdentifierAuthor", optional=true)
        public static native NSString Author();
        @GlobalValue(symbol="AVMetadataCommonIdentifierArtist", optional=true)
        public static native NSString Artist();
        @GlobalValue(symbol="AVMetadataCommonIdentifierArtwork", optional=true)
        public static native NSString Artwork();
        @GlobalValue(symbol="AVMetadataCommonIdentifierMake", optional=true)
        public static native NSString Make();
        @GlobalValue(symbol="AVMetadataCommonIdentifierModel", optional=true)
        public static native NSString Model();
        @GlobalValue(symbol="AVMetadataCommonIdentifierSoftware", optional=true)
        public static native NSString Software();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="AVMetadataCommonIdentifierAccessibilityDescription", optional=true)
        public static native NSString AccessibilityDescription();
        /*</values>*/
    }
}
