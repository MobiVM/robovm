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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNDArrayMultiaryKernel/*</name>*/ 
    extends /*<extends>*/MPSNDArrayMultiaryBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNDArrayMultiaryKernelPtr extends Ptr<MPSNDArrayMultiaryKernel, MPSNDArrayMultiaryKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNDArrayMultiaryKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNDArrayMultiaryKernel() {}
    protected MPSNDArrayMultiaryKernel(Handle h, long handle) { super(h, handle); }
    protected MPSNDArrayMultiaryKernel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:sourceCount:")
    public MPSNDArrayMultiaryKernel(MTLDevice device, @MachineSizedUInt long count) { super((SkipInit) null); initObject(init(device, count)); }
    @Method(selector = "initWithCoder:device:")
    public MPSNDArrayMultiaryKernel(NSCoder coder, MTLDevice device) { super((SkipInit) null); initObject(init(coder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSNDArrayMultiaryKernel(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:sourceCount:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long count);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder coder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceArrays:")
    public native MPSNDArray encode(MTLCommandBuffer cmdBuf, NSArray<MPSNDArray> sourceArrays);
    @Method(selector = "encodeToCommandBuffer:sourceArrays:destinationArray:")
    public native void encode(MTLCommandBuffer cmdBuf, NSArray<MPSNDArray> sourceArrays, MPSNDArray destination);
    @Method(selector = "encodeToCommandBuffer:sourceArrays:resultState:outputStateIsTemporary:")
    public native MPSNDArray encode(MTLCommandBuffer cmdBuf, NSArray<MPSNDArray> sourceArrays, MPSState.MPSStatePtr outGradientState, boolean outputStateIsTemporary);
    @Method(selector = "encodeToCommandBuffer:sourceArrays:resultState:destinationArray:")
    public native void encode(MTLCommandBuffer cmdBuf, NSArray<MPSNDArray> sourceArrays, MPSState outGradientState, MPSNDArray destination);
    /*</methods>*/
}
