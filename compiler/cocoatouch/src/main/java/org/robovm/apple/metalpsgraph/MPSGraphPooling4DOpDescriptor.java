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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShadersGraph") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphPooling4DOpDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphPooling4DOpDescriptorPtr extends Ptr<MPSGraphPooling4DOpDescriptor, MPSGraphPooling4DOpDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphPooling4DOpDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphPooling4DOpDescriptor() {}
    protected MPSGraphPooling4DOpDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSGraphPooling4DOpDescriptor(SkipInit skipInit) { super(skipInit); }
    public MPSGraphPooling4DOpDescriptor(NSArray<NSNumber> kernelSizes, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, NSArray<NSNumber> paddingValues, MPSGraphPaddingStyle paddingStyle) { super((Handle) null, create(kernelSizes, strides, dilationRates, paddingValues, paddingStyle)); retain(getHandle()); }
    public MPSGraphPooling4DOpDescriptor(NSArray<NSNumber> kernelSizes, MPSGraphPaddingStyle paddingStyle) { super((Handle) null, create(kernelSizes, paddingStyle)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "kernelSizes")
    public native NSArray<NSNumber> getKernelSizes();
    @Property(selector = "setKernelSizes:")
    public native void setKernelSizes(NSArray<NSNumber> v);
    @Property(selector = "strides")
    public native NSArray<NSNumber> getStrides();
    @Property(selector = "setStrides:")
    public native void setStrides(NSArray<NSNumber> v);
    @Property(selector = "dilationRates")
    public native NSArray<NSNumber> getDilationRates();
    @Property(selector = "setDilationRates:")
    public native void setDilationRates(NSArray<NSNumber> v);
    @Property(selector = "paddingValues")
    public native NSArray<NSNumber> getPaddingValues();
    @Property(selector = "setPaddingValues:")
    public native void setPaddingValues(NSArray<NSNumber> v);
    @Property(selector = "paddingStyle")
    public native MPSGraphPaddingStyle getPaddingStyle();
    @Property(selector = "setPaddingStyle:")
    public native void setPaddingStyle(MPSGraphPaddingStyle v);
    @Property(selector = "ceilMode")
    public native boolean isCeilMode();
    @Property(selector = "setCeilMode:")
    public native void setCeilMode(boolean v);
    @Property(selector = "includeZeroPadToAverage")
    public native boolean isIncludeZeroPadToAverage();
    @Property(selector = "setIncludeZeroPadToAverage:")
    public native void setIncludeZeroPadToAverage(boolean v);
    /**
     * @since Available in iOS 15.3 and later.
     */
    @Property(selector = "returnIndicesMode")
    public native MPSGraphPoolingReturnIndicesMode getReturnIndicesMode();
    /**
     * @since Available in iOS 15.3 and later.
     */
    @Property(selector = "setReturnIndicesMode:")
    public native void setReturnIndicesMode(MPSGraphPoolingReturnIndicesMode v);
    /**
     * @since Available in iOS 15.3 and later.
     */
    @Property(selector = "returnIndicesDataType")
    public native MPSDataType getReturnIndicesDataType();
    /**
     * @since Available in iOS 15.3 and later.
     */
    @Property(selector = "setReturnIndicesDataType:")
    public native void setReturnIndicesDataType(MPSDataType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithKernelSizes:strides:dilationRates:paddingValues:paddingStyle:")
    protected static native @Pointer long create(NSArray<NSNumber> kernelSizes, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, NSArray<NSNumber> paddingValues, MPSGraphPaddingStyle paddingStyle);
    @Method(selector = "descriptorWithKernelSizes:paddingStyle:")
    protected static native @Pointer long create(NSArray<NSNumber> kernelSizes, MPSGraphPaddingStyle paddingStyle);
    /*</methods>*/
}
