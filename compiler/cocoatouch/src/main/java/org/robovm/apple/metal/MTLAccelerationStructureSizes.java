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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLAccelerationStructureSizes/*</name>*/ 
    extends /*<extends>*/Struct<MTLAccelerationStructureSizes>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLAccelerationStructureSizesPtr extends Ptr<MTLAccelerationStructureSizes, MTLAccelerationStructureSizesPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLAccelerationStructureSizes() {}
    public MTLAccelerationStructureSizes(@MachineSizedUInt long accelerationStructureSize, @MachineSizedUInt long buildScratchBufferSize, @MachineSizedUInt long refitScratchBufferSize) {
        this.setAccelerationStructureSize(accelerationStructureSize);
        this.setBuildScratchBufferSize(buildScratchBufferSize);
        this.setRefitScratchBufferSize(refitScratchBufferSize);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedUInt long getAccelerationStructureSize();
    @StructMember(0) public native MTLAccelerationStructureSizes setAccelerationStructureSize(@MachineSizedUInt long accelerationStructureSize);
    @StructMember(1) public native @MachineSizedUInt long getBuildScratchBufferSize();
    @StructMember(1) public native MTLAccelerationStructureSizes setBuildScratchBufferSize(@MachineSizedUInt long buildScratchBufferSize);
    @StructMember(2) public native @MachineSizedUInt long getRefitScratchBufferSize();
    @StructMember(2) public native MTLAccelerationStructureSizes setRefitScratchBufferSize(@MachineSizedUInt long refitScratchBufferSize);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
