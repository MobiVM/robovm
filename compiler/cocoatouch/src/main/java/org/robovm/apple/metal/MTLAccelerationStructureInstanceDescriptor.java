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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLAccelerationStructureInstanceDescriptor/*</name>*/ 
    extends /*<extends>*/Struct<MTLAccelerationStructureInstanceDescriptor>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLAccelerationStructureInstanceDescriptorPtr extends Ptr<MTLAccelerationStructureInstanceDescriptor, MTLAccelerationStructureInstanceDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLAccelerationStructureInstanceDescriptor() {}
    public MTLAccelerationStructureInstanceDescriptor(MTLPackedFloat4x3 transformationMatrix, MTLAccelerationStructureInstanceOptions options, int mask, int intersectionFunctionTableOffset, int accelerationStructureIndex) {
        this.setTransformationMatrix(transformationMatrix);
        this.setOptions(options);
        this.setMask(mask);
        this.setIntersectionFunctionTableOffset(intersectionFunctionTableOffset);
        this.setAccelerationStructureIndex(accelerationStructureIndex);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal MTLPackedFloat4x3 getTransformationMatrix();
    @StructMember(0) public native MTLAccelerationStructureInstanceDescriptor setTransformationMatrix(@ByVal MTLPackedFloat4x3 transformationMatrix);
    @StructMember(1) public native MTLAccelerationStructureInstanceOptions getOptions();
    @StructMember(1) public native MTLAccelerationStructureInstanceDescriptor setOptions(MTLAccelerationStructureInstanceOptions options);
    @StructMember(2) public native int getMask();
    @StructMember(2) public native MTLAccelerationStructureInstanceDescriptor setMask(int mask);
    @StructMember(3) public native int getIntersectionFunctionTableOffset();
    @StructMember(3) public native MTLAccelerationStructureInstanceDescriptor setIntersectionFunctionTableOffset(int intersectionFunctionTableOffset);
    @StructMember(4) public native int getAccelerationStructureIndex();
    @StructMember(4) public native MTLAccelerationStructureInstanceDescriptor setAccelerationStructureIndex(int accelerationStructureIndex);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
