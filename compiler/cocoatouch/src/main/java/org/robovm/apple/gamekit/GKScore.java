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
/**
 * @deprecated Deprecated in iOS 14.0. Replaced by GKLeaderboardEntry
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKScore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class GKScorePtr extends Ptr<GKScore, GKScorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKScore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKScore() {}
    protected GKScore(Handle h, long handle) { super(h, handle); }
    protected GKScore(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLeaderboardIdentifier:")
    public GKScore(String identifier) { super((SkipInit) null); initObject(init(identifier)); }
    @Method(selector = "initWithLeaderboardIdentifier:player:")
    public GKScore(String identifier, GKPlayer player) { super((SkipInit) null); initObject(init(identifier, player)); }
    /**
     * @deprecated Deprecated in iOS 8.0. This is never invoked and its implementation does nothing, use initWithLeaderboardIdentifier:player:
     */
    @Deprecated
    @Method(selector = "initWithLeaderboardIdentifier:forPlayer:")
    public GKScore(String identifier, String playerID) { super((SkipInit) null); initObject(init(identifier, playerID)); }
    @Method(selector = "initWithCoder:")
    public GKScore(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "value")
    public native long getValue();
    @Property(selector = "setValue:")
    public native void setValue(long v);
    @Property(selector = "formattedValue")
    public native String getFormattedValue();
    @Property(selector = "leaderboardIdentifier")
    public native String getLeaderboardIdentifier();
    @Property(selector = "setLeaderboardIdentifier:")
    public native void setLeaderboardIdentifier(String v);
    @Property(selector = "context")
    public native long getContext();
    @Property(selector = "setContext:")
    public native void setContext(long v);
    @Property(selector = "date")
    public native NSDate getDate();
    @Property(selector = "player")
    public native GKPlayer getPlayer();
    @Property(selector = "rank")
    public native @MachineSizedSInt long getRank();
    @Property(selector = "shouldSetDefaultLeaderboard")
    public native boolean shouldSetDefaultLeaderboard();
    @Property(selector = "setShouldSetDefaultLeaderboard:")
    public native void setShouldSetDefaultLeaderboard(boolean v);
    /**
     * @deprecated Deprecated in iOS 7.0. Use leaderboardIdentifier instead
     */
    @Deprecated
    @Property(selector = "category")
    public native String getCategory();
    /**
     * @deprecated Deprecated in iOS 7.0. Use leaderboardIdentifier instead
     */
    @Deprecated
    @Property(selector = "setCategory:")
    public native void setCategory(String v);
    /**
     * @deprecated Deprecated in iOS 8.0. use player instead
     */
    @Deprecated
    @Property(selector = "playerID")
    public native String getPlayerID();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLeaderboardIdentifier:")
    protected native @Pointer long init(String identifier);
    @Method(selector = "initWithLeaderboardIdentifier:player:")
    protected native @Pointer long init(String identifier, GKPlayer player);
    @Method(selector = "reportScores:withCompletionHandler:")
    public static native void reportScores(NSArray<GKScore> scores, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 7.0. Use +reportScores:withCompletionhandler: instead
     */
    @Deprecated
    @Method(selector = "reportScoreWithCompletionHandler:")
    public native void reportScore(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 8.0. This is never invoked and its implementation does nothing, use initWithLeaderboardIdentifier:player:
     */
    @Deprecated
    @Method(selector = "initWithLeaderboardIdentifier:forPlayer:")
    protected native @Pointer long init(String identifier, String playerID);
    /**
     * @deprecated Deprecated in iOS 14.0. pass GKLeaderboardScore to reportLeaderboardScores:withEligibleChallenges:withCompletionHandler instead
     */
    @Deprecated
    @Method(selector = "reportScores:withEligibleChallenges:withCompletionHandler:")
    public static native void reportScores(NSArray<GKScore> scores, NSArray<GKChallenge> challenges, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "reportLeaderboardScores:withEligibleChallenges:withCompletionHandler:")
    public static native void reportLeaderboardScores(NSArray<GKLeaderboardScore> scores, NSArray<GKChallenge> challenges, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 7.0. This is never invoked and its implementation does nothing, pass GKPlayers to challengeComposeControllerWithMessage:players:completionHandler: and present the view controller instead
     */
    @Deprecated
    @Method(selector = "issueChallengeToPlayers:message:")
    public native void issueChallengeToPlayers(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> playerIDs, String message);
    @Method(selector = "challengeComposeControllerWithMessage:players:completionHandler:")
    public native UIViewController getChallengeComposeController(String message, NSArray<GKPlayer> players, @Block VoidBlock3<UIViewController, Boolean, NSArray<GKPlayer>> completionHandler);
    /**
     * @deprecated Deprecated in iOS 8.0. This is never invoked and its implementation does nothing, pass GKPlayers to challengeComposeControllerWithMessage:players: instead
     */
    @Deprecated
    @Method(selector = "challengeComposeControllerWithPlayers:message:completionHandler:")
    public native UIViewController getChallengeComposeController(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> playerIDs, String message, @Block VoidBlock3<UIViewController, Boolean, NSArray<NSString>> completionHandler);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
