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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNHumanBodyRecognizedPoint3D/*</name>*/ 
    extends /*<extends>*/VNRecognizedPoint3D/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNHumanBodyRecognizedPoint3DPtr extends Ptr<VNHumanBodyRecognizedPoint3D, VNHumanBodyRecognizedPoint3DPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNHumanBodyRecognizedPoint3D.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNHumanBodyRecognizedPoint3D() {}
    protected VNHumanBodyRecognizedPoint3D(Handle h, long handle) { super(h, handle); }
    protected VNHumanBodyRecognizedPoint3D(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPosition:")
    public VNHumanBodyRecognizedPoint3D(@ByVal MatrixFloat4x4 position) { super(position); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "localPosition")
    public native @ByVal MatrixFloat4x4 getLocalPosition();
    @Property(selector = "parentJoint")
    public native VNHumanBodyPose3DObservationJointName getParentJoint();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
