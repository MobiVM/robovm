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
 * @deprecated Deprecated in iOS 17.0. Please use MTRFanControlWindBitmap
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsByteMarshaler.class) @Deprecated/*</annotations>*/
public final class /*<name>*/MTRFanControlWindSettingMask/*</name>*/ extends Bits</*<name>*/MTRFanControlWindSettingMask/*</name>*/> {
    /*<values>*/
    public static final MTRFanControlWindSettingMask None = new MTRFanControlWindSettingMask(0L);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRFanControlWindBitmapSleepWind
     */
    @Deprecated
    public static final MTRFanControlWindSettingMask SleepWind = new MTRFanControlWindSettingMask(1L);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRFanControlWindBitmapNaturalWind
     */
    @Deprecated
    public static final MTRFanControlWindSettingMask NaturalWind = new MTRFanControlWindSettingMask(2L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRFanControlWindSettingMask/*</name>*/[] values = _values(/*<name>*/MTRFanControlWindSettingMask/*</name>*/.class);

    public /*<name>*/MTRFanControlWindSettingMask/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRFanControlWindSettingMask/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRFanControlWindSettingMask/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRFanControlWindSettingMask/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRFanControlWindSettingMask/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRFanControlWindSettingMask/*</name>*/[] values() {
        return values.clone();
    }
}
