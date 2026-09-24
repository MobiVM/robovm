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

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTRDiscoveryCapabilities/*</name>*/ extends Bits</*<name>*/MTRDiscoveryCapabilities/*</name>*/> {
    /*<values>*/
    public static final MTRDiscoveryCapabilities Unknown = new MTRDiscoveryCapabilities(0L);
    public static final MTRDiscoveryCapabilities SoftAP = new MTRDiscoveryCapabilities(1L);
    public static final MTRDiscoveryCapabilities BLE = new MTRDiscoveryCapabilities(2L);
    public static final MTRDiscoveryCapabilities OnNetwork = new MTRDiscoveryCapabilities(4L);
    public static final MTRDiscoveryCapabilities AllMask = new MTRDiscoveryCapabilities(7L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRDiscoveryCapabilities/*</name>*/[] values = _values(/*<name>*/MTRDiscoveryCapabilities/*</name>*/.class);

    public /*<name>*/MTRDiscoveryCapabilities/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRDiscoveryCapabilities/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRDiscoveryCapabilities/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRDiscoveryCapabilities/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRDiscoveryCapabilities/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRDiscoveryCapabilities/*</name>*/[] values() {
        return values.clone();
    }
}
