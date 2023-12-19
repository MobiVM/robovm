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
package org.robovm.apple.metalpsgraph;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShadersGraph") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphExecutable/*</name>*/ 
    extends /*<extends>*/MPSGraphObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphExecutablePtr extends Ptr<MPSGraphExecutable, MPSGraphExecutablePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphExecutable.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphExecutable() {}
    protected MPSGraphExecutable(Handle h, long handle) { super(h, handle); }
    protected MPSGraphExecutable(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithMPSGraphPackageAtURL:compilationDescriptor:")
    public MPSGraphExecutable(NSURL mpsgraphPackageURL, MPSGraphCompilationDescriptor compilationDescriptor) { super((SkipInit) null); initObject(init(mpsgraphPackageURL, compilationDescriptor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "options")
    public native MPSGraphOptions getOptions();
    @Property(selector = "setOptions:")
    public native void setOptions(MPSGraphOptions v);
    @Property(selector = "feedTensors")
    public native NSArray<MPSGraphTensor> getFeedTensors();
    @Property(selector = "targetTensors")
    public native NSArray<MPSGraphTensor> getTargetTensors();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "specializeWithDevice:inputTypes:compilationDescriptor:")
    public native void specialize(MPSGraphDevice device, NSArray<MPSGraphType> inputTypes, MPSGraphCompilationDescriptor compilationDescriptor);
    /**
     * @since Available in iOS 16.3 and later.
     */
    @Method(selector = "getOutputTypesWithDevice:inputTypes:compilationDescriptor:")
    public native NSArray<MPSGraphShapedType> getOutputTypes(MPSGraphDevice device, NSArray<MPSGraphType> inputTypes, MPSGraphCompilationDescriptor compilationDescriptor);
    @Method(selector = "runWithMTLCommandQueue:inputsArray:resultsArray:executionDescriptor:")
    public native NSArray<MPSGraphTensorData> run(MTLCommandQueue commandQueue, NSArray<MPSGraphTensorData> inputsArray, NSArray<MPSGraphTensorData> resultsArray, MPSGraphExecutableExecutionDescriptor executionDescriptor);
    @Method(selector = "runAsyncWithMTLCommandQueue:inputsArray:resultsArray:executionDescriptor:")
    public native NSArray<MPSGraphTensorData> runAsync(MTLCommandQueue commandQueue, NSArray<MPSGraphTensorData> inputsArray, NSArray<MPSGraphTensorData> resultsArray, MPSGraphExecutableExecutionDescriptor executionDescriptor);
    @Method(selector = "encodeToCommandBuffer:inputsArray:resultsArray:executionDescriptor:")
    public native NSArray<MPSGraphTensorData> encodeToCommandBuffer(MPSCommandBuffer commandBuffer, NSArray<MPSGraphTensorData> inputsArray, NSArray<MPSGraphTensorData> resultsArray, MPSGraphExecutableExecutionDescriptor executionDescriptor);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "serializeToMPSGraphPackageAtURL:descriptor:")
    public native void serializeToMPSGraphPackage(NSURL url, MPSGraphExecutableSerializationDescriptor descriptor);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithMPSGraphPackageAtURL:compilationDescriptor:")
    protected native @Pointer long init(NSURL mpsgraphPackageURL, MPSGraphCompilationDescriptor compilationDescriptor);
    /*</methods>*/
}
