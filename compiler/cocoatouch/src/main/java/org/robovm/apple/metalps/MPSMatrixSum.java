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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixSum/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixSumPtr extends Ptr<MPSMatrixSum, MPSMatrixSumPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixSum.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSMatrixSum() {}
    protected MPSMatrixSum(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixSum(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:count:rows:columns:transpose:")
    public MPSMatrixSum(MTLDevice device, @MachineSizedUInt long count, @MachineSizedUInt long rows, @MachineSizedUInt long columns, boolean transpose) { super((SkipInit) null); initObject(init(device, count, rows, columns, transpose)); }
    @Method(selector = "initWithCoder:device:")
    public MPSMatrixSum(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rows")
    public native @MachineSizedUInt long getRows();
    @Property(selector = "columns")
    public native @MachineSizedUInt long getColumns();
    @Property(selector = "count")
    public native @MachineSizedUInt long getCount();
    @Property(selector = "transpose")
    public native boolean isTranspose();
    @Property(selector = "neuronParameterA")
    public native float getNeuronParameterA();
    @Property(selector = "neuronParameterB")
    public native float getNeuronParameterB();
    @Property(selector = "neuronParameterC")
    public native float getNeuronParameterC();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:count:rows:columns:transpose:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long count, @MachineSizedUInt long rows, @MachineSizedUInt long columns, boolean transpose);
    @Method(selector = "setNeuronType:parameterA:parameterB:parameterC:")
    public native void setNeuronType(MPSCNNNeuronType neuronType, float parameterA, float parameterB, float parameterC);
    @Method(selector = "neuronType")
    public native MPSCNNNeuronType neuronType();
    @Method(selector = "encodeToCommandBuffer:sourceMatrices:resultMatrix:scaleVector:offsetVector:biasVector:startIndex:")
    public native void encode(MTLCommandBuffer buffer, NSArray<MPSMatrix> sourceMatrices, MPSMatrix resultMatrix, MPSVector scaleVector, MPSVector offsetVector, MPSVector biasVector, @MachineSizedUInt long startIndex);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    /*</methods>*/
}
