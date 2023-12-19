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
package org.robovm.apple.metalpsgraph;

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
/*<annotations>*/@Library("MetalPerformanceShadersGraph") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphTensorData/*</name>*/ 
    extends /*<extends>*/MPSGraphObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphTensorDataPtr extends Ptr<MPSGraphTensorData, MPSGraphTensorDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphTensorData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphTensorData() {}
    protected MPSGraphTensorData(Handle h, long handle) { super(h, handle); }
    protected MPSGraphTensorData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:data:shape:dataType:")
    public MPSGraphTensorData(MPSGraphDevice device, NSData data, NSArray<NSNumber> shape, MPSDataType dataType) { super((SkipInit) null); initObject(init(device, data, shape, dataType)); }
    @Method(selector = "initWithMTLBuffer:shape:dataType:")
    public MPSGraphTensorData(MTLBuffer buffer, NSArray<NSNumber> shape, MPSDataType dataType) { super((SkipInit) null); initObject(init(buffer, shape, dataType)); }
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Method(selector = "initWithMTLBuffer:shape:dataType:rowBytes:")
    public MPSGraphTensorData(MTLBuffer buffer, NSArray<NSNumber> shape, MPSDataType dataType, @MachineSizedUInt long rowBytes) { super((SkipInit) null); initObject(init(buffer, shape, dataType, rowBytes)); }
    @Method(selector = "initWithMPSMatrix:")
    public MPSGraphTensorData(MPSMatrix matrix) { super((SkipInit) null); initObject(init(matrix)); }
    @Method(selector = "initWithMPSMatrix:rank:")
    public MPSGraphTensorData(MPSMatrix matrix, @MachineSizedUInt long rank) { super((SkipInit) null); initObject(init(matrix, rank)); }
    @Method(selector = "initWithMPSVector:")
    public MPSGraphTensorData(MPSVector vector) { super((SkipInit) null); initObject(init(vector)); }
    @Method(selector = "initWithMPSVector:rank:")
    public MPSGraphTensorData(MPSVector vector, @MachineSizedUInt long rank) { super((SkipInit) null); initObject(init(vector, rank)); }
    @Method(selector = "initWithMPSNDArray:")
    public MPSGraphTensorData(MPSNDArray ndarray) { super((SkipInit) null); initObject(init(ndarray)); }
    @Method(selector = "initWithMPSImageBatch:")
    public MPSGraphTensorData(NSArray<MPSImage> imageBatch) { super((SkipInit) null); initObject(init(imageBatch)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shape")
    public native NSArray<NSNumber> getShape();
    @Property(selector = "dataType")
    public native MPSDataType getDataType();
    @Property(selector = "device")
    public native MPSGraphDevice getDevice();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:data:shape:dataType:")
    protected native @Pointer long init(MPSGraphDevice device, NSData data, NSArray<NSNumber> shape, MPSDataType dataType);
    @Method(selector = "initWithMTLBuffer:shape:dataType:")
    protected native @Pointer long init(MTLBuffer buffer, NSArray<NSNumber> shape, MPSDataType dataType);
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Method(selector = "initWithMTLBuffer:shape:dataType:rowBytes:")
    protected native @Pointer long init(MTLBuffer buffer, NSArray<NSNumber> shape, MPSDataType dataType, @MachineSizedUInt long rowBytes);
    @Method(selector = "initWithMPSMatrix:")
    protected native @Pointer long init(MPSMatrix matrix);
    @Method(selector = "initWithMPSMatrix:rank:")
    protected native @Pointer long init(MPSMatrix matrix, @MachineSizedUInt long rank);
    @Method(selector = "initWithMPSVector:")
    protected native @Pointer long init(MPSVector vector);
    @Method(selector = "initWithMPSVector:rank:")
    protected native @Pointer long init(MPSVector vector, @MachineSizedUInt long rank);
    @Method(selector = "initWithMPSNDArray:")
    protected native @Pointer long init(MPSNDArray ndarray);
    @Method(selector = "initWithMPSImageBatch:")
    protected native @Pointer long init(NSArray<MPSImage> imageBatch);
    @Method(selector = "mpsndarray")
    public native MPSNDArray mpsndarray();
    /*</methods>*/
}
