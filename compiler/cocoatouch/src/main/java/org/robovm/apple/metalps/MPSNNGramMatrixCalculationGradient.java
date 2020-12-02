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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNGramMatrixCalculationGradient/*</name>*/ 
    extends /*<extends>*/MPSCNNGradientKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNGramMatrixCalculationGradientPtr extends Ptr<MPSNNGramMatrixCalculationGradient, MPSNNGramMatrixCalculationGradientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNGramMatrixCalculationGradient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSNNGramMatrixCalculationGradient() {}
    protected MPSNNGramMatrixCalculationGradient(Handle h, long handle) { super(h, handle); }
    protected MPSNNGramMatrixCalculationGradient(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:device:")
    public MPSNNGramMatrixCalculationGradient(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithDevice:alpha:")
    public MPSNNGramMatrixCalculationGradient(MTLDevice device, float alpha) { super((SkipInit) null); initObject(init(device, alpha)); }
    @Method(selector = "initWithDevice:")
    public MPSNNGramMatrixCalculationGradient(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithCoder:")
    public MPSNNGramMatrixCalculationGradient(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "alpha")
    public native float getAlpha();
    @Property(selector = "setAlpha:")
    public native void setAlpha(float v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "initWithDevice:alpha:")
    protected native @Pointer long init(MTLDevice device, float alpha);
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    /*</methods>*/
}
