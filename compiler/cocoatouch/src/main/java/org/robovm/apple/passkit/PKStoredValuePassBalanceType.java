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
@Marshaler(/*<name>*/PKStoredValuePassBalanceType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKStoredValuePassBalanceType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/PKStoredValuePassBalanceType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static PKStoredValuePassBalanceType toObject(Class<PKStoredValuePassBalanceType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return PKStoredValuePassBalanceType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(PKStoredValuePassBalanceType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<PKStoredValuePassBalanceType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<PKStoredValuePassBalanceType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(PKStoredValuePassBalanceType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<PKStoredValuePassBalanceType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (PKStoredValuePassBalanceType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final PKStoredValuePassBalanceType Cash = new PKStoredValuePassBalanceType("Cash");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final PKStoredValuePassBalanceType LoyaltyPoints = new PKStoredValuePassBalanceType("LoyaltyPoints");
    /*</constants>*/
    
    private static /*<name>*/PKStoredValuePassBalanceType/*</name>*/[] values = new /*<name>*/PKStoredValuePassBalanceType/*</name>*/[] {/*<value_list>*/Cash, LoyaltyPoints/*</value_list>*/};
    
    /*<name>*/PKStoredValuePassBalanceType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/PKStoredValuePassBalanceType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/PKStoredValuePassBalanceType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/PKStoredValuePassBalanceType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("PassKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="PKStoredValuePassBalanceTypeCash", optional=true)
        public static native NSString Cash();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="PKStoredValuePassBalanceTypeLoyaltyPoints", optional=true)
        public static native NSString LoyaltyPoints();
        /*</values>*/
    }
}
