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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNTargetedImageRequest/*</name>*/ 
    extends /*<extends>*/VNImageBasedRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNTargetedImageRequestPtr extends Ptr<VNTargetedImageRequest, VNTargetedImageRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNTargetedImageRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNTargetedImageRequest() {}
    protected VNTargetedImageRequest(Handle h, long handle) { super(h, handle); }
    protected VNTargetedImageRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTargetedCVPixelBuffer:options:")
    public VNTargetedImageRequest(CVPixelBuffer pixelBuffer, VNImageOption options) { super((SkipInit) null); initObject(init(pixelBuffer, options)); }
    @Method(selector = "initWithTargetedCVPixelBuffer:options:completionHandler:")
    public VNTargetedImageRequest(CVPixelBuffer pixelBuffer, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(pixelBuffer, options, completionHandler)); }
    @Method(selector = "initWithTargetedCVPixelBuffer:orientation:options:")
    public VNTargetedImageRequest(CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(pixelBuffer, orientation, options)); }
    @Method(selector = "initWithTargetedCVPixelBuffer:orientation:options:completionHandler:")
    public VNTargetedImageRequest(CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(pixelBuffer, orientation, options, completionHandler)); }
    @Method(selector = "initWithTargetedCGImage:options:")
    public VNTargetedImageRequest(CGImage cgImage, VNImageOption options) { super((SkipInit) null); initObject(init(cgImage, options)); }
    @Method(selector = "initWithTargetedCGImage:options:completionHandler:")
    public VNTargetedImageRequest(CGImage cgImage, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(cgImage, options, completionHandler)); }
    @Method(selector = "initWithTargetedCGImage:orientation:options:")
    public VNTargetedImageRequest(CGImage cgImage, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(cgImage, orientation, options)); }
    @Method(selector = "initWithTargetedCGImage:orientation:options:completionHandler:")
    public VNTargetedImageRequest(CGImage cgImage, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(cgImage, orientation, options, completionHandler)); }
    @Method(selector = "initWithTargetedCIImage:options:")
    public VNTargetedImageRequest(CIImage ciImage, VNImageOption options) { super((SkipInit) null); initObject(init(ciImage, options)); }
    @Method(selector = "initWithTargetedCIImage:options:completionHandler:")
    public VNTargetedImageRequest(CIImage ciImage, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(ciImage, options, completionHandler)); }
    @Method(selector = "initWithTargetedCIImage:orientation:options:")
    public VNTargetedImageRequest(CIImage ciImage, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(ciImage, orientation, options)); }
    @Method(selector = "initWithTargetedCIImage:orientation:options:completionHandler:")
    public VNTargetedImageRequest(CIImage ciImage, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(ciImage, orientation, options, completionHandler)); }
    @Method(selector = "initWithTargetedImageURL:options:")
    public VNTargetedImageRequest(NSURL imageURL, VNImageOption options) { super((SkipInit) null); initObject(init(imageURL, options)); }
    @Method(selector = "initWithTargetedImageURL:options:completionHandler:")
    public VNTargetedImageRequest(NSURL imageURL, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(imageURL, options, completionHandler)); }
    @Method(selector = "initWithTargetedImageURL:orientation:options:")
    public VNTargetedImageRequest(NSURL imageURL, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(imageURL, orientation, options)); }
    @Method(selector = "initWithTargetedImageURL:orientation:options:completionHandler:")
    public VNTargetedImageRequest(NSURL imageURL, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(imageURL, orientation, options, completionHandler)); }
    @Method(selector = "initWithTargetedImageData:options:")
    public VNTargetedImageRequest(NSData imageData, VNImageOption options) { super((SkipInit) null); initObject(init(imageData, options)); }
    @Method(selector = "initWithTargetedImageData:options:completionHandler:")
    public VNTargetedImageRequest(NSData imageData, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(imageData, options, completionHandler)); }
    @Method(selector = "initWithTargetedImageData:orientation:options:")
    public VNTargetedImageRequest(NSData imageData, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(imageData, orientation, options)); }
    @Method(selector = "initWithTargetedImageData:orientation:options:completionHandler:")
    public VNTargetedImageRequest(NSData imageData, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(imageData, orientation, options, completionHandler)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTargetedCMSampleBuffer:options:")
    public VNTargetedImageRequest(CMSampleBuffer sampleBuffer, VNImageOption options) { super((SkipInit) null); initObject(init(sampleBuffer, options)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTargetedCMSampleBuffer:options:completionHandler:")
    public VNTargetedImageRequest(CMSampleBuffer sampleBuffer, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(sampleBuffer, options, completionHandler)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTargetedCMSampleBuffer:orientation:options:")
    public VNTargetedImageRequest(CMSampleBuffer sampleBuffer, CGImagePropertyOrientation orientation, VNImageOption options) { super((SkipInit) null); initObject(init(sampleBuffer, orientation, options)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTargetedCMSampleBuffer:orientation:options:completionHandler:")
    public VNTargetedImageRequest(CMSampleBuffer sampleBuffer, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(sampleBuffer, orientation, options, completionHandler)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "supportedRevisions")
    public static native NSIndexSet getSupportedRevisions();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "defaultRevision")
    public static native @MachineSizedUInt long getDefaultRevision();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "currentRevision")
    public static native @MachineSizedUInt long getCurrentRevision();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTargetedCVPixelBuffer:options:")
    protected native @Pointer long init(CVPixelBuffer pixelBuffer, VNImageOption options);
    @Method(selector = "initWithTargetedCVPixelBuffer:options:completionHandler:")
    protected native @Pointer long init(CVPixelBuffer pixelBuffer, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    @Method(selector = "initWithTargetedCVPixelBuffer:orientation:options:")
    protected native @Pointer long init(CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, VNImageOption options);
    @Method(selector = "initWithTargetedCVPixelBuffer:orientation:options:completionHandler:")
    protected native @Pointer long init(CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    @Method(selector = "initWithTargetedCGImage:options:")
    protected native @Pointer long init(CGImage cgImage, VNImageOption options);
    @Method(selector = "initWithTargetedCGImage:options:completionHandler:")
    protected native @Pointer long init(CGImage cgImage, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    @Method(selector = "initWithTargetedCGImage:orientation:options:")
    protected native @Pointer long init(CGImage cgImage, CGImagePropertyOrientation orientation, VNImageOption options);
    @Method(selector = "initWithTargetedCGImage:orientation:options:completionHandler:")
    protected native @Pointer long init(CGImage cgImage, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    @Method(selector = "initWithTargetedCIImage:options:")
    protected native @Pointer long init(CIImage ciImage, VNImageOption options);
    @Method(selector = "initWithTargetedCIImage:options:completionHandler:")
    protected native @Pointer long init(CIImage ciImage, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    @Method(selector = "initWithTargetedCIImage:orientation:options:")
    protected native @Pointer long init(CIImage ciImage, CGImagePropertyOrientation orientation, VNImageOption options);
    @Method(selector = "initWithTargetedCIImage:orientation:options:completionHandler:")
    protected native @Pointer long init(CIImage ciImage, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    @Method(selector = "initWithTargetedImageURL:options:")
    protected native @Pointer long init(NSURL imageURL, VNImageOption options);
    @Method(selector = "initWithTargetedImageURL:options:completionHandler:")
    protected native @Pointer long init(NSURL imageURL, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    @Method(selector = "initWithTargetedImageURL:orientation:options:")
    protected native @Pointer long init(NSURL imageURL, CGImagePropertyOrientation orientation, VNImageOption options);
    @Method(selector = "initWithTargetedImageURL:orientation:options:completionHandler:")
    protected native @Pointer long init(NSURL imageURL, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    @Method(selector = "initWithTargetedImageData:options:")
    protected native @Pointer long init(NSData imageData, VNImageOption options);
    @Method(selector = "initWithTargetedImageData:options:completionHandler:")
    protected native @Pointer long init(NSData imageData, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    @Method(selector = "initWithTargetedImageData:orientation:options:")
    protected native @Pointer long init(NSData imageData, CGImagePropertyOrientation orientation, VNImageOption options);
    @Method(selector = "initWithTargetedImageData:orientation:options:completionHandler:")
    protected native @Pointer long init(NSData imageData, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTargetedCMSampleBuffer:options:")
    protected native @Pointer long init(CMSampleBuffer sampleBuffer, VNImageOption options);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTargetedCMSampleBuffer:options:completionHandler:")
    protected native @Pointer long init(CMSampleBuffer sampleBuffer, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTargetedCMSampleBuffer:orientation:options:")
    protected native @Pointer long init(CMSampleBuffer sampleBuffer, CGImagePropertyOrientation orientation, VNImageOption options);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithTargetedCMSampleBuffer:orientation:options:completionHandler:")
    protected native @Pointer long init(CMSampleBuffer sampleBuffer, CGImagePropertyOrientation orientation, VNImageOption options, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    /*</methods>*/
}
