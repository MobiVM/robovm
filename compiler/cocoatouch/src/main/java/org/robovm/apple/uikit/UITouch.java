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
import org.robovm.rt.annotation.WeaklyLinked;
import org.robovm.apple.spritekit.SKNode;

/*<javadoc>*/
/**
 * @since Available in iOS 2.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITouch/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UITouchPtr extends Ptr<UITouch, UITouchPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITouch.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITouch() {}
    protected UITouch(Handle h, long handle) { super(h, handle); }
    protected UITouch(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "timestamp")
    public native double getTimestamp();
    @Property(selector = "phase")
    public native UITouchPhase getPhase();
    @Property(selector = "tapCount")
    public native @MachineSizedUInt long getTapCount();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "type")
    public native UITouchType getType();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "majorRadius")
    public native @MachineSizedFloat double getMajorRadius();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "majorRadiusTolerance")
    public native @MachineSizedFloat double getMajorRadiusTolerance();
    @Property(selector = "window")
    public native UIWindow getWindow();
    @Property(selector = "view")
    public native UIView getView();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Property(selector = "gestureRecognizers")
    public native NSArray<UIGestureRecognizer> getGestureRecognizers();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "force")
    public native @MachineSizedFloat double getForce();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "maximumPossibleForce")
    public native @MachineSizedFloat double getMaximumPossibleForce();
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "altitudeAngle")
    public native @MachineSizedFloat double getAltitudeAngle();
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "estimationUpdateIndex")
    public native NSNumber getEstimationUpdateIndex();
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "estimatedProperties")
    public native UITouchProperties getEstimatedProperties();
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Property(selector = "estimatedPropertiesExpectingUpdates")
    public native UITouchProperties getEstimatedPropertiesExpectingUpdates();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    /* SpriteKit extensions */
    @WeaklyLinked
    public CGPoint getLocationInNode(SKNode node) {
        return org.robovm.apple.spritekit.UITouchExtensions.getLocationInNode(this, node);
    }
    @WeaklyLinked
    public CGPoint getPreviousLocationInNode(SKNode node) {
        return org.robovm.apple.spritekit.UITouchExtensions.getPreviousLocationInNode(this, node);
    }
    
    /*<methods>*/
    @Method(selector = "locationInView:")
    public native @ByVal CGPoint getLocationInView(UIView view);
    @Method(selector = "previousLocationInView:")
    public native @ByVal CGPoint getPreviousLocationInView(UIView view);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Method(selector = "preciseLocationInView:")
    public native @ByVal CGPoint getPreciseLocationInView(UIView view);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Method(selector = "precisePreviousLocationInView:")
    public native @ByVal CGPoint getPrecisePreviousLocationInView(UIView view);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Method(selector = "azimuthAngleInView:")
    public native @MachineSizedFloat double getAzimuthAngleInView(UIView view);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Method(selector = "azimuthUnitVectorInView:")
    public native @ByVal CGVector getAzimuthUnitVectorInView(UIView view);
    /*</methods>*/
}
