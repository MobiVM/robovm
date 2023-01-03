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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/AVMIDIControlChangeMessageType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    BankSelect(0L),
    ModWheel(1L),
    Breath(2L),
    Foot(4L),
    PortamentoTime(5L),
    DataEntry(6L),
    Volume(7L),
    Balance(8L),
    Pan(10L),
    Expression(11L),
    Sustain(64L),
    Portamento(65L),
    Sostenuto(66L),
    Soft(67L),
    LegatoPedal(68L),
    Hold2Pedal(69L),
    FilterResonance(71L),
    ReleaseTime(72L),
    AttackTime(73L),
    Brightness(74L),
    DecayTime(75L),
    VibratoRate(76L),
    VibratoDepth(77L),
    VibratoDelay(78L),
    ReverbLevel(91L),
    ChorusLevel(93L),
    RPN_LSB(100L),
    RPN_MSB(101L),
    AllSoundOff(120L),
    ResetAllControllers(121L),
    AllNotesOff(123L),
    OmniModeOff(124L),
    OmniModeOn(125L),
    MonoModeOn(126L),
    MonoModeOff(127L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AVMIDIControlChangeMessageType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AVMIDIControlChangeMessageType/*</name>*/ valueOf(long n) {
        for (/*<name>*/AVMIDIControlChangeMessageType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AVMIDIControlChangeMessageType/*</name>*/.class.getName());
    }
}
