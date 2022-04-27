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
package org.robovm.apple.sensorkit;

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
/*<annotations>*/@Library("SensorKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/SRSensor/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SRSensor/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/SRSensor/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static SRSensor toObject(Class<SRSensor> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return SRSensor.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(SRSensor o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<SRSensor> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<SRSensor> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(SRSensor.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<SRSensor> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (SRSensor o : l) {
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
    public static final SRSensor AmbientLightSensor = new SRSensor("AmbientLightSensor");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRSensor Accelerometer = new SRSensor("Accelerometer");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRSensor RotationRate = new SRSensor("RotationRate");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRSensor Visits = new SRSensor("Visits");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRSensor PedometerData = new SRSensor("PedometerData");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRSensor DeviceUsageReport = new SRSensor("DeviceUsageReport");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRSensor MessagesUsageReport = new SRSensor("MessagesUsageReport");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRSensor PhoneUsageReport = new SRSensor("PhoneUsageReport");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRSensor OnWristState = new SRSensor("OnWristState");
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final SRSensor KeyboardMetrics = new SRSensor("KeyboardMetrics");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SRSensor SiriSpeechMetrics = new SRSensor("SiriSpeechMetrics");
    /**
     * @since Available in iOS 15.0 and later.
     */
    public static final SRSensor TelephonySpeechMetrics = new SRSensor("TelephonySpeechMetrics");
    /**
     * @since Available in iOS 15.4 and later.
     */
    public static final SRSensor AmbientPressure = new SRSensor("AmbientPressure");
    /*</constants>*/
    
    private static /*<name>*/SRSensor/*</name>*/[] values = new /*<name>*/SRSensor/*</name>*/[] {/*<value_list>*/AmbientLightSensor, Accelerometer, RotationRate, Visits, PedometerData, DeviceUsageReport, MessagesUsageReport, PhoneUsageReport, OnWristState, KeyboardMetrics, SiriSpeechMetrics, TelephonySpeechMetrics, AmbientPressure/*</value_list>*/};
    
    /*<name>*/SRSensor/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/SRSensor/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/SRSensor/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/SRSensor/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("SensorKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRSensorAmbientLightSensor", optional=true)
        public static native NSString AmbientLightSensor();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRSensorAccelerometer", optional=true)
        public static native NSString Accelerometer();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRSensorRotationRate", optional=true)
        public static native NSString RotationRate();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRSensorVisits", optional=true)
        public static native NSString Visits();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRSensorPedometerData", optional=true)
        public static native NSString PedometerData();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRSensorDeviceUsageReport", optional=true)
        public static native NSString DeviceUsageReport();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRSensorMessagesUsageReport", optional=true)
        public static native NSString MessagesUsageReport();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRSensorPhoneUsageReport", optional=true)
        public static native NSString PhoneUsageReport();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRSensorOnWristState", optional=true)
        public static native NSString OnWristState();
        /**
         * @since Available in iOS 14.0 and later.
         */
        @GlobalValue(symbol="SRSensorKeyboardMetrics", optional=true)
        public static native NSString KeyboardMetrics();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SRSensorSiriSpeechMetrics", optional=true)
        public static native NSString SiriSpeechMetrics();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="SRSensorTelephonySpeechMetrics", optional=true)
        public static native NSString TelephonySpeechMetrics();
        /**
         * @since Available in iOS 15.4 and later.
         */
        @GlobalValue(symbol="SRSensorAmbientPressure", optional=true)
        public static native NSString AmbientPressure();
        /*</values>*/
    }
}
