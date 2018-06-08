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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNConvolutionDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    /*<ptr>*/public static class MPSCNNConvolutionDescriptorPtr extends Ptr<MPSCNNConvolutionDescriptor, MPSCNNConvolutionDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNConvolutionDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNConvolutionDescriptor() {}
    protected MPSCNNConvolutionDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSCNNConvolutionDescriptor(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:")
    public MPSCNNConvolutionDescriptor(NSCoder aDecoder) { super((SkipInit) null); initObject(initWithCoder(aDecoder)); }
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    public MPSCNNConvolutionDescriptor(@MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long inputFeatureChannels, @MachineSizedUInt long outputFeatureChannels, MPSCNNNeuron neuronFilter) { super((Handle) null, create(kernelWidth, kernelHeight, inputFeatureChannels, outputFeatureChannels, neuronFilter)); retain(getHandle()); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public MPSCNNConvolutionDescriptor(@MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long inputFeatureChannels, @MachineSizedUInt long outputFeatureChannels) { super((Handle) null, create(kernelWidth, kernelHeight, inputFeatureChannels, outputFeatureChannels)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "kernelWidth")
    public native @MachineSizedUInt long getKernelWidth();
    @Property(selector = "setKernelWidth:")
    public native void setKernelWidth(@MachineSizedUInt long v);
    @Property(selector = "kernelHeight")
    public native @MachineSizedUInt long getKernelHeight();
    @Property(selector = "setKernelHeight:")
    public native void setKernelHeight(@MachineSizedUInt long v);
    @Property(selector = "inputFeatureChannels")
    public native @MachineSizedUInt long getInputFeatureChannels();
    @Property(selector = "setInputFeatureChannels:")
    public native void setInputFeatureChannels(@MachineSizedUInt long v);
    @Property(selector = "outputFeatureChannels")
    public native @MachineSizedUInt long getOutputFeatureChannels();
    @Property(selector = "setOutputFeatureChannels:")
    public native void setOutputFeatureChannels(@MachineSizedUInt long v);
    @Property(selector = "strideInPixelsX")
    public native @MachineSizedUInt long getStrideInPixelsX();
    @Property(selector = "setStrideInPixelsX:")
    public native void setStrideInPixelsX(@MachineSizedUInt long v);
    @Property(selector = "strideInPixelsY")
    public native @MachineSizedUInt long getStrideInPixelsY();
    @Property(selector = "setStrideInPixelsY:")
    public native void setStrideInPixelsY(@MachineSizedUInt long v);
    @Property(selector = "groups")
    public native @MachineSizedUInt long getGroups();
    @Property(selector = "setGroups:")
    public native void setGroups(@MachineSizedUInt long v);
    @Property(selector = "dilationRateX")
    public native @MachineSizedUInt long getDilationRateX();
    @Property(selector = "setDilationRateX:")
    public native void setDilationRateX(@MachineSizedUInt long v);
    @Property(selector = "dilationRateY")
    public native @MachineSizedUInt long getDilationRateY();
    @Property(selector = "setDilationRateY:")
    public native void setDilationRateY(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "fusedNeuronDescriptor")
    public native MPSNNNeuronDescriptor getFusedNeuronDescriptor();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setFusedNeuronDescriptor:")
    public native void setFusedNeuronDescriptor(MPSNNNeuronDescriptor v);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Property(selector = "neuron")
    public native MPSCNNNeuron getNeuron();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Property(selector = "setNeuron:")
    public native void setNeuron(MPSCNNNeuron v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:")
    protected native @Pointer long initWithCoder(NSCoder aDecoder);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setBatchNormalizationParametersForInferenceWithMean:variance:gamma:beta:epsilon:")
    public native void setBatchNormalizationParameters(FloatPtr mean, FloatPtr variance, FloatPtr gamma, FloatPtr beta, float epsilon);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.3.
     */
    @Deprecated
    @Method(selector = "setNeuronType:parameterA:parameterB:")
    public native void setNeuronType(MPSCNNNeuronType neuronType, float parameterA, float parameterB);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.3.
     */
    @Deprecated
    @Method(selector = "neuronType")
    public native MPSCNNNeuronType neuronType();
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.3.
     */
    @Deprecated
    @Method(selector = "neuronParameterA")
    public native float neuronParameterA();
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.3.
     */
    @Deprecated
    @Method(selector = "neuronParameterB")
    public native float neuronParameterB();
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 11.3.
     */
    @Deprecated
    @Method(selector = "setNeuronToPReLUWithParametersA:")
    public native void setNeuronToPReLUWithParametersA(NSData A);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "cnnConvolutionDescriptorWithKernelWidth:kernelHeight:inputFeatureChannels:outputFeatureChannels:neuronFilter:")
    protected static native @Pointer long create(@MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long inputFeatureChannels, @MachineSizedUInt long outputFeatureChannels, MPSCNNNeuron neuronFilter);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "cnnConvolutionDescriptorWithKernelWidth:kernelHeight:inputFeatureChannels:outputFeatureChannels:")
    protected static native @Pointer long create(@MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long inputFeatureChannels, @MachineSizedUInt long outputFeatureChannels);
    /*</methods>*/
}
