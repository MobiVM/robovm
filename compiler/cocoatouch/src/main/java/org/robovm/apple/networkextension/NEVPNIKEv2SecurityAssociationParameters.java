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

/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEVPNIKEv2SecurityAssociationParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEVPNIKEv2SecurityAssociationParametersPtr extends Ptr<NEVPNIKEv2SecurityAssociationParameters, NEVPNIKEv2SecurityAssociationParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEVPNIKEv2SecurityAssociationParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEVPNIKEv2SecurityAssociationParameters() {}
    protected NEVPNIKEv2SecurityAssociationParameters(Handle h, long handle) { super(h, handle); }
    protected NEVPNIKEv2SecurityAssociationParameters(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NEVPNIKEv2SecurityAssociationParameters(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "encryptionAlgorithm")
    public native NEVPNIKEv2EncryptionAlgorithm getEncryptionAlgorithm();
    @Property(selector = "setEncryptionAlgorithm:")
    public native void setEncryptionAlgorithm(NEVPNIKEv2EncryptionAlgorithm v);
    @Property(selector = "integrityAlgorithm")
    public native NEVPNIKEv2IntegrityAlgorithm getIntegrityAlgorithm();
    @Property(selector = "setIntegrityAlgorithm:")
    public native void setIntegrityAlgorithm(NEVPNIKEv2IntegrityAlgorithm v);
    @Property(selector = "diffieHellmanGroup")
    public native NEVPNIKEv2DiffieHellmanGroup getDiffieHellmanGroup();
    @Property(selector = "setDiffieHellmanGroup:")
    public native void setDiffieHellmanGroup(NEVPNIKEv2DiffieHellmanGroup v);
    @Property(selector = "lifetimeMinutes")
    public native int getLifetimeMinutes();
    @Property(selector = "setLifetimeMinutes:")
    public native void setLifetimeMinutes(int v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
