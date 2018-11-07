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
@Marshaler(/*<name>*/NLLanguage/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLLanguage/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NLLanguage/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NLLanguage toObject(Class<NLLanguage> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NLLanguage.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NLLanguage o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NLLanguage> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NLLanguage> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NLLanguage.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NLLanguage> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NLLanguage o : l) {
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
    public static final NLLanguage Undetermined = new NLLanguage("Undetermined");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Amharic = new NLLanguage("Amharic");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Arabic = new NLLanguage("Arabic");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Armenian = new NLLanguage("Armenian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Bengali = new NLLanguage("Bengali");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Bulgarian = new NLLanguage("Bulgarian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Burmese = new NLLanguage("Burmese");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Catalan = new NLLanguage("Catalan");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Cherokee = new NLLanguage("Cherokee");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Croatian = new NLLanguage("Croatian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Czech = new NLLanguage("Czech");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Danish = new NLLanguage("Danish");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Dutch = new NLLanguage("Dutch");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage English = new NLLanguage("English");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Finnish = new NLLanguage("Finnish");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage French = new NLLanguage("French");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Georgian = new NLLanguage("Georgian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage German = new NLLanguage("German");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Greek = new NLLanguage("Greek");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Gujarati = new NLLanguage("Gujarati");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Hebrew = new NLLanguage("Hebrew");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Hindi = new NLLanguage("Hindi");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Hungarian = new NLLanguage("Hungarian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Icelandic = new NLLanguage("Icelandic");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Indonesian = new NLLanguage("Indonesian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Italian = new NLLanguage("Italian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Japanese = new NLLanguage("Japanese");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Kannada = new NLLanguage("Kannada");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Khmer = new NLLanguage("Khmer");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Korean = new NLLanguage("Korean");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Lao = new NLLanguage("Lao");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Malay = new NLLanguage("Malay");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Malayalam = new NLLanguage("Malayalam");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Marathi = new NLLanguage("Marathi");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Mongolian = new NLLanguage("Mongolian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Norwegian = new NLLanguage("Norwegian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Oriya = new NLLanguage("Oriya");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Persian = new NLLanguage("Persian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Polish = new NLLanguage("Polish");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Portuguese = new NLLanguage("Portuguese");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Punjabi = new NLLanguage("Punjabi");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Romanian = new NLLanguage("Romanian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Russian = new NLLanguage("Russian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage SimplifiedChinese = new NLLanguage("SimplifiedChinese");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Sinhalese = new NLLanguage("Sinhalese");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Slovak = new NLLanguage("Slovak");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Spanish = new NLLanguage("Spanish");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Swedish = new NLLanguage("Swedish");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Tamil = new NLLanguage("Tamil");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Telugu = new NLLanguage("Telugu");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Thai = new NLLanguage("Thai");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Tibetan = new NLLanguage("Tibetan");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage TraditionalChinese = new NLLanguage("TraditionalChinese");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Turkish = new NLLanguage("Turkish");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Ukrainian = new NLLanguage("Ukrainian");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Urdu = new NLLanguage("Urdu");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLLanguage Vietnamese = new NLLanguage("Vietnamese");
    /*</constants>*/
    
    private static /*<name>*/NLLanguage/*</name>*/[] values = new /*<name>*/NLLanguage/*</name>*/[] {/*<value_list>*/Undetermined, Amharic, Arabic, Armenian, Bengali, Bulgarian, Burmese, Catalan, Cherokee, Croatian, Czech, Danish, Dutch, English, Finnish, French, Georgian, German, Greek, Gujarati, Hebrew, Hindi, Hungarian, Icelandic, Indonesian, Italian, Japanese, Kannada, Khmer, Korean, Lao, Malay, Malayalam, Marathi, Mongolian, Norwegian, Oriya, Persian, Polish, Portuguese, Punjabi, Romanian, Russian, SimplifiedChinese, Sinhalese, Slovak, Spanish, Swedish, Tamil, Telugu, Thai, Tibetan, TraditionalChinese, Turkish, Ukrainian, Urdu, Vietnamese/*</value_list>*/};
    
    /*<name>*/NLLanguage/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NLLanguage/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NLLanguage/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NLLanguage/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("NaturalLanguage") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageUndetermined", optional=true)
        public static native NSString Undetermined();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageAmharic", optional=true)
        public static native NSString Amharic();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageArabic", optional=true)
        public static native NSString Arabic();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageArmenian", optional=true)
        public static native NSString Armenian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageBengali", optional=true)
        public static native NSString Bengali();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageBulgarian", optional=true)
        public static native NSString Bulgarian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageBurmese", optional=true)
        public static native NSString Burmese();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageCatalan", optional=true)
        public static native NSString Catalan();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageCherokee", optional=true)
        public static native NSString Cherokee();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageCroatian", optional=true)
        public static native NSString Croatian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageCzech", optional=true)
        public static native NSString Czech();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageDanish", optional=true)
        public static native NSString Danish();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageDutch", optional=true)
        public static native NSString Dutch();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageEnglish", optional=true)
        public static native NSString English();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageFinnish", optional=true)
        public static native NSString Finnish();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageFrench", optional=true)
        public static native NSString French();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageGeorgian", optional=true)
        public static native NSString Georgian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageGerman", optional=true)
        public static native NSString German();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageGreek", optional=true)
        public static native NSString Greek();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageGujarati", optional=true)
        public static native NSString Gujarati();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageHebrew", optional=true)
        public static native NSString Hebrew();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageHindi", optional=true)
        public static native NSString Hindi();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageHungarian", optional=true)
        public static native NSString Hungarian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageIcelandic", optional=true)
        public static native NSString Icelandic();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageIndonesian", optional=true)
        public static native NSString Indonesian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageItalian", optional=true)
        public static native NSString Italian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageJapanese", optional=true)
        public static native NSString Japanese();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageKannada", optional=true)
        public static native NSString Kannada();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageKhmer", optional=true)
        public static native NSString Khmer();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageKorean", optional=true)
        public static native NSString Korean();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageLao", optional=true)
        public static native NSString Lao();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageMalay", optional=true)
        public static native NSString Malay();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageMalayalam", optional=true)
        public static native NSString Malayalam();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageMarathi", optional=true)
        public static native NSString Marathi();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageMongolian", optional=true)
        public static native NSString Mongolian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageNorwegian", optional=true)
        public static native NSString Norwegian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageOriya", optional=true)
        public static native NSString Oriya();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguagePersian", optional=true)
        public static native NSString Persian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguagePolish", optional=true)
        public static native NSString Polish();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguagePortuguese", optional=true)
        public static native NSString Portuguese();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguagePunjabi", optional=true)
        public static native NSString Punjabi();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageRomanian", optional=true)
        public static native NSString Romanian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageRussian", optional=true)
        public static native NSString Russian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageSimplifiedChinese", optional=true)
        public static native NSString SimplifiedChinese();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageSinhalese", optional=true)
        public static native NSString Sinhalese();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageSlovak", optional=true)
        public static native NSString Slovak();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageSpanish", optional=true)
        public static native NSString Spanish();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageSwedish", optional=true)
        public static native NSString Swedish();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageTamil", optional=true)
        public static native NSString Tamil();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageTelugu", optional=true)
        public static native NSString Telugu();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageThai", optional=true)
        public static native NSString Thai();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageTibetan", optional=true)
        public static native NSString Tibetan();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageTraditionalChinese", optional=true)
        public static native NSString TraditionalChinese();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageTurkish", optional=true)
        public static native NSString Turkish();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageUkrainian", optional=true)
        public static native NSString Ukrainian();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageUrdu", optional=true)
        public static native NSString Urdu();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLLanguageVietnamese", optional=true)
        public static native NSString Vietnamese();
        /*</values>*/
    }
}
