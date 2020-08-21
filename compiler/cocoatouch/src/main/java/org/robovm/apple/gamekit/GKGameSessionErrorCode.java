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
 * @since Available in iOS 10.0 and later.
 * @deprecated Deprecated in iOS 12.0. GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Deprecated @Library("GameKit")/*</annotations>*/
public enum /*<name>*/GKGameSessionErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Unknown(1L),
    NotAuthenticated(2L),
    SessionConflict(3L),
    SessionNotShared(4L),
    ConnectionCancelledByUser(5L),
    ConnectionFailed(6L),
    SessionHasMaxConnectedPlayers(7L),
    SendDataNotConnected(8L),
    SendDataNoRecipients(9L),
    SendDataNotReachable(10L),
    SendRateLimitReached(11L),
    BadContainer(12L),
    CloudQuotaExceeded(13L),
    NetworkFailure(14L),
    CloudDriveDisabled(15L),
    InvalidSession(16L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(GKGameSessionErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 12.0. GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated
    @GlobalValue(symbol="GKGameSessionErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/GKGameSessionErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/GKGameSessionErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/GKGameSessionErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/GKGameSessionErrorCode/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/GKGameSessionErrorCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be inserted in value section */
            return /*<name>*/GKGameSessionErrorCode/*</name>*/.getClassDomain();
        }
    }
}
