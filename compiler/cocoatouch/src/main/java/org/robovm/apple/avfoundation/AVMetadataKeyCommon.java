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
@Marshaler(/*<name>*/AVMetadataKeyCommon/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMetadataKeyCommon/*</name>*/ 
    extends /*<extends>*/AVMetadataKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVMetadataKeyCommon/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVMetadataKeyCommon toObject(Class<AVMetadataKeyCommon> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVMetadataKeyCommon.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVMetadataKeyCommon o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVMetadataKeyCommon> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVMetadataKeyCommon> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVMetadataKeyCommon.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVMetadataKeyCommon> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVMetadataKeyCommon o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final AVMetadataKeyCommon Title = new AVMetadataKeyCommon("Title");
    public static final AVMetadataKeyCommon Creator = new AVMetadataKeyCommon("Creator");
    public static final AVMetadataKeyCommon Subject = new AVMetadataKeyCommon("Subject");
    public static final AVMetadataKeyCommon Description = new AVMetadataKeyCommon("Description");
    public static final AVMetadataKeyCommon Publisher = new AVMetadataKeyCommon("Publisher");
    public static final AVMetadataKeyCommon Contributor = new AVMetadataKeyCommon("Contributor");
    public static final AVMetadataKeyCommon CreationDate = new AVMetadataKeyCommon("CreationDate");
    public static final AVMetadataKeyCommon LastModifiedDate = new AVMetadataKeyCommon("LastModifiedDate");
    public static final AVMetadataKeyCommon Type = new AVMetadataKeyCommon("Type");
    public static final AVMetadataKeyCommon Format = new AVMetadataKeyCommon("Format");
    public static final AVMetadataKeyCommon Identifier = new AVMetadataKeyCommon("Identifier");
    public static final AVMetadataKeyCommon Source = new AVMetadataKeyCommon("Source");
    public static final AVMetadataKeyCommon Language = new AVMetadataKeyCommon("Language");
    public static final AVMetadataKeyCommon Relation = new AVMetadataKeyCommon("Relation");
    public static final AVMetadataKeyCommon Location = new AVMetadataKeyCommon("Location");
    public static final AVMetadataKeyCommon Copyrights = new AVMetadataKeyCommon("Copyrights");
    public static final AVMetadataKeyCommon AlbumName = new AVMetadataKeyCommon("AlbumName");
    public static final AVMetadataKeyCommon Author = new AVMetadataKeyCommon("Author");
    public static final AVMetadataKeyCommon Artist = new AVMetadataKeyCommon("Artist");
    public static final AVMetadataKeyCommon Artwork = new AVMetadataKeyCommon("Artwork");
    public static final AVMetadataKeyCommon Make = new AVMetadataKeyCommon("Make");
    public static final AVMetadataKeyCommon Model = new AVMetadataKeyCommon("Model");
    public static final AVMetadataKeyCommon Software = new AVMetadataKeyCommon("Software");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final AVMetadataKeyCommon AccessibilityDescription = new AVMetadataKeyCommon("AccessibilityDescription");
    /*</constants>*/
    
    private static /*<name>*/AVMetadataKeyCommon/*</name>*/[] values = new /*<name>*/AVMetadataKeyCommon/*</name>*/[] {/*<value_list>*/Title, Creator, Subject, Description, Publisher, Contributor, CreationDate, LastModifiedDate, Type, Format, Identifier, Source, Language, Relation, Location, Copyrights, AlbumName, Author, Artist, Artwork, Make, Model, Software, AccessibilityDescription/*</value_list>*/};
    
    /*<name>*/AVMetadataKeyCommon/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVMetadataKeyCommon/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVMetadataKeyCommon/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVMetadataKeyCommon/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="AVMetadataCommonKeyTitle", optional=true)
        public static native NSString Title();
        @GlobalValue(symbol="AVMetadataCommonKeyCreator", optional=true)
        public static native NSString Creator();
        @GlobalValue(symbol="AVMetadataCommonKeySubject", optional=true)
        public static native NSString Subject();
        @GlobalValue(symbol="AVMetadataCommonKeyDescription", optional=true)
        public static native NSString Description();
        @GlobalValue(symbol="AVMetadataCommonKeyPublisher", optional=true)
        public static native NSString Publisher();
        @GlobalValue(symbol="AVMetadataCommonKeyContributor", optional=true)
        public static native NSString Contributor();
        @GlobalValue(symbol="AVMetadataCommonKeyCreationDate", optional=true)
        public static native NSString CreationDate();
        @GlobalValue(symbol="AVMetadataCommonKeyLastModifiedDate", optional=true)
        public static native NSString LastModifiedDate();
        @GlobalValue(symbol="AVMetadataCommonKeyType", optional=true)
        public static native NSString Type();
        @GlobalValue(symbol="AVMetadataCommonKeyFormat", optional=true)
        public static native NSString Format();
        @GlobalValue(symbol="AVMetadataCommonKeyIdentifier", optional=true)
        public static native NSString Identifier();
        @GlobalValue(symbol="AVMetadataCommonKeySource", optional=true)
        public static native NSString Source();
        @GlobalValue(symbol="AVMetadataCommonKeyLanguage", optional=true)
        public static native NSString Language();
        @GlobalValue(symbol="AVMetadataCommonKeyRelation", optional=true)
        public static native NSString Relation();
        @GlobalValue(symbol="AVMetadataCommonKeyLocation", optional=true)
        public static native NSString Location();
        @GlobalValue(symbol="AVMetadataCommonKeyCopyrights", optional=true)
        public static native NSString Copyrights();
        @GlobalValue(symbol="AVMetadataCommonKeyAlbumName", optional=true)
        public static native NSString AlbumName();
        @GlobalValue(symbol="AVMetadataCommonKeyAuthor", optional=true)
        public static native NSString Author();
        @GlobalValue(symbol="AVMetadataCommonKeyArtist", optional=true)
        public static native NSString Artist();
        @GlobalValue(symbol="AVMetadataCommonKeyArtwork", optional=true)
        public static native NSString Artwork();
        @GlobalValue(symbol="AVMetadataCommonKeyMake", optional=true)
        public static native NSString Make();
        @GlobalValue(symbol="AVMetadataCommonKeyModel", optional=true)
        public static native NSString Model();
        @GlobalValue(symbol="AVMetadataCommonKeySoftware", optional=true)
        public static native NSString Software();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="AVMetadataCommonKeyAccessibilityDescription", optional=true)
        public static native NSString AccessibilityDescription();
        /*</values>*/
    }
}
