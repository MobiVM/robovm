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
package org.robovm.apple.imagecapturecore;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ImageCaptureCore") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/ICDeviceLocationOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ICDeviceLocationOptions/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/ICDeviceLocationOptions/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static ICDeviceLocationOptions toObject(Class<ICDeviceLocationOptions> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return ICDeviceLocationOptions.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(ICDeviceLocationOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<ICDeviceLocationOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<ICDeviceLocationOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(ICDeviceLocationOptions.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<ICDeviceLocationOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (ICDeviceLocationOptions o : l) {
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
    public static final ICDeviceLocationOptions ICDeviceLocationDescriptionUSB = new ICDeviceLocationOptions("ICDeviceLocationDescriptionUSB");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final ICDeviceLocationOptions ICDeviceLocationDescriptionFireWire = new ICDeviceLocationOptions("ICDeviceLocationDescriptionFireWire");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final ICDeviceLocationOptions ICDeviceLocationDescriptionBluetooth = new ICDeviceLocationOptions("ICDeviceLocationDescriptionBluetooth");
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final ICDeviceLocationOptions ICDeviceLocationDescriptionMassStorage = new ICDeviceLocationOptions("ICDeviceLocationDescriptionMassStorage");
    /*</constants>*/
    
    private static /*<name>*/ICDeviceLocationOptions/*</name>*/[] values = new /*<name>*/ICDeviceLocationOptions/*</name>*/[] {/*<value_list>*/ICDeviceLocationDescriptionUSB, ICDeviceLocationDescriptionFireWire, ICDeviceLocationDescriptionBluetooth, ICDeviceLocationDescriptionMassStorage/*</value_list>*/};
    
    /*<name>*/ICDeviceLocationOptions/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/ICDeviceLocationOptions/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/ICDeviceLocationOptions/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/ICDeviceLocationOptions/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("ImageCaptureCore") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="ICDeviceLocationDescriptionUSB", optional=true)
        public static native NSString ICDeviceLocationDescriptionUSB();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="ICDeviceLocationDescriptionFireWire", optional=true)
        public static native NSString ICDeviceLocationDescriptionFireWire();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="ICDeviceLocationDescriptionBluetooth", optional=true)
        public static native NSString ICDeviceLocationDescriptionBluetooth();
        /**
         * @since Available in iOS 16.0 and later.
         */
        @GlobalValue(symbol="ICDeviceLocationDescriptionMassStorage", optional=true)
        public static native NSString ICDeviceLocationDescriptionMassStorage();
        /*</values>*/
    }
}
