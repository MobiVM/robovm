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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTL4Compiler/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "device")
    MTLDevice getDevice();
    @Property(selector = "label")
    String getLabel();
    @Property(selector = "pipelineDataSetSerializer")
    MTL4PipelineDataSetSerializer getPipelineDataSetSerializer();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "newLibraryWithDescriptor:error:")
    MTLLibrary newLibrary(MTL4LibraryDescriptor descriptor, NSError.NSErrorPtr error);
    @Method(selector = "newDynamicLibrary:error:")
    MTLDynamicLibrary newDynamicLibrary(MTLLibrary library, NSError.NSErrorPtr error);
    @Method(selector = "newDynamicLibraryWithURL:error:")
    MTLDynamicLibrary newDynamicLibrary(NSURL url, NSError.NSErrorPtr error);
    @Method(selector = "newComputePipelineStateWithDescriptor:compilerTaskOptions:error:")
    MTLComputePipelineState newComputePipelineState(MTL4ComputePipelineDescriptor descriptor, MTL4CompilerTaskOptions compilerTaskOptions, NSError.NSErrorPtr error);
    @Method(selector = "newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:error:")
    MTLComputePipelineState newComputePipelineState(MTL4ComputePipelineDescriptor descriptor, MTL4PipelineStageDynamicLinkingDescriptor dynamicLinkingDescriptor, MTL4CompilerTaskOptions compilerTaskOptions, NSError.NSErrorPtr error);
    @Method(selector = "newRenderPipelineStateWithDescriptor:compilerTaskOptions:error:")
    MTLRenderPipelineState newRenderPipelineState(MTL4PipelineDescriptor descriptor, MTL4CompilerTaskOptions compilerTaskOptions, NSError.NSErrorPtr error);
    @Method(selector = "newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:error:")
    MTLRenderPipelineState newRenderPipelineState(MTL4PipelineDescriptor descriptor, MTL4RenderPipelineDynamicLinkingDescriptor dynamicLinkingDescriptor, MTL4CompilerTaskOptions compilerTaskOptions, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "newRenderPipelineStateBySpecializationWithDescriptor:pipeline:error:")
    MTLRenderPipelineState newRenderPipelineStateBySpecialization(MTL4PipelineDescriptor descriptor, MTLRenderPipelineState pipeline, NSError.NSErrorPtr error);
    @Method(selector = "newBinaryFunctionWithDescriptor:compilerTaskOptions:error:")
    MTL4BinaryFunction newBinaryFunction(MTL4BinaryFunctionDescriptor descriptor, MTL4CompilerTaskOptions compilerTaskOptions, NSError.NSErrorPtr error);
    @Method(selector = "newLibraryWithDescriptor:completionHandler:")
    MTL4CompilerTask newLibrary(MTL4LibraryDescriptor descriptor, @Block VoidBlock2<MTLLibrary, NSError> completionHandler);
    @Method(selector = "newDynamicLibrary:completionHandler:")
    MTL4CompilerTask newDynamicLibrary(MTLLibrary library, @Block VoidBlock2<MTLDynamicLibrary, NSError> completionHandler);
    @Method(selector = "newDynamicLibraryWithURL:completionHandler:")
    MTL4CompilerTask newDynamicLibrary(NSURL url, @Block VoidBlock2<MTLDynamicLibrary, NSError> completionHandler);
    @Method(selector = "newComputePipelineStateWithDescriptor:compilerTaskOptions:completionHandler:")
    MTL4CompilerTask newComputePipelineState(MTL4ComputePipelineDescriptor descriptor, MTL4CompilerTaskOptions compilerTaskOptions, @Block VoidBlock2<MTLComputePipelineState, NSError> completionHandler);
    @Method(selector = "newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:completionHandler:")
    MTL4CompilerTask newComputePipelineState(MTL4ComputePipelineDescriptor descriptor, MTL4PipelineStageDynamicLinkingDescriptor dynamicLinkingDescriptor, MTL4CompilerTaskOptions compilerTaskOptions, @Block VoidBlock2<MTLComputePipelineState, NSError> completionHandler);
    @Method(selector = "newRenderPipelineStateWithDescriptor:compilerTaskOptions:completionHandler:")
    MTL4CompilerTask newRenderPipelineState(MTL4PipelineDescriptor descriptor, MTL4CompilerTaskOptions compilerTaskOptions, @Block VoidBlock2<MTLRenderPipelineState, NSError> completionHandler);
    @Method(selector = "newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:completionHandler:")
    MTL4CompilerTask newRenderPipelineState(MTL4PipelineDescriptor descriptor, MTL4RenderPipelineDynamicLinkingDescriptor dynamicLinkingDescriptor, MTL4CompilerTaskOptions compilerTaskOptions, @Block VoidBlock2<MTLRenderPipelineState, NSError> completionHandler);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "newRenderPipelineStateBySpecializationWithDescriptor:pipeline:completionHandler:")
    MTL4CompilerTask newRenderPipelineState(MTL4PipelineDescriptor descriptor, MTLRenderPipelineState pipeline, @Block VoidBlock2<MTLRenderPipelineState, NSError> completionHandler);
    @Method(selector = "newBinaryFunctionWithDescriptor:compilerTaskOptions:completionHandler:")
    MTL4CompilerTask newBinaryFunction(MTL4BinaryFunctionDescriptor descriptor, MTL4CompilerTaskOptions compilerTaskOptions, @Block VoidBlock2<MTL4BinaryFunction, NSError> completionHandler);
    @Method(selector = "newMachineLearningPipelineStateWithDescriptor:error:")
    MTL4MachineLearningPipelineState newMachineLearningPipelineState(MTL4MachineLearningPipelineDescriptor descriptor, NSError.NSErrorPtr error);
    @Method(selector = "newMachineLearningPipelineStateWithDescriptor:completionHandler:")
    MTL4CompilerTask newMachineLearningPipelineState(MTL4MachineLearningPipelineDescriptor descriptor, @Block VoidBlock2<MTL4MachineLearningPipelineState, NSError> completionHandler);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
