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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNConvolutionDataSourceAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPSCNNConvolutionDataSource/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("dataType")
    public MPSDataType dataType() { return null; }
    @NotImplemented("descriptor")
    public MPSCNNConvolutionDescriptor descriptor() { return null; }
    @NotImplemented("weights")
    public VoidPtr weights() { return null; }
    @NotImplemented("biasTerms")
    public FloatPtr biasTerms() { return null; }
    @NotImplemented("load")
    public boolean load() { return false; }
    @NotImplemented("purge")
    public void purge() {}
    @NotImplemented("label")
    public String label() { return null; }
    @NotImplemented("rangesForUInt8Kernel")
    public VectorFloat2.VectorFloat2Ptr rangesForUInt8Kernel() { return null; }
    @NotImplemented("lookupTableForUInt8Kernel")
    public FloatPtr lookupTableForUInt8Kernel() { return null; }
    @NotImplemented("updateWithCommandBuffer:gradientState:sourceState:")
    public MPSCNNConvolutionWeightsAndBiasesState update(MTLCommandBuffer commandBuffer, MPSCNNConvolutionGradientState gradientState, MPSCNNConvolutionWeightsAndBiasesState sourceState) { return null; }
    @NotImplemented("updateWithGradientState:sourceState:")
    public boolean update(MPSCNNConvolutionGradientState gradientState, MPSCNNConvolutionWeightsAndBiasesState sourceState) { return false; }
    /*</methods>*/
}
