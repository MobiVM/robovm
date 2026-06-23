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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("Matter")/*</annotations>*/
public enum /*<name>*/MTRInteractionErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    InteractionErrorCodeFailure(1L),
    InteractionErrorCodeInvalidSubscription(125L),
    InteractionErrorCodeUnsupportedAccess(126L),
    InteractionErrorCodeUnsupportedEndpoint(127L),
    InteractionErrorCodeInvalidAction(128L),
    InteractionErrorCodeUnsupportedCommand(129L),
    InteractionErrorCodeInvalidCommand(133L),
    InteractionErrorCodeUnsupportedAttribute(134L),
    InteractionErrorCodeConstraintError(135L),
    InteractionErrorCodeUnsupportedWrite(136L),
    InteractionErrorCodeResourceExhausted(137L),
    InteractionErrorCodeNotFound(139L),
    InteractionErrorCodeUnreportableAttribute(140L),
    InteractionErrorCodeInvalidDataType(141L),
    InteractionErrorCodeUnsupportedRead(143L),
    InteractionErrorCodeDataVersionMismatch(146L),
    InteractionErrorCodeTimeout(148L),
    InteractionErrorCodeBusy(156L),
    /**
     * @since Available in iOS 26.0 and later.
     */
    InteractionErrorCodeAccessRestricted(157L),
    InteractionErrorCodeUnsupportedCluster(195L),
    InteractionErrorCodeNoUpstreamSubscription(197L),
    InteractionErrorCodeNeedsTimedInteraction(198L),
    InteractionErrorCodeUnsupportedEvent(199L),
    InteractionErrorCodePathsExhausted(200L),
    InteractionErrorCodeTimedRequestMismatch(201L),
    InteractionErrorCodeFailsafeRequired(202L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    InteractionErrorCodeInvalidInState(203L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    InteractionErrorCodeNoCommandResponse(204L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(MTRInteractionErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    @GlobalValue(symbol="MTRInteractionErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/MTRInteractionErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTRInteractionErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTRInteractionErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/MTRInteractionErrorCode/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/MTRInteractionErrorCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be inserted in value section */
            return /*<name>*/MTRInteractionErrorCode/*</name>*/.getClassDomain();
        }
    }
}
