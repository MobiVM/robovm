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
@Marshaler(/*<name>*/HKClinicalTypeIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKClinicalTypeIdentifier/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKClinicalTypeIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKClinicalTypeIdentifier toObject(Class<HKClinicalTypeIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKClinicalTypeIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKClinicalTypeIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKClinicalTypeIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKClinicalTypeIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKClinicalTypeIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKClinicalTypeIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKClinicalTypeIdentifier o : l) {
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
    public static final HKClinicalTypeIdentifier AllergyRecord = new HKClinicalTypeIdentifier("AllergyRecord");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKClinicalTypeIdentifier ConditionRecord = new HKClinicalTypeIdentifier("ConditionRecord");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKClinicalTypeIdentifier ImmunizationRecord = new HKClinicalTypeIdentifier("ImmunizationRecord");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKClinicalTypeIdentifier LabResultRecord = new HKClinicalTypeIdentifier("LabResultRecord");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKClinicalTypeIdentifier MedicationRecord = new HKClinicalTypeIdentifier("MedicationRecord");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKClinicalTypeIdentifier ProcedureRecord = new HKClinicalTypeIdentifier("ProcedureRecord");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKClinicalTypeIdentifier VitalSignRecord = new HKClinicalTypeIdentifier("VitalSignRecord");
    /*</constants>*/
    
    private static /*<name>*/HKClinicalTypeIdentifier/*</name>*/[] values = new /*<name>*/HKClinicalTypeIdentifier/*</name>*/[] {/*<value_list>*/AllergyRecord, ConditionRecord, ImmunizationRecord, LabResultRecord, MedicationRecord, ProcedureRecord, VitalSignRecord/*</value_list>*/};
    
    /*<name>*/HKClinicalTypeIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKClinicalTypeIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKClinicalTypeIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKClinicalTypeIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKClinicalTypeIdentifierAllergyRecord", optional=true)
        public static native NSString AllergyRecord();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKClinicalTypeIdentifierConditionRecord", optional=true)
        public static native NSString ConditionRecord();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKClinicalTypeIdentifierImmunizationRecord", optional=true)
        public static native NSString ImmunizationRecord();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKClinicalTypeIdentifierLabResultRecord", optional=true)
        public static native NSString LabResultRecord();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKClinicalTypeIdentifierMedicationRecord", optional=true)
        public static native NSString MedicationRecord();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKClinicalTypeIdentifierProcedureRecord", optional=true)
        public static native NSString ProcedureRecord();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKClinicalTypeIdentifierVitalSignRecord", optional=true)
        public static native NSString VitalSignRecord();
        /*</values>*/
    }
}
