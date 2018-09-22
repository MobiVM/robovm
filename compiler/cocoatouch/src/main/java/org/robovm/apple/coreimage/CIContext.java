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
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIContextPtr extends Ptr<CIContext, CIContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CIContext(Handle h, long handle) { super(h, handle); }
    protected CIContext(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public CIContext(CGContext cgctx, CIContextOptions options) { super((Handle) null, create(cgctx, options)); retain(getHandle()); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public CIContext(CIContextOptions options) { super((Handle) null, create(options)); retain(getHandle()); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public CIContext() { super((Handle) null, create()); retain(getHandle()); }
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 12.0. Core Image OpenGLES API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    public CIContext(EAGLContext eaglContext) { super((Handle) null, create(eaglContext)); retain(getHandle()); }
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 12.0. Core Image OpenGLES API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    public CIContext(EAGLContext eaglContext, CIContextOptions options) { super((Handle) null, create(eaglContext, options)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public CIContext(MTLDevice device) { super((Handle) null, create(device)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public CIContext(MTLDevice device, CIContextOptions options) { super((Handle) null, create(device, options)); retain(getHandle()); }
    /*</constructors>*/
    
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "workingColorSpace")
    public native CGColorSpace getWorkingColorSpace();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "workingFormat")
    public native int getWorkingFormat();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "drawImage:inRect:fromRect:")
    public native void drawImage(CIImage image, @ByVal CGRect inRect, @ByVal CGRect fromRect);
    @WeaklyLinked
    @Method(selector = "createCGImage:fromRect:")
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGImage createCGImage(CIImage image, @ByVal CGRect fromRect);
    @WeaklyLinked
    @Method(selector = "createCGImage:fromRect:format:colorSpace:")
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGImage createCGImage(CIImage image, @ByVal CGRect fromRect, int format, CGColorSpace colorSpace);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @WeaklyLinked
    @Method(selector = "createCGImage:fromRect:format:colorSpace:deferred:")
    public native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGImage createCGImage(CIImage image, @ByVal CGRect fromRect, int format, CGColorSpace colorSpace, boolean deferred);
    @WeaklyLinked
    @Method(selector = "render:toBitmap:rowBytes:bounds:format:colorSpace:")
    public native void render(CIImage image, VoidPtr data, @MachineSizedSInt long rowBytes, @ByVal CGRect bounds, int format, CGColorSpace colorSpace);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    @Method(selector = "render:toIOSurface:bounds:colorSpace:")
    public native void render(CIImage image, IOSurface surface, @ByVal CGRect bounds, CGColorSpace colorSpace);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    @Method(selector = "render:toCVPixelBuffer:")
    public native void render(CIImage image, CVPixelBuffer buffer);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    @Method(selector = "render:toCVPixelBuffer:bounds:colorSpace:")
    public native void render(CIImage image, CVPixelBuffer buffer, @ByVal CGRect bounds, CGColorSpace colorSpace);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @WeaklyLinked
    @Method(selector = "render:toMTLTexture:commandBuffer:bounds:colorSpace:")
    public native void render(CIImage image, MTLTexture texture, MTLCommandBuffer commandBuffer, @ByVal CGRect bounds, CGColorSpace colorSpace);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "clearCaches")
    public native void clearCaches();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "inputImageMaximumSize")
    public native @ByVal CGSize getInputImageMaximumSize();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "outputImageMaximumSize")
    public native @ByVal CGSize getOutputImageMaximumSize();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "contextWithCGContext:options:")
    protected static native @Pointer long create(CGContext cgctx, CIContextOptions options);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "contextWithOptions:")
    protected static native @Pointer long create(CIContextOptions options);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "context")
    protected static native @Pointer long create();
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 12.0. Core Image OpenGLES API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Method(selector = "contextWithEAGLContext:")
    protected static native @Pointer long create(EAGLContext eaglContext);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 12.0. Core Image OpenGLES API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Method(selector = "contextWithEAGLContext:options:")
    protected static native @Pointer long create(EAGLContext eaglContext, CIContextOptions options);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "contextWithMTLDevice:")
    protected static native @Pointer long create(MTLDevice device);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "contextWithMTLDevice:options:")
    protected static native @Pointer long create(MTLDevice device, CIContextOptions options);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "TIFFRepresentationOfImage:format:colorSpace:options:")
    public native NSData tiffRepresentationOfImage(CIImage image, int format, CGColorSpace colorSpace, CIImageRepresentationOptions options);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "JPEGRepresentationOfImage:colorSpace:options:")
    public native NSData jpegRepresentationOfImage(CIImage image, CGColorSpace colorSpace, CIImageRepresentationOptions options);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "HEIFRepresentationOfImage:format:colorSpace:options:")
    public native NSData HEIFRepresentationOfImage(CIImage image, int format, CGColorSpace colorSpace, CIImageRepresentationOptions options);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "PNGRepresentationOfImage:format:colorSpace:options:")
    public native NSData PNGRepresentationOfImage(CIImage image, int format, CGColorSpace colorSpace, CIImageRepresentationOptions options);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "writeTIFFRepresentationOfImage:toURL:format:colorSpace:options:error:")
    public native boolean writeTIFFRepresentationOfImage(CIImage image, NSURL url, int format, CGColorSpace colorSpace, CIImageRepresentationOptions options, NSError.NSErrorPtr errorPtr);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "writePNGRepresentationOfImage:toURL:format:colorSpace:options:error:")
    public native boolean writePNGRepresentationOfImage(CIImage image, NSURL url, int format, CGColorSpace colorSpace, CIImageRepresentationOptions options, NSError.NSErrorPtr errorPtr);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "writeJPEGRepresentationOfImage:toURL:colorSpace:options:error:")
    public native boolean writeJPEGRepresentationOfImage(CIImage image, NSURL url, CGColorSpace colorSpace, CIImageRepresentationOptions options, NSError.NSErrorPtr errorPtr);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "writeHEIFRepresentationOfImage:toURL:format:colorSpace:options:error:")
    public native boolean writeHEIFRepresentationOfImage(CIImage image, NSURL url, int format, CGColorSpace colorSpace, CIImageRepresentationOptions options, NSError.NSErrorPtr errorPtr);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "depthBlurEffectFilterForImageURL:options:")
    public native CIFilter depthBlurEffectFilter(NSURL url, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "depthBlurEffectFilterForImageData:options:")
    public native CIFilter depthBlurEffectFilter(NSData data, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "depthBlurEffectFilterForImage:disparityImage:portraitEffectsMatte:orientation:options:")
    public native CIFilter depthBlurEffectFilter(CIImage image, CIImage disparityImage, CIImage portraitEffectsMatte, CGImagePropertyOrientation orientation, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "startTaskToRender:fromRect:toDestination:atPoint:error:")
    public native CIRenderTask startTaskToRender(CIImage image, @ByVal CGRect fromRect, CIRenderDestination destination, @ByVal CGPoint atPoint, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "startTaskToRender:toDestination:error:")
    public native CIRenderTask startTaskToRender(CIImage image, CIRenderDestination destination, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "prepareRender:fromRect:toDestination:atPoint:error:")
    public native boolean prepareRender(CIImage image, @ByVal CGRect fromRect, CIRenderDestination destination, @ByVal CGPoint atPoint, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "startTaskToClear:error:")
    public native CIRenderTask startTaskToClear(CIRenderDestination destination, NSError.NSErrorPtr error);
    /*</methods>*/
}
