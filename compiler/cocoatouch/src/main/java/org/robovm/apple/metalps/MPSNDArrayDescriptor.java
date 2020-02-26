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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNDArrayDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNDArrayDescriptorPtr extends Ptr<MPSNDArrayDescriptor, MPSNDArrayDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNDArrayDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSNDArrayDescriptor() {}
    protected MPSNDArrayDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSNDArrayDescriptor(SkipInit skipInit) { super(skipInit); }
    public MPSNDArrayDescriptor(MPSDataType dataType, @MachineSizedUInt long numberOfDimensions, MachineSizedUIntPtr dimensionSizes) { super((Handle) null, create(dataType, numberOfDimensions, dimensionSizes)); retain(getHandle()); }
    public MPSNDArrayDescriptor(MPSDataType dataType, NSArray<NSNumber> shape) { super((Handle) null, create(dataType, shape)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataType")
    public native MPSDataType getDataType();
    @Property(selector = "setDataType:")
    public native void setDataType(MPSDataType v);
    @Property(selector = "numberOfDimensions")
    public native @MachineSizedUInt long getNumberOfDimensions();
    @Property(selector = "setNumberOfDimensions:")
    public native void setNumberOfDimensions(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "lengthOfDimension:")
    public native @MachineSizedUInt long lengthOfDimension(@MachineSizedUInt long dimensionIndex);
    @Method(selector = "sliceRangeForDimension:")
    public native @ByVal MPSDimensionSlice sliceRangeForDimension(@MachineSizedUInt long dimensionIndex);
    @Method(selector = "sliceDimension:withSubrange:")
    public native void sliceDimension(@MachineSizedUInt long dimensionIndex, @ByVal MPSDimensionSlice subRange);
    @Method(selector = "transposeDimension:withDimension:")
    public native void transposeDimension(@MachineSizedUInt long dimensionIndex, @MachineSizedUInt long dimensionIndex2);
    @Method(selector = "dimensionOrder")
    public native @ByVal VectorChar16 dimensionOrder();
    @Method(selector = "reshapeWithDimensionCount:dimensionSizes:")
    public native void reshape(@MachineSizedUInt long numberOfDimensions, MachineSizedUIntPtr dimensionSizes);
    @Method(selector = "reshapeWithShape:")
    public native void reshape(NSArray<NSNumber> shape);
    @Method(selector = "descriptorWithDataType:dimensionCount:dimensionSizes:")
    protected static native @Pointer long create(MPSDataType dataType, @MachineSizedUInt long numberOfDimensions, MachineSizedUIntPtr dimensionSizes);
    @Method(selector = "descriptorWithDataType:shape:")
    protected static native @Pointer long create(MPSDataType dataType, NSArray<NSNumber> shape);
    /*</methods>*/
}
