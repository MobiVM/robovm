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
package org.robovm.apple.nearbyinteraction;

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
/*<annotations>*/@Library("NearbyInteraction") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/NIAlgorithmConvergenceStatusReason/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NIAlgorithmConvergenceStatusReason/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NIAlgorithmConvergenceStatusReason/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NIAlgorithmConvergenceStatusReason toObject(Class<NIAlgorithmConvergenceStatusReason> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NIAlgorithmConvergenceStatusReason.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NIAlgorithmConvergenceStatusReason o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NIAlgorithmConvergenceStatusReason> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NIAlgorithmConvergenceStatusReason> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NIAlgorithmConvergenceStatusReason.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NIAlgorithmConvergenceStatusReason> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NIAlgorithmConvergenceStatusReason o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final NIAlgorithmConvergenceStatusReason NIAlgorithmConvergenceStatusReasonInsufficientHorizontalSweep = new NIAlgorithmConvergenceStatusReason("NIAlgorithmConvergenceStatusReasonInsufficientHorizontalSweep");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final NIAlgorithmConvergenceStatusReason NIAlgorithmConvergenceStatusReasonInsufficientVerticalSweep = new NIAlgorithmConvergenceStatusReason("NIAlgorithmConvergenceStatusReasonInsufficientVerticalSweep");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final NIAlgorithmConvergenceStatusReason NIAlgorithmConvergenceStatusReasonInsufficientMovement = new NIAlgorithmConvergenceStatusReason("NIAlgorithmConvergenceStatusReasonInsufficientMovement");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final NIAlgorithmConvergenceStatusReason NIAlgorithmConvergenceStatusReasonInsufficientLighting = new NIAlgorithmConvergenceStatusReason("NIAlgorithmConvergenceStatusReasonInsufficientLighting");
    /*</constants>*/
    
    private static /*<name>*/NIAlgorithmConvergenceStatusReason/*</name>*/[] values = new /*<name>*/NIAlgorithmConvergenceStatusReason/*</name>*/[] {/*<value_list>*/NIAlgorithmConvergenceStatusReasonInsufficientHorizontalSweep, NIAlgorithmConvergenceStatusReasonInsufficientVerticalSweep, NIAlgorithmConvergenceStatusReasonInsufficientMovement, NIAlgorithmConvergenceStatusReasonInsufficientLighting/*</value_list>*/};
    
    /*<name>*/NIAlgorithmConvergenceStatusReason/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NIAlgorithmConvergenceStatusReason/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NIAlgorithmConvergenceStatusReason/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NIAlgorithmConvergenceStatusReason/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("NearbyInteraction") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="NIAlgorithmConvergenceStatusReasonInsufficientHorizontalSweep", optional=true)
        public static native NSString NIAlgorithmConvergenceStatusReasonInsufficientHorizontalSweep();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="NIAlgorithmConvergenceStatusReasonInsufficientVerticalSweep", optional=true)
        public static native NSString NIAlgorithmConvergenceStatusReasonInsufficientVerticalSweep();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="NIAlgorithmConvergenceStatusReasonInsufficientMovement", optional=true)
        public static native NSString NIAlgorithmConvergenceStatusReasonInsufficientMovement();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="NIAlgorithmConvergenceStatusReasonInsufficientLighting", optional=true)
        public static native NSString NIAlgorithmConvergenceStatusReasonInsufficientLighting();
        /*</values>*/
    }
}
