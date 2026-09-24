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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTL4Archive/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "label")
    String getLabel();
    @Property(selector = "setLabel:")
    void setLabel(String v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "newComputePipelineStateWithDescriptor:error:")
    MTLComputePipelineState newComputePipelineState(MTL4ComputePipelineDescriptor descriptor, NSError.NSErrorPtr error);
    @Method(selector = "newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:error:")
    MTLComputePipelineState newComputePipelineState(MTL4ComputePipelineDescriptor descriptor, MTL4PipelineStageDynamicLinkingDescriptor dynamicLinkingDescriptor, NSError.NSErrorPtr error);
    @Method(selector = "newRenderPipelineStateWithDescriptor:error:")
    MTLRenderPipelineState newRenderPipelineState(MTL4PipelineDescriptor descriptor, NSError.NSErrorPtr error);
    @Method(selector = "newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:error:")
    MTLRenderPipelineState newRenderPipelineState(MTL4PipelineDescriptor descriptor, MTL4RenderPipelineDynamicLinkingDescriptor dynamicLinkingDescriptor, NSError.NSErrorPtr error);
    @Method(selector = "newBinaryFunctionWithDescriptor:error:")
    MTL4BinaryFunction newBinaryFunction(MTL4BinaryFunctionDescriptor descriptor, NSError.NSErrorPtr error);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
