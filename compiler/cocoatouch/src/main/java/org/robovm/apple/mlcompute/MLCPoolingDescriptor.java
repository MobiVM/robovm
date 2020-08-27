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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCPoolingDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCPoolingDescriptorPtr extends Ptr<MLCPoolingDescriptor, MLCPoolingDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCPoolingDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCPoolingDescriptor() {}
    protected MLCPoolingDescriptor(Handle h, long handle) { super(h, handle); }
    protected MLCPoolingDescriptor(SkipInit skipInit) { super(skipInit); }
    public MLCPoolingDescriptor(MLCPoolingType poolingType, @MachineSizedUInt long kernelSize, @MachineSizedUInt long stride) { super((Handle) null, create(poolingType, kernelSize, stride)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "poolingType")
    public native MLCPoolingType getPoolingType();
    @Property(selector = "kernelWidth")
    public native @MachineSizedUInt long getKernelWidth();
    @Property(selector = "kernelHeight")
    public native @MachineSizedUInt long getKernelHeight();
    @Property(selector = "strideInX")
    public native @MachineSizedUInt long getStrideInX();
    @Property(selector = "strideInY")
    public native @MachineSizedUInt long getStrideInY();
    @Property(selector = "dilationRateInX")
    public native @MachineSizedUInt long getDilationRateInX();
    @Property(selector = "dilationRateInY")
    public native @MachineSizedUInt long getDilationRateInY();
    @Property(selector = "paddingPolicy")
    public native MLCPaddingPolicy getPaddingPolicy();
    @Property(selector = "paddingSizeInX")
    public native @MachineSizedUInt long getPaddingSizeInX();
    @Property(selector = "paddingSizeInY")
    public native @MachineSizedUInt long getPaddingSizeInY();
    @Property(selector = "countIncludesPadding")
    public native boolean isCountIncludesPadding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "poolingDescriptorWithType:kernelSize:stride:")
    protected static native @Pointer long create(MLCPoolingType poolingType, @MachineSizedUInt long kernelSize, @MachineSizedUInt long stride);
    @Method(selector = "maxPoolingDescriptorWithKernelSizes:strides:paddingPolicy:paddingSizes:")
    public static native MLCPoolingDescriptor createMaxPoolingDescriptor(NSArray<NSNumber> kernelSizes, NSArray<NSNumber> strides, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes);
    @Method(selector = "maxPoolingDescriptorWithKernelSizes:strides:dilationRates:paddingPolicy:paddingSizes:")
    public static native MLCPoolingDescriptor createMaxPoolingDescriptor(NSArray<NSNumber> kernelSizes, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes);
    @Method(selector = "averagePoolingDescriptorWithKernelSizes:strides:paddingPolicy:paddingSizes:countIncludesPadding:")
    public static native MLCPoolingDescriptor createAveragePoolingDescriptor(NSArray<NSNumber> kernelSizes, NSArray<NSNumber> strides, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes, boolean countIncludesPadding);
    @Method(selector = "averagePoolingDescriptorWithKernelSizes:strides:dilationRates:paddingPolicy:paddingSizes:countIncludesPadding:")
    public static native MLCPoolingDescriptor createAveragePoolingDescriptor(NSArray<NSNumber> kernelSizes, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes, boolean countIncludesPadding);
    @Method(selector = "l2NormPoolingDescriptorWithKernelSizes:strides:paddingPolicy:paddingSizes:")
    public static native MLCPoolingDescriptor createL2NormPoolingDescriptor(NSArray<NSNumber> kernelSizes, NSArray<NSNumber> strides, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes);
    @Method(selector = "l2NormPoolingDescriptorWithKernelSizes:strides:dilationRates:paddingPolicy:paddingSizes:")
    public static native MLCPoolingDescriptor createL2NormPoolingDescriptor(NSArray<NSNumber> kernelSizes, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, MLCPaddingPolicy paddingPolicy, NSArray<NSNumber> paddingSizes);
    /*</methods>*/
}
