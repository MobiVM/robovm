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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNHumanBodyPose3DObservation/*</name>*/ 
    extends /*<extends>*/VNRecognizedPoints3DObservation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNHumanBodyPose3DObservationPtr extends Ptr<VNHumanBodyPose3DObservation, VNHumanBodyPose3DObservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNHumanBodyPose3DObservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNHumanBodyPose3DObservation() {}
    protected VNHumanBodyPose3DObservation(Handle h, long handle) { super(h, handle); }
    protected VNHumanBodyPose3DObservation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "heightEstimation")
    public native VNHumanBodyPose3DObservationHeightEstimation getHeightEstimation();
    @Property(selector = "cameraOriginMatrix")
    public native @ByVal MatrixFloat4x4 getCameraOriginMatrix();
    @Property(selector = "availableJointsGroupNames")
    public native NSArray<NSString> getAvailableJointsGroupNames();
    @Property(selector = "availableJointNames")
    public native NSArray<NSString> getAvailableJointNames();
    @Property(selector = "bodyHeight")
    public native float getBodyHeight();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "recognizedPointsForJointsGroupName:error:")
    public native NSDictionary<NSString, VNHumanBodyRecognizedPoint3D> getRecognizedPoints(VNHumanBodyPose3DObservationJointsGroupName jointsGroupName, NSError.NSErrorPtr error);
    @Method(selector = "recognizedPointForJointName:error:")
    public native VNHumanBodyRecognizedPoint3D getRecognizedPoint(VNHumanBodyPose3DObservationJointName jointName, NSError.NSErrorPtr error);
    public VNPoint getPointInImage(VNHumanBodyPose3DObservationJointName jointName) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       VNPoint result = getPointInImage(jointName, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "pointInImageForJointName:error:")
    private native VNPoint getPointInImage(VNHumanBodyPose3DObservationJointName jointName, NSError.NSErrorPtr error);
    @Method(selector = "parentJointNameForJointName:")
    public native VNHumanBodyPose3DObservationJointName parentJointNameForJointName(VNHumanBodyPose3DObservationJointName jointName);
    public boolean getCameraRelativePosition(MatrixFloat4x4 modelPositionOut, VNHumanBodyPose3DObservationJointName jointName) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = getCameraRelativePosition(modelPositionOut, jointName, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "getCameraRelativePosition:forJointName:error:")
    private native boolean getCameraRelativePosition(MatrixFloat4x4 modelPositionOut, VNHumanBodyPose3DObservationJointName jointName, NSError.NSErrorPtr error);
    /*</methods>*/
}
