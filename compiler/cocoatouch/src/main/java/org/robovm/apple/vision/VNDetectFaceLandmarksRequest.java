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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNDetectFaceLandmarksRequest/*</name>*/ 
    extends /*<extends>*/VNImageBasedRequest/*</extends>*/ 
    /*<implements>*/implements VNFaceObservationAccepting/*</implements>*/ {

    /*<ptr>*/public static class VNDetectFaceLandmarksRequestPtr extends Ptr<VNDetectFaceLandmarksRequest, VNDetectFaceLandmarksRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNDetectFaceLandmarksRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNDetectFaceLandmarksRequest() {}
    protected VNDetectFaceLandmarksRequest(Handle h, long handle) { super(h, handle); }
    protected VNDetectFaceLandmarksRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCompletionHandler:")
    public VNDetectFaceLandmarksRequest(@Block VoidBlock2<VNRequest, NSError> completionHandler) { super(completionHandler); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputFaceObservations")
    public native NSArray<VNFaceObservation> getInputFaceObservations();
    @Property(selector = "setInputFaceObservations:")
    public native void setInputFaceObservations(NSArray<VNFaceObservation> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="VNDetectFaceLandmarksRequestRevision1", optional=true)
    public static native @MachineSizedUInt long getRevision1();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="VNDetectFaceLandmarksRequestRevision2", optional=true)
    public static native @MachineSizedUInt long getRevision2();
    
    
    /*</methods>*/
}
