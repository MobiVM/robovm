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
package org.robovm.apple.metalps;

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
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MPSAliasingStrategy/*</name>*/ extends Bits</*<name>*/MPSAliasingStrategy/*</name>*/> {
    /*<values>*/
    public static final MPSAliasingStrategy None = new MPSAliasingStrategy(0L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MPSAliasingStrategy Default = new MPSAliasingStrategy(0L);
    public static final MPSAliasingStrategy DontCare = new MPSAliasingStrategy(0L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MPSAliasingStrategy ShallAlias = new MPSAliasingStrategy(1L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MPSAliasingStrategy ShallNotAlias = new MPSAliasingStrategy(2L);
    public static final MPSAliasingStrategy AliasingReserved = new MPSAliasingStrategy(3L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MPSAliasingStrategy PreferTemporaryMemory = new MPSAliasingStrategy(4L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final MPSAliasingStrategy PreferNonTemporaryMemory = new MPSAliasingStrategy(8L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MPSAliasingStrategy/*</name>*/[] values = _values(/*<name>*/MPSAliasingStrategy/*</name>*/.class);

    public /*<name>*/MPSAliasingStrategy/*</name>*/(long value) { super(value); }
    private /*<name>*/MPSAliasingStrategy/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MPSAliasingStrategy/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MPSAliasingStrategy/*</name>*/(value, mask);
    }
    protected /*<name>*/MPSAliasingStrategy/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MPSAliasingStrategy/*</name>*/[] values() {
        return values.clone();
    }
}
