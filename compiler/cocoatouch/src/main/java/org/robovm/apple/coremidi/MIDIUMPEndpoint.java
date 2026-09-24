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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDIUMPEndpoint/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDIUMPEndpointPtr extends Ptr<MIDIUMPEndpoint, MIDIUMPEndpointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MIDIUMPEndpoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MIDIUMPEndpoint() {}
    protected MIDIUMPEndpoint(Handle h, long handle) { super(h, handle); }
    protected MIDIUMPEndpoint(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "MIDIProtocol")
    public native MIDIProtocolID getMIDIProtocol();
    @Property(selector = "supportedMIDIProtocols")
    public native MIDIUMPProtocolOptions getSupportedMIDIProtocols();
    @Property(selector = "MIDIDestination")
    public native MIDIEndpoint getMIDIDestination();
    @Property(selector = "MIDISource")
    public native MIDIEndpoint getMIDISource();
    @Property(selector = "deviceInfo")
    public native MIDI2DeviceInfo getDeviceInfo();
    @Property(selector = "productInstanceID")
    public native String getProductInstanceID();
    @Property(selector = "hasStaticFunctionBlocks")
    public native boolean hasStaticFunctionBlocks();
    @Property(selector = "hasJRTSReceiveCapability")
    public native boolean hasJRTSReceiveCapability();
    @Property(selector = "hasJRTSTransmitCapability")
    public native boolean hasJRTSTransmitCapability();
    @Property(selector = "endpointType")
    public native MIDIUMPCIObjectBackingType getEndpointType();
    @Property(selector = "functionBlocks")
    public native NSArray<MIDIUMPFunctionBlock> getFunctionBlocks();
    @Property(selector = "setFunctionBlocks:")
    public native void setFunctionBlocks(NSArray<MIDIUMPFunctionBlock> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
