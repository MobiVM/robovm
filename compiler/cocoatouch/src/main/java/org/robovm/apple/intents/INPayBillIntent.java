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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INPayBillIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INPayBillIntentPtr extends Ptr<INPayBillIntent, INPayBillIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INPayBillIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INPayBillIntent() {}
    protected INPayBillIntent(Handle h, long handle) { super(h, handle); }
    protected INPayBillIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBillPayee:fromAccount:transactionAmount:transactionScheduledDate:transactionNote:billType:dueDate:")
    public INPayBillIntent(INBillPayee billPayee, INPaymentAccount fromAccount, INPaymentAmount transactionAmount, INDateComponentsRange transactionScheduledDate, String transactionNote, INBillType billType, INDateComponentsRange dueDate) { super((SkipInit) null); initObject(init(billPayee, fromAccount, transactionAmount, transactionScheduledDate, transactionNote, billType, dueDate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "billPayee")
    public native INBillPayee getBillPayee();
    @Property(selector = "fromAccount")
    public native INPaymentAccount getFromAccount();
    @Property(selector = "transactionAmount")
    public native INPaymentAmount getTransactionAmount();
    @Property(selector = "transactionScheduledDate")
    public native INDateComponentsRange getTransactionScheduledDate();
    @Property(selector = "transactionNote")
    public native String getTransactionNote();
    @Property(selector = "billType")
    public native INBillType getBillType();
    @Property(selector = "dueDate")
    public native INDateComponentsRange getDueDate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBillPayee:fromAccount:transactionAmount:transactionScheduledDate:transactionNote:billType:dueDate:")
    protected native @Pointer long init(INBillPayee billPayee, INPaymentAccount fromAccount, INPaymentAmount transactionAmount, INDateComponentsRange transactionScheduledDate, String transactionNote, INBillType billType, INDateComponentsRange dueDate);
    /*</methods>*/
}
