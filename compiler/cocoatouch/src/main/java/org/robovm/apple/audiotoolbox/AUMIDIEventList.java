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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Packed(4)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AUMIDIEventList/*</name>*/ 
    extends /*<extends>*/Struct<AUMIDIEventList>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AUMIDIEventListPtr extends Ptr<AUMIDIEventList, AUMIDIEventListPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AUMIDIEventList() {}
    public AUMIDIEventList(AURenderEvent next, AUEventSampleTime eventSampleTime, AURenderEventType eventType, byte reserved, byte cable, MIDIEventList eventList) {
        this.setNext(next);
        this.setEventSampleTime(eventSampleTime);
        this.setEventType(eventType);
        this.setReserved(reserved);
        this.setCable(cable);
        this.setEventList(eventList);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native AURenderEvent getNext();
    @StructMember(0) public native AUMIDIEventList setNext(AURenderEvent next);
    @StructMember(1) public native AUEventSampleTime getEventSampleTime();
    @StructMember(1) public native AUMIDIEventList setEventSampleTime(AUEventSampleTime eventSampleTime);
    @StructMember(2) public native AURenderEventType getEventType();
    @StructMember(2) public native AUMIDIEventList setEventType(AURenderEventType eventType);
    @StructMember(3) public native byte getReserved();
    @StructMember(3) public native AUMIDIEventList setReserved(byte reserved);
    @StructMember(4) public native byte getCable();
    @StructMember(4) public native AUMIDIEventList setCable(byte cable);
    @StructMember(5) public native @ByVal MIDIEventList getEventList();
    @StructMember(5) public native AUMIDIEventList setEventList(@ByVal MIDIEventList eventList);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
