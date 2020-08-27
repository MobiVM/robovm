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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNContour/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements VNRequestRevisionProviding/*</implements>*/ {

    /*<ptr>*/public static class VNContourPtr extends Ptr<VNContour, VNContourPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNContour.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNContour() {}
    protected VNContour(Handle h, long handle) { super(h, handle); }
    protected VNContour(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "indexPath")
    public native NSIndexPath getIndexPath();
    @Property(selector = "childContourCount")
    public native @MachineSizedSInt long getChildContourCount();
    @Property(selector = "childContours")
    public native NSArray<VNContour> getChildContours();
    @Property(selector = "pointCount")
    public native @MachineSizedSInt long getPointCount();
    @Property(selector = "normalizedPoints")
    public native VectorFloat2 getNormalizedPoints();
    @Property(selector = "normalizedPath")
    public native CGPath getNormalizedPath();
    @Property(selector = "aspectRatio")
    public native float getAspectRatio();
    @Property(selector = "requestRevision")
    public native @MachineSizedUInt long getRequestRevision();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public VNContour getChildContour(@MachineSizedUInt long childContourIndex) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       VNContour result = getChildContour(childContourIndex, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "childContourAtIndex:error:")
    private native VNContour getChildContour(@MachineSizedUInt long childContourIndex, NSError.NSErrorPtr error);
    public VNContour polygonApproximation(float epsilon) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       VNContour result = polygonApproximation(epsilon, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "polygonApproximationWithEpsilon:error:")
    private native VNContour polygonApproximation(float epsilon, NSError.NSErrorPtr error);
    /*</methods>*/
}
