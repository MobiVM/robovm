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
 * @since Available in iOS 16.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShadersGraph") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphConvolution3DOpDescriptor/*</name>*/ 
    extends /*<extends>*/MPSGraphObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphConvolution3DOpDescriptorPtr extends Ptr<MPSGraphConvolution3DOpDescriptor, MPSGraphConvolution3DOpDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphConvolution3DOpDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphConvolution3DOpDescriptor() {}
    protected MPSGraphConvolution3DOpDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSGraphConvolution3DOpDescriptor(SkipInit skipInit) { super(skipInit); }
    public MPSGraphConvolution3DOpDescriptor(@MachineSizedUInt long strideInX, @MachineSizedUInt long strideInY, @MachineSizedUInt long strideInZ, @MachineSizedUInt long dilationRateInX, @MachineSizedUInt long dilationRateInY, @MachineSizedUInt long dilationRateInZ, @MachineSizedUInt long groups, @MachineSizedUInt long paddingLeft, @MachineSizedUInt long paddingRight, @MachineSizedUInt long paddingTop, @MachineSizedUInt long paddingBottom, @MachineSizedUInt long paddingFront, @MachineSizedUInt long paddingBack, MPSGraphPaddingStyle paddingStyle, MPSGraphTensorNamedDataLayout dataLayout, MPSGraphTensorNamedDataLayout weightsLayout) { super((Handle) null, create(strideInX, strideInY, strideInZ, dilationRateInX, dilationRateInY, dilationRateInZ, groups, paddingLeft, paddingRight, paddingTop, paddingBottom, paddingFront, paddingBack, paddingStyle, dataLayout, weightsLayout)); retain(getHandle()); }
    public MPSGraphConvolution3DOpDescriptor(@MachineSizedUInt long strideInX, @MachineSizedUInt long strideInY, @MachineSizedUInt long strideInZ, @MachineSizedUInt long dilationRateInX, @MachineSizedUInt long dilationRateInY, @MachineSizedUInt long dilationRateInZ, @MachineSizedUInt long groups, MPSGraphPaddingStyle paddingStyle, MPSGraphTensorNamedDataLayout dataLayout, MPSGraphTensorNamedDataLayout weightsLayout) { super((Handle) null, create(strideInX, strideInY, strideInZ, dilationRateInX, dilationRateInY, dilationRateInZ, groups, paddingStyle, dataLayout, weightsLayout)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "strideInX")
    public native @MachineSizedUInt long getStrideInX();
    @Property(selector = "setStrideInX:")
    public native void setStrideInX(@MachineSizedUInt long v);
    @Property(selector = "strideInY")
    public native @MachineSizedUInt long getStrideInY();
    @Property(selector = "setStrideInY:")
    public native void setStrideInY(@MachineSizedUInt long v);
    @Property(selector = "strideInZ")
    public native @MachineSizedUInt long getStrideInZ();
    @Property(selector = "setStrideInZ:")
    public native void setStrideInZ(@MachineSizedUInt long v);
    @Property(selector = "dilationRateInX")
    public native @MachineSizedUInt long getDilationRateInX();
    @Property(selector = "setDilationRateInX:")
    public native void setDilationRateInX(@MachineSizedUInt long v);
    @Property(selector = "dilationRateInY")
    public native @MachineSizedUInt long getDilationRateInY();
    @Property(selector = "setDilationRateInY:")
    public native void setDilationRateInY(@MachineSizedUInt long v);
    @Property(selector = "dilationRateInZ")
    public native @MachineSizedUInt long getDilationRateInZ();
    @Property(selector = "setDilationRateInZ:")
    public native void setDilationRateInZ(@MachineSizedUInt long v);
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
    @Property(selector = "paddingFront")
    public native @MachineSizedUInt long getPaddingFront();
    @Property(selector = "setPaddingFront:")
    public native void setPaddingFront(@MachineSizedUInt long v);
    @Property(selector = "paddingBack")
    public native @MachineSizedUInt long getPaddingBack();
    @Property(selector = "setPaddingBack:")
    public native void setPaddingBack(@MachineSizedUInt long v);
    @Property(selector = "paddingStyle")
    public native MPSGraphPaddingStyle getPaddingStyle();
    @Property(selector = "setPaddingStyle:")
    public native void setPaddingStyle(MPSGraphPaddingStyle v);
    @Property(selector = "dataLayout")
    public native MPSGraphTensorNamedDataLayout getDataLayout();
    @Property(selector = "setDataLayout:")
    public native void setDataLayout(MPSGraphTensorNamedDataLayout v);
    @Property(selector = "weightsLayout")
    public native MPSGraphTensorNamedDataLayout getWeightsLayout();
    @Property(selector = "setWeightsLayout:")
    public native void setWeightsLayout(MPSGraphTensorNamedDataLayout v);
    @Property(selector = "groups")
    public native @MachineSizedUInt long getGroups();
    @Property(selector = "setGroups:")
    public native void setGroups(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setExplicitPaddingWithPaddingLeft:paddingRight:paddingTop:paddingBottom:paddingFront:paddingBack:")
    public native void setExplicitPadding(@MachineSizedUInt long paddingLeft, @MachineSizedUInt long paddingRight, @MachineSizedUInt long paddingTop, @MachineSizedUInt long paddingBottom, @MachineSizedUInt long paddingFront, @MachineSizedUInt long paddingBack);
    @Method(selector = "descriptorWithStrideInX:strideInY:strideInZ:dilationRateInX:dilationRateInY:dilationRateInZ:groups:paddingLeft:paddingRight:paddingTop:paddingBottom:paddingFront:paddingBack:paddingStyle:dataLayout:weightsLayout:")
    protected static native @Pointer long create(@MachineSizedUInt long strideInX, @MachineSizedUInt long strideInY, @MachineSizedUInt long strideInZ, @MachineSizedUInt long dilationRateInX, @MachineSizedUInt long dilationRateInY, @MachineSizedUInt long dilationRateInZ, @MachineSizedUInt long groups, @MachineSizedUInt long paddingLeft, @MachineSizedUInt long paddingRight, @MachineSizedUInt long paddingTop, @MachineSizedUInt long paddingBottom, @MachineSizedUInt long paddingFront, @MachineSizedUInt long paddingBack, MPSGraphPaddingStyle paddingStyle, MPSGraphTensorNamedDataLayout dataLayout, MPSGraphTensorNamedDataLayout weightsLayout);
    @Method(selector = "descriptorWithStrideInX:strideInY:strideInZ:dilationRateInX:dilationRateInY:dilationRateInZ:groups:paddingStyle:dataLayout:weightsLayout:")
    protected static native @Pointer long create(@MachineSizedUInt long strideInX, @MachineSizedUInt long strideInY, @MachineSizedUInt long strideInZ, @MachineSizedUInt long dilationRateInX, @MachineSizedUInt long dilationRateInY, @MachineSizedUInt long dilationRateInZ, @MachineSizedUInt long groups, MPSGraphPaddingStyle paddingStyle, MPSGraphTensorNamedDataLayout dataLayout, MPSGraphTensorNamedDataLayout weightsLayout);
    /*</methods>*/
}
