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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/MTLCommonCounterSet/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLCommonCounterSet/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/MTLCommonCounterSet/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static MTLCommonCounterSet toObject(Class<MTLCommonCounterSet> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return MTLCommonCounterSet.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(MTLCommonCounterSet o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<MTLCommonCounterSet> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<MTLCommonCounterSet> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(MTLCommonCounterSet.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<MTLCommonCounterSet> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (MTLCommonCounterSet o : l) {
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
    public static final MTLCommonCounterSet Timestamp = new MTLCommonCounterSet("Timestamp");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounterSet StageUtilization = new MTLCommonCounterSet("StageUtilization");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final MTLCommonCounterSet Statistic = new MTLCommonCounterSet("Statistic");
    /*</constants>*/
    
    private static /*<name>*/MTLCommonCounterSet/*</name>*/[] values = new /*<name>*/MTLCommonCounterSet/*</name>*/[] {/*<value_list>*/Timestamp, StageUtilization, Statistic/*</value_list>*/};
    
    /*<name>*/MTLCommonCounterSet/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/MTLCommonCounterSet/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/MTLCommonCounterSet/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/MTLCommonCounterSet/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Metal") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterSetTimestamp", optional=true)
        public static native NSString Timestamp();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterSetStageUtilization", optional=true)
        public static native NSString StageUtilization();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="MTLCommonCounterSetStatistic", optional=true)
        public static native NSString Statistic();
        /*</values>*/
    }
}
