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
package org.robovm.apple.homekit;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/HMServiceType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMServiceType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/HMServiceType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static HMServiceType toObject(Class<HMServiceType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return HMServiceType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(HMServiceType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<HMServiceType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<HMServiceType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(HMServiceType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<HMServiceType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (HMServiceType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final HMServiceType Switch = new HMServiceType("Switch");
    public static final HMServiceType Thermostat = new HMServiceType("Thermostat");
    public static final HMServiceType Outlet = new HMServiceType("Outlet");
    public static final HMServiceType LockManagement = new HMServiceType("LockManagement");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType AirQualitySensor = new HMServiceType("AirQualitySensor");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType CarbonDioxideSensor = new HMServiceType("CarbonDioxideSensor");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType CarbonMonoxideSensor = new HMServiceType("CarbonMonoxideSensor");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType ContactSensor = new HMServiceType("ContactSensor");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType Door = new HMServiceType("Door");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType HumiditySensor = new HMServiceType("HumiditySensor");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType LeakSensor = new HMServiceType("LeakSensor");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType LightSensor = new HMServiceType("LightSensor");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType MotionSensor = new HMServiceType("MotionSensor");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType OccupancySensor = new HMServiceType("OccupancySensor");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType SecuritySystem = new HMServiceType("SecuritySystem");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType StatefulProgrammableSwitch = new HMServiceType("StatefulProgrammableSwitch");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType StatelessProgrammableSwitch = new HMServiceType("StatelessProgrammableSwitch");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType SmokeSensor = new HMServiceType("SmokeSensor");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType TemperatureSensor = new HMServiceType("TemperatureSensor");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType Window = new HMServiceType("Window");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType WindowCovering = new HMServiceType("WindowCovering");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMServiceType CameraRTPStreamManagement = new HMServiceType("CameraRTPStreamManagement");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMServiceType CameraControl = new HMServiceType("CameraControl");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMServiceType Microphone = new HMServiceType("Microphone");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMServiceType Speaker = new HMServiceType("Speaker");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMServiceType AirPurifier = new HMServiceType("AirPurifier");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMServiceType FilterMaintenance = new HMServiceType("FilterMaintenance");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMServiceType Slats = new HMServiceType("Slats");
    /**
     * @since Available in iOS 10.3 and later.
     */
    public static final HMServiceType Label = new HMServiceType("Label");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HMServiceType IrrigationSystem = new HMServiceType("IrrigationSystem");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HMServiceType Valve = new HMServiceType("Valve");
    /**
     * @since Available in iOS 11.2 and later.
     */
    public static final HMServiceType Faucet = new HMServiceType("Faucet");
    public static final HMServiceType AccessoryInformation = new HMServiceType("AccessoryInformation");
    public static final HMServiceType Fan = new HMServiceType("Fan");
    public static final HMServiceType GarageDoorOpener = new HMServiceType("GarageDoorOpener");
    public static final HMServiceType Lightbulb = new HMServiceType("Lightbulb");
    public static final HMServiceType LockMechanism = new HMServiceType("LockMechanism");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final HMServiceType Battery = new HMServiceType("Battery");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMServiceType VentilationFan = new HMServiceType("VentilationFan");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMServiceType HeaterCooler = new HMServiceType("HeaterCooler");
    /**
     * @since Available in iOS 10.2 and later.
     */
    public static final HMServiceType HumidifierDehumidifier = new HMServiceType("HumidifierDehumidifier");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final HMServiceType Doorbell = new HMServiceType("Doorbell");
    /*</constants>*/
    
    private static /*<name>*/HMServiceType/*</name>*/[] values = new /*<name>*/HMServiceType/*</name>*/[] {/*<value_list>*/Switch, Thermostat, Outlet, LockManagement, AirQualitySensor, CarbonDioxideSensor, CarbonMonoxideSensor, ContactSensor, Door, HumiditySensor, LeakSensor, LightSensor, MotionSensor, OccupancySensor, SecuritySystem, StatefulProgrammableSwitch, StatelessProgrammableSwitch, SmokeSensor, TemperatureSensor, Window, WindowCovering, CameraRTPStreamManagement, CameraControl, Microphone, Speaker, AirPurifier, FilterMaintenance, Slats, Label, IrrigationSystem, Valve, Faucet, AccessoryInformation, Fan, GarageDoorOpener, Lightbulb, LockMechanism, Battery, VentilationFan, HeaterCooler, HumidifierDehumidifier, Doorbell/*</value_list>*/};
    
    /*<name>*/HMServiceType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/HMServiceType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/HMServiceType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/HMServiceType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("HomeKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="HMServiceTypeSwitch", optional=true)
        public static native NSString Switch();
        @GlobalValue(symbol="HMServiceTypeThermostat", optional=true)
        public static native NSString Thermostat();
        @GlobalValue(symbol="HMServiceTypeOutlet", optional=true)
        public static native NSString Outlet();
        @GlobalValue(symbol="HMServiceTypeLockManagement", optional=true)
        public static native NSString LockManagement();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeAirQualitySensor", optional=true)
        public static native NSString AirQualitySensor();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeCarbonDioxideSensor", optional=true)
        public static native NSString CarbonDioxideSensor();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeCarbonMonoxideSensor", optional=true)
        public static native NSString CarbonMonoxideSensor();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeContactSensor", optional=true)
        public static native NSString ContactSensor();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeDoor", optional=true)
        public static native NSString Door();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeHumiditySensor", optional=true)
        public static native NSString HumiditySensor();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeLeakSensor", optional=true)
        public static native NSString LeakSensor();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeLightSensor", optional=true)
        public static native NSString LightSensor();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeMotionSensor", optional=true)
        public static native NSString MotionSensor();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeOccupancySensor", optional=true)
        public static native NSString OccupancySensor();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeSecuritySystem", optional=true)
        public static native NSString SecuritySystem();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeStatefulProgrammableSwitch", optional=true)
        public static native NSString StatefulProgrammableSwitch();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeStatelessProgrammableSwitch", optional=true)
        public static native NSString StatelessProgrammableSwitch();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeSmokeSensor", optional=true)
        public static native NSString SmokeSensor();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeTemperatureSensor", optional=true)
        public static native NSString TemperatureSensor();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeWindow", optional=true)
        public static native NSString Window();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeWindowCovering", optional=true)
        public static native NSString WindowCovering();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeCameraRTPStreamManagement", optional=true)
        public static native NSString CameraRTPStreamManagement();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeCameraControl", optional=true)
        public static native NSString CameraControl();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeMicrophone", optional=true)
        public static native NSString Microphone();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeSpeaker", optional=true)
        public static native NSString Speaker();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMServiceTypeAirPurifier", optional=true)
        public static native NSString AirPurifier();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMServiceTypeFilterMaintenance", optional=true)
        public static native NSString FilterMaintenance();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMServiceTypeSlats", optional=true)
        public static native NSString Slats();
        /**
         * @since Available in iOS 10.3 and later.
         */
        @GlobalValue(symbol="HMServiceTypeLabel", optional=true)
        public static native NSString Label();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HMServiceTypeIrrigationSystem", optional=true)
        public static native NSString IrrigationSystem();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HMServiceTypeValve", optional=true)
        public static native NSString Valve();
        /**
         * @since Available in iOS 11.2 and later.
         */
        @GlobalValue(symbol="HMServiceTypeFaucet", optional=true)
        public static native NSString Faucet();
        @GlobalValue(symbol="HMServiceTypeAccessoryInformation", optional=true)
        public static native NSString AccessoryInformation();
        @GlobalValue(symbol="HMServiceTypeFan", optional=true)
        public static native NSString Fan();
        @GlobalValue(symbol="HMServiceTypeGarageDoorOpener", optional=true)
        public static native NSString GarageDoorOpener();
        @GlobalValue(symbol="HMServiceTypeLightbulb", optional=true)
        public static native NSString Lightbulb();
        @GlobalValue(symbol="HMServiceTypeLockMechanism", optional=true)
        public static native NSString LockMechanism();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeBattery", optional=true)
        public static native NSString Battery();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMServiceTypeVentilationFan", optional=true)
        public static native NSString VentilationFan();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMServiceTypeHeaterCooler", optional=true)
        public static native NSString HeaterCooler();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="HMServiceTypeHumidifierDehumidifier", optional=true)
        public static native NSString HumidifierDehumidifier();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="HMServiceTypeDoorbell", optional=true)
        public static native NSString Doorbell();
        /*</values>*/
    }
}
