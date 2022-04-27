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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphStencilOpDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphStencilOpDescriptorPtr extends Ptr<MPSGraphStencilOpDescriptor, MPSGraphStencilOpDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphStencilOpDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphStencilOpDescriptor() {}
    protected MPSGraphStencilOpDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSGraphStencilOpDescriptor(SkipInit skipInit) { super(skipInit); }
    public MPSGraphStencilOpDescriptor(MPSGraphReductionMode reductionMode, NSArray<NSNumber> offsets, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, NSArray<NSNumber> explicitPadding, MPSGraphPaddingMode boundaryMode, MPSGraphPaddingStyle paddingStyle, float paddingConstant) { super((Handle) null, create(reductionMode, offsets, strides, dilationRates, explicitPadding, boundaryMode, paddingStyle, paddingConstant)); retain(getHandle()); }
    public MPSGraphStencilOpDescriptor(NSArray<NSNumber> offsets, NSArray<NSNumber> explicitPadding) { super((Handle) null, create(offsets, explicitPadding)); retain(getHandle()); }
    public MPSGraphStencilOpDescriptor(NSArray<NSNumber> explicitPadding) { super((Handle) null, create(explicitPadding)); retain(getHandle()); }
    public MPSGraphStencilOpDescriptor(MPSGraphPaddingStyle paddingStyle) { super((Handle) null, create(paddingStyle)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "reductionMode")
    public native MPSGraphReductionMode getReductionMode();
    @Property(selector = "setReductionMode:")
    public native void setReductionMode(MPSGraphReductionMode v);
    @Property(selector = "offsets")
    public native NSArray<NSNumber> getOffsets();
    @Property(selector = "setOffsets:")
    public native void setOffsets(NSArray<NSNumber> v);
    @Property(selector = "strides")
    public native NSArray<NSNumber> getStrides();
    @Property(selector = "setStrides:")
    public native void setStrides(NSArray<NSNumber> v);
    @Property(selector = "dilationRates")
    public native NSArray<NSNumber> getDilationRates();
    @Property(selector = "setDilationRates:")
    public native void setDilationRates(NSArray<NSNumber> v);
    @Property(selector = "explicitPadding")
    public native NSArray<NSNumber> getExplicitPadding();
    @Property(selector = "setExplicitPadding:")
    public native void setExplicitPadding(NSArray<NSNumber> v);
    @Property(selector = "boundaryMode")
    public native MPSGraphPaddingMode getBoundaryMode();
    @Property(selector = "setBoundaryMode:")
    public native void setBoundaryMode(MPSGraphPaddingMode v);
    @Property(selector = "paddingStyle")
    public native MPSGraphPaddingStyle getPaddingStyle();
    @Property(selector = "setPaddingStyle:")
    public native void setPaddingStyle(MPSGraphPaddingStyle v);
    @Property(selector = "paddingConstant")
    public native float getPaddingConstant();
    @Property(selector = "setPaddingConstant:")
    public native void setPaddingConstant(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithReductionMode:offsets:strides:dilationRates:explicitPadding:boundaryMode:paddingStyle:paddingConstant:")
    protected static native @Pointer long create(MPSGraphReductionMode reductionMode, NSArray<NSNumber> offsets, NSArray<NSNumber> strides, NSArray<NSNumber> dilationRates, NSArray<NSNumber> explicitPadding, MPSGraphPaddingMode boundaryMode, MPSGraphPaddingStyle paddingStyle, float paddingConstant);
    @Method(selector = "descriptorWithOffsets:explicitPadding:")
    protected static native @Pointer long create(NSArray<NSNumber> offsets, NSArray<NSNumber> explicitPadding);
    @Method(selector = "descriptorWithExplicitPadding:")
    protected static native @Pointer long create(NSArray<NSNumber> explicitPadding);
    @Method(selector = "descriptorWithPaddingStyle:")
    protected static native @Pointer long create(MPSGraphPaddingStyle paddingStyle);
    /*</methods>*/
}
