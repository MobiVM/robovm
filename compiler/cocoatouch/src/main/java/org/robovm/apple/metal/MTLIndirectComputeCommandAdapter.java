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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLIndirectComputeCommandAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLIndirectComputeCommand/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("setComputePipelineState:")
    public void setComputePipelineState(MTLComputePipelineState pipelineState) {}
    @NotImplemented("setKernelBuffer:offset:atIndex:")
    public void setKernelBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index) {}
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("setKernelBuffer:offset:attributeStride:atIndex:")
    public void setKernelBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long stride, @MachineSizedUInt long index) {}
    @NotImplemented("concurrentDispatchThreadgroups:threadsPerThreadgroup:")
    public void concurrentDispatchThreadgroups(@ByVal MTLSize threadgroupsPerGrid, @ByVal MTLSize threadsPerThreadgroup) {}
    @NotImplemented("concurrentDispatchThreads:threadsPerThreadgroup:")
    public void concurrentDispatchThreads(@ByVal MTLSize threadsPerGrid, @ByVal MTLSize threadsPerThreadgroup) {}
    @NotImplemented("setBarrier")
    public void setBarrier() {}
    @NotImplemented("clearBarrier")
    public void clearBarrier() {}
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("setImageblockWidth:height:")
    public void setImageblockWidth(@MachineSizedUInt long width, @MachineSizedUInt long height) {}
    @NotImplemented("reset")
    public void reset() {}
    @NotImplemented("setThreadgroupMemoryLength:atIndex:")
    public void setThreadgroupMemoryLength(@MachineSizedUInt long length, @MachineSizedUInt long index) {}
    @NotImplemented("setStageInRegion:")
    public void setStageInRegion(@ByVal MTLRegion region) {}
    /*</methods>*/
}
