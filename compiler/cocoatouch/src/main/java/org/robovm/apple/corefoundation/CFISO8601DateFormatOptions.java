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
package org.robovm.apple.corefoundation;

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
import org.robovm.apple.coreservices.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/CFISO8601DateFormatOptions/*</name>*/ extends Bits</*<name>*/CFISO8601DateFormatOptions/*</name>*/> {
    /*<values>*/
    public static final CFISO8601DateFormatOptions None = new CFISO8601DateFormatOptions(0L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions Year = new CFISO8601DateFormatOptions(1L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions Month = new CFISO8601DateFormatOptions(2L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions WeekOfYear = new CFISO8601DateFormatOptions(4L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions Day = new CFISO8601DateFormatOptions(16L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions Time = new CFISO8601DateFormatOptions(32L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions TimeZone = new CFISO8601DateFormatOptions(64L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions SpaceBetweenDateAndTime = new CFISO8601DateFormatOptions(128L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions DashSeparatorInDate = new CFISO8601DateFormatOptions(256L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions ColonSeparatorInTime = new CFISO8601DateFormatOptions(512L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions ColonSeparatorInTimeZone = new CFISO8601DateFormatOptions(1024L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final CFISO8601DateFormatOptions FractionalSeconds = new CFISO8601DateFormatOptions(2048L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions FullDate = new CFISO8601DateFormatOptions(275L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions FullTime = new CFISO8601DateFormatOptions(1632L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final CFISO8601DateFormatOptions InternetDateTime = new CFISO8601DateFormatOptions(1907L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/CFISO8601DateFormatOptions/*</name>*/[] values = _values(/*<name>*/CFISO8601DateFormatOptions/*</name>*/.class);

    public /*<name>*/CFISO8601DateFormatOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/CFISO8601DateFormatOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CFISO8601DateFormatOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CFISO8601DateFormatOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/CFISO8601DateFormatOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CFISO8601DateFormatOptions/*</name>*/[] values() {
        return values.clone();
    }
}
