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

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDICIDeviceIdentification/*</name>*/ 
    extends /*<extends>*/Struct<MIDICIDeviceIdentification>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDICIDeviceIdentificationPtr extends Ptr<MIDICIDeviceIdentification, MIDICIDeviceIdentificationPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MIDICIDeviceIdentification() {}
    public MIDICIDeviceIdentification(ByteBuffer manufacturer, ByteBuffer family, ByteBuffer modelNumber, ByteBuffer revisionLevel, ByteBuffer reserved) {
        this.setManufacturer(manufacturer);
        this.setFamily(family);
        this.setModelNumber(modelNumber);
        this.setRevisionLevel(revisionLevel);
        this.setReserved(reserved);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @Array({3}) ByteBuffer getManufacturer();
    @StructMember(0) public native MIDICIDeviceIdentification setManufacturer(@Array({3}) ByteBuffer manufacturer);
    @StructMember(1) public native @Array({2}) ByteBuffer getFamily();
    @StructMember(1) public native MIDICIDeviceIdentification setFamily(@Array({2}) ByteBuffer family);
    @StructMember(2) public native @Array({2}) ByteBuffer getModelNumber();
    @StructMember(2) public native MIDICIDeviceIdentification setModelNumber(@Array({2}) ByteBuffer modelNumber);
    @StructMember(3) public native @Array({4}) ByteBuffer getRevisionLevel();
    @StructMember(3) public native MIDICIDeviceIdentification setRevisionLevel(@Array({4}) ByteBuffer revisionLevel);
    @StructMember(4) public native @Array({5}) ByteBuffer getReserved();
    @StructMember(4) public native MIDICIDeviceIdentification setReserved(@Array({5}) ByteBuffer reserved);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
