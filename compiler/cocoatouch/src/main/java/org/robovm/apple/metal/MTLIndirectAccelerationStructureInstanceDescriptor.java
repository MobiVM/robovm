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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLIndirectAccelerationStructureInstanceDescriptor/*</name>*/ 
    extends /*<extends>*/Struct<MTLIndirectAccelerationStructureInstanceDescriptor>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLIndirectAccelerationStructureInstanceDescriptorPtr extends Ptr<MTLIndirectAccelerationStructureInstanceDescriptor, MTLIndirectAccelerationStructureInstanceDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLIndirectAccelerationStructureInstanceDescriptor() {}
    public MTLIndirectAccelerationStructureInstanceDescriptor(MTLPackedFloat4x3 transformationMatrix, MTLAccelerationStructureInstanceOptions options, int mask, int intersectionFunctionTableOffset, int userID, MTLResourceID accelerationStructureID) {
        this.setTransformationMatrix(transformationMatrix);
        this.setOptions(options);
        this.setMask(mask);
        this.setIntersectionFunctionTableOffset(intersectionFunctionTableOffset);
        this.setUserID(userID);
        this.setAccelerationStructureID(accelerationStructureID);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal MTLPackedFloat4x3 getTransformationMatrix();
    @StructMember(0) public native MTLIndirectAccelerationStructureInstanceDescriptor setTransformationMatrix(@ByVal MTLPackedFloat4x3 transformationMatrix);
    @StructMember(1) public native MTLAccelerationStructureInstanceOptions getOptions();
    @StructMember(1) public native MTLIndirectAccelerationStructureInstanceDescriptor setOptions(MTLAccelerationStructureInstanceOptions options);
    @StructMember(2) public native int getMask();
    @StructMember(2) public native MTLIndirectAccelerationStructureInstanceDescriptor setMask(int mask);
    @StructMember(3) public native int getIntersectionFunctionTableOffset();
    @StructMember(3) public native MTLIndirectAccelerationStructureInstanceDescriptor setIntersectionFunctionTableOffset(int intersectionFunctionTableOffset);
    @StructMember(4) public native int getUserID();
    @StructMember(4) public native MTLIndirectAccelerationStructureInstanceDescriptor setUserID(int userID);
    @StructMember(5) public native @ByVal MTLResourceID getAccelerationStructureID();
    @StructMember(5) public native MTLIndirectAccelerationStructureInstanceDescriptor setAccelerationStructureID(@ByVal MTLResourceID accelerationStructureID);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
