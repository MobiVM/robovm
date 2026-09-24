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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKGameActivityDefinition/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKGameActivityDefinitionPtr extends Ptr<GKGameActivityDefinition, GKGameActivityDefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKGameActivityDefinition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GKGameActivityDefinition() {}
    protected GKGameActivityDefinition(Handle h, long handle) { super(h, handle); }
    protected GKGameActivityDefinition(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "groupIdentifier")
    public native String getGroupIdentifier();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "details")
    public native String getDetails();
    @Property(selector = "defaultProperties")
    public native NSDictionary<NSString, NSString> getDefaultProperties();
    @Property(selector = "fallbackURL")
    public native NSURL getFallbackURL();
    @Property(selector = "supportsPartyCode")
    public native boolean supportsPartyCode();
    @Property(selector = "maxPlayers")
    public native NSNumber getMaxPlayers();
    @Property(selector = "minPlayers")
    public native NSNumber getMinPlayers();
    @Property(selector = "supportsUnlimitedPlayers")
    public native boolean supportsUnlimitedPlayers();
    @Property(selector = "playStyle")
    public native GKGameActivityPlayStyle getPlayStyle();
    @Property(selector = "releaseState")
    public native GKReleaseState getReleaseState();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadAchievementDescriptionsWithCompletionHandler:")
    public native void loadAchievementDescriptions(@Block VoidBlock2<NSArray<GKAchievementDescription>, NSError> completionHandler);
    @Method(selector = "loadLeaderboardsWithCompletionHandler:")
    public native void loadLeaderboards(@Block VoidBlock2<NSArray<GKLeaderboard>, NSError> completionHandler);
    @Method(selector = "loadImageWithCompletionHandler:")
    public native void loadImage(@Block VoidBlock2<UIImage, NSError> completionHandler);
    @Method(selector = "loadGameActivityDefinitionsWithCompletionHandler:")
    public static native void loadGameActivityDefinitions(@Block VoidBlock2<NSArray<GKGameActivityDefinition>, NSError> completionHandler);
    @Method(selector = "loadGameActivityDefinitionsWithIDs:completionHandler:")
    public static native void loadGameActivityDefinitions(NSArray<NSString> activityDefinitionIDs, @Block VoidBlock2<NSArray<GKGameActivityDefinition>, NSError> completionHandler);
    /*</methods>*/
}
