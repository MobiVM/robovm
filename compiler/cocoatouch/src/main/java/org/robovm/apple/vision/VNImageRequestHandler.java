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
package org.robovm.apple.vision;

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
import org.robovm.apple.coreml.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNImageRequestHandler/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNImageRequestHandlerPtr extends Ptr<VNImageRequestHandler, VNImageRequestHandlerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNImageRequestHandler.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNImageRequestHandler() {}
    protected VNImageRequestHandler(Handle h, long handle) { super(h, handle); }
    protected VNImageRequestHandler(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCVPixelBuffer:options:")
    public VNImageRequestHandler(CVPixelBuffer pixelBuffer, VNImageOption options) { super((SkipInit) null); initObject(init(pixelBuffer, options)); }
    @Method(selector = "initWithCVPixelBuffer:orientation:options:")
    public VNImageRequestHandler(CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(pixelBuffer, orientation, options)); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithCVPixelBuffer:depthData:orientation:options:")
    public VNImageRequestHandler(CVPixelBuffer pixelBuffer, org.robovm.apple.avfoundation.AVDepthData depthData, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(pixelBuffer, depthData, orientation, options)); }
    @Method(selector = "initWithCGImage:options:")
    public VNImageRequestHandler(CGImage image, VNImageOption options) { super((SkipInit) null); initObject(init(image, options)); }
    @Method(selector = "initWithCGImage:orientation:options:")
    public VNImageRequestHandler(CGImage image, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(image, orientation, options)); }
    @Method(selector = "initWithCIImage:options:")
    public VNImageRequestHandler(CIImage image, VNImageOption options) { super((SkipInit) null); initObject(init(image, options)); }
    @Method(selector = "initWithCIImage:orientation:options:")
    public VNImageRequestHandler(CIImage image, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(image, orientation, options)); }
    @Method(selector = "initWithURL:options:")
    public VNImageRequestHandler(NSURL imageURL, VNImageOption options) { super((SkipInit) null); initObject(init(imageURL, options)); }
    @Method(selector = "initWithURL:orientation:options:")
    public VNImageRequestHandler(NSURL imageURL, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(imageURL, orientation, options)); }
    @Method(selector = "initWithData:options:")
    public VNImageRequestHandler(NSData imageData, VNImageOption options) { super((SkipInit) null); initObject(init(imageData, options)); }
    @Method(selector = "initWithData:orientation:options:")
    public VNImageRequestHandler(NSData imageData, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(imageData, orientation, options)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithCMSampleBuffer:options:")
    public VNImageRequestHandler(CMSampleBuffer sampleBuffer, VNImageOption options) { super((SkipInit) null); initObject(init(sampleBuffer, options)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithCMSampleBuffer:orientation:options:")
    public VNImageRequestHandler(CMSampleBuffer sampleBuffer, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(sampleBuffer, orientation, options)); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithCMSampleBuffer:depthData:orientation:options:")
    public VNImageRequestHandler(CMSampleBuffer sampleBuffer, org.robovm.apple.avfoundation.AVDepthData depthData, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(sampleBuffer, depthData, orientation, options)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCVPixelBuffer:options:")
    protected native @Pointer long init(CVPixelBuffer pixelBuffer, VNImageOption options);
    @Method(selector = "initWithCVPixelBuffer:orientation:options:")
    protected native @Pointer long init(CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, VNImageOption options);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithCVPixelBuffer:depthData:orientation:options:")
    protected native @Pointer long init(CVPixelBuffer pixelBuffer, org.robovm.apple.avfoundation.AVDepthData depthData, CGImagePropertyOrientation orientation, VNImageOption options);
    @Method(selector = "initWithCGImage:options:")
    protected native @Pointer long init(CGImage image, VNImageOption options);
    @Method(selector = "initWithCGImage:orientation:options:")
    protected native @Pointer long init(CGImage image, CGImagePropertyOrientation orientation, VNImageOption options);
    @Method(selector = "initWithCIImage:options:")
    protected native @Pointer long init(CIImage image, VNImageOption options);
    @Method(selector = "initWithCIImage:orientation:options:")
    protected native @Pointer long init(CIImage image, CGImagePropertyOrientation orientation, VNImageOption options);
    @Method(selector = "initWithURL:options:")
    protected native @Pointer long init(NSURL imageURL, VNImageOption options);
    @Method(selector = "initWithURL:orientation:options:")
    protected native @Pointer long init(NSURL imageURL, CGImagePropertyOrientation orientation, VNImageOption options);
    @Method(selector = "initWithData:options:")
    protected native @Pointer long init(NSData imageData, VNImageOption options);
    @Method(selector = "initWithData:orientation:options:")
    protected native @Pointer long init(NSData imageData, CGImagePropertyOrientation orientation, VNImageOption options);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithCMSampleBuffer:options:")
    protected native @Pointer long init(CMSampleBuffer sampleBuffer, VNImageOption options);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithCMSampleBuffer:orientation:options:")
    protected native @Pointer long init(CMSampleBuffer sampleBuffer, CGImagePropertyOrientation orientation, VNImageOption options);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithCMSampleBuffer:depthData:orientation:options:")
    protected native @Pointer long init(CMSampleBuffer sampleBuffer, org.robovm.apple.avfoundation.AVDepthData depthData, CGImagePropertyOrientation orientation, VNImageOption options);
    public boolean performRequests(NSArray<VNRequest> requests) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performRequests(requests, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performRequests:error:")
    private native boolean performRequests(NSArray<VNRequest> requests, NSError.NSErrorPtr error);
    /*</methods>*/
}
