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
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("DeviceDiscoveryExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DDDevice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DDDevicePtr extends Ptr<DDDevice, DDDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DDDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected DDDevice() {}
    protected DDDevice(Handle h, long handle) { super(h, handle); }
    protected DDDevice(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDisplayName:category:protocolType:identifier:")
    public DDDevice(String displayName, DDDeviceCategory category, UTType protocolType, String identifier) { super((SkipInit) null); initObject(init(displayName, category, protocolType, identifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bluetoothIdentifier")
    public native NSUUID getBluetoothIdentifier();
    @Property(selector = "setBluetoothIdentifier:")
    public native void setBluetoothIdentifier(NSUUID v);
    @Property(selector = "category")
    public native DDDeviceCategory getCategory();
    @Property(selector = "setCategory:")
    public native void setCategory(DDDeviceCategory v);
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "setDisplayName:")
    public native void setDisplayName(String v);
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    @Property(selector = "networkEndpoint")
    public native NWEndpoint getNetworkEndpoint();
    @Property(selector = "setNetworkEndpoint:")
    public native void setNetworkEndpoint(NWEndpoint v);
    @Property(selector = "protocol")
    public native DDDeviceProtocol getProtocol();
    @Property(selector = "setProtocol:")
    public native void setProtocol(DDDeviceProtocol v);
    @Property(selector = "protocolType")
    public native UTType getProtocolType();
    @Property(selector = "setProtocolType:")
    public native void setProtocolType(UTType v);
    @Property(selector = "state")
    public native DDDeviceState getState();
    @Property(selector = "setState:")
    public native void setState(DDDeviceState v);
    @Property(selector = "txtRecordData")
    public native NSData getTxtRecordData();
    @Property(selector = "setTxtRecordData:")
    public native void setTxtRecordData(NSData v);
    @Property(selector = "url")
    public native NSURL getUrl();
    @Property(selector = "setUrl:")
    public native void setUrl(NSURL v);
    @Property(selector = "mediaPlaybackState")
    public native DDDeviceMediaPlaybackState getMediaPlaybackState();
    @Property(selector = "setMediaPlaybackState:")
    public native void setMediaPlaybackState(DDDeviceMediaPlaybackState v);
    @Property(selector = "mediaContentTitle")
    public native String getMediaContentTitle();
    @Property(selector = "setMediaContentTitle:")
    public native void setMediaContentTitle(String v);
    @Property(selector = "mediaContentSubtitle")
    public native String getMediaContentSubtitle();
    @Property(selector = "setMediaContentSubtitle:")
    public native void setMediaContentSubtitle(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDisplayName:category:protocolType:identifier:")
    protected native @Pointer long init(String displayName, DDDeviceCategory category, UTType protocolType, String identifier);
    /*</methods>*/
}
