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
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKDevice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class HKDevicePtr extends Ptr<HKDevice, HKDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKDevice() {}
    protected HKDevice(Handle h, long handle) { super(h, handle); }
    protected HKDevice(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:manufacturer:model:hardwareVersion:firmwareVersion:softwareVersion:localIdentifier:UDIDeviceIdentifier:")
    public HKDevice(String name, String manufacturer, String model, String hardwareVersion, String firmwareVersion, String softwareVersion, String localIdentifier, String UDIDeviceIdentifier) { super((SkipInit) null); initObject(init(name, manufacturer, model, hardwareVersion, firmwareVersion, softwareVersion, localIdentifier, UDIDeviceIdentifier)); }
    @Method(selector = "initWithCoder:")
    public HKDevice(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "manufacturer")
    public native String getManufacturer();
    @Property(selector = "model")
    public native String getModel();
    @Property(selector = "hardwareVersion")
    public native String getHardwareVersion();
    @Property(selector = "firmwareVersion")
    public native String getFirmwareVersion();
    @Property(selector = "softwareVersion")
    public native String getSoftwareVersion();
    @Property(selector = "localIdentifier")
    public native String getLocalIdentifier();
    @Property(selector = "UDIDeviceIdentifier")
    public native String getUDIDeviceIdentifier();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="HKDevicePropertyKeyName", optional=true)
    public static native String PropertyKeyName();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="HKDevicePropertyKeyManufacturer", optional=true)
    public static native String PropertyKeyManufacturer();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="HKDevicePropertyKeyModel", optional=true)
    public static native String PropertyKeyModel();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="HKDevicePropertyKeyHardwareVersion", optional=true)
    public static native String PropertyKeyHardwareVersion();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="HKDevicePropertyKeyFirmwareVersion", optional=true)
    public static native String PropertyKeyFirmwareVersion();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="HKDevicePropertyKeySoftwareVersion", optional=true)
    public static native String PropertyKeySoftwareVersion();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="HKDevicePropertyKeyLocalIdentifier", optional=true)
    public static native String PropertyKeyLocalIdentifier();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="HKDevicePropertyKeyUDIDeviceIdentifier", optional=true)
    public static native String PropertyKeyUDIDeviceIdentifier();
    
    @Method(selector = "initWithName:manufacturer:model:hardwareVersion:firmwareVersion:softwareVersion:localIdentifier:UDIDeviceIdentifier:")
    protected native @Pointer long init(String name, String manufacturer, String model, String hardwareVersion, String firmwareVersion, String softwareVersion, String localIdentifier, String UDIDeviceIdentifier);
    @Method(selector = "localDevice")
    public static native HKDevice localDevice();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
