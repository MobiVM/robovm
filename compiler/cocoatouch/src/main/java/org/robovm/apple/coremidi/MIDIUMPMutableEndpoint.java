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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDIUMPMutableEndpoint/*</name>*/ 
    extends /*<extends>*/MIDIUMPEndpoint/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDIUMPMutableEndpointPtr extends Ptr<MIDIUMPMutableEndpoint, MIDIUMPMutableEndpointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MIDIUMPMutableEndpoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MIDIUMPMutableEndpoint() {}
    protected MIDIUMPMutableEndpoint(Handle h, long handle) { super(h, handle); }
    protected MIDIUMPMutableEndpoint(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:deviceInfo:productInstanceID:MIDIProtocol:destinationCallback:")
    public MIDIUMPMutableEndpoint(String name, MIDI2DeviceInfo deviceInfo, String productInstanceID, MIDIProtocolID MIDIProtocol, @Block VoidBlock2<MIDIEventList, VoidPtr> destinationCallback) { super((SkipInit) null); initObject(init(name, deviceInfo, productInstanceID, MIDIProtocol, destinationCallback)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mutableFunctionBlocks")
    public native NSArray<MIDIUMPMutableFunctionBlock> getMutableFunctionBlocks();
    @Property(selector = "setMutableFunctionBlocks:")
    public native void setMutableFunctionBlocks(NSArray<MIDIUMPMutableFunctionBlock> v);
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:deviceInfo:productInstanceID:MIDIProtocol:destinationCallback:")
    protected native @Pointer long init(String name, MIDI2DeviceInfo deviceInfo, String productInstanceID, MIDIProtocolID MIDIProtocol, @Block VoidBlock2<MIDIEventList, VoidPtr> destinationCallback);
    public boolean setName(String name) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setName(name, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setName:error:")
    private native boolean setName(String name, NSError.NSErrorPtr error);
    public boolean registerFunctionBlocks(NSArray<MIDIUMPMutableFunctionBlock> functionBlocks, boolean markAsStatic) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = registerFunctionBlocks(functionBlocks, markAsStatic, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "registerFunctionBlocks:markAsStatic:error:")
    private native boolean registerFunctionBlocks(NSArray<MIDIUMPMutableFunctionBlock> functionBlocks, boolean markAsStatic, NSError.NSErrorPtr error);
    public boolean setEnabled(boolean isEnabled) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setEnabled(isEnabled, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setEnabled:error:")
    private native boolean setEnabled(boolean isEnabled, NSError.NSErrorPtr error);
    /*</methods>*/
}
