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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKLeaderboard/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKLeaderboardPtr extends Ptr<GKLeaderboard, GKLeaderboardPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKLeaderboard.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKLeaderboard() {}
    protected GKLeaderboard(Handle h, long handle) { super(h, handle); }
    protected GKLeaderboard(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Deprecated in iOS 8.0. Use initWithPlayers: instead
     */
    @Deprecated
    @Method(selector = "initWithPlayerIDs:")
    public GKLeaderboard(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> playerIDs) { super((SkipInit) null); initObject(init(playerIDs)); }
    /**
     * @deprecated Deprecated in iOS 14.0. Use instance method loadEntriesForPlayers:timeScope:completionHandler: instead.
     */
    @Deprecated
    @Method(selector = "initWithPlayers:")
    public GKLeaderboard(NSArray<GKPlayer> players) { super((SkipInit) null); initObject(init(players)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "groupIdentifier")
    public native String getGroupIdentifier();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "baseLeaderboardID")
    public native String getBaseLeaderboardID();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "type")
    public native GKLeaderboardType getType();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "nextStartDate")
    public native NSDate getNextStartDate();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "duration")
    public native double getDuration();
    /**
     * @deprecated Deprecated in iOS 7.0. Use identifier instead
     */
    @Deprecated
    @Property(selector = "category")
    public native String getCategory();
    /**
     * @deprecated Deprecated in iOS 7.0. Use identifier instead
     */
    @Deprecated
    @Property(selector = "setCategory:")
    public native void setCategory(String v);
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Property(selector = "timeScope")
    public native GKLeaderboardTimeScope getTimeScope();
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Property(selector = "setTimeScope:")
    public native void setTimeScope(GKLeaderboardTimeScope v);
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Property(selector = "playerScope")
    public native GKLeaderboardPlayerScope getPlayerScope();
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Property(selector = "setPlayerScope:")
    public native void setPlayerScope(GKLeaderboardPlayerScope v);
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Property(selector = "identifier")
    public native String getIdentifier();
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Property(selector = "range")
    public native @ByVal NSRange getRange();
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler: instead.
     */
    @Deprecated
    @Property(selector = "setRange:")
    public native void setRange(@ByVal NSRange v);
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler: to obtain scores.
     */
    @Deprecated
    @Property(selector = "scores")
    public native NSArray<GKScore> getScores();
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler: method to obtain the size of the leaderboard.
     */
    @Deprecated
    @Property(selector = "maxRange")
    public native @MachineSizedUInt long getMaxRange();
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler: method to obtain scores.
     */
    @Deprecated
    @Property(selector = "localPlayerScore")
    public native GKScore getLocalPlayerScore();
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler: method to obtain scores.
     */
    @Deprecated
    @Property(selector = "isLoading")
    public native boolean isLoading();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "loadPreviousOccurrenceWithCompletionHandler:")
    public native void loadPreviousOccurrence(@Block VoidBlock2<GKLeaderboard, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "submitScore:context:player:completionHandler:")
    public native void submitScore(@MachineSizedSInt long score, @MachineSizedUInt long context, GKPlayer player, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "loadEntriesForPlayerScope:timeScope:range:completionHandler:")
    public native void loadEntriesForPlayerScope(GKLeaderboardPlayerScope playerScope, GKLeaderboardTimeScope timeScope, @ByVal NSRange range, @Block("(,,@MachineSizedSInt,)") VoidBlock4<GKLeaderboardEntry, NSArray<GKLeaderboardEntry>, Long, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "loadEntriesForPlayers:timeScope:completionHandler:")
    public native void loadEntriesForPlayers(NSArray<GKPlayer> players, GKLeaderboardTimeScope timeScope, @Block VoidBlock3<GKLeaderboardEntry, NSArray<GKLeaderboardEntry>, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "loadLeaderboardsWithIDs:completionHandler:")
    public static native void loadLeaderboards(NSArray<NSString> leaderboardIDs, @Block VoidBlock2<NSArray<GKLeaderboard>, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "submitScore:context:player:leaderboardIDs:completionHandler:")
    public static native void submitScore(@MachineSizedSInt long score, @MachineSizedUInt long context, GKPlayer player, NSArray<NSString> leaderboardIDs, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 8.0. Use initWithPlayers: instead
     */
    @Deprecated
    @Method(selector = "initWithPlayerIDs:")
    protected native @Pointer long init(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> playerIDs);
    /**
     * @deprecated Deprecated in iOS 14.0. Use instance method loadEntriesForPlayers:timeScope:completionHandler: instead.
     */
    @Deprecated
    @Method(selector = "initWithPlayers:")
    protected native @Pointer long init(NSArray<GKPlayer> players);
    /**
     * @deprecated Deprecated in iOS 14.0. Use loadEntriesForPlayerScope:timeScope:range:completionHandler:.
     */
    @Deprecated
    @Method(selector = "loadScoresWithCompletionHandler:")
    public native void loadScores(@Block VoidBlock2<NSArray<GKScore>, NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 7.0. Use setDefaultLeaderboardIdentifier:completionHandler: on GKLocalPlayer instead
     */
    @Deprecated
    @Method(selector = "setDefaultLeaderboard:withCompletionHandler:")
    public static native void setDefaultLeaderboard(String leaderboardIdentifier, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 14.0. Use class method loadLeaderboardsWithIDs:completionHandler:
     */
    @Deprecated
    @Method(selector = "loadLeaderboardsWithCompletionHandler:")
    public static native void loadLeaderboards(@Block VoidBlock2<NSArray<GKLeaderboard>, NSError> completionHandler);
    @Method(selector = "loadImageWithCompletionHandler:")
    public native void loadImage(@Block VoidBlock2<UIImage, NSError> completionHandler);
    /*</methods>*/
}
