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
package org.robovm.apple.eventkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.mapkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("EventKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EKCalendarItem/*</name>*/ 
    extends /*<extends>*/EKObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EKCalendarItemPtr extends Ptr<EKCalendarItem, EKCalendarItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(EKCalendarItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EKCalendarItem() {}
    @Deprecated protected EKCalendarItem(long handle) { super(handle); }
    protected EKCalendarItem(Handle h, long handle) { super(h, handle); }
    protected EKCalendarItem(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "calendar")
    public native EKCalendar getCalendar();
    @Property(selector = "setCalendar:")
    public native void setCalendar(EKCalendar v);
    @Property(selector = "calendarItemIdentifier")
    public native String getCalendarItemIdentifier();
    @Property(selector = "calendarItemExternalIdentifier")
    public native String getCalendarItemExternalIdentifier();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "location")
    public native String getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(String v);
    @Property(selector = "notes")
    public native String getNotes();
    @Property(selector = "setNotes:")
    public native void setNotes(String v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "lastModifiedDate")
    public native NSDate getLastModifiedDate();
    @Property(selector = "creationDate")
    public native NSDate getCreationDate();
    @Property(selector = "timeZone")
    public native NSTimeZone getTimeZone();
    @Property(selector = "setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
    @Property(selector = "hasAlarms")
    public native boolean hasAlarms();
    @Property(selector = "hasRecurrenceRules")
    public native boolean hasRecurrenceRules();
    @Property(selector = "hasAttendees")
    public native boolean hasAttendees();
    @Property(selector = "hasNotes")
    public native boolean hasNotes();
    @Property(selector = "attendees")
    public native NSArray<EKParticipant> getAttendees();
    @Property(selector = "alarms")
    public native NSArray<EKAlarm> getAlarms();
    @Property(selector = "setAlarms:")
    public native void setAlarms(NSArray<EKAlarm> v);
    @Property(selector = "recurrenceRules")
    public native NSArray<EKRecurrenceRule> getRecurrenceRules();
    @Property(selector = "setRecurrenceRules:")
    public native void setRecurrenceRules(NSArray<EKRecurrenceRule> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addAlarm:")
    public native void addAlarm(EKAlarm alarm);
    @Method(selector = "removeAlarm:")
    public native void removeAlarm(EKAlarm alarm);
    @Method(selector = "addRecurrenceRule:")
    public native void addRecurrenceRule(EKRecurrenceRule rule);
    @Method(selector = "removeRecurrenceRule:")
    public native void removeRecurrenceRule(EKRecurrenceRule rule);
    /*</methods>*/
}
