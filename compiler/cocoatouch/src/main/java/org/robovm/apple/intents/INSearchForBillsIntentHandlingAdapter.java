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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSearchForBillsIntentHandlingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INSearchForBillsIntentHandling/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("handleSearchForBills:completion:")
    public void handleSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INSearchForBillsIntentResponse> completion) {}
    @NotImplemented("confirmSearchForBills:completion:")
    public void confirmSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INSearchForBillsIntentResponse> completion) {}
    @NotImplemented("resolveBillPayeeForSearchForBills:withCompletion:")
    public void resolveBillPayeeForSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INBillPayeeResolutionResult> completion) {}
    @NotImplemented("resolvePaymentDateRangeForSearchForBills:withCompletion:")
    public void resolvePaymentDateRangeForSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion) {}
    @NotImplemented("resolveBillTypeForSearchForBills:withCompletion:")
    public void resolveBillTypeForSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INBillTypeResolutionResult> completion) {}
    @NotImplemented("resolveStatusForSearchForBills:withCompletion:")
    public void resolveStatusForSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INPaymentStatusResolutionResult> completion) {}
    @NotImplemented("resolveDueDateRangeForSearchForBills:withCompletion:")
    public void resolveDueDateRangeForSearchForBills(INSearchForBillsIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion) {}
    /*</methods>*/
}
