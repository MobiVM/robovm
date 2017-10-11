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
package org.robovm.apple.passkit;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPaymentAuthorizationResult/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKPaymentAuthorizationResultPtr extends Ptr<PKPaymentAuthorizationResult, PKPaymentAuthorizationResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKPaymentAuthorizationResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKPaymentAuthorizationResult() {}
    protected PKPaymentAuthorizationResult(Handle h, long handle) { super(h, handle); }
    protected PKPaymentAuthorizationResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStatus:errors:")
    public PKPaymentAuthorizationResult(PKPaymentAuthorizationStatus status, NSArray<NSError> errors) { super((SkipInit) null); initObject(init(status, errors)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "status")
    public native PKPaymentAuthorizationStatus getStatus();
    @Property(selector = "setStatus:")
    public native void setStatus(PKPaymentAuthorizationStatus v);
    @Property(selector = "errors")
    public native NSArray<NSError> getErrors();
    @Property(selector = "setErrors:")
    public native void setErrors(NSArray<NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStatus:errors:")
    protected native @Pointer long init(PKPaymentAuthorizationStatus status, NSArray<NSError> errors);
    /*</methods>*/
}
