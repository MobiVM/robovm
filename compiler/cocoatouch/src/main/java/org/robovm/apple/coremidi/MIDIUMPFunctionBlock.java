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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDIUMPFunctionBlock/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDIUMPFunctionBlockPtr extends Ptr<MIDIUMPFunctionBlock, MIDIUMPFunctionBlockPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MIDIUMPFunctionBlock.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MIDIUMPFunctionBlock() {}
    protected MIDIUMPFunctionBlock(Handle h, long handle) { super(h, handle); }
    protected MIDIUMPFunctionBlock(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "functionBlockID")
    public native byte getFunctionBlockID();
    @Property(selector = "direction")
    public native MIDIUMPFunctionBlockDirection getDirection();
    @Property(selector = "firstGroup")
    public native byte getFirstGroup();
    @Property(selector = "totalGroupsSpanned")
    public native byte getTotalGroupsSpanned();
    @Property(selector = "maxSysEx8Streams")
    public native byte getMaxSysEx8Streams();
    @Property(selector = "MIDI1Info")
    public native MIDIUMPFunctionBlockMIDI1Info getMIDI1Info();
    @Property(selector = "UIHint")
    public native MIDIUMPFunctionBlockUIHint getUIHint();
    @Property(selector = "UMPEndpoint")
    public native MIDIUMPEndpoint getUMPEndpoint();
    @Property(selector = "midiCIDevice")
    public native MIDICIDevice getMidiCIDevice();
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
