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
package org.robovm.apple.exposurenotification;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.5 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("ExposureNotification")/*</annotations>*/
public enum /*<name>*/ENErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Unknown(1L),
    BadParameter(2L),
    NotEntitled(3L),
    NotAuthorized(4L),
    Unsupported(5L),
    Invalidated(6L),
    BluetoothOff(7L),
    InsufficientStorage(8L),
    NotEnabled(9L),
    APIMisuse(10L),
    Internal(11L),
    InsufficientMemory(12L),
    RateLimited(13L),
    Restricted(14L),
    BadFormat(15L),
    DataInaccessible(16L),
    TravelStatusNotAvailable(17L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(ENErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.5 and later.
     */
    @GlobalValue(symbol="ENErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/ENErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/ENErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/ENErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/ENErrorCode/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/ENErrorCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be incerted in value section */
            return /*<name>*/ENErrorCode/*</name>*/.getClassDomain();
        }
    }
}
