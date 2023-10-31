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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKMatchmakerViewControllerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GKMatchmakerViewControllerDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("matchmakerViewControllerWasCancelled:")
    public void wasCancelled(GKMatchmakerViewController viewController) {}
    @NotImplemented("matchmakerViewController:didFailWithError:")
    public void didFail(GKMatchmakerViewController viewController, NSError error) {}
    @NotImplemented("matchmakerViewController:didFindMatch:")
    public void didFindMatch(GKMatchmakerViewController viewController, GKMatch match) {}
    @NotImplemented("matchmakerViewController:didFindHostedPlayers:")
    public void didFindHostedPlayers(GKMatchmakerViewController viewController, NSArray<GKPlayer> players) {}
    @NotImplemented("matchmakerViewController:hostedPlayerDidAccept:")
    public void hostedPlayerDidAccept(GKMatchmakerViewController viewController, GKPlayer player) {}
    /**
     * @deprecated Deprecated in iOS 8.0. Use -matchmakerViewController:didFindHostedPlayers:
     */
    @Deprecated
    @NotImplemented("matchmakerViewController:didFindPlayers:")
    public void didFindPlayers(GKMatchmakerViewController viewController, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> playerIDs) {}
    /**
     * @deprecated Deprecated in iOS 8.0. Use -matchmakerViewController:hostedPlayerDidAccept:
     */
    @Deprecated
    @NotImplemented("matchmakerViewController:didReceiveAcceptFromHostedPlayer:")
    public void didReceiveAccept(GKMatchmakerViewController viewController, String playerID) {}
    /*</methods>*/
}
