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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImageCanny/*</name>*/ 
    extends /*<extends>*/MPSUnaryImageKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImageCannyPtr extends Ptr<MPSImageCanny, MPSImageCannyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSImageCanny.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSImageCanny() {}
    protected MPSImageCanny(Handle h, long handle) { super(h, handle); }
    protected MPSImageCanny(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MPSImageCanny(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    @Method(selector = "initWithDevice:linearToGrayScaleTransform:sigma:")
    public MPSImageCanny(MTLDevice device, FloatPtr transform, float sigma) { super((SkipInit) null); initObject(init(device, transform, sigma)); }
    @Method(selector = "initWithCoder:device:")
    public MPSImageCanny(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSImageCanny(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "colorTransform")
    public native FloatPtr getColorTransform();
    @Property(selector = "sigma")
    public native float getSigma();
    @Property(selector = "highThreshold")
    public native float getHighThreshold();
    @Property(selector = "setHighThreshold:")
    public native void setHighThreshold(float v);
    @Property(selector = "lowThreshold")
    public native float getLowThreshold();
    @Property(selector = "setLowThreshold:")
    public native void setLowThreshold(float v);
    @Property(selector = "useFastMode")
    public native boolean isUseFastMode();
    @Property(selector = "setUseFastMode:")
    public native void setUseFastMode(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "initWithDevice:linearToGrayScaleTransform:sigma:")
    protected native @Pointer long init(MTLDevice device, FloatPtr transform, float sigma);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    /*</methods>*/
}
