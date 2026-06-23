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
@Marshaler(/*<name>*/HKScoredAssessmentTypeIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKScoredAssessmentTypeIdentifier/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKScoredAssessmentTypeIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKScoredAssessmentTypeIdentifier toObject(Class<HKScoredAssessmentTypeIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKScoredAssessmentTypeIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKScoredAssessmentTypeIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKScoredAssessmentTypeIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKScoredAssessmentTypeIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKScoredAssessmentTypeIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKScoredAssessmentTypeIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKScoredAssessmentTypeIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final HKScoredAssessmentTypeIdentifier GAD7 = new HKScoredAssessmentTypeIdentifier("GAD7");
    /**
     * @since Available in iOS 18.0 and later.
     */
    public static final HKScoredAssessmentTypeIdentifier PHQ9 = new HKScoredAssessmentTypeIdentifier("PHQ9");
    /*</constants>*/
    
    private static /*<name>*/HKScoredAssessmentTypeIdentifier/*</name>*/[] values = new /*<name>*/HKScoredAssessmentTypeIdentifier/*</name>*/[] {/*<value_list>*/GAD7, PHQ9/*</value_list>*/};
    
    /*<name>*/HKScoredAssessmentTypeIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKScoredAssessmentTypeIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKScoredAssessmentTypeIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKScoredAssessmentTypeIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="HKScoredAssessmentTypeIdentifierGAD7", optional=true)
        public static native NSString GAD7();
        /**
         * @since Available in iOS 18.0 and later.
         */
        @GlobalValue(symbol="HKScoredAssessmentTypeIdentifierPHQ9", optional=true)
        public static native NSString PHQ9();
        /*</values>*/
    }
}
