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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSISO8601DateFormatOptions/*</name>*/ extends Bits</*<name>*/NSISO8601DateFormatOptions/*</name>*/> {
    /*<values>*/
    public static final NSISO8601DateFormatOptions None = new NSISO8601DateFormatOptions(0L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions Year = new NSISO8601DateFormatOptions(1L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions Month = new NSISO8601DateFormatOptions(2L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions WeekOfYear = new NSISO8601DateFormatOptions(4L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions Day = new NSISO8601DateFormatOptions(16L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions Time = new NSISO8601DateFormatOptions(32L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions TimeZone = new NSISO8601DateFormatOptions(64L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions SpaceBetweenDateAndTime = new NSISO8601DateFormatOptions(128L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions DashSeparatorInDate = new NSISO8601DateFormatOptions(256L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions ColonSeparatorInTime = new NSISO8601DateFormatOptions(512L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions ColonSeparatorInTimeZone = new NSISO8601DateFormatOptions(1024L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final NSISO8601DateFormatOptions FractionalSeconds = new NSISO8601DateFormatOptions(2048L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions FullDate = new NSISO8601DateFormatOptions(275L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions FullTime = new NSISO8601DateFormatOptions(1632L);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSISO8601DateFormatOptions InternetDateTime = new NSISO8601DateFormatOptions(1907L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NSISO8601DateFormatOptions/*</name>*/[] values = _values(/*<name>*/NSISO8601DateFormatOptions/*</name>*/.class);

    public /*<name>*/NSISO8601DateFormatOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/NSISO8601DateFormatOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSISO8601DateFormatOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSISO8601DateFormatOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/NSISO8601DateFormatOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSISO8601DateFormatOptions/*</name>*/[] values() {
        return values.clone();
    }
}
