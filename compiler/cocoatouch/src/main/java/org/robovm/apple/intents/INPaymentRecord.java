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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INPaymentRecord/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INPaymentRecordPtr extends Ptr<INPaymentRecord, INPaymentRecordPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INPaymentRecord.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INPaymentRecord() {}
    protected INPaymentRecord(Handle h, long handle) { super(h, handle); }
    protected INPaymentRecord(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPayee:payer:currencyAmount:paymentMethod:note:status:feeAmount:")
    public INPaymentRecord(INPerson payee, INPerson payer, INCurrencyAmount currencyAmount, INPaymentMethod paymentMethod, String note, INPaymentStatus status, INCurrencyAmount feeAmount) { super((SkipInit) null); initObject(init(payee, payer, currencyAmount, paymentMethod, note, status, feeAmount)); }
    @Method(selector = "initWithPayee:payer:currencyAmount:paymentMethod:note:status:")
    public INPaymentRecord(INPerson payee, INPerson payer, INCurrencyAmount currencyAmount, INPaymentMethod paymentMethod, String note, INPaymentStatus status) { super((SkipInit) null); initObject(init(payee, payer, currencyAmount, paymentMethod, note, status)); }
    @Method(selector = "initWithCoder:")
    public INPaymentRecord(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "payee")
    public native INPerson getPayee();
    @Property(selector = "payer")
    public native INPerson getPayer();
    @Property(selector = "currencyAmount")
    public native INCurrencyAmount getCurrencyAmount();
    @Property(selector = "note")
    public native String getNote();
    @Property(selector = "status")
    public native INPaymentStatus getStatus();
    @Property(selector = "paymentMethod")
    public native INPaymentMethod getPaymentMethod();
    @Property(selector = "feeAmount")
    public native INCurrencyAmount getFeeAmount();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPayee:payer:currencyAmount:paymentMethod:note:status:feeAmount:")
    protected native @Pointer long init(INPerson payee, INPerson payer, INCurrencyAmount currencyAmount, INPaymentMethod paymentMethod, String note, INPaymentStatus status, INCurrencyAmount feeAmount);
    @Method(selector = "initWithPayee:payer:currencyAmount:paymentMethod:note:status:")
    protected native @Pointer long init(INPerson payee, INPerson payer, INCurrencyAmount currencyAmount, INPaymentMethod paymentMethod, String note, INPaymentStatus status);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
