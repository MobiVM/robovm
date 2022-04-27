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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSearchForAccountsIntentHandlingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements INSearchForAccountsIntentHandling/*</implements>*/ {

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
    @NotImplemented("handleSearchForAccounts:completion:")
    public void handleSearchForAccounts(INSearchForAccountsIntent intent, @Block VoidBlock1<INSearchForAccountsIntentResponse> completion) {}
    @NotImplemented("confirmSearchForAccounts:completion:")
    public void confirmSearchForAccounts(INSearchForAccountsIntent intent, @Block VoidBlock1<INSearchForAccountsIntentResponse> completion) {}
    @NotImplemented("resolveAccountNicknameForSearchForAccounts:withCompletion:")
    public void resolveAccountNicknameForSearchForAccounts(INSearchForAccountsIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    @NotImplemented("resolveAccountTypeForSearchForAccounts:withCompletion:")
    public void resolveAccountTypeForSearchForAccounts(INSearchForAccountsIntent intent, @Block VoidBlock1<INAccountTypeResolutionResult> completion) {}
    @NotImplemented("resolveOrganizationNameForSearchForAccounts:withCompletion:")
    public void resolveOrganizationNameForSearchForAccounts(INSearchForAccountsIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion) {}
    @NotImplemented("resolveRequestedBalanceTypeForSearchForAccounts:withCompletion:")
    public void resolveRequestedBalanceTypeForSearchForAccounts(INSearchForAccountsIntent intent, @Block VoidBlock1<INBalanceTypeResolutionResult> completion) {}
    /*</methods>*/
}
