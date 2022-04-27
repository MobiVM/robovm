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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCYOLOLossLayer/*</name>*/ 
    extends /*<extends>*/MLCLossLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCYOLOLossLayerPtr extends Ptr<MLCYOLOLossLayer, MLCYOLOLossLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCYOLOLossLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCYOLOLossLayer() {}
    protected MLCYOLOLossLayer(Handle h, long handle) { super(h, handle); }
    protected MLCYOLOLossLayer(SkipInit skipInit) { super(skipInit); }
    public MLCYOLOLossLayer(MLCYOLOLossDescriptor lossDescriptor) { super((Handle) null, create(lossDescriptor)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "yoloLossDescriptor")
    public native MLCYOLOLossDescriptor getYoloLossDescriptor();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "layerWithDescriptor:")
    protected static native @Pointer long create(MLCYOLOLossDescriptor lossDescriptor);
    @Method(selector = "softmaxCrossEntropyLossWithReductionType:labelSmoothing:classCount:weight:")
    public static native MLCYOLOLossLayer createSoftmaxCrossEntropyLoss(MLCReductionType reductionType, float labelSmoothing, @MachineSizedUInt long classCount, float weight);
    @Method(selector = "softmaxCrossEntropyLossWithReductionType:labelSmoothing:classCount:weights:")
    public static native MLCYOLOLossLayer createSoftmaxCrossEntropyLoss(MLCReductionType reductionType, float labelSmoothing, @MachineSizedUInt long classCount, MLCTensor weights);
    @Method(selector = "categoricalCrossEntropyLossWithReductionType:labelSmoothing:classCount:weight:")
    public static native MLCYOLOLossLayer createCategoricalCrossEntropyLoss(MLCReductionType reductionType, float labelSmoothing, @MachineSizedUInt long classCount, float weight);
    @Method(selector = "categoricalCrossEntropyLossWithReductionType:labelSmoothing:classCount:weights:")
    public static native MLCYOLOLossLayer createCategoricalCrossEntropyLoss(MLCReductionType reductionType, float labelSmoothing, @MachineSizedUInt long classCount, MLCTensor weights);
    @Method(selector = "sigmoidCrossEntropyLossWithReductionType:labelSmoothing:weight:")
    public static native MLCYOLOLossLayer createSigmoidCrossEntropyLoss(MLCReductionType reductionType, float labelSmoothing, float weight);
    @Method(selector = "sigmoidCrossEntropyLossWithReductionType:labelSmoothing:weights:")
    public static native MLCYOLOLossLayer createSigmoidCrossEntropyLoss(MLCReductionType reductionType, float labelSmoothing, MLCTensor weights);
    @Method(selector = "logLossWithReductionType:epsilon:weight:")
    public static native MLCYOLOLossLayer createLogLoss(MLCReductionType reductionType, float epsilon, float weight);
    @Method(selector = "logLossWithReductionType:epsilon:weights:")
    public static native MLCYOLOLossLayer createLogLoss(MLCReductionType reductionType, float epsilon, MLCTensor weights);
    @Method(selector = "huberLossWithReductionType:delta:weight:")
    public static native MLCYOLOLossLayer createHuberLoss(MLCReductionType reductionType, float delta, float weight);
    @Method(selector = "huberLossWithReductionType:delta:weights:")
    public static native MLCYOLOLossLayer createHuberLoss(MLCReductionType reductionType, float delta, MLCTensor weights);
    @Method(selector = "meanAbsoluteErrorLossWithReductionType:weight:")
    public static native MLCYOLOLossLayer createMeanAbsoluteErrorLoss(MLCReductionType reductionType, float weight);
    @Method(selector = "meanAbsoluteErrorLossWithReductionType:weights:")
    public static native MLCYOLOLossLayer createMeanAbsoluteErrorLoss(MLCReductionType reductionType, MLCTensor weights);
    @Method(selector = "meanSquaredErrorLossWithReductionType:weight:")
    public static native MLCYOLOLossLayer createMeanSquaredErrorLoss(MLCReductionType reductionType, float weight);
    @Method(selector = "meanSquaredErrorLossWithReductionType:weights:")
    public static native MLCYOLOLossLayer createMeanSquaredErrorLoss(MLCReductionType reductionType, MLCTensor weights);
    @Method(selector = "hingeLossWithReductionType:weight:")
    public static native MLCYOLOLossLayer createHingeLoss(MLCReductionType reductionType, float weight);
    @Method(selector = "hingeLossWithReductionType:weights:")
    public static native MLCYOLOLossLayer createHingeLoss(MLCReductionType reductionType, MLCTensor weights);
    @Method(selector = "cosineDistanceLossWithReductionType:weight:")
    public static native MLCYOLOLossLayer createCosineDistanceLoss(MLCReductionType reductionType, float weight);
    @Method(selector = "cosineDistanceLossWithReductionType:weights:")
    public static native MLCYOLOLossLayer createCosineDistanceLoss(MLCReductionType reductionType, MLCTensor weights);
    @Method(selector = "supportsDataType:onDevice:")
    public static native boolean supportsDataType(MLCDataType dataType, MLCDevice device);
    /*</methods>*/
}
