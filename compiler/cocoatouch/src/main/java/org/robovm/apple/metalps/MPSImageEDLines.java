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
 * @since Available in iOS 13.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImageEDLines/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImageEDLinesPtr extends Ptr<MPSImageEDLines, MPSImageEDLinesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSImageEDLines.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSImageEDLines() {}
    protected MPSImageEDLines(Handle h, long handle) { super(h, handle); }
    protected MPSImageEDLines(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:gaussianSigma:minLineLength:maxLines:detailRatio:gradientThreshold:lineErrorThreshold:mergeLocalityThreshold:")
    public MPSImageEDLines(MTLDevice device, float gaussianSigma, short minLineLength, @MachineSizedUInt long maxLines, short detailRatio, float gradientThreshold, float lineErrorThreshold, float mergeLocalityThreshold) { super((SkipInit) null); initObject(init(device, gaussianSigma, minLineLength, maxLines, detailRatio, gradientThreshold, lineErrorThreshold, mergeLocalityThreshold)); }
    @Method(selector = "initWithCoder:device:")
    public MPSImageEDLines(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithDevice:")
    public MPSImageEDLines(MTLDevice device) { super(device); }
    @Method(selector = "initWithCoder:")
    public MPSImageEDLines(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "clipRectSource")
    public native @ByVal MTLRegion getClipRectSource();
    @Property(selector = "setClipRectSource:")
    public native void setClipRectSource(@ByVal MTLRegion v);
    @Property(selector = "gaussianSigma")
    public native float getGaussianSigma();
    @Property(selector = "minLineLength")
    public native short getMinLineLength();
    @Property(selector = "setMinLineLength:")
    public native void setMinLineLength(short v);
    @Property(selector = "maxLines")
    public native @MachineSizedUInt long getMaxLines();
    @Property(selector = "setMaxLines:")
    public native void setMaxLines(@MachineSizedUInt long v);
    @Property(selector = "detailRatio")
    public native short getDetailRatio();
    @Property(selector = "setDetailRatio:")
    public native void setDetailRatio(short v);
    @Property(selector = "gradientThreshold")
    public native float getGradientThreshold();
    @Property(selector = "setGradientThreshold:")
    public native void setGradientThreshold(float v);
    @Property(selector = "lineErrorThreshold")
    public native float getLineErrorThreshold();
    @Property(selector = "setLineErrorThreshold:")
    public native void setLineErrorThreshold(float v);
    @Property(selector = "mergeLocalityThreshold")
    public native float getMergeLocalityThreshold();
    @Property(selector = "setMergeLocalityThreshold:")
    public native void setMergeLocalityThreshold(float v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:gaussianSigma:minLineLength:maxLines:detailRatio:gradientThreshold:lineErrorThreshold:mergeLocalityThreshold:")
    protected native @Pointer long init(MTLDevice device, float gaussianSigma, short minLineLength, @MachineSizedUInt long maxLines, short detailRatio, float gradientThreshold, float lineErrorThreshold, float mergeLocalityThreshold);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceTexture:destinationTexture:endpointBuffer:endpointOffset:")
    public native void encodeToCommandBuffer(MTLCommandBuffer commandBuffer, MTLTexture source, MTLTexture dest, MTLBuffer endpointBuffer, @MachineSizedUInt long endpointOffset);
    /*</methods>*/
}
