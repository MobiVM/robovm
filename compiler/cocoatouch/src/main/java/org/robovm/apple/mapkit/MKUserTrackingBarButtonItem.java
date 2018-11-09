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
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKUserTrackingBarButtonItem/*</name>*/ 
    extends /*<extends>*/UIBarButtonItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKUserTrackingBarButtonItemPtr extends Ptr<MKUserTrackingBarButtonItem, MKUserTrackingBarButtonItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKUserTrackingBarButtonItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKUserTrackingBarButtonItem() {}
    protected MKUserTrackingBarButtonItem(Handle h, long handle) { super(h, handle); }
    protected MKUserTrackingBarButtonItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMapView:")
    public MKUserTrackingBarButtonItem(MKMapView mapView) { super((SkipInit) null); initObject(init(mapView)); }
    @Method(selector = "initWithCoder:")
    public MKUserTrackingBarButtonItem(NSCoder decoder) { super(decoder); }
    @Method(selector = "initWithImage:style:target:action:")
    public MKUserTrackingBarButtonItem(UIImage image, UIBarButtonItemStyle style, NSObject target, Selector action) { super(image, style, target, action); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "initWithImage:landscapeImagePhone:style:target:action:")
    public MKUserTrackingBarButtonItem(UIImage image, UIImage landscapeImagePhone, UIBarButtonItemStyle style, NSObject target, Selector action) { super(image, landscapeImagePhone, style, target, action); }
    @Method(selector = "initWithTitle:style:target:action:")
    public MKUserTrackingBarButtonItem(String title, UIBarButtonItemStyle style, NSObject target, Selector action) { super(title, style, target, action); }
    @Method(selector = "initWithBarButtonSystemItem:target:action:")
    public MKUserTrackingBarButtonItem(UIBarButtonSystemItem systemItem, NSObject target, Selector action) { super(systemItem, target, action); }
    @Method(selector = "initWithCustomView:")
    public MKUserTrackingBarButtonItem(UIView customView) { super(customView); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mapView")
    public native MKMapView getMapView();
    @Property(selector = "setMapView:")
    public native void setMapView(MKMapView v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMapView:")
    protected native @Pointer long init(MKMapView mapView);
    /*</methods>*/
}
