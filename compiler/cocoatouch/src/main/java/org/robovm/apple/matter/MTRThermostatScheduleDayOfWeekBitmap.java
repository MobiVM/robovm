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
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsByteMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTRThermostatScheduleDayOfWeekBitmap/*</name>*/ extends Bits</*<name>*/MTRThermostatScheduleDayOfWeekBitmap/*</name>*/> {
    /*<values>*/
    public static final MTRThermostatScheduleDayOfWeekBitmap None = new MTRThermostatScheduleDayOfWeekBitmap(0L);
    /**
     * @since Available in iOS 17.4 and later.
     */
    public static final MTRThermostatScheduleDayOfWeekBitmap Sunday = new MTRThermostatScheduleDayOfWeekBitmap(1L);
    /**
     * @since Available in iOS 17.4 and later.
     */
    public static final MTRThermostatScheduleDayOfWeekBitmap Monday = new MTRThermostatScheduleDayOfWeekBitmap(2L);
    /**
     * @since Available in iOS 17.4 and later.
     */
    public static final MTRThermostatScheduleDayOfWeekBitmap Tuesday = new MTRThermostatScheduleDayOfWeekBitmap(4L);
    /**
     * @since Available in iOS 17.4 and later.
     */
    public static final MTRThermostatScheduleDayOfWeekBitmap Wednesday = new MTRThermostatScheduleDayOfWeekBitmap(8L);
    /**
     * @since Available in iOS 17.4 and later.
     */
    public static final MTRThermostatScheduleDayOfWeekBitmap Thursday = new MTRThermostatScheduleDayOfWeekBitmap(16L);
    /**
     * @since Available in iOS 17.4 and later.
     */
    public static final MTRThermostatScheduleDayOfWeekBitmap Friday = new MTRThermostatScheduleDayOfWeekBitmap(32L);
    /**
     * @since Available in iOS 17.4 and later.
     */
    public static final MTRThermostatScheduleDayOfWeekBitmap Saturday = new MTRThermostatScheduleDayOfWeekBitmap(64L);
    /**
     * @since Available in iOS 17.4 and later.
     */
    public static final MTRThermostatScheduleDayOfWeekBitmap Away = new MTRThermostatScheduleDayOfWeekBitmap(128L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRThermostatScheduleDayOfWeekBitmap/*</name>*/[] values = _values(/*<name>*/MTRThermostatScheduleDayOfWeekBitmap/*</name>*/.class);

    public /*<name>*/MTRThermostatScheduleDayOfWeekBitmap/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRThermostatScheduleDayOfWeekBitmap/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRThermostatScheduleDayOfWeekBitmap/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRThermostatScheduleDayOfWeekBitmap/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRThermostatScheduleDayOfWeekBitmap/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRThermostatScheduleDayOfWeekBitmap/*</name>*/[] values() {
        return values.clone();
    }
}
