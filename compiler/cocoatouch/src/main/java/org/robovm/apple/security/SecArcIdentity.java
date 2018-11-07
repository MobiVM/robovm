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
package org.robovm.apple.security;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Security") @NativeProtocolProxy("OS_sec_identity")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/SecArcIdentity/*</name>*/ 
    extends /*<extends>*/SecArcObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class SecArcIdentityPtr extends Ptr<SecArcIdentity, SecArcIdentityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SecArcIdentity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_identity_create", optional=true)
    public static native SecArcIdentity create(SecIdentity identity);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_identity_create_with_certificates", optional=true)
    public static native SecArcIdentity createWithCertificates(SecIdentity identity, NSArray<?> certificates);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_identity_copy_ref", optional=true)
    public native SecIdentity copyRef();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="sec_identity_copy_certificates_ref", optional=true)
    public native NSArray<?> copyCertificatesRef();
    
    
    /*</methods>*/
}
