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
 * @since Available in iOS 10.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/INBillType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Unknown(0L),
    AutoInsurance(1L),
    Cable(2L),
    CarLease(3L),
    CarLoan(4L),
    CreditCard(5L),
    Electricity(6L),
    Gas(7L),
    GarbageAndRecycling(8L),
    HealthInsurance(9L),
    HomeInsurance(10L),
    Internet(11L),
    LifeInsurance(12L),
    Mortgage(13L),
    MusicStreaming(14L),
    Phone(15L),
    Rent(16L),
    Sewer(17L),
    StudentLoan(18L),
    TrafficTicket(19L),
    Tuition(20L),
    Utilities(21L),
    Water(22L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/INBillType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/INBillType/*</name>*/ valueOf(long n) {
        for (/*<name>*/INBillType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/INBillType/*</name>*/.class.getName());
    }
}
