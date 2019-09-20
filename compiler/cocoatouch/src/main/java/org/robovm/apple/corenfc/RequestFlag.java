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
package org.robovm.apple.corenfc;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsByteMarshaler.class)/*</annotations>*/
public final class /*<name>*/RequestFlag/*</name>*/ extends Bits</*<name>*/RequestFlag/*</name>*/> {
    /*<values>*/
    public static final RequestFlag None = new RequestFlag(0L);
    public static final RequestFlag DualSubCarriers = new RequestFlag(1L);
    public static final RequestFlag HighDataRate = new RequestFlag(2L);
    public static final RequestFlag ProtocolExtension = new RequestFlag(8L);
    public static final RequestFlag Select = new RequestFlag(16L);
    public static final RequestFlag Address = new RequestFlag(32L);
    public static final RequestFlag Option = new RequestFlag(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/RequestFlag/*</name>*/[] values = _values(/*<name>*/RequestFlag/*</name>*/.class);

    public /*<name>*/RequestFlag/*</name>*/(long value) { super(value); }
    private /*<name>*/RequestFlag/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/RequestFlag/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/RequestFlag/*</name>*/(value, mask);
    }
    protected /*<name>*/RequestFlag/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/RequestFlag/*</name>*/[] values() {
        return values.clone();
    }
}
