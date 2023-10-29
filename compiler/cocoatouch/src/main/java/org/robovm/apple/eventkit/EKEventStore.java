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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EKEventStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 4.0 and later.
         */
        public static NSObject observeChanged(EKEventStore object, final VoidBlock1<EKEventStore> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ChangedNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((EKEventStore) a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class EKEventStorePtr extends Ptr<EKEventStore, EKEventStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(EKEventStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EKEventStore() {}
    protected EKEventStore(Handle h, long handle) { super(h, handle); }
    protected EKEventStore(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithSources:")
    public EKEventStore(NSArray<EKSource> sources) { super((SkipInit) null); initObject(init(sources)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "eventStoreIdentifier")
    public native String getEventStoreIdentifier();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "delegateSources")
    public native NSArray<EKSource> getDelegateSources();
    @Property(selector = "sources")
    public native NSArray<EKSource> getSources();
    @Property(selector = "defaultCalendarForNewEvents")
    public native EKCalendar getDefaultCalendarForNewEvents();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="EKEventStoreChangedNotification", optional=true)
    public static native NSString ChangedNotification();
    
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithSources:")
    protected native @Pointer long init(NSArray<EKSource> sources);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "requestFullAccessToEventsWithCompletion:")
    public native void requestFullAccessToEvents(@Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "requestWriteOnlyAccessToEventsWithCompletion:")
    public native void requestWriteOnlyAccessToEventsWithCompletion(@Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "requestFullAccessToRemindersWithCompletion:")
    public native void requestFullAccessToReminders(@Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @deprecated Deprecated in iOS 17.0. Use -requestFullAccessToEventsWithCompletion:, -requestWriteOnlyAccessToEventsWithCompletion:, or -requestFullAccessToRemindersWithCompletion:
     */
    @Deprecated
    @Method(selector = "requestAccessToEntityType:completion:")
    public native void requestAccess(EKEntityType entityType, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "sourceWithIdentifier:")
    public native EKSource getSource(String identifier);
    @Method(selector = "calendarsForEntityType:")
    public native NSArray<EKCalendar> getCalendars(EKEntityType entityType);
    @Method(selector = "defaultCalendarForNewReminders")
    public native EKCalendar getDefaultCalendarForNewReminders();
    @Method(selector = "calendarWithIdentifier:")
    public native EKCalendar getCalendar(String identifier);
    public boolean saveCalendar(EKCalendar calendar, boolean commit) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = saveCalendar(calendar, commit, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "saveCalendar:commit:error:")
    private native boolean saveCalendar(EKCalendar calendar, boolean commit, NSError.NSErrorPtr error);
    public boolean removeCalendar(EKCalendar calendar, boolean commit) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = removeCalendar(calendar, commit, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "removeCalendar:commit:error:")
    private native boolean removeCalendar(EKCalendar calendar, boolean commit, NSError.NSErrorPtr error);
    @Method(selector = "calendarItemWithIdentifier:")
    public native EKCalendarItem getCalendarItem(String identifier);
    @Method(selector = "calendarItemsWithExternalIdentifier:")
    public native NSArray<EKCalendarItem> getCalendarItems(String externalIdentifier);
    public boolean saveEvent(EKEvent event, EKSpan span) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = saveEvent(event, span, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "saveEvent:span:error:")
    private native boolean saveEvent(EKEvent event, EKSpan span, NSError.NSErrorPtr error);
    public boolean removeEvent(EKEvent event, EKSpan span) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = removeEvent(event, span, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "removeEvent:span:error:")
    private native boolean removeEvent(EKEvent event, EKSpan span, NSError.NSErrorPtr error);
    public boolean saveEvent(EKEvent event, EKSpan span, boolean commit) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = saveEvent(event, span, commit, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "saveEvent:span:commit:error:")
    private native boolean saveEvent(EKEvent event, EKSpan span, boolean commit, NSError.NSErrorPtr error);
    public boolean removeEvent(EKEvent event, EKSpan span, boolean commit) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = removeEvent(event, span, commit, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "removeEvent:span:commit:error:")
    private native boolean removeEvent(EKEvent event, EKSpan span, boolean commit, NSError.NSErrorPtr error);
    @Method(selector = "eventWithIdentifier:")
    public native EKEvent getEvent(String identifier);
    @Method(selector = "eventsMatchingPredicate:")
    public native NSArray<EKEvent> getEvents(NSPredicate predicate);
    @Method(selector = "enumerateEventsMatchingPredicate:usingBlock:")
    public native void enumerateEvents(NSPredicate predicate, @Block VoidBlock2<EKEvent, BooleanPtr> block);
    @Method(selector = "predicateForEventsWithStartDate:endDate:calendars:")
    public native NSPredicate getPredicateForEvents(NSDate startDate, NSDate endDate, NSArray<EKCalendar> calendars);
    public boolean saveReminder(EKReminder reminder, boolean commit) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = saveReminder(reminder, commit, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "saveReminder:commit:error:")
    private native boolean saveReminder(EKReminder reminder, boolean commit, NSError.NSErrorPtr error);
    public boolean removeReminder(EKReminder reminder, boolean commit) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = removeReminder(reminder, commit, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "removeReminder:commit:error:")
    private native boolean removeReminder(EKReminder reminder, boolean commit, NSError.NSErrorPtr error);
    @Method(selector = "fetchRemindersMatchingPredicate:completion:")
    public native NSObject fetchReminders(NSPredicate predicate, @Block VoidBlock1<NSArray<EKReminder>> completion);
    @Method(selector = "cancelFetchRequest:")
    public native void cancelFetchRequest(NSObject fetchIdentifier);
    @Method(selector = "predicateForRemindersInCalendars:")
    public native NSPredicate getPredicateForReminders(NSArray<EKCalendar> calendars);
    @Method(selector = "predicateForIncompleteRemindersWithDueDateStarting:ending:calendars:")
    public native NSPredicate getPredicateForIncompleteReminders(NSDate startDate, NSDate endDate, NSArray<EKCalendar> calendars);
    @Method(selector = "predicateForCompletedRemindersWithCompletionDateStarting:ending:calendars:")
    public native NSPredicate getPredicateForCompletedReminders(NSDate startDate, NSDate endDate, NSArray<EKCalendar> calendars);
    public boolean commit() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = commit(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "commit:")
    private native boolean commit(NSError.NSErrorPtr error);
    @Method(selector = "reset")
    public native void reset();
    @Method(selector = "refreshSourcesIfNecessary")
    public native void refreshSourcesIfNecessary();
    @Method(selector = "authorizationStatusForEntityType:")
    public static native EKAuthorizationStatus getAuthorizationStatusForEntityType(EKEntityType entityType);
    /*</methods>*/
}
