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
package org.robovm.apple.homekit;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMTimerTrigger/*</name>*/ 
    extends /*<extends>*/HMTrigger/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMTimerTriggerPtr extends Ptr<HMTimerTrigger, HMTimerTriggerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMTimerTrigger.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HMTimerTrigger(Handle h, long handle) { super(h, handle); }
    protected HMTimerTrigger(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithName:fireDate:recurrence:")
    public HMTimerTrigger(String name, NSDate fireDate, NSDateComponents recurrence) { super((SkipInit) null); initObject(init(name, fireDate, recurrence)); }
    /**
     * @deprecated Deprecated in iOS 16.4. Use -initWithName:fireDate:recurrence:
     */
    @Deprecated
    @Method(selector = "initWithName:fireDate:timeZone:recurrence:recurrenceCalendar:")
    public HMTimerTrigger(String name, NSDate fireDate, NSTimeZone timeZone, NSDateComponents recurrence, NSCalendar recurrenceCalendar) { super((SkipInit) null); initObject(init(name, fireDate, timeZone, recurrence, recurrenceCalendar)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fireDate")
    public native NSDate getFireDate();
    /**
     * @deprecated Deprecated in iOS 16.4. Use HMEventTrigger with HMCalendarEvent for triggers based on a time-zone-relative time of day
     */
    @Deprecated
    @Property(selector = "timeZone")
    public native NSTimeZone getTimeZone();
    @Property(selector = "recurrence")
    public native NSDateComponents getRecurrence();
    /**
     * @deprecated Deprecated in iOS 16.4. No longer supported
     */
    @Deprecated
    @Property(selector = "recurrenceCalendar")
    public native NSCalendar getRecurrenceCalendar();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithName:fireDate:recurrence:")
    protected native @Pointer long init(String name, NSDate fireDate, NSDateComponents recurrence);
    /**
     * @deprecated Deprecated in iOS 16.4. Use -initWithName:fireDate:recurrence:
     */
    @Deprecated
    @Method(selector = "initWithName:fireDate:timeZone:recurrence:recurrenceCalendar:")
    protected native @Pointer long init(String name, NSDate fireDate, NSTimeZone timeZone, NSDateComponents recurrence, NSCalendar recurrenceCalendar);
    @Method(selector = "updateFireDate:completionHandler:")
    public native void updateFireDate(NSDate fireDate, @Block VoidBlock1<NSError> completion);
    /**
     * @deprecated Deprecated in iOS 16.4. Use HMEventTrigger with HMCalendarEvent for triggers based on a time-zone-relative time of day
     */
    @Deprecated
    @Method(selector = "updateTimeZone:completionHandler:")
    public native void updateTimeZone(NSTimeZone timeZone, @Block VoidBlock1<NSError> completion);
    @Method(selector = "updateRecurrence:completionHandler:")
    public native void updateRecurrence(NSDateComponents recurrence, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
