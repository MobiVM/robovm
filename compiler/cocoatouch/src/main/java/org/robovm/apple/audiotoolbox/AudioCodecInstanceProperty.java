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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/AudioCodecInstanceProperty/*</name>*/ implements ValuedEnum {
    /*<values>*/
    InputBufferSize(1952609638L),
    PacketFrameSize(1885432678L),
    HasVariablePacketByteSizes(1987078975L),
    EmploysDependentPackets(1685089087L),
    MaximumPacketByteSize(1885432674L),
    PacketSizeLimitForVBR(1885432684L),
    CurrentInputFormat(1768320372L),
    CurrentOutputFormat(1868983668L),
    MagicCookie(1802857321L),
    UsedInputBufferSize(1969386854L),
    IsInitialized(1768843636L),
    CurrentTargetBitRate(1651663220L),
    CurrentInputSampleRate(1667855218L),
    CurrentOutputSampleRate(1668248434L),
    QualitySetting(1936876401L),
    ApplicableBitRateRange(1651668065L),
    RecommendedBitRateRange(1651668082L),
    ApplicableInputSampleRates(1769173601L),
    ApplicableOutputSampleRates(1869836897L),
    PaddedZeros(1885430832L),
    PrimeMethod(1886547309L),
    PrimeInfo(1886546285L),
    CurrentInputChannelLayout(1768123424L),
    CurrentOutputChannelLayout(1868786720L),
    Settings(1633907488L),
    FormatList(1633904236L),
    BitRateControlMode(1633903206L),
    SoundQualityForVBR(1986163313L),
    BitRateForVBR(1986163298L),
    DelayMode(1684893540L),
    AdjustLocalQuality(1584488812L),
    ProgramTargetLevel(1886418028L),
    DynamicRangeControlMode(1835299427L),
    ProgramTargetLevelConstant(1886678115L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AudioCodecInstanceProperty/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AudioCodecInstanceProperty/*</name>*/ valueOf(long n) {
        for (/*<name>*/AudioCodecInstanceProperty/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AudioCodecInstanceProperty/*</name>*/.class.getName());
    }
}
