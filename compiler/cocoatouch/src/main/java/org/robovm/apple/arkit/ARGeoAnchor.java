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
package org.robovm.apple.arkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARGeoAnchor/*</name>*/ 
    extends /*<extends>*/ARAnchor/*</extends>*/ 
    /*<implements>*/implements ARTrackable/*</implements>*/ {

    /*<ptr>*/public static class ARGeoAnchorPtr extends Ptr<ARGeoAnchor, ARGeoAnchorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARGeoAnchor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARGeoAnchor() {}
    protected ARGeoAnchor(Handle h, long handle) { super(h, handle); }
    protected ARGeoAnchor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoordinate:")
    public ARGeoAnchor(@ByVal CLLocationCoordinate2D coordinate) { super((SkipInit) null); initObject(init(coordinate)); }
    @Method(selector = "initWithCoordinate:altitude:")
    public ARGeoAnchor(@ByVal CLLocationCoordinate2D coordinate, double altitude) { super((SkipInit) null); initObject(init(coordinate, altitude)); }
    @Method(selector = "initWithName:coordinate:")
    public ARGeoAnchor(String name, @ByVal CLLocationCoordinate2D coordinate) { super((SkipInit) null); initObject(init(name, coordinate)); }
    @Method(selector = "initWithName:coordinate:altitude:")
    public ARGeoAnchor(String name, @ByVal CLLocationCoordinate2D coordinate, double altitude) { super((SkipInit) null); initObject(init(name, coordinate, altitude)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "coordinate")
    public native @ByVal CLLocationCoordinate2D getCoordinate();
    @Property(selector = "altitude")
    public native double getAltitude();
    @Property(selector = "altitudeSource")
    public native ARAltitudeSource getAltitudeSource();
    @Property(selector = "isTracked")
    public native boolean isTracked();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoordinate:")
    protected native @Pointer long init(@ByVal CLLocationCoordinate2D coordinate);
    @Method(selector = "initWithCoordinate:altitude:")
    protected native @Pointer long init(@ByVal CLLocationCoordinate2D coordinate, double altitude);
    @Method(selector = "initWithName:coordinate:")
    protected native @Pointer long init(String name, @ByVal CLLocationCoordinate2D coordinate);
    @Method(selector = "initWithName:coordinate:altitude:")
    protected native @Pointer long init(String name, @ByVal CLLocationCoordinate2D coordinate, double altitude);
    /*</methods>*/
}
