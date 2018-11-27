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
public final class /*<name>*/UNAuthorizationOptions/*</name>*/ extends Bits</*<name>*/UNAuthorizationOptions/*</name>*/> {
    /*<values>*/
    public static final UNAuthorizationOptions None = new UNAuthorizationOptions(0L);
    public static final UNAuthorizationOptions Badge = new UNAuthorizationOptions(1L);
    public static final UNAuthorizationOptions Sound = new UNAuthorizationOptions(2L);
    public static final UNAuthorizationOptions Alert = new UNAuthorizationOptions(4L);
    public static final UNAuthorizationOptions CarPlay = new UNAuthorizationOptions(8L);
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final UNAuthorizationOptions CriticalAlert = new UNAuthorizationOptions(16L);
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final UNAuthorizationOptions ProvidesAppNotificationSettings = new UNAuthorizationOptions(32L);
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final UNAuthorizationOptions Provisional = new UNAuthorizationOptions(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/UNAuthorizationOptions/*</name>*/[] values = _values(/*<name>*/UNAuthorizationOptions/*</name>*/.class);

    public /*<name>*/UNAuthorizationOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/UNAuthorizationOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UNAuthorizationOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UNAuthorizationOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/UNAuthorizationOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UNAuthorizationOptions/*</name>*/[] values() {
        return values.clone();
    }
}
