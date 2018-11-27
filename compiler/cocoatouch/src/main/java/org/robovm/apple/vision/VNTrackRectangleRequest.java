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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNTrackRectangleRequest/*</name>*/ 
    extends /*<extends>*/VNTrackingRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNTrackRectangleRequestPtr extends Ptr<VNTrackRectangleRequest, VNTrackRectangleRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNTrackRectangleRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNTrackRectangleRequest() {}
    protected VNTrackRectangleRequest(Handle h, long handle) { super(h, handle); }
    protected VNTrackRectangleRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRectangleObservation:")
    public VNTrackRectangleRequest(VNRectangleObservation observation) { super((SkipInit) null); initObject(init(observation)); }
    @Method(selector = "initWithRectangleObservation:completionHandler:")
    public VNTrackRectangleRequest(VNRectangleObservation observation, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(observation, completionHandler)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="VNTrackRectangleRequestRevision1", optional=true)
    public static native @MachineSizedUInt long getRevision1();
    
    @Method(selector = "initWithRectangleObservation:")
    protected native @Pointer long init(VNRectangleObservation observation);
    @Method(selector = "initWithRectangleObservation:completionHandler:")
    protected native @Pointer long init(VNRectangleObservation observation, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    /*</methods>*/
}
