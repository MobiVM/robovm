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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKGameActivity/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKGameActivityPtr extends Ptr<GKGameActivity, GKGameActivityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKGameActivity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GKGameActivity() {}
    protected GKGameActivity(Handle h, long handle) { super(h, handle); }
    protected GKGameActivity(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDefinition:")
    public GKGameActivity(GKGameActivityDefinition activityDefinition) { super((SkipInit) null); initObject(init(activityDefinition)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "activityDefinition")
    public native GKGameActivityDefinition getActivityDefinition();
    @Property(selector = "properties")
    public native NSDictionary<NSString, NSString> getProperties();
    @Property(selector = "setProperties:")
    public native void setProperties(NSDictionary<NSString, NSString> v);
    @Property(selector = "state")
    public native GKGameActivityState getState();
    @Property(selector = "partyCode")
    public native String getPartyCode();
    @Property(selector = "partyURL")
    public native NSURL getPartyURL();
    @Property(selector = "creationDate")
    public native NSDate getCreationDate();
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "lastResumeDate")
    public native NSDate getLastResumeDate();
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "achievements")
    public native NSSet<GKAchievement> getAchievements();
    @Property(selector = "leaderboardScores")
    public native NSSet<GKLeaderboardScore> getLeaderboardScores();
    @Property(selector = "validPartyCodeAlphabet")
    public static native NSArray<NSString> getValidPartyCodeAlphabet();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDefinition:")
    protected native @Pointer long init(GKGameActivityDefinition activityDefinition);
    @Method(selector = "start")
    public native void start();
    @Method(selector = "pause")
    public native void pause();
    @Method(selector = "resume")
    public native void resume();
    @Method(selector = "end")
    public native void end();
    @Method(selector = "setScoreOnLeaderboard:toScore:context:")
    public native void setScoreOnLeaderboard(GKLeaderboard leaderboard, @MachineSizedSInt long score, @MachineSizedUInt long context);
    @Method(selector = "setScoreOnLeaderboard:toScore:")
    public native void setScoreOnLeaderboard(GKLeaderboard leaderboard, @MachineSizedSInt long score);
    @Method(selector = "getScoreOnLeaderboard:")
    public native GKLeaderboardScore getScoreOnLeaderboard(GKLeaderboard leaderboard);
    @Method(selector = "removeScoresFromLeaderboards:")
    public native void removeScoresFromLeaderboards(NSArray<GKLeaderboard> leaderboards);
    @Method(selector = "setProgressOnAchievement:toPercentComplete:")
    public native void setProgressOnAchievement(GKAchievement achievement, double percentComplete);
    @Method(selector = "setAchievementCompleted:")
    public native void setAchievementCompleted(GKAchievement achievement);
    @Method(selector = "getProgressOnAchievement:")
    public native double getProgressOnAchievement(GKAchievement achievement);
    @Method(selector = "removeAchievements:")
    public native void removeAchievements(NSArray<GKAchievement> achievements);
    public static GKGameActivity start(GKGameActivityDefinition activityDefinition, String partyCode) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       GKGameActivity result = start(activityDefinition, partyCode, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "startWithDefinition:partyCode:error:")
    private static native GKGameActivity start(GKGameActivityDefinition activityDefinition, String partyCode, NSError.NSErrorPtr error);
    public static GKGameActivity start(GKGameActivityDefinition activityDefinition) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       GKGameActivity result = start(activityDefinition, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "startWithDefinition:error:")
    private static native GKGameActivity start(GKGameActivityDefinition activityDefinition, NSError.NSErrorPtr error);
    @Method(selector = "isValidPartyCode:")
    public static native boolean isValidPartyCode(String partyCode);
    @Method(selector = "makeMatchRequest")
    public native GKMatchRequest makeMatchRequest();
    @Method(selector = "findMatchWithCompletionHandler:")
    public native void findMatch(@Block VoidBlock2<GKMatch, NSError> completionHandler);
    @Method(selector = "findPlayersForHostedMatchWithCompletionHandler:")
    public native void findPlayersForHostedMatch(@Block VoidBlock2<NSArray<GKPlayer>, NSError> completionHandler);
    @Method(selector = "checkPendingGameActivityExistenceWithCompletionHandler:")
    public static native void checkPendingGameActivityExistence(@Block VoidBooleanBlock completionHandler);
    /*</methods>*/
}
