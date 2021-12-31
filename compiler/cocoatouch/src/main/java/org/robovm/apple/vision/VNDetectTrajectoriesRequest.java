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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNDetectTrajectoriesRequest/*</name>*/ 
    extends /*<extends>*/VNStatefulRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNDetectTrajectoriesRequestPtr extends Ptr<VNDetectTrajectoriesRequest, VNDetectTrajectoriesRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNDetectTrajectoriesRequest.class); }/*</bind>*/
    /*<constants>*/
    public static final int Revision1 = 1;
    /*</constants>*/
    /*<constructors>*/
    protected VNDetectTrajectoriesRequest() {}
    protected VNDetectTrajectoriesRequest(Handle h, long handle) { super(h, handle); }
    protected VNDetectTrajectoriesRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrameAnalysisSpacing:trajectoryLength:completionHandler:")
    public VNDetectTrajectoriesRequest(@ByVal CMTime frameAnalysisSpacing, @MachineSizedSInt long trajectoryLength, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(frameAnalysisSpacing, trajectoryLength, completionHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "trajectoryLength")
    public native @MachineSizedSInt long getTrajectoryLength();
    @Property(selector = "objectMinimumNormalizedRadius")
    public native float getObjectMinimumNormalizedRadius();
    @Property(selector = "setObjectMinimumNormalizedRadius:")
    public native void setObjectMinimumNormalizedRadius(float v);
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -objectMinimumNormalizedRadius
     */
    @Deprecated
    @Property(selector = "minimumObjectSize")
    public native float getMinimumObjectSize();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -objectMinimumNormalizedRadius
     */
    @Deprecated
    @Property(selector = "setMinimumObjectSize:")
    public native void setMinimumObjectSize(float v);
    @Property(selector = "objectMaximumNormalizedRadius")
    public native float getObjectMaximumNormalizedRadius();
    @Property(selector = "setObjectMaximumNormalizedRadius:")
    public native void setObjectMaximumNormalizedRadius(float v);
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -objectMaximumNormalizedRadius
     */
    @Deprecated
    @Property(selector = "maximumObjectSize")
    public native float getMaximumObjectSize();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -objectMaximumNormalizedRadius
     */
    @Deprecated
    @Property(selector = "setMaximumObjectSize:")
    public native void setMaximumObjectSize(float v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "targetFrameTime")
    public native @ByVal CMTime getTargetFrameTime();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setTargetFrameTime:")
    public native void setTargetFrameTime(@ByVal CMTime v);
    @Property(selector = "results")
    public native NSArray<VNTrajectoryObservation> getResults();
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
    @Method(selector = "initWithFrameAnalysisSpacing:trajectoryLength:completionHandler:")
    protected native @Pointer long init(@ByVal CMTime frameAnalysisSpacing, @MachineSizedSInt long trajectoryLength, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    /*</methods>*/
}
