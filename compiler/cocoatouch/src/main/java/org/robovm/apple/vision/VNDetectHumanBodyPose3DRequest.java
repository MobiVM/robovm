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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNDetectHumanBodyPose3DRequest/*</name>*/ 
    extends /*<extends>*/VNStatefulRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNDetectHumanBodyPose3DRequestPtr extends Ptr<VNDetectHumanBodyPose3DRequest, VNDetectHumanBodyPose3DRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNDetectHumanBodyPose3DRequest.class); }/*</bind>*/
    /*<constants>*/
    public static final int Revision1 = 1;
    /*</constants>*/
    /*<constructors>*/
    public VNDetectHumanBodyPose3DRequest() {}
    protected VNDetectHumanBodyPose3DRequest(Handle h, long handle) { super(h, handle); }
    protected VNDetectHumanBodyPose3DRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCompletionHandler:")
    public VNDetectHumanBodyPose3DRequest(@Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(completionHandler)); }
    @Method(selector = "initWithFrameAnalysisSpacing:completionHandler:")
    public VNDetectHumanBodyPose3DRequest(@ByVal CMTime frameAnalysisSpacing, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super(frameAnalysisSpacing, completionHandler); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "results")
    public native NSArray<VNHumanBodyPose3DObservation> getResults();
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
    @Method(selector = "initWithCompletionHandler:")
    protected native @Pointer long init(@Block VoidBlock2<VNRequest, NSError> completionHandler);
    @Method(selector = "supportedJointNamesAndReturnError:")
    public native NSArray<NSString> supportedJointNamesAndReturnError(NSError.NSErrorPtr error);
    @Method(selector = "supportedJointsGroupNamesAndReturnError:")
    public native NSArray<NSString> supportedJointsGroupNamesAndReturnError(NSError.NSErrorPtr error);
    /*</methods>*/
}
