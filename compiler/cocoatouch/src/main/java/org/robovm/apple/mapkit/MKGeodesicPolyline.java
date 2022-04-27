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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKGeodesicPolyline/*</name>*/ 
    extends /*<extends>*/MKPolyline/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKGeodesicPolylinePtr extends Ptr<MKGeodesicPolyline, MKGeodesicPolylinePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKGeodesicPolyline.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKGeodesicPolyline() {}
    protected MKGeodesicPolyline(Handle h, long handle) { super(h, handle); }
    protected MKGeodesicPolyline(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    public MKGeodesicPolyline(MKMapPoint[] points) {
        super(create0(points));
        retain(getHandle());
    }
    public MKGeodesicPolyline(CLLocationCoordinate2D[] coords) {
        super(create0(coords));
        retain(getHandle());
    }
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    private static long create0(MKMapPoint[] points) {
        MKMapPoint first = Struct.allocate(MKMapPoint.class, points.length);
        first.update(points);
        return create(first, points.length);
    }
    private static long create0(CLLocationCoordinate2D[] coords) {
        CLLocationCoordinate2D first = Struct.allocate(CLLocationCoordinate2D.class, coords.length);
        first.update(coords);
        return create(first, coords.length);
    }
    /*<methods>*/
    @Method(selector = "polylineWithPoints:count:")
    private static native @Pointer long create(MKMapPoint points, @MachineSizedUInt long count);
    @Method(selector = "polylineWithCoordinates:count:")
    private static native @Pointer long create(CLLocationCoordinate2D coords, @MachineSizedUInt long count);
    /*</methods>*/
}
