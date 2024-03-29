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
@Marshaler(/*<name>*/HKWorkoutSortIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKWorkoutSortIdentifier/*</name>*/ 
    extends /*<extends>*/NSSortIdentifier/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKWorkoutSortIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKWorkoutSortIdentifier toObject(Class<HKWorkoutSortIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKWorkoutSortIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKWorkoutSortIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKWorkoutSortIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKWorkoutSortIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKWorkoutSortIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKWorkoutSortIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKWorkoutSortIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final HKWorkoutSortIdentifier Duration = new HKWorkoutSortIdentifier("Duration");
    public static final HKWorkoutSortIdentifier TotalDistance = new HKWorkoutSortIdentifier("TotalDistance");
    public static final HKWorkoutSortIdentifier TotalEnergyBurned = new HKWorkoutSortIdentifier("TotalEnergyBurned");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HKWorkoutSortIdentifier TotalSwimmingStrokeCount = new HKWorkoutSortIdentifier("TotalSwimmingStrokeCount");
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final HKWorkoutSortIdentifier TotalFlightsClimbed = new HKWorkoutSortIdentifier("TotalFlightsClimbed");
    /*</constants>*/
    
    private static /*<name>*/HKWorkoutSortIdentifier/*</name>*/[] values = new /*<name>*/HKWorkoutSortIdentifier/*</name>*/[] {/*<value_list>*/Duration, TotalDistance, TotalEnergyBurned, TotalSwimmingStrokeCount, TotalFlightsClimbed/*</value_list>*/};
    
    /*<name>*/HKWorkoutSortIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKWorkoutSortIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKWorkoutSortIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKWorkoutSortIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="HKWorkoutSortIdentifierDuration", optional=true)
        public static native NSString Duration();
        @GlobalValue(symbol="HKWorkoutSortIdentifierTotalDistance", optional=true)
        public static native NSString TotalDistance();
        @GlobalValue(symbol="HKWorkoutSortIdentifierTotalEnergyBurned", optional=true)
        public static native NSString TotalEnergyBurned();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HKWorkoutSortIdentifierTotalSwimmingStrokeCount", optional=true)
        public static native NSString TotalSwimmingStrokeCount();
        /**
         * @since Available in iOS 11.0 and later.
         */
        @GlobalValue(symbol="HKWorkoutSortIdentifierTotalFlightsClimbed", optional=true)
        public static native NSString TotalFlightsClimbed();
        /*</values>*/
    }
}
