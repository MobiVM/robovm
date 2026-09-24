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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASAuthorizationPublicKeyCredentialPRFAssertionInputValues/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASAuthorizationPublicKeyCredentialPRFAssertionInputValuesPtr extends Ptr<ASAuthorizationPublicKeyCredentialPRFAssertionInputValues, ASAuthorizationPublicKeyCredentialPRFAssertionInputValuesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASAuthorizationPublicKeyCredentialPRFAssertionInputValues.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ASAuthorizationPublicKeyCredentialPRFAssertionInputValues() {}
    protected ASAuthorizationPublicKeyCredentialPRFAssertionInputValues(Handle h, long handle) { super(h, handle); }
    protected ASAuthorizationPublicKeyCredentialPRFAssertionInputValues(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSaltInput1:saltInput2:")
    public ASAuthorizationPublicKeyCredentialPRFAssertionInputValues(NSData saltInput1, NSData saltInput2) { super((SkipInit) null); initObject(init(saltInput1, saltInput2)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "saltInput1")
    public native NSData getSaltInput1();
    @Property(selector = "saltInput2")
    public native NSData getSaltInput2();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSaltInput1:saltInput2:")
    protected native @Pointer long init(NSData saltInput1, NSData saltInput2);
    /*</methods>*/
}
