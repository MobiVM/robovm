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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICubicTimingParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UITimingCurveProvider/*</implements>*/ {

    /*<ptr>*/public static class UICubicTimingParametersPtr extends Ptr<UICubicTimingParameters, UICubicTimingParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICubicTimingParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UICubicTimingParameters() {}
    protected UICubicTimingParameters(Handle h, long handle) { super(h, handle); }
    protected UICubicTimingParameters(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UICubicTimingParameters(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    @Method(selector = "initWithAnimationCurve:")
    public UICubicTimingParameters(UIViewAnimationCurve curve) { super((SkipInit) null); initObject(init(curve)); }
    @Method(selector = "initWithControlPoint1:controlPoint2:")
    public UICubicTimingParameters(@ByVal CGPoint point1, @ByVal CGPoint point2) { super((SkipInit) null); initObject(init(point1, point2)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "animationCurve")
    public native UIViewAnimationCurve getAnimationCurve();
    @Property(selector = "controlPoint1")
    public native @ByVal CGPoint getControlPoint1();
    @Property(selector = "controlPoint2")
    public native @ByVal CGPoint getControlPoint2();
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
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "initWithAnimationCurve:")
    protected native @Pointer long init(UIViewAnimationCurve curve);
    @Method(selector = "initWithControlPoint1:controlPoint2:")
    protected native @Pointer long init(@ByVal CGPoint point1, @ByVal CGPoint point2);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
