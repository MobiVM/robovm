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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKScaleView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKScaleViewPtr extends Ptr<MKScaleView, MKScaleViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKScaleView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKScaleView() {}
    protected MKScaleView(Handle h, long handle) { super(h, handle); }
    protected MKScaleView(SkipInit skipInit) { super(skipInit); }
    public MKScaleView(MKMapView mapView) { super((Handle) null, create(mapView)); retain(getHandle()); }
    @Method(selector = "initWithFrame:")
    public MKScaleView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public MKScaleView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mapView")
    public native MKMapView getMapView();
    @Property(selector = "setMapView:", strongRef = true)
    public native void setMapView(MKMapView v);
    @Property(selector = "scaleVisibility")
    public native MKFeatureVisibility getScaleVisibility();
    @Property(selector = "setScaleVisibility:")
    public native void setScaleVisibility(MKFeatureVisibility v);
    @Property(selector = "legendAlignment")
    public native MKScaleViewAlignment getLegendAlignment();
    @Property(selector = "setLegendAlignment:")
    public native void setLegendAlignment(MKScaleViewAlignment v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "scaleViewWithMapView:")
    protected static native @Pointer long create(MKMapView mapView);
    /*</methods>*/
}
