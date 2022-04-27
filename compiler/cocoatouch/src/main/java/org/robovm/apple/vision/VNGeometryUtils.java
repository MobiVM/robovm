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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNGeometryUtils/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNGeometryUtilsPtr extends Ptr<VNGeometryUtils, VNGeometryUtilsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNGeometryUtils.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNGeometryUtils() {}
    protected VNGeometryUtils(Handle h, long handle) { super(h, handle); }
    protected VNGeometryUtils(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public static VNCircle getBoundingCircle(VNContour contour) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       VNCircle result = getBoundingCircle(contour, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "boundingCircleForContour:error:")
    private static native VNCircle getBoundingCircle(VNContour contour, NSError.NSErrorPtr error);
    public static VNCircle getBoundingCircle(NSArray<VNPoint> points) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       VNCircle result = getBoundingCircle(points, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "boundingCircleForPoints:error:")
    private static native VNCircle getBoundingCircle(NSArray<VNPoint> points, NSError.NSErrorPtr error);
    public static VNCircle getBoundingCircle(VectorFloat2 points, @MachineSizedSInt long pointCount) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       VNCircle result = getBoundingCircle(points, pointCount, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "boundingCircleForSIMDPoints:pointCount:error:")
    private static native VNCircle getBoundingCircle(VectorFloat2 points, @MachineSizedSInt long pointCount, NSError.NSErrorPtr error);
    public static boolean calculateArea(DoublePtr area, VNContour contour, boolean orientedArea) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = calculateArea(area, contour, orientedArea, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "calculateArea:forContour:orientedArea:error:")
    private static native boolean calculateArea(DoublePtr area, VNContour contour, boolean orientedArea, NSError.NSErrorPtr error);
    public static boolean calculatePerimeter(DoublePtr perimeter, VNContour contour) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = calculatePerimeter(perimeter, contour, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "calculatePerimeter:forContour:error:")
    private static native boolean calculatePerimeter(DoublePtr perimeter, VNContour contour, NSError.NSErrorPtr error);
    /*</methods>*/
}
