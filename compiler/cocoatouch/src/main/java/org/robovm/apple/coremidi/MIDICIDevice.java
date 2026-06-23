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
package org.robovm.apple.coremidi;

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
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreMIDI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDICIDevice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDICIDevicePtr extends Ptr<MIDICIDevice, MIDICIDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MIDICIDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MIDICIDevice() {}
    protected MIDICIDevice(Handle h, long handle) { super(h, handle); }
    protected MIDICIDevice(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "deviceInfo")
    public native MIDI2DeviceInfo getDeviceInfo();
    @Property(selector = "MUID")
    public native int getMUID();
    @Property(selector = "supportsProtocolNegotiation")
    public native boolean supportsProtocolNegotiation();
    @Property(selector = "supportsProfileConfiguration")
    public native boolean supportsProfileConfiguration();
    @Property(selector = "supportsPropertyExchange")
    public native boolean supportsPropertyExchange();
    @Property(selector = "supportsProcessInquiry")
    public native boolean supportsProcessInquiry();
    @Property(selector = "maxSysExSize")
    public native @MachineSizedUInt long getMaxSysExSize();
    @Property(selector = "maxPropertyExchangeRequests")
    public native @MachineSizedUInt long getMaxPropertyExchangeRequests();
    @Property(selector = "deviceType")
    public native MIDICIDeviceType getDeviceType();
    @Property(selector = "profiles")
    public native NSArray<MIDIUMPCIProfile> getProfiles();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
