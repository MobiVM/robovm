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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INBalanceAmount/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INBalanceAmountPtr extends Ptr<INBalanceAmount, INBalanceAmountPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INBalanceAmount.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INBalanceAmount() {}
    protected INBalanceAmount(Handle h, long handle) { super(h, handle); }
    protected INBalanceAmount(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAmount:balanceType:")
    public INBalanceAmount(NSDecimalNumber amount, INBalanceType balanceType) { super((SkipInit) null); initObject(init(amount, balanceType)); }
    @Method(selector = "initWithAmount:currencyCode:")
    public INBalanceAmount(NSDecimalNumber amount, String currencyCode) { super((SkipInit) null); initObject(init(amount, currencyCode)); }
    @Method(selector = "initWithCoder:")
    public INBalanceAmount(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "amount")
    public native NSDecimalNumber getAmount();
    @Property(selector = "balanceType")
    public native INBalanceType getBalanceType();
    @Property(selector = "currencyCode")
    public native String getCurrencyCode();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAmount:balanceType:")
    protected native @Pointer long init(NSDecimalNumber amount, INBalanceType balanceType);
    @Method(selector = "initWithAmount:currencyCode:")
    protected native @Pointer long init(NSDecimalNumber amount, String currencyCode);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
