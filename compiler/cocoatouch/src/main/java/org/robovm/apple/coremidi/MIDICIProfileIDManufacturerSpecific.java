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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDICIProfileIDManufacturerSpecific/*</name>*/ 
    extends /*<extends>*/Struct<MIDICIProfileIDManufacturerSpecific>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDICIProfileIDManufacturerSpecificPtr extends Ptr<MIDICIProfileIDManufacturerSpecific, MIDICIProfileIDManufacturerSpecificPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MIDICIProfileIDManufacturerSpecific() {}
    public MIDICIProfileIDManufacturerSpecific(byte sysExID1, byte sysExID2, byte sysExID3, byte info1, byte info2) {
        this.setSysExID1(sysExID1);
        this.setSysExID2(sysExID2);
        this.setSysExID3(sysExID3);
        this.setInfo1(info1);
        this.setInfo2(info2);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native byte getSysExID1();
    @StructMember(0) public native MIDICIProfileIDManufacturerSpecific setSysExID1(byte sysExID1);
    @StructMember(1) public native byte getSysExID2();
    @StructMember(1) public native MIDICIProfileIDManufacturerSpecific setSysExID2(byte sysExID2);
    @StructMember(2) public native byte getSysExID3();
    @StructMember(2) public native MIDICIProfileIDManufacturerSpecific setSysExID3(byte sysExID3);
    @StructMember(3) public native byte getInfo1();
    @StructMember(3) public native MIDICIProfileIDManufacturerSpecific setInfo1(byte info1);
    @StructMember(4) public native byte getInfo2();
    @StructMember(4) public native MIDICIProfileIDManufacturerSpecific setInfo2(byte info2);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
