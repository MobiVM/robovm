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
 * @deprecated Deprecated in iOS 15.0. INPayBillIntentResponse is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INPayBillIntentResponse/*</name>*/ 
    extends /*<extends>*/INIntentResponse/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INPayBillIntentResponsePtr extends Ptr<INPayBillIntentResponse, INPayBillIntentResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INPayBillIntentResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INPayBillIntentResponse() {}
    protected INPayBillIntentResponse(Handle h, long handle) { super(h, handle); }
    protected INPayBillIntentResponse(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCode:userActivity:")
    public INPayBillIntentResponse(INPayBillIntentResponseCode code, NSUserActivity userActivity) { super((SkipInit) null); initObject(init(code, userActivity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "code")
    public native INPayBillIntentResponseCode getCode();
    @Property(selector = "fromAccount")
    public native INPaymentAccount getFromAccount();
    @Property(selector = "setFromAccount:")
    public native void setFromAccount(INPaymentAccount v);
    @Property(selector = "billDetails")
    public native INBillDetails getBillDetails();
    @Property(selector = "setBillDetails:")
    public native void setBillDetails(INBillDetails v);
    @Property(selector = "transactionAmount")
    public native INPaymentAmount getTransactionAmount();
    @Property(selector = "setTransactionAmount:")
    public native void setTransactionAmount(INPaymentAmount v);
    @Property(selector = "transactionScheduledDate")
    public native INDateComponentsRange getTransactionScheduledDate();
    @Property(selector = "setTransactionScheduledDate:")
    public native void setTransactionScheduledDate(INDateComponentsRange v);
    @Property(selector = "transactionNote")
    public native String getTransactionNote();
    @Property(selector = "setTransactionNote:")
    public native void setTransactionNote(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCode:userActivity:")
    protected native @Pointer long init(INPayBillIntentResponseCode code, NSUserActivity userActivity);
    /*</methods>*/
}
