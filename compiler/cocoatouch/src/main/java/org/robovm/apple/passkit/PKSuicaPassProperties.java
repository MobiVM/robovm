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
package org.robovm.apple.passkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKSuicaPassProperties/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKSuicaPassPropertiesPtr extends Ptr<PKSuicaPassProperties, PKSuicaPassPropertiesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKSuicaPassProperties.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKSuicaPassProperties() {}
    protected PKSuicaPassProperties(Handle h, long handle) { super(h, handle); }
    protected PKSuicaPassProperties(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "transitBalance")
    public native NSDecimalNumber getTransitBalance();
    @Property(selector = "transitBalanceCurrencyCode")
    public native String getTransitBalanceCurrencyCode();
    @Property(selector = "isInStation")
    public native boolean isInStation();
    @Property(selector = "isInShinkansenStation")
    public native boolean isInShinkansenStation();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "isBalanceAllowedForCommute")
    public native boolean isBalanceAllowedForCommute();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "isLowBalanceGateNotificationEnabled")
    public native boolean isLowBalanceGateNotificationEnabled();
    @Property(selector = "isGreenCarTicketUsed")
    public native boolean isGreenCarTicketUsed();
    @Property(selector = "isBlacklisted")
    public native boolean isBlacklisted();
    public native NSDate getExpirationDate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "passPropertiesForPass:")
    public static native PKSuicaPassProperties passPropertiesForPass(PKPass pass);
    /*</methods>*/
}
