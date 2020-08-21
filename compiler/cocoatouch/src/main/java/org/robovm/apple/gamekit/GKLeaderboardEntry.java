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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKLeaderboardEntry/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKLeaderboardEntryPtr extends Ptr<GKLeaderboardEntry, GKLeaderboardEntryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKLeaderboardEntry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GKLeaderboardEntry() {}
    protected GKLeaderboardEntry(Handle h, long handle) { super(h, handle); }
    protected GKLeaderboardEntry(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "player")
    public native GKPlayer getPlayer();
    @Property(selector = "rank")
    public native @MachineSizedSInt long getRank();
    @Property(selector = "score")
    public native @MachineSizedSInt long getScore();
    @Property(selector = "formattedScore")
    public native String getFormattedScore();
    @Property(selector = "context")
    public native @MachineSizedUInt long getContext();
    @Property(selector = "date")
    public native NSDate getDate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "challengeComposeControllerWithMessage:players:completionHandler:")
    public native UIViewController challengeComposeController(String message, NSArray<GKPlayer> players, @Block VoidBlock3<UIViewController, Boolean, NSArray<NSString>> completionHandler);
    /*</methods>*/
}
