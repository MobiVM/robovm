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
package org.robovm.apple.devicediscoveryextension;

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
import org.robovm.apple.network.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("DeviceDiscoveryExtension") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/DDDeviceProtocolString/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DDDeviceProtocolString/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/DDDeviceProtocolString/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static DDDeviceProtocolString toObject(Class<DDDeviceProtocolString> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return DDDeviceProtocolString.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(DDDeviceProtocolString o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<DDDeviceProtocolString> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<DDDeviceProtocolString> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(DDDeviceProtocolString.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<DDDeviceProtocolString> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (DDDeviceProtocolString o : l) {
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
    public static final DDDeviceProtocolString Invalid = new DDDeviceProtocolString("Invalid");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final DDDeviceProtocolString DIAL = new DDDeviceProtocolString("DIAL");
    /*</constants>*/
    
    private static /*<name>*/DDDeviceProtocolString/*</name>*/[] values = new /*<name>*/DDDeviceProtocolString/*</name>*/[] {/*<value_list>*/Invalid, DIAL/*</value_list>*/};
    
    /*<name>*/DDDeviceProtocolString/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/DDDeviceProtocolString/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/DDDeviceProtocolString/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/DDDeviceProtocolString/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("DeviceDiscoveryExtension") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="DDDeviceProtocolStringInvalid", optional=true)
        public static native NSString Invalid();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="DDDeviceProtocolStringDIAL", optional=true)
        public static native NSString DIAL();
        /*</values>*/
    }
}
