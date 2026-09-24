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
@Marshaler(/*<name>*/AVAudioSequencerInfoDictionaryKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioSequencerInfoDictionaryKey/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVAudioSequencerInfoDictionaryKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVAudioSequencerInfoDictionaryKey toObject(Class<AVAudioSequencerInfoDictionaryKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVAudioSequencerInfoDictionaryKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVAudioSequencerInfoDictionaryKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVAudioSequencerInfoDictionaryKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVAudioSequencerInfoDictionaryKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVAudioSequencerInfoDictionaryKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVAudioSequencerInfoDictionaryKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVAudioSequencerInfoDictionaryKey o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey Album = new AVAudioSequencerInfoDictionaryKey("Album");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey ApproximateDurationInSeconds = new AVAudioSequencerInfoDictionaryKey("ApproximateDurationInSeconds");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey Artist = new AVAudioSequencerInfoDictionaryKey("Artist");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey ChannelLayout = new AVAudioSequencerInfoDictionaryKey("ChannelLayout");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey Comments = new AVAudioSequencerInfoDictionaryKey("Comments");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey Composer = new AVAudioSequencerInfoDictionaryKey("Composer");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey Copyright = new AVAudioSequencerInfoDictionaryKey("Copyright");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey EncodingApplication = new AVAudioSequencerInfoDictionaryKey("EncodingApplication");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey Genre = new AVAudioSequencerInfoDictionaryKey("Genre");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey ISRC = new AVAudioSequencerInfoDictionaryKey("ISRC");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey KeySignature = new AVAudioSequencerInfoDictionaryKey("KeySignature");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey Lyricist = new AVAudioSequencerInfoDictionaryKey("Lyricist");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey NominalBitRate = new AVAudioSequencerInfoDictionaryKey("NominalBitRate");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey RecordedDate = new AVAudioSequencerInfoDictionaryKey("RecordedDate");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey SourceBitDepth = new AVAudioSequencerInfoDictionaryKey("SourceBitDepth");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey SourceEncoder = new AVAudioSequencerInfoDictionaryKey("SourceEncoder");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey SubTitle = new AVAudioSequencerInfoDictionaryKey("SubTitle");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey Tempo = new AVAudioSequencerInfoDictionaryKey("Tempo");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey TimeSignature = new AVAudioSequencerInfoDictionaryKey("TimeSignature");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey Title = new AVAudioSequencerInfoDictionaryKey("Title");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey TrackNumber = new AVAudioSequencerInfoDictionaryKey("TrackNumber");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final AVAudioSequencerInfoDictionaryKey Year = new AVAudioSequencerInfoDictionaryKey("Year");
    /*</constants>*/
    
    private static /*<name>*/AVAudioSequencerInfoDictionaryKey/*</name>*/[] values = new /*<name>*/AVAudioSequencerInfoDictionaryKey/*</name>*/[] {/*<value_list>*/Album, ApproximateDurationInSeconds, Artist, ChannelLayout, Comments, Composer, Copyright, EncodingApplication, Genre, ISRC, KeySignature, Lyricist, NominalBitRate, RecordedDate, SourceBitDepth, SourceEncoder, SubTitle, Tempo, TimeSignature, Title, TrackNumber, Year/*</value_list>*/};
    
    /*<name>*/AVAudioSequencerInfoDictionaryKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVAudioSequencerInfoDictionaryKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVAudioSequencerInfoDictionaryKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVAudioSequencerInfoDictionaryKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyAlbum", optional=true)
        public static native NSString Album();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyApproximateDurationInSeconds", optional=true)
        public static native NSString ApproximateDurationInSeconds();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyArtist", optional=true)
        public static native NSString Artist();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyChannelLayout", optional=true)
        public static native NSString ChannelLayout();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyComments", optional=true)
        public static native NSString Comments();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyComposer", optional=true)
        public static native NSString Composer();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyCopyright", optional=true)
        public static native NSString Copyright();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyEncodingApplication", optional=true)
        public static native NSString EncodingApplication();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyGenre", optional=true)
        public static native NSString Genre();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyISRC", optional=true)
        public static native NSString ISRC();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyKeySignature", optional=true)
        public static native NSString KeySignature();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyLyricist", optional=true)
        public static native NSString Lyricist();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyNominalBitRate", optional=true)
        public static native NSString NominalBitRate();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyRecordedDate", optional=true)
        public static native NSString RecordedDate();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeySourceBitDepth", optional=true)
        public static native NSString SourceBitDepth();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeySourceEncoder", optional=true)
        public static native NSString SourceEncoder();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeySubTitle", optional=true)
        public static native NSString SubTitle();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyTempo", optional=true)
        public static native NSString Tempo();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyTimeSignature", optional=true)
        public static native NSString TimeSignature();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyTitle", optional=true)
        public static native NSString Title();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyTrackNumber", optional=true)
        public static native NSString TrackNumber();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="AVAudioSequencerInfoDictionaryKeyYear", optional=true)
        public static native NSString Year();
        /*</values>*/
    }
}
