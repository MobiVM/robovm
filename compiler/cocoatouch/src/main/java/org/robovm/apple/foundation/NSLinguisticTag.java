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
    public static final NSLinguisticTag Word = new NSLinguisticTag("Word");
    public static final NSLinguisticTag Punctuation = new NSLinguisticTag("Punctuation");
    public static final NSLinguisticTag Whitespace = new NSLinguisticTag("Whitespace");
    public static final NSLinguisticTag Other = new NSLinguisticTag("Other");
    public static final NSLinguisticTag Noun = new NSLinguisticTag("Noun");
    public static final NSLinguisticTag Verb = new NSLinguisticTag("Verb");
    public static final NSLinguisticTag Adjective = new NSLinguisticTag("Adjective");
    public static final NSLinguisticTag Adverb = new NSLinguisticTag("Adverb");
    public static final NSLinguisticTag Pronoun = new NSLinguisticTag("Pronoun");
    public static final NSLinguisticTag Determiner = new NSLinguisticTag("Determiner");
    public static final NSLinguisticTag Particle = new NSLinguisticTag("Particle");
    public static final NSLinguisticTag Preposition = new NSLinguisticTag("Preposition");
    public static final NSLinguisticTag Number = new NSLinguisticTag("Number");
    public static final NSLinguisticTag Conjunction = new NSLinguisticTag("Conjunction");
    public static final NSLinguisticTag Interjection = new NSLinguisticTag("Interjection");
    public static final NSLinguisticTag Classifier = new NSLinguisticTag("Classifier");
    public static final NSLinguisticTag Idiom = new NSLinguisticTag("Idiom");
    public static final NSLinguisticTag OtherWord = new NSLinguisticTag("OtherWord");
    public static final NSLinguisticTag SentenceTerminator = new NSLinguisticTag("SentenceTerminator");
    public static final NSLinguisticTag OpenQuote = new NSLinguisticTag("OpenQuote");
    public static final NSLinguisticTag CloseQuote = new NSLinguisticTag("CloseQuote");
    public static final NSLinguisticTag OpenParenthesis = new NSLinguisticTag("OpenParenthesis");
    public static final NSLinguisticTag CloseParenthesis = new NSLinguisticTag("CloseParenthesis");
    public static final NSLinguisticTag WordJoiner = new NSLinguisticTag("WordJoiner");
    public static final NSLinguisticTag Dash = new NSLinguisticTag("Dash");
    public static final NSLinguisticTag OtherPunctuation = new NSLinguisticTag("OtherPunctuation");
    public static final NSLinguisticTag ParagraphBreak = new NSLinguisticTag("ParagraphBreak");
    public static final NSLinguisticTag OtherWhitespace = new NSLinguisticTag("OtherWhitespace");
    public static final NSLinguisticTag PersonalName = new NSLinguisticTag("PersonalName");
    public static final NSLinguisticTag PlaceName = new NSLinguisticTag("PlaceName");
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
        @GlobalValue(symbol="NSLinguisticTagWord", optional=true)
        public static native NSString Word();
        @GlobalValue(symbol="NSLinguisticTagPunctuation", optional=true)
        public static native NSString Punctuation();
        @GlobalValue(symbol="NSLinguisticTagWhitespace", optional=true)
        public static native NSString Whitespace();
        @GlobalValue(symbol="NSLinguisticTagOther", optional=true)
        public static native NSString Other();
        @GlobalValue(symbol="NSLinguisticTagNoun", optional=true)
        public static native NSString Noun();
        @GlobalValue(symbol="NSLinguisticTagVerb", optional=true)
        public static native NSString Verb();
        @GlobalValue(symbol="NSLinguisticTagAdjective", optional=true)
        public static native NSString Adjective();
        @GlobalValue(symbol="NSLinguisticTagAdverb", optional=true)
        public static native NSString Adverb();
        @GlobalValue(symbol="NSLinguisticTagPronoun", optional=true)
        public static native NSString Pronoun();
        @GlobalValue(symbol="NSLinguisticTagDeterminer", optional=true)
        public static native NSString Determiner();
        @GlobalValue(symbol="NSLinguisticTagParticle", optional=true)
        public static native NSString Particle();
        @GlobalValue(symbol="NSLinguisticTagPreposition", optional=true)
        public static native NSString Preposition();
        @GlobalValue(symbol="NSLinguisticTagNumber", optional=true)
        public static native NSString Number();
        @GlobalValue(symbol="NSLinguisticTagConjunction", optional=true)
        public static native NSString Conjunction();
        @GlobalValue(symbol="NSLinguisticTagInterjection", optional=true)
        public static native NSString Interjection();
        @GlobalValue(symbol="NSLinguisticTagClassifier", optional=true)
        public static native NSString Classifier();
        @GlobalValue(symbol="NSLinguisticTagIdiom", optional=true)
        public static native NSString Idiom();
        @GlobalValue(symbol="NSLinguisticTagOtherWord", optional=true)
        public static native NSString OtherWord();
        @GlobalValue(symbol="NSLinguisticTagSentenceTerminator", optional=true)
        public static native NSString SentenceTerminator();
        @GlobalValue(symbol="NSLinguisticTagOpenQuote", optional=true)
        public static native NSString OpenQuote();
        @GlobalValue(symbol="NSLinguisticTagCloseQuote", optional=true)
        public static native NSString CloseQuote();
        @GlobalValue(symbol="NSLinguisticTagOpenParenthesis", optional=true)
        public static native NSString OpenParenthesis();
        @GlobalValue(symbol="NSLinguisticTagCloseParenthesis", optional=true)
        public static native NSString CloseParenthesis();
        @GlobalValue(symbol="NSLinguisticTagWordJoiner", optional=true)
        public static native NSString WordJoiner();
        @GlobalValue(symbol="NSLinguisticTagDash", optional=true)
        public static native NSString Dash();
        @GlobalValue(symbol="NSLinguisticTagOtherPunctuation", optional=true)
        public static native NSString OtherPunctuation();
        @GlobalValue(symbol="NSLinguisticTagParagraphBreak", optional=true)
        public static native NSString ParagraphBreak();
        @GlobalValue(symbol="NSLinguisticTagOtherWhitespace", optional=true)
        public static native NSString OtherWhitespace();
        @GlobalValue(symbol="NSLinguisticTagPersonalName", optional=true)
        public static native NSString PersonalName();
        @GlobalValue(symbol="NSLinguisticTagPlaceName", optional=true)
        public static native NSString PlaceName();
        @GlobalValue(symbol="NSLinguisticTagOrganizationName", optional=true)
        public static native NSString OrganizationName();
        /*</values>*/
    }
}
