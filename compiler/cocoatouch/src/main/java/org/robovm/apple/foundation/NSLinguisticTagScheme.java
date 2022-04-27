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
@Marshaler(/*<name>*/NSLinguisticTagScheme/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSLinguisticTagScheme/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NSLinguisticTagScheme/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSLinguisticTagScheme toObject(Class<NSLinguisticTagScheme> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NSLinguisticTagScheme.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NSLinguisticTagScheme o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NSLinguisticTagScheme> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSLinguisticTagScheme> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NSLinguisticTagScheme.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSLinguisticTagScheme> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NSLinguisticTagScheme o : l) {
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
    public static final NSLinguisticTagScheme TokenType = new NSLinguisticTagScheme("TokenType");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTagScheme LexicalClass = new NSLinguisticTagScheme("LexicalClass");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTagScheme NameType = new NSLinguisticTagScheme("NameType");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTagScheme NameTypeOrLexicalClass = new NSLinguisticTagScheme("NameTypeOrLexicalClass");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTagScheme Lemma = new NSLinguisticTagScheme("Lemma");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTagScheme Language = new NSLinguisticTagScheme("Language");
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    public static final NSLinguisticTagScheme Script = new NSLinguisticTagScheme("Script");
    /*</constants>*/
    
    private static /*<name>*/NSLinguisticTagScheme/*</name>*/[] values = new /*<name>*/NSLinguisticTagScheme/*</name>*/[] {/*<value_list>*/TokenType, LexicalClass, NameType, NameTypeOrLexicalClass, Lemma, Language, Script/*</value_list>*/};
    
    /*<name>*/NSLinguisticTagScheme/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NSLinguisticTagScheme/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NSLinguisticTagScheme/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSLinguisticTagScheme/*</name>*/.class.getName());
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
        @GlobalValue(symbol="NSLinguisticTagSchemeTokenType", optional=true)
        public static native NSString TokenType();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagSchemeLexicalClass", optional=true)
        public static native NSString LexicalClass();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagSchemeNameType", optional=true)
        public static native NSString NameType();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagSchemeNameTypeOrLexicalClass", optional=true)
        public static native NSString NameTypeOrLexicalClass();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagSchemeLemma", optional=true)
        public static native NSString Lemma();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagSchemeLanguage", optional=true)
        public static native NSString Language();
        /**
         * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
         */
        @Deprecated
        @GlobalValue(symbol="NSLinguisticTagSchemeScript", optional=true)
        public static native NSString Script();
        /*</values>*/
    }
}
