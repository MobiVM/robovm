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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UISceneDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "scene:willConnectToSession:options:")
    void willConnect(UIScene scene, UISceneSession session, UISceneConnectionOptions connectionOptions);
    @Method(selector = "sceneDidDisconnect:")
    void sceneDidDisconnect(UIScene scene);
    @Method(selector = "sceneDidBecomeActive:")
    void sceneDidBecomeActive(UIScene scene);
    @Method(selector = "sceneWillResignActive:")
    void sceneWillResignActive(UIScene scene);
    @Method(selector = "sceneWillEnterForeground:")
    void sceneWillEnterForeground(UIScene scene);
    @Method(selector = "sceneDidEnterBackground:")
    void sceneDidEnterBackground(UIScene scene);
    @Method(selector = "scene:openURLContexts:")
    void openURLContexts(UIScene scene, NSSet<UIOpenURLContext> URLContexts);
    @Method(selector = "stateRestorationActivityForScene:")
    NSUserActivity stateRestorationActivityForScene(UIScene scene);
    @Method(selector = "scene:restoreInteractionStateWithUserActivity:")
    void restoreInteractionState(UIScene scene, NSUserActivity stateRestorationActivity);
    @Method(selector = "scene:willContinueUserActivityWithType:")
    void willContinueUserActivity(UIScene scene, String userActivityType);
    @Method(selector = "scene:continueUserActivity:")
    void continueUserActivity(UIScene scene, NSUserActivity userActivity);
    @Method(selector = "scene:didFailToContinueUserActivityWithType:error:")
    void didFailToContinueUserActivity(UIScene scene, String userActivityType, NSError error);
    @Method(selector = "scene:didUpdateUserActivity:")
    void didUpdateUserActivity(UIScene scene, NSUserActivity userActivity);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
