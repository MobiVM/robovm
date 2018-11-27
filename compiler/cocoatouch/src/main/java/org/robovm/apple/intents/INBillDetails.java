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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INBillDetails/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INBillDetailsPtr extends Ptr<INBillDetails, INBillDetailsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INBillDetails.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INBillDetails() {}
    protected INBillDetails(Handle h, long handle) { super(h, handle); }
    protected INBillDetails(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBillType:paymentStatus:billPayee:amountDue:minimumDue:lateFee:dueDate:paymentDate:")
    public INBillDetails(INBillType billType, INPaymentStatus paymentStatus, INBillPayee billPayee, INCurrencyAmount amountDue, INCurrencyAmount minimumDue, INCurrencyAmount lateFee, NSDateComponents dueDate, NSDateComponents paymentDate) { super((SkipInit) null); initObject(init(billType, paymentStatus, billPayee, amountDue, minimumDue, lateFee, dueDate, paymentDate)); }
    @Method(selector = "initWithCoder:")
    public INBillDetails(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "billPayee")
    public native INBillPayee getBillPayee();
    @Property(selector = "setBillPayee:")
    public native void setBillPayee(INBillPayee v);
    @Property(selector = "amountDue")
    public native INCurrencyAmount getAmountDue();
    @Property(selector = "setAmountDue:")
    public native void setAmountDue(INCurrencyAmount v);
    @Property(selector = "minimumDue")
    public native INCurrencyAmount getMinimumDue();
    @Property(selector = "setMinimumDue:")
    public native void setMinimumDue(INCurrencyAmount v);
    @Property(selector = "lateFee")
    public native INCurrencyAmount getLateFee();
    @Property(selector = "setLateFee:")
    public native void setLateFee(INCurrencyAmount v);
    @Property(selector = "dueDate")
    public native NSDateComponents getDueDate();
    @Property(selector = "setDueDate:")
    public native void setDueDate(NSDateComponents v);
    @Property(selector = "paymentDate")
    public native NSDateComponents getPaymentDate();
    @Property(selector = "setPaymentDate:")
    public native void setPaymentDate(NSDateComponents v);
    @Property(selector = "billType")
    public native INBillType getBillType();
    @Property(selector = "setBillType:")
    public native void setBillType(INBillType v);
    @Property(selector = "paymentStatus")
    public native INPaymentStatus getPaymentStatus();
    @Property(selector = "setPaymentStatus:")
    public native void setPaymentStatus(INPaymentStatus v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBillType:paymentStatus:billPayee:amountDue:minimumDue:lateFee:dueDate:paymentDate:")
    protected native @Pointer long init(INBillType billType, INPaymentStatus paymentStatus, INBillPayee billPayee, INCurrencyAmount amountDue, INCurrencyAmount minimumDue, INCurrencyAmount lateFee, NSDateComponents dueDate, NSDateComponents paymentDate);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
