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
package org.robovm.apple.devicecheck;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("DeviceCheck") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DCAppAttestService/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DCAppAttestServicePtr extends Ptr<DCAppAttestService, DCAppAttestServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DCAppAttestService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DCAppAttestService() {}
    protected DCAppAttestService(Handle h, long handle) { super(h, handle); }
    protected DCAppAttestService(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedService")
    public static native DCAppAttestService getSharedService();
    @Property(selector = "isSupported")
    public native boolean isSupported();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "generateKeyWithCompletionHandler:")
    public native void generateKey(@Block VoidBlock2<NSString, NSError> completionHandler);
    @Method(selector = "attestKey:clientDataHash:completionHandler:")
    public native void attestKey(String keyId, NSData clientDataHash, @Block VoidBlock2<NSData, NSError> completionHandler);
    @Method(selector = "generateAssertion:clientDataHash:completionHandler:")
    public native void generateAssertion(String keyId, NSData clientDataHash, @Block VoidBlock2<NSData, NSError> completionHandler);
    /*</methods>*/
}
