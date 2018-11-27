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
package org.robovm.apple.naturallanguage;

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
import org.robovm.apple.coreml.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("NaturalLanguage") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/NLTag/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLTag/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NLTag/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NLTag toObject(Class<NLTag> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NLTag.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NLTag o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NLTag> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NLTag> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NLTag.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NLTag> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NLTag o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Word = new NLTag("Word");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Punctuation = new NLTag("Punctuation");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Whitespace = new NLTag("Whitespace");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Other = new NLTag("Other");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Noun = new NLTag("Noun");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Verb = new NLTag("Verb");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Adjective = new NLTag("Adjective");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Adverb = new NLTag("Adverb");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Pronoun = new NLTag("Pronoun");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Determiner = new NLTag("Determiner");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Particle = new NLTag("Particle");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Preposition = new NLTag("Preposition");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Number = new NLTag("Number");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Conjunction = new NLTag("Conjunction");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Interjection = new NLTag("Interjection");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Classifier = new NLTag("Classifier");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Idiom = new NLTag("Idiom");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag OtherWord = new NLTag("OtherWord");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag SentenceTerminator = new NLTag("SentenceTerminator");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag OpenQuote = new NLTag("OpenQuote");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag CloseQuote = new NLTag("CloseQuote");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag OpenParenthesis = new NLTag("OpenParenthesis");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag CloseParenthesis = new NLTag("CloseParenthesis");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag WordJoiner = new NLTag("WordJoiner");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag Dash = new NLTag("Dash");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag OtherPunctuation = new NLTag("OtherPunctuation");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag ParagraphBreak = new NLTag("ParagraphBreak");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag OtherWhitespace = new NLTag("OtherWhitespace");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag PersonalName = new NLTag("PersonalName");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag PlaceName = new NLTag("PlaceName");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTag OrganizationName = new NLTag("OrganizationName");
    /*</constants>*/
    
    private static /*<name>*/NLTag/*</name>*/[] values = new /*<name>*/NLTag/*</name>*/[] {/*<value_list>*/Word, Punctuation, Whitespace, Other, Noun, Verb, Adjective, Adverb, Pronoun, Determiner, Particle, Preposition, Number, Conjunction, Interjection, Classifier, Idiom, OtherWord, SentenceTerminator, OpenQuote, CloseQuote, OpenParenthesis, CloseParenthesis, WordJoiner, Dash, OtherPunctuation, ParagraphBreak, OtherWhitespace, PersonalName, PlaceName, OrganizationName/*</value_list>*/};
    
    /*<name>*/NLTag/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NLTag/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NLTag/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NLTag/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("NaturalLanguage") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagWord", optional=true)
        public static native NSString Word();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagPunctuation", optional=true)
        public static native NSString Punctuation();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagWhitespace", optional=true)
        public static native NSString Whitespace();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagOther", optional=true)
        public static native NSString Other();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagNoun", optional=true)
        public static native NSString Noun();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagVerb", optional=true)
        public static native NSString Verb();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagAdjective", optional=true)
        public static native NSString Adjective();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagAdverb", optional=true)
        public static native NSString Adverb();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagPronoun", optional=true)
        public static native NSString Pronoun();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagDeterminer", optional=true)
        public static native NSString Determiner();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagParticle", optional=true)
        public static native NSString Particle();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagPreposition", optional=true)
        public static native NSString Preposition();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagNumber", optional=true)
        public static native NSString Number();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagConjunction", optional=true)
        public static native NSString Conjunction();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagInterjection", optional=true)
        public static native NSString Interjection();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagClassifier", optional=true)
        public static native NSString Classifier();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagIdiom", optional=true)
        public static native NSString Idiom();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagOtherWord", optional=true)
        public static native NSString OtherWord();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagSentenceTerminator", optional=true)
        public static native NSString SentenceTerminator();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagOpenQuote", optional=true)
        public static native NSString OpenQuote();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagCloseQuote", optional=true)
        public static native NSString CloseQuote();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagOpenParenthesis", optional=true)
        public static native NSString OpenParenthesis();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagCloseParenthesis", optional=true)
        public static native NSString CloseParenthesis();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagWordJoiner", optional=true)
        public static native NSString WordJoiner();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagDash", optional=true)
        public static native NSString Dash();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagOtherPunctuation", optional=true)
        public static native NSString OtherPunctuation();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagParagraphBreak", optional=true)
        public static native NSString ParagraphBreak();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagOtherWhitespace", optional=true)
        public static native NSString OtherWhitespace();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagPersonalName", optional=true)
        public static native NSString PersonalName();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagPlaceName", optional=true)
        public static native NSString PlaceName();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagOrganizationName", optional=true)
        public static native NSString OrganizationName();
        /*</values>*/
    }
}
