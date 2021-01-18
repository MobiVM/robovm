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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKMapCameraBoundary/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MKMapCameraBoundaryPtr extends Ptr<MKMapCameraBoundary, MKMapCameraBoundaryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKMapCameraBoundary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKMapCameraBoundary() {}
    protected MKMapCameraBoundary(Handle h, long handle) { super(h, handle); }
    protected MKMapCameraBoundary(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMapRect:")
    public MKMapCameraBoundary(@ByVal MKMapRect mapRect) { super((SkipInit) null); initObject(init(mapRect)); }
    @Method(selector = "initWithCoordinateRegion:")
    public MKMapCameraBoundary(@ByVal MKCoordinateRegion region) { super((SkipInit) null); initObject(init(region)); }
    @Method(selector = "initWithCoder:")
    public MKMapCameraBoundary(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mapRect")
    public native @ByVal MKMapRect getMapRect();
    @Property(selector = "region")
    public native @ByVal MKCoordinateRegion getRegion();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMapRect:")
    protected native @Pointer long init(@ByVal MKMapRect mapRect);
    @Method(selector = "initWithCoordinateRegion:")
    protected native @Pointer long init(@ByVal MKCoordinateRegion region);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
