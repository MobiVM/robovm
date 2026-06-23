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
package org.robovm.apple.touchcontroller;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalkit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.gamecontroller.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("TouchController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCThrottle/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TCControl, TCControlLayout/*</implements>*/ {

    /*<ptr>*/public static class TCThrottlePtr extends Ptr<TCThrottle, TCThrottlePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TCThrottle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TCThrottle() {}
    protected TCThrottle(Handle h, long handle) { super(h, handle); }
    protected TCThrottle(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "backgroundContents")
    public native TCControlContents getBackgroundContents();
    @Property(selector = "setBackgroundContents:")
    public native void setBackgroundContents(TCControlContents v);
    @Property(selector = "indicatorContents")
    public native TCControlContents getIndicatorContents();
    @Property(selector = "setIndicatorContents:")
    public native void setIndicatorContents(TCControlContents v);
    @Property(selector = "orientation")
    public native TCThrottleOrientation getOrientation();
    @Property(selector = "snapsToBaseValue")
    public native boolean isSnapsToBaseValue();
    @Property(selector = "setSnapsToBaseValue:")
    public native void setSnapsToBaseValue(boolean v);
    @Property(selector = "baseValue")
    public native @MachineSizedFloat double getBaseValue();
    @Property(selector = "setBaseValue:")
    public native void setBaseValue(@MachineSizedFloat double v);
    @Property(selector = "indicatorSize")
    public native @ByVal CGSize getIndicatorSize();
    @Property(selector = "setIndicatorSize:")
    public native void setIndicatorSize(@ByVal CGSize v);
    @Property(selector = "throttleSize")
    public native @ByVal CGSize getThrottleSize();
    @Property(selector = "setThrottleSize:")
    public native void setThrottleSize(@ByVal CGSize v);
    @Property(selector = "colliderShape")
    public native TCColliderShape getColliderShape();
    @Property(selector = "highlightDuration")
    public native double getHighlightDuration();
    @Property(selector = "setHighlightDuration:")
    public native void setHighlightDuration(double v);
    @Property(selector = "label")
    public native TCControlLabel getLabel();
    @Property(selector = "isPressed")
    public native boolean isPressed();
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "anchor")
    public native TCControlLayoutAnchor getAnchor();
    @Property(selector = "setAnchor:")
    public native void setAnchor(TCControlLayoutAnchor v);
    @Property(selector = "anchorCoordinateSystem")
    public native TCControlLayoutAnchorCoordinateSystem getAnchorCoordinateSystem();
    @Property(selector = "setAnchorCoordinateSystem:")
    public native void setAnchorCoordinateSystem(TCControlLayoutAnchorCoordinateSystem v);
    @Property(selector = "offset")
    public native @ByVal CGPoint getOffset();
    @Property(selector = "setOffset:")
    public native void setOffset(@ByVal CGPoint v);
    @Property(selector = "zIndex")
    public native @MachineSizedSInt long getZIndex();
    @Property(selector = "setZIndex:")
    public native void setZIndex(@MachineSizedSInt long v);
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    @Property(selector = "position")
    public native @ByVal CGPoint getPosition();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "handleTouchBeganAtPoint:")
    public native void handleTouchBeganAtPoint(@ByVal CGPoint point);
    @Method(selector = "handleTouchMovedAtPoint:")
    public native void handleTouchMovedAtPoint(@ByVal CGPoint point);
    @Method(selector = "handleTouchEndedAtPoint:")
    public native void handleTouchEndedAtPoint(@ByVal CGPoint point);
    /*</methods>*/
}
