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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCLossLayer/*</name>*/ 
    extends /*<extends>*/MLCLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCLossLayerPtr extends Ptr<MLCLossLayer, MLCLossLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCLossLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCLossLayer() {}
    protected MLCLossLayer(Handle h, long handle) { super(h, handle); }
    protected MLCLossLayer(SkipInit skipInit) { super(skipInit); }
    public MLCLossLayer(MLCLossDescriptor lossDescriptor) { super((Handle) null, create(lossDescriptor)); retain(getHandle()); }
    public MLCLossLayer(MLCLossDescriptor lossDescriptor, MLCTensor weights) { super((Handle) null, create(lossDescriptor, weights)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "descriptor")
    public native MLCLossDescriptor getDescriptor();
    @Property(selector = "weights")
    public native MLCTensor getWeights();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "layerWithDescriptor:")
    protected static native @Pointer long create(MLCLossDescriptor lossDescriptor);
    @Method(selector = "layerWithDescriptor:weights:")
    protected static native @Pointer long create(MLCLossDescriptor lossDescriptor, MLCTensor weights);
    @Method(selector = "softmaxCrossEntropyLossWithReductionType:labelSmoothing:classCount:weight:")
    public static native MLCLossLayer createSoftmaxCrossEntropyLoss(MLCReductionType reductionType, float labelSmoothing, @MachineSizedUInt long classCount, float weight);
    @Method(selector = "softmaxCrossEntropyLossWithReductionType:labelSmoothing:classCount:weights:")
    public static native MLCLossLayer createSoftmaxCrossEntropyLoss(MLCReductionType reductionType, float labelSmoothing, @MachineSizedUInt long classCount, MLCTensor weights);
    @Method(selector = "categoricalCrossEntropyLossWithReductionType:labelSmoothing:classCount:weight:")
    public static native MLCLossLayer createCategoricalCrossEntropyLoss(MLCReductionType reductionType, float labelSmoothing, @MachineSizedUInt long classCount, float weight);
    @Method(selector = "categoricalCrossEntropyLossWithReductionType:labelSmoothing:classCount:weights:")
    public static native MLCLossLayer createCategoricalCrossEntropyLoss(MLCReductionType reductionType, float labelSmoothing, @MachineSizedUInt long classCount, MLCTensor weights);
    @Method(selector = "sigmoidCrossEntropyLossWithReductionType:labelSmoothing:weight:")
    public static native MLCLossLayer createSigmoidCrossEntropyLoss(MLCReductionType reductionType, float labelSmoothing, float weight);
    @Method(selector = "sigmoidCrossEntropyLossWithReductionType:labelSmoothing:weights:")
    public static native MLCLossLayer createSigmoidCrossEntropyLoss(MLCReductionType reductionType, float labelSmoothing, MLCTensor weights);
    @Method(selector = "logLossWithReductionType:epsilon:weight:")
    public static native MLCLossLayer createLogLoss(MLCReductionType reductionType, float epsilon, float weight);
    @Method(selector = "logLossWithReductionType:epsilon:weights:")
    public static native MLCLossLayer createLogLoss(MLCReductionType reductionType, float epsilon, MLCTensor weights);
    @Method(selector = "huberLossWithReductionType:delta:weight:")
    public static native MLCLossLayer createHuberLoss(MLCReductionType reductionType, float delta, float weight);
    @Method(selector = "huberLossWithReductionType:delta:weights:")
    public static native MLCLossLayer createHuberLoss(MLCReductionType reductionType, float delta, MLCTensor weights);
    @Method(selector = "meanAbsoluteErrorLossWithReductionType:weight:")
    public static native MLCLossLayer createMeanAbsoluteErrorLoss(MLCReductionType reductionType, float weight);
    @Method(selector = "meanAbsoluteErrorLossWithReductionType:weights:")
    public static native MLCLossLayer createMeanAbsoluteErrorLoss(MLCReductionType reductionType, MLCTensor weights);
    @Method(selector = "meanSquaredErrorLossWithReductionType:weight:")
    public static native MLCLossLayer createMeanSquaredErrorLoss(MLCReductionType reductionType, float weight);
    @Method(selector = "meanSquaredErrorLossWithReductionType:weights:")
    public static native MLCLossLayer createMeanSquaredErrorLoss(MLCReductionType reductionType, MLCTensor weights);
    @Method(selector = "hingeLossWithReductionType:weight:")
    public static native MLCLossLayer createHingeLoss(MLCReductionType reductionType, float weight);
    @Method(selector = "hingeLossWithReductionType:weights:")
    public static native MLCLossLayer createHingeLoss(MLCReductionType reductionType, MLCTensor weights);
    @Method(selector = "cosineDistanceLossWithReductionType:weight:")
    public static native MLCLossLayer createCosineDistanceLoss(MLCReductionType reductionType, float weight);
    @Method(selector = "cosineDistanceLossWithReductionType:weights:")
    public static native MLCLossLayer createCosineDistanceLoss(MLCReductionType reductionType, MLCTensor weights);
    @Method(selector = "supportsDataType:onDevice:")
    public static native boolean supportsDataType(MLCDataType dataType, MLCDevice device);
    /*</methods>*/
}
