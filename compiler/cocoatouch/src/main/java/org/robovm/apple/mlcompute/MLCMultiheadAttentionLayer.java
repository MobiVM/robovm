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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCMultiheadAttentionLayer/*</name>*/ 
    extends /*<extends>*/MLCLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCMultiheadAttentionLayerPtr extends Ptr<MLCMultiheadAttentionLayer, MLCMultiheadAttentionLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCMultiheadAttentionLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCMultiheadAttentionLayer() {}
    protected MLCMultiheadAttentionLayer(Handle h, long handle) { super(h, handle); }
    protected MLCMultiheadAttentionLayer(SkipInit skipInit) { super(skipInit); }
    public MLCMultiheadAttentionLayer(MLCMultiheadAttentionDescriptor descriptor, NSArray<MLCTensor> weights, NSArray<MLCTensor> biases, NSArray<MLCTensor> attentionBiases) { super((Handle) null, create(descriptor, weights, biases, attentionBiases)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "descriptor")
    public native MLCMultiheadAttentionDescriptor getDescriptor();
    @Property(selector = "weights")
    public native NSArray<MLCTensor> getWeights();
    @Property(selector = "biases")
    public native NSArray<MLCTensor> getBiases();
    @Property(selector = "attentionBiases")
    public native NSArray<MLCTensor> getAttentionBiases();
    @Property(selector = "weightsParameters")
    public native NSArray<MLCTensorParameter> getWeightsParameters();
    @Property(selector = "biasesParameters")
    public native NSArray<MLCTensorParameter> getBiasesParameters();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "layerWithDescriptor:weights:biases:attentionBiases:")
    protected static native @Pointer long create(MLCMultiheadAttentionDescriptor descriptor, NSArray<MLCTensor> weights, NSArray<MLCTensor> biases, NSArray<MLCTensor> attentionBiases);
    @Method(selector = "supportsDataType:onDevice:")
    public static native boolean supportsDataType(MLCDataType dataType, MLCDevice device);
    /*</methods>*/
}
