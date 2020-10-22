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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNVector/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class VNVectorPtr extends Ptr<VNVector, VNVectorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNVector.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNVector() {}
    protected VNVector(Handle h, long handle) { super(h, handle); }
    protected VNVector(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithXComponent:yComponent:")
    public VNVector(double x, double y) { super((SkipInit) null); initObject(init(x, y)); }
    @Method(selector = "initWithR:theta:")
    public static  VNVector createUsingRTheta(double r, double theta) {
       VNVector res = new VNVector((SkipInit) null);
       res.initObject(res.initUsingRTheta(r, theta));
       return res;
    }
    @Method(selector = "initWithVectorHead:tail:")
    public VNVector(VNPoint head, VNPoint tail) { super((SkipInit) null); initObject(init(head, tail)); }
    @Method(selector = "initWithCoder:")
    public VNVector(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "zeroVector")
    public static native VNVector getZeroVector();
    @Property(selector = "x")
    public native double getX();
    @Property(selector = "y")
    public native double getY();
    @Property(selector = "r")
    public native double getR();
    @Property(selector = "theta")
    public native double getTheta();
    @Property(selector = "length")
    public native double getLength();
    @Property(selector = "squaredLength")
    public native double getSquaredLength();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithXComponent:yComponent:")
    protected native @Pointer long init(double x, double y);
    @Method(selector = "initWithR:theta:")
    protected native @Pointer long initUsingRTheta(double r, double theta);
    @Method(selector = "initWithVectorHead:tail:")
    protected native @Pointer long init(VNPoint head, VNPoint tail);
    @Method(selector = "unitVectorForVector:")
    public static native VNVector unitVectorForVector(VNVector vector);
    @Method(selector = "vectorByMultiplyingVector:byScalar:")
    public static native VNVector getVectorByMultiplyingVector(VNVector vector, double scalar);
    @Method(selector = "vectorByAddingVector:toVector:")
    public static native VNVector getVectorByAddingVector(VNVector v1, VNVector v2);
    @Method(selector = "vectorBySubtractingVector:fromVector:")
    public static native VNVector getVectorBySubtractingVector(VNVector v1, VNVector v2);
    @Method(selector = "dotProductOfVector:vector:")
    public static native double getDotProductOfVector(VNVector v1, VNVector v2);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
