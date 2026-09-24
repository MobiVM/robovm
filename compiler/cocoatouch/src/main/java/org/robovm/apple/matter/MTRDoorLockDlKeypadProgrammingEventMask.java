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
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsShortMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTRDoorLockDlKeypadProgrammingEventMask/*</name>*/ extends Bits</*<name>*/MTRDoorLockDlKeypadProgrammingEventMask/*</name>*/> {
    /*<values>*/
    public static final MTRDoorLockDlKeypadProgrammingEventMask None = new MTRDoorLockDlKeypadProgrammingEventMask(0L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadProgrammingEventMask Unknown = new MTRDoorLockDlKeypadProgrammingEventMask(1L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadProgrammingEventMask ProgrammingPINChanged = new MTRDoorLockDlKeypadProgrammingEventMask(2L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadProgrammingEventMask PINAdded = new MTRDoorLockDlKeypadProgrammingEventMask(4L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadProgrammingEventMask PINCleared = new MTRDoorLockDlKeypadProgrammingEventMask(8L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadProgrammingEventMask PINChanged = new MTRDoorLockDlKeypadProgrammingEventMask(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRDoorLockDlKeypadProgrammingEventMask/*</name>*/[] values = _values(/*<name>*/MTRDoorLockDlKeypadProgrammingEventMask/*</name>*/.class);

    public /*<name>*/MTRDoorLockDlKeypadProgrammingEventMask/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRDoorLockDlKeypadProgrammingEventMask/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRDoorLockDlKeypadProgrammingEventMask/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRDoorLockDlKeypadProgrammingEventMask/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRDoorLockDlKeypadProgrammingEventMask/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRDoorLockDlKeypadProgrammingEventMask/*</name>*/[] values() {
        return values.clone();
    }
}
