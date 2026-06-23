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
package org.robovm.apple.datadetection;

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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("DataDetection") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DDMatchCalendarEvent/*</name>*/ 
    extends /*<extends>*/DDMatch/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DDMatchCalendarEventPtr extends Ptr<DDMatchCalendarEvent, DDMatchCalendarEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DDMatchCalendarEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected DDMatchCalendarEvent() {}
    protected DDMatchCalendarEvent(Handle h, long handle) { super(h, handle); }
    protected DDMatchCalendarEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isAllDay")
    public native boolean isAllDay();
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "startTimeZone")
    public native NSTimeZone getStartTimeZone();
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "endTimeZone")
    public native NSTimeZone getEndTimeZone();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
