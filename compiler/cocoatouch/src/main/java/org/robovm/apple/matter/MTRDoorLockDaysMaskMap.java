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
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsByteMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTRDoorLockDaysMaskMap/*</name>*/ extends Bits</*<name>*/MTRDoorLockDaysMaskMap/*</name>*/> {
    /*<values>*/
    public static final MTRDoorLockDaysMaskMap None = new MTRDoorLockDaysMaskMap(0L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockDaysMaskMap Sunday = new MTRDoorLockDaysMaskMap(1L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockDaysMaskMap Monday = new MTRDoorLockDaysMaskMap(2L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockDaysMaskMap Tuesday = new MTRDoorLockDaysMaskMap(4L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockDaysMaskMap Wednesday = new MTRDoorLockDaysMaskMap(8L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockDaysMaskMap Thursday = new MTRDoorLockDaysMaskMap(16L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockDaysMaskMap Friday = new MTRDoorLockDaysMaskMap(32L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockDaysMaskMap Saturday = new MTRDoorLockDaysMaskMap(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRDoorLockDaysMaskMap/*</name>*/[] values = _values(/*<name>*/MTRDoorLockDaysMaskMap/*</name>*/.class);

    public /*<name>*/MTRDoorLockDaysMaskMap/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRDoorLockDaysMaskMap/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRDoorLockDaysMaskMap/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRDoorLockDaysMaskMap/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRDoorLockDaysMaskMap/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRDoorLockDaysMaskMap/*</name>*/[] values() {
        return values.clone();
    }
}
