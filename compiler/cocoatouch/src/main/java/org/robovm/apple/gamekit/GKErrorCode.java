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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("GameKit")/*</annotations>*/
public enum /*<name>*/GKErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Unknown(1L),
    Cancelled(2L),
    CommunicationsFailure(3L),
    UserDenied(4L),
    InvalidCredentials(5L),
    NotAuthenticated(6L),
    AuthenticationInProgress(7L),
    InvalidPlayer(8L),
    ScoreNotSet(9L),
    ParentalControlsBlocked(10L),
    PlayerStatusExceedsMaximumLength(11L),
    PlayerStatusInvalid(12L),
    MatchRequestInvalid(13L),
    Underage(14L),
    GameUnrecognized(15L),
    NotSupported(16L),
    InvalidParameter(17L),
    UnexpectedConnection(18L),
    /**
     * @deprecated Deprecated in iOS 26.0. Use Replaced by developer defined challenges, see ``GKChallengeDefinition``
     */
    @Deprecated
    ChallengeInvalid(19L),
    TurnBasedMatchDataTooLarge(20L),
    TurnBasedTooManySessions(21L),
    TurnBasedInvalidParticipant(22L),
    TurnBasedInvalidTurn(23L),
    TurnBasedInvalidState(24L),
    InvitationsDisabled(25L),
    PlayerPhotoFailure(26L),
    UbiquityContainerUnavailable(27L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    MatchNotConnected(28L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    GameSessionRequestInvalid(29L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    RestrictedToAutomatch(30L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    APINotAvailable(31L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    NotAuthorized(32L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    ConnectionTimeout(33L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    APIObsolete(34L),
    /**
     * @since Available in iOS 17.2 and later.
     */
    ICloudUnavailable(35L),
    /**
     * @since Available in iOS 17.2 and later.
     */
    LockdownMode(36L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AppUnlisted(37L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    DebugMode(38L),
    /**
     * @since Available in iOS 14.5 and later.
     */
    FriendListDescriptionMissing(100L),
    /**
     * @since Available in iOS 14.5 and later.
     */
    FriendListRestricted(101L),
    /**
     * @since Available in iOS 14.5 and later.
     */
    FriendListDenied(102L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    FriendRequestNotAvailable(103L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(GKErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GKErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/GKErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/GKErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/GKErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/GKErrorCode/*</name>*/.class.getName());
    }

    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/GKErrorCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be incerted in value section */
            return /*<name>*/GKErrorCode/*</name>*/.getClassDomain();
        }
    }
}
