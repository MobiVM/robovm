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
package org.robovm.apple.localauthentication;

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
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("LocalAuthentication") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LARight/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LARightPtr extends Ptr<LARight, LARightPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LARight.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LARight() {}
    protected LARight(Handle h, long handle) { super(h, handle); }
    protected LARight(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRequirement:")
    public LARight(LAAuthenticationRequirement requirement) { super((SkipInit) null); initObject(init(requirement)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "state")
    public native LARightState getState();
    @Property(selector = "tag")
    public native @MachineSizedSInt long getTag();
    @Property(selector = "setTag:")
    public native void setTag(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRequirement:")
    protected native @Pointer long init(LAAuthenticationRequirement requirement);
    @Method(selector = "authorizeWithLocalizedReason:completion:")
    public native void authorizeWithLocalizedReason(String localizedReason, @Block VoidBlock1<NSError> handler);
    @Method(selector = "checkCanAuthorizeWithCompletion:")
    public native void checkCanAuthorize(@Block VoidBlock1<NSError> handler);
    @Method(selector = "deauthorizeWithCompletion:")
    public native void deauthorize(@Block Runnable handler);
    /*</methods>*/
}
