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
@Marshaler(/*<name>*/HKFHIRRelease/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKFHIRRelease/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HKFHIRRelease/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HKFHIRRelease toObject(Class<HKFHIRRelease> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HKFHIRRelease.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HKFHIRRelease o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HKFHIRRelease> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HKFHIRRelease> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HKFHIRRelease.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HKFHIRRelease> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HKFHIRRelease o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKFHIRRelease DSTU2 = new HKFHIRRelease("DSTU2");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKFHIRRelease R4 = new HKFHIRRelease("R4");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final HKFHIRRelease Unknown = new HKFHIRRelease("Unknown");
    /*</constants>*/
    
    private static /*<name>*/HKFHIRRelease/*</name>*/[] values = new /*<name>*/HKFHIRRelease/*</name>*/[] {/*<value_list>*/DSTU2, R4, Unknown/*</value_list>*/};
    
    /*<name>*/HKFHIRRelease/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HKFHIRRelease/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HKFHIRRelease/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HKFHIRRelease/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HealthKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKFHIRReleaseDSTU2", optional=true)
        public static native NSString DSTU2();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKFHIRReleaseR4", optional=true)
        public static native NSString R4();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="HKFHIRReleaseUnknown", optional=true)
        public static native NSString Unknown();
        /*</values>*/
    }
}
