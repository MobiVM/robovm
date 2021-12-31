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
public enum /*<name>*/NWInterfaceRadioType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    unknown(0L),
    wifi_b(1L),
    wifi_a(2L),
    wifi_g(3L),
    wifi_n(4L),
    wifi_ac(5L),
    wifi_ax(6L),
    cell_lte(128L),
    cell_endc_sub6(129L),
    cell_endc_mmw(130L),
    cell_nr_sa_sub6(131L),
    cell_nr_sa_mmw(132L),
    cell_wcdma(133L),
    cell_gsm(134L),
    cell_cdma(135L),
    cell_evdo(136L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/NWInterfaceRadioType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/NWInterfaceRadioType/*</name>*/ valueOf(long n) {
        for (/*<name>*/NWInterfaceRadioType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/NWInterfaceRadioType/*</name>*/.class.getName());
    }
}
