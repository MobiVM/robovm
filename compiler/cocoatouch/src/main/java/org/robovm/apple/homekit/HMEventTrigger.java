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
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMEventTrigger/*</name>*/ 
    extends /*<extends>*/HMTrigger/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMEventTriggerPtr extends Ptr<HMEventTrigger, HMEventTriggerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMEventTrigger.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HMEventTrigger(Handle h, long handle) { super(h, handle); }
    protected HMEventTrigger(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:events:predicate:")
    public HMEventTrigger(String name, NSArray<HMEvent> events, NSPredicate predicate) { super((SkipInit) null); initObject(init(name, events, predicate)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithName:events:endEvents:recurrences:predicate:")
    public HMEventTrigger(String name, NSArray<HMEvent> events, NSArray<HMEvent> endEvents, NSArray<NSDateComponents> recurrences, NSPredicate predicate) { super((SkipInit) null); initObject(init(name, events, endEvents, recurrences, predicate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "events")
    public native NSArray<HMEvent> getEvents();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "endEvents")
    public native NSArray<HMEvent> getEndEvents();
    @Property(selector = "predicate")
    public native NSPredicate getPredicate();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "recurrences")
    public native NSArray<NSDateComponents> getRecurrences();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "executeOnce")
    public native boolean isExecuteOnce();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "triggerActivationState")
    public native HMEventTriggerActivationState getTriggerActivationState();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:events:predicate:")
    protected native @Pointer long init(String name, NSArray<HMEvent> events, NSPredicate predicate);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithName:events:endEvents:recurrences:predicate:")
    protected native @Pointer long init(String name, NSArray<HMEvent> events, NSArray<HMEvent> endEvents, NSArray<NSDateComponents> recurrences, NSPredicate predicate);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use updateEvents:completionHandler: instead
     */
    @Deprecated
    @Method(selector = "addEvent:completionHandler:")
    public native void addEvent(HMEvent event, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use updateEvents:completionHandler: instead
     */
    @Deprecated
    @Method(selector = "removeEvent:completionHandler:")
    public native void removeEvent(HMEvent event, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "updateEvents:completionHandler:")
    public native void updateEvents(NSArray<HMEvent> events, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "updateEndEvents:completionHandler:")
    public native void updateEndEvents(NSArray<HMEvent> endEvents, @Block VoidBlock1<NSError> completion);
    @Method(selector = "updatePredicate:completionHandler:")
    public native void updatePredicate(NSPredicate predicate, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "updateRecurrences:completionHandler:")
    public native void updateRecurrences(NSArray<NSDateComponents> recurrences, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "updateExecuteOnce:completionHandler:")
    public native void updateExecuteOnce(boolean executeOnce, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use predicateForEvaluatingTriggerOccurringBeforeSignificantEvent: instead
     */
    @Deprecated
    @Method(selector = "predicateForEvaluatingTriggerOccurringBeforeSignificantEvent:applyingOffset:")
    public static native NSPredicate getPredicateForEvaluatingTriggerOccurringBeforeSignificantEvent(HMSignificantEvent significantEvent, NSDateComponents offset);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "predicateForEvaluatingTriggerOccurringBeforeSignificantEvent:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringBeforeSignificantEvent(HMSignificantTimeEvent significantEvent);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use predicateForEvaluatingTriggerOccurringAfterSignificantEvent: instead
     */
    @Deprecated
    @Method(selector = "predicateForEvaluatingTriggerOccurringAfterSignificantEvent:applyingOffset:")
    public static native NSPredicate getPredicateForEvaluatingTriggerOccurringAfterSignificantEvent(HMSignificantEvent significantEvent, NSDateComponents offset);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "predicateForEvaluatingTriggerOccurringAfterSignificantEvent:")
    public static native NSPredicate predicateForEvaluatingTriggerOccurringAfterSignificantEvent(HMSignificantTimeEvent significantEvent);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "predicateForEvaluatingTriggerOccurringBetweenSignificantEvent:secondSignificantEvent:")
    public static native NSPredicate getPredicateForEvaluatingTriggerOccurringBetweenSignificantEvent(HMSignificantTimeEvent firstSignificantEvent, HMSignificantTimeEvent secondSignificantEvent);
    @Method(selector = "predicateForEvaluatingTriggerOccurringBeforeDateWithComponents:")
    public static native NSPredicate getPredicateForEvaluatingTriggerOccurringBeforeDate(NSDateComponents dateComponents);
    @Method(selector = "predicateForEvaluatingTriggerOccurringOnDateWithComponents:")
    public static native NSPredicate getPredicateForEvaluatingTriggerOccurringOnDate(NSDateComponents dateComponents);
    @Method(selector = "predicateForEvaluatingTriggerOccurringAfterDateWithComponents:")
    public static native NSPredicate getPredicateForEvaluatingTriggerOccurringAfterDate(NSDateComponents dateComponents);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "predicateForEvaluatingTriggerOccurringBetweenDateWithComponents:secondDateWithComponents:")
    public static native NSPredicate getPredicateForEvaluatingTriggerOccurringBetweenDate(NSDateComponents firstDateComponents, NSDateComponents secondDateWithComponents);
    @Method(selector = "predicateForEvaluatingTriggerWithCharacteristic:relatedBy:toValue:")
    public static native NSPredicate getPredicateForEvaluatingTrigger(HMCharacteristic characteristic, NSPredicateOperatorType operatorType, NSObject value);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "predicateForEvaluatingTriggerWithPresence:")
    public static native NSPredicate getPredicateForEvaluatingTrigger(HMPresenceEvent presenceEvent);
    /*</methods>*/
}
