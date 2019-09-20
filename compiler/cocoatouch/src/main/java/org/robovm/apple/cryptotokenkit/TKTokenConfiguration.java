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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CryptoTokenKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKTokenConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TKTokenConfigurationPtr extends Ptr<TKTokenConfiguration, TKTokenConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TKTokenConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TKTokenConfiguration() {}
    protected TKTokenConfiguration(Handle h, long handle) { super(h, handle); }
    protected TKTokenConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "instanceID")
    public native String getInstanceID();
    @Property(selector = "configurationData")
    public native NSData getConfigurationData();
    @Property(selector = "setConfigurationData:")
    public native void setConfigurationData(NSData v);
    @Property(selector = "keychainItems")
    public native NSArray<TKTokenKeychainItem> getKeychainItems();
    @Property(selector = "setKeychainItems:")
    public native void setKeychainItems(NSArray<TKTokenKeychainItem> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public TKTokenKeychainKey getKey(NSObject objectID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       TKTokenKeychainKey result = getKey(objectID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "keyForObjectID:error:")
    private native TKTokenKeychainKey getKey(NSObject objectID, NSError.NSErrorPtr error);
    public TKTokenKeychainCertificate getCertificate(NSObject objectID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       TKTokenKeychainCertificate result = getCertificate(objectID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "certificateForObjectID:error:")
    private native TKTokenKeychainCertificate getCertificate(NSObject objectID, NSError.NSErrorPtr error);
    /*</methods>*/
}
