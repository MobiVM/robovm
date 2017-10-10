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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.0 and later.
 * @deprecated Deprecated in iOS 7.0.
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Library("GameKit")/*</annotations>*/
public enum /*<name>*/GKVoiceChatServiceError/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Internal(32000L),
    NoRemotePackets(32001L),
    UnableToConnect(32002L),
    RemoteParticipantHangup(32003L),
    InvalidCallID(32004L),
    AudioUnavailable(32005L),
    UninitializedClient(32006L),
    ClientMissingRequiredMethods(32007L),
    RemoteParticipantBusy(32008L),
    RemoteParticipantCancelled(32009L),
    RemoteParticipantResponseInvalid(32010L),
    RemoteParticipantDeclinedInvite(32011L),
    MethodCurrentlyInvalid(32012L),
    NetworkConfiguration(32013L),
    UnsupportedRemoteVersion(32014L),
    OutOfMemory(32015L),
    InvalidParameter(32016L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(GKVoiceChatServiceError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GKVoiceChatServiceErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/GKVoiceChatServiceError/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/GKVoiceChatServiceError/*</name>*/ valueOf(long n) {
        for (/*<name>*/GKVoiceChatServiceError/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/GKVoiceChatServiceError/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/GKVoiceChatServiceError/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be incerted in value section */
            return /*<name>*/GKVoiceChatServiceError/*</name>*/.getClassDomain();
        }
    }
}
