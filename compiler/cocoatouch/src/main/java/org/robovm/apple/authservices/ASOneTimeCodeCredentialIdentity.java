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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AuthenticationServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASOneTimeCodeCredentialIdentity/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, ASCredentialIdentity/*</implements>*/ {

    /*<ptr>*/public static class ASOneTimeCodeCredentialIdentityPtr extends Ptr<ASOneTimeCodeCredentialIdentity, ASOneTimeCodeCredentialIdentityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASOneTimeCodeCredentialIdentity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ASOneTimeCodeCredentialIdentity() {}
    protected ASOneTimeCodeCredentialIdentity(Handle h, long handle) { super(h, handle); }
    protected ASOneTimeCodeCredentialIdentity(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithServiceIdentifier:label:recordIdentifier:")
    public ASOneTimeCodeCredentialIdentity(ASCredentialServiceIdentifier serviceIdentifier, String label, String recordIdentifier) { super((SkipInit) null); initObject(init(serviceIdentifier, label, recordIdentifier)); }
    @Method(selector = "initWithCoder:")
    public ASOneTimeCodeCredentialIdentity(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
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
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithServiceIdentifier:label:recordIdentifier:")
    protected native @Pointer long init(ASCredentialServiceIdentifier serviceIdentifier, String label, String recordIdentifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
