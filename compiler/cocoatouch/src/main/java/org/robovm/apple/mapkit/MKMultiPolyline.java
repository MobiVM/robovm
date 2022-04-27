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
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKMultiPolyline/*</name>*/ 
    extends /*<extends>*/MKShape/*</extends>*/ 
    /*<implements>*/implements MKOverlay, MKGeoJSONObject/*</implements>*/ {

    /*<ptr>*/public static class MKMultiPolylinePtr extends Ptr<MKMultiPolyline, MKMultiPolylinePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKMultiPolyline.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKMultiPolyline() {}
    protected MKMultiPolyline(Handle h, long handle) { super(h, handle); }
    protected MKMultiPolyline(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPolylines:")
    public MKMultiPolyline(NSArray<MKPolyline> polylines) { super((SkipInit) null); initObject(init(polylines)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "polylines")
    public native NSArray<MKPolyline> getPolylines();
    @Property(selector = "coordinate")
    public native @ByVal CLLocationCoordinate2D getCoordinate();
    @Property(selector = "boundingMapRect")
    public native @ByVal MKMapRect getBoundingMapRect();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPolylines:")
    protected native @Pointer long init(NSArray<MKPolyline> polylines);
    @Method(selector = "intersectsMapRect:")
    public native boolean intersects(@ByVal MKMapRect mapRect);
    @Method(selector = "canReplaceMapContent")
    public native boolean canReplaceMapContent();
    /*</methods>*/
}
