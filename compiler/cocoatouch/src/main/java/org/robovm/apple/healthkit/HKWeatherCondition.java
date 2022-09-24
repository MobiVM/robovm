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
package org.robovm.apple.healthkit;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/HKWeatherCondition/*</name>*/ implements ValuedEnum {
    /*<values>*/
    None(0L),
    Clear(1L),
    Fair(2L),
    PartlyCloudy(3L),
    MostlyCloudy(4L),
    Cloudy(5L),
    Foggy(6L),
    Haze(7L),
    Windy(8L),
    Blustery(9L),
    Smoky(10L),
    Dust(11L),
    Snow(12L),
    Hail(13L),
    Sleet(14L),
    FreezingDrizzle(15L),
    FreezingRain(16L),
    MixedRainAndHail(17L),
    MixedRainAndSnow(18L),
    MixedRainAndSleet(19L),
    MixedSnowAndSleet(20L),
    Drizzle(21L),
    ScatteredShowers(22L),
    Showers(23L),
    Thunderstorms(24L),
    TropicalStorm(25L),
    Hurricane(26L),
    Tornado(27L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/HKWeatherCondition/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/HKWeatherCondition/*</name>*/ valueOf(long n) {
        for (/*<name>*/HKWeatherCondition/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/HKWeatherCondition/*</name>*/.class.getName());
    }
}
