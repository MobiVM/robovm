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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKGradientPolylineRenderer/*</name>*/ 
    extends /*<extends>*/MKPolylineRenderer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKGradientPolylineRendererPtr extends Ptr<MKGradientPolylineRenderer, MKGradientPolylineRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKGradientPolylineRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKGradientPolylineRenderer() {}
    protected MKGradientPolylineRenderer(Handle h, long handle) { super(h, handle); }
    protected MKGradientPolylineRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPolyline:")
    public MKGradientPolylineRenderer(MKPolyline polyline) { super(polyline); }
    @Method(selector = "initWithOverlay:")
    public MKGradientPolylineRenderer(MKOverlay overlay) { super(overlay); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "locations")
    public native NSArray<NSNumber> getLocations();
    @Property(selector = "colors")
    public native NSArray<UIColor> getColors();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setColors:atLocations:")
    public native void setColors(NSArray<UIColor> colors, NSArray<NSNumber> locations);
    /*</methods>*/
}
