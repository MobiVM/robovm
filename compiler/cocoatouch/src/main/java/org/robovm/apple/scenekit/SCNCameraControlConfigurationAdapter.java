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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNCameraControlConfigurationAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SCNCameraControlConfiguration/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("autoSwitchToFreeCamera")
    public boolean isAutoSwitchToFreeCamera() { return false; }
    @NotImplemented("setAutoSwitchToFreeCamera:")
    public void setAutoSwitchToFreeCamera(boolean v) {}
    @NotImplemented("allowsTranslation")
    public boolean allowsTranslation() { return false; }
    @NotImplemented("setAllowsTranslation:")
    public void setAllowsTranslation(boolean v) {}
    @NotImplemented("flyModeVelocity")
    public @MachineSizedFloat double getFlyModeVelocity() { return 0; }
    @NotImplemented("setFlyModeVelocity:")
    public void setFlyModeVelocity(@MachineSizedFloat double v) {}
    @NotImplemented("panSensitivity")
    public @MachineSizedFloat double getPanSensitivity() { return 0; }
    @NotImplemented("setPanSensitivity:")
    public void setPanSensitivity(@MachineSizedFloat double v) {}
    @NotImplemented("truckSensitivity")
    public @MachineSizedFloat double getTruckSensitivity() { return 0; }
    @NotImplemented("setTruckSensitivity:")
    public void setTruckSensitivity(@MachineSizedFloat double v) {}
    @NotImplemented("rotationSensitivity")
    public @MachineSizedFloat double getRotationSensitivity() { return 0; }
    @NotImplemented("setRotationSensitivity:")
    public void setRotationSensitivity(@MachineSizedFloat double v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
