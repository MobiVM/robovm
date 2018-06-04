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
package org.robovm.apple.classkit;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("ClassKit")/*</annotations>*/
public enum /*<name>*/CLSErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    None(0L),
    ClassKitUnavailable(1L),
    InvalidArgument(2L),
    InvalidModification(3L),
    AuthorizationDenied(4L),
    DatabaseInaccessible(5L),
    Limits(6L),
    InvalidCreate(7L),
    InvalidUpdate(8L),
    PartialFailure(9L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(CLSErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.3 and later.
     */
    @GlobalValue(symbol="CLSErrorCodeDomain", optional=true)
    public static native String getClassDomain();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @GlobalValue(symbol="CLSErrorObjectKey", optional=true)
    public static native String getObjecKey();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @GlobalValue(symbol="CLSErrorUnderlyingErrorsKey", optional=true)
    public static native String getUnderlyingErrorsKey();
    /*</methods>*/

    private final long n;

    private /*<name>*/CLSErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CLSErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/CLSErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/CLSErrorCode/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/CLSErrorCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be incerted in value section */
            return /*<name>*/CLSErrorCode/*</name>*/.getClassDomain();
        }
    }
}
