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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEVPNIKEv2PPKConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEVPNIKEv2PPKConfigurationPtr extends Ptr<NEVPNIKEv2PPKConfiguration, NEVPNIKEv2PPKConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEVPNIKEv2PPKConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEVPNIKEv2PPKConfiguration() {}
    protected NEVPNIKEv2PPKConfiguration(Handle h, long handle) { super(h, handle); }
    protected NEVPNIKEv2PPKConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:keychainReference:")
    public NEVPNIKEv2PPKConfiguration(String identifier, NSData keychainReference) { super((SkipInit) null); initObject(init(identifier, keychainReference)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "keychainReference")
    public native NSData getKeychainReference();
    @Property(selector = "isMandatory")
    public native boolean isMandatory();
    @Property(selector = "setIsMandatory:")
    public native void setIsMandatory(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:keychainReference:")
    protected native @Pointer long init(String identifier, NSData keychainReference);
    /*</methods>*/
}
