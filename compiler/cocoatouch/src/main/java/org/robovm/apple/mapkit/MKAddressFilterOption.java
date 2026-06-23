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
package org.robovm.apple.mapkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MKAddressFilterOption/*</name>*/ extends Bits</*<name>*/MKAddressFilterOption/*</name>*/> {
    /*<values>*/
    public static final MKAddressFilterOption None = new MKAddressFilterOption(0L);
    public static final MKAddressFilterOption Country = new MKAddressFilterOption(1L);
    public static final MKAddressFilterOption AdministrativeArea = new MKAddressFilterOption(2L);
    public static final MKAddressFilterOption SubAdministrativeArea = new MKAddressFilterOption(4L);
    public static final MKAddressFilterOption Locality = new MKAddressFilterOption(8L);
    public static final MKAddressFilterOption SubLocality = new MKAddressFilterOption(16L);
    public static final MKAddressFilterOption PostalCode = new MKAddressFilterOption(32L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MKAddressFilterOption/*</name>*/[] values = _values(/*<name>*/MKAddressFilterOption/*</name>*/.class);

    public /*<name>*/MKAddressFilterOption/*</name>*/(long value) { super(value); }
    private /*<name>*/MKAddressFilterOption/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MKAddressFilterOption/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MKAddressFilterOption/*</name>*/(value, mask);
    }
    protected /*<name>*/MKAddressFilterOption/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MKAddressFilterOption/*</name>*/[] values() {
        return values.clone();
    }
}
