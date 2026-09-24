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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKChallengeDefinition/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKChallengeDefinitionPtr extends Ptr<GKChallengeDefinition, GKChallengeDefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKChallengeDefinition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKChallengeDefinition() {}
    protected GKChallengeDefinition(Handle h, long handle) { super(h, handle); }
    protected GKChallengeDefinition(SkipInit skipInit) { super(skipInit); }
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
    @Property(selector = "durationOptions")
    public native NSArray<NSDateComponents> getDurationOptions();
    @Property(selector = "isRepeatable")
    public native boolean isRepeatable();
    @Property(selector = "leaderboard")
    public native GKLeaderboard getLeaderboard();
    @Property(selector = "releaseState")
    public native GKReleaseState getReleaseState();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadImageWithCompletionHandler:")
    public native void loadImage(@Block VoidBlock2<UIImage, NSError> completionHandler);
    @Method(selector = "hasActiveChallengesWithCompletionHandler:")
    public native void hasActiveChallenges(@Block VoidBlock2<Boolean, NSError> completionHandler);
    @Method(selector = "loadChallengeDefinitionsWithCompletionHandler:")
    public static native void loadChallengeDefinitions(@Block VoidBlock2<NSArray<GKChallengeDefinition>, NSError> completionHandler);
    /*</methods>*/
}
