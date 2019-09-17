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
package org.robovm.apple.callkit;

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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("CallKit")/*</annotations>*/
public enum /*<name>*/CXErrorCodeRequestTransactionError/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Unknown(0L),
    Unentitled(1L),
    UnknownCallProvider(2L),
    EmptyTransaction(3L),
    UnknownCallUUID(4L),
    CallUUIDAlreadyExists(5L),
    InvalidAction(6L),
    MaximumCallGroupsReached(7L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(CXErrorCodeRequestTransactionError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="CXErrorDomainRequestTransaction", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/CXErrorCodeRequestTransactionError/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CXErrorCodeRequestTransactionError/*</name>*/ valueOf(long n) {
        for (/*<name>*/CXErrorCodeRequestTransactionError/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/CXErrorCodeRequestTransactionError/*</name>*/.class.getName());
    }
}
