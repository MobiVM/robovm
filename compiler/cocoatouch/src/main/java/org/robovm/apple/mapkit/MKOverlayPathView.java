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
 * @deprecated Deprecated in iOS 13.0. Use MKOverlayPathRenderer
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKOverlayPathView/*</name>*/ 
    extends /*<extends>*/MKOverlayView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKOverlayPathViewPtr extends Ptr<MKOverlayPathView, MKOverlayPathViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKOverlayPathView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKOverlayPathView() {}
    protected MKOverlayPathView(Handle h, long handle) { super(h, handle); }
    protected MKOverlayPathView(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "initWithOverlay:")
    public MKOverlayPathView(MKOverlay overlay) { super(overlay); }
    @Method(selector = "initWithFrame:")
    public MKOverlayPathView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public MKOverlayPathView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "fillColor")
    public native UIColor getFillColor();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "setFillColor:")
    public native void setFillColor(UIColor v);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "strokeColor")
    public native UIColor getStrokeColor();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "setStrokeColor:")
    public native void setStrokeColor(UIColor v);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "lineWidth")
    public native @MachineSizedFloat double getLineWidth();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "setLineWidth:")
    public native void setLineWidth(@MachineSizedFloat double v);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "lineJoin")
    public native CGLineJoin getLineJoin();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "setLineJoin:")
    public native void setLineJoin(CGLineJoin v);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "lineCap")
    public native CGLineCap getLineCap();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "setLineCap:")
    public native void setLineCap(CGLineCap v);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "miterLimit")
    public native @MachineSizedFloat double getMiterLimit();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "setMiterLimit:")
    public native void setMiterLimit(@MachineSizedFloat double v);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "lineDashPhase")
    public native @MachineSizedFloat double getLineDashPhase();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "setLineDashPhase:")
    public native void setLineDashPhase(@MachineSizedFloat double v);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "lineDashPattern")
    public native NSArray<NSNumber> getLineDashPattern();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "setLineDashPattern:")
    public native void setLineDashPattern(NSArray<NSNumber> v);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "path")
    public native CGPath getPath();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "setPath:")
    public native void setPath(CGPath v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "createPath")
    public native void createPath();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "invalidatePath")
    public native void invalidatePath();
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "applyStrokePropertiesToContext:atZoomScale:")
    public native void applyStrokeProperties(CGContext context, @MachineSizedFloat double zoomScale);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "applyFillPropertiesToContext:atZoomScale:")
    public native void applyFillProperties(CGContext context, @MachineSizedFloat double zoomScale);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "strokePath:inContext:")
    public native void strokePath(CGPath path, CGContext context);
    /**
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "fillPath:inContext:")
    public native void fillPath(CGPath path, CGContext context);
    /*</methods>*/
}
