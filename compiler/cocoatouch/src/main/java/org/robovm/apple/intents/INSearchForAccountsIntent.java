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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSearchForAccountsIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSearchForAccountsIntentPtr extends Ptr<INSearchForAccountsIntent, INSearchForAccountsIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSearchForAccountsIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSearchForAccountsIntent() {}
    protected INSearchForAccountsIntent(Handle h, long handle) { super(h, handle); }
    protected INSearchForAccountsIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAccountNickname:accountType:organizationName:requestedBalanceType:")
    public INSearchForAccountsIntent(INSpeakableString accountNickname, INAccountType accountType, INSpeakableString organizationName, INBalanceType requestedBalanceType) { super((SkipInit) null); initObject(init(accountNickname, accountType, organizationName, requestedBalanceType)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accountNickname")
    public native INSpeakableString getAccountNickname();
    @Property(selector = "accountType")
    public native INAccountType getAccountType();
    @Property(selector = "organizationName")
    public native INSpeakableString getOrganizationName();
    @Property(selector = "requestedBalanceType")
    public native INBalanceType getRequestedBalanceType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAccountNickname:accountType:organizationName:requestedBalanceType:")
    protected native @Pointer long init(INSpeakableString accountNickname, INAccountType accountType, INSpeakableString organizationName, INBalanceType requestedBalanceType);
    /*</methods>*/
}
