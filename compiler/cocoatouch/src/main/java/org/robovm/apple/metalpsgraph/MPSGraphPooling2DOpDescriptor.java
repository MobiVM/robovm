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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphPooling2DOpDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphPooling2DOpDescriptorPtr extends Ptr<MPSGraphPooling2DOpDescriptor, MPSGraphPooling2DOpDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphPooling2DOpDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphPooling2DOpDescriptor() {}
    protected MPSGraphPooling2DOpDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSGraphPooling2DOpDescriptor(SkipInit skipInit) { super(skipInit); }
    public MPSGraphPooling2DOpDescriptor(@MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long strideInX, @MachineSizedUInt long strideInY, @MachineSizedUInt long dilationRateInX, @MachineSizedUInt long dilationRateInY, @MachineSizedUInt long paddingLeft, @MachineSizedUInt long paddingRight, @MachineSizedUInt long paddingTop, @MachineSizedUInt long paddingBottom, MPSGraphPaddingStyle paddingStyle, MPSGraphTensorNamedDataLayout dataLayout) { super((Handle) null, create(kernelWidth, kernelHeight, strideInX, strideInY, dilationRateInX, dilationRateInY, paddingLeft, paddingRight, paddingTop, paddingBottom, paddingStyle, dataLayout)); retain(getHandle()); }
    public MPSGraphPooling2DOpDescriptor(@MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long strideInX, @MachineSizedUInt long strideInY, MPSGraphPaddingStyle paddingStyle, MPSGraphTensorNamedDataLayout dataLayout) { super((Handle) null, create(kernelWidth, kernelHeight, strideInX, strideInY, paddingStyle, dataLayout)); retain(getHandle()); }
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
    @Property(selector = "strideInX")
    public native @MachineSizedUInt long getStrideInX();
    @Property(selector = "setStrideInX:")
    public native void setStrideInX(@MachineSizedUInt long v);
    @Property(selector = "strideInY")
    public native @MachineSizedUInt long getStrideInY();
    @Property(selector = "setStrideInY:")
    public native void setStrideInY(@MachineSizedUInt long v);
    @Property(selector = "dilationRateInX")
    public native @MachineSizedUInt long getDilationRateInX();
    @Property(selector = "setDilationRateInX:")
    public native void setDilationRateInX(@MachineSizedUInt long v);
    @Property(selector = "dilationRateInY")
    public native @MachineSizedUInt long getDilationRateInY();
    @Property(selector = "setDilationRateInY:")
    public native void setDilationRateInY(@MachineSizedUInt long v);
    @Property(selector = "paddingLeft")
    public native @MachineSizedUInt long getPaddingLeft();
    @Property(selector = "setPaddingLeft:")
    public native void setPaddingLeft(@MachineSizedUInt long v);
    @Property(selector = "paddingRight")
    public native @MachineSizedUInt long getPaddingRight();
    @Property(selector = "setPaddingRight:")
    public native void setPaddingRight(@MachineSizedUInt long v);
    @Property(selector = "paddingTop")
    public native @MachineSizedUInt long getPaddingTop();
    @Property(selector = "setPaddingTop:")
    public native void setPaddingTop(@MachineSizedUInt long v);
    @Property(selector = "paddingBottom")
    public native @MachineSizedUInt long getPaddingBottom();
    @Property(selector = "setPaddingBottom:")
    public native void setPaddingBottom(@MachineSizedUInt long v);
    @Property(selector = "paddingStyle")
    public native MPSGraphPaddingStyle getPaddingStyle();
    @Property(selector = "setPaddingStyle:")
    public native void setPaddingStyle(MPSGraphPaddingStyle v);
    @Property(selector = "dataLayout")
    public native MPSGraphTensorNamedDataLayout getDataLayout();
    @Property(selector = "setDataLayout:")
    public native void setDataLayout(MPSGraphTensorNamedDataLayout v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setExplicitPaddingWithPaddingLeft:paddingRight:paddingTop:paddingBottom:")
    public native void setExplicitPadding(@MachineSizedUInt long paddingLeft, @MachineSizedUInt long paddingRight, @MachineSizedUInt long paddingTop, @MachineSizedUInt long paddingBottom);
    @Method(selector = "descriptorWithKernelWidth:kernelHeight:strideInX:strideInY:dilationRateInX:dilationRateInY:paddingLeft:paddingRight:paddingTop:paddingBottom:paddingStyle:dataLayout:")
    protected static native @Pointer long create(@MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long strideInX, @MachineSizedUInt long strideInY, @MachineSizedUInt long dilationRateInX, @MachineSizedUInt long dilationRateInY, @MachineSizedUInt long paddingLeft, @MachineSizedUInt long paddingRight, @MachineSizedUInt long paddingTop, @MachineSizedUInt long paddingBottom, MPSGraphPaddingStyle paddingStyle, MPSGraphTensorNamedDataLayout dataLayout);
    @Method(selector = "descriptorWithKernelWidth:kernelHeight:strideInX:strideInY:paddingStyle:dataLayout:")
    protected static native @Pointer long create(@MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long strideInX, @MachineSizedUInt long strideInY, MPSGraphPaddingStyle paddingStyle, MPSGraphTensorNamedDataLayout dataLayout);
    /*</methods>*/
}
