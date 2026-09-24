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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNDArrayIdentity/*</name>*/ 
    extends /*<extends>*/MPSNDArrayUnaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNDArrayIdentityPtr extends Ptr<MPSNDArrayIdentity, MPSNDArrayIdentityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNDArrayIdentity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNDArrayIdentity() {}
    protected MPSNDArrayIdentity(Handle h, long handle) { super(h, handle); }
    protected MPSNDArrayIdentity(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSNDArrayIdentity(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithCoder:device:")
    public MPSNDArrayIdentity(NSCoder coder, MTLDevice device) { super(coder, device); }
    @Method(selector = "initWithCoder:")
    public MPSNDArrayIdentity(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "reshapeWithCommandBuffer:sourceArray:shape:destinationArray:")
    public native MPSNDArray reshape(MTLCommandBuffer cmdBuf, MPSNDArray sourceArray, NSArray<NSNumber> shape, MPSNDArray destinationArray);
    @Method(selector = "reshapeWithCommandBuffer:sourceArray:dimensionCount:dimensionSizes:destinationArray:")
    public native MPSNDArray reshape(MTLCommandBuffer cmdBuf, MPSNDArray sourceArray, @MachineSizedUInt long numberOfDimensions, MachineSizedUIntPtr dimensionSizes, MPSNDArray destinationArray);
    @Method(selector = "reshapeWithCommandEncoder:commandBuffer:sourceArray:shape:destinationArray:")
    public native MPSNDArray reshape(MTLComputeCommandEncoder encoder, MTLCommandBuffer cmdBuf, MPSNDArray sourceArray, NSArray<NSNumber> shape, MPSNDArray destinationArray);
    @Method(selector = "reshapeWithCommandEncoder:commandBuffer:sourceArray:dimensionCount:dimensionSizes:destinationArray:")
    public native MPSNDArray reshape(MTLComputeCommandEncoder encoder, MTLCommandBuffer cmdBuf, MPSNDArray sourceArray, @MachineSizedUInt long numberOfDimensions, MachineSizedUIntPtr dimensionSizes, MPSNDArray destinationArray);
    /*</methods>*/
}
