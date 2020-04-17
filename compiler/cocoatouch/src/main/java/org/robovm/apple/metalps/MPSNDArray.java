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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNDArray/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNDArrayPtr extends Ptr<MPSNDArray, MPSNDArrayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNDArray.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSNDArray() {}
    protected MPSNDArray(Handle h, long handle) { super(h, handle); }
    protected MPSNDArray(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:descriptor:")
    public MPSNDArray(MTLDevice device, MPSNDArrayDescriptor descriptor) { super((SkipInit) null); initObject(init(device, descriptor)); }
    @Method(selector = "initWithDevice:scalar:")
    public MPSNDArray(MTLDevice device, double value) { super((SkipInit) null); initObject(init(device, value)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "dataType")
    public native MPSDataType getDataType();
    @Property(selector = "dataTypeSize")
    public native @MachineSizedUInt long getDataTypeSize();
    @Property(selector = "numberOfDimensions")
    public native @MachineSizedUInt long getNumberOfDimensions();
    @Property(selector = "device")
    public native MTLDevice getDevice();
    @Property(selector = "parent")
    public native MPSNDArray getParent();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "lengthOfDimension:")
    public native @MachineSizedUInt long lengthOfDimension(@MachineSizedUInt long dimensionIndex);
    @Method(selector = "descriptor")
    public native MPSNDArrayDescriptor descriptor();
    @Method(selector = "initWithDevice:descriptor:")
    protected native @Pointer long init(MTLDevice device, MPSNDArrayDescriptor descriptor);
    @Method(selector = "initWithDevice:scalar:")
    protected native @Pointer long init(MTLDevice device, double value);
    @Method(selector = "resourceSize")
    public native @MachineSizedUInt long resourceSize();
    @Method(selector = "arrayViewWithCommandBuffer:descriptor:aliasing:")
    public native MPSNDArray createArrayView(MTLCommandBuffer cmdBuf, MPSNDArrayDescriptor descriptor, MPSAliasingStrategy aliasing);
    @Method(selector = "exportDataWithCommandBuffer:toBuffer:destinationDataType:offset:rowStrides:")
    public native void exportData(MTLCommandBuffer cmdBuf, MTLBuffer buffer, MPSDataType destinationDataType, @MachineSizedUInt long offset, MachineSizedSIntPtr rowStrides);
    @Method(selector = "importDataWithCommandBuffer:fromBuffer:sourceDataType:offset:rowStrides:")
    public native void importData(MTLCommandBuffer cmdBuf, MTLBuffer buffer, MPSDataType sourceDataType, @MachineSizedUInt long offset, MachineSizedSIntPtr rowStrides);
    @Method(selector = "exportDataWithCommandBuffer:toImages:offset:")
    public native void exportData(MTLCommandBuffer cmdBuf, NSArray<MPSImage> images, @ByVal MPSImageCoordinate offset);
    @Method(selector = "importDataWithCommandBuffer:fromImages:offset:")
    public native void importData(MTLCommandBuffer cmdBuf, NSArray<MPSImage> images, @ByVal MPSImageCoordinate offset);
    @Method(selector = "readBytes:strideBytes:")
    public native void readBytes(VoidPtr buffer, MachineSizedSIntPtr strideBytesPerDimension);
    @Method(selector = "writeBytes:strideBytes:")
    public native void writeBytes(VoidPtr buffer, MachineSizedSIntPtr strideBytesPerDimension);
    @Method(selector = "synchronizeOnCommandBuffer:")
    public native void synchronizeOnCommandBuffer(MTLCommandBuffer commandBuffer);
    @Method(selector = "defaultAllocator")
    public static native MPSNDArrayAllocator defaultAllocator();
    /*</methods>*/
}
