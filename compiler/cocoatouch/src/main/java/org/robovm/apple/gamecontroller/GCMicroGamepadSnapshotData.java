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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Packed(1)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCMicroGamepadSnapshotData/*</name>*/ 
    extends /*<extends>*/Struct<GCMicroGamepadSnapshotData>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCMicroGamepadSnapshotDataPtr extends Ptr<GCMicroGamepadSnapshotData, GCMicroGamepadSnapshotDataPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCMicroGamepadSnapshotData() {}
    public GCMicroGamepadSnapshotData(short version, short size, float dpadX, float dpadY, float buttonA, float buttonX) {
        this.setVersion(version);
        this.setSize(size);
        this.setDpadX(dpadX);
        this.setDpadY(dpadY);
        this.setButtonA(buttonA);
        this.setButtonX(buttonX);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native short getVersion();
    @StructMember(0) public native GCMicroGamepadSnapshotData setVersion(short version);
    @StructMember(1) public native short getSize();
    @StructMember(1) public native GCMicroGamepadSnapshotData setSize(short size);
    @StructMember(2) public native float getDpadX();
    @StructMember(2) public native GCMicroGamepadSnapshotData setDpadX(float dpadX);
    @StructMember(3) public native float getDpadY();
    @StructMember(3) public native GCMicroGamepadSnapshotData setDpadY(float dpadY);
    @StructMember(4) public native float getButtonA();
    @StructMember(4) public native GCMicroGamepadSnapshotData setButtonA(float buttonA);
    @StructMember(5) public native float getButtonX();
    @StructMember(5) public native GCMicroGamepadSnapshotData setButtonX(float buttonX);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
