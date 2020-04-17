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
public enum /*<name>*/AudioCodecProperty/*</name>*/ implements ValuedEnum {
    /*<values>*/
    MinimumDelayMode(1835296108L),
    NameCFString(1819173229L),
    ManufacturerCFString(1819107691L),
    FormatCFString(1818652530L),
    PropertyRequiresPacketDescription(1885432676L),
    PropertyAvailableBitRates(1651668003L),
    ExtendFrequencies(1633903974L),
    UseRecommendedSampleRate(1970434930L),
    OutputPrecedence(1869639794L),
    BitRateFormat(1633903206L),
    DoesSampleRateConversion(1819112035L),
    InputFormatsForOutputFormat(1768305775L),
    OutputFormatsForInputFormat(1868969065L),
    PropertyInputChannelLayout(1768123424L),
    PropertyOutputChannelLayout(1868786720L),
    PropertyAvailableInputChannelLayouts(1634296684L),
    PropertyAvailableOutputChannelLayouts(1634689900L),
    PropertyZeroFramesPadded(1885430832L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*/
    public static final String TopLevelKey = "name";
    public static final String Version = "version";
    public static final String Parameters = "parameters";
    public static final String SettingKey = "key";
    public static final String SettingName = "name";
    public static final String ValueType = "value type";
    public static final String AvailableValues = "available values";
    public static final String LimitedValues = "limited values";
    public static final String CurrentValue = "current value";
    public static final String Summary = "summary";
    public static final String Hint = "hint";
    public static final String Unit = "unit";
    /*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AudioCodecProperty/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AudioCodecProperty/*</name>*/ valueOf(long n) {
        for (/*<name>*/AudioCodecProperty/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AudioCodecProperty/*</name>*/.class.getName());
    }
}
