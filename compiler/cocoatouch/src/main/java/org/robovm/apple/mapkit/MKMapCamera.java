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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKMapCamera/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MKMapCameraPtr extends Ptr<MKMapCamera, MKMapCameraPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKMapCamera.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKMapCamera() {}
    protected MKMapCamera(Handle h, long handle) { super(h, handle); }
    protected MKMapCamera(SkipInit skipInit) { super(skipInit); }
    public MKMapCamera(@ByVal CLLocationCoordinate2D centerCoordinate, @ByVal CLLocationCoordinate2D eyeCoordinate, double eyeAltitude) { super((Handle) null, create(centerCoordinate, eyeCoordinate, eyeAltitude)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public MKMapCamera(@ByVal CLLocationCoordinate2D centerCoordinate, double distance, @MachineSizedFloat double pitch, double heading) { super((Handle) null, create(centerCoordinate, distance, pitch, heading)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public MKMapCamera(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "centerCoordinate")
    public native @ByVal CLLocationCoordinate2D getCenterCoordinate();
    @Property(selector = "setCenterCoordinate:")
    public native void setCenterCoordinate(@ByVal CLLocationCoordinate2D v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "centerCoordinateDistance")
    public native double getCenterCoordinateDistance();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setCenterCoordinateDistance:")
    public native void setCenterCoordinateDistance(double v);
    @Property(selector = "heading")
    public native double getHeading();
    @Property(selector = "setHeading:")
    public native void setHeading(double v);
    @Property(selector = "pitch")
    public native @MachineSizedFloat double getPitch();
    @Property(selector = "setPitch:")
    public native void setPitch(@MachineSizedFloat double v);
    /**
     * @deprecated Use centerCoordinateDistance
     */
    @Deprecated
    @Property(selector = "altitude")
    public native double getAltitude();
    /**
     * @deprecated Use centerCoordinateDistance
     */
    @Deprecated
    @Property(selector = "setAltitude:")
    public native void setAltitude(double v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "cameraLookingAtCenterCoordinate:fromEyeCoordinate:eyeAltitude:")
    protected static native @Pointer long create(@ByVal CLLocationCoordinate2D centerCoordinate, @ByVal CLLocationCoordinate2D eyeCoordinate, double eyeAltitude);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "cameraLookingAtCenterCoordinate:fromDistance:pitch:heading:")
    protected static native @Pointer long create(@ByVal CLLocationCoordinate2D centerCoordinate, double distance, @MachineSizedFloat double pitch, double heading);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
