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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKGameCenterViewController/*</name>*/ 
    extends /*<extends>*/UINavigationController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKGameCenterViewControllerPtr extends Ptr<GKGameCenterViewController, GKGameCenterViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKGameCenterViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKGameCenterViewController() {}
    protected GKGameCenterViewController(Handle h, long handle) { super(h, handle); }
    protected GKGameCenterViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNavigationBarClass:toolbarClass:")
    public GKGameCenterViewController(Class<? extends UINavigationBar> navigationBarClass, Class<? extends UIToolbar> toolbarClass) { super(navigationBarClass, toolbarClass); }
    @Method(selector = "initWithRootViewController:")
    public GKGameCenterViewController(UIViewController rootViewController) { super(rootViewController); }
    @Method(selector = "initWithNibName:bundle:")
    public GKGameCenterViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public GKGameCenterViewController(NSCoder decoder) { super(decoder); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithState:")
    public GKGameCenterViewController(GKGameCenterViewControllerState state) { super((SkipInit) null); initObject(init(state)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithLeaderboardID:playerScope:timeScope:")
    public GKGameCenterViewController(String leaderboardID, GKLeaderboardPlayerScope playerScope, GKLeaderboardTimeScope timeScope) { super((SkipInit) null); initObject(initWithLeaderboardID$playerScope$timeScope$(leaderboardID, playerScope, timeScope)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithLeaderboard:playerScope:")
    public GKGameCenterViewController(GKLeaderboard leaderboard, GKLeaderboardPlayerScope playerScope) { super((SkipInit) null); initObject(init(leaderboard, playerScope)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithAchievementID:")
    public GKGameCenterViewController(String achievementID) { super((SkipInit) null); initObject(init(achievementID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "gameCenterDelegate")
    public native GKGameCenterControllerDelegate getGameCenterDelegate();
    @Property(selector = "setGameCenterDelegate:", strongRef = true)
    public native void setGameCenterDelegate(GKGameCenterControllerDelegate v);
    /**
     * @deprecated Deprecated in iOS 14.0. Use -initWithState: instead
     */
    @Deprecated
    @Property(selector = "viewState")
    public native GKGameCenterViewControllerState getViewState();
    /**
     * @deprecated Deprecated in iOS 14.0. Use -initWithState: instead
     */
    @Deprecated
    @Property(selector = "setViewState:")
    public native void setViewState(GKGameCenterViewControllerState v);
    /**
     * @deprecated Deprecated in iOS 14.0. Use -initWithLeaderboard: instead
     */
    @Deprecated
    @Property(selector = "leaderboardTimeScope")
    public native GKLeaderboardTimeScope getLeaderboardTimeScope();
    /**
     * @deprecated Deprecated in iOS 14.0. Use -initWithLeaderboard: instead
     */
    @Deprecated
    @Property(selector = "setLeaderboardTimeScope:")
    public native void setLeaderboardTimeScope(GKLeaderboardTimeScope v);
    /**
     * @deprecated Deprecated in iOS 14.0. Use -initWithLeaderboard: instead
     */
    @Deprecated
    @Property(selector = "leaderboardIdentifier")
    public native String getLeaderboardIdentifier();
    /**
     * @deprecated Deprecated in iOS 14.0. Use -initWithLeaderboard: instead
     */
    @Deprecated
    @Property(selector = "setLeaderboardIdentifier:")
    public native void setLeaderboardIdentifier(String v);
    /**
     * @deprecated Deprecated in iOS 7.0. GKGameCenterViewController's leaderboardCategory property is deprecated. Use -initWithLeaderboard: instead
     */
    @Deprecated
    @Property(selector = "leaderboardCategory")
    public native String getLeaderboardCategory();
    /**
     * @deprecated Deprecated in iOS 7.0. GKGameCenterViewController's leaderboardCategory property is deprecated. Use -initWithLeaderboard: instead
     */
    @Deprecated
    @Property(selector = "setLeaderboardCategory:")
    public native void setLeaderboardCategory(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithState:")
    protected native @Pointer long init(GKGameCenterViewControllerState state);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithLeaderboardID:playerScope:timeScope:")
    protected native @Pointer long initWithLeaderboardID$playerScope$timeScope$(String leaderboardID, GKLeaderboardPlayerScope playerScope, GKLeaderboardTimeScope timeScope);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithLeaderboard:playerScope:")
    protected native @Pointer long init(GKLeaderboard leaderboard, GKLeaderboardPlayerScope playerScope);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithAchievementID:")
    protected native @Pointer long init(String achievementID);
    /*</methods>*/
}
