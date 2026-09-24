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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4CompilerAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTL4Compiler/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("device")
    public MTLDevice getDevice() { return null; }
    @NotImplemented("label")
    public String getLabel() { return null; }
    @NotImplemented("pipelineDataSetSerializer")
    public MTL4PipelineDataSetSerializer getPipelineDataSetSerializer() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("newLibraryWithDescriptor:error:")
    public MTLLibrary newLibrary(MTL4LibraryDescriptor descriptor, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("newDynamicLibrary:error:")
    public MTLDynamicLibrary newDynamicLibrary(MTLLibrary library, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("newDynamicLibraryWithURL:error:")
    public MTLDynamicLibrary newDynamicLibrary(NSURL url, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("newComputePipelineStateWithDescriptor:compilerTaskOptions:error:")
    public MTLComputePipelineState newComputePipelineState(MTL4ComputePipelineDescriptor descriptor, MTL4CompilerTaskOptions compilerTaskOptions, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:error:")
    public MTLComputePipelineState newComputePipelineState(MTL4ComputePipelineDescriptor descriptor, MTL4PipelineStageDynamicLinkingDescriptor dynamicLinkingDescriptor, MTL4CompilerTaskOptions compilerTaskOptions, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("newRenderPipelineStateWithDescriptor:compilerTaskOptions:error:")
    public MTLRenderPipelineState newRenderPipelineState(MTL4PipelineDescriptor descriptor, MTL4CompilerTaskOptions compilerTaskOptions, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:error:")
    public MTLRenderPipelineState newRenderPipelineState(MTL4PipelineDescriptor descriptor, MTL4RenderPipelineDynamicLinkingDescriptor dynamicLinkingDescriptor, MTL4CompilerTaskOptions compilerTaskOptions, NSError.NSErrorPtr error) { return null; }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @NotImplemented("newRenderPipelineStateBySpecializationWithDescriptor:pipeline:error:")
    public MTLRenderPipelineState newRenderPipelineStateBySpecialization(MTL4PipelineDescriptor descriptor, MTLRenderPipelineState pipeline, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("newBinaryFunctionWithDescriptor:compilerTaskOptions:error:")
    public MTL4BinaryFunction newBinaryFunction(MTL4BinaryFunctionDescriptor descriptor, MTL4CompilerTaskOptions compilerTaskOptions, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("newLibraryWithDescriptor:completionHandler:")
    public MTL4CompilerTask newLibrary(MTL4LibraryDescriptor descriptor, @Block VoidBlock2<MTLLibrary, NSError> completionHandler) { return null; }
    @NotImplemented("newDynamicLibrary:completionHandler:")
    public MTL4CompilerTask newDynamicLibrary(MTLLibrary library, @Block VoidBlock2<MTLDynamicLibrary, NSError> completionHandler) { return null; }
    @NotImplemented("newDynamicLibraryWithURL:completionHandler:")
    public MTL4CompilerTask newDynamicLibrary(NSURL url, @Block VoidBlock2<MTLDynamicLibrary, NSError> completionHandler) { return null; }
    @NotImplemented("newComputePipelineStateWithDescriptor:compilerTaskOptions:completionHandler:")
    public MTL4CompilerTask newComputePipelineState(MTL4ComputePipelineDescriptor descriptor, MTL4CompilerTaskOptions compilerTaskOptions, @Block VoidBlock2<MTLComputePipelineState, NSError> completionHandler) { return null; }
    @NotImplemented("newComputePipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:completionHandler:")
    public MTL4CompilerTask newComputePipelineState(MTL4ComputePipelineDescriptor descriptor, MTL4PipelineStageDynamicLinkingDescriptor dynamicLinkingDescriptor, MTL4CompilerTaskOptions compilerTaskOptions, @Block VoidBlock2<MTLComputePipelineState, NSError> completionHandler) { return null; }
    @NotImplemented("newRenderPipelineStateWithDescriptor:compilerTaskOptions:completionHandler:")
    public MTL4CompilerTask newRenderPipelineState(MTL4PipelineDescriptor descriptor, MTL4CompilerTaskOptions compilerTaskOptions, @Block VoidBlock2<MTLRenderPipelineState, NSError> completionHandler) { return null; }
    @NotImplemented("newRenderPipelineStateWithDescriptor:dynamicLinkingDescriptor:compilerTaskOptions:completionHandler:")
    public MTL4CompilerTask newRenderPipelineState(MTL4PipelineDescriptor descriptor, MTL4RenderPipelineDynamicLinkingDescriptor dynamicLinkingDescriptor, MTL4CompilerTaskOptions compilerTaskOptions, @Block VoidBlock2<MTLRenderPipelineState, NSError> completionHandler) { return null; }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @NotImplemented("newRenderPipelineStateBySpecializationWithDescriptor:pipeline:completionHandler:")
    public MTL4CompilerTask newRenderPipelineState(MTL4PipelineDescriptor descriptor, MTLRenderPipelineState pipeline, @Block VoidBlock2<MTLRenderPipelineState, NSError> completionHandler) { return null; }
    @NotImplemented("newBinaryFunctionWithDescriptor:compilerTaskOptions:completionHandler:")
    public MTL4CompilerTask newBinaryFunction(MTL4BinaryFunctionDescriptor descriptor, MTL4CompilerTaskOptions compilerTaskOptions, @Block VoidBlock2<MTL4BinaryFunction, NSError> completionHandler) { return null; }
    @NotImplemented("newMachineLearningPipelineStateWithDescriptor:error:")
    public MTL4MachineLearningPipelineState newMachineLearningPipelineState(MTL4MachineLearningPipelineDescriptor descriptor, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("newMachineLearningPipelineStateWithDescriptor:completionHandler:")
    public MTL4CompilerTask newMachineLearningPipelineState(MTL4MachineLearningPipelineDescriptor descriptor, @Block VoidBlock2<MTL4MachineLearningPipelineState, NSError> completionHandler) { return null; }
    /*</methods>*/
}
