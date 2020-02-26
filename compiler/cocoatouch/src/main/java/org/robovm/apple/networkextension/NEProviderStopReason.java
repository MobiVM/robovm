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
package org.robovm.apple.networkextension;

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
import org.robovm.apple.security.*;
import org.robovm.apple.network.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/NEProviderStopReason/*</name>*/ implements ValuedEnum {
    /*<values>*/
    None(0L),
    UserInitiated(1L),
    ProviderFailed(2L),
    NoNetworkAvailable(3L),
    UnrecoverableNetworkChange(4L),
    ProviderDisabled(5L),
    AuthenticationCanceled(6L),
    ConfigurationFailed(7L),
    IdleTimeout(8L),
    ConfigurationDisabled(9L),
    ConfigurationRemoved(10L),
    Superceded(11L),
    UserLogout(12L),
    UserSwitch(13L),
    ConnectionFailed(14L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    Sleep(15L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    AppUpdate(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/NEProviderStopReason/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/NEProviderStopReason/*</name>*/ valueOf(long n) {
        for (/*<name>*/NEProviderStopReason/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/NEProviderStopReason/*</name>*/.class.getName());
    }
}
