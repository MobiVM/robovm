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
 * @deprecated Deprecated in iOS 13.0. Use MKPolylineRenderer
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKPolylineView/*</name>*/ 
    extends /*<extends>*/MKOverlayPathView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKPolylineViewPtr extends Ptr<MKPolylineView, MKPolylineViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKPolylineView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKPolylineView() {}
    protected MKPolylineView(Handle h, long handle) { super(h, handle); }
    protected MKPolylineView(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "initWithPolyline:")
    public MKPolylineView(MKPolyline polyline) { super((SkipInit) null); initObject(init(polyline)); }
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "initWithOverlay:")
    public MKPolylineView(MKOverlay overlay) { super(overlay); }
    @Method(selector = "initWithFrame:")
    public MKPolylineView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public MKPolylineView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "polyline")
    public native MKPolyline getPolyline();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "initWithPolyline:")
    protected native @Pointer long init(MKPolyline polyline);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
