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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNDetectedObjectObservation/*</name>*/ 
    extends /*<extends>*/VNObservation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNDetectedObjectObservationPtr extends Ptr<VNDetectedObjectObservation, VNDetectedObjectObservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNDetectedObjectObservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNDetectedObjectObservation() {}
    protected VNDetectedObjectObservation(Handle h, long handle) { super(h, handle); }
    protected VNDetectedObjectObservation(SkipInit skipInit) { super(skipInit); }
    public VNDetectedObjectObservation(@ByVal CGRect boundingBox) { super((Handle) null, create(boundingBox)); retain(getHandle()); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    public VNDetectedObjectObservation(@MachineSizedUInt long requestRevision, @ByVal CGRect boundingBox) { super((Handle) null, create(requestRevision, boundingBox)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "boundingBox")
    public native @ByVal CGRect getBoundingBox();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "observationWithBoundingBox:")
    protected static native @Pointer long create(@ByVal CGRect boundingBox);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "observationWithRequestRevision:boundingBox:")
    protected static native @Pointer long create(@MachineSizedUInt long requestRevision, @ByVal CGRect boundingBox);
    /*</methods>*/
}
