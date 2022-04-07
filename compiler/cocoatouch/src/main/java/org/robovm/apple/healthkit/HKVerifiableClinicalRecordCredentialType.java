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
package org.robovm.apple.healthkit;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/HKVerifiableClinicalRecordCredentialType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKVerifiableClinicalRecordCredentialType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKVerifiableClinicalRecordCredentialType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKVerifiableClinicalRecordCredentialType toObject(Class<HKVerifiableClinicalRecordCredentialType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKVerifiableClinicalRecordCredentialType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKVerifiableClinicalRecordCredentialType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKVerifiableClinicalRecordCredentialType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKVerifiableClinicalRecordCredentialType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKVerifiableClinicalRecordCredentialType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKVerifiableClinicalRecordCredentialType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKVerifiableClinicalRecordCredentialType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 15.4 and later.
     */
    public static final HKVerifiableClinicalRecordCredentialType COVID19 = new HKVerifiableClinicalRecordCredentialType("COVID19");
    /**
     * @since Available in iOS 15.4 and later.
     */
    public static final HKVerifiableClinicalRecordCredentialType Immunization = new HKVerifiableClinicalRecordCredentialType("Immunization");
    /**
     * @since Available in iOS 15.4 and later.
     */
    public static final HKVerifiableClinicalRecordCredentialType Laboratory = new HKVerifiableClinicalRecordCredentialType("Laboratory");
    /**
     * @since Available in iOS 15.4 and later.
     */
    public static final HKVerifiableClinicalRecordCredentialType Recovery = new HKVerifiableClinicalRecordCredentialType("Recovery");
    /*</constants>*/
    
    private static /*<name>*/HKVerifiableClinicalRecordCredentialType/*</name>*/[] values = new /*<name>*/HKVerifiableClinicalRecordCredentialType/*</name>*/[] {/*<value_list>*/COVID19, Immunization, Laboratory, Recovery/*</value_list>*/};
    
    /*<name>*/HKVerifiableClinicalRecordCredentialType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKVerifiableClinicalRecordCredentialType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKVerifiableClinicalRecordCredentialType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKVerifiableClinicalRecordCredentialType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 15.4 and later.
         */
        @GlobalValue(symbol="HKVerifiableClinicalRecordCredentialTypeCOVID19", optional=true)
        public static native NSString COVID19();
        /**
         * @since Available in iOS 15.4 and later.
         */
        @GlobalValue(symbol="HKVerifiableClinicalRecordCredentialTypeImmunization", optional=true)
        public static native NSString Immunization();
        /**
         * @since Available in iOS 15.4 and later.
         */
        @GlobalValue(symbol="HKVerifiableClinicalRecordCredentialTypeLaboratory", optional=true)
        public static native NSString Laboratory();
        /**
         * @since Available in iOS 15.4 and later.
         */
        @GlobalValue(symbol="HKVerifiableClinicalRecordCredentialTypeRecovery", optional=true)
        public static native NSString Recovery();
        /*</values>*/
    }
}
