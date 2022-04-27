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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKPlayer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKPlayerPtr extends Ptr<GKPlayer, GKPlayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKPlayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKPlayer() {}
    protected GKPlayer(Handle h, long handle) { super(h, handle); }
    protected GKPlayer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.4 and later.
     */
    @Property(selector = "gamePlayerID")
    public native String getGamePlayerID();
    /**
     * @since Available in iOS 12.4 and later.
     */
    @Property(selector = "teamPlayerID")
    public native String getTeamPlayerID();
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "alias")
    public native String getAlias();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "guestIdentifier")
    public native String getGuestIdentifier();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isInvitable")
    public native boolean isInvitable();
    /**
     * @deprecated Deprecated in iOS 8.0. use -[GKLocalPlayer loadFriendPlayers...]
     */
    @Deprecated
    @Property(selector = "isFriend")
    public native boolean isFriend();
    /**
     * @deprecated Deprecated in iOS 13.0. use the teamPlayerID property to identify a player
     */
    @Deprecated
    @Property(selector = "playerID")
    public native String getPlayerID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GKPlayerIDNoLongerAvailable", optional=true)
    public static native NSString IDNoLongerAvailable();
    @GlobalValue(symbol="GKPlayerDidChangeNotificationName", optional=true)
    public static native NSString DidChangeNotification();
    
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "scopedIDsArePersistent")
    public native boolean scopedIDsArePersistent();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "anonymousGuestPlayerWithIdentifier:")
    public static native GKPlayer getAnonymousGuestPlayer(String guestIdentifier);
    @Method(selector = "loadPhotoForSize:withCompletionHandler:")
    public native void loadPhoto(GKPhotoSize size, @Block VoidBlock2<UIImage, NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 14.5. use GKLocalPlayer.loadFriendsWithIdentifiers to load a friend's GKPlayer object.
     */
    @Deprecated
    @Method(selector = "loadPlayersForIdentifiers:withCompletionHandler:")
    public static native void loadPlayers(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> identifiers, @Block VoidBlock2<NSArray<GKPlayer>, NSError> completionHandler);
    /*</methods>*/
}
