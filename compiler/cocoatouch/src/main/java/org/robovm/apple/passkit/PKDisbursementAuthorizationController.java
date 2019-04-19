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

/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKDisbursementAuthorizationController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKDisbursementAuthorizationControllerPtr extends Ptr<PKDisbursementAuthorizationController, PKDisbursementAuthorizationControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKDisbursementAuthorizationController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKDisbursementAuthorizationController() {}
    protected PKDisbursementAuthorizationController(Handle h, long handle) { super(h, handle); }
    protected PKDisbursementAuthorizationController(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Method(selector = "initWithDisbursementRequest:delegate:")
    public PKDisbursementAuthorizationController(PKDisbursementRequest disbursementRequest, PKDisbursementAuthorizationControllerDelegate delegate) { super((SkipInit) null); initObject(init(disbursementRequest, delegate)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Property(selector = "delegate")
    public native PKDisbursementAuthorizationControllerDelegate getDelegate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Method(selector = "initWithDisbursementRequest:delegate:")
    protected native @Pointer long init(PKDisbursementRequest disbursementRequest, PKDisbursementAuthorizationControllerDelegate delegate);
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Method(selector = "authorizeDisbursementWithCompletion:")
    public native void authorizeDisbursement(@Block VoidBlock2<Boolean, NSError> completion);
    /**
     * @since Available in iOS 12.2 and later.
     */
    @Method(selector = "supportsDisbursements")
    public static native boolean supportsDisbursements();
    /*</methods>*/
}
