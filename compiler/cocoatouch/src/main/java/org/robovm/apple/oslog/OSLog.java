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
package org.robovm.apple.oslog;


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

/*</javadoc>*/
/*<annotations>*/
@Library(Library.INTERNAL)
@NativeClass("NSObject")/*</annotations>*/
/*<visibility>*/ public final/*</visibility>*/ class /*<name>*/OSLog/*</name>*/
        extends /*<extends>*/NSObject/*</extends>*/
        /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSLogPtr extends Ptr<OSLog, OSLogPtr> {
    }/*</ptr>*/

    /*<bind>*/static {
        ObjCRuntime.bind(OSLog.class);
    }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/

    /*</constructors>*/
    /*<properties>*/

    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/

    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol = "os_log_create", optional = true)
    public static native OSLog create(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String subsystem, @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String category);

    /**
     * @since Available in iOS 10.0 and later.
     */
    @Bridge(symbol = "os_log_type_enabled", optional = true)
    public native boolean isEnabled(Type type);


    /*</methods>*/

    ///
    /// dkimitsa: manually added code bellow
    ///
    @org.robovm.rt.bro.annotation.Marshaler(ValuedEnum.AsUnsignedByteMarshaler.class)
    public enum Type implements ValuedEnum {
        DEFAULT(0L),
        INFO(1L),
        DEBUG(2L),
        ERROR(16L),
        FAULT(17L);
        private final long n;

        Type(long n) {
            this.n = n;
        }

        public long value() {
            return n;
        }

        public static Type valueOf(long n) {
            for (Type v : values()) {
                if (v.n == n) {
                    return v;
                }
            }
            throw new IllegalArgumentException("No constant with value " + n + " found in "
                    + Type.class.getName());
        }
    }

    ///
    /// Bindings for rvm_oslog.m
    ///

    /// TODO: fixme, static XCFrameworks doesn't support "forced" parameter
    ///       and symbols are got dead-stripped, using ObjC wrapper to make
    ///       API available
    @NativeClass
    private final static class RvmOSLog extends NSObject {
        static { ObjCRuntime.bind(RvmOSLog.class); }

        @Method(selector = "DISABLED")
        static native OSLog DISABLED();

        @Method(selector = "DEFAULT")
        static native OSLog DEFAULT();

        @Method(selector = "logPublic:withType:message:")
        static native void publicLog(OSLog log, Type type, @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String msg);

        @Method(selector= "logPrivate:withType:message:")
        static native void privateLog(OSLog log, Type type, @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String msg);
    }


    ///
    /// macro implementations
    ///
    public static OSLog DISABLED() {
        return RvmOSLog.DISABLED();
    }

    public static OSLog DEFAULT() {
        return RvmOSLog.DEFAULT();
    }

    public void publicLog(Type type, String msg) {
        RvmOSLog.publicLog(this, type, msg);
    }

    public void privateLog(OSLog log, Type type, String msg) {
        RvmOSLog.privateLog(this, type, msg);
    }

    /**
     * public log to default logger
     */
    public static void log(String msg) {
        RvmOSLog.publicLog(DEFAULT(), Type.DEFAULT, msg);
    }

    public static void log(boolean isPrivate, String msg) {
        OSLog log = DEFAULT();
        if (isPrivate) RvmOSLog.privateLog(log, Type.DEFAULT, msg);
        else RvmOSLog.publicLog(log, Type.DEFAULT, msg);
    }
}
