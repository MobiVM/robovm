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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNSequenceRequestHandler/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNSequenceRequestHandlerPtr extends Ptr<VNSequenceRequestHandler, VNSequenceRequestHandlerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNSequenceRequestHandler.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNSequenceRequestHandler() {}
    protected VNSequenceRequestHandler(Handle h, long handle) { super(h, handle); }
    protected VNSequenceRequestHandler(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean performRequests(NSArray<VNRequest> requests, CVPixelBuffer pixelBuffer) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performRequests(requests, pixelBuffer, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performRequests:onCVPixelBuffer:error:")
    private native boolean performRequests(NSArray<VNRequest> requests, CVPixelBuffer pixelBuffer, NSError.NSErrorPtr error);
    public boolean performRequests(NSArray<VNRequest> requests, CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performRequests(requests, pixelBuffer, orientation, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performRequests:onCVPixelBuffer:orientation:error:")
    private native boolean performRequests(NSArray<VNRequest> requests, CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, NSError.NSErrorPtr error);
    public boolean performRequests(NSArray<VNRequest> requests, CGImage image) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performRequests(requests, image, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performRequests:onCGImage:error:")
    private native boolean performRequests(NSArray<VNRequest> requests, CGImage image, NSError.NSErrorPtr error);
    public boolean performRequests(NSArray<VNRequest> requests, CGImage image, CGImagePropertyOrientation orientation) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performRequests(requests, image, orientation, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performRequests:onCGImage:orientation:error:")
    private native boolean performRequests(NSArray<VNRequest> requests, CGImage image, CGImagePropertyOrientation orientation, NSError.NSErrorPtr error);
    public boolean performRequests(NSArray<VNRequest> requests, CIImage image) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performRequests(requests, image, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performRequests:onCIImage:error:")
    private native boolean performRequests(NSArray<VNRequest> requests, CIImage image, NSError.NSErrorPtr error);
    public boolean performRequests(NSArray<VNRequest> requests, CIImage image, CGImagePropertyOrientation orientation) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performRequests(requests, image, orientation, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performRequests:onCIImage:orientation:error:")
    private native boolean performRequests(NSArray<VNRequest> requests, CIImage image, CGImagePropertyOrientation orientation, NSError.NSErrorPtr error);
    public boolean performRequests(NSArray<VNRequest> requests, NSURL imageURL) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performRequests(requests, imageURL, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performRequests:onImageURL:error:")
    private native boolean performRequests(NSArray<VNRequest> requests, NSURL imageURL, NSError.NSErrorPtr error);
    public boolean performRequests(NSArray<VNRequest> requests, NSURL imageURL, CGImagePropertyOrientation orientation) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performRequests(requests, imageURL, orientation, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performRequests:onImageURL:orientation:error:")
    private native boolean performRequests(NSArray<VNRequest> requests, NSURL imageURL, CGImagePropertyOrientation orientation, NSError.NSErrorPtr error);
    public boolean performRequests(NSArray<VNRequest> requests, NSData imageData) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performRequests(requests, imageData, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performRequests:onImageData:error:")
    private native boolean performRequests(NSArray<VNRequest> requests, NSData imageData, NSError.NSErrorPtr error);
    public boolean performRequests(NSArray<VNRequest> requests, NSData imageData, CGImagePropertyOrientation orientation) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performRequests(requests, imageData, orientation, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performRequests:onImageData:orientation:error:")
    private native boolean performRequests(NSArray<VNRequest> requests, NSData imageData, CGImagePropertyOrientation orientation, NSError.NSErrorPtr error);
    /*</methods>*/
}
