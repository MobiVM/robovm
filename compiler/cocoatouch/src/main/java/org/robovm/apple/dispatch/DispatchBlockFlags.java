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
package org.robovm.apple.dispatch;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/DispatchBlockFlags/*</name>*/ extends Bits</*<name>*/DispatchBlockFlags/*</name>*/> {
    /*<values>*/
    public static final DispatchBlockFlags None = new DispatchBlockFlags(0L);
    public static final DispatchBlockFlags BARRIER = new DispatchBlockFlags(1L);
    public static final DispatchBlockFlags DETACHED = new DispatchBlockFlags(2L);
    public static final DispatchBlockFlags ASSIGN_CURRENT = new DispatchBlockFlags(4L);
    public static final DispatchBlockFlags NO_QOS_CLASS = new DispatchBlockFlags(8L);
    public static final DispatchBlockFlags INHERIT_QOS_CLASS = new DispatchBlockFlags(16L);
    public static final DispatchBlockFlags ENFORCE_QOS_CLASS = new DispatchBlockFlags(32L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/DispatchBlockFlags/*</name>*/[] values = _values(/*<name>*/DispatchBlockFlags/*</name>*/.class);

    public /*<name>*/DispatchBlockFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/DispatchBlockFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/DispatchBlockFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/DispatchBlockFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/DispatchBlockFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/DispatchBlockFlags/*</name>*/[] values() {
        return values.clone();
    }
}
