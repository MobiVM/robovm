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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRequestPaymentIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INRequestPaymentIntentPtr extends Ptr<INRequestPaymentIntent, INRequestPaymentIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRequestPaymentIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INRequestPaymentIntent() {}
    protected INRequestPaymentIntent(Handle h, long handle) { super(h, handle); }
    protected INRequestPaymentIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPayer:currencyAmount:note:")
    public INRequestPaymentIntent(INPerson payer, INCurrencyAmount currencyAmount, String note) { super((SkipInit) null); initObject(init(payer, currencyAmount, note)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "payer")
    public native INPerson getPayer();
    @Property(selector = "currencyAmount")
    public native INCurrencyAmount getCurrencyAmount();
    @Property(selector = "note")
    public native String getNote();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPayer:currencyAmount:note:")
    protected native @Pointer long init(INPerson payer, INCurrencyAmount currencyAmount, String note);
    /*</methods>*/
}
