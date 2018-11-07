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
package org.robovm.apple.authservices;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AuthenticationServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASCredentialIdentityStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASCredentialIdentityStorePtr extends Ptr<ASCredentialIdentityStore, ASCredentialIdentityStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASCredentialIdentityStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ASCredentialIdentityStore() {}
    protected ASCredentialIdentityStore(Handle h, long handle) { super(h, handle); }
    protected ASCredentialIdentityStore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedStore")
    public static native ASCredentialIdentityStore getSharedStore();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getCredentialIdentityStoreStateWithCompletion:")
    public native void getCredentialIdentityStoreState(@Block VoidBlock1<ASCredentialIdentityStoreState> completion);
    @Method(selector = "saveCredentialIdentities:completion:")
    public native void saveCredentialIdentities(NSArray<ASPasswordCredentialIdentity> credentialIdentities, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "removeCredentialIdentities:completion:")
    public native void removeCredentialIdentities(NSArray<ASPasswordCredentialIdentity> credentialIdentities, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "removeAllCredentialIdentitiesWithCompletion:")
    public native void removeAllCredentialIdentities(@Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "replaceCredentialIdentitiesWithIdentities:completion:")
    public native void replaceCredentialIdentities(NSArray<ASPasswordCredentialIdentity> newCredentialIdentities, @Block VoidBlock2<Boolean, NSError> completion);
    /*</methods>*/
}
