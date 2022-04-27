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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKCircleRenderer/*</name>*/ 
    extends /*<extends>*/MKOverlayPathRenderer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKCircleRendererPtr extends Ptr<MKCircleRenderer, MKCircleRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKCircleRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKCircleRenderer() {}
    protected MKCircleRenderer(Handle h, long handle) { super(h, handle); }
    protected MKCircleRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCircle:")
    public MKCircleRenderer(MKCircle circle) { super((SkipInit) null); initObject(init(circle)); }
    @Method(selector = "initWithOverlay:")
    public MKCircleRenderer(MKOverlay overlay) { super(overlay); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "circle")
    public native MKCircle getCircle();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "strokeStart")
    public native @MachineSizedFloat double getStrokeStart();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setStrokeStart:")
    public native void setStrokeStart(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "strokeEnd")
    public native @MachineSizedFloat double getStrokeEnd();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setStrokeEnd:")
    public native void setStrokeEnd(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCircle:")
    protected native @Pointer long init(MKCircle circle);
    /*</methods>*/
}
