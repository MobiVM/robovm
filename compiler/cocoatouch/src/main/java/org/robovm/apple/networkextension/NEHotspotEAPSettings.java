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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEHotspotEAPSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEHotspotEAPSettingsPtr extends Ptr<NEHotspotEAPSettings, NEHotspotEAPSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEHotspotEAPSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEHotspotEAPSettings() {}
    protected NEHotspotEAPSettings(Handle h, long handle) { super(h, handle); }
    protected NEHotspotEAPSettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NEHotspotEAPSettings(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "supportedEAPTypes")
    public native NSArray<NSNumber> getSupportedEAPTypes();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSupportedEAPTypes:")
    public native void setSupportedEAPTypes(NSArray<NSNumber> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "username")
    public native String getUsername();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setUsername:")
    public native void setUsername(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "outerIdentity")
    public native String getOuterIdentity();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setOuterIdentity:")
    public native void setOuterIdentity(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "ttlsInnerAuthenticationType")
    public native NEHotspotConfigurationTTLSInnerAuthenticationType getTtlsInnerAuthenticationType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setTtlsInnerAuthenticationType:")
    public native void setTtlsInnerAuthenticationType(NEHotspotConfigurationTTLSInnerAuthenticationType v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "password")
    public native String getPassword();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPassword:")
    public native void setPassword(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "trustedServerNames")
    public native NSArray<NSString> getTrustedServerNames();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setTrustedServerNames:")
    public native void setTrustedServerNames(NSArray<NSString> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isTLSClientCertificateRequired")
    public native boolean isTlsClientCertificateRequired();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setTlsClientCertificateRequired:")
    public native void setTlsClientCertificateRequired(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "preferredTLSVersion")
    public native NEHotspotConfigurationEAPTLSVersion getPreferredTLSVersion();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPreferredTLSVersion:")
    public native void setPreferredTLSVersion(NEHotspotConfigurationEAPTLSVersion v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setIdentity:")
    public native boolean setIdentity(SecIdentity identity);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setTrustedServerCertificates:")
    public native boolean setTrustedServerCertificates(NSArray<?> certificates);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
