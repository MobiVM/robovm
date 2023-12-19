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
public final class /*<name>*/MTRDoorLockDlManualOperationEventMask/*</name>*/ extends Bits</*<name>*/MTRDoorLockDlManualOperationEventMask/*</name>*/> {
    /*<values>*/
    public static final MTRDoorLockDlManualOperationEventMask None = new MTRDoorLockDlManualOperationEventMask(0L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlManualOperationEventMask Unknown = new MTRDoorLockDlManualOperationEventMask(1L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlManualOperationEventMask ThumbturnLock = new MTRDoorLockDlManualOperationEventMask(2L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlManualOperationEventMask ThumbturnUnlock = new MTRDoorLockDlManualOperationEventMask(4L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlManualOperationEventMask OneTouchLock = new MTRDoorLockDlManualOperationEventMask(8L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlManualOperationEventMask KeyLock = new MTRDoorLockDlManualOperationEventMask(16L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlManualOperationEventMask KeyUnlock = new MTRDoorLockDlManualOperationEventMask(32L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlManualOperationEventMask AutoLock = new MTRDoorLockDlManualOperationEventMask(64L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlManualOperationEventMask ScheduleLock = new MTRDoorLockDlManualOperationEventMask(128L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlManualOperationEventMask ScheduleUnlock = new MTRDoorLockDlManualOperationEventMask(256L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlManualOperationEventMask ManualLock = new MTRDoorLockDlManualOperationEventMask(512L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockDlManualOperationEventMask ManualUnlock = new MTRDoorLockDlManualOperationEventMask(1024L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRDoorLockDlManualOperationEventMask/*</name>*/[] values = _values(/*<name>*/MTRDoorLockDlManualOperationEventMask/*</name>*/.class);

    public /*<name>*/MTRDoorLockDlManualOperationEventMask/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRDoorLockDlManualOperationEventMask/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRDoorLockDlManualOperationEventMask/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRDoorLockDlManualOperationEventMask/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRDoorLockDlManualOperationEventMask/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRDoorLockDlManualOperationEventMask/*</name>*/[] values() {
        return values.clone();
    }
}
