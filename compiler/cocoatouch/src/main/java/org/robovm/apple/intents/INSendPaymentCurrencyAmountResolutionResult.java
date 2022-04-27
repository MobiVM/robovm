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
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSendPaymentCurrencyAmountResolutionResult/*</name>*/ 
    extends /*<extends>*/INCurrencyAmountResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSendPaymentCurrencyAmountResolutionResultPtr extends Ptr<INSendPaymentCurrencyAmountResolutionResult, INSendPaymentCurrencyAmountResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSendPaymentCurrencyAmountResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INSendPaymentCurrencyAmountResolutionResult() {}
    protected INSendPaymentCurrencyAmountResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INSendPaymentCurrencyAmountResolutionResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCurrencyAmountResolutionResult:")
    public INSendPaymentCurrencyAmountResolutionResult(INCurrencyAmountResolutionResult currencyAmountResolutionResult) { super((SkipInit) null); initObject(init(currencyAmountResolutionResult)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCurrencyAmountResolutionResult:")
    protected native @Pointer long init(INCurrencyAmountResolutionResult currencyAmountResolutionResult);
    @Method(selector = "unsupportedForReason:")
    public static native INSendPaymentCurrencyAmountResolutionResult unsupportedForReason(INSendPaymentCurrencyAmountUnsupportedReason reason);
    @Method(selector = "successWithResolvedCurrencyAmount:")
    public static native INSendPaymentCurrencyAmountResolutionResult success(INCurrencyAmount resolvedCurrencyAmount);
    @Method(selector = "disambiguationWithCurrencyAmountsToDisambiguate:")
    public static native INSendPaymentCurrencyAmountResolutionResult disambiguation(NSArray<INCurrencyAmount> currencyAmountsToDisambiguate);
    @Method(selector = "confirmationRequiredWithCurrencyAmountToConfirm:")
    public static native INSendPaymentCurrencyAmountResolutionResult confirmationRequired(INCurrencyAmount currencyAmountToConfirm);
    @Method(selector = "needsValue")
    public static native INSendPaymentCurrencyAmountResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INSendPaymentCurrencyAmountResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INSendPaymentCurrencyAmountResolutionResult unsupported();
    /*</methods>*/
}
