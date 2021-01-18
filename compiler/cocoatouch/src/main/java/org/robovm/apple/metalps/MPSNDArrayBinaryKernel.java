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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNDArrayBinaryKernel/*</name>*/ 
    extends /*<extends>*/MPSNDArrayMultiaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNDArrayBinaryKernelPtr extends Ptr<MPSNDArrayBinaryKernel, MPSNDArrayBinaryKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNDArrayBinaryKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNDArrayBinaryKernel() {}
    protected MPSNDArrayBinaryKernel(Handle h, long handle) { super(h, handle); }
    protected MPSNDArrayBinaryKernel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSNDArrayBinaryKernel(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithCoder:device:")
    public MPSNDArrayBinaryKernel(NSCoder coder, MTLDevice device) { super((SkipInit) null); initObject(init(coder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSNDArrayBinaryKernel(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "primaryOffsets")
    public native @ByVal MPSNDArrayOffsets getPrimaryOffsets();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "primaryEdgeMode")
    public native MPSImageEdgeMode getPrimaryEdgeMode();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "primaryKernelSizes")
    public native @ByVal MPSNDArraySizes getPrimaryKernelSizes();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "primaryStrides")
    public native @ByVal MPSNDArrayOffsets getPrimaryStrides();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "primaryDilationRates")
    public native @ByVal MPSNDArraySizes getPrimaryDilationRates();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "secondaryOffsets")
    public native @ByVal MPSNDArrayOffsets getSecondaryOffsets();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "secondaryEdgeMode")
    public native MPSImageEdgeMode getSecondaryEdgeMode();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "secondaryKernelSizes")
    public native @ByVal MPSNDArraySizes getSecondaryKernelSizes();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "secondaryStrides")
    public native @ByVal MPSNDArrayOffsets getSecondaryStrides();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use derived filter properties
     */
    @Deprecated
    @Property(selector = "secondaryDilationRates")
    public native @ByVal MPSNDArraySizes getSecondaryDilationRates();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder coder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:primarySourceArray:secondarySourceArray:")
    public native MPSNDArray encode(MTLCommandBuffer cmdBuf, MPSNDArray primarySourceArray, MPSNDArray secondarySourceArray);
    @Method(selector = "encodeToCommandBuffer:primarySourceArray:secondarySourceArray:destinationArray:")
    public native void encode(MTLCommandBuffer cmdBuf, MPSNDArray primarySourceArray, MPSNDArray secondarySourceArray, MPSNDArray destination);
    @Method(selector = "encodeToCommandBuffer:primarySourceArray:secondarySourceArray:resultState:outputStateIsTemporary:")
    public native MPSNDArray encode(MTLCommandBuffer cmdBuf, MPSNDArray primarySourceArray, MPSNDArray secondarySourceArray, MPSState.MPSStatePtr outGradientState, boolean outputStateIsTemporary);
    @Method(selector = "encodeToCommandBuffer:primarySourceArray:secondarySourceArray:resultState:destinationArray:")
    public native void encode(MTLCommandBuffer cmdBuf, MPSNDArray primarySourceArray, MPSNDArray secondarySourceArray, MPSState outGradientState, MPSNDArray destination);
    /*</methods>*/
}
