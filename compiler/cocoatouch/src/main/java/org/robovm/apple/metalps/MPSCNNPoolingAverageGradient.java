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
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNPoolingAverageGradient/*</name>*/ 
    extends /*<extends>*/MPSCNNPoolingGradient/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNPoolingAverageGradientPtr extends Ptr<MPSCNNPoolingAverageGradient, MPSCNNPoolingAverageGradientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNPoolingAverageGradient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNPoolingAverageGradient() {}
    protected MPSCNNPoolingAverageGradient(Handle h, long handle) { super(h, handle); }
    protected MPSCNNPoolingAverageGradient(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    public MPSCNNPoolingAverageGradient(MTLDevice device, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long strideInPixelsX, @MachineSizedUInt long strideInPixelsY) { super((SkipInit) null); initObject(init(device, kernelWidth, kernelHeight, strideInPixelsX, strideInPixelsY)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNPoolingAverageGradient(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithDevice:kernelWidth:kernelHeight:")
    public MPSCNNPoolingAverageGradient(MTLDevice device, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight) { super(device, kernelWidth, kernelHeight); }
    @Method(selector = "initWithCoder:")
    public MPSCNNPoolingAverageGradient(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "zeroPadSizeX")
    public native @MachineSizedUInt long getZeroPadSizeX();
    @Property(selector = "setZeroPadSizeX:")
    public native void setZeroPadSizeX(@MachineSizedUInt long v);
    @Property(selector = "zeroPadSizeY")
    public native @MachineSizedUInt long getZeroPadSizeY();
    @Property(selector = "setZeroPadSizeY:")
    public native void setZeroPadSizeY(@MachineSizedUInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, @MachineSizedUInt long strideInPixelsX, @MachineSizedUInt long strideInPixelsY);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    /*</methods>*/
}
