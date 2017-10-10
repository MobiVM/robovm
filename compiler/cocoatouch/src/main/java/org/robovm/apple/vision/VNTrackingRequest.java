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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNTrackingRequest/*</name>*/ 
    extends /*<extends>*/VNImageBasedRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNTrackingRequestPtr extends Ptr<VNTrackingRequest, VNTrackingRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNTrackingRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNTrackingRequest() {}
    protected VNTrackingRequest(Handle h, long handle) { super(h, handle); }
    protected VNTrackingRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputObservation")
    public native VNDetectedObjectObservation getInputObservation();
    @Property(selector = "setInputObservation:")
    public native void setInputObservation(VNDetectedObjectObservation v);
    @Property(selector = "trackingLevel")
    public native VNRequestTrackingLevel getTrackingLevel();
    @Property(selector = "setTrackingLevel:")
    public native void setTrackingLevel(VNRequestTrackingLevel v);
    @Property(selector = "isLastFrame")
    public native boolean isLastFrame();
    @Property(selector = "setLastFrame:")
    public native void setLastFrame(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
