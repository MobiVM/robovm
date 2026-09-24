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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKStandardMapConfiguration/*</name>*/ 
    extends /*<extends>*/MKMapConfiguration/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKStandardMapConfigurationPtr extends Ptr<MKStandardMapConfiguration, MKStandardMapConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKStandardMapConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKStandardMapConfiguration() {}
    protected MKStandardMapConfiguration(Handle h, long handle) { super(h, handle); }
    protected MKStandardMapConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithElevationStyle:")
    public MKStandardMapConfiguration(MKMapElevationStyle elevationStyle) { super((SkipInit) null); initObject(init(elevationStyle)); }
    @Method(selector = "initWithElevationStyle:emphasisStyle:")
    public MKStandardMapConfiguration(MKMapElevationStyle elevationStyle, MKStandardMapEmphasisStyle emphasisStyle) { super((SkipInit) null); initObject(init(elevationStyle, emphasisStyle)); }
    @Method(selector = "initWithEmphasisStyle:")
    public MKStandardMapConfiguration(MKStandardMapEmphasisStyle emphasisStyle) { super((SkipInit) null); initObject(init(emphasisStyle)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "emphasisStyle")
    public native MKStandardMapEmphasisStyle getEmphasisStyle();
    @Property(selector = "setEmphasisStyle:")
    public native void setEmphasisStyle(MKStandardMapEmphasisStyle v);
    @Property(selector = "pointOfInterestFilter")
    public native MKPointOfInterestFilter getPointOfInterestFilter();
    @Property(selector = "setPointOfInterestFilter:")
    public native void setPointOfInterestFilter(MKPointOfInterestFilter v);
    @Property(selector = "showsTraffic")
    public native boolean showsTraffic();
    @Property(selector = "setShowsTraffic:")
    public native void setShowsTraffic(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithElevationStyle:")
    protected native @Pointer long init(MKMapElevationStyle elevationStyle);
    @Method(selector = "initWithElevationStyle:emphasisStyle:")
    protected native @Pointer long init(MKMapElevationStyle elevationStyle, MKStandardMapEmphasisStyle emphasisStyle);
    @Method(selector = "initWithEmphasisStyle:")
    protected native @Pointer long init(MKStandardMapEmphasisStyle emphasisStyle);
    /*</methods>*/
}
