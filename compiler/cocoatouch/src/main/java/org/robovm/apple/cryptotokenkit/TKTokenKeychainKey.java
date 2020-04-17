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
package org.robovm.apple.cryptotokenkit;

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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CryptoTokenKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKTokenKeychainKey/*</name>*/ 
    extends /*<extends>*/TKTokenKeychainItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TKTokenKeychainKeyPtr extends Ptr<TKTokenKeychainKey, TKTokenKeychainKeyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TKTokenKeychainKey.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TKTokenKeychainKey() {}
    protected TKTokenKeychainKey(Handle h, long handle) { super(h, handle); }
    protected TKTokenKeychainKey(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCertificate:objectID:")
    public TKTokenKeychainKey(SecCertificate certificateRef, NSObject objectID) { super((SkipInit) null); initObject(init(certificateRef, objectID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "keyType")
    public native String getKeyType();
    @Property(selector = "setKeyType:")
    public native void setKeyType(String v);
    @Property(selector = "applicationTag")
    public native NSData getApplicationTag();
    @Property(selector = "setApplicationTag:")
    public native void setApplicationTag(NSData v);
    @Property(selector = "keySizeInBits")
    public native @MachineSizedSInt long getKeySizeInBits();
    @Property(selector = "setKeySizeInBits:")
    public native void setKeySizeInBits(@MachineSizedSInt long v);
    @Property(selector = "publicKeyData")
    public native NSData getPublicKeyData();
    @Property(selector = "setPublicKeyData:")
    public native void setPublicKeyData(NSData v);
    @Property(selector = "publicKeyHash")
    public native NSData getPublicKeyHash();
    @Property(selector = "setPublicKeyHash:")
    public native void setPublicKeyHash(NSData v);
    @Property(selector = "canDecrypt")
    public native boolean canDecrypt();
    @Property(selector = "setCanDecrypt:")
    public native void setCanDecrypt(boolean v);
    @Property(selector = "canSign")
    public native boolean canSign();
    @Property(selector = "setCanSign:")
    public native void setCanSign(boolean v);
    @Property(selector = "canPerformKeyExchange")
    public native boolean canPerformKeyExchange();
    @Property(selector = "setCanPerformKeyExchange:")
    public native void setCanPerformKeyExchange(boolean v);
    @Property(selector = "isSuitableForLogin")
    public native boolean isSuitableForLogin();
    @Property(selector = "setSuitableForLogin:")
    public native void setSuitableForLogin(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCertificate:objectID:")
    protected native @Pointer long init(SecCertificate certificateRef, NSObject objectID);
    /*</methods>*/
}
