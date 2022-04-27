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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCTensorDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCTensorDescriptorPtr extends Ptr<MLCTensorDescriptor, MLCTensorDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCTensorDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCTensorDescriptor() {}
    protected MLCTensorDescriptor(Handle h, long handle) { super(h, handle); }
    protected MLCTensorDescriptor(SkipInit skipInit) { super(skipInit); }
    public MLCTensorDescriptor(NSArray<NSNumber> shape, MLCDataType dataType) { super((Handle) null, create(shape, dataType)); retain(getHandle()); }
    public MLCTensorDescriptor(NSArray<NSNumber> shape, NSArray<NSNumber> sequenceLengths, boolean sortedSequences, MLCDataType dataType) { super((Handle) null, create(shape, sequenceLengths, sortedSequences, dataType)); retain(getHandle()); }
    public MLCTensorDescriptor(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannels, @MachineSizedUInt long batchSize) { super((Handle) null, create(width, height, featureChannels, batchSize)); retain(getHandle()); }
    public MLCTensorDescriptor(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCDataType dataType) { super((Handle) null, create(width, height, featureChannelCount, batchSize, dataType)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataType")
    public native MLCDataType getDataType();
    @Property(selector = "dimensionCount")
    public native @MachineSizedUInt long getDimensionCount();
    @Property(selector = "shape")
    public native NSArray<NSNumber> getShape();
    @Property(selector = "stride")
    public native NSArray<NSNumber> getStride();
    @Property(selector = "tensorAllocationSizeInBytes")
    public native @MachineSizedUInt long getTensorAllocationSizeInBytes();
    @Property(selector = "sequenceLengths")
    public native NSArray<NSNumber> getSequenceLengths();
    @Property(selector = "sortedSequences")
    public native boolean isSortedSequences();
    @Property(selector = "batchSizePerSequenceStep")
    public native NSArray<NSNumber> getBatchSizePerSequenceStep();
    @Property(selector = "maxTensorDimensions")
    public static native @MachineSizedUInt long getMaxTensorDimensions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithShape:dataType:")
    protected static native @Pointer long create(NSArray<NSNumber> shape, MLCDataType dataType);
    @Method(selector = "descriptorWithShape:sequenceLengths:sortedSequences:dataType:")
    protected static native @Pointer long create(NSArray<NSNumber> shape, NSArray<NSNumber> sequenceLengths, boolean sortedSequences, MLCDataType dataType);
    @Method(selector = "descriptorWithWidth:height:featureChannelCount:batchSize:")
    protected static native @Pointer long create(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannels, @MachineSizedUInt long batchSize);
    @Method(selector = "descriptorWithWidth:height:featureChannelCount:batchSize:dataType:")
    protected static native @Pointer long create(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCDataType dataType);
    @Method(selector = "convolutionWeightsDescriptorWithWidth:height:inputFeatureChannelCount:outputFeatureChannelCount:dataType:")
    public static native MLCTensorDescriptor createConvolutionWeightsDescriptor(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount, MLCDataType dataType);
    @Method(selector = "convolutionWeightsDescriptorWithInputFeatureChannelCount:outputFeatureChannelCount:dataType:")
    public static native MLCTensorDescriptor createConvolutionWeightsDescriptor(@MachineSizedUInt long inputFeatureChannelCount, @MachineSizedUInt long outputFeatureChannelCount, MLCDataType dataType);
    @Method(selector = "convolutionBiasesDescriptorWithFeatureChannelCount:dataType:")
    public static native MLCTensorDescriptor createConvolutionBiasesDescriptor(@MachineSizedUInt long featureChannelCount, MLCDataType dataType);
    /*</methods>*/
}
