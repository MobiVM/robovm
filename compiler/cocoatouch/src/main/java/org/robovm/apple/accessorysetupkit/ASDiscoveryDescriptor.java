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
package org.robovm.apple.accessorysetupkit;

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
import org.robovm.apple.corebluetooth.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AccessorySetupKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASDiscoveryDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASDiscoveryDescriptorPtr extends Ptr<ASDiscoveryDescriptor, ASDiscoveryDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASDiscoveryDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ASDiscoveryDescriptor() {}
    protected ASDiscoveryDescriptor(Handle h, long handle) { super(h, handle); }
    protected ASDiscoveryDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportedOptions")
    public native ASAccessorySupportOptions getSupportedOptions();
    @Property(selector = "setSupportedOptions:")
    public native void setSupportedOptions(ASAccessorySupportOptions v);
    @Property(selector = "bluetoothCompanyIdentifier")
    public native short getBluetoothCompanyIdentifier();
    @Property(selector = "setBluetoothCompanyIdentifier:")
    public native void setBluetoothCompanyIdentifier(short v);
    @Property(selector = "bluetoothManufacturerDataBlob")
    public native NSData getBluetoothManufacturerDataBlob();
    @Property(selector = "setBluetoothManufacturerDataBlob:")
    public native void setBluetoothManufacturerDataBlob(NSData v);
    @Property(selector = "bluetoothManufacturerDataMask")
    public native NSData getBluetoothManufacturerDataMask();
    @Property(selector = "setBluetoothManufacturerDataMask:")
    public native void setBluetoothManufacturerDataMask(NSData v);
    /**
     * @since Available in iOS 18.2 and later.
     */
    @Property(selector = "bluetoothNameSubstringCompareOptions")
    public native NSStringCompareOptions getBluetoothNameSubstringCompareOptions();
    /**
     * @since Available in iOS 18.2 and later.
     */
    @Property(selector = "setBluetoothNameSubstringCompareOptions:")
    public native void setBluetoothNameSubstringCompareOptions(NSStringCompareOptions v);
    @Property(selector = "bluetoothNameSubstring")
    public native String getBluetoothNameSubstring();
    @Property(selector = "setBluetoothNameSubstring:")
    public native void setBluetoothNameSubstring(String v);
    @Property(selector = "bluetoothRange")
    public native ASDiscoveryDescriptorRange getBluetoothRange();
    @Property(selector = "setBluetoothRange:")
    public native void setBluetoothRange(ASDiscoveryDescriptorRange v);
    @Property(selector = "bluetoothServiceDataBlob")
    public native NSData getBluetoothServiceDataBlob();
    @Property(selector = "setBluetoothServiceDataBlob:")
    public native void setBluetoothServiceDataBlob(NSData v);
    @Property(selector = "bluetoothServiceDataMask")
    public native NSData getBluetoothServiceDataMask();
    @Property(selector = "setBluetoothServiceDataMask:")
    public native void setBluetoothServiceDataMask(NSData v);
    @Property(selector = "bluetoothServiceUUID")
    public native CBUUID getBluetoothServiceUUID();
    @Property(selector = "setBluetoothServiceUUID:")
    public native void setBluetoothServiceUUID(CBUUID v);
    @Property(selector = "SSID")
    public native String getSSID();
    @Property(selector = "setSSID:")
    public native void setSSID(String v);
    @Property(selector = "SSIDPrefix")
    public native String getSSIDPrefix();
    @Property(selector = "setSSIDPrefix:")
    public native void setSSIDPrefix(String v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "wifiAwareServiceName")
    public native String getWifiAwareServiceName();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setWifiAwareServiceName:")
    public native void setWifiAwareServiceName(String v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "wifiAwareServiceRole")
    public native ASDiscoveryDescriptorWiFiAwareServiceRole getWifiAwareServiceRole();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setWifiAwareServiceRole:")
    public native void setWifiAwareServiceRole(ASDiscoveryDescriptorWiFiAwareServiceRole v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "wifiAwareModelNameMatch")
    public native ASPropertyCompareString getWifiAwareModelNameMatch();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setWifiAwareModelNameMatch:")
    public native void setWifiAwareModelNameMatch(ASPropertyCompareString v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "wifiAwareVendorNameMatch")
    public native ASPropertyCompareString getWifiAwareVendorNameMatch();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setWifiAwareVendorNameMatch:")
    public native void setWifiAwareVendorNameMatch(ASPropertyCompareString v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
