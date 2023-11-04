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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNInstanceMaskObservation/*</name>*/ 
    extends /*<extends>*/VNObservation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNInstanceMaskObservationPtr extends Ptr<VNInstanceMaskObservation, VNInstanceMaskObservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNInstanceMaskObservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNInstanceMaskObservation() {}
    protected VNInstanceMaskObservation(Handle h, long handle) { super(h, handle); }
    protected VNInstanceMaskObservation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "instanceMask")
    public native CVPixelBuffer getInstanceMask();
    @Property(selector = "allInstances")
    public native NSIndexSet getAllInstances();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public CVPixelBuffer generateMaskForInstances(NSIndexSet instances) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       CVPixelBuffer result = generateMaskForInstances(instances, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "generateMaskForInstances:error:")
    private native CVPixelBuffer generateMaskForInstances(NSIndexSet instances, NSError.NSErrorPtr error);
    public CVPixelBuffer generateMaskedImageOfInstances(NSIndexSet instances, VNImageRequestHandler requestHandler, boolean cropResult) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       CVPixelBuffer result = generateMaskedImageOfInstances(instances, requestHandler, cropResult, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "generateMaskedImageOfInstances:fromRequestHandler:croppedToInstancesExtent:error:")
    private native CVPixelBuffer generateMaskedImageOfInstances(NSIndexSet instances, VNImageRequestHandler requestHandler, boolean cropResult, NSError.NSErrorPtr error);
    public CVPixelBuffer generateScaledMaskForImageForInstances(NSIndexSet instances, VNImageRequestHandler requestHandler) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       CVPixelBuffer result = generateScaledMaskForImageForInstances(instances, requestHandler, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "generateScaledMaskForImageForInstances:fromRequestHandler:error:")
    private native CVPixelBuffer generateScaledMaskForImageForInstances(NSIndexSet instances, VNImageRequestHandler requestHandler, NSError.NSErrorPtr error);
    /*</methods>*/
}
