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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/PKContactField/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKContactField/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/PKContactField/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static PKContactField toObject(Class<PKContactField> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return PKContactField.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(PKContactField o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<PKContactField> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<PKContactField> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(PKContactField.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<PKContactField> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (PKContactField o : l) {
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
    public static final PKContactField PostalAddress = new PKContactField("PostalAddress");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final PKContactField EmailAddress = new PKContactField("EmailAddress");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final PKContactField PhoneNumber = new PKContactField("PhoneNumber");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final PKContactField Name = new PKContactField("Name");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final PKContactField PhoneticName = new PKContactField("PhoneticName");
    /*</constants>*/
    
    private static /*<name>*/PKContactField/*</name>*/[] values = new /*<name>*/PKContactField/*</name>*/[] {/*<value_list>*/PostalAddress, EmailAddress, PhoneNumber, Name, PhoneticName/*</value_list>*/};
    
    /*<name>*/PKContactField/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/PKContactField/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/PKContactField/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/PKContactField/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("PassKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="PKContactFieldPostalAddress", optional=true)
        public static native NSString PostalAddress();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="PKContactFieldEmailAddress", optional=true)
        public static native NSString EmailAddress();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="PKContactFieldPhoneNumber", optional=true)
        public static native NSString PhoneNumber();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="PKContactFieldName", optional=true)
        public static native NSString Name();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="PKContactFieldPhoneticName", optional=true)
        public static native NSString PhoneticName();
        /*</values>*/
    }
}
