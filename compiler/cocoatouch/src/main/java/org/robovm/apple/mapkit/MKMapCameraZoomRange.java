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
package org.robovm.apple.mapkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKMapCameraZoomRange/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MKMapCameraZoomRangePtr extends Ptr<MKMapCameraZoomRange, MKMapCameraZoomRangePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKMapCameraZoomRange.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKMapCameraZoomRange() {}
    protected MKMapCameraZoomRange(Handle h, long handle) { super(h, handle); }
    protected MKMapCameraZoomRange(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMinCenterCoordinateDistance:maxCenterCoordinateDistance:")
    public MKMapCameraZoomRange(double minDistance, double maxDistance) { super((SkipInit) null); initObject(init(minDistance, maxDistance)); }
    @Method(selector = "initWithMinCenterCoordinateDistance:")
    public static  MKMapCameraZoomRange createUsingMinCenterCoordinateDistance(double minDistance) {
       MKMapCameraZoomRange res = new MKMapCameraZoomRange((SkipInit) null);
       res.initObject(res.initUsingMinCenterCoordinateDistance(minDistance));
       return res;
    }
    @Method(selector = "initWithMaxCenterCoordinateDistance:")
    public static  MKMapCameraZoomRange createUsingMaxCenterCoordinateDistance(double maxDistance) {
       MKMapCameraZoomRange res = new MKMapCameraZoomRange((SkipInit) null);
       res.initObject(res.initUsingMaxCenterCoordinateDistance(maxDistance));
       return res;
    }
    @Method(selector = "initWithCoder:")
    public MKMapCameraZoomRange(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "minCenterCoordinateDistance")
    public native double getMinCenterCoordinateDistance();
    @Property(selector = "maxCenterCoordinateDistance")
    public native double getMaxCenterCoordinateDistance();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="MKMapCameraZoomDefault", optional=true)
    public static native double getCameraZoomDefault();
    
    @Method(selector = "initWithMinCenterCoordinateDistance:maxCenterCoordinateDistance:")
    protected native @Pointer long init(double minDistance, double maxDistance);
    @Method(selector = "initWithMinCenterCoordinateDistance:")
    protected native @Pointer long initUsingMinCenterCoordinateDistance(double minDistance);
    @Method(selector = "initWithMaxCenterCoordinateDistance:")
    protected native @Pointer long initUsingMaxCenterCoordinateDistance(double maxDistance);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
