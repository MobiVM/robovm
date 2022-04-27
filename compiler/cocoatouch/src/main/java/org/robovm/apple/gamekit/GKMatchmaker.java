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
/*<annotations>*/@Library("GameKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKMatchmaker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKMatchmakerPtr extends Ptr<GKMatchmaker, GKMatchmakerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKMatchmaker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKMatchmaker() {}
    protected GKMatchmaker(Handle h, long handle) { super(h, handle); }
    protected GKMatchmaker(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 7.0. Use registerListener on GKLocalPlayer to register an object that implements the GKInviteEventListenerProtocol instead
     */
    @Deprecated
    @Property(selector = "inviteHandler")
    public native @Block VoidBlock2<GKInvite, NSArray<?>> getInviteHandler();
    /**
     * @deprecated Deprecated in iOS 7.0. Use registerListener on GKLocalPlayer to register an object that implements the GKInviteEventListenerProtocol instead
     */
    @Deprecated
    @Property(selector = "setInviteHandler:")
    public native void setInviteHandler(@Block VoidBlock2<GKInvite, NSArray<?>> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "matchForInvite:completionHandler:")
    public native void match(GKInvite invite, @Block VoidBlock2<GKMatch, NSError> completionHandler);
    @Method(selector = "findMatchForRequest:withCompletionHandler:")
    public native void findMatch(GKMatchRequest request, @Block VoidBlock2<GKMatch, NSError> completionHandler);
    @Method(selector = "findPlayersForHostedRequest:withCompletionHandler:")
    public native void findPlayersForHostedRequest(GKMatchRequest request, @Block VoidBlock2<NSArray<GKPlayer>, NSError> completionHandler);
    @Method(selector = "addPlayersToMatch:matchRequest:completionHandler:")
    public native void addPlayersToMatch(GKMatch match, GKMatchRequest matchRequest, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "cancelPendingInviteToPlayer:")
    public native void cancelPendingInvite(GKPlayer player);
    @Method(selector = "finishMatchmakingForMatch:")
    public native void finishMatchmaking(GKMatch match);
    @Method(selector = "queryPlayerGroupActivity:withCompletionHandler:")
    public native void queryPlayerGroupActivity(@MachineSizedUInt long playerGroup, @Block("(@MachineSizedSInt,)") VoidBlock2<Long, NSError> completionHandler);
    @Method(selector = "queryActivityWithCompletionHandler:")
    public native void queryActivity(@Block("(@MachineSizedSInt,)") VoidBlock2<Long, NSError> completionHandler);
    @Method(selector = "startBrowsingForNearbyPlayersWithHandler:")
    public native void startNearbyPlayersBrowsing(@Block VoidBlock2<GKPlayer, Boolean> reachableHandler);
    @Method(selector = "stopBrowsingForNearbyPlayers")
    public native void stopBrowsingForNearbyPlayers();
    @Method(selector = "sharedMatchmaker")
    public static native GKMatchmaker getSharedMatchmaker();
    /**
     * @deprecated Deprecated in iOS 8.0. This is never invoked and its implementation does nothing, Use startBrowsingForNearbyPlayersWithHandler: instead
     */
    @Deprecated
    @Method(selector = "startBrowsingForNearbyPlayersWithReachableHandler:")
    public native void startBrowsingForNearbyPlayers(@Block VoidBlock2<NSString, Boolean> reachableHandler);
    /**
     * @deprecated Deprecated in iOS 8.0. This is never invoked and its implementation does nothing, use cancelPendingInviteToPlayer:
     */
    @Deprecated
    @Method(selector = "cancelInviteToPlayer:")
    public native void cancelInvite(String playerID);
    /**
     * @deprecated Deprecated in iOS 8.0. This is never invoked and its implementation does nothing, use findPlayersForHostedRequest:
     */
    @Deprecated
    @Method(selector = "findPlayersForHostedMatchRequest:withCompletionHandler:")
    public native void findPlayers(GKMatchRequest request, @Block VoidBlock2<NSArray<NSString>, NSError> completionHandler);
    /*</methods>*/
}
