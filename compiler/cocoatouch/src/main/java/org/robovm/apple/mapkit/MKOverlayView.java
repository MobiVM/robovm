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
 * @deprecated Deprecated in iOS 13.0. Use MKOverlayRenderer
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKOverlayView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKOverlayViewPtr extends Ptr<MKOverlayView, MKOverlayViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKOverlayView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKOverlayView() {}
    protected MKOverlayView(Handle h, long handle) { super(h, handle); }
    protected MKOverlayView(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "initWithOverlay:")
    public MKOverlayView(MKOverlay overlay) { super((SkipInit) null); initObject(init(overlay)); }
    @Method(selector = "initWithFrame:")
    public MKOverlayView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public MKOverlayView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "overlay")
    public native MKOverlay getOverlay();
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
    @Method(selector = "initWithOverlay:")
    protected native @Pointer long init(MKOverlay overlay);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "pointForMapPoint:")
    public native @ByVal CGPoint getPoint(@ByVal MKMapPoint mapPoint);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "mapPointForPoint:")
    public native @ByVal MKMapPoint getMapPoint(@ByVal CGPoint point);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "rectForMapRect:")
    public native @ByVal CGRect getRect(@ByVal MKMapRect mapRect);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "mapRectForRect:")
    public native @ByVal MKMapRect getMapRect(@ByVal CGRect rect);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "canDrawMapRect:zoomScale:")
    public native boolean canDraw(@ByVal MKMapRect mapRect, @MachineSizedFloat double zoomScale);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "drawMapRect:zoomScale:inContext:")
    public native void draw(@ByVal MKMapRect mapRect, @MachineSizedFloat double zoomScale, CGContext context);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "setNeedsDisplayInMapRect:")
    public native void setNeedsDisplay(@ByVal MKMapRect mapRect);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "setNeedsDisplayInMapRect:zoomScale:")
    public native void setNeedsDisplay(@ByVal MKMapRect mapRect, @MachineSizedFloat double zoomScale);
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
