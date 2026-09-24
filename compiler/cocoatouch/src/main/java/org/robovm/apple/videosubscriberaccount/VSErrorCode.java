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
package org.robovm.apple.videosubscriberaccount;

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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("VideoSubscriberAccount")/*</annotations>*/
public enum /*<name>*/VSErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    AccessNotGranted(0L),
    UnsupportedProvider(1L),
    UserCancelled(2L),
    ServiceTemporarilyUnavailable(3L),
    ProviderRejected(4L),
    InvalidVerificationToken(5L),
    Rejected(6L),
    Unsupported(7L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(VSErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="VSErrorDomain", optional=true)
    public static native String getClassDomain();
    @Library("VideoSubscriberAccount")
    public static class InfoKeys {
        static { Bro.bind(InfoKeys.class); }

        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="VSErrorInfoKeySAMLResponse", optional=true)
        public static native NSString SAMLResponse();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="VSErrorInfoKeySAMLResponseStatus", optional=true)
        public static native NSString SAMLResponseStatus();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="VSErrorInfoKeyAccountProviderResponse", optional=true)
        public static native NSString AccountProviderResponse();
        /**
         * @since Available in iOS 10.2 and later.
         */
        @GlobalValue(symbol="VSErrorInfoKeyUnsupportedProviderIdentifier", optional=true)
        public static native NSString UnsupportedProviderIdentifier();
    }
    /*</methods>*/

    private final long n;

    private /*<name>*/VSErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/VSErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/VSErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/VSErrorCode/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/VSErrorCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be inserted in value section */
            return /*<name>*/VSErrorCode/*</name>*/.getClassDomain();
        }
    }
}
