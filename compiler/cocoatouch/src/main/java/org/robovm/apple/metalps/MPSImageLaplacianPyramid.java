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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImageLaplacianPyramid/*</name>*/ 
    extends /*<extends>*/MPSImagePyramid/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImageLaplacianPyramidPtr extends Ptr<MPSImageLaplacianPyramid, MPSImageLaplacianPyramidPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSImageLaplacianPyramid.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSImageLaplacianPyramid() {}
    protected MPSImageLaplacianPyramid(Handle h, long handle) { super(h, handle); }
    protected MPSImageLaplacianPyramid(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSImageLaplacianPyramid(MTLDevice device) { super(device); }
    @Method(selector = "initWithDevice:centerWeight:")
    public MPSImageLaplacianPyramid(MTLDevice device, float centerWeight) { super(device, centerWeight); }
    @Method(selector = "initWithDevice:kernelWidth:kernelHeight:weights:")
    public MPSImageLaplacianPyramid(MTLDevice device, @MachineSizedUInt long kernelWidth, @MachineSizedUInt long kernelHeight, FloatPtr kernelWeights) { super(device, kernelWidth, kernelHeight, kernelWeights); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSImageLaplacianPyramid(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    @Method(selector = "initWithCoder:")
    public MPSImageLaplacianPyramid(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "getLaplacianBias ")
    public native float getLaplacianBias();
    @Property(selector = "setLaplacianBias:")
    public native void setLaplacianBias(float v);
    @Property(selector = "getLaplacianScale ")
    public native float getLaplacianScale();
    @Property(selector = "setLaplacianScale:")
    public native void setLaplacianScale(float v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
