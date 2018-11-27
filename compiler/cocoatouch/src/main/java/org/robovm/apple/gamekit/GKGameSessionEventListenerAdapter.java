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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKGameSessionEventListenerAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GKGameSessionEventListener/*</implements>*/ {

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
    @NotImplemented("session:didAddPlayer:")
    public void didAddPlayer(GKGameSession session, GKCloudPlayer player) {}
    @NotImplemented("session:didRemovePlayer:")
    public void didRemovePlayer(GKGameSession session, GKCloudPlayer player) {}
    @NotImplemented("session:player:didChangeConnectionState:")
    public void didChangeConnectionState(GKGameSession session, GKCloudPlayer player, GKConnectionState newState) {}
    @NotImplemented("session:player:didSaveData:")
    public void didSaveData(GKGameSession session, GKCloudPlayer player, NSData data) {}
    @NotImplemented("session:didReceiveData:fromPlayer:")
    public void didReceiveData(GKGameSession session, NSData data, GKCloudPlayer player) {}
    @NotImplemented("session:didReceiveMessage:withData:fromPlayer:")
    public void didReceiveMessage(GKGameSession session, String message, NSData data, GKCloudPlayer player) {}
    /*</methods>*/
}
