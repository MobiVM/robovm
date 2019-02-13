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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixMultiplication/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixMultiplicationPtr extends Ptr<MPSMatrixMultiplication, MPSMatrixMultiplicationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixMultiplication.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSMatrixMultiplication() {}
    protected MPSMatrixMultiplication(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixMultiplication(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:transposeLeft:transposeRight:resultRows:resultColumns:interiorColumns:alpha:beta:")
    public MPSMatrixMultiplication(MTLDevice device, boolean transposeLeft, boolean transposeRight, @MachineSizedUInt long resultRows, @MachineSizedUInt long resultColumns, @MachineSizedUInt long interiorColumns, double alpha, double beta) { super((SkipInit) null); initObject(init(device, transposeLeft, transposeRight, resultRows, resultColumns, interiorColumns, alpha, beta)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:resultRows:resultColumns:interiorColumns:")
    public MPSMatrixMultiplication(MTLDevice device, @MachineSizedUInt long resultRows, @MachineSizedUInt long resultColumns, @MachineSizedUInt long interiorColumns) { super((SkipInit) null); initObject(init(device, resultRows, resultColumns, interiorColumns)); }
    @Method(selector = "initWithCoder:")
    public MPSMatrixMultiplication(NSCoder decoder) { super(decoder); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSMatrixMultiplication(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "resultMatrixOrigin")
    public native @ByVal MTLOrigin getResultMatrixOrigin();
    @Property(selector = "setResultMatrixOrigin:")
    public native void setResultMatrixOrigin(@ByVal MTLOrigin v);
    @Property(selector = "leftMatrixOrigin")
    public native @ByVal MTLOrigin getLeftMatrixOrigin();
    @Property(selector = "setLeftMatrixOrigin:")
    public native void setLeftMatrixOrigin(@ByVal MTLOrigin v);
    @Property(selector = "rightMatrixOrigin")
    public native @ByVal MTLOrigin getRightMatrixOrigin();
    @Property(selector = "setRightMatrixOrigin:")
    public native void setRightMatrixOrigin(@ByVal MTLOrigin v);
    @Property(selector = "batchStart")
    public native @MachineSizedUInt long getBatchStart();
    @Property(selector = "setBatchStart:")
    public native void setBatchStart(@MachineSizedUInt long v);
    @Property(selector = "batchSize")
    public native @MachineSizedUInt long getBatchSize();
    @Property(selector = "setBatchSize:")
    public native void setBatchSize(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:transposeLeft:transposeRight:resultRows:resultColumns:interiorColumns:alpha:beta:")
    protected native @Pointer long init(MTLDevice device, boolean transposeLeft, boolean transposeRight, @MachineSizedUInt long resultRows, @MachineSizedUInt long resultColumns, @MachineSizedUInt long interiorColumns, double alpha, double beta);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:resultRows:resultColumns:interiorColumns:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long resultRows, @MachineSizedUInt long resultColumns, @MachineSizedUInt long interiorColumns);
    @Method(selector = "encodeToCommandBuffer:leftMatrix:rightMatrix:resultMatrix:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSMatrix leftMatrix, MPSMatrix rightMatrix, MPSMatrix resultMatrix);
    /*</methods>*/
}
