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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNTranslationalImageRegistrationRequest/*</name>*/ 
    extends /*<extends>*/VNImageRegistrationRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNTranslationalImageRegistrationRequestPtr extends Ptr<VNTranslationalImageRegistrationRequest, VNTranslationalImageRegistrationRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNTranslationalImageRegistrationRequest.class); }/*</bind>*/
    /*<constants>*/
    public static final int Revision1 = 1;
    /*</constants>*/
    /*<constructors>*/
    protected VNTranslationalImageRegistrationRequest() {}
    protected VNTranslationalImageRegistrationRequest(Handle h, long handle) { super(h, handle); }
    protected VNTranslationalImageRegistrationRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTargetedCVPixelBuffer:options:")
    public VNTranslationalImageRegistrationRequest(CVPixelBuffer pixelBuffer, NSDictionary<?, ?> options) { super(pixelBuffer, options); }
    @Method(selector = "initWithTargetedCVPixelBuffer:options:completionHandler:")
    public VNTranslationalImageRegistrationRequest(CVPixelBuffer pixelBuffer, NSDictionary<?, ?> options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(pixelBuffer, options, completionHandler); }
    @Method(selector = "initWithTargetedCVPixelBuffer:orientation:options:")
    public VNTranslationalImageRegistrationRequest(CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, NSDictionary<?, ?> options) { super(pixelBuffer, orientation, options); }
    @Method(selector = "initWithTargetedCVPixelBuffer:orientation:options:completionHandler:")
    public VNTranslationalImageRegistrationRequest(CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, NSDictionary<?, ?> options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(pixelBuffer, orientation, options, completionHandler); }
    @Method(selector = "initWithTargetedCGImage:options:")
    public VNTranslationalImageRegistrationRequest(CGImage cgImage, NSDictionary<?, ?> options) { super(cgImage, options); }
    @Method(selector = "initWithTargetedCGImage:options:completionHandler:")
    public VNTranslationalImageRegistrationRequest(CGImage cgImage, NSDictionary<?, ?> options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(cgImage, options, completionHandler); }
    @Method(selector = "initWithTargetedCGImage:orientation:options:")
    public VNTranslationalImageRegistrationRequest(CGImage cgImage, CGImagePropertyOrientation orientation, NSDictionary<?, ?> options) { super(cgImage, orientation, options); }
    @Method(selector = "initWithTargetedCGImage:orientation:options:completionHandler:")
    public VNTranslationalImageRegistrationRequest(CGImage cgImage, CGImagePropertyOrientation orientation, NSDictionary<?, ?> options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(cgImage, orientation, options, completionHandler); }
    @Method(selector = "initWithTargetedCIImage:options:")
    public VNTranslationalImageRegistrationRequest(CIImage ciImage, NSDictionary<?, ?> options) { super(ciImage, options); }
    @Method(selector = "initWithTargetedCIImage:options:completionHandler:")
    public VNTranslationalImageRegistrationRequest(CIImage ciImage, NSDictionary<?, ?> options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(ciImage, options, completionHandler); }
    @Method(selector = "initWithTargetedCIImage:orientation:options:")
    public VNTranslationalImageRegistrationRequest(CIImage ciImage, CGImagePropertyOrientation orientation, NSDictionary<?, ?> options) { super(ciImage, orientation, options); }
    @Method(selector = "initWithTargetedCIImage:orientation:options:completionHandler:")
    public VNTranslationalImageRegistrationRequest(CIImage ciImage, CGImagePropertyOrientation orientation, NSDictionary<?, ?> options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(ciImage, orientation, options, completionHandler); }
    @Method(selector = "initWithTargetedImageURL:options:")
    public VNTranslationalImageRegistrationRequest(NSURL imageURL, NSDictionary<?, ?> options) { super(imageURL, options); }
    @Method(selector = "initWithTargetedImageURL:options:completionHandler:")
    public VNTranslationalImageRegistrationRequest(NSURL imageURL, NSDictionary<?, ?> options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(imageURL, options, completionHandler); }
    @Method(selector = "initWithTargetedImageURL:orientation:options:")
    public VNTranslationalImageRegistrationRequest(NSURL imageURL, CGImagePropertyOrientation orientation, NSDictionary<?, ?> options) { super(imageURL, orientation, options); }
    @Method(selector = "initWithTargetedImageURL:orientation:options:completionHandler:")
    public VNTranslationalImageRegistrationRequest(NSURL imageURL, CGImagePropertyOrientation orientation, NSDictionary<?, ?> options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(imageURL, orientation, options, completionHandler); }
    @Method(selector = "initWithTargetedImageData:options:")
    public VNTranslationalImageRegistrationRequest(NSData imageData, NSDictionary<?, ?> options) { super(imageData, options); }
    @Method(selector = "initWithTargetedImageData:options:completionHandler:")
    public VNTranslationalImageRegistrationRequest(NSData imageData, NSDictionary<?, ?> options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(imageData, options, completionHandler); }
    @Method(selector = "initWithTargetedImageData:orientation:options:")
    public VNTranslationalImageRegistrationRequest(NSData imageData, CGImagePropertyOrientation orientation, NSDictionary<?, ?> options) { super(imageData, orientation, options); }
    @Method(selector = "initWithTargetedImageData:orientation:options:completionHandler:")
    public VNTranslationalImageRegistrationRequest(NSData imageData, CGImagePropertyOrientation orientation, NSDictionary<?, ?> options, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(imageData, orientation, options, completionHandler); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
