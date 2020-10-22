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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNCircle/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class VNCirclePtr extends Ptr<VNCircle, VNCirclePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNCircle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNCircle() {}
    protected VNCircle(Handle h, long handle) { super(h, handle); }
    protected VNCircle(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCenter:radius:")
    public VNCircle(VNPoint center, double radius) { super((SkipInit) null); initObject(init(center, radius)); }
    @Method(selector = "initWithCenter:diameter:")
    public static  VNCircle createUsingCenterDiameter(VNPoint center, double diameter) {
       VNCircle res = new VNCircle((SkipInit) null);
       res.initObject(res.initUsingCenterDiameter(center, diameter));
       return res;
    }
    @Method(selector = "initWithCoder:")
    public VNCircle(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "zeroCircle")
    public static native VNCircle getZeroCircle();
    @Property(selector = "center")
    public native VNPoint getCenter();
    @Property(selector = "radius")
    public native double getRadius();
    @Property(selector = "diameter")
    public native double getDiameter();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCenter:radius:")
    protected native @Pointer long init(VNPoint center, double radius);
    @Method(selector = "initWithCenter:diameter:")
    protected native @Pointer long initUsingCenterDiameter(VNPoint center, double diameter);
    @Method(selector = "containsPoint:")
    public native boolean containsPoint(VNPoint point);
    @Method(selector = "containsPoint:inCircumferentialRingOfWidth:")
    public native boolean containsPoint(VNPoint point, double ringWidth);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
