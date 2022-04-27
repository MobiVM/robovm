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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.3 and later.
 * @deprecated Deprecated in iOS 15.0. INSearchForBillsIntent is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSearchForBillsIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSearchForBillsIntentPtr extends Ptr<INSearchForBillsIntent, INSearchForBillsIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSearchForBillsIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSearchForBillsIntent() {}
    protected INSearchForBillsIntent(Handle h, long handle) { super(h, handle); }
    protected INSearchForBillsIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBillPayee:paymentDateRange:billType:status:dueDateRange:")
    public INSearchForBillsIntent(INBillPayee billPayee, INDateComponentsRange paymentDateRange, INBillType billType, INPaymentStatus status, INDateComponentsRange dueDateRange) { super((SkipInit) null); initObject(init(billPayee, paymentDateRange, billType, status, dueDateRange)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "billPayee")
    public native INBillPayee getBillPayee();
    @Property(selector = "paymentDateRange")
    public native INDateComponentsRange getPaymentDateRange();
    @Property(selector = "billType")
    public native INBillType getBillType();
    @Property(selector = "status")
    public native INPaymentStatus getStatus();
    @Property(selector = "dueDateRange")
    public native INDateComponentsRange getDueDateRange();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBillPayee:paymentDateRange:billType:status:dueDateRange:")
    protected native @Pointer long init(INBillPayee billPayee, INDateComponentsRange paymentDateRange, INBillType billType, INPaymentStatus status, INDateComponentsRange dueDateRange);
    /*</methods>*/
}
