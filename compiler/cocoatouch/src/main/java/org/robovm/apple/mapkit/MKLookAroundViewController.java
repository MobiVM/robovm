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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKLookAroundViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, NSCoding/*</implements>*/ {

    /*<ptr>*/public static class MKLookAroundViewControllerPtr extends Ptr<MKLookAroundViewController, MKLookAroundViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKLookAroundViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKLookAroundViewController() {}
    protected MKLookAroundViewController(Handle h, long handle) { super(h, handle); }
    protected MKLookAroundViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithScene:")
    public MKLookAroundViewController(MKLookAroundScene scene) { super((SkipInit) null); initObject(init(scene)); }
    @Method(selector = "initWithNibName:bundle:")
    public MKLookAroundViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super((SkipInit) null); initObject(init(nibNameOrNil, nibBundleOrNil)); }
    @Method(selector = "initWithCoder:")
    public MKLookAroundViewController(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MKLookAroundViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MKLookAroundViewControllerDelegate v);
    @Property(selector = "scene")
    public native MKLookAroundScene getScene();
    @Property(selector = "setScene:")
    public native void setScene(MKLookAroundScene v);
    @Property(selector = "isNavigationEnabled")
    public native boolean isNavigationEnabled();
    @Property(selector = "setNavigationEnabled:")
    public native void setNavigationEnabled(boolean v);
    @Property(selector = "showsRoadLabels")
    public native boolean showsRoadLabels();
    @Property(selector = "setShowsRoadLabels:")
    public native void setShowsRoadLabels(boolean v);
    @Property(selector = "pointOfInterestFilter")
    public native MKPointOfInterestFilter getPointOfInterestFilter();
    @Property(selector = "setPointOfInterestFilter:")
    public native void setPointOfInterestFilter(MKPointOfInterestFilter v);
    @Property(selector = "badgePosition")
    public native MKLookAroundBadgePosition getBadgePosition();
    @Property(selector = "setBadgePosition:")
    public native void setBadgePosition(MKLookAroundBadgePosition v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithScene:")
    protected native @Pointer long init(MKLookAroundScene scene);
    @Method(selector = "initWithNibName:bundle:")
    protected native @Pointer long init(String nibNameOrNil, NSBundle nibBundleOrNil);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
