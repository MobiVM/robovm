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
package org.robovm.apple.passkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKRecurringPaymentSummaryItem/*</name>*/ 
    extends /*<extends>*/PKPaymentSummaryItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKRecurringPaymentSummaryItemPtr extends Ptr<PKRecurringPaymentSummaryItem, PKRecurringPaymentSummaryItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKRecurringPaymentSummaryItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKRecurringPaymentSummaryItem() {}
    protected PKRecurringPaymentSummaryItem(Handle h, long handle) { super(h, handle); }
    protected PKRecurringPaymentSummaryItem(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "setStartDate:")
    public native void setStartDate(NSDate v);
    @Property(selector = "intervalUnit")
    public native NSCalendarUnit getIntervalUnit();
    @Property(selector = "setIntervalUnit:")
    public native void setIntervalUnit(NSCalendarUnit v);
    @Property(selector = "intervalCount")
    public native @MachineSizedSInt long getIntervalCount();
    @Property(selector = "setIntervalCount:")
    public native void setIntervalCount(@MachineSizedSInt long v);
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "setEndDate:")
    public native void setEndDate(NSDate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
