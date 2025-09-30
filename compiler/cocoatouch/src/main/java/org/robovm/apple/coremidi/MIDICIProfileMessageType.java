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
package org.robovm.apple.coremidi;

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
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsUnsignedByteMarshaler.class)/*</annotations>*/
public enum /*<name>*/MIDICIProfileMessageType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    ProfileInquiry(32L),
    ReplyToProfileInquiry(33L),
    SetProfileOn(34L),
    SetProfileOff(35L),
    ProfileEnabledReport(36L),
    ProfileDisabledReport(37L),
    ProfileAdded(38L),
    ProfileRemoved(39L),
    DetailsInquiry(40L),
    ReplyToDetailsInquiry(41L),
    ProfileSpecificData(47L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MIDICIProfileMessageType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MIDICIProfileMessageType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MIDICIProfileMessageType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MIDICIProfileMessageType/*</name>*/.class.getName());
    }
}
