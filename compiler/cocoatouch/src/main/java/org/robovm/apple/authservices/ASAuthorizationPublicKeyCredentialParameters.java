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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AuthenticationServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASAuthorizationPublicKeyCredentialParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class ASAuthorizationPublicKeyCredentialParametersPtr extends Ptr<ASAuthorizationPublicKeyCredentialParameters, ASAuthorizationPublicKeyCredentialParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASAuthorizationPublicKeyCredentialParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ASAuthorizationPublicKeyCredentialParameters() {}
    protected ASAuthorizationPublicKeyCredentialParameters(Handle h, long handle) { super(h, handle); }
    protected ASAuthorizationPublicKeyCredentialParameters(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAlgorithm:")
    public ASAuthorizationPublicKeyCredentialParameters(@MachineSizedSInt long algorithm) { super((SkipInit) null); initObject(init(algorithm)); }
    @Method(selector = "initWithCoder:")
    public ASAuthorizationPublicKeyCredentialParameters(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "algorithm")
    public native @MachineSizedSInt long getAlgorithm();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAlgorithm:")
    protected native @Pointer long init(@MachineSizedSInt long algorithm);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
