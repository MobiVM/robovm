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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNDilatedPoolingMaxNode/*</name>*/ 
    extends /*<extends>*/MPSNNFilterNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNDilatedPoolingMaxNodePtr extends Ptr<MPSCNNDilatedPoolingMaxNode, MPSCNNDilatedPoolingMaxNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNDilatedPoolingMaxNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSCNNDilatedPoolingMaxNode() {}
    protected MPSCNNDilatedPoolingMaxNode(Handle h, long handle) { super(h, handle); }
    protected MPSCNNDilatedPoolingMaxNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:dilationRateX:dilationRateY:")
    public MPSCNNDilatedPoolingMaxNode(MPSNNImageNode sourceNode, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long strideInPixelsX, @MachineSizedUInt long strideInPixelsY, @MachineSizedUInt long dilationRateX, @MachineSizedUInt long dilationRateY) { super((SkipInit) null); initObject(init(sourceNode, kernelWidth, kernelHeight, strideInPixelsX, strideInPixelsY, dilationRateX, dilationRateY)); }
    @Method(selector = "initWithSource:filterSize:stride:dilationRate:")
    public MPSCNNDilatedPoolingMaxNode(MPSNNImageNode sourceNode, @MachineSizedUInt long size, @MachineSizedUInt long stride, @MachineSizedUInt long dilationRate) { super((SkipInit) null); initObject(init(sourceNode, size, stride, dilationRate)); }
    @Method(selector = "initWithSource:filterSize:")
    public MPSCNNDilatedPoolingMaxNode(MPSNNImageNode sourceNode, @MachineSizedUInt long size) { super((SkipInit) null); initObject(init(sourceNode, size)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dilationRateX")
    public native @MachineSizedUInt long getDilationRateX();
    @Property(selector = "dilationRateY")
    public native @MachineSizedUInt long getDilationRateY();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:dilationRateX:dilationRateY:")
    protected native @Pointer long init(MPSNNImageNode sourceNode, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long strideInPixelsX, @MachineSizedUInt long strideInPixelsY, @MachineSizedUInt long dilationRateX, @MachineSizedUInt long dilationRateY);
    @Method(selector = "initWithSource:filterSize:stride:dilationRate:")
    protected native @Pointer long init(MPSNNImageNode sourceNode, @MachineSizedUInt long size, @MachineSizedUInt long stride, @MachineSizedUInt long dilationRate);
    @Method(selector = "initWithSource:filterSize:")
    protected native @Pointer long init(MPSNNImageNode sourceNode, @MachineSizedUInt long size);
    /*</methods>*/
}
