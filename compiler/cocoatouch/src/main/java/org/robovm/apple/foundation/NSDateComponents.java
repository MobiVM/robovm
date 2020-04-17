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
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSDateComponents/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSDateComponentsPtr extends Ptr<NSDateComponents, NSDateComponentsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSDateComponents.class); }/*</bind>*/
    /*<constants>*/
    public static final long UndefinedComponent = Bro.IS_32BIT ? 0x7fffffffL : 0x7fffffffffffffffL;
    /*</constants>*/
    /*<constructors>*/
    public NSDateComponents() {}
    protected NSDateComponents(Handle h, long handle) { super(h, handle); }
    protected NSDateComponents(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSDateComponents(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "calendar")
    public native NSCalendar getCalendar();
    @Property(selector = "setCalendar:")
    public native void setCalendar(NSCalendar v);
    @Property(selector = "timeZone")
    public native NSTimeZone getTimeZone();
    @Property(selector = "setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
    @Property(selector = "era")
    public native @MachineSizedSInt long getEra();
    @Property(selector = "setEra:")
    public native void setEra(@MachineSizedSInt long v);
    @Property(selector = "year")
    public native @MachineSizedSInt long getYear();
    @Property(selector = "setYear:")
    public native void setYear(@MachineSizedSInt long v);
    @Property(selector = "month")
    public native @MachineSizedSInt long getMonth();
    @Property(selector = "setMonth:")
    public native void setMonth(@MachineSizedSInt long v);
    @Property(selector = "day")
    public native @MachineSizedSInt long getDay();
    @Property(selector = "setDay:")
    public native void setDay(@MachineSizedSInt long v);
    @Property(selector = "hour")
    public native @MachineSizedSInt long getHour();
    @Property(selector = "setHour:")
    public native void setHour(@MachineSizedSInt long v);
    @Property(selector = "minute")
    public native @MachineSizedSInt long getMinute();
    @Property(selector = "setMinute:")
    public native void setMinute(@MachineSizedSInt long v);
    @Property(selector = "second")
    public native @MachineSizedSInt long getSecond();
    @Property(selector = "setSecond:")
    public native void setSecond(@MachineSizedSInt long v);
    @Property(selector = "nanosecond")
    public native @MachineSizedSInt long getNanosecond();
    @Property(selector = "setNanosecond:")
    public native void setNanosecond(@MachineSizedSInt long v);
    @Property(selector = "weekday")
    public native @MachineSizedSInt long getWeekday();
    @Property(selector = "setWeekday:")
    public native void setWeekday(@MachineSizedSInt long v);
    @Property(selector = "weekdayOrdinal")
    public native @MachineSizedSInt long getWeekdayOrdinal();
    @Property(selector = "setWeekdayOrdinal:")
    public native void setWeekdayOrdinal(@MachineSizedSInt long v);
    @Property(selector = "quarter")
    public native @MachineSizedSInt long getQuarter();
    @Property(selector = "setQuarter:")
    public native void setQuarter(@MachineSizedSInt long v);
    @Property(selector = "weekOfMonth")
    public native @MachineSizedSInt long getWeekOfMonth();
    @Property(selector = "setWeekOfMonth:")
    public native void setWeekOfMonth(@MachineSizedSInt long v);
    @Property(selector = "weekOfYear")
    public native @MachineSizedSInt long getWeekOfYear();
    @Property(selector = "setWeekOfYear:")
    public native void setWeekOfYear(@MachineSizedSInt long v);
    @Property(selector = "yearForWeekOfYear")
    public native @MachineSizedSInt long getYearForWeekOfYear();
    @Property(selector = "setYearForWeekOfYear:")
    public native void setYearForWeekOfYear(@MachineSizedSInt long v);
    @Property(selector = "isLeapMonth")
    public native boolean isLeapMonth();
    @Property(selector = "setLeapMonth:")
    public native void setLeapMonth(boolean v);
    @Property(selector = "date")
    public native NSDate getDate();
    @Property(selector = "isValidDate")
    public native boolean isValidDate();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    public void setValue(NSCalendarUnit unit, @MachineSizedSInt long value) {
        setValue(value, unit);
    }
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 7.0. Use -weekOfMonth or -weekOfYear, depending on which you mean
     */
    @Deprecated
    @Method(selector = "week")
    public native @MachineSizedSInt long getWeek();
    /**
     * @deprecated Deprecated in iOS 7.0. Use -setWeekOfMonth: or -setWeekOfYear:, depending on which you mean
     */
    @Deprecated
    @Method(selector = "setWeek:")
    public native void setWeek(@MachineSizedSInt long v);
    @Method(selector = "setValue:forComponent:")
    protected native void setValue(@MachineSizedSInt long value, NSCalendarUnit unit);
    @Method(selector = "valueForComponent:")
    public native @MachineSizedSInt long getValue(NSCalendarUnit unit);
    @Method(selector = "isValidDateInCalendar:")
    public native boolean isValidDateInCalendar(NSCalendar calendar);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
