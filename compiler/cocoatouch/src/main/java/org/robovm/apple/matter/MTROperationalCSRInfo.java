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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTROperationalCSRInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTROperationalCSRInfoPtr extends Ptr<MTROperationalCSRInfo, MTROperationalCSRInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTROperationalCSRInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTROperationalCSRInfo() {}
    protected MTROperationalCSRInfo(Handle h, long handle) { super(h, handle); }
    protected MTROperationalCSRInfo(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithCSRNonce:csrElementsTLV:attestationSignature:")
    public MTROperationalCSRInfo(NSData csrNonce, NSData csrElementsTLV, NSData attestationSignature) { super((SkipInit) null); initObject(init(csrNonce, csrElementsTLV, attestationSignature)); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithCSRElementsTLV:attestationSignature:")
    public MTROperationalCSRInfo(NSData csrElementsTLV, NSData attestationSignature) { super((SkipInit) null); initObject(init(csrElementsTLV, attestationSignature)); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithCSRResponseParams:")
    public MTROperationalCSRInfo(MTROperationalCredentialsClusterCSRResponseParams responseParams) { super((SkipInit) null); initObject(init(responseParams)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "csr")
    public native NSData getCsr();
    @Property(selector = "csrNonce")
    public native NSData getCsrNonce();
    @Property(selector = "csrElementsTLV")
    public native NSData getCsrElementsTLV();
    @Property(selector = "attestationSignature")
    public native NSData getAttestationSignature();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithCSRNonce:csrElementsTLV:attestationSignature:")
    protected native @Pointer long init(NSData csrNonce, NSData csrElementsTLV, NSData attestationSignature);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithCSRElementsTLV:attestationSignature:")
    protected native @Pointer long init(NSData csrElementsTLV, NSData attestationSignature);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithCSRResponseParams:")
    protected native @Pointer long init(MTROperationalCredentialsClusterCSRResponseParams responseParams);
    /*</methods>*/
}
