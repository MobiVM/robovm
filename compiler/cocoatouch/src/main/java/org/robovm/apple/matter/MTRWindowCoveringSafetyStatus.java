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
public final class /*<name>*/MTRWindowCoveringSafetyStatus/*</name>*/ extends Bits</*<name>*/MTRWindowCoveringSafetyStatus/*</name>*/> {
    /*<values>*/
    public static final MTRWindowCoveringSafetyStatus None = new MTRWindowCoveringSafetyStatus(0L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringSafetyStatus RemoteLockout = new MTRWindowCoveringSafetyStatus(1L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringSafetyStatus TamperDetection = new MTRWindowCoveringSafetyStatus(2L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringSafetyStatus FailedCommunication = new MTRWindowCoveringSafetyStatus(4L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringSafetyStatus PositionFailure = new MTRWindowCoveringSafetyStatus(8L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringSafetyStatus ThermalProtection = new MTRWindowCoveringSafetyStatus(16L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringSafetyStatus ObstacleDetected = new MTRWindowCoveringSafetyStatus(32L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringSafetyStatus Power = new MTRWindowCoveringSafetyStatus(64L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringSafetyStatus StopInput = new MTRWindowCoveringSafetyStatus(128L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringSafetyStatus MotorJammed = new MTRWindowCoveringSafetyStatus(256L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringSafetyStatus HardwareFailure = new MTRWindowCoveringSafetyStatus(512L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringSafetyStatus ManualOperation = new MTRWindowCoveringSafetyStatus(1024L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringSafetyStatus Protection = new MTRWindowCoveringSafetyStatus(2048L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRWindowCoveringSafetyStatus/*</name>*/[] values = _values(/*<name>*/MTRWindowCoveringSafetyStatus/*</name>*/.class);

    public /*<name>*/MTRWindowCoveringSafetyStatus/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRWindowCoveringSafetyStatus/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRWindowCoveringSafetyStatus/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRWindowCoveringSafetyStatus/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRWindowCoveringSafetyStatus/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRWindowCoveringSafetyStatus/*</name>*/[] values() {
        return values.clone();
    }
}
