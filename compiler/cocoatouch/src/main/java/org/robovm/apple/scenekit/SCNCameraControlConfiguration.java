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
package org.robovm.apple.scenekit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/SCNCameraControlConfiguration/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "autoSwitchToFreeCamera")
    boolean isAutoSwitchToFreeCamera();
    @Property(selector = "setAutoSwitchToFreeCamera:")
    void setAutoSwitchToFreeCamera(boolean v);
    @Property(selector = "allowsTranslation")
    boolean allowsTranslation();
    @Property(selector = "setAllowsTranslation:")
    void setAllowsTranslation(boolean v);
    @Property(selector = "flyModeVelocity")
    @MachineSizedFloat double getFlyModeVelocity();
    @Property(selector = "setFlyModeVelocity:")
    void setFlyModeVelocity(@MachineSizedFloat double v);
    @Property(selector = "panSensitivity")
    @MachineSizedFloat double getPanSensitivity();
    @Property(selector = "setPanSensitivity:")
    void setPanSensitivity(@MachineSizedFloat double v);
    @Property(selector = "truckSensitivity")
    @MachineSizedFloat double getTruckSensitivity();
    @Property(selector = "setTruckSensitivity:")
    void setTruckSensitivity(@MachineSizedFloat double v);
    @Property(selector = "rotationSensitivity")
    @MachineSizedFloat double getRotationSensitivity();
    @Property(selector = "setRotationSensitivity:")
    void setRotationSensitivity(@MachineSizedFloat double v);
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
