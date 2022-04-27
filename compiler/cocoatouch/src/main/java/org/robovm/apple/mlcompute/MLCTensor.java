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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCTensor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCTensorPtr extends Ptr<MLCTensor, MLCTensorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCTensor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCTensor() {}
    protected MLCTensor(Handle h, long handle) { super(h, handle); }
    protected MLCTensor(SkipInit skipInit) { super(skipInit); }
    public MLCTensor(MLCTensorDescriptor tensorDescriptor) { super((Handle) null, create(tensorDescriptor)); retain(getHandle()); }
    public MLCTensor(MLCTensorDescriptor tensorDescriptor, MLCRandomInitializerType randomInitializerType) { super((Handle) null, create(tensorDescriptor, randomInitializerType)); retain(getHandle()); }
    public MLCTensor(MLCTensorDescriptor tensorDescriptor, NSNumber fillData) { super((Handle) null, create(tensorDescriptor, fillData)); retain(getHandle()); }
    public MLCTensor(MLCTensorDescriptor tensorDescriptor, MLCTensorData data) { super((Handle) null, create(tensorDescriptor, data)); retain(getHandle()); }
    public MLCTensor(NSArray<NSNumber> shape) { super((Handle) null, create(shape)); retain(getHandle()); }
    public MLCTensor(NSArray<NSNumber> shape, MLCRandomInitializerType randomInitializerType) { super((Handle) null, create(shape, randomInitializerType)); retain(getHandle()); }
    public MLCTensor(NSArray<NSNumber> shape, MLCRandomInitializerType randomInitializerType, MLCDataType dataType) { super((Handle) null, create(shape, randomInitializerType, dataType)); retain(getHandle()); }
    public MLCTensor(NSArray<NSNumber> shape, MLCDataType dataType) { super((Handle) null, create(shape, dataType)); retain(getHandle()); }
    public MLCTensor(NSArray<NSNumber> shape, MLCTensorData data, MLCDataType dataType) { super((Handle) null, create(shape, data, dataType)); retain(getHandle()); }
    public MLCTensor(NSArray<NSNumber> shape, NSNumber fillData, MLCDataType dataType) { super((Handle) null, create(shape, fillData, dataType)); retain(getHandle()); }
    public MLCTensor(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize) { super((Handle) null, create(width, height, featureChannelCount, batchSize)); retain(getHandle()); }
    public MLCTensor(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, float fillData, MLCDataType dataType) { super((Handle) null, create(width, height, featureChannelCount, batchSize, fillData, dataType)); retain(getHandle()); }
    public MLCTensor(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCRandomInitializerType randomInitializerType) { super((Handle) null, create(width, height, featureChannelCount, batchSize, randomInitializerType)); retain(getHandle()); }
    public MLCTensor(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCTensorData data) { super((Handle) null, create(width, height, featureChannelCount, batchSize, data)); retain(getHandle()); }
    public MLCTensor(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCTensorData data, MLCDataType dataType) { super((Handle) null, create(width, height, featureChannelCount, batchSize, data, dataType)); retain(getHandle()); }
    public MLCTensor(@MachineSizedUInt long sequenceLength, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize) { super((Handle) null, create(sequenceLength, featureChannelCount, batchSize)); retain(getHandle()); }
    public MLCTensor(@MachineSizedUInt long sequenceLength, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCRandomInitializerType randomInitializerType) { super((Handle) null, create(sequenceLength, featureChannelCount, batchSize, randomInitializerType)); retain(getHandle()); }
    public MLCTensor(@MachineSizedUInt long sequenceLength, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCTensorData data) { super((Handle) null, create(sequenceLength, featureChannelCount, batchSize, data)); retain(getHandle()); }
    public MLCTensor(NSArray<NSNumber> sequenceLengths, boolean sortedSequences, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCRandomInitializerType randomInitializerType) { super((Handle) null, create(sequenceLengths, sortedSequences, featureChannelCount, batchSize, randomInitializerType)); retain(getHandle()); }
    public MLCTensor(NSArray<NSNumber> sequenceLengths, boolean sortedSequences, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCTensorData data) { super((Handle) null, create(sequenceLengths, sortedSequences, featureChannelCount, batchSize, data)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tensorID")
    public native @MachineSizedUInt long getTensorID();
    @Property(selector = "descriptor")
    public native MLCTensorDescriptor getDescriptor();
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "device")
    public native MLCDevice getDevice();
    @Property(selector = "optimizerData")
    public native NSArray<MLCTensorData> getOptimizerData();
    @Property(selector = "optimizerDeviceData")
    public native NSArray<MLCTensorOptimizerDeviceData> getOptimizerDeviceData();
    @Property(selector = "hasValidNumerics")
    public native boolean hasValidNumerics();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "synchronizeData")
    public native boolean synchronizeData();
    @Method(selector = "synchronizeOptimizerData")
    public native boolean synchronizeOptimizerData();
    @Method(selector = "copyDataFromDeviceMemoryToBytes:length:synchronizeWithDevice:")
    public native boolean copyData(VoidPtr bytes, @MachineSizedUInt long length, boolean synchronizeWithDevice);
    @Method(selector = "bindAndWriteData:toDevice:")
    public native boolean bindAndWriteData(MLCTensorData data, MLCDevice device);
    @Method(selector = "bindOptimizerData:deviceData:")
    public native boolean bindOptimizerData(NSArray<MLCTensorData> data, NSArray<MLCTensorOptimizerDeviceData> deviceData);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "tensorByQuantizingToType:scale:bias:")
    public native MLCTensor tensorByQuantizingToType(MLCDataType type, float scale, @MachineSizedSInt long bias);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "tensorByQuantizingToType:scale:bias:axis:")
    public native MLCTensor tensorByQuantizingToType(MLCDataType type, MLCTensor scale, MLCTensor bias, @MachineSizedSInt long axis);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "tensorByDequantizingToType:scale:bias:")
    public native MLCTensor tensorByDequantizingToType(MLCDataType type, MLCTensor scale, MLCTensor bias);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "tensorByDequantizingToType:scale:bias:axis:")
    public native MLCTensor tensorByDequantizingToType(MLCDataType type, MLCTensor scale, MLCTensor bias, @MachineSizedSInt long axis);
    @Method(selector = "tensorWithDescriptor:")
    protected static native @Pointer long create(MLCTensorDescriptor tensorDescriptor);
    @Method(selector = "tensorWithDescriptor:randomInitializerType:")
    protected static native @Pointer long create(MLCTensorDescriptor tensorDescriptor, MLCRandomInitializerType randomInitializerType);
    @Method(selector = "tensorWithDescriptor:fillWithData:")
    protected static native @Pointer long create(MLCTensorDescriptor tensorDescriptor, NSNumber fillData);
    @Method(selector = "tensorWithDescriptor:data:")
    protected static native @Pointer long create(MLCTensorDescriptor tensorDescriptor, MLCTensorData data);
    @Method(selector = "tensorWithShape:")
    protected static native @Pointer long create(NSArray<NSNumber> shape);
    @Method(selector = "tensorWithShape:randomInitializerType:")
    protected static native @Pointer long create(NSArray<NSNumber> shape, MLCRandomInitializerType randomInitializerType);
    @Method(selector = "tensorWithShape:randomInitializerType:dataType:")
    protected static native @Pointer long create(NSArray<NSNumber> shape, MLCRandomInitializerType randomInitializerType, MLCDataType dataType);
    @Method(selector = "tensorWithShape:dataType:")
    protected static native @Pointer long create(NSArray<NSNumber> shape, MLCDataType dataType);
    @Method(selector = "tensorWithShape:data:dataType:")
    protected static native @Pointer long create(NSArray<NSNumber> shape, MLCTensorData data, MLCDataType dataType);
    @Method(selector = "tensorWithShape:fillWithData:dataType:")
    protected static native @Pointer long create(NSArray<NSNumber> shape, NSNumber fillData, MLCDataType dataType);
    @Method(selector = "tensorWithWidth:height:featureChannelCount:batchSize:")
    protected static native @Pointer long create(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize);
    @Method(selector = "tensorWithWidth:height:featureChannelCount:batchSize:fillWithData:dataType:")
    protected static native @Pointer long create(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, float fillData, MLCDataType dataType);
    @Method(selector = "tensorWithWidth:height:featureChannelCount:batchSize:randomInitializerType:")
    protected static native @Pointer long create(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCRandomInitializerType randomInitializerType);
    @Method(selector = "tensorWithWidth:height:featureChannelCount:batchSize:data:")
    protected static native @Pointer long create(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCTensorData data);
    @Method(selector = "tensorWithWidth:height:featureChannelCount:batchSize:data:dataType:")
    protected static native @Pointer long create(@MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCTensorData data, MLCDataType dataType);
    @Method(selector = "tensorWithSequenceLength:featureChannelCount:batchSize:")
    protected static native @Pointer long create(@MachineSizedUInt long sequenceLength, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize);
    @Method(selector = "tensorWithSequenceLength:featureChannelCount:batchSize:randomInitializerType:")
    protected static native @Pointer long create(@MachineSizedUInt long sequenceLength, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCRandomInitializerType randomInitializerType);
    @Method(selector = "tensorWithSequenceLength:featureChannelCount:batchSize:data:")
    protected static native @Pointer long create(@MachineSizedUInt long sequenceLength, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCTensorData data);
    @Method(selector = "tensorWithSequenceLengths:sortedSequences:featureChannelCount:batchSize:randomInitializerType:")
    protected static native @Pointer long create(NSArray<NSNumber> sequenceLengths, boolean sortedSequences, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCRandomInitializerType randomInitializerType);
    @Method(selector = "tensorWithSequenceLengths:sortedSequences:featureChannelCount:batchSize:data:")
    protected static native @Pointer long create(NSArray<NSNumber> sequenceLengths, boolean sortedSequences, @MachineSizedUInt long featureChannelCount, @MachineSizedUInt long batchSize, MLCTensorData data);
    /*</methods>*/
}
