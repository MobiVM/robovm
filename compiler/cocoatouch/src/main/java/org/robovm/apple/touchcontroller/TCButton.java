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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCButton/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TCControl, TCControlLayout/*</implements>*/ {

    /*<ptr>*/public static class TCButtonPtr extends Ptr<TCButton, TCButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TCButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TCButton() {}
    protected TCButton(Handle h, long handle) { super(h, handle); }
    protected TCButton(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contents")
    public native TCControlContents getContents();
    @Property(selector = "setContents:")
    public native void setContents(TCControlContents v);
    @Property(selector = "highlightDuration")
    public native double getHighlightDuration();
    @Property(selector = "setHighlightDuration:")
    public native void setHighlightDuration(double v);
    @Property(selector = "colliderShape")
    public native TCColliderShape getColliderShape();
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
