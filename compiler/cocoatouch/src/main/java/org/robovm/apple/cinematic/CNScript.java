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
package org.robovm.apple.cinematic;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Cinematic") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNScript/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CNScriptPtr extends Ptr<CNScript, CNScriptPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CNScript.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CNScript() {}
    protected CNScript(Handle h, long handle) { super(h, handle); }
    protected CNScript(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "timeRange")
    public native @ByVal CMTimeRange getTimeRange();
    @Property(selector = "fNumber")
    public native float getFNumber();
    @Property(selector = "setFNumber:")
    public native void setFNumber(float v);
    @Property(selector = "addedDetectionTracks")
    public native NSArray<CNDetectionTrack> getAddedDetectionTracks();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reloadWithChanges:")
    public native void reload(CNScriptChanges changes);
    @Method(selector = "changes")
    public native CNScriptChanges changes();
    @Method(selector = "changesTrimmedByTimeRange:")
    public native CNScriptChanges changesTrimmedByTimeRange(@ByVal CMTimeRange timeRange);
    @Method(selector = "frameAtTime:tolerance:")
    public native CNScriptFrame getFrame(@ByVal CMTime time, @ByVal CMTime tolerance);
    @Method(selector = "framesInTimeRange:")
    public native NSArray<CNScriptFrame> framesInTimeRange(@ByVal CMTimeRange timeRange);
    @Method(selector = "decisionAtTime:tolerance:")
    public native CNDecision getDecision(@ByVal CMTime time, @ByVal CMTime tolerance);
    @Method(selector = "decisionsInTimeRange:")
    public native NSArray<CNDecision> decisionsInTimeRange(@ByVal CMTimeRange timeRange);
    @Method(selector = "decisionAfterTime:")
    public native CNDecision decisionAfterTime(@ByVal CMTime time);
    @Method(selector = "decisionBeforeTime:")
    public native CNDecision decisionBeforeTime(@ByVal CMTime time);
    @Method(selector = "primaryDecisionAtTime:")
    public native CNDecision primaryDecisionAtTime(@ByVal CMTime time);
    @Method(selector = "secondaryDecisionAtTime:")
    public native CNDecision secondaryDecisionAtTime(@ByVal CMTime time);
    @Method(selector = "timeRangeOfTransitionAfterDecision:")
    public native @ByVal CMTimeRange timeRangeOfTransitionAfterDecision(CNDecision decision);
    @Method(selector = "timeRangeOfTransitionBeforeDecision:")
    public native @ByVal CMTimeRange timeRangeOfTransitionBeforeDecision(CNDecision decision);
    @Method(selector = "userDecisionsInTimeRange:")
    public native NSArray<CNDecision> userDecisionsInTimeRange(@ByVal CMTimeRange timeRange);
    @Method(selector = "baseDecisionsInTimeRange:")
    public native NSArray<CNDecision> baseDecisionsInTimeRange(@ByVal CMTimeRange timeRange);
    @Method(selector = "detectionTrackForID:")
    public native CNDetectionTrack detectionTrackForID(long detectionID);
    @Method(selector = "detectionTrackForDecision:")
    public native CNDetectionTrack detectionTrackForDecision(CNDecision decision);
    @Method(selector = "addUserDecision:")
    public native boolean addUserDecision(CNDecision decision);
    @Method(selector = "removeUserDecision:")
    public native boolean removeUserDecision(CNDecision decision);
    @Method(selector = "removeAllUserDecisions")
    public native void removeAllUserDecisions();
    @Method(selector = "addDetectionTrack:")
    public native long addDetectionTrack(CNDetectionTrack detectionTrack);
    @Method(selector = "removeDetectionTrack:")
    public native boolean removeDetectionTrack(CNDetectionTrack detectionTrack);
    @Method(selector = "loadFromAsset:changes:progress:completionHandler:")
    public static native void load(AVAsset asset, CNScriptChanges changes, NSProgress progress, @Block VoidBlock2<CNScript, NSError> completionHandler);
    /*</methods>*/
}
