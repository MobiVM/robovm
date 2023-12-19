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
package org.robovm.apple.mlcompute;

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
 * @since Available in iOS 14.0 and later.
 * @deprecated Use Metal Performance Shaders Graph or BNNS instead.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCInferenceGraph/*</name>*/ 
    extends /*<extends>*/MLCGraph/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCInferenceGraphPtr extends Ptr<MLCInferenceGraph, MLCInferenceGraphPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCInferenceGraph.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCInferenceGraph() {}
    protected MLCInferenceGraph(Handle h, long handle) { super(h, handle); }
    protected MLCInferenceGraph(SkipInit skipInit) { super(skipInit); }
    public MLCInferenceGraph(NSArray<MLCGraph> graphObjects) { super((Handle) null, create(graphObjects)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "deviceMemorySize")
    public native @MachineSizedUInt long getDeviceMemorySize();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addInputs:")
    public native boolean addInputs(NSDictionary<NSString, MLCTensor> inputs);
    @Method(selector = "addInputs:lossLabels:lossLabelWeights:")
    public native boolean addInputs(NSDictionary<NSString, MLCTensor> inputs, NSDictionary<NSString, MLCTensor> lossLabels, NSDictionary<NSString, MLCTensor> lossLabelWeights);
    @Method(selector = "addOutputs:")
    public native boolean addOutputs(NSDictionary<NSString, MLCTensor> outputs);
    @Method(selector = "compileWithOptions:device:")
    public native boolean compile(MLCGraphCompilationOptions options, MLCDevice device);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "compileWithOptions:device:inputTensors:inputTensorsData:")
    public native boolean compile(MLCGraphCompilationOptions options, MLCDevice device, NSDictionary<NSString, MLCTensor> inputTensors, NSDictionary<NSString, MLCTensorData> inputTensorsData);
    @Method(selector = "linkWithGraphs:")
    public native boolean link(NSArray<MLCInferenceGraph> graphs);
    @Method(selector = "executeWithInputsData:batchSize:options:completionHandler:")
    public native boolean execute(NSDictionary<NSString, MLCTensorData> inputsData, @MachineSizedUInt long batchSize, MLCExecutionOptions options, @Block VoidBlock3<MLCTensor, NSError, Double> completionHandler);
    @Method(selector = "executeWithInputsData:outputsData:batchSize:options:completionHandler:")
    public native boolean execute(NSDictionary<NSString, MLCTensorData> inputsData, NSDictionary<NSString, MLCTensorData> outputsData, @MachineSizedUInt long batchSize, MLCExecutionOptions options, @Block VoidBlock3<MLCTensor, NSError, Double> completionHandler);
    @Method(selector = "executeWithInputsData:lossLabelsData:lossLabelWeightsData:batchSize:options:completionHandler:")
    public native boolean execute(NSDictionary<NSString, MLCTensorData> inputsData, NSDictionary<NSString, MLCTensorData> lossLabelsData, NSDictionary<NSString, MLCTensorData> lossLabelWeightsData, @MachineSizedUInt long batchSize, MLCExecutionOptions options, @Block VoidBlock3<MLCTensor, NSError, Double> completionHandler);
    @Method(selector = "executeWithInputsData:lossLabelsData:lossLabelWeightsData:outputsData:batchSize:options:completionHandler:")
    public native boolean execute(NSDictionary<NSString, MLCTensorData> inputsData, NSDictionary<NSString, MLCTensorData> lossLabelsData, NSDictionary<NSString, MLCTensorData> lossLabelWeightsData, NSDictionary<NSString, MLCTensorData> outputsData, @MachineSizedUInt long batchSize, MLCExecutionOptions options, @Block VoidBlock3<MLCTensor, NSError, Double> completionHandler);
    @Method(selector = "graphWithGraphObjects:")
    protected static native @Pointer long create(NSArray<MLCGraph> graphObjects);
    @Method(selector = "graph")
    public static native MLCInferenceGraph graph();
    /*</methods>*/
}
