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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASPasswordCredentialIdentity/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class ASPasswordCredentialIdentityPtr extends Ptr<ASPasswordCredentialIdentity, ASPasswordCredentialIdentityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASPasswordCredentialIdentity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ASPasswordCredentialIdentity() {}
    protected ASPasswordCredentialIdentity(Handle h, long handle) { super(h, handle); }
    protected ASPasswordCredentialIdentity(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithServiceIdentifier:user:recordIdentifier:")
    public ASPasswordCredentialIdentity(ASCredentialServiceIdentifier serviceIdentifier, String user, String recordIdentifier) { super((SkipInit) null); initObject(init(serviceIdentifier, user, recordIdentifier)); }
    @Method(selector = "initWithCoder:")
    public ASPasswordCredentialIdentity(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "serviceIdentifier")
    public native ASCredentialServiceIdentifier getServiceIdentifier();
    @Property(selector = "user")
    public native String getUser();
    @Property(selector = "recordIdentifier")
    public native String getRecordIdentifier();
    @Property(selector = "rank")
    public native @MachineSizedSInt long getRank();
    @Property(selector = "setRank:")
    public native void setRank(@MachineSizedSInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithServiceIdentifier:user:recordIdentifier:")
    protected native @Pointer long init(ASCredentialServiceIdentifier serviceIdentifier, String user, String recordIdentifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
