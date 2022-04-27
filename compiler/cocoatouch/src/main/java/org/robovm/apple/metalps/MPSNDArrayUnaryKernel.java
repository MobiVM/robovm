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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNDArrayUnaryKernel/*</name>*/ 
    extends /*<extends>*/MPSNDArrayMultiaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNDArrayUnaryKernelPtr extends Ptr<MPSNDArrayUnaryKernel, MPSNDArrayUnaryKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNDArrayUnaryKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNDArrayUnaryKernel() {}
    protected MPSNDArrayUnaryKernel(Handle h, long handle) { super(h, handle); }
    protected MPSNDArrayUnaryKernel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSNDArrayUnaryKernel(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithCoder:device:")
    public MPSNDArrayUnaryKernel(NSCoder coder, MTLDevice device) { super((SkipInit) null); initObject(init(coder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSNDArrayUnaryKernel(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "offsets")
    public native @ByVal MPSNDArrayOffsets getOffsets();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "edgeMode")
    public native MPSImageEdgeMode getEdgeMode();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "kernelSizes")
    public native @ByVal MPSNDArraySizes getKernelSizes();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "strides")
    public native @ByVal MPSNDArrayOffsets getStrides();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "dilationRates")
    public native @ByVal MPSNDArraySizes getDilationRates();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder coder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceArray:")
    public native MPSNDArray encode(MTLCommandBuffer cmdBuf, MPSNDArray sourceArray);
    @Method(selector = "encodeToCommandBuffer:sourceArray:destinationArray:")
    public native void encode(MTLCommandBuffer cmdBuf, MPSNDArray sourceArray, MPSNDArray destination);
    @Method(selector = "encodeToCommandBuffer:sourceArray:resultState:outputStateIsTemporary:")
    public native MPSNDArray encode(MTLCommandBuffer cmdBuf, MPSNDArray sourceArray, MPSState.MPSStatePtr outGradientState, boolean outputStateIsTemporary);
    @Method(selector = "encodeToCommandBuffer:sourceArray:resultState:destinationArray:")
    public native void encode(MTLCommandBuffer cmdBuf, MPSNDArray sourceArray, MPSState outGradientState, MPSNDArray destination);
    /*</methods>*/
}
