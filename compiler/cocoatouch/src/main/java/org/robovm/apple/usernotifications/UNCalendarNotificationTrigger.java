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
/*<annotations>*/@Library("UserNotifications") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UNCalendarNotificationTrigger/*</name>*/ 
    extends /*<extends>*/UNNotificationTrigger/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UNCalendarNotificationTriggerPtr extends Ptr<UNCalendarNotificationTrigger, UNCalendarNotificationTriggerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UNCalendarNotificationTrigger.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UNCalendarNotificationTrigger() {}
    protected UNCalendarNotificationTrigger(Handle h, long handle) { super(h, handle); }
    protected UNCalendarNotificationTrigger(SkipInit skipInit) { super(skipInit); }
    public UNCalendarNotificationTrigger(NSDateComponents dateComponents, boolean repeats) { super((Handle) null, create(dateComponents, repeats)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dateComponents")
    public native NSDateComponents getDateComponents();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "nextTriggerDate")
    public native NSDate nextTriggerDate();
    @Method(selector = "triggerWithDateMatchingComponents:repeats:")
    protected static native @Pointer long create(NSDateComponents dateComponents, boolean repeats);
    /*</methods>*/
}
