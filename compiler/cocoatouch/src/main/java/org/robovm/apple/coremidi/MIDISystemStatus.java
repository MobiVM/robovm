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
/*<annotations>*//*</annotations>*/
public enum /*<name>*/MIDISystemStatus/*</name>*/ implements ValuedEnum {
    /*<values>*/
    StartOfExclusive(240L),
    EndOfExclusive(247L),
    MTC(241L),
    SongPosPointer(242L),
    SongSelect(243L),
    TuneRequest(246L),
    TimingClock(248L),
    Start(250L),
    Continue(251L),
    Stop(252L),
    ActiveSending(254L),
    ActiveSensing(254L),
    SystemReset(255L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MIDISystemStatus/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MIDISystemStatus/*</name>*/ valueOf(long n) {
        for (/*<name>*/MIDISystemStatus/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MIDISystemStatus/*</name>*/.class.getName());
    }
}
