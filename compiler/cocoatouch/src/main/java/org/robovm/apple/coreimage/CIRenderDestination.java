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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIRenderDestination/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIRenderDestinationPtr extends Ptr<CIRenderDestination, CIRenderDestinationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIRenderDestination.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIRenderDestination() {}
    protected CIRenderDestination(Handle h, long handle) { super(h, handle); }
    protected CIRenderDestination(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPixelBuffer:")
    public CIRenderDestination(CVPixelBuffer pixelBuffer) { super((SkipInit) null); initObject(init(pixelBuffer)); }
    @Method(selector = "initWithIOSurface:")
    public CIRenderDestination(IOSurface surface) { super((SkipInit) null); initObject(init(surface)); }
    @Method(selector = "initWithMTLTexture:commandBuffer:")
    public CIRenderDestination(MTLTexture texture, MTLCommandBuffer commandBuffer) { super((SkipInit) null); initObject(init(texture, commandBuffer)); }
    @Method(selector = "initWithWidth:height:pixelFormat:commandBuffer:mtlTextureProvider:")
    public CIRenderDestination(@MachineSizedUInt long width, @MachineSizedUInt long height, MTLPixelFormat pixelFormat, MTLCommandBuffer commandBuffer, @Block Block0<MTLTexture> block) { super((SkipInit) null); initObject(init(width, height, pixelFormat, commandBuffer, block)); }
    @Method(selector = "initWithGLTexture:target:width:height:")
    public CIRenderDestination(int texture, int target, @MachineSizedUInt long width, @MachineSizedUInt long height) { super((SkipInit) null); initObject(init(texture, target, width, height)); }
    @Method(selector = "initWithBitmapData:width:height:bytesPerRow:format:")
    public CIRenderDestination(VoidPtr data, @MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bytesPerRow, int format) { super((SkipInit) null); initObject(init(data, width, height, bytesPerRow, format)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "width")
    public native @MachineSizedUInt long getWidth();
    @Property(selector = "height")
    public native @MachineSizedUInt long getHeight();
    @Property(selector = "alphaMode")
    public native CIRenderDestinationAlphaMode getAlphaMode();
    @Property(selector = "setAlphaMode:")
    public native void setAlphaMode(CIRenderDestinationAlphaMode v);
    @Property(selector = "isFlipped")
    public native boolean isFlipped();
    @Property(selector = "setFlipped:")
    public native void setFlipped(boolean v);
    @Property(selector = "isDithered")
    public native boolean isDithered();
    @Property(selector = "setDithered:")
    public native void setDithered(boolean v);
    @Property(selector = "isClamped")
    public native boolean isClamped();
    @Property(selector = "setClamped:")
    public native void setClamped(boolean v);
    @Property(selector = "colorSpace")
    public native CGColorSpace getColorSpace();
    @Property(selector = "setColorSpace:")
    public native void setColorSpace(CGColorSpace v);
    @Property(selector = "blendKernel")
    public native CIBlendKernel getBlendKernel();
    @Property(selector = "setBlendKernel:")
    public native void setBlendKernel(CIBlendKernel v);
    @Property(selector = "blendsInDestinationColorSpace")
    public native boolean isBlendsInDestinationColorSpace();
    @Property(selector = "setBlendsInDestinationColorSpace:")
    public native void setBlendsInDestinationColorSpace(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPixelBuffer:")
    protected native @Pointer long init(CVPixelBuffer pixelBuffer);
    @Method(selector = "initWithIOSurface:")
    protected native @Pointer long init(IOSurface surface);
    @Method(selector = "initWithMTLTexture:commandBuffer:")
    protected native @Pointer long init(MTLTexture texture, MTLCommandBuffer commandBuffer);
    @Method(selector = "initWithWidth:height:pixelFormat:commandBuffer:mtlTextureProvider:")
    protected native @Pointer long init(@MachineSizedUInt long width, @MachineSizedUInt long height, MTLPixelFormat pixelFormat, MTLCommandBuffer commandBuffer, @Block Block0<MTLTexture> block);
    @Method(selector = "initWithGLTexture:target:width:height:")
    protected native @Pointer long init(int texture, int target, @MachineSizedUInt long width, @MachineSizedUInt long height);
    @Method(selector = "initWithBitmapData:width:height:bytesPerRow:format:")
    protected native @Pointer long init(VoidPtr data, @MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long bytesPerRow, int format);
    /*</methods>*/
}
