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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKLocalPlayer/*</name>*/ 
    extends /*<extends>*/GKPlayer/*</extends>*/ 
    /*<implements>*/implements GKSavedGameListener/*</implements>*/ {

    /*<ptr>*/public static class GKLocalPlayerPtr extends Ptr<GKLocalPlayer, GKLocalPlayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKLocalPlayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKLocalPlayer() {}
    protected GKLocalPlayer(Handle h, long handle) { super(h, handle); }
    protected GKLocalPlayer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "local")
    public static native GKLocalPlayer getLocal();
    @Property(selector = "localPlayer")
    public static native GKLocalPlayer getLocalPlayer();
    @Property(selector = "isAuthenticated")
    public native boolean isAuthenticated();
    @Property(selector = "isUnderage")
    public native boolean isUnderage();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isMultiplayerGamingRestricted")
    public native boolean isMultiplayerGamingRestricted();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isPersonalizedCommunicationRestricted")
    public native boolean isPersonalizedCommunicationRestricted();
    /**
     * @deprecated Deprecated in iOS 8.0. This property is obsolete, Use loadFriendPlayersWithCompletionHandler: instead
     */
    @Deprecated
    @Property(selector = "friends")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getFriends();
    @Property(selector = "authenticateHandler")
    public native @Block VoidBlock2<UIViewController, NSError> getAuthenticateHandler();
    @Property(selector = "setAuthenticateHandler:")
    public native void setAuthenticateHandler(@Block VoidBlock2<UIViewController, NSError> v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "isPresentingFriendRequestViewController")
    public native boolean isPresentingFriendRequestViewController();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GKPlayerAuthenticationDidChangeNotificationName", optional=true)
    public static native NSString AuthenticationDidChangeNotification();
    
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "loadRecentPlayersWithCompletionHandler:")
    public native void loadRecentPlayers(@Block VoidBlock2<NSArray<GKPlayer>, NSError> completionHandler);
    @Method(selector = "loadChallengableFriendsWithCompletionHandler:")
    public native void loadChallengableFriends(@Block VoidBlock2<NSArray<GKPlayer>, NSError> completionHandler);
    @Method(selector = "setDefaultLeaderboardIdentifier:completionHandler:")
    public native void setDefaultLeaderboardIdentifier(String leaderboardIdentifier, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "loadDefaultLeaderboardIdentifierWithCompletionHandler:")
    public native void loadDefaultLeaderboardIdentifier(@Block VoidBlock2<NSString, NSError> completionHandler);
    /**
     * @since Available in iOS 13.5 and later.
     */
    @Method(selector = "fetchItemsForIdentityVerificationSignature:")
    public native void fetchItemsForIdentityVerificationSignature(@Block VoidBlock5<NSURL, NSData, NSData, Long, NSError> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "anonymousGuestPlayerWithIdentifier:")
    public static native GKLocalPlayer getAnonymousGuestPlayer(String guestIdentifier);
    @Method(selector = "registerListener:")
    public native void registerListener(GKLocalPlayerListener listener);
    @Method(selector = "unregisterListener:")
    public native void unregisterListener(GKLocalPlayerListener listener);
    @Method(selector = "unregisterAllListeners")
    public native void unregisterAllListeners();
    /**
     * @deprecated Deprecated in iOS 7.0. Use setDefaultLeaderboardIdentifier:completionHandler: instead
     */
    @Deprecated
    @Method(selector = "setDefaultLeaderboardCategoryID:completionHandler:")
    public native void setDefaultLeaderboardCategoryID(String categoryID, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 7.0. Use loadDefaultLeaderboardIdentifierWithCompletionHandler: instead
     */
    @Deprecated
    @Method(selector = "loadDefaultLeaderboardCategoryIDWithCompletionHandler:")
    public native void loadDefaultLeaderboardCategoryID(@Block VoidBlock2<NSString, NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "loadFriendPlayersWithCompletionHandler:")
    public native void loadFriendPlayers(@Block VoidBlock2<NSArray<GKPlayer>, NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 13.5. API deprecated. Use fetchItemsForIdentityVerificationSignature: and the teamPlayerID value to verify a user identity.
     */
    @Deprecated
    @Method(selector = "generateIdentityVerificationSignatureWithCompletionHandler:")
    public native void generateIdentityVerificationSignature(@Block VoidBlock5<NSURL, NSData, NSData, Long, NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 8.0. This is never invoked and its implementation does nothing, use loadRecentPlayersWithCompletionHandler: instead
     */
    @Deprecated
    @Method(selector = "loadFriendsWithCompletionHandler:")
    public native void loadFriends(@Block VoidBlock2<NSArray<NSString>, NSError> completionHandler);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "loadFriendsAuthorizationStatus:")
    public native void loadFriendsAuthorizationStatus(@Block VoidBlock2<GKFriendsAuthorizationStatus, NSError> completionHandler);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "loadFriends:")
    public native void loadFriends2(@Block VoidBlock2<NSArray<GKPlayer>, NSError> completionHandler);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "loadFriendsWithIdentifiers:completionHandler:")
    public native void loadFriends(NSArray<NSString> identifiers, @Block VoidBlock2<NSArray<GKPlayer>, NSError> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    public boolean presentFriendRequestCreator(UIViewController viewController) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = presentFriendRequestCreator(viewController, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "presentFriendRequestCreatorFromViewController:error:")
    private native boolean presentFriendRequestCreator(UIViewController viewController, NSError.NSErrorPtr error);
    @Method(selector = "fetchSavedGamesWithCompletionHandler:")
    public native void fetchSavedGames(@Block VoidBlock2<NSArray<GKSavedGame>, NSError> handler);
    @Method(selector = "saveGameData:withName:completionHandler:")
    public native void saveGameData(NSData data, String name, @Block VoidBlock2<GKSavedGame, NSError> handler);
    @Method(selector = "deleteSavedGamesWithName:completionHandler:")
    public native void deleteSavedGames(String name, @Block VoidBlock1<NSError> handler);
    @Method(selector = "resolveConflictingSavedGames:withData:completionHandler:")
    public native void resolveConflictingSavedGames(NSArray<GKSavedGame> conflictingSavedGames, NSData data, @Block VoidBlock2<NSArray<GKSavedGame>, NSError> handler);
    @Method(selector = "player:didModifySavedGame:")
    public native void didModifySavedGame(GKPlayer player, GKSavedGame savedGame);
    @Method(selector = "player:hasConflictingSavedGames:")
    public native void hasConflictingSavedGames(GKPlayer player, NSArray<GKSavedGame> savedGames);
    /*</methods>*/
}
