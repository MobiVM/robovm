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

/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPass/*</name>*/ 
    extends /*<extends>*/PKObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKPassPtr extends Ptr<PKPass, PKPassPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKPass.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKPass() {}
    protected PKPass(Handle h, long handle) { super(h, handle); }
    protected PKPass(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithData:error:")
    public PKPass(NSData data) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(data, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "passType")
    public native PKPassType getPassType();
    /**
     * @deprecated Use -[PKPass secureElementPass] instead
     */
    @Deprecated
    @Property(selector = "paymentPass")
    public native PKPaymentPass getPaymentPass();
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Property(selector = "secureElementPass")
    public native PKSecureElementPass getSecureElementPass();
    @Property(selector = "serialNumber")
    public native String getSerialNumber();
    @Property(selector = "passTypeIdentifier")
    public native String getPassTypeIdentifier();
    @Property(selector = "webServiceURL")
    public native NSURL getWebServiceURL();
    @Property(selector = "authenticationToken")
    public native String getAuthenticationToken();
    @Property(selector = "icon")
    public native UIImage getIcon();
    @Property(selector = "localizedName")
    public native String getLocalizedName();
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "organizationName")
    public native String getOrganizationName();
    @Property(selector = "relevantDate")
    public native NSDate getRelevantDate();
    @Property(selector = "userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Property(selector = "passURL")
    public native NSURL getPassURL();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "isRemotePass")
    public native boolean isRemotePass();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "deviceName")
    public native String getDeviceName();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithData:error:")
    private native @Pointer long init(NSData data, NSError.NSErrorPtr error);
    @Method(selector = "localizedValueForFieldKey:")
    public native NSObject getLocalizedValue(String key);
    /*</methods>*/
}
