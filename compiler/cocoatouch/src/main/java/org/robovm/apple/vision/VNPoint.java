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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNPoint/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class VNPointPtr extends Ptr<VNPoint, VNPointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNPoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNPoint() {}
    protected VNPoint(Handle h, long handle) { super(h, handle); }
    protected VNPoint(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithX:y:")
    public VNPoint(double x, double y) { super((SkipInit) null); initObject(init(x, y)); }
    @Method(selector = "initWithLocation:")
    public VNPoint(@ByVal CGPoint location) { super((SkipInit) null); initObject(init(location)); }
    @Method(selector = "initWithCoder:")
    public VNPoint(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "zeroPoint")
    public static native VNPoint getZeroPoint();
    @Property(selector = "location")
    public native @ByVal CGPoint getLocation();
    @Property(selector = "x")
    public native double getX();
    @Property(selector = "y")
    public native double getY();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "distanceToPoint:")
    public native double distanceToPoint(VNPoint point);
    @Method(selector = "initWithX:y:")
    protected native @Pointer long init(double x, double y);
    @Method(selector = "initWithLocation:")
    protected native @Pointer long init(@ByVal CGPoint location);
    @Method(selector = "pointByApplyingVector:toPoint:")
    public static native VNPoint getPointByApplyingVector(VNVector vector, VNPoint point);
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. use -distanceToPoint:
     */
    @Deprecated
    @Method(selector = "distanceBetweenPoint:point:")
    public static native double getDistance(VNPoint point1, VNPoint point2);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
