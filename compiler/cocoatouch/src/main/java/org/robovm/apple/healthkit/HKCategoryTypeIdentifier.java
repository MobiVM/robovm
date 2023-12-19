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
@Marshaler(/*<name>*/HKCategoryTypeIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKCategoryTypeIdentifier/*</name>*/ 
    extends /*<extends>*/HKTypeIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKCategoryTypeIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKCategoryTypeIdentifier toObject(Class<HKCategoryTypeIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKCategoryTypeIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKCategoryTypeIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKCategoryTypeIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKCategoryTypeIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKCategoryTypeIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKCategoryTypeIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKCategoryTypeIdentifier o : l) {
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
    public static final HKCategoryTypeIdentifier AppleStandHour = new HKCategoryTypeIdentifier("AppleStandHour");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKCategoryTypeIdentifier EnvironmentalAudioExposureEvent = new HKCategoryTypeIdentifier("EnvironmentalAudioExposureEvent");
    /**
     * @since Available in iOS 14.2 and later.
     */
    public static final HKCategoryTypeIdentifier HeadphoneAudioExposureEvent = new HKCategoryTypeIdentifier("HeadphoneAudioExposureEvent");
    /**
     * @since Available in iOS 12.2 and later.
     */
    public static final HKCategoryTypeIdentifier HighHeartRateEvent = new HKCategoryTypeIdentifier("HighHeartRateEvent");
    /**
     * @since Available in iOS 12.2 and later.
     */
    public static final HKCategoryTypeIdentifier IrregularHeartRhythmEvent = new HKCategoryTypeIdentifier("IrregularHeartRhythmEvent");
    /**
     * @since Available in iOS 14.3 and later.
     */
    public static final HKCategoryTypeIdentifier LowCardioFitnessEvent = new HKCategoryTypeIdentifier("LowCardioFitnessEvent");
    /**
     * @since Available in iOS 12.2 and later.
     */
    public static final HKCategoryTypeIdentifier LowHeartRateEvent = new HKCategoryTypeIdentifier("LowHeartRateEvent");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKCategoryTypeIdentifier MindfulSession = new HKCategoryTypeIdentifier("MindfulSession");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final HKCategoryTypeIdentifier AppleWalkingSteadinessEvent = new HKCategoryTypeIdentifier("AppleWalkingSteadinessEvent");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKCategoryTypeIdentifier HandwashingEvent = new HKCategoryTypeIdentifier("HandwashingEvent");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final HKCategoryTypeIdentifier ToothbrushingEvent = new HKCategoryTypeIdentifier("ToothbrushingEvent");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKCategoryTypeIdentifier CervicalMucusQuality = new HKCategoryTypeIdentifier("CervicalMucusQuality");
    /**
     * @since Available in iOS 14.3 and later.
     */
    public static final HKCategoryTypeIdentifier Contraceptive = new HKCategoryTypeIdentifier("Contraceptive");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKCategoryTypeIdentifier InfrequentMenstrualCycles = new HKCategoryTypeIdentifier("InfrequentMenstrualCycles");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKCategoryTypeIdentifier IntermenstrualBleeding = new HKCategoryTypeIdentifier("IntermenstrualBleeding");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKCategoryTypeIdentifier IrregularMenstrualCycles = new HKCategoryTypeIdentifier("IrregularMenstrualCycles");
    /**
     * @since Available in iOS 14.3 and later.
     */
    public static final HKCategoryTypeIdentifier Lactation = new HKCategoryTypeIdentifier("Lactation");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKCategoryTypeIdentifier MenstrualFlow = new HKCategoryTypeIdentifier("MenstrualFlow");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKCategoryTypeIdentifier OvulationTestResult = new HKCategoryTypeIdentifier("OvulationTestResult");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKCategoryTypeIdentifier PersistentIntermenstrualBleeding = new HKCategoryTypeIdentifier("PersistentIntermenstrualBleeding");
    /**
     * @since Available in iOS 14.3 and later.
     */
    public static final HKCategoryTypeIdentifier Pregnancy = new HKCategoryTypeIdentifier("Pregnancy");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final HKCategoryTypeIdentifier PregnancyTestResult = new HKCategoryTypeIdentifier("PregnancyTestResult");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final HKCategoryTypeIdentifier ProgesteroneTestResult = new HKCategoryTypeIdentifier("ProgesteroneTestResult");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final HKCategoryTypeIdentifier ProlongedMenstrualPeriods = new HKCategoryTypeIdentifier("ProlongedMenstrualPeriods");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HKCategoryTypeIdentifier SexualActivity = new HKCategoryTypeIdentifier("SexualActivity");
    public static final HKCategoryTypeIdentifier SleepAnalysis = new HKCategoryTypeIdentifier("SleepAnalysis");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier AbdominalCramps = new HKCategoryTypeIdentifier("AbdominalCramps");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Acne = new HKCategoryTypeIdentifier("Acne");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier AppetiteChanges = new HKCategoryTypeIdentifier("AppetiteChanges");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKCategoryTypeIdentifier BladderIncontinence = new HKCategoryTypeIdentifier("BladderIncontinence");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Bloating = new HKCategoryTypeIdentifier("Bloating");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier BreastPain = new HKCategoryTypeIdentifier("BreastPain");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier ChestTightnessOrPain = new HKCategoryTypeIdentifier("ChestTightnessOrPain");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Chills = new HKCategoryTypeIdentifier("Chills");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Constipation = new HKCategoryTypeIdentifier("Constipation");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Coughing = new HKCategoryTypeIdentifier("Coughing");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Diarrhea = new HKCategoryTypeIdentifier("Diarrhea");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Dizziness = new HKCategoryTypeIdentifier("Dizziness");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKCategoryTypeIdentifier DrySkin = new HKCategoryTypeIdentifier("DrySkin");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Fainting = new HKCategoryTypeIdentifier("Fainting");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Fatigue = new HKCategoryTypeIdentifier("Fatigue");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Fever = new HKCategoryTypeIdentifier("Fever");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier GeneralizedBodyAche = new HKCategoryTypeIdentifier("GeneralizedBodyAche");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKCategoryTypeIdentifier HairLoss = new HKCategoryTypeIdentifier("HairLoss");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Headache = new HKCategoryTypeIdentifier("Headache");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Heartburn = new HKCategoryTypeIdentifier("Heartburn");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier HotFlashes = new HKCategoryTypeIdentifier("HotFlashes");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier LossOfSmell = new HKCategoryTypeIdentifier("LossOfSmell");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier LossOfTaste = new HKCategoryTypeIdentifier("LossOfTaste");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier LowerBackPain = new HKCategoryTypeIdentifier("LowerBackPain");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKCategoryTypeIdentifier MemoryLapse = new HKCategoryTypeIdentifier("MemoryLapse");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier MoodChanges = new HKCategoryTypeIdentifier("MoodChanges");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Nausea = new HKCategoryTypeIdentifier("Nausea");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKCategoryTypeIdentifier NightSweats = new HKCategoryTypeIdentifier("NightSweats");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier PelvicPain = new HKCategoryTypeIdentifier("PelvicPain");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier RapidPoundingOrFlutteringHeartbeat = new HKCategoryTypeIdentifier("RapidPoundingOrFlutteringHeartbeat");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier RunnyNose = new HKCategoryTypeIdentifier("RunnyNose");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier ShortnessOfBreath = new HKCategoryTypeIdentifier("ShortnessOfBreath");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier SinusCongestion = new HKCategoryTypeIdentifier("SinusCongestion");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier SkippedHeartbeat = new HKCategoryTypeIdentifier("SkippedHeartbeat");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier SleepChanges = new HKCategoryTypeIdentifier("SleepChanges");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier SoreThroat = new HKCategoryTypeIdentifier("SoreThroat");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKCategoryTypeIdentifier VaginalDryness = new HKCategoryTypeIdentifier("VaginalDryness");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Vomiting = new HKCategoryTypeIdentifier("Vomiting");
    /**
     * @since Available in iOS 13.6 and later.
     */
    public static final HKCategoryTypeIdentifier Wheezing = new HKCategoryTypeIdentifier("Wheezing");
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use HKCategoryTypeIdentifierEnvironmentalAudioExposureEvent
     */
    @Deprecated
    public static final HKCategoryTypeIdentifier AudioExposureEvent = new HKCategoryTypeIdentifier("AudioExposureEvent");
    /*</constants>*/
    
    private static /*<name>*/HKCategoryTypeIdentifier/*</name>*/[] values = new /*<name>*/HKCategoryTypeIdentifier/*</name>*/[] {/*<value_list>*/AppleStandHour, EnvironmentalAudioExposureEvent, HeadphoneAudioExposureEvent, HighHeartRateEvent, IrregularHeartRhythmEvent, LowCardioFitnessEvent, LowHeartRateEvent, MindfulSession, AppleWalkingSteadinessEvent, HandwashingEvent, ToothbrushingEvent, CervicalMucusQuality, Contraceptive, InfrequentMenstrualCycles, IntermenstrualBleeding, IrregularMenstrualCycles, Lactation, MenstrualFlow, OvulationTestResult, PersistentIntermenstrualBleeding, Pregnancy, PregnancyTestResult, ProgesteroneTestResult, ProlongedMenstrualPeriods, SexualActivity, SleepAnalysis, AbdominalCramps, Acne, AppetiteChanges, BladderIncontinence, Bloating, BreastPain, ChestTightnessOrPain, Chills, Constipation, Coughing, Diarrhea, Dizziness, DrySkin, Fainting, Fatigue, Fever, GeneralizedBodyAche, HairLoss, Headache, Heartburn, HotFlashes, LossOfSmell, LossOfTaste, LowerBackPain, MemoryLapse, MoodChanges, Nausea, NightSweats, PelvicPain, RapidPoundingOrFlutteringHeartbeat, RunnyNose, ShortnessOfBreath, SinusCongestion, SkippedHeartbeat, SleepChanges, SoreThroat, VaginalDryness, Vomiting, Wheezing, AudioExposureEvent/*</value_list>*/};
    
    /*<name>*/HKCategoryTypeIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKCategoryTypeIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKCategoryTypeIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKCategoryTypeIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierAppleStandHour", optional=true)
        public static native NSString AppleStandHour();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierEnvironmentalAudioExposureEvent", optional=true)
        public static native NSString EnvironmentalAudioExposureEvent();
        /**
         * @since Available in iOS 14.2 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierHeadphoneAudioExposureEvent", optional=true)
        public static native NSString HeadphoneAudioExposureEvent();
        /**
         * @since Available in iOS 12.2 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierHighHeartRateEvent", optional=true)
        public static native NSString HighHeartRateEvent();
        /**
         * @since Available in iOS 12.2 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierIrregularHeartRhythmEvent", optional=true)
        public static native NSString IrregularHeartRhythmEvent();
        /**
         * @since Available in iOS 14.3 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierLowCardioFitnessEvent", optional=true)
        public static native NSString LowCardioFitnessEvent();
        /**
         * @since Available in iOS 12.2 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierLowHeartRateEvent", optional=true)
        public static native NSString LowHeartRateEvent();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierMindfulSession", optional=true)
        public static native NSString MindfulSession();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierAppleWalkingSteadinessEvent", optional=true)
        public static native NSString AppleWalkingSteadinessEvent();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierHandwashingEvent", optional=true)
        public static native NSString HandwashingEvent();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierToothbrushingEvent", optional=true)
        public static native NSString ToothbrushingEvent();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierCervicalMucusQuality", optional=true)
        public static native NSString CervicalMucusQuality();
        /**
         * @since Available in iOS 14.3 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierContraceptive", optional=true)
        public static native NSString Contraceptive();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierInfrequentMenstrualCycles", optional=true)
        public static native NSString InfrequentMenstrualCycles();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierIntermenstrualBleeding", optional=true)
        public static native NSString IntermenstrualBleeding();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierIrregularMenstrualCycles", optional=true)
        public static native NSString IrregularMenstrualCycles();
        /**
         * @since Available in iOS 14.3 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierLactation", optional=true)
        public static native NSString Lactation();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierMenstrualFlow", optional=true)
        public static native NSString MenstrualFlow();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierOvulationTestResult", optional=true)
        public static native NSString OvulationTestResult();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierPersistentIntermenstrualBleeding", optional=true)
        public static native NSString PersistentIntermenstrualBleeding();
        /**
         * @since Available in iOS 14.3 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierPregnancy", optional=true)
        public static native NSString Pregnancy();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierPregnancyTestResult", optional=true)
        public static native NSString PregnancyTestResult();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierProgesteroneTestResult", optional=true)
        public static native NSString ProgesteroneTestResult();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierProlongedMenstrualPeriods", optional=true)
        public static native NSString ProlongedMenstrualPeriods();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierSexualActivity", optional=true)
        public static native NSString SexualActivity();
        @GlobalValue(symbol="HKCategoryTypeIdentifierSleepAnalysis", optional=true)
        public static native NSString SleepAnalysis();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierAbdominalCramps", optional=true)
        public static native NSString AbdominalCramps();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierAcne", optional=true)
        public static native NSString Acne();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierAppetiteChanges", optional=true)
        public static native NSString AppetiteChanges();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierBladderIncontinence", optional=true)
        public static native NSString BladderIncontinence();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierBloating", optional=true)
        public static native NSString Bloating();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierBreastPain", optional=true)
        public static native NSString BreastPain();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierChestTightnessOrPain", optional=true)
        public static native NSString ChestTightnessOrPain();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierChills", optional=true)
        public static native NSString Chills();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierConstipation", optional=true)
        public static native NSString Constipation();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierCoughing", optional=true)
        public static native NSString Coughing();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierDiarrhea", optional=true)
        public static native NSString Diarrhea();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierDizziness", optional=true)
        public static native NSString Dizziness();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierDrySkin", optional=true)
        public static native NSString DrySkin();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierFainting", optional=true)
        public static native NSString Fainting();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierFatigue", optional=true)
        public static native NSString Fatigue();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierFever", optional=true)
        public static native NSString Fever();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierGeneralizedBodyAche", optional=true)
        public static native NSString GeneralizedBodyAche();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierHairLoss", optional=true)
        public static native NSString HairLoss();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierHeadache", optional=true)
        public static native NSString Headache();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierHeartburn", optional=true)
        public static native NSString Heartburn();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierHotFlashes", optional=true)
        public static native NSString HotFlashes();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierLossOfSmell", optional=true)
        public static native NSString LossOfSmell();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierLossOfTaste", optional=true)
        public static native NSString LossOfTaste();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierLowerBackPain", optional=true)
        public static native NSString LowerBackPain();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierMemoryLapse", optional=true)
        public static native NSString MemoryLapse();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierMoodChanges", optional=true)
        public static native NSString MoodChanges();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierNausea", optional=true)
        public static native NSString Nausea();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierNightSweats", optional=true)
        public static native NSString NightSweats();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierPelvicPain", optional=true)
        public static native NSString PelvicPain();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierRapidPoundingOrFlutteringHeartbeat", optional=true)
        public static native NSString RapidPoundingOrFlutteringHeartbeat();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierRunnyNose", optional=true)
        public static native NSString RunnyNose();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierShortnessOfBreath", optional=true)
        public static native NSString ShortnessOfBreath();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierSinusCongestion", optional=true)
        public static native NSString SinusCongestion();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierSkippedHeartbeat", optional=true)
        public static native NSString SkippedHeartbeat();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierSleepChanges", optional=true)
        public static native NSString SleepChanges();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierSoreThroat", optional=true)
        public static native NSString SoreThroat();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierVaginalDryness", optional=true)
        public static native NSString VaginalDryness();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierVomiting", optional=true)
        public static native NSString Vomiting();
        /**
         * @since Available in iOS 13.6 and later.
         */
        @GlobalValue(symbol="HKCategoryTypeIdentifierWheezing", optional=true)
        public static native NSString Wheezing();
        /**
         * @since Available in iOS 13.0 and later.
         * @deprecated Deprecated in iOS 14.0. Use HKCategoryTypeIdentifierEnvironmentalAudioExposureEvent
         */
        @Deprecated
        @GlobalValue(symbol="HKCategoryTypeIdentifierAudioExposureEvent", optional=true)
        public static native NSString AudioExposureEvent();
        /*</values>*/
    }
}
