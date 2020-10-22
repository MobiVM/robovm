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
package org.robovm.apple.usernotifications;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/UNNotificationPresentationOptions/*</name>*/ extends Bits</*<name>*/UNNotificationPresentationOptions/*</name>*/> {
    /*<values>*/
    public static final UNNotificationPresentationOptions None = new UNNotificationPresentationOptions(0L);
    public static final UNNotificationPresentationOptions Badge = new UNNotificationPresentationOptions(1L);
    public static final UNNotificationPresentationOptions Sound = new UNNotificationPresentationOptions(2L);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use UNNotificationPresentationOptionList | UNNotificationPresentationOptionBanner
     */
    @Deprecated
    public static final UNNotificationPresentationOptions Alert = new UNNotificationPresentationOptions(4L);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final UNNotificationPresentationOptions List = new UNNotificationPresentationOptions(8L);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public static final UNNotificationPresentationOptions Banner = new UNNotificationPresentationOptions(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/UNNotificationPresentationOptions/*</name>*/[] values = _values(/*<name>*/UNNotificationPresentationOptions/*</name>*/.class);

    public /*<name>*/UNNotificationPresentationOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/UNNotificationPresentationOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UNNotificationPresentationOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UNNotificationPresentationOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/UNNotificationPresentationOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UNNotificationPresentationOptions/*</name>*/[] values() {
        return values.clone();
    }
}
