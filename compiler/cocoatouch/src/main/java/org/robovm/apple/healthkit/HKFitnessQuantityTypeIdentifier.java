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
@Marshaler(/*<name>*/HKFitnessQuantityTypeIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKFitnessQuantityTypeIdentifier/*</name>*/ 
    extends /*<extends>*/HKQuantityTypeIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKFitnessQuantityTypeIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKFitnessQuantityTypeIdentifier toObject(Class<HKFitnessQuantityTypeIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKFitnessQuantityTypeIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKFitnessQuantityTypeIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKFitnessQuantityTypeIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKFitnessQuantityTypeIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKFitnessQuantityTypeIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKFitnessQuantityTypeIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKFitnessQuantityTypeIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final HKFitnessQuantityTypeIdentifier StepCount = new HKFitnessQuantityTypeIdentifier("StepCount");
    public static final HKFitnessQuantityTypeIdentifier DistanceWalkingRunning = new HKFitnessQuantityTypeIdentifier("DistanceWalkingRunning");
    public static final HKFitnessQuantityTypeIdentifier DistanceCycling = new HKFitnessQuantityTypeIdentifier("DistanceCycling");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier DistanceWheelchair = new HKFitnessQuantityTypeIdentifier("DistanceWheelchair");
    public static final HKFitnessQuantityTypeIdentifier BasalEnergyBurned = new HKFitnessQuantityTypeIdentifier("BasalEnergyBurned");
    public static final HKFitnessQuantityTypeIdentifier ActiveEnergyBurned = new HKFitnessQuantityTypeIdentifier("ActiveEnergyBurned");
    public static final HKFitnessQuantityTypeIdentifier FlightsClimbed = new HKFitnessQuantityTypeIdentifier("FlightsClimbed");
    public static final HKFitnessQuantityTypeIdentifier NikeFuel = new HKFitnessQuantityTypeIdentifier("NikeFuel");
    /**
     * @since Available in iOS 9.3 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier AppleExerciseTime = new HKFitnessQuantityTypeIdentifier("AppleExerciseTime");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier PushCount = new HKFitnessQuantityTypeIdentifier("PushCount");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier DistanceSwimming = new HKFitnessQuantityTypeIdentifier("DistanceSwimming");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier SwimmingStrokeCount = new HKFitnessQuantityTypeIdentifier("SwimmingStrokeCount");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier VO2Max = new HKFitnessQuantityTypeIdentifier("VO2Max");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier DistanceDownhillSnowSports = new HKFitnessQuantityTypeIdentifier("DistanceDownhillSnowSports");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier AppleStandTime = new HKFitnessQuantityTypeIdentifier("AppleStandTime");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier WalkingSpeed = new HKFitnessQuantityTypeIdentifier("WalkingSpeed");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier WalkingDoubleSupportPercentage = new HKFitnessQuantityTypeIdentifier("WalkingDoubleSupportPercentage");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier WalkingAsymmetryPercentage = new HKFitnessQuantityTypeIdentifier("WalkingAsymmetryPercentage");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier WalkingStepLength = new HKFitnessQuantityTypeIdentifier("WalkingStepLength");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier SixMinuteWalkTestDistance = new HKFitnessQuantityTypeIdentifier("SixMinuteWalkTestDistance");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier StairAscentSpeed = new HKFitnessQuantityTypeIdentifier("StairAscentSpeed");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier StairDescentSpeed = new HKFitnessQuantityTypeIdentifier("StairDescentSpeed");
    /**
     * @since Available in iOS 14.5 and later.
     */
    public static final HKFitnessQuantityTypeIdentifier AppleMoveTime = new HKFitnessQuantityTypeIdentifier("AppleMoveTime");
    /*</constants>*/
    
    private static /*<name>*/HKFitnessQuantityTypeIdentifier/*</name>*/[] values = new /*<name>*/HKFitnessQuantityTypeIdentifier/*</name>*/[] {/*<value_list>*/StepCount, DistanceWalkingRunning, DistanceCycling, DistanceWheelchair, BasalEnergyBurned, ActiveEnergyBurned, FlightsClimbed, NikeFuel, AppleExerciseTime, PushCount, DistanceSwimming, SwimmingStrokeCount, VO2Max, DistanceDownhillSnowSports, AppleStandTime, WalkingSpeed, WalkingDoubleSupportPercentage, WalkingAsymmetryPercentage, WalkingStepLength, SixMinuteWalkTestDistance, StairAscentSpeed, StairDescentSpeed, AppleMoveTime/*</value_list>*/};
    
    /*<name>*/HKFitnessQuantityTypeIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKFitnessQuantityTypeIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKFitnessQuantityTypeIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKFitnessQuantityTypeIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="HKQuantityTypeIdentifierStepCount", optional=true)
        public static native NSString StepCount();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDistanceWalkingRunning", optional=true)
        public static native NSString DistanceWalkingRunning();
        @GlobalValue(symbol="HKQuantityTypeIdentifierDistanceCycling", optional=true)
        public static native NSString DistanceCycling();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierDistanceWheelchair", optional=true)
        public static native NSString DistanceWheelchair();
        @GlobalValue(symbol="HKQuantityTypeIdentifierBasalEnergyBurned", optional=true)
        public static native NSString BasalEnergyBurned();
        @GlobalValue(symbol="HKQuantityTypeIdentifierActiveEnergyBurned", optional=true)
        public static native NSString ActiveEnergyBurned();
        @GlobalValue(symbol="HKQuantityTypeIdentifierFlightsClimbed", optional=true)
        public static native NSString FlightsClimbed();
        @GlobalValue(symbol="HKQuantityTypeIdentifierNikeFuel", optional=true)
        public static native NSString NikeFuel();
        /**
         * @since Available in iOS 9.3 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierAppleExerciseTime", optional=true)
        public static native NSString AppleExerciseTime();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierPushCount", optional=true)
        public static native NSString PushCount();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierDistanceSwimming", optional=true)
        public static native NSString DistanceSwimming();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierSwimmingStrokeCount", optional=true)
        public static native NSString SwimmingStrokeCount();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierVO2Max", optional=true)
        public static native NSString VO2Max();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierDistanceDownhillSnowSports", optional=true)
        public static native NSString DistanceDownhillSnowSports();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierAppleStandTime", optional=true)
        public static native NSString AppleStandTime();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierWalkingSpeed", optional=true)
        public static native NSString WalkingSpeed();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierWalkingDoubleSupportPercentage", optional=true)
        public static native NSString WalkingDoubleSupportPercentage();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierWalkingAsymmetryPercentage", optional=true)
        public static native NSString WalkingAsymmetryPercentage();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierWalkingStepLength", optional=true)
        public static native NSString WalkingStepLength();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierSixMinuteWalkTestDistance", optional=true)
        public static native NSString SixMinuteWalkTestDistance();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierStairAscentSpeed", optional=true)
        public static native NSString StairAscentSpeed();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierStairDescentSpeed", optional=true)
        public static native NSString StairDescentSpeed();
        /**
         * @since Available in iOS 14.5 and later.
         */
        @GlobalValue(symbol="HKQuantityTypeIdentifierAppleMoveTime", optional=true)
        public static native NSString AppleMoveTime();
        /*</values>*/
    }
}
