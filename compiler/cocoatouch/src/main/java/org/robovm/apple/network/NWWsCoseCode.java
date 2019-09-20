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
package org.robovm.apple.network;

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

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/NWWsCoseCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    normal_closure(1000L),
    going_away(1001L),
    protocol_error(1002L),
    unsupported_data(1003L),
    no_status_received(1005L),
    abnormal_closure(1006L),
    invalid_frame_payload_data(1007L),
    policy_violation(1008L),
    message_too_big(1009L),
    mandatory_extension(1010L),
    internal_server_error(1011L),
    tls_handshake(1015L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/NWWsCoseCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/NWWsCoseCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/NWWsCoseCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/NWWsCoseCode/*</name>*/.class.getName());
    }
}
