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
package org.robovm.apple.usernotifications;

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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("UserNotifications")/*</annotations>*/
public enum /*<name>*/UNErrorCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    NotificationsNotAllowed(1L),
    AttachmentInvalidURL(100L),
    AttachmentUnrecognizedType(101L),
    AttachmentInvalidFileSize(102L),
    AttachmentNotInDataStore(103L),
    AttachmentMoveIntoDataStoreFailed(104L),
    AttachmentCorrupt(105L),
    NotificationInvalidNoDate(1400L),
    NotificationInvalidNoContent(1401L),
    ContentProvidingObjectNotAllowed(1500L),
    ContentProvidingInvalid(1501L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(UNErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="UNErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/UNErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/UNErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/UNErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/UNErrorCode/*</name>*/.class.getName());
    }
}
