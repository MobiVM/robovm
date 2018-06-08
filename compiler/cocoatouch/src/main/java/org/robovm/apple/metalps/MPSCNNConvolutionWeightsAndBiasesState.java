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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNConvolutionWeightsAndBiasesState/*</name>*/ 
    extends /*<extends>*/MPSState/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNConvolutionWeightsAndBiasesStatePtr extends Ptr<MPSCNNConvolutionWeightsAndBiasesState, MPSCNNConvolutionWeightsAndBiasesStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNConvolutionWeightsAndBiasesState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNConvolutionWeightsAndBiasesState() {}
    protected MPSCNNConvolutionWeightsAndBiasesState(Handle h, long handle) { super(h, handle); }
    protected MPSCNNConvolutionWeightsAndBiasesState(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithWeights:biases:")
    public MPSCNNConvolutionWeightsAndBiasesState(MTLBuffer weights, MTLBuffer biases) { super((SkipInit) null); initObject(init(weights, biases)); }
    @Method(selector = "initWithDevice:cnnConvolutionDescriptor:")
    public MPSCNNConvolutionWeightsAndBiasesState(MTLDevice device, MPSCNNConvolutionDescriptor descriptor) { super((SkipInit) null); initObject(init(device, descriptor)); }
    public MPSCNNConvolutionWeightsAndBiasesState(MTLCommandBuffer commandBuffer, MPSCNNConvolutionDescriptor descriptor) { super((Handle) null, create(commandBuffer, descriptor)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "weights")
    public native MTLBuffer getWeights();
    @Property(selector = "biases")
    public native MTLBuffer getBiases();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithWeights:biases:")
    protected native @Pointer long init(MTLBuffer weights, MTLBuffer biases);
    @Method(selector = "initWithDevice:cnnConvolutionDescriptor:")
    protected native @Pointer long init(MTLDevice device, MPSCNNConvolutionDescriptor descriptor);
    @Method(selector = "temporaryCNNConvolutionWeightsAndBiasesStateWithCommandBuffer:cnnConvolutionDescriptor:")
    protected static native @Pointer long create(MTLCommandBuffer commandBuffer, MPSCNNConvolutionDescriptor descriptor);
    /*</methods>*/
}
