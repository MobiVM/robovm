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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPaymentOrderDetails/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKPaymentOrderDetailsPtr extends Ptr<PKPaymentOrderDetails, PKPaymentOrderDetailsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKPaymentOrderDetails.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKPaymentOrderDetails() {}
    protected PKPaymentOrderDetails(Handle h, long handle) { super(h, handle); }
    protected PKPaymentOrderDetails(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOrderTypeIdentifier:orderIdentifier:webServiceURL:authenticationToken:")
    public PKPaymentOrderDetails(String orderTypeIdentifier, String orderIdentifier, NSURL webServiceURL, String authenticationToken) { super((SkipInit) null); initObject(init(orderTypeIdentifier, orderIdentifier, webServiceURL, authenticationToken)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "orderTypeIdentifier")
    public native String getOrderTypeIdentifier();
    @Property(selector = "setOrderTypeIdentifier:")
    public native void setOrderTypeIdentifier(String v);
    @Property(selector = "orderIdentifier")
    public native String getOrderIdentifier();
    @Property(selector = "setOrderIdentifier:")
    public native void setOrderIdentifier(String v);
    @Property(selector = "webServiceURL")
    public native NSURL getWebServiceURL();
    @Property(selector = "setWebServiceURL:")
    public native void setWebServiceURL(NSURL v);
    @Property(selector = "authenticationToken")
    public native String getAuthenticationToken();
    @Property(selector = "setAuthenticationToken:")
    public native void setAuthenticationToken(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOrderTypeIdentifier:orderIdentifier:webServiceURL:authenticationToken:")
    protected native @Pointer long init(String orderTypeIdentifier, String orderIdentifier, NSURL webServiceURL, String authenticationToken);
    /*</methods>*/
}
