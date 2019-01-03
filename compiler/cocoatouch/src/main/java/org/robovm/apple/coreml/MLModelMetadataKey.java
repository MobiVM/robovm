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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/MLModelMetadataKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLModelMetadataKey/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/MLModelMetadataKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static MLModelMetadataKey toObject(Class<MLModelMetadataKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return MLModelMetadataKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(MLModelMetadataKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<MLModelMetadataKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<MLModelMetadataKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(MLModelMetadataKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<MLModelMetadataKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (MLModelMetadataKey o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MLModelMetadataKey Description = new MLModelMetadataKey("Description");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MLModelMetadataKey VersionString = new MLModelMetadataKey("VersionString");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MLModelMetadataKey Author = new MLModelMetadataKey("Author");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MLModelMetadataKey License = new MLModelMetadataKey("License");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final MLModelMetadataKey CreatorDefined = new MLModelMetadataKey("CreatorDefined");
    /*</constants>*/
    
    private static /*<name>*/MLModelMetadataKey/*</name>*/[] values = new /*<name>*/MLModelMetadataKey/*</name>*/[] {/*<value_list>*/Description, VersionString, Author, License, CreatorDefined/*</value_list>*/};
    
    /*<name>*/MLModelMetadataKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/MLModelMetadataKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/MLModelMetadataKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/MLModelMetadataKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreML") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="MLModelDescriptionKey", optional=true)
        public static native NSString Description();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="MLModelVersionStringKey", optional=true)
        public static native NSString VersionString();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="MLModelAuthorKey", optional=true)
        public static native NSString Author();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="MLModelLicenseKey", optional=true)
        public static native NSString License();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="MLModelCreatorDefinedKey", optional=true)
        public static native NSString CreatorDefined();
        /*</values>*/
    }
}
