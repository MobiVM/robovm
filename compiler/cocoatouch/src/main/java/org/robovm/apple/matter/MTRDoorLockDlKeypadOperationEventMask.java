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
public final class /*<name>*/MTRDoorLockDlKeypadOperationEventMask/*</name>*/ extends Bits</*<name>*/MTRDoorLockDlKeypadOperationEventMask/*</name>*/> {
    /*<values>*/
    public static final MTRDoorLockDlKeypadOperationEventMask None = new MTRDoorLockDlKeypadOperationEventMask(0L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadOperationEventMask Unknown = new MTRDoorLockDlKeypadOperationEventMask(1L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadOperationEventMask Lock = new MTRDoorLockDlKeypadOperationEventMask(2L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadOperationEventMask Unlock = new MTRDoorLockDlKeypadOperationEventMask(4L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadOperationEventMask LockInvalidPIN = new MTRDoorLockDlKeypadOperationEventMask(8L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadOperationEventMask LockInvalidSchedule = new MTRDoorLockDlKeypadOperationEventMask(16L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadOperationEventMask UnlockInvalidCode = new MTRDoorLockDlKeypadOperationEventMask(32L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadOperationEventMask UnlockInvalidSchedule = new MTRDoorLockDlKeypadOperationEventMask(64L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlKeypadOperationEventMask NonAccessUserOpEvent = new MTRDoorLockDlKeypadOperationEventMask(128L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRDoorLockDlKeypadOperationEventMask/*</name>*/[] values = _values(/*<name>*/MTRDoorLockDlKeypadOperationEventMask/*</name>*/.class);

    public /*<name>*/MTRDoorLockDlKeypadOperationEventMask/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRDoorLockDlKeypadOperationEventMask/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRDoorLockDlKeypadOperationEventMask/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRDoorLockDlKeypadOperationEventMask/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRDoorLockDlKeypadOperationEventMask/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRDoorLockDlKeypadOperationEventMask/*</name>*/[] values() {
        return values.clone();
    }
}
