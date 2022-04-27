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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/CPTemplateApplicationSceneDelegate/*</name>*/ 
    /*<implements>*/extends UISceneDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "templateApplicationScene:didConnectInterfaceController:toWindow:")
    void didConnectInterfaceController(CPTemplateApplicationScene templateApplicationScene, CPInterfaceController interfaceController, CPWindow window);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "templateApplicationScene:didConnectInterfaceController:")
    void didConnectInterfaceController(CPTemplateApplicationScene templateApplicationScene, CPInterfaceController interfaceController);
    @Method(selector = "templateApplicationScene:didDisconnectInterfaceController:fromWindow:")
    void didDisconnectInterfaceController(CPTemplateApplicationScene templateApplicationScene, CPInterfaceController interfaceController, CPWindow window);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "templateApplicationScene:didDisconnectInterfaceController:")
    void didDisconnectInterfaceController(CPTemplateApplicationScene templateApplicationScene, CPInterfaceController interfaceController);
    @Method(selector = "templateApplicationScene:didSelectNavigationAlert:")
    void didSelectNavigationAlert(CPTemplateApplicationScene templateApplicationScene, CPNavigationAlert navigationAlert);
    @Method(selector = "templateApplicationScene:didSelectManeuver:")
    void didSelectManeuver(CPTemplateApplicationScene templateApplicationScene, CPManeuver maneuver);
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Method(selector = "contentStyleDidChange:")
    void contentStyleDidChange(UIUserInterfaceStyle contentStyle);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
