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
 * @since Available in iOS 11.0 and later.
 * @deprecated Deprecated in iOS 15.0. INTransferMoneyIntent is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INTransferMoneyIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INTransferMoneyIntentPtr extends Ptr<INTransferMoneyIntent, INTransferMoneyIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INTransferMoneyIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INTransferMoneyIntent() {}
    protected INTransferMoneyIntent(Handle h, long handle) { super(h, handle); }
    protected INTransferMoneyIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFromAccount:toAccount:transactionAmount:transactionScheduledDate:transactionNote:")
    public INTransferMoneyIntent(INPaymentAccount fromAccount, INPaymentAccount toAccount, INPaymentAmount transactionAmount, INDateComponentsRange transactionScheduledDate, String transactionNote) { super((SkipInit) null); initObject(init(fromAccount, toAccount, transactionAmount, transactionScheduledDate, transactionNote)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fromAccount")
    public native INPaymentAccount getFromAccount();
    @Property(selector = "toAccount")
    public native INPaymentAccount getToAccount();
    @Property(selector = "transactionAmount")
    public native INPaymentAmount getTransactionAmount();
    @Property(selector = "transactionScheduledDate")
    public native INDateComponentsRange getTransactionScheduledDate();
    @Property(selector = "transactionNote")
    public native String getTransactionNote();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFromAccount:toAccount:transactionAmount:transactionScheduledDate:transactionNote:")
    protected native @Pointer long init(INPaymentAccount fromAccount, INPaymentAccount toAccount, INPaymentAmount transactionAmount, INDateComponentsRange transactionScheduledDate, String transactionNote);
    /*</methods>*/
}
