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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIFieldBehavior/*</name>*/ 
    extends /*<extends>*/UIDynamicBehavior/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIFieldBehaviorPtr extends Ptr<UIFieldBehavior, UIFieldBehaviorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIFieldBehavior.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIFieldBehavior() {}
    protected UIFieldBehavior(Handle h, long handle) { super(h, handle); }
    protected UIFieldBehavior(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "items")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<UIDynamicItem> getItems();
    @Property(selector = "position")
    public native @ByVal CGPoint getPosition();
    @Property(selector = "setPosition:")
    public native void setPosition(@ByVal CGPoint v);
    @Property(selector = "region")
    public native UIRegion getRegion();
    @Property(selector = "setRegion:")
    public native void setRegion(UIRegion v);
    @Property(selector = "strength")
    public native @MachineSizedFloat double getStrength();
    @Property(selector = "setStrength:")
    public native void setStrength(@MachineSizedFloat double v);
    @Property(selector = "falloff")
    public native @MachineSizedFloat double getFalloff();
    @Property(selector = "setFalloff:")
    public native void setFalloff(@MachineSizedFloat double v);
    @Property(selector = "minimumRadius")
    public native @MachineSizedFloat double getMinimumRadius();
    @Property(selector = "setMinimumRadius:")
    public native void setMinimumRadius(@MachineSizedFloat double v);
    @Property(selector = "direction")
    public native @ByVal CGVector getDirection();
    @Property(selector = "setDirection:")
    public native void setDirection(@ByVal CGVector v);
    @Property(selector = "smoothness")
    public native @MachineSizedFloat double getSmoothness();
    @Property(selector = "setSmoothness:")
    public native void setSmoothness(@MachineSizedFloat double v);
    @Property(selector = "animationSpeed")
    public native @MachineSizedFloat double getAnimationSpeed();
    @Property(selector = "setAnimationSpeed:")
    public native void setAnimationSpeed(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addItem:")
    public native void addItem(UIDynamicItem item);
    @Method(selector = "removeItem:")
    public native void removeItem(UIDynamicItem item);
    @Method(selector = "dragField")
    public static native UIFieldBehavior drag();
    @Method(selector = "vortexField")
    public static native UIFieldBehavior vortex();
    @Method(selector = "radialGravityFieldWithPosition:")
    public static native UIFieldBehavior radialGravity(@ByVal CGPoint position);
    @Method(selector = "linearGravityFieldWithVector:")
    public static native UIFieldBehavior linearGravity(@ByVal CGVector direction);
    @Method(selector = "velocityFieldWithVector:")
    public static native UIFieldBehavior velocity(@ByVal CGVector direction);
    @Method(selector = "noiseFieldWithSmoothness:animationSpeed:")
    public static native UIFieldBehavior noise(@MachineSizedFloat double smoothness, @MachineSizedFloat double speed);
    @Method(selector = "turbulenceFieldWithSmoothness:animationSpeed:")
    public static native UIFieldBehavior turbulence(@MachineSizedFloat double smoothness, @MachineSizedFloat double speed);
    @Method(selector = "springField")
    public static native UIFieldBehavior spring();
    @Method(selector = "electricField")
    public static native UIFieldBehavior electric();
    @Method(selector = "magneticField")
    public static native UIFieldBehavior magnetic();
    /*</methods>*/
}
