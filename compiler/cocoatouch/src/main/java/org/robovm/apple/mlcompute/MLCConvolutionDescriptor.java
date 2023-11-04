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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCConvolutionDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCConvolutionDescriptorPtr extends Ptr<MLCConvolutionDescriptor, MLCConvolutionDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCConvolutionDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLCConvolutionDescriptor() {}
    protected MLCConvolutionDescriptor(Handle h, long handle) { super(h, handle); }
    protected MLCConvolutionDescriptor(SkipInit skipInit) { super(skipInit); }
    public MLCConvolutionDescriptor(MLCConvolutionType convolutionType, NSArray<NSNumber> kernelSizes, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount, @MachineSizedUInt long groupCount, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes) { super((Handle) null, create(convolutionType, kernelSizes, inputFeatureChannelCount, outputFeatureChannelCount, groupCount, strides, dilationRates, paddingPolicy, paddingSizes)); retain(getHandle()); }
    public MLCConvolutionDescriptor(@MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount) { super((Handle) null, create(kernelWidth, kernelHeight, inputFeatureChannelCount, outputFeatureChannelCount)); retain(getHandle()); }
    public MLCConvolutionDescriptor(NSArray<NSNumber> kernelSizes, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount, NSArray<NSNumber> strides, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes) { super((Handle) null, create(kernelSizes, inputFeatureChannelCount, outputFeatureChannelCount, strides, paddingPolicy, paddingSizes)); retain(getHandle()); }
    public MLCConvolutionDescriptor(NSArray<NSNumber> kernelSizes, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount, @MachineSizedUInt long groupCount, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes) { super((Handle) null, create(kernelSizes, inputFeatureChannelCount, outputFeatureChannelCount, groupCount, strides, dilationRates, paddingPolicy, paddingSizes)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "convolutionType")
    public native MLCConvolutionType getConvolutionType();
    @Property(selector = "kernelWidth")
    public native @MachineSizedUInt long getKernelWidth();
    @Property(selector = "kernelHeight")
    public native @MachineSizedUInt long getKernelHeight();
    @Property(selector = "inputFeatureChannelCount")
    public native @MachineSizedUInt long getInputFeatureChannelCount();
    @Property(selector = "outputFeatureChannelCount")
    public native @MachineSizedUInt long getOutputFeatureChannelCount();
    @Property(selector = "strideInX")
    public native @MachineSizedUInt long getStrideInX();
    @Property(selector = "strideInY")
    public native @MachineSizedUInt long getStrideInY();
    @Property(selector = "dilationRateInX")
    public native @MachineSizedUInt long getDilationRateInX();
    @Property(selector = "dilationRateInY")
    public native @MachineSizedUInt long getDilationRateInY();
    @Property(selector = "groupCount")
    public native @MachineSizedUInt long getGroupCount();
    @Property(selector = "paddingPolicy")
    public native MLCPaddingPolicy getPaddingPolicy();
    @Property(selector = "paddingSizeInX")
    public native @MachineSizedUInt long getPaddingSizeInX();
    @Property(selector = "paddingSizeInY")
    public native @MachineSizedUInt long getPaddingSizeInY();
    @Property(selector = "isConvolutionTranspose")
    public native boolean isConvolutionTranspose();
    @Property(selector = "usesDepthwiseConvolution")
    public native boolean usesDepthwiseConvolution();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithType:kernelSizes:inputFeatureChannelCount:outputFeatureChannelCount:groupCount:strides:dilationRates:paddingPolicy:paddingSizes:")
    protected static native @Pointer long create(MLCConvolutionType convolutionType, NSArray<NSNumber> kernelSizes, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount, @MachineSizedUInt long groupCount, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes);
    @Method(selector = "descriptorWithKernelWidth:kernelHeight:inputFeatureChannelCount:outputFeatureChannelCount:")
    protected static native @Pointer long create(@MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount);
    @Method(selector = "descriptorWithKernelSizes:inputFeatureChannelCount:outputFeatureChannelCount:strides:paddingPolicy:paddingSizes:")
    protected static native @Pointer long create(NSArray<NSNumber> kernelSizes, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount, NSArray<NSNumber> strides, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes);
    @Method(selector = "descriptorWithKernelSizes:inputFeatureChannelCount:outputFeatureChannelCount:groupCount:strides:dilationRates:paddingPolicy:paddingSizes:")
    protected static native @Pointer long create(NSArray<NSNumber> kernelSizes, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount, @MachineSizedUInt long groupCount, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes);
    @Method(selector = "convolutionTransposeDescriptorWithKernelWidth:kernelHeight:inputFeatureChannelCount:outputFeatureChannelCount:")
    public static native MLCConvolutionDescriptor createConvolutionTransposeDescriptor(@MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount);
    @Method(selector = "convolutionTransposeDescriptorWithKernelSizes:inputFeatureChannelCount:outputFeatureChannelCount:strides:paddingPolicy:paddingSizes:")
    public static native MLCConvolutionDescriptor createConvolutionTransposeDescriptor(NSArray<NSNumber> kernelSizes, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount, NSArray<NSNumber> strides, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes);
    @Method(selector = "convolutionTransposeDescriptorWithKernelSizes:inputFeatureChannelCount:outputFeatureChannelCount:groupCount:strides:dilationRates:paddingPolicy:paddingSizes:")
    public static native MLCConvolutionDescriptor createConvolutionTransposeDescriptor(NSArray<NSNumber> kernelSizes, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount, @MachineSizedUInt long groupCount, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes);
    @Method(selector = "depthwiseConvolutionDescriptorWithKernelWidth:kernelHeight:inputFeatureChannelCount:channelMultiplier:")
    public static native MLCConvolutionDescriptor createDepthwiseConvolutionDescriptor(@MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long channelMultiplier);
    @Method(selector = "depthwiseConvolutionDescriptorWithKernelSizes:inputFeatureChannelCount:channelMultiplier:strides:paddingPolicy:paddingSizes:")
    public static native MLCConvolutionDescriptor createDepthwiseConvolutionDescriptor(NSArray<NSNumber> kernelSizes, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long channelMultiplier, NSArray<NSNumber> strides, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes);
    @Method(selector = "depthwiseConvolutionDescriptorWithKernelSizes:inputFeatureChannelCount:channelMultiplier:strides:dilationRates:paddingPolicy:paddingSizes:")
    public static native MLCConvolutionDescriptor createDepthwiseConvolutionDescriptor(NSArray<NSNumber> kernelSizes, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long channelMultiplier, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes);
    /*</methods>*/
}
