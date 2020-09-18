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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/INCarChargingConnectorType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INCarChargingConnectorType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/INCarChargingConnectorType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static INCarChargingConnectorType toObject(Class<INCarChargingConnectorType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return INCarChargingConnectorType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(INCarChargingConnectorType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<INCarChargingConnectorType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<INCarChargingConnectorType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(INCarChargingConnectorType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<INCarChargingConnectorType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (INCarChargingConnectorType o : l) {
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
    public static final INCarChargingConnectorType J1772 = new INCarChargingConnectorType("J1772");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final INCarChargingConnectorType CCS1 = new INCarChargingConnectorType("CCS1");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final INCarChargingConnectorType CCS2 = new INCarChargingConnectorType("CCS2");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final INCarChargingConnectorType CHAdeMO = new INCarChargingConnectorType("CHAdeMO");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final INCarChargingConnectorType GBTAC = new INCarChargingConnectorType("GBTAC");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final INCarChargingConnectorType GBTDC = new INCarChargingConnectorType("GBTDC");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final INCarChargingConnectorType Tesla = new INCarChargingConnectorType("Tesla");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final INCarChargingConnectorType Mennekes = new INCarChargingConnectorType("Mennekes");
    /*</constants>*/
    
    private static /*<name>*/INCarChargingConnectorType/*</name>*/[] values = new /*<name>*/INCarChargingConnectorType/*</name>*/[] {/*<value_list>*/J1772, CCS1, CCS2, CHAdeMO, GBTAC, GBTDC, Tesla, Mennekes/*</value_list>*/};
    
    /*<name>*/INCarChargingConnectorType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/INCarChargingConnectorType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/INCarChargingConnectorType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/INCarChargingConnectorType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Intents") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="INCarChargingConnectorTypeJ1772", optional=true)
        public static native NSString J1772();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="INCarChargingConnectorTypeCCS1", optional=true)
        public static native NSString CCS1();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="INCarChargingConnectorTypeCCS2", optional=true)
        public static native NSString CCS2();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="INCarChargingConnectorTypeCHAdeMO", optional=true)
        public static native NSString CHAdeMO();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="INCarChargingConnectorTypeGBTAC", optional=true)
        public static native NSString GBTAC();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="INCarChargingConnectorTypeGBTDC", optional=true)
        public static native NSString GBTDC();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="INCarChargingConnectorTypeTesla", optional=true)
        public static native NSString Tesla();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="INCarChargingConnectorTypeMennekes", optional=true)
        public static native NSString Mennekes();
        /*</values>*/
    }
}
