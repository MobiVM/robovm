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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKTokenSessionDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TKTokenSessionDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("tokenSession:beginAuthForOperation:constraint:error:")
    public TKTokenAuthOperation beginAuth(TKTokenSession session, TKTokenOperation operation, NSObject constraint, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("tokenSession:supportsOperation:usingKey:algorithm:")
    public boolean isSupportsOperation(TKTokenSession session, TKTokenOperation operation, NSObject keyObjectID, TKTokenKeyAlgorithm algorithm) { return false; }
    @NotImplemented("tokenSession:signData:usingKey:algorithm:error:")
    public NSData signData(TKTokenSession session, NSData dataToSign, NSObject keyObjectID, TKTokenKeyAlgorithm algorithm, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("tokenSession:decryptData:usingKey:algorithm:error:")
    public NSData decryptData(TKTokenSession session, NSData ciphertext, NSObject keyObjectID, TKTokenKeyAlgorithm algorithm, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("tokenSession:performKeyExchangeWithPublicKey:usingKey:algorithm:parameters:error:")
    public NSData performKeyExchange(TKTokenSession session, NSData otherPartyPublicKeyData, NSObject objectID, TKTokenKeyAlgorithm algorithm, TKTokenKeyExchangeParameters parameters, NSError.NSErrorPtr error) { return null; }
    /*</methods>*/
}
