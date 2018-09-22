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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/INStartWorkoutIntentResponseCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Unspecified(0L),
    Ready(1L),
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. INStartWorkoutIntentResponseCodeContinueInApp is deprecated on iOS. Please use INStartWorkoutIntentResponseCodeHandleInApp instead
     */
    @Deprecated
    ContinueInApp(2L),
    Failure(3L),
    FailureRequiringAppLaunch(4L),
    FailureOngoingWorkout(5L),
    FailureNoMatchingWorkout(6L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    HandleInApp(7L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    Success(8L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/INStartWorkoutIntentResponseCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/INStartWorkoutIntentResponseCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/INStartWorkoutIntentResponseCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/INStartWorkoutIntentResponseCode/*</name>*/.class.getName());
    }
}
