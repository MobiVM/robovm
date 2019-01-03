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
@Marshaler(/*<name>*/HKFHIRResourceType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKFHIRResourceType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKFHIRResourceType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKFHIRResourceType toObject(Class<HKFHIRResourceType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKFHIRResourceType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKFHIRResourceType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKFHIRResourceType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKFHIRResourceType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKFHIRResourceType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKFHIRResourceType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKFHIRResourceType o : l) {
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
    public static final HKFHIRResourceType AllergyIntolerance = new HKFHIRResourceType("AllergyIntolerance");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKFHIRResourceType Condition = new HKFHIRResourceType("Condition");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKFHIRResourceType Immunization = new HKFHIRResourceType("Immunization");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKFHIRResourceType MedicationDispense = new HKFHIRResourceType("MedicationDispense");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKFHIRResourceType MedicationOrder = new HKFHIRResourceType("MedicationOrder");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKFHIRResourceType MedicationStatement = new HKFHIRResourceType("MedicationStatement");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKFHIRResourceType Observation = new HKFHIRResourceType("Observation");
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final HKFHIRResourceType Procedure = new HKFHIRResourceType("Procedure");
    /*</constants>*/
    
    private static /*<name>*/HKFHIRResourceType/*</name>*/[] values = new /*<name>*/HKFHIRResourceType/*</name>*/[] {/*<value_list>*/AllergyIntolerance, Condition, Immunization, MedicationDispense, MedicationOrder, MedicationStatement, Observation, Procedure/*</value_list>*/};
    
    /*<name>*/HKFHIRResourceType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKFHIRResourceType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKFHIRResourceType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKFHIRResourceType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKFHIRResourceTypeAllergyIntolerance", optional=true)
        public static native NSString AllergyIntolerance();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKFHIRResourceTypeCondition", optional=true)
        public static native NSString Condition();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKFHIRResourceTypeImmunization", optional=true)
        public static native NSString Immunization();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKFHIRResourceTypeMedicationDispense", optional=true)
        public static native NSString MedicationDispense();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKFHIRResourceTypeMedicationOrder", optional=true)
        public static native NSString MedicationOrder();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKFHIRResourceTypeMedicationStatement", optional=true)
        public static native NSString MedicationStatement();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKFHIRResourceTypeObservation", optional=true)
        public static native NSString Observation();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="HKFHIRResourceTypeProcedure", optional=true)
        public static native NSString Procedure();
        /*</values>*/
    }
}
