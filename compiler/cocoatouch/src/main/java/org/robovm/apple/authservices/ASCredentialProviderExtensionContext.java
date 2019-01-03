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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASCredentialProviderExtensionContext/*</name>*/ 
    extends /*<extends>*/NSExtensionContext/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASCredentialProviderExtensionContextPtr extends Ptr<ASCredentialProviderExtensionContext, ASCredentialProviderExtensionContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASCredentialProviderExtensionContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ASCredentialProviderExtensionContext() {}
    protected ASCredentialProviderExtensionContext(Handle h, long handle) { super(h, handle); }
    protected ASCredentialProviderExtensionContext(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "completeRequestWithSelectedCredential:completionHandler:")
    public native void completeRequest(ASPasswordCredential credential, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "completeExtensionConfigurationRequest")
    public native void completeExtensionConfigurationRequest();
    @Method(selector = "cancelRequestWithError:")
    public native void cancelRequest(NSError error);
    /*</methods>*/
}
