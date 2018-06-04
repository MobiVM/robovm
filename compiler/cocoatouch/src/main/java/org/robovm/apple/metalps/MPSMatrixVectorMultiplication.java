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
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixVectorMultiplication/*</name>*/ 
    extends /*<extends>*/MPSMatrixBinaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixVectorMultiplicationPtr extends Ptr<MPSMatrixVectorMultiplication, MPSMatrixVectorMultiplicationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixVectorMultiplication.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSMatrixVectorMultiplication() {}
    protected MPSMatrixVectorMultiplication(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixVectorMultiplication(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:transpose:rows:columns:alpha:beta:")
    public MPSMatrixVectorMultiplication(MTLDevice device, boolean transpose, @MachineSizedUInt long rows, @MachineSizedUInt long columns, double alpha, double beta) { super((SkipInit) null); initObject(init(device, transpose, rows, columns, alpha, beta)); }
    @Method(selector = "initWithDevice:rows:columns:")
    public MPSMatrixVectorMultiplication(MTLDevice device, @MachineSizedUInt long rows, @MachineSizedUInt long columns) { super((SkipInit) null); initObject(init(device, rows, columns)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:transpose:rows:columns:alpha:beta:")
    protected native @Pointer long init(MTLDevice device, boolean transpose, @MachineSizedUInt long rows, @MachineSizedUInt long columns, double alpha, double beta);
    @Method(selector = "initWithDevice:rows:columns:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long rows, @MachineSizedUInt long columns);
    @Method(selector = "encodeToCommandBuffer:inputMatrix:inputVector:resultVector:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSMatrix inputMatrix, MPSVector inputVector, MPSVector resultVector);
    /*</methods>*/
}
