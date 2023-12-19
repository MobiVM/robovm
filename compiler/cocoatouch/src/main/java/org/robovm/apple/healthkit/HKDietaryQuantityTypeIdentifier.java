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
@Marshaler(/*<name>*/HKDietaryQuantityTypeIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKDietaryQuantityTypeIdentifier/*</name>*/ 
    extends /*<extends>*/HKQuantityTypeIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKDietaryQuantityTypeIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKDietaryQuantityTypeIdentifier toObject(Class<HKDietaryQuantityTypeIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKDietaryQuantityTypeIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKDietaryQuantityTypeIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKDietaryQuantityTypeIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKDietaryQuantityTypeIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKDietaryQuantityTypeIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKDietaryQuantityTypeIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKDietaryQuantityTypeIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final HKDietaryQuantityTypeIdentifier Biotin = new HKDietaryQuantityTypeIdentifier("Biotin");
    public static final HKDietaryQuantityTypeIdentifier Caffeine = new HKDietaryQuantityTypeIdentifier("Caffeine");
    public static final HKDietaryQuantityTypeIdentifier Calcium = new HKDietaryQuantityTypeIdentifier("Calcium");
    public static final HKDietaryQuantityTypeIdentifier Carbohydrates = new HKDietaryQuantityTypeIdentifier("Carbohydrates");
    public static final HKDietaryQuantityTypeIdentifier Chloride = new HKDietaryQuantityTypeIdentifier("Chloride");
    public static final HKDietaryQuantityTypeIdentifier Cholesterol = new HKDietaryQuantityTypeIdentifier("Cholesterol");
    public static final HKDietaryQuantityTypeIdentifier Chromium = new HKDietaryQuantityTypeIdentifier("Chromium");
    public static final HKDietaryQuantityTypeIdentifier Copper = new HKDietaryQuantityTypeIdentifier("Copper");
    public static final HKDietaryQuantityTypeIdentifier EnergyConsumed = new HKDietaryQuantityTypeIdentifier("EnergyConsumed");
    public static final HKDietaryQuantityTypeIdentifier FatMonounsaturated = new HKDietaryQuantityTypeIdentifier("FatMonounsaturated");
    public static final HKDietaryQuantityTypeIdentifier FatPolyunsaturated = new HKDietaryQuantityTypeIdentifier("FatPolyunsaturated");
    public static final HKDietaryQuantityTypeIdentifier FatSaturated = new HKDietaryQuantityTypeIdentifier("FatSaturated");
    public static final HKDietaryQuantityTypeIdentifier FatTotal = new HKDietaryQuantityTypeIdentifier("FatTotal");
    public static final HKDietaryQuantityTypeIdentifier Fiber = new HKDietaryQuantityTypeIdentifier("Fiber");
    public static final HKDietaryQuantityTypeIdentifier Folate = new HKDietaryQuantityTypeIdentifier("Folate");
    public static final HKDietaryQuantityTypeIdentifier Iodine = new HKDietaryQuantityTypeIdentifier("Iodine");
    public static final HKDietaryQuantityTypeIdentifier Iron = new HKDietaryQuantityTypeIdentifier("Iron");
    public static final HKDietaryQuantityTypeIdentifier Magnesium = new HKDietaryQuantityTypeIdentifier("Magnesium");
    public static final HKDietaryQuantityTypeIdentifier Manganese = new HKDietaryQuantityTypeIdentifier("Manganese");
    public static final HKDietaryQuantityTypeIdentifier Molybdenum = new HKDietaryQuantityTypeIdentifier("Molybdenum");
    public static final HKDietaryQuantityTypeIdentifier Niacin = new HKDietaryQuantityTypeIdentifier("Niacin");
    public static final HKDietaryQuantityTypeIdentifier PantothenicAcid = new HKDietaryQuantityTypeIdentifier("PantothenicAcid");
    public static final HKDietaryQuantityTypeIdentifier Phosphorus = new HKDietaryQuantityTypeIdentifier("Phosphorus");
    public static final HKDietaryQuantityTypeIdentifier Potassium = new HKDietaryQuantityTypeIdentifier("Potassium");
    public static final HKDietaryQuantityTypeIdentifier Protein = new HKDietaryQuantityTypeIdentifier("Protein");
    public static final HKDietaryQuantityTypeIdentifier Riboflavin = new HKDietaryQuantityTypeIdentifier("Riboflavin");
    public static final HKDietaryQuantityTypeIdentifier Selenium = new HKDietaryQuantityTypeIdentifier("Selenium");
    public static final HKDietaryQuantityTypeIdentifier Sodium = new HKDietaryQuantityTypeIdentifier("Sodium");
    public static final HKDietaryQuantityTypeIdentifier Sugar = new HKDietaryQuantityTypeIdentifier("Sugar");
    public static final HKDietaryQuantityTypeIdentifier Thiamin = new HKDietaryQuantityTypeIdentifier("Thiamin");
    public static final HKDietaryQuantityTypeIdentifier VitaminA = new HKDietaryQuantityTypeIdentifier("VitaminA");
    public static final HKDietaryQuantityTypeIdentifier VitaminB12 = new HKDietaryQuantityTypeIdentifier("VitaminB12");
    public static final HKDietaryQuantityTypeIdentifier VitaminB6 = new HKDietaryQuantityTypeIdentifier("VitaminB6");
    public static final HKDietaryQuantityTypeIdentifier VitaminC = new HKDietaryQuantityTypeIdentifier("VitaminC");
    public static final HKDietaryQuantityTypeIdentifier VitaminD = new HKDietaryQuantityTypeIdentifier("VitaminD");
    public static final HKDietaryQuantityTypeIdentifier VitaminE = new HKDietaryQuantityTypeIdentifier("VitaminE");
    public static final HKDietaryQuantityTypeIdentifier VitaminK = new HKDietaryQuantityTypeIdentifier("VitaminK");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKDietaryQuantityTypeIdentifier Water = new HKDietaryQuantityTypeIdentifier("Water");
    public static final HKDietaryQuantityTypeIdentifier Zinc = new HKDietaryQuantityTypeIdentifier("Zinc");
    /*</constants>*/
    
    private static /*<name>*/HKDietaryQuantityTypeIdentifier/*</name>*/[] values = new /*<name>*/HKDietaryQuantityTypeIdentifier/*</name>*/[] {/*<value_list>*/Biotin, Caffeine, Calcium, Carbohydrates, Chloride, Cholesterol, Chromium, Copper, EnergyConsumed, FatMonounsaturated, FatPolyunsaturated, FatSaturated, FatTotal, Fiber, Folate, Iodine, Iron, Magnesium, Manganese, Molybdenum, Niacin, PantothenicAcid, Phosphorus, Potassium, Protein, Riboflavin, Selenium, Sodium, Sugar, Thiamin, VitaminA, VitaminB12, VitaminB6, VitaminC, VitaminD, VitaminE, VitaminK, Water, Zinc/*</value_list>*/};
    
    /*<name>*/HKDietaryQuantityTypeIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKDietaryQuantityTypeIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKDietaryQuantityTypeIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKDietaryQuantityTypeIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryBiotin", optional=true)
        public static native NSString Biotin();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryCaffeine", optional=true)
        public static native NSString Caffeine();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryCalcium", optional=true)
        public static native NSString Calcium();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryCarbohydrates", optional=true)
        public static native NSString Carbohydrates();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryChloride", optional=true)
        public static native NSString Chloride();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryCholesterol", optional=true)
        public static native NSString Cholesterol();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryChromium", optional=true)
        public static native NSString Chromium();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryCopper", optional=true)
        public static native NSString Copper();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryEnergyConsumed", optional=true)
        public static native NSString EnergyConsumed();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryFatMonounsaturated", optional=true)
        public static native NSString FatMonounsaturated();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryFatPolyunsaturated", optional=true)
        public static native NSString FatPolyunsaturated();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryFatSaturated", optional=true)
        public static native NSString FatSaturated();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryFatTotal", optional=true)
        public static native NSString FatTotal();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryFiber", optional=true)
        public static native NSString Fiber();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryFolate", optional=true)
        public static native NSString Folate();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryIodine", optional=true)
        public static native NSString Iodine();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryIron", optional=true)
        public static native NSString Iron();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryMagnesium", optional=true)
        public static native NSString Magnesium();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryManganese", optional=true)
        public static native NSString Manganese();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryMolybdenum", optional=true)
        public static native NSString Molybdenum();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryNiacin", optional=true)
        public static native NSString Niacin();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryPantothenicAcid", optional=true)
        public static native NSString PantothenicAcid();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryPhosphorus", optional=true)
        public static native NSString Phosphorus();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryPotassium", optional=true)
        public static native NSString Potassium();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryProtein", optional=true)
        public static native NSString Protein();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryRiboflavin", optional=true)
        public static native NSString Riboflavin();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietarySelenium", optional=true)
        public static native NSString Selenium();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietarySodium", optional=true)
        public static native NSString Sodium();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietarySugar", optional=true)
        public static native NSString Sugar();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryThiamin", optional=true)
        public static native NSString Thiamin();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryVitaminA", optional=true)
        public static native NSString VitaminA();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryVitaminB12", optional=true)
        public static native NSString VitaminB12();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryVitaminB6", optional=true)
        public static native NSString VitaminB6();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryVitaminC", optional=true)
        public static native NSString VitaminC();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryVitaminD", optional=true)
        public static native NSString VitaminD();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryVitaminE", optional=true)
        public static native NSString VitaminE();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryVitaminK", optional=true)
        public static native NSString VitaminK();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryWater", optional=true)
        public static native NSString Water();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDietaryZinc", optional=true)
        public static native NSString Zinc();
        /*</values>*/
    }
}
