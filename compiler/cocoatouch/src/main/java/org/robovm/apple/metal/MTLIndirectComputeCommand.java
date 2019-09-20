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
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTLIndirectComputeCommand/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "setComputePipelineState:")
    void setComputePipelineState(MTLComputePipelineState pipelineState);
    @Method(selector = "setKernelBuffer:offset:atIndex:")
    void setKernelBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long index);
    @Method(selector = "concurrentDispatchThreadgroups:threadsPerThreadgroup:")
    void concurrentDispatchThreadgroups(@ByVal MTLSize threadgroupsPerGrid, @ByVal MTLSize threadsPerThreadgroup);
    @Method(selector = "concurrentDispatchThreads:threadsPerThreadgroup:")
    void concurrentDispatchThreads(@ByVal MTLSize threadsPerGrid, @ByVal MTLSize threadsPerThreadgroup);
    @Method(selector = "setBarrier")
    void setBarrier();
    @Method(selector = "clearBarrier")
    void clearBarrier();
    @Method(selector = "reset")
    void reset();
    @Method(selector = "setThreadgroupMemoryLength:atIndex:")
    void setThreadgroupMemoryLength(@MachineSizedUInt long length, @MachineSizedUInt long index);
    @Method(selector = "setStageInRegion:")
    void setStageInRegion(@ByVal MTLRegion region);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
