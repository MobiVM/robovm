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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNFaceObservation/*</name>*/ 
    extends /*<extends>*/VNDetectedObjectObservation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNFaceObservationPtr extends Ptr<VNFaceObservation, VNFaceObservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNFaceObservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNFaceObservation() {}
    protected VNFaceObservation(Handle h, long handle) { super(h, handle); }
    protected VNFaceObservation(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use -faceObservationWithRequestRevision:boundingBox:roll:yaw:
     */
    @Deprecated
    public VNFaceObservation(@MachineSizedUInt long requestRevision, @ByVal CGRect boundingBox, NSNumber roll, NSNumber yaw) { super((Handle) null, create(requestRevision, boundingBox, roll, yaw)); retain(getHandle()); }
    /**
     * @since Available in iOS 15.0 and later.
     */
    public VNFaceObservation(@MachineSizedUInt long requestRevision, @ByVal CGRect boundingBox, NSNumber roll, NSNumber yaw, NSNumber pitch) { super((Handle) null, create(requestRevision, boundingBox, roll, yaw, pitch)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "landmarks")
    public native VNFaceLandmarks2D getLandmarks();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "faceCaptureQuality")
    public native NSNumber getFaceCaptureQuality();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "roll")
    public native NSNumber getRoll();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "yaw")
    public native NSNumber getYaw();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "pitch")
    public native NSNumber getPitch();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use -faceObservationWithRequestRevision:boundingBox:roll:yaw:
     */
    @Deprecated
    @Method(selector = "faceObservationWithRequestRevision:boundingBox:roll:yaw:")
    protected static native @Pointer long create(@MachineSizedUInt long requestRevision, @ByVal CGRect boundingBox, NSNumber roll, NSNumber yaw);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "faceObservationWithRequestRevision:boundingBox:roll:yaw:pitch:")
    protected static native @Pointer long create(@MachineSizedUInt long requestRevision, @ByVal CGRect boundingBox, NSNumber roll, NSNumber yaw, NSNumber pitch);
    /*</methods>*/
}
