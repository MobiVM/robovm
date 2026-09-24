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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCThrottleDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TCThrottleDescriptorPtr extends Ptr<TCThrottleDescriptor, TCThrottleDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TCThrottleDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TCThrottleDescriptor() {}
    protected TCThrottleDescriptor(Handle h, long handle) { super(h, handle); }
    protected TCThrottleDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native TCControlLabel getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(TCControlLabel v);
    @Property(selector = "backgroundContents")
    public native TCControlContents getBackgroundContents();
    @Property(selector = "setBackgroundContents:")
    public native void setBackgroundContents(TCControlContents v);
    @Property(selector = "indicatorContents")
    public native TCControlContents getIndicatorContents();
    @Property(selector = "setIndicatorContents:")
    public native void setIndicatorContents(TCControlContents v);
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    @Property(selector = "indicatorSize")
    public native @ByVal CGSize getIndicatorSize();
    @Property(selector = "setIndicatorSize:")
    public native void setIndicatorSize(@ByVal CGSize v);
    @Property(selector = "throttleSize")
    public native @ByVal CGSize getThrottleSize();
    @Property(selector = "setThrottleSize:")
    public native void setThrottleSize(@ByVal CGSize v);
    @Property(selector = "orientation")
    public native TCThrottleOrientation getOrientation();
    @Property(selector = "setOrientation:")
    public native void setOrientation(TCThrottleOrientation v);
    @Property(selector = "snapsToBaseValue")
    public native boolean isSnapsToBaseValue();
    @Property(selector = "setSnapsToBaseValue:")
    public native void setSnapsToBaseValue(boolean v);
    @Property(selector = "baseValue")
    public native @MachineSizedFloat double getBaseValue();
    @Property(selector = "setBaseValue:")
    public native void setBaseValue(@MachineSizedFloat double v);
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
    @Property(selector = "colliderShape")
    public native TCColliderShape getColliderShape();
    @Property(selector = "setColliderShape:")
    public native void setColliderShape(TCColliderShape v);
    @Property(selector = "highlightDuration")
    public native double getHighlightDuration();
    @Property(selector = "setHighlightDuration:")
    public native void setHighlightDuration(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
