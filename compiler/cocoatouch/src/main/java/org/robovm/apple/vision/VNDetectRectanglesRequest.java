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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNDetectRectanglesRequest/*</name>*/ 
    extends /*<extends>*/VNImageBasedRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNDetectRectanglesRequestPtr extends Ptr<VNDetectRectanglesRequest, VNDetectRectanglesRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNDetectRectanglesRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNDetectRectanglesRequest() {}
    protected VNDetectRectanglesRequest(Handle h, long handle) { super(h, handle); }
    protected VNDetectRectanglesRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCompletionHandler:")
    public VNDetectRectanglesRequest(@Block VoidBlock2<VNRequest, NSError> completionHandler) { super(completionHandler); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "minimumAspectRatio")
    public native float getMinimumAspectRatio();
    @Property(selector = "setMinimumAspectRatio:")
    public native void setMinimumAspectRatio(float v);
    @Property(selector = "maximumAspectRatio")
    public native float getMaximumAspectRatio();
    @Property(selector = "setMaximumAspectRatio:")
    public native void setMaximumAspectRatio(float v);
    @Property(selector = "quadratureTolerance")
    public native float getQuadratureTolerance();
    @Property(selector = "setQuadratureTolerance:")
    public native void setQuadratureTolerance(float v);
    @Property(selector = "minimumSize")
    public native float getMinimumSize();
    @Property(selector = "setMinimumSize:")
    public native void setMinimumSize(float v);
    @Property(selector = "minimumConfidence")
    public native float getMinimumConfidence();
    @Property(selector = "setMinimumConfidence:")
    public native void setMinimumConfidence(float v);
    @Property(selector = "maximumObservations")
    public native @MachineSizedUInt long getMaximumObservations();
    @Property(selector = "setMaximumObservations:")
    public native void setMaximumObservations(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="VNDetectRectanglesRequestRevision1", optional=true)
    public static native @MachineSizedUInt long getRevision1();
    
    
    /*</methods>*/
}
