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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GKMatchDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "match:didReceiveData:fromRemotePlayer:")
    void didReceiveData(GKMatch match, NSData data, GKPlayer player);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "match:didReceiveData:forRecipient:fromRemotePlayer:")
    void didReceiveData(GKMatch match, NSData data, GKPlayer recipient, GKPlayer player);
    @Method(selector = "match:player:didChangeConnectionState:")
    void didChangeConnectionState(GKMatch match, GKPlayer player, GKPlayerConnectionState state);
    @Method(selector = "match:didFailWithError:")
    void didFail(GKMatch match, NSError error);
    @Method(selector = "match:shouldReinviteDisconnectedPlayer:")
    boolean shouldReinviteDisconnectedPlayer(GKMatch match, GKPlayer player);
    /**
     * @deprecated Deprecated in iOS 8.0. This is never invoked and its implementation does nothing, use match:didReceiveData:fromRemotePlayer:
     */
    @Deprecated
    @Method(selector = "match:didReceiveData:fromPlayer:")
    void didReceiveData(GKMatch match, NSData data, String playerID);
    /**
     * @deprecated Deprecated in iOS 8.0. This is never invoked and its implementation does nothing, use match:player:didChangeConnectionState:
     */
    @Deprecated
    @Method(selector = "match:player:didChangeState:")
    void didChangeState(GKMatch match, String playerID, GKPlayerConnectionState state);
    /**
     * @deprecated Deprecated in iOS 8.0. This is never invoked and its implementation does nothing, use shouldReinviteDisconnectedPlayer:
     */
    @Deprecated
    @Method(selector = "match:shouldReinvitePlayer:")
    boolean shouldReinvitePlayer(GKMatch match, String playerID);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
