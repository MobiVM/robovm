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

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPSCNNConvolutionDataSource/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "dataType")
    MPSDataType dataType();
    @Method(selector = "descriptor")
    MPSCNNConvolutionDescriptor descriptor();
    @Method(selector = "weights")
    VoidPtr weights();
    @Method(selector = "biasTerms")
    FloatPtr biasTerms();
    @Method(selector = "load")
    boolean load();
    @Method(selector = "purge")
    void purge();
    @Method(selector = "label")
    String label();
    @Method(selector = "rangesForUInt8Kernel")
    VectorFloat2 rangesForUInt8Kernel();
    @Method(selector = "lookupTableForUInt8Kernel")
    FloatPtr lookupTableForUInt8Kernel();
    @Method(selector = "weightsQuantizationType")
    MPSCNNWeightsQuantizationType weightsQuantizationType();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "updateWithCommandBuffer:gradientState:sourceState:")
    MPSCNNConvolutionWeightsAndBiasesState update(MTLCommandBuffer commandBuffer, MPSCNNConvolutionGradientState gradientState, MPSCNNConvolutionWeightsAndBiasesState sourceState);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "updateWithGradientState:sourceState:")
    boolean update(MPSCNNConvolutionGradientState gradientState, MPSCNNConvolutionWeightsAndBiasesState sourceState);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "copyWithZone:device:")
    MPSCNNConvolutionDataSource copy(NSZone zone, MTLDevice device);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
