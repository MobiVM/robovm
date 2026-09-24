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
@Marshaler(/*<name>*/NLScript/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLScript/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NLScript/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NLScript toObject(Class<NLScript> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NLScript.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NLScript o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NLScript> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NLScript> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NLScript.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NLScript> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NLScript o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Undetermined = new NLScript("Undetermined");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Arabic = new NLScript("Arabic");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Armenian = new NLScript("Armenian");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Bengali = new NLScript("Bengali");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript CanadianAboriginalSyllabics = new NLScript("CanadianAboriginalSyllabics");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Cherokee = new NLScript("Cherokee");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Cyrillic = new NLScript("Cyrillic");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Devanagari = new NLScript("Devanagari");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Ethiopic = new NLScript("Ethiopic");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Georgian = new NLScript("Georgian");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Greek = new NLScript("Greek");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Gujarati = new NLScript("Gujarati");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Gurmukhi = new NLScript("Gurmukhi");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Hebrew = new NLScript("Hebrew");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Japanese = new NLScript("Japanese");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Kannada = new NLScript("Kannada");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Khmer = new NLScript("Khmer");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Korean = new NLScript("Korean");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Lao = new NLScript("Lao");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Latin = new NLScript("Latin");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Malayalam = new NLScript("Malayalam");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Mongolian = new NLScript("Mongolian");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Myanmar = new NLScript("Myanmar");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Oriya = new NLScript("Oriya");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript SimplifiedChinese = new NLScript("SimplifiedChinese");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Sinhala = new NLScript("Sinhala");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Tamil = new NLScript("Tamil");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Telugu = new NLScript("Telugu");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Thai = new NLScript("Thai");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript Tibetan = new NLScript("Tibetan");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NLScript TraditionalChinese = new NLScript("TraditionalChinese");
    /*</constants>*/
    
    private static /*<name>*/NLScript/*</name>*/[] values = new /*<name>*/NLScript/*</name>*/[] {/*<value_list>*/Undetermined, Arabic, Armenian, Bengali, CanadianAboriginalSyllabics, Cherokee, Cyrillic, Devanagari, Ethiopic, Georgian, Greek, Gujarati, Gurmukhi, Hebrew, Japanese, Kannada, Khmer, Korean, Lao, Latin, Malayalam, Mongolian, Myanmar, Oriya, SimplifiedChinese, Sinhala, Tamil, Telugu, Thai, Tibetan, TraditionalChinese/*</value_list>*/};
    
    /*<name>*/NLScript/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NLScript/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NLScript/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NLScript/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("NaturalLanguage") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptUndetermined", optional=true)
        public static native NSString Undetermined();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptArabic", optional=true)
        public static native NSString Arabic();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptArmenian", optional=true)
        public static native NSString Armenian();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptBengali", optional=true)
        public static native NSString Bengali();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptCanadianAboriginalSyllabics", optional=true)
        public static native NSString CanadianAboriginalSyllabics();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptCherokee", optional=true)
        public static native NSString Cherokee();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptCyrillic", optional=true)
        public static native NSString Cyrillic();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptDevanagari", optional=true)
        public static native NSString Devanagari();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptEthiopic", optional=true)
        public static native NSString Ethiopic();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptGeorgian", optional=true)
        public static native NSString Georgian();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptGreek", optional=true)
        public static native NSString Greek();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptGujarati", optional=true)
        public static native NSString Gujarati();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptGurmukhi", optional=true)
        public static native NSString Gurmukhi();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptHebrew", optional=true)
        public static native NSString Hebrew();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptJapanese", optional=true)
        public static native NSString Japanese();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptKannada", optional=true)
        public static native NSString Kannada();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptKhmer", optional=true)
        public static native NSString Khmer();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptKorean", optional=true)
        public static native NSString Korean();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptLao", optional=true)
        public static native NSString Lao();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptLatin", optional=true)
        public static native NSString Latin();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptMalayalam", optional=true)
        public static native NSString Malayalam();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptMongolian", optional=true)
        public static native NSString Mongolian();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptMyanmar", optional=true)
        public static native NSString Myanmar();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptOriya", optional=true)
        public static native NSString Oriya();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptSimplifiedChinese", optional=true)
        public static native NSString SimplifiedChinese();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptSinhala", optional=true)
        public static native NSString Sinhala();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptTamil", optional=true)
        public static native NSString Tamil();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptTelugu", optional=true)
        public static native NSString Telugu();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptThai", optional=true)
        public static native NSString Thai();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptTibetan", optional=true)
        public static native NSString Tibetan();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NLScriptTraditionalChinese", optional=true)
        public static native NSString TraditionalChinese();
        /*</values>*/
    }
}
