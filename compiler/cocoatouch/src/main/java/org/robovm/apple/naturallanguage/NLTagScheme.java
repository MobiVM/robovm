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
@Marshaler(/*<name>*/NLTagScheme/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLTagScheme/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NLTagScheme/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NLTagScheme toObject(Class<NLTagScheme> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NLTagScheme.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NLTagScheme o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NLTagScheme> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NLTagScheme> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NLTagScheme.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NLTagScheme> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NLTagScheme o : l) {
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
    public static final NLTagScheme TokenType = new NLTagScheme("TokenType");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTagScheme LexicalClass = new NLTagScheme("LexicalClass");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTagScheme NameType = new NLTagScheme("NameType");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTagScheme NameTypeOrLexicalClass = new NLTagScheme("NameTypeOrLexicalClass");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTagScheme Lemma = new NLTagScheme("Lemma");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTagScheme Language = new NLTagScheme("Language");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final NLTagScheme Script = new NLTagScheme("Script");
    /*</constants>*/
    
    private static /*<name>*/NLTagScheme/*</name>*/[] values = new /*<name>*/NLTagScheme/*</name>*/[] {/*<value_list>*/TokenType, LexicalClass, NameType, NameTypeOrLexicalClass, Lemma, Language, Script/*</value_list>*/};
    
    /*<name>*/NLTagScheme/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NLTagScheme/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NLTagScheme/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NLTagScheme/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("NaturalLanguage") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagSchemeTokenType", optional=true)
        public static native NSString TokenType();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagSchemeLexicalClass", optional=true)
        public static native NSString LexicalClass();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagSchemeNameType", optional=true)
        public static native NSString NameType();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagSchemeNameTypeOrLexicalClass", optional=true)
        public static native NSString NameTypeOrLexicalClass();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagSchemeLemma", optional=true)
        public static native NSString Lemma();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagSchemeLanguage", optional=true)
        public static native NSString Language();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NLTagSchemeScript", optional=true)
        public static native NSString Script();
        /*</values>*/
    }
}
