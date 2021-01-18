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
package org.robovm.apple.pencilkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PencilKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKStrokePoint/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKStrokePointPtr extends Ptr<PKStrokePoint, PKStrokePointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKStrokePoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKStrokePoint() {}
    protected PKStrokePoint(Handle h, long handle) { super(h, handle); }
    protected PKStrokePoint(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLocation:timeOffset:size:opacity:force:azimuth:altitude:")
    public PKStrokePoint(@ByVal CGPoint location, double timeOffset, @ByVal CGSize size, @MachineSizedFloat double opacity, @MachineSizedFloat double force, @MachineSizedFloat double azimuth, @MachineSizedFloat double altitude) { super((SkipInit) null); initObject(init(location, timeOffset, size, opacity, force, azimuth, altitude)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "location")
    public native @ByVal CGPoint getLocation();
    @Property(selector = "timeOffset")
    public native double getTimeOffset();
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "opacity")
    public native @MachineSizedFloat double getOpacity();
    @Property(selector = "azimuth")
    public native @MachineSizedFloat double getAzimuth();
    @Property(selector = "force")
    public native @MachineSizedFloat double getForce();
    @Property(selector = "altitude")
    public native @MachineSizedFloat double getAltitude();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLocation:timeOffset:size:opacity:force:azimuth:altitude:")
    protected native @Pointer long init(@ByVal CGPoint location, double timeOffset, @ByVal CGSize size, @MachineSizedFloat double opacity, @MachineSizedFloat double force, @MachineSizedFloat double azimuth, @MachineSizedFloat double altitude);
    /*</methods>*/
}
