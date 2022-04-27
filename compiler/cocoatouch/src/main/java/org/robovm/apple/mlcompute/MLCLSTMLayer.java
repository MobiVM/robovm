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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCLSTMLayer/*</name>*/ 
    extends /*<extends>*/MLCLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCLSTMLayerPtr extends Ptr<MLCLSTMLayer, MLCLSTMLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCLSTMLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCLSTMLayer() {}
    protected MLCLSTMLayer(Handle h, long handle) { super(h, handle); }
    protected MLCLSTMLayer(SkipInit skipInit) { super(skipInit); }
    public MLCLSTMLayer(MLCLSTMDescriptor descriptor, NSArray<MLCTensor> inputWeights, NSArray<MLCTensor> hiddenWeights, NSArray<MLCTensor> biases) { super((Handle) null, create(descriptor, inputWeights, hiddenWeights, biases)); retain(getHandle()); }
    public MLCLSTMLayer(MLCLSTMDescriptor descriptor, NSArray<MLCTensor> inputWeights, NSArray<MLCTensor> hiddenWeights, NSArray<MLCTensor> peepholeWeights, NSArray<MLCTensor> biases) { super((Handle) null, create(descriptor, inputWeights, hiddenWeights, peepholeWeights, biases)); retain(getHandle()); }
    public MLCLSTMLayer(MLCLSTMDescriptor descriptor, NSArray<MLCTensor> inputWeights, NSArray<MLCTensor> hiddenWeights, NSArray<MLCTensor> peepholeWeights, NSArray<MLCTensor> biases, NSArray<MLCActivationDescriptor> gateActivations, MLCActivationDescriptor outputResultActivation) { super((Handle) null, create(descriptor, inputWeights, hiddenWeights, peepholeWeights, biases, gateActivations, outputResultActivation)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "descriptor")
    public native MLCLSTMDescriptor getDescriptor();
    @Property(selector = "gateActivations")
    public native NSArray<MLCActivationDescriptor> getGateActivations();
    @Property(selector = "outputResultActivation")
    public native MLCActivationDescriptor getOutputResultActivation();
    @Property(selector = "inputWeights")
    public native NSArray<MLCTensor> getInputWeights();
    @Property(selector = "hiddenWeights")
    public native NSArray<MLCTensor> getHiddenWeights();
    @Property(selector = "peepholeWeights")
    public native NSArray<MLCTensor> getPeepholeWeights();
    @Property(selector = "biases")
    public native NSArray<MLCTensor> getBiases();
    @Property(selector = "inputWeightsParameters")
    public native NSArray<MLCTensorParameter> getInputWeightsParameters();
    @Property(selector = "hiddenWeightsParameters")
    public native NSArray<MLCTensorParameter> getHiddenWeightsParameters();
    @Property(selector = "peepholeWeightsParameters")
    public native NSArray<MLCTensorParameter> getPeepholeWeightsParameters();
    @Property(selector = "biasesParameters")
    public native NSArray<MLCTensorParameter> getBiasesParameters();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "layerWithDescriptor:inputWeights:hiddenWeights:biases:")
    protected static native @Pointer long create(MLCLSTMDescriptor descriptor, NSArray<MLCTensor> inputWeights, NSArray<MLCTensor> hiddenWeights, NSArray<MLCTensor> biases);
    @Method(selector = "layerWithDescriptor:inputWeights:hiddenWeights:peepholeWeights:biases:")
    protected static native @Pointer long create(MLCLSTMDescriptor descriptor, NSArray<MLCTensor> inputWeights, NSArray<MLCTensor> hiddenWeights, NSArray<MLCTensor> peepholeWeights, NSArray<MLCTensor> biases);
    @Method(selector = "layerWithDescriptor:inputWeights:hiddenWeights:peepholeWeights:biases:gateActivations:outputResultActivation:")
    protected static native @Pointer long create(MLCLSTMDescriptor descriptor, NSArray<MLCTensor> inputWeights, NSArray<MLCTensor> hiddenWeights, NSArray<MLCTensor> peepholeWeights, NSArray<MLCTensor> biases, NSArray<MLCActivationDescriptor> gateActivations, MLCActivationDescriptor outputResultActivation);
    @Method(selector = "supportsDataType:onDevice:")
    public static native boolean supportsDataType(MLCDataType dataType, MLCDevice device);
    /*</methods>*/
}
