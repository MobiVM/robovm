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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNAnimalBodyPoseObservation/*</name>*/ 
    extends /*<extends>*/VNRecognizedPointsObservation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNAnimalBodyPoseObservationPtr extends Ptr<VNAnimalBodyPoseObservation, VNAnimalBodyPoseObservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNAnimalBodyPoseObservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNAnimalBodyPoseObservation() {}
    protected VNAnimalBodyPoseObservation(Handle h, long handle) { super(h, handle); }
    protected VNAnimalBodyPoseObservation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "availableJointNames")
    public native NSArray<NSString> getAvailableJointNames();
    @Property(selector = "availableJointGroupNames")
    public native NSArray<NSString> getAvailableJointGroupNames();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "recognizedPointForJointName:error:")
    public native VNRecognizedPoint getRecognizedPoint(VNAnimalBodyPoseObservationJointName jointName, NSError.NSErrorPtr error);
    @Method(selector = "recognizedPointsForJointsGroupName:error:")
    public native NSDictionary<NSString, VNRecognizedPoint> getRecognizedPoints(VNAnimalBodyPoseObservationJointsGroupName jointsGroupName, NSError.NSErrorPtr error);
    /*</methods>*/
}
