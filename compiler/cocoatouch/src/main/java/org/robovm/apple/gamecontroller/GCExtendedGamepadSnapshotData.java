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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCExtendedGamepadSnapshotData/*</name>*/ 
    extends /*<extends>*/Struct<GCExtendedGamepadSnapshotData>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCExtendedGamepadSnapshotDataPtr extends Ptr<GCExtendedGamepadSnapshotData, GCExtendedGamepadSnapshotDataPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCExtendedGamepadSnapshotData() {}
    public GCExtendedGamepadSnapshotData(short version, short size, float dpadX, float dpadY, float buttonA, float buttonB, float buttonX, float buttonY, float leftShoulder, float rightShoulder, float leftThumbstickX, float leftThumbstickY, float rightThumbstickX, float rightThumbstickY, float leftTrigger, float rightTrigger, boolean leftThumbstickButton, boolean rightThumbstickButton) {
        this.setVersion(version);
        this.setSize(size);
        this.setDpadX(dpadX);
        this.setDpadY(dpadY);
        this.setButtonA(buttonA);
        this.setButtonB(buttonB);
        this.setButtonX(buttonX);
        this.setButtonY(buttonY);
        this.setLeftShoulder(leftShoulder);
        this.setRightShoulder(rightShoulder);
        this.setLeftThumbstickX(leftThumbstickX);
        this.setLeftThumbstickY(leftThumbstickY);
        this.setRightThumbstickX(rightThumbstickX);
        this.setRightThumbstickY(rightThumbstickY);
        this.setLeftTrigger(leftTrigger);
        this.setRightTrigger(rightTrigger);
        this.setLeftThumbstickButton(leftThumbstickButton);
        this.setRightThumbstickButton(rightThumbstickButton);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native short getVersion();
    @StructMember(0) public native GCExtendedGamepadSnapshotData setVersion(short version);
    @StructMember(1) public native short getSize();
    @StructMember(1) public native GCExtendedGamepadSnapshotData setSize(short size);
    @StructMember(2) public native float getDpadX();
    @StructMember(2) public native GCExtendedGamepadSnapshotData setDpadX(float dpadX);
    @StructMember(3) public native float getDpadY();
    @StructMember(3) public native GCExtendedGamepadSnapshotData setDpadY(float dpadY);
    @StructMember(4) public native float getButtonA();
    @StructMember(4) public native GCExtendedGamepadSnapshotData setButtonA(float buttonA);
    @StructMember(5) public native float getButtonB();
    @StructMember(5) public native GCExtendedGamepadSnapshotData setButtonB(float buttonB);
    @StructMember(6) public native float getButtonX();
    @StructMember(6) public native GCExtendedGamepadSnapshotData setButtonX(float buttonX);
    @StructMember(7) public native float getButtonY();
    @StructMember(7) public native GCExtendedGamepadSnapshotData setButtonY(float buttonY);
    @StructMember(8) public native float getLeftShoulder();
    @StructMember(8) public native GCExtendedGamepadSnapshotData setLeftShoulder(float leftShoulder);
    @StructMember(9) public native float getRightShoulder();
    @StructMember(9) public native GCExtendedGamepadSnapshotData setRightShoulder(float rightShoulder);
    @StructMember(10) public native float getLeftThumbstickX();
    @StructMember(10) public native GCExtendedGamepadSnapshotData setLeftThumbstickX(float leftThumbstickX);
    @StructMember(11) public native float getLeftThumbstickY();
    @StructMember(11) public native GCExtendedGamepadSnapshotData setLeftThumbstickY(float leftThumbstickY);
    @StructMember(12) public native float getRightThumbstickX();
    @StructMember(12) public native GCExtendedGamepadSnapshotData setRightThumbstickX(float rightThumbstickX);
    @StructMember(13) public native float getRightThumbstickY();
    @StructMember(13) public native GCExtendedGamepadSnapshotData setRightThumbstickY(float rightThumbstickY);
    @StructMember(14) public native float getLeftTrigger();
    @StructMember(14) public native GCExtendedGamepadSnapshotData setLeftTrigger(float leftTrigger);
    @StructMember(15) public native float getRightTrigger();
    @StructMember(15) public native GCExtendedGamepadSnapshotData setRightTrigger(float rightTrigger);
    @StructMember(16) public native boolean isLeftThumbstickButton();
    @StructMember(16) public native GCExtendedGamepadSnapshotData setLeftThumbstickButton(boolean leftThumbstickButton);
    @StructMember(17) public native boolean isRightThumbstickButton();
    @StructMember(17) public native GCExtendedGamepadSnapshotData setRightThumbstickButton(boolean rightThumbstickButton);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
