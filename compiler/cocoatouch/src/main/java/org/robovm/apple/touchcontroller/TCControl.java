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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/TCControl/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol, TCControlLayout/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "label")
    TCControlLabel getLabel();
    @Property(selector = "colliderShape")
    TCColliderShape getColliderShape();
    @Property(selector = "isPressed")
    boolean isPressed();
    @Property(selector = "isEnabled")
    boolean isEnabled();
    @Property(selector = "setEnabled:")
    void setEnabled(boolean v);
    @Property(selector = "highlightDuration")
    double getHighlightDuration();
    @Property(selector = "setHighlightDuration:")
    void setHighlightDuration(double v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleTouchBeganAtPoint:")
    void handleTouchBeganAtPoint(@ByVal CGPoint point);
    @Method(selector = "handleTouchMovedAtPoint:")
    void handleTouchMovedAtPoint(@ByVal CGPoint point);
    @Method(selector = "handleTouchEndedAtPoint:")
    void handleTouchEndedAtPoint(@ByVal CGPoint point);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
