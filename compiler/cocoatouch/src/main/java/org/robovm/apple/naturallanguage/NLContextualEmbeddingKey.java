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
@Marshaler(/*<name>*/NLContextualEmbeddingKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLContextualEmbeddingKey/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NLContextualEmbeddingKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NLContextualEmbeddingKey toObject(Class<NLContextualEmbeddingKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NLContextualEmbeddingKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NLContextualEmbeddingKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NLContextualEmbeddingKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NLContextualEmbeddingKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NLContextualEmbeddingKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NLContextualEmbeddingKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NLContextualEmbeddingKey o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final NLContextualEmbeddingKey Languages = new NLContextualEmbeddingKey("Languages");
    public static final NLContextualEmbeddingKey Scripts = new NLContextualEmbeddingKey("Scripts");
    public static final NLContextualEmbeddingKey Revision = new NLContextualEmbeddingKey("Revision");
    /*</constants>*/
    
    private static /*<name>*/NLContextualEmbeddingKey/*</name>*/[] values = new /*<name>*/NLContextualEmbeddingKey/*</name>*/[] {/*<value_list>*/Languages, Scripts, Revision/*</value_list>*/};
    
    /*<name>*/NLContextualEmbeddingKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NLContextualEmbeddingKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NLContextualEmbeddingKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NLContextualEmbeddingKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("NaturalLanguage") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="NLContextualEmbeddingKeyLanguages", optional=true)
        public static native NSString Languages();
        @GlobalValue(symbol="NLContextualEmbeddingKeyScripts", optional=true)
        public static native NSString Scripts();
        @GlobalValue(symbol="NLContextualEmbeddingKeyRevision", optional=true)
        public static native NSString Revision();
        /*</values>*/
    }
}
