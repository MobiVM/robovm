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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSLSTMDescriptor/*</name>*/ 
    extends /*<extends>*/MPSRNNDescriptor/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSLSTMDescriptorPtr extends Ptr<MPSLSTMDescriptor, MPSLSTMDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSLSTMDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSLSTMDescriptor() {}
    protected MPSLSTMDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSLSTMDescriptor(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public MPSLSTMDescriptor(@MachineSizedUInt long inputFeatureChannels, @MachineSizedUInt long outputFeatureChannels) { super((Handle) null, create(inputFeatureChannels, outputFeatureChannels)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "memoryWeightsAreDiagonal")
    public native boolean isMemoryWeightsAreDiagonal();
    @Property(selector = "setMemoryWeightsAreDiagonal:")
    public native void setMemoryWeightsAreDiagonal(boolean v);
    @Property(selector = "inputGateInputWeights")
    public native MPSCNNConvolutionDataSource getInputGateInputWeights();
    @Property(selector = "setInputGateInputWeights:")
    public native void setInputGateInputWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "inputGateRecurrentWeights")
    public native MPSCNNConvolutionDataSource getInputGateRecurrentWeights();
    @Property(selector = "setInputGateRecurrentWeights:")
    public native void setInputGateRecurrentWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "inputGateMemoryWeights")
    public native MPSCNNConvolutionDataSource getInputGateMemoryWeights();
    @Property(selector = "setInputGateMemoryWeights:")
    public native void setInputGateMemoryWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "forgetGateInputWeights")
    public native MPSCNNConvolutionDataSource getForgetGateInputWeights();
    @Property(selector = "setForgetGateInputWeights:")
    public native void setForgetGateInputWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "forgetGateRecurrentWeights")
    public native MPSCNNConvolutionDataSource getForgetGateRecurrentWeights();
    @Property(selector = "setForgetGateRecurrentWeights:")
    public native void setForgetGateRecurrentWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "forgetGateMemoryWeights")
    public native MPSCNNConvolutionDataSource getForgetGateMemoryWeights();
    @Property(selector = "setForgetGateMemoryWeights:")
    public native void setForgetGateMemoryWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "outputGateInputWeights")
    public native MPSCNNConvolutionDataSource getOutputGateInputWeights();
    @Property(selector = "setOutputGateInputWeights:")
    public native void setOutputGateInputWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "outputGateRecurrentWeights")
    public native MPSCNNConvolutionDataSource getOutputGateRecurrentWeights();
    @Property(selector = "setOutputGateRecurrentWeights:")
    public native void setOutputGateRecurrentWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "outputGateMemoryWeights")
    public native MPSCNNConvolutionDataSource getOutputGateMemoryWeights();
    @Property(selector = "setOutputGateMemoryWeights:")
    public native void setOutputGateMemoryWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "cellGateInputWeights")
    public native MPSCNNConvolutionDataSource getCellGateInputWeights();
    @Property(selector = "setCellGateInputWeights:")
    public native void setCellGateInputWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "cellGateRecurrentWeights")
    public native MPSCNNConvolutionDataSource getCellGateRecurrentWeights();
    @Property(selector = "setCellGateRecurrentWeights:")
    public native void setCellGateRecurrentWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "cellGateMemoryWeights")
    public native MPSCNNConvolutionDataSource getCellGateMemoryWeights();
    @Property(selector = "setCellGateMemoryWeights:")
    public native void setCellGateMemoryWeights(MPSCNNConvolutionDataSource v);
    @Property(selector = "cellToOutputNeuronType")
    public native MPSCNNNeuronType getCellToOutputNeuronType();
    @Property(selector = "setCellToOutputNeuronType:")
    public native void setCellToOutputNeuronType(MPSCNNNeuronType v);
    @Property(selector = "cellToOutputNeuronParamA")
    public native float getCellToOutputNeuronParamA();
    @Property(selector = "setCellToOutputNeuronParamA:")
    public native void setCellToOutputNeuronParamA(float v);
    @Property(selector = "cellToOutputNeuronParamB")
    public native float getCellToOutputNeuronParamB();
    @Property(selector = "setCellToOutputNeuronParamB:")
    public native void setCellToOutputNeuronParamB(float v);
    @Property(selector = "cellToOutputNeuronParamC")
    public native float getCellToOutputNeuronParamC();
    @Property(selector = "setCellToOutputNeuronParamC:")
    public native void setCellToOutputNeuronParamC(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "createLSTMDescriptorWithInputFeatureChannels:outputFeatureChannels:")
    protected static native @Pointer long create(@MachineSizedUInt long inputFeatureChannels, @MachineSizedUInt long outputFeatureChannels);
    /*</methods>*/
}
