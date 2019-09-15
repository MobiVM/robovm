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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixRandom/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixRandomPtr extends Ptr<MPSMatrixRandom, MPSMatrixRandomPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixRandom.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSMatrixRandom() {}
    protected MPSMatrixRandom(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixRandom(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MPSMatrixRandom(NSCoder decoder) { super(decoder); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSMatrixRandom(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "destinationDataType")
    public native MPSDataType getDestinationDataType();
    @Property(selector = "distributionType")
    public native MPSMatrixRandomDistribution getDistributionType();
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
    @Method(selector = "encodeToCommandBuffer:destinationVector:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSVector destinationVector);
    @Method(selector = "encodeToCommandBuffer:destinationMatrix:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSMatrix destinationMatrix);
    /*</methods>*/
}
