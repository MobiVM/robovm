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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDIUMPMutableFunctionBlock/*</name>*/ 
    extends /*<extends>*/MIDIUMPFunctionBlock/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDIUMPMutableFunctionBlockPtr extends Ptr<MIDIUMPMutableFunctionBlock, MIDIUMPMutableFunctionBlockPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MIDIUMPMutableFunctionBlock.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MIDIUMPMutableFunctionBlock() {}
    protected MIDIUMPMutableFunctionBlock(Handle h, long handle) { super(h, handle); }
    protected MIDIUMPMutableFunctionBlock(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:direction:firstGroup:totalGroupsSpanned:maxSysEx8Streams:MIDI1Info:UIHint:isEnabled:")
    public MIDIUMPMutableFunctionBlock(String name, MIDIUMPFunctionBlockDirection direction, byte firstGroup, byte totalGroupsSpanned, byte maxSysEx8Streams, MIDIUMPFunctionBlockMIDI1Info MIDI1Info, MIDIUMPFunctionBlockUIHint UIHint, boolean isEnabled) { super((SkipInit) null); initObject(init(name, direction, firstGroup, totalGroupsSpanned, maxSysEx8Streams, MIDI1Info, UIHint, isEnabled)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "UMPEndpoint")
    public native MIDIUMPMutableEndpoint getUMPEndpoint();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:direction:firstGroup:totalGroupsSpanned:maxSysEx8Streams:MIDI1Info:UIHint:isEnabled:")
    protected native @Pointer long init(String name, MIDIUMPFunctionBlockDirection direction, byte firstGroup, byte totalGroupsSpanned, byte maxSysEx8Streams, MIDIUMPFunctionBlockMIDI1Info MIDI1Info, MIDIUMPFunctionBlockUIHint UIHint, boolean isEnabled);
    public boolean setEnabled(boolean isEnabled) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setEnabled(isEnabled, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setEnabled:error:")
    private native boolean setEnabled(boolean isEnabled, NSError.NSErrorPtr error);
    public boolean setName(String name) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setName(name, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setName:error:")
    private native boolean setName(String name, NSError.NSErrorPtr error);
    public boolean reconfigure(byte firstGroup, MIDIUMPFunctionBlockDirection direction, MIDIUMPFunctionBlockMIDI1Info MIDI1Info, MIDIUMPFunctionBlockUIHint UIHint) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = reconfigure(firstGroup, direction, MIDI1Info, UIHint, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "reconfigureWithFirstGroup:direction:MIDI1Info:UIHint:error:")
    private native boolean reconfigure(byte firstGroup, MIDIUMPFunctionBlockDirection direction, MIDIUMPFunctionBlockMIDI1Info MIDI1Info, MIDIUMPFunctionBlockUIHint UIHint, NSError.NSErrorPtr error);
    /*</methods>*/
}
