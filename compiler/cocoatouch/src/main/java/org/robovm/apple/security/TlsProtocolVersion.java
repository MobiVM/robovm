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
package org.robovm.apple.security;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsUnsignedShortMarshaler.class)/*</annotations>*/
public enum /*<name>*/TlsProtocolVersion/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use tls_protocol_version_TLSv12 or tls_protocol_version_TLSv13 instead.
     */
    @Deprecated
    TLSv10(769L),
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use tls_protocol_version_TLSv12 or tls_protocol_version_TLSv13 instead.
     */
    @Deprecated
    TLSv11(770L),
    TLSv12(771L),
    TLSv13(772L),
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use tls_protocol_version_DTLSv12 instead.
     */
    @Deprecated
    DTLSv10(65279L),
    DTLSv12(65277L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/TlsProtocolVersion/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/TlsProtocolVersion/*</name>*/ valueOf(long n) {
        for (/*<name>*/TlsProtocolVersion/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/TlsProtocolVersion/*</name>*/.class.getName());
    }
}
