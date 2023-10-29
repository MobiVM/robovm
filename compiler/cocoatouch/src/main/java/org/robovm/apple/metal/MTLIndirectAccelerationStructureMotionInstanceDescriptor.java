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
package org.robovm.apple.metal;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLIndirectAccelerationStructureMotionInstanceDescriptor/*</name>*/ 
    extends /*<extends>*/Struct<MTLIndirectAccelerationStructureMotionInstanceDescriptor>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLIndirectAccelerationStructureMotionInstanceDescriptorPtr extends Ptr<MTLIndirectAccelerationStructureMotionInstanceDescriptor, MTLIndirectAccelerationStructureMotionInstanceDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLIndirectAccelerationStructureMotionInstanceDescriptor() {}
    public MTLIndirectAccelerationStructureMotionInstanceDescriptor(MTLAccelerationStructureInstanceOptions options, int mask, int intersectionFunctionTableOffset, int userID, MTLResourceID accelerationStructureID, int motionTransformsStartIndex, int motionTransformsCount, MTLMotionBorderMode motionStartBorderMode, MTLMotionBorderMode motionEndBorderMode, float motionStartTime, float motionEndTime) {
        this.setOptions(options);
        this.setMask(mask);
        this.setIntersectionFunctionTableOffset(intersectionFunctionTableOffset);
        this.setUserID(userID);
        this.setAccelerationStructureID(accelerationStructureID);
        this.setMotionTransformsStartIndex(motionTransformsStartIndex);
        this.setMotionTransformsCount(motionTransformsCount);
        this.setMotionStartBorderMode(motionStartBorderMode);
        this.setMotionEndBorderMode(motionEndBorderMode);
        this.setMotionStartTime(motionStartTime);
        this.setMotionEndTime(motionEndTime);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native MTLAccelerationStructureInstanceOptions getOptions();
    @StructMember(0) public native MTLIndirectAccelerationStructureMotionInstanceDescriptor setOptions(MTLAccelerationStructureInstanceOptions options);
    @StructMember(1) public native int getMask();
    @StructMember(1) public native MTLIndirectAccelerationStructureMotionInstanceDescriptor setMask(int mask);
    @StructMember(2) public native int getIntersectionFunctionTableOffset();
    @StructMember(2) public native MTLIndirectAccelerationStructureMotionInstanceDescriptor setIntersectionFunctionTableOffset(int intersectionFunctionTableOffset);
    @StructMember(3) public native int getUserID();
    @StructMember(3) public native MTLIndirectAccelerationStructureMotionInstanceDescriptor setUserID(int userID);
    @StructMember(4) public native @ByVal MTLResourceID getAccelerationStructureID();
    @StructMember(4) public native MTLIndirectAccelerationStructureMotionInstanceDescriptor setAccelerationStructureID(@ByVal MTLResourceID accelerationStructureID);
    @StructMember(5) public native int getMotionTransformsStartIndex();
    @StructMember(5) public native MTLIndirectAccelerationStructureMotionInstanceDescriptor setMotionTransformsStartIndex(int motionTransformsStartIndex);
    @StructMember(6) public native int getMotionTransformsCount();
    @StructMember(6) public native MTLIndirectAccelerationStructureMotionInstanceDescriptor setMotionTransformsCount(int motionTransformsCount);
    @StructMember(7) public native MTLMotionBorderMode getMotionStartBorderMode();
    @StructMember(7) public native MTLIndirectAccelerationStructureMotionInstanceDescriptor setMotionStartBorderMode(MTLMotionBorderMode motionStartBorderMode);
    @StructMember(8) public native MTLMotionBorderMode getMotionEndBorderMode();
    @StructMember(8) public native MTLIndirectAccelerationStructureMotionInstanceDescriptor setMotionEndBorderMode(MTLMotionBorderMode motionEndBorderMode);
    @StructMember(9) public native float getMotionStartTime();
    @StructMember(9) public native MTLIndirectAccelerationStructureMotionInstanceDescriptor setMotionStartTime(float motionStartTime);
    @StructMember(10) public native float getMotionEndTime();
    @StructMember(10) public native MTLIndirectAccelerationStructureMotionInstanceDescriptor setMotionEndTime(float motionEndTime);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
