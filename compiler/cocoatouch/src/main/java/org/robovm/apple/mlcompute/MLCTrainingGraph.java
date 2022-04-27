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
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCTrainingGraph/*</name>*/ 
    extends /*<extends>*/MLCGraph/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCTrainingGraphPtr extends Ptr<MLCTrainingGraph, MLCTrainingGraphPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCTrainingGraph.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLCTrainingGraph() {}
    protected MLCTrainingGraph(Handle h, long handle) { super(h, handle); }
    protected MLCTrainingGraph(SkipInit skipInit) { super(skipInit); }
    public MLCTrainingGraph(NSArray<MLCGraph> graphObjects, MLCLayer lossLayer, MLCOptimizer optimizer) { super((Handle) null, create(graphObjects, lossLayer, optimizer)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "optimizer")
    public native MLCOptimizer getOptimizer();
    @Property(selector = "deviceMemorySize")
    public native @MachineSizedUInt long getDeviceMemorySize();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addInputs:lossLabels:")
    public native boolean addInputs(NSDictionary<NSString, MLCTensor> inputs, NSDictionary<NSString, MLCTensor> lossLabels);
    @Method(selector = "addInputs:lossLabels:lossLabelWeights:")
    public native boolean addInputs(NSDictionary<NSString, MLCTensor> inputs, NSDictionary<NSString, MLCTensor> lossLabels, NSDictionary<NSString, MLCTensor> lossLabelWeights);
    @Method(selector = "addOutputs:")
    public native boolean addOutputs(NSDictionary<NSString, MLCTensor> outputs);
    @Method(selector = "stopGradientForTensors:")
    public native boolean stopGradientForTensors(NSArray<MLCTensor> tensors);
    @Method(selector = "compileWithOptions:device:")
    public native boolean compile(MLCGraphCompilationOptions options, MLCDevice device);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "compileWithOptions:device:inputTensors:inputTensorsData:")
    public native boolean compile(MLCGraphCompilationOptions options, MLCDevice device, NSDictionary<NSString, MLCTensor> inputTensors, NSDictionary<NSString, MLCTensorData> inputTensorsData);
    @Method(selector = "compileOptimizer:")
    public native boolean compileOptimizer(MLCOptimizer optimizer);
    @Method(selector = "linkWithGraphs:")
    public native boolean link(NSArray<MLCTrainingGraph> graphs);
    @Method(selector = "gradientTensorForInput:")
    public native MLCTensor gradientTensorForInput(MLCTensor input);
    @Method(selector = "sourceGradientTensorsForLayer:")
    public native NSArray<MLCTensor> sourceGradientTensorsForLayer(MLCLayer layer);
    @Method(selector = "resultGradientTensorsForLayer:")
    public native NSArray<MLCTensor> resultGradientTensorsForLayer(MLCLayer layer);
    @Method(selector = "gradientDataForParameter:layer:")
    public native NSData gradientData(MLCTensor parameter, MLCLayer layer);
    @Method(selector = "allocateUserGradientForTensor:")
    public native MLCTensor allocateUserGradientForTensor(MLCTensor tensor);
    @Method(selector = "executeWithInputsData:lossLabelsData:lossLabelWeightsData:batchSize:options:completionHandler:")
    public native boolean execute(NSDictionary<NSString, MLCTensorData> inputsData, NSDictionary<NSString, MLCTensorData> lossLabelsData, NSDictionary<NSString, MLCTensorData> lossLabelWeightsData, @MachineSizedUInt long batchSize, MLCExecutionOptions options, @Block VoidBlock3<MLCTensor, NSError, Double> completionHandler);
    @Method(selector = "executeWithInputsData:lossLabelsData:lossLabelWeightsData:outputsData:batchSize:options:completionHandler:")
    public native boolean execute(NSDictionary<NSString, MLCTensorData> inputsData, NSDictionary<NSString, MLCTensorData> lossLabelsData, NSDictionary<NSString, MLCTensorData> lossLabelWeightsData, NSDictionary<NSString, MLCTensorData> outputsData, @MachineSizedUInt long batchSize, MLCExecutionOptions options, @Block VoidBlock3<MLCTensor, NSError, Double> completionHandler);
    @Method(selector = "executeForwardWithBatchSize:options:completionHandler:")
    public native boolean executeForward(@MachineSizedUInt long batchSize, MLCExecutionOptions options, @Block VoidBlock3<MLCTensor, NSError, Double> completionHandler);
    @Method(selector = "executeForwardWithBatchSize:options:outputsData:completionHandler:")
    public native boolean executeForward(@MachineSizedUInt long batchSize, MLCExecutionOptions options, NSDictionary<NSString, MLCTensorData> outputsData, @Block VoidBlock3<MLCTensor, NSError, Double> completionHandler);
    @Method(selector = "executeGradientWithBatchSize:options:completionHandler:")
    public native boolean executeGradient(@MachineSizedUInt long batchSize, MLCExecutionOptions options, @Block VoidBlock3<MLCTensor, NSError, Double> completionHandler);
    @Method(selector = "executeGradientWithBatchSize:options:outputsData:completionHandler:")
    public native boolean executeGradient(@MachineSizedUInt long batchSize, MLCExecutionOptions options, NSDictionary<NSString, MLCTensorData> outputsData, @Block VoidBlock3<MLCTensor, NSError, Double> completionHandler);
    @Method(selector = "executeOptimizerUpdateWithOptions:completionHandler:")
    public native boolean executeOptimizerUpdate(MLCExecutionOptions options, @Block VoidBlock3<MLCTensor, NSError, Double> completionHandler);
    @Method(selector = "synchronizeUpdates")
    public native void synchronizeUpdates();
    @Method(selector = "setTrainingTensorParameters:")
    public native boolean setTrainingTensorParameters(NSArray<MLCTensorParameter> parameters);
    @Method(selector = "bindOptimizerData:deviceData:withTensor:")
    public native boolean bindOptimizerData(NSArray<MLCTensorData> data, NSArray<MLCTensorOptimizerDeviceData> deviceData, MLCTensor tensor);
    @Method(selector = "graphWithGraphObjects:lossLayer:optimizer:")
    protected static native @Pointer long create(NSArray<MLCGraph> graphObjects, MLCLayer lossLayer, MLCOptimizer optimizer);
    @Method(selector = "graph")
    public static native MLCTrainingGraph graph();
    /*</methods>*/
}
