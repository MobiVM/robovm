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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNLocalContrastNormalizationGradient/*</name>*/ 
    extends /*<extends>*/MPSCNNGradientKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNLocalContrastNormalizationGradientPtr extends Ptr<MPSCNNLocalContrastNormalizationGradient, MPSCNNLocalContrastNormalizationGradientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNLocalContrastNormalizationGradient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNLocalContrastNormalizationGradient() {}
    protected MPSCNNLocalContrastNormalizationGradient(Handle h, long handle) { super(h, handle); }
    protected MPSCNNLocalContrastNormalizationGradient(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:kernelWidth:kernelHeight:")
    public MPSCNNLocalContrastNormalizationGradient(MTLDevice device, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight) { super((SkipInit) null); initObject(init(device, kernelWidth, kernelHeight)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNLocalContrastNormalizationGradient(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    @Method(selector = "initWithDevice:")
    public MPSCNNLocalContrastNormalizationGradient(MTLDevice device) { super(device); }
    @Method(selector = "initWithCoder:")
    public MPSCNNLocalContrastNormalizationGradient(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "alpha")
    public native float getAlpha();
    @Property(selector = "setAlpha:")
    public native void setAlpha(float v);
    @Property(selector = "beta")
    public native float getBeta();
    @Property(selector = "setBeta:")
    public native void setBeta(float v);
    @Property(selector = "delta")
    public native float getDelta();
    @Property(selector = "setDelta:")
    public native void setDelta(float v);
    @Property(selector = "p0")
    public native float getP0();
    @Property(selector = "setP0:")
    public native void setP0(float v);
    @Property(selector = "pm")
    public native float getPm();
    @Property(selector = "setPm:")
    public native void setPm(float v);
    @Property(selector = "ps")
    public native float getPs();
    @Property(selector = "setPs:")
    public native void setPs(float v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:kernelWidth:kernelHeight:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    /*</methods>*/
}
