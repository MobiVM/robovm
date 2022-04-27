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
package org.robovm.apple.passkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/PKEncryptionScheme/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKEncryptionScheme/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/PKEncryptionScheme/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static PKEncryptionScheme toObject(Class<PKEncryptionScheme> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return PKEncryptionScheme.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(PKEncryptionScheme o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<PKEncryptionScheme> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<PKEncryptionScheme> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(PKEncryptionScheme.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<PKEncryptionScheme> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (PKEncryptionScheme o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final PKEncryptionScheme ECC_V2 = new PKEncryptionScheme("ECC_V2");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final PKEncryptionScheme RSA_V2 = new PKEncryptionScheme("RSA_V2");
    /*</constants>*/
    
    private static /*<name>*/PKEncryptionScheme/*</name>*/[] values = new /*<name>*/PKEncryptionScheme/*</name>*/[] {/*<value_list>*/ECC_V2, RSA_V2/*</value_list>*/};
    
    /*<name>*/PKEncryptionScheme/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/PKEncryptionScheme/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/PKEncryptionScheme/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/PKEncryptionScheme/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("PassKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="PKEncryptionSchemeECC_V2", optional=true)
        public static native NSString ECC_V2();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="PKEncryptionSchemeRSA_V2", optional=true)
        public static native NSString RSA_V2();
        /*</values>*/
    }
}
