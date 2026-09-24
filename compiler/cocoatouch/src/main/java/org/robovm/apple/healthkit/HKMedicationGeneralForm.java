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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/HKMedicationGeneralForm/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKMedicationGeneralForm/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKMedicationGeneralForm/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKMedicationGeneralForm toObject(Class<HKMedicationGeneralForm> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKMedicationGeneralForm.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKMedicationGeneralForm o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKMedicationGeneralForm> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKMedicationGeneralForm> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKMedicationGeneralForm.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKMedicationGeneralForm> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKMedicationGeneralForm o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final HKMedicationGeneralForm Capsule = new HKMedicationGeneralForm("Capsule");
    public static final HKMedicationGeneralForm Cream = new HKMedicationGeneralForm("Cream");
    public static final HKMedicationGeneralForm Device = new HKMedicationGeneralForm("Device");
    public static final HKMedicationGeneralForm Drops = new HKMedicationGeneralForm("Drops");
    public static final HKMedicationGeneralForm Foam = new HKMedicationGeneralForm("Foam");
    public static final HKMedicationGeneralForm Gel = new HKMedicationGeneralForm("Gel");
    public static final HKMedicationGeneralForm Inhaler = new HKMedicationGeneralForm("Inhaler");
    public static final HKMedicationGeneralForm Injection = new HKMedicationGeneralForm("Injection");
    public static final HKMedicationGeneralForm Liquid = new HKMedicationGeneralForm("Liquid");
    public static final HKMedicationGeneralForm Lotion = new HKMedicationGeneralForm("Lotion");
    public static final HKMedicationGeneralForm Ointment = new HKMedicationGeneralForm("Ointment");
    public static final HKMedicationGeneralForm Patch = new HKMedicationGeneralForm("Patch");
    public static final HKMedicationGeneralForm Powder = new HKMedicationGeneralForm("Powder");
    public static final HKMedicationGeneralForm Spray = new HKMedicationGeneralForm("Spray");
    public static final HKMedicationGeneralForm Suppository = new HKMedicationGeneralForm("Suppository");
    public static final HKMedicationGeneralForm Tablet = new HKMedicationGeneralForm("Tablet");
    public static final HKMedicationGeneralForm Topical = new HKMedicationGeneralForm("Topical");
    public static final HKMedicationGeneralForm Unknown = new HKMedicationGeneralForm("Unknown");
    /*</constants>*/
    
    private static /*<name>*/HKMedicationGeneralForm/*</name>*/[] values = new /*<name>*/HKMedicationGeneralForm/*</name>*/[] {/*<value_list>*/Capsule, Cream, Device, Drops, Foam, Gel, Inhaler, Injection, Liquid, Lotion, Ointment, Patch, Powder, Spray, Suppository, Tablet, Topical, Unknown/*</value_list>*/};
    
    /*<name>*/HKMedicationGeneralForm/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKMedicationGeneralForm/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKMedicationGeneralForm/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKMedicationGeneralForm/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="HKMedicationGeneralFormCapsule", optional=true)
        public static native NSString Capsule();
        @GlobalValue(symbol="HKMedicationGeneralFormCream", optional=true)
        public static native NSString Cream();
        @GlobalValue(symbol="HKMedicationGeneralFormDevice", optional=true)
        public static native NSString Device();
        @GlobalValue(symbol="HKMedicationGeneralFormDrops", optional=true)
        public static native NSString Drops();
        @GlobalValue(symbol="HKMedicationGeneralFormFoam", optional=true)
        public static native NSString Foam();
        @GlobalValue(symbol="HKMedicationGeneralFormGel", optional=true)
        public static native NSString Gel();
        @GlobalValue(symbol="HKMedicationGeneralFormInhaler", optional=true)
        public static native NSString Inhaler();
        @GlobalValue(symbol="HKMedicationGeneralFormInjection", optional=true)
        public static native NSString Injection();
        @GlobalValue(symbol="HKMedicationGeneralFormLiquid", optional=true)
        public static native NSString Liquid();
        @GlobalValue(symbol="HKMedicationGeneralFormLotion", optional=true)
        public static native NSString Lotion();
        @GlobalValue(symbol="HKMedicationGeneralFormOintment", optional=true)
        public static native NSString Ointment();
        @GlobalValue(symbol="HKMedicationGeneralFormPatch", optional=true)
        public static native NSString Patch();
        @GlobalValue(symbol="HKMedicationGeneralFormPowder", optional=true)
        public static native NSString Powder();
        @GlobalValue(symbol="HKMedicationGeneralFormSpray", optional=true)
        public static native NSString Spray();
        @GlobalValue(symbol="HKMedicationGeneralFormSuppository", optional=true)
        public static native NSString Suppository();
        @GlobalValue(symbol="HKMedicationGeneralFormTablet", optional=true)
        public static native NSString Tablet();
        @GlobalValue(symbol="HKMedicationGeneralFormTopical", optional=true)
        public static native NSString Topical();
        @GlobalValue(symbol="HKMedicationGeneralFormUnknown", optional=true)
        public static native NSString Unknown();
        /*</values>*/
    }
}
