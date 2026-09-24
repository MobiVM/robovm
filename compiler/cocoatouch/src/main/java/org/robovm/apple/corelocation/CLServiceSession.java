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
package org.robovm.apple.corelocation;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.corebluetooth.*;
import org.robovm.apple.contacts.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreLocation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLServiceSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLServiceSessionPtr extends Ptr<CLServiceSession, CLServiceSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLServiceSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CLServiceSession() {}
    protected CLServiceSession(Handle h, long handle) { super(h, handle); }
    protected CLServiceSession(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "invalidate")
    public native void invalidate();
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "sessionRequiringAuthorization:")
    public static native CLServiceSession sessionRequiringAuthorization(CLServiceSessionAuthorizationRequirement authorizationRequirement);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "sessionRequiringAuthorization:queue:handler:")
    public static native CLServiceSession createSessionRequiringAuthorization(CLServiceSessionAuthorizationRequirement authorizationRequirement, org.robovm.apple.dispatch.DispatchQueue queue, @Block VoidBlock1<CLServiceSessionDiagnostic> handler);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "sessionRequiringAuthorization:fullAccuracyPurposeKey:")
    public static native CLServiceSession createSessionRequiringAuthorization(CLServiceSessionAuthorizationRequirement authorizationRequirement, String purposeKey);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "sessionRequiringAuthorization:fullAccuracyPurposeKey:queue:handler:")
    public static native CLServiceSession createSessionRequiringAuthorization(CLServiceSessionAuthorizationRequirement authorizationRequirement, String purposeKey, org.robovm.apple.dispatch.DispatchQueue queue, @Block VoidBlock1<CLServiceSessionDiagnostic> handler);
    /*</methods>*/
}
