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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKIssuerProvisioningExtensionPaymentPassEntry/*</name>*/ 
    extends /*<extends>*/PKIssuerProvisioningExtensionPassEntry/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKIssuerProvisioningExtensionPaymentPassEntryPtr extends Ptr<PKIssuerProvisioningExtensionPaymentPassEntry, PKIssuerProvisioningExtensionPaymentPassEntryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKIssuerProvisioningExtensionPaymentPassEntry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKIssuerProvisioningExtensionPaymentPassEntry() {}
    protected PKIssuerProvisioningExtensionPaymentPassEntry(Handle h, long handle) { super(h, handle); }
    protected PKIssuerProvisioningExtensionPaymentPassEntry(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:title:art:addRequestConfiguration:")
    public PKIssuerProvisioningExtensionPaymentPassEntry(String identifier, String title, CGImage art, PKAddPaymentPassRequestConfiguration configuration) { super((SkipInit) null); initObject(init(identifier, title, art, configuration)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "addRequestConfiguration")
    public native PKAddPaymentPassRequestConfiguration getAddRequestConfiguration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:title:art:addRequestConfiguration:")
    protected native @Pointer long init(String identifier, String title, CGImage art, PKAddPaymentPassRequestConfiguration configuration);
    /*</methods>*/
}
