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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AUMIDIEvent/*</name>*/ 
    extends /*<extends>*/Struct<AUMIDIEvent>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AUMIDIEventPtr extends Ptr<AUMIDIEvent, AUMIDIEventPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AUMIDIEvent() {}
    public AUMIDIEvent(AURenderEvent next, AUEventSampleTime eventSampleTime, AURenderEventType eventType, byte reserved, short length, byte cable, ByteBuffer data) {
        this.setNext(next);
        this.setEventSampleTime(eventSampleTime);
        this.setEventType(eventType);
        this.setReserved(reserved);
        this.setLength(length);
        this.setCable(cable);
        this.setData(data);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native AURenderEvent getNext();
    @StructMember(0) public native AUMIDIEvent setNext(AURenderEvent next);
    @StructMember(1) public native AUEventSampleTime getEventSampleTime();
    @StructMember(1) public native AUMIDIEvent setEventSampleTime(AUEventSampleTime eventSampleTime);
    @StructMember(2) public native AURenderEventType getEventType();
    @StructMember(2) public native AUMIDIEvent setEventType(AURenderEventType eventType);
    @StructMember(3) public native byte getReserved();
    @StructMember(3) public native AUMIDIEvent setReserved(byte reserved);
    @StructMember(4) public native short getLength();
    @StructMember(4) public native AUMIDIEvent setLength(short length);
    @StructMember(5) public native byte getCable();
    @StructMember(5) public native AUMIDIEvent setCable(byte cable);
    @StructMember(6) public native @Array({3}) ByteBuffer getData();
    @StructMember(6) public native AUMIDIEvent setData(@Array({3}) ByteBuffer data);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
