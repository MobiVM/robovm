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
package org.robovm.apple.metalkit;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.modelio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTKTextureLoader/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTKTextureLoaderPtr extends Ptr<MTKTextureLoader, MTKTextureLoaderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTKTextureLoader.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTKTextureLoader() {}
    protected MTKTextureLoader(Handle h, long handle) { super(h, handle); }
    protected MTKTextureLoader(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:")
    public MTKTextureLoader(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "device")
    public native MTLDevice getDevice();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "newTextureWithContentsOfURL:options:completionHandler:")
    public native void newTexture(NSURL URL, MTKTextureLoaderOptions options, @Block VoidBlock2<MTLTexture, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newTextureWithName:scaleFactor:bundle:options:completionHandler:")
    public native void newTexture(String name, @MachineSizedFloat double scaleFactor, NSBundle bundle, MTKTextureLoaderOptions options, @Block VoidBlock2<MTLTexture, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newTexturesWithContentsOfURLs:options:completionHandler:")
    public native void newTexture(NSArray<NSURL> URLs, MTKTextureLoaderOptions options, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newTexturesWithNames:scaleFactor:bundle:options:completionHandler:")
    public native void newTexture(NSArray<NSString> names, @MachineSizedFloat double scaleFactor, NSBundle bundle, MTKTextureLoaderOptions options, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    @Method(selector = "newTextureWithData:options:completionHandler:")
    public native void newTexture(NSData data, MTKTextureLoaderOptions options, @Block VoidBlock2<MTLTexture, NSError> completionHandler);
    @Method(selector = "newTextureWithCGImage:options:completionHandler:")
    public native void newTexture(CGImage cgImage, MTKTextureLoaderOptions options, @Block VoidBlock2<MTLTexture, NSError> completionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newTextureWithMDLTexture:options:completionHandler:")
    public native void newTexture(MDLTexture texture, MTKTextureLoaderOptions options, @Block VoidBlock2<MTLTexture, NSError> completionHandler);
    public MTLTexture newTexture(NSURL URL, MTKTextureLoaderOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLTexture result = newTexture(URL, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "newTextureWithContentsOfURL:options:error:")
    private native MTLTexture newTexture(NSURL URL, MTKTextureLoaderOptions options, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public NSArray<?> newTextures(NSArray<NSURL> URLs, MTKTextureLoaderOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSArray<?> result = newTextures(URLs, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newTexturesWithContentsOfURLs:options:error:")
    private native NSArray<?> newTextures(NSArray<NSURL> URLs, MTKTextureLoaderOptions options, NSError.NSErrorPtr error);
    public MTLTexture newTexture(NSData data, MTKTextureLoaderOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLTexture result = newTexture(data, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "newTextureWithData:options:error:")
    private native MTLTexture newTexture(NSData data, MTKTextureLoaderOptions options, NSError.NSErrorPtr error);
    public MTLTexture newTexture(CGImage cgImage, MTKTextureLoaderOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLTexture result = newTexture(cgImage, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "newTextureWithCGImage:options:error:")
    private native MTLTexture newTexture(CGImage cgImage, MTKTextureLoaderOptions options, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public MTLTexture newTexture(MDLTexture texture, MTKTextureLoaderOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLTexture result = newTexture(texture, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newTextureWithMDLTexture:options:error:")
    private native MTLTexture newTexture(MDLTexture texture, MTKTextureLoaderOptions options, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public MTLTexture newTexture(String name, @MachineSizedFloat double scaleFactor, NSBundle bundle, MTKTextureLoaderOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MTLTexture result = newTexture(name, scaleFactor, bundle, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "newTextureWithName:scaleFactor:bundle:options:error:")
    private native MTLTexture newTexture(String name, @MachineSizedFloat double scaleFactor, NSBundle bundle, MTKTextureLoaderOptions options, NSError.NSErrorPtr error);
    /*</methods>*/
}
