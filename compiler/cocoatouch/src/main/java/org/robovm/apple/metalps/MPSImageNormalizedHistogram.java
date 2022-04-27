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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImageNormalizedHistogram/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImageNormalizedHistogramPtr extends Ptr<MPSImageNormalizedHistogram, MPSImageNormalizedHistogramPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSImageNormalizedHistogram.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSImageNormalizedHistogram() {}
    protected MPSImageNormalizedHistogram(Handle h, long handle) { super(h, handle); }
    protected MPSImageNormalizedHistogram(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:histogramInfo:")
    public MPSImageNormalizedHistogram(MTLDevice device, MPSImageHistogramInfo histogramInfo) { super((SkipInit) null); initObject(init(device, histogramInfo)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSImageNormalizedHistogram(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithDevice:")
    public MPSImageNormalizedHistogram(MTLDevice device) { super(device); }
    @Method(selector = "initWithCoder:")
    public MPSImageNormalizedHistogram(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "clipRectSource")
    public native @ByVal MTLRegion getClipRectSource();
    @Property(selector = "setClipRectSource:")
    public native void setClipRectSource(@ByVal MTLRegion v);
    @Property(selector = "zeroHistogram")
    public native boolean isZeroHistogram();
    @Property(selector = "setZeroHistogram:")
    public native void setZeroHistogram(boolean v);
    @Property(selector = "histogramInfo")
    public native @ByVal MPSImageHistogramInfo getHistogramInfo();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:histogramInfo:")
    protected native @Pointer long init(MTLDevice device, MPSImageHistogramInfo histogramInfo);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceTexture:minmaxTexture:histogram:histogramOffset:")
    public native void encode(MTLCommandBuffer commandBuffer, MTLTexture source, MTLTexture minmaxTexture, MTLBuffer histogram, @MachineSizedUInt long histogramOffset);
    @Method(selector = "histogramSizeForSourceFormat:")
    public native @MachineSizedUInt long histogramSizeForSourceFormat(MTLPixelFormat sourceFormat);
    /*</methods>*/
}
