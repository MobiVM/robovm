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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISpringTimingParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UITimingCurveProvider/*</implements>*/ {

    /*<ptr>*/public static class UISpringTimingParametersPtr extends Ptr<UISpringTimingParameters, UISpringTimingParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISpringTimingParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UISpringTimingParameters() {}
    protected UISpringTimingParameters(Handle h, long handle) { super(h, handle); }
    protected UISpringTimingParameters(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UISpringTimingParameters(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    @Method(selector = "initWithDampingRatio:initialVelocity:")
    public UISpringTimingParameters(@MachineSizedFloat double ratio, @ByVal CGVector velocity) { super((SkipInit) null); initObject(init(ratio, velocity)); }
    @Method(selector = "initWithMass:stiffness:damping:initialVelocity:")
    public UISpringTimingParameters(@MachineSizedFloat double mass, @MachineSizedFloat double stiffness, @MachineSizedFloat double damping, @ByVal CGVector velocity) { super((SkipInit) null); initObject(init(mass, stiffness, damping, velocity)); }
    @Method(selector = "initWithDampingRatio:")
    public UISpringTimingParameters(@MachineSizedFloat double ratio) { super((SkipInit) null); initObject(init(ratio)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "initialVelocity")
    public native @ByVal CGVector getInitialVelocity();
    @Property(selector = "timingCurveType")
    public native UITimingCurveType getTimingCurveType();
    @Property(selector = "cubicTimingParameters")
    public native UICubicTimingParameters getCubicTimingParameters();
    @Property(selector = "springTimingParameters")
    public native UISpringTimingParameters getSpringTimingParameters();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    @Method(selector = "initWithDampingRatio:initialVelocity:")
    protected native @Pointer long init(@MachineSizedFloat double ratio, @ByVal CGVector velocity);
    @Method(selector = "initWithMass:stiffness:damping:initialVelocity:")
    protected native @Pointer long init(@MachineSizedFloat double mass, @MachineSizedFloat double stiffness, @MachineSizedFloat double damping, @ByVal CGVector velocity);
    @Method(selector = "initWithDampingRatio:")
    protected native @Pointer long init(@MachineSizedFloat double ratio);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
