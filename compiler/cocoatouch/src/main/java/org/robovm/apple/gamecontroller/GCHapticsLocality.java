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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("GameController") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/GCHapticsLocality/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCHapticsLocality/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/GCHapticsLocality/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static GCHapticsLocality toObject(Class<GCHapticsLocality> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return GCHapticsLocality.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(GCHapticsLocality o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<GCHapticsLocality> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<GCHapticsLocality> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(GCHapticsLocality.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<GCHapticsLocality> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (GCHapticsLocality o : l) {
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
    public static final GCHapticsLocality Default = new GCHapticsLocality("Default");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final GCHapticsLocality All = new GCHapticsLocality("All");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final GCHapticsLocality Handles = new GCHapticsLocality("Handles");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final GCHapticsLocality LeftHandle = new GCHapticsLocality("LeftHandle");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final GCHapticsLocality RightHandle = new GCHapticsLocality("RightHandle");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final GCHapticsLocality Triggers = new GCHapticsLocality("Triggers");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final GCHapticsLocality LeftTrigger = new GCHapticsLocality("LeftTrigger");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final GCHapticsLocality RightTrigger = new GCHapticsLocality("RightTrigger");
    /*</constants>*/
    
    private static /*<name>*/GCHapticsLocality/*</name>*/[] values = new /*<name>*/GCHapticsLocality/*</name>*/[] {/*<value_list>*/Default, All, Handles, LeftHandle, RightHandle, Triggers, LeftTrigger, RightTrigger/*</value_list>*/};
    
    /*<name>*/GCHapticsLocality/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/GCHapticsLocality/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/GCHapticsLocality/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/GCHapticsLocality/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("GameController") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCHapticsLocalityDefault", optional=true)
        public static native NSString Default();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCHapticsLocalityAll", optional=true)
        public static native NSString All();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCHapticsLocalityHandles", optional=true)
        public static native NSString Handles();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCHapticsLocalityLeftHandle", optional=true)
        public static native NSString LeftHandle();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCHapticsLocalityRightHandle", optional=true)
        public static native NSString RightHandle();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCHapticsLocalityTriggers", optional=true)
        public static native NSString Triggers();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCHapticsLocalityLeftTrigger", optional=true)
        public static native NSString LeftTrigger();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="GCHapticsLocalityRightTrigger", optional=true)
        public static native NSString RightTrigger();
        /*</values>*/
    }
}
