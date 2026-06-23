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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCControlAdapter/*</name>*/ 
    extends /*<extends>*/TCControlLayoutAdapter/*</extends>*/ 
    /*<implements>*/implements TCControl/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("label")
    public TCControlLabel getLabel() { return null; }
    @NotImplemented("colliderShape")
    public TCColliderShape getColliderShape() { return null; }
    @NotImplemented("isPressed")
    public boolean isPressed() { return false; }
    @NotImplemented("isEnabled")
    public boolean isEnabled() { return false; }
    @NotImplemented("setEnabled:")
    public void setEnabled(boolean v) {}
    @NotImplemented("highlightDuration")
    public double getHighlightDuration() { return 0; }
    @NotImplemented("setHighlightDuration:")
    public void setHighlightDuration(double v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("handleTouchBeganAtPoint:")
    public void handleTouchBeganAtPoint(@ByVal CGPoint point) {}
    @NotImplemented("handleTouchMovedAtPoint:")
    public void handleTouchMovedAtPoint(@ByVal CGPoint point) {}
    @NotImplemented("handleTouchEndedAtPoint:")
    public void handleTouchEndedAtPoint(@ByVal CGPoint point) {}
    /*</methods>*/
}
