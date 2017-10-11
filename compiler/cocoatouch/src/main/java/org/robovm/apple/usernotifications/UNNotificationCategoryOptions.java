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
public final class /*<name>*/UNNotificationCategoryOptions/*</name>*/ extends Bits</*<name>*/UNNotificationCategoryOptions/*</name>*/> {
    /*<values>*/
    public static final UNNotificationCategoryOptions None = new UNNotificationCategoryOptions(0L);
    public static final UNNotificationCategoryOptions CustomDismissAction = new UNNotificationCategoryOptions(1L);
    public static final UNNotificationCategoryOptions AllowInCarPlay = new UNNotificationCategoryOptions(2L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final UNNotificationCategoryOptions HiddenPreviewsShowTitle = new UNNotificationCategoryOptions(4L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final UNNotificationCategoryOptions HiddenPreviewsShowSubtitle = new UNNotificationCategoryOptions(8L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/UNNotificationCategoryOptions/*</name>*/[] values = _values(/*<name>*/UNNotificationCategoryOptions/*</name>*/.class);

    public /*<name>*/UNNotificationCategoryOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/UNNotificationCategoryOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UNNotificationCategoryOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UNNotificationCategoryOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/UNNotificationCategoryOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UNNotificationCategoryOptions/*</name>*/[] values() {
        return values.clone();
    }
}
