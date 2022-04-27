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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/NSLinguisticTag/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSLinguisticTag/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NSLinguisticTag/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSLinguisticTag toObject(Class<NSLinguisticTag> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NSLinguisticTag.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NSLinguisticTag o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NSLinguisticTag> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSLinguisticTag> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NSLinguisticTag.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSLinguisticTag> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NSLinguisticTag o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Word = new NSLinguisticTag("Word");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Punctuation = new NSLinguisticTag("Punctuation");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Whitespace = new NSLinguisticTag("Whitespace");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Other = new NSLinguisticTag("Other");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Noun = new NSLinguisticTag("Noun");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Verb = new NSLinguisticTag("Verb");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Adjective = new NSLinguisticTag("Adjective");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Adverb = new NSLinguisticTag("Adverb");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Pronoun = new NSLinguisticTag("Pronoun");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Determiner = new NSLinguisticTag("Determiner");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Particle = new NSLinguisticTag("Particle");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Preposition = new NSLinguisticTag("Preposition");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Number = new NSLinguisticTag("Number");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Conjunction = new NSLinguisticTag("Conjunction");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Interjection = new NSLinguisticTag("Interjection");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Classifier = new NSLinguisticTag("Classifier");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Idiom = new NSLinguisticTag("Idiom");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag OtherWord = new NSLinguisticTag("OtherWord");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag SentenceTerminator = new NSLinguisticTag("SentenceTerminator");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag OpenQuote = new NSLinguisticTag("OpenQuote");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag CloseQuote = new NSLinguisticTag("CloseQuote");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag OpenParenthesis = new NSLinguisticTag("OpenParenthesis");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag CloseParenthesis = new NSLinguisticTag("CloseParenthesis");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag WordJoiner = new NSLinguisticTag("WordJoiner");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag Dash = new NSLinguisticTag("Dash");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag OtherPunctuation = new NSLinguisticTag("OtherPunctuation");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag ParagraphBreak = new NSLinguisticTag("ParagraphBreak");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag OtherWhitespace = new NSLinguisticTag("OtherWhitespace");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag PersonalName = new NSLinguisticTag("PersonalName");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag PlaceName = new NSLinguisticTag("PlaceName");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTag OrganizationName = new NSLinguisticTag("OrganizationName");
    /*</constants>*/
    
    private static /*<name>*/NSLinguisticTag/*</name>*/[] values = new /*<name>*/NSLinguisticTag/*</name>*/[] {/*<value_list>*/Word, Punctuation, Whitespace, Other, Noun, Verb, Adjective, Adverb, Pronoun, Determiner, Particle, Preposition, Number, Conjunction, Interjection, Classifier, Idiom, OtherWord, SentenceTerminator, OpenQuote, CloseQuote, OpenParenthesis, CloseParenthesis, WordJoiner, Dash, OtherPunctuation, ParagraphBreak, OtherWhitespace, PersonalName, PlaceName, OrganizationName/*</value_list>*/};
    
    /*<name>*/NSLinguisticTag/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NSLinguisticTag/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NSLinguisticTag/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSLinguisticTag/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagWord", optional=true)
        public static native NSString Word();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagPunctuation", optional=true)
        public static native NSString Punctuation();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagWhitespace", optional=true)
        public static native NSString Whitespace();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagOther", optional=true)
        public static native NSString Other();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagNoun", optional=true)
        public static native NSString Noun();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagVerb", optional=true)
        public static native NSString Verb();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagAdjective", optional=true)
        public static native NSString Adjective();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagAdverb", optional=true)
        public static native NSString Adverb();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagPronoun", optional=true)
        public static native NSString Pronoun();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagDeterminer", optional=true)
        public static native NSString Determiner();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagParticle", optional=true)
        public static native NSString Particle();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagPreposition", optional=true)
        public static native NSString Preposition();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagNumber", optional=true)
        public static native NSString Number();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagConjunction", optional=true)
        public static native NSString Conjunction();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagInterjection", optional=true)
        public static native NSString Interjection();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagClassifier", optional=true)
        public static native NSString Classifier();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagIdiom", optional=true)
        public static native NSString Idiom();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagOtherWord", optional=true)
        public static native NSString OtherWord();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagSentenceTerminator", optional=true)
        public static native NSString SentenceTerminator();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagOpenQuote", optional=true)
        public static native NSString OpenQuote();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagCloseQuote", optional=true)
        public static native NSString CloseQuote();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagOpenParenthesis", optional=true)
        public static native NSString OpenParenthesis();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagCloseParenthesis", optional=true)
        public static native NSString CloseParenthesis();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagWordJoiner", optional=true)
        public static native NSString WordJoiner();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagDash", optional=true)
        public static native NSString Dash();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagOtherPunctuation", optional=true)
        public static native NSString OtherPunctuation();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagParagraphBreak", optional=true)
        public static native NSString ParagraphBreak();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagOtherWhitespace", optional=true)
        public static native NSString OtherWhitespace();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagPersonalName", optional=true)
        public static native NSString PersonalName();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagPlaceName", optional=true)
        public static native NSString PlaceName();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagOrganizationName", optional=true)
        public static native NSString OrganizationName();
        /*</values>*/
    }
}
