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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/INDayOfWeekOptions/*</name>*/ extends Bits</*<name>*/INDayOfWeekOptions/*</name>*/> {
    /*<values>*/
    public static final INDayOfWeekOptions None = new INDayOfWeekOptions(0L);
    public static final INDayOfWeekOptions Monday = new INDayOfWeekOptions(1L);
    public static final INDayOfWeekOptions Tuesday = new INDayOfWeekOptions(2L);
    public static final INDayOfWeekOptions Wednesday = new INDayOfWeekOptions(4L);
    public static final INDayOfWeekOptions Thursday = new INDayOfWeekOptions(8L);
    public static final INDayOfWeekOptions Friday = new INDayOfWeekOptions(16L);
    public static final INDayOfWeekOptions Saturday = new INDayOfWeekOptions(32L);
    public static final INDayOfWeekOptions Sunday = new INDayOfWeekOptions(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/INDayOfWeekOptions/*</name>*/[] values = _values(/*<name>*/INDayOfWeekOptions/*</name>*/.class);

    public /*<name>*/INDayOfWeekOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/INDayOfWeekOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/INDayOfWeekOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/INDayOfWeekOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/INDayOfWeekOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/INDayOfWeekOptions/*</name>*/[] values() {
        return values.clone();
    }
}
