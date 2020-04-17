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
package org.robovm.apple.gamekit;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GKMatchmakerViewControllerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "matchmakerViewControllerWasCancelled:")
    void wasCancelled(GKMatchmakerViewController viewController);
    @Method(selector = "matchmakerViewController:didFailWithError:")
    void didFail(GKMatchmakerViewController viewController, NSError error);
    @Method(selector = "matchmakerViewController:didFindMatch:")
    void didFindMatch(GKMatchmakerViewController viewController, GKMatch match);
    @Method(selector = "matchmakerViewController:didFindHostedPlayers:")
    void didFindHostedPlayers(GKMatchmakerViewController viewController, NSArray<GKPlayer> players);
    /**
     * @deprecated Deprecated in iOS 8.0. use matchmakerViewController:didFindHostedPlayers:
     */
    @Deprecated
    @Method(selector = "matchmakerViewController:didFindPlayers:")
    void didFindPlayers(GKMatchmakerViewController viewController, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> playerIDs);
    @Method(selector = "matchmakerViewController:hostedPlayerDidAccept:")
    void hostedPlayerDidAccept(GKMatchmakerViewController viewController, GKPlayer player);
    /**
     * @deprecated Deprecated in iOS 8.0. use matchmakerViewController:hostedPlayerDidAccept:
     */
    @Deprecated
    @Method(selector = "matchmakerViewController:didReceiveAcceptFromHostedPlayer:")
    void didReceiveAccept(GKMatchmakerViewController viewController, String playerID);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
