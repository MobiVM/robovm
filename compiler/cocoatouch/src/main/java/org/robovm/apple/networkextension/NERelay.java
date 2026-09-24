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
package org.robovm.apple.networkextension;

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
import org.robovm.apple.security.*;
import org.robovm.apple.network.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NERelay/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NERelayPtr extends Ptr<NERelay, NERelayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NERelay.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NERelay() {}
    protected NERelay(Handle h, long handle) { super(h, handle); }
    protected NERelay(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NERelay(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "HTTP3RelayURL")
    public native NSURL getHTTP3RelayURL();
    @Property(selector = "setHTTP3RelayURL:")
    public native void setHTTP3RelayURL(NSURL v);
    @Property(selector = "HTTP2RelayURL")
    public native NSURL getHTTP2RelayURL();
    @Property(selector = "setHTTP2RelayURL:")
    public native void setHTTP2RelayURL(NSURL v);
    @Property(selector = "dnsOverHTTPSURL")
    public native NSURL getDnsOverHTTPSURL();
    @Property(selector = "setDnsOverHTTPSURL:")
    public native void setDnsOverHTTPSURL(NSURL v);
    @Property(selector = "syntheticDNSAnswerIPv4Prefix")
    public native String getSyntheticDNSAnswerIPv4Prefix();
    @Property(selector = "setSyntheticDNSAnswerIPv4Prefix:")
    public native void setSyntheticDNSAnswerIPv4Prefix(String v);
    @Property(selector = "syntheticDNSAnswerIPv6Prefix")
    public native String getSyntheticDNSAnswerIPv6Prefix();
    @Property(selector = "setSyntheticDNSAnswerIPv6Prefix:")
    public native void setSyntheticDNSAnswerIPv6Prefix(String v);
    @Property(selector = "additionalHTTPHeaderFields")
    public native NSDictionary<NSString, NSString> getAdditionalHTTPHeaderFields();
    @Property(selector = "setAdditionalHTTPHeaderFields:")
    public native void setAdditionalHTTPHeaderFields(NSDictionary<NSString, NSString> v);
    @Property(selector = "rawPublicKeys")
    public native NSArray<NSData> getRawPublicKeys();
    @Property(selector = "setRawPublicKeys:")
    public native void setRawPublicKeys(NSArray<NSData> v);
    @Property(selector = "identityData")
    public native NSData getIdentityData();
    @Property(selector = "setIdentityData:")
    public native void setIdentityData(NSData v);
    @Property(selector = "identityDataPassword")
    public native String getIdentityDataPassword();
    @Property(selector = "setIdentityDataPassword:")
    public native void setIdentityDataPassword(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("NetworkExtension")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NERelayConfigurationDidChangeNotification", optional=true)
        public static native String ConfigurationDidChange();
    }
    
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
