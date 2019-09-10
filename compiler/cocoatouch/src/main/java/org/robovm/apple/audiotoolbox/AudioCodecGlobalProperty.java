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
public enum /*<name>*/AudioCodecGlobalProperty/*</name>*/ implements ValuedEnum {
    /*<values>*/
    SupportedInputFormats(1768320291L),
    SupportedOutputFormats(1868983587L),
    AvailableInputSampleRates(1634300786L),
    AvailableOutputSampleRates(1634694002L),
    AvailableBitRateRange(1633841780L),
    MinimumNumberInputPackets(1835952496L),
    MinimumNumberOutputPackets(1835954032L),
    AvailableNumberChannels(1668116067L),
    DoesSampleRateConversion(1819112035L),
    AvailableInputChannelLayoutTags(1634296684L),
    AvailableOutputChannelLayoutTags(1634689900L),
    InputFormatsForOutputFormat(1768305775L),
    OutputFormatsForInputFormat(1868969065L),
    FormatInfo(1633904233L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AudioCodecGlobalProperty/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AudioCodecGlobalProperty/*</name>*/ valueOf(long n) {
        for (/*<name>*/AudioCodecGlobalProperty/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AudioCodecGlobalProperty/*</name>*/.class.getName());
    }
}
