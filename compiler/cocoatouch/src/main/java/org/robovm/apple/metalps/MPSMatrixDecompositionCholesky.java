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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixDecompositionCholesky/*</name>*/ 
    extends /*<extends>*/MPSMatrixUnaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixDecompositionCholeskyPtr extends Ptr<MPSMatrixDecompositionCholesky, MPSMatrixDecompositionCholeskyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixDecompositionCholesky.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSMatrixDecompositionCholesky() {}
    protected MPSMatrixDecompositionCholesky(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixDecompositionCholesky(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:lower:order:")
    public MPSMatrixDecompositionCholesky(MTLDevice device, boolean lower, @MachineSizedUInt long order) { super((SkipInit) null); initObject(init(device, lower, order)); }
    @Method(selector = "initWithDevice:")
    public MPSMatrixDecompositionCholesky(MTLDevice device) { super(device); }
    @Method(selector = "initWithCoder:")
    public MPSMatrixDecompositionCholesky(NSCoder decoder) { super(decoder); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSMatrixDecompositionCholesky(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:lower:order:")
    protected native @Pointer long init(MTLDevice device, boolean lower, @MachineSizedUInt long order);
    @Method(selector = "encodeToCommandBuffer:sourceMatrix:resultMatrix:status:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSMatrix sourceMatrix, MPSMatrix resultMatrix, MTLBuffer status);
    /*</methods>*/
}
