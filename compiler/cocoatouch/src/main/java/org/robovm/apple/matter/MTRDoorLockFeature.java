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
/*<annotations>*//*</annotations>*/
public final class /*<name>*/MTRDoorLockFeature/*</name>*/ extends Bits</*<name>*/MTRDoorLockFeature/*</name>*/> {
    /*<values>*/
    public static final MTRDoorLockFeature None = new MTRDoorLockFeature(0L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockFeature PINCredential = new MTRDoorLockFeature(1L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockFeature RFIDCredential = new MTRDoorLockFeature(2L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockFeature FingerCredentials = new MTRDoorLockFeature(4L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockFeature Logging = new MTRDoorLockFeature(8L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockFeature WeekDayAccessSchedules = new MTRDoorLockFeature(16L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockFeature DoorPositionSensor = new MTRDoorLockFeature(32L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockFeature FaceCredentials = new MTRDoorLockFeature(64L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockFeature CredentialsOverTheAirAccess = new MTRDoorLockFeature(128L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockFeature User = new MTRDoorLockFeature(256L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockFeature Notification = new MTRDoorLockFeature(512L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRDoorLockFeature YearDayAccessSchedules = new MTRDoorLockFeature(1024L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRDoorLockFeature HolidaySchedules = new MTRDoorLockFeature(2048L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRDoorLockFeature/*</name>*/[] values = _values(/*<name>*/MTRDoorLockFeature/*</name>*/.class);

    public /*<name>*/MTRDoorLockFeature/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRDoorLockFeature/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRDoorLockFeature/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRDoorLockFeature/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRDoorLockFeature/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRDoorLockFeature/*</name>*/[] values() {
        return values.clone();
    }
}
