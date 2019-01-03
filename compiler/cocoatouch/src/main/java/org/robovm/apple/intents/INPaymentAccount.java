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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INPaymentAccount/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INPaymentAccountPtr extends Ptr<INPaymentAccount, INPaymentAccountPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INPaymentAccount.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INPaymentAccount() {}
    protected INPaymentAccount(Handle h, long handle) { super(h, handle); }
    protected INPaymentAccount(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithNickname:number:accountType:organizationName:balance:secondaryBalance:")
    public INPaymentAccount(INSpeakableString nickname, String number, INAccountType accountType, INSpeakableString organizationName, INBalanceAmount balance, INBalanceAmount secondaryBalance) { super((SkipInit) null); initObject(init(nickname, number, accountType, organizationName, balance, secondaryBalance)); }
    /**
     * @since Available in iOS 10.3 and later.
     * @deprecated Deprecated in iOS 11.0. Please use 'initWithNickname:number:accountType:organizationName:balance:secondaryBalance:' instead
     */
    @Deprecated
    @Method(selector = "initWithNickname:number:accountType:organizationName:")
    public INPaymentAccount(INSpeakableString nickname, String number, INAccountType accountType, INSpeakableString organizationName) { super((SkipInit) null); initObject(init(nickname, number, accountType, organizationName)); }
    @Method(selector = "initWithCoder:")
    public INPaymentAccount(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nickname")
    public native INSpeakableString getNickname();
    @Property(selector = "accountNumber")
    public native String getAccountNumber();
    @Property(selector = "accountType")
    public native INAccountType getAccountType();
    @Property(selector = "organizationName")
    public native INSpeakableString getOrganizationName();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "balance")
    public native INBalanceAmount getBalance();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "secondaryBalance")
    public native INBalanceAmount getSecondaryBalance();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithNickname:number:accountType:organizationName:balance:secondaryBalance:")
    protected native @Pointer long init(INSpeakableString nickname, String number, INAccountType accountType, INSpeakableString organizationName, INBalanceAmount balance, INBalanceAmount secondaryBalance);
    /**
     * @since Available in iOS 10.3 and later.
     * @deprecated Deprecated in iOS 11.0. Please use 'initWithNickname:number:accountType:organizationName:balance:secondaryBalance:' instead
     */
    @Deprecated
    @Method(selector = "initWithNickname:number:accountType:organizationName:")
    protected native @Pointer long init(INSpeakableString nickname, String number, INAccountType accountType, INSpeakableString organizationName);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
