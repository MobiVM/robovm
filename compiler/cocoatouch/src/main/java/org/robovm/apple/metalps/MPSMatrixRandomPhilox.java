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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixRandomPhilox/*</name>*/ 
    extends /*<extends>*/MPSMatrixRandom/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixRandomPhiloxPtr extends Ptr<MPSMatrixRandomPhilox, MPSMatrixRandomPhiloxPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixRandomPhilox.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSMatrixRandomPhilox() {}
    protected MPSMatrixRandomPhilox(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixRandomPhilox(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSMatrixRandomPhilox(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithDevice:destinationDataType:seed:distributionDescriptor:")
    public MPSMatrixRandomPhilox(MTLDevice device, MPSDataType destinationDataType, @MachineSizedUInt long seed, MPSMatrixRandomDistributionDescriptor distributionDescriptor) { super((SkipInit) null); initObject(init(device, destinationDataType, seed, distributionDescriptor)); }
    @Method(selector = "initWithDevice:destinationDataType:seed:")
    public MPSMatrixRandomPhilox(MTLDevice device, MPSDataType destinationDataType, @MachineSizedUInt long seed) { super((SkipInit) null); initObject(init(device, destinationDataType, seed)); }
    @Method(selector = "initWithCoder:device:")
    public MPSMatrixRandomPhilox(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSMatrixRandomPhilox(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithDevice:destinationDataType:seed:distributionDescriptor:")
    protected native @Pointer long init(MTLDevice device, MPSDataType destinationDataType, @MachineSizedUInt long seed, MPSMatrixRandomDistributionDescriptor distributionDescriptor);
    @Method(selector = "initWithDevice:destinationDataType:seed:")
    protected native @Pointer long init(MTLDevice device, MPSDataType destinationDataType, @MachineSizedUInt long seed);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    /*</methods>*/
}
