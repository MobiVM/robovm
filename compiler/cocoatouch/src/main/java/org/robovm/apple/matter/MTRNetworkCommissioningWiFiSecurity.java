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
 * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningWiFiSecurityBitmap
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsByteMarshaler.class) @Deprecated/*</annotations>*/
public final class /*<name>*/MTRNetworkCommissioningWiFiSecurity/*</name>*/ extends Bits</*<name>*/MTRNetworkCommissioningWiFiSecurity/*</name>*/> {
    /*<values>*/
    public static final MTRNetworkCommissioningWiFiSecurity None = new MTRNetworkCommissioningWiFiSecurity(0L);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningWiFiSecurityBitmapUnencrypted
     */
    @Deprecated
    public static final MTRNetworkCommissioningWiFiSecurity Unencrypted = new MTRNetworkCommissioningWiFiSecurity(1L);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningWiFiSecurityBitmapWEP
     */
    @Deprecated
    public static final MTRNetworkCommissioningWiFiSecurity WEP = new MTRNetworkCommissioningWiFiSecurity(2L);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningWiFiSecurityBitmapWPAPersonal
     */
    @Deprecated
    public static final MTRNetworkCommissioningWiFiSecurity WPAPersonal = new MTRNetworkCommissioningWiFiSecurity(4L);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningWiFiSecurityBitmapWPA2Personal
     */
    @Deprecated
    public static final MTRNetworkCommissioningWiFiSecurity WPA2Personal = new MTRNetworkCommissioningWiFiSecurity(8L);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRNetworkCommissioningWiFiSecurityBitmapWPA3Personal
     */
    @Deprecated
    public static final MTRNetworkCommissioningWiFiSecurity WPA3Personal = new MTRNetworkCommissioningWiFiSecurity(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRNetworkCommissioningWiFiSecurity/*</name>*/[] values = _values(/*<name>*/MTRNetworkCommissioningWiFiSecurity/*</name>*/.class);

    public /*<name>*/MTRNetworkCommissioningWiFiSecurity/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRNetworkCommissioningWiFiSecurity/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRNetworkCommissioningWiFiSecurity/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRNetworkCommissioningWiFiSecurity/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRNetworkCommissioningWiFiSecurity/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRNetworkCommissioningWiFiSecurity/*</name>*/[] values() {
        return values.clone();
    }
}
