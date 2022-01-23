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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNHumanHandPoseObservation/*</name>*/ 
    extends /*<extends>*/VNRecognizedPointsObservation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNHumanHandPoseObservationPtr extends Ptr<VNHumanHandPoseObservation, VNHumanHandPoseObservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNHumanHandPoseObservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNHumanHandPoseObservation() {}
    protected VNHumanHandPoseObservation(Handle h, long handle) { super(h, handle); }
    protected VNHumanHandPoseObservation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "availableJointNames")
    public native NSArray<NSString> getAvailableJointNames();
    @Property(selector = "availableJointsGroupNames")
    public native NSArray<NSString> getAvailableJointsGroupNames();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "chirality")
    public native VNChirality getChirality();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public VNRecognizedPoint recognizedPoint(VNHumanHandPoseObservationJointName jointName) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       VNRecognizedPoint result = recognizedPoint(jointName, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "recognizedPointForJointName:error:")
    private native VNRecognizedPoint recognizedPoint(VNHumanHandPoseObservationJointName jointName, NSError.NSErrorPtr error);
    public NSDictionary<NSString, VNRecognizedPoint> recognizedPoints(VNHumanHandPoseObservationJointsGroupName jointsGroupName) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSDictionary<NSString, VNRecognizedPoint> result = recognizedPoints(jointsGroupName, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "recognizedPointsForJointsGroupName:error:")
    private native NSDictionary<NSString, VNRecognizedPoint> recognizedPoints(VNHumanHandPoseObservationJointsGroupName jointsGroupName, NSError.NSErrorPtr error);
    /*</methods>*/
}
