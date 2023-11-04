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
 * @since Available in iOS 16.5 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsShortMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTRPumpConfigurationAndControlPumpStatusBitmap/*</name>*/ extends Bits</*<name>*/MTRPumpConfigurationAndControlPumpStatusBitmap/*</name>*/> {
    /*<values>*/
    public static final MTRPumpConfigurationAndControlPumpStatusBitmap None = new MTRPumpConfigurationAndControlPumpStatusBitmap(0L);
    /**
     * @since Available in iOS 16.5 and later.
     */
    public static final MTRPumpConfigurationAndControlPumpStatusBitmap DeviceFault = new MTRPumpConfigurationAndControlPumpStatusBitmap(1L);
    /**
     * @since Available in iOS 16.5 and later.
     */
    public static final MTRPumpConfigurationAndControlPumpStatusBitmap Supplyfault = new MTRPumpConfigurationAndControlPumpStatusBitmap(2L);
    /**
     * @since Available in iOS 16.5 and later.
     */
    public static final MTRPumpConfigurationAndControlPumpStatusBitmap SpeedLow = new MTRPumpConfigurationAndControlPumpStatusBitmap(4L);
    /**
     * @since Available in iOS 16.5 and later.
     */
    public static final MTRPumpConfigurationAndControlPumpStatusBitmap SpeedHigh = new MTRPumpConfigurationAndControlPumpStatusBitmap(8L);
    /**
     * @since Available in iOS 16.5 and later.
     */
    public static final MTRPumpConfigurationAndControlPumpStatusBitmap LocalOverride = new MTRPumpConfigurationAndControlPumpStatusBitmap(16L);
    /**
     * @since Available in iOS 16.5 and later.
     */
    public static final MTRPumpConfigurationAndControlPumpStatusBitmap Running = new MTRPumpConfigurationAndControlPumpStatusBitmap(32L);
    /**
     * @since Available in iOS 16.5 and later.
     */
    public static final MTRPumpConfigurationAndControlPumpStatusBitmap RemotePressure = new MTRPumpConfigurationAndControlPumpStatusBitmap(64L);
    /**
     * @since Available in iOS 16.5 and later.
     */
    public static final MTRPumpConfigurationAndControlPumpStatusBitmap RemoteFlow = new MTRPumpConfigurationAndControlPumpStatusBitmap(128L);
    /**
     * @since Available in iOS 16.5 and later.
     */
    public static final MTRPumpConfigurationAndControlPumpStatusBitmap RemoteTemperature = new MTRPumpConfigurationAndControlPumpStatusBitmap(256L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRPumpConfigurationAndControlPumpStatusBitmap/*</name>*/[] values = _values(/*<name>*/MTRPumpConfigurationAndControlPumpStatusBitmap/*</name>*/.class);

    public /*<name>*/MTRPumpConfigurationAndControlPumpStatusBitmap/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRPumpConfigurationAndControlPumpStatusBitmap/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRPumpConfigurationAndControlPumpStatusBitmap/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRPumpConfigurationAndControlPumpStatusBitmap/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRPumpConfigurationAndControlPumpStatusBitmap/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRPumpConfigurationAndControlPumpStatusBitmap/*</name>*/[] values() {
        return values.clone();
    }
}
