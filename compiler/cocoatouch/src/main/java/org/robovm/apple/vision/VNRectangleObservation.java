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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNRectangleObservation/*</name>*/ 
    extends /*<extends>*/VNDetectedObjectObservation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNRectangleObservationPtr extends Ptr<VNRectangleObservation, VNRectangleObservationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNRectangleObservation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNRectangleObservation() {}
    protected VNRectangleObservation(Handle h, long handle) { super(h, handle); }
    protected VNRectangleObservation(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 17.0. Use rectangleObservationWithRequestRevision:topLeft:topRight:bottomRight:bottomLeft:
     */
    @Deprecated
    public VNRectangleObservation(@MachineSizedUInt long requestRevision, @ByVal CGPoint topLeft, @ByVal CGPoint bottomLeft, @ByVal CGPoint bottomRight, @ByVal CGPoint topRight) { super((Handle) null, createDeprecated(requestRevision, topLeft, bottomLeft, bottomRight, topRight)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "topLeft")
    public native @ByVal CGPoint getTopLeft();
    @Property(selector = "topRight")
    public native @ByVal CGPoint getTopRight();
    @Property(selector = "bottomLeft")
    public native @ByVal CGPoint getBottomLeft();
    @Property(selector = "bottomRight")
    public native @ByVal CGPoint getBottomRight();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 17.0. Use rectangleObservationWithRequestRevision:topLeft:topRight:bottomRight:bottomLeft:
     */
    @Deprecated
    @Method(selector = "rectangleObservationWithRequestRevision:topLeft:bottomLeft:bottomRight:topRight:")
    protected static native @Pointer long createDeprecated(@MachineSizedUInt long requestRevision, @ByVal CGPoint topLeft, @ByVal CGPoint bottomLeft, @ByVal CGPoint bottomRight, @ByVal CGPoint topRight);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "rectangleObservationWithRequestRevision:topLeft:topRight:bottomRight:bottomLeft:")
    public static native VNRectangleObservation create(@MachineSizedUInt long requestRevision, @ByVal CGPoint topLeft, @ByVal CGPoint topRight, @ByVal CGPoint bottomRight, @ByVal CGPoint bottomLeft);
    /*</methods>*/
}
