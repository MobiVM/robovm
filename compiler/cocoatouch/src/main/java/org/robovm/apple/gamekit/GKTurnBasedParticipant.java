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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKTurnBasedParticipant/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKTurnBasedParticipantPtr extends Ptr<GKTurnBasedParticipant, GKTurnBasedParticipantPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKTurnBasedParticipant.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKTurnBasedParticipant() {}
    protected GKTurnBasedParticipant(Handle h, long handle) { super(h, handle); }
    protected GKTurnBasedParticipant(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "player")
    public native GKPlayer getPlayer();
    @Property(selector = "lastTurnDate")
    public native NSDate getLastTurnDate();
    @Property(selector = "status")
    public native GKTurnBasedParticipantStatus getStatus();
    @Property(selector = "matchOutcome")
    public native GKTurnBasedMatchOutcome getMatchOutcome();
    @Property(selector = "setMatchOutcome:")
    public native void setMatchOutcome(GKTurnBasedMatchOutcome v);
    @Property(selector = "timeoutDate")
    public native NSDate getTimeoutDate();
    /**
     * @deprecated Deprecated in iOS 8.0. Use -player:
     */
    @Deprecated
    @Property(selector = "playerID")
    public native String getPlayerID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
