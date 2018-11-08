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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASCredentialProviderViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASCredentialProviderViewControllerPtr extends Ptr<ASCredentialProviderViewController, ASCredentialProviderViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASCredentialProviderViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ASCredentialProviderViewController() {}
    protected ASCredentialProviderViewController(Handle h, long handle) { super(h, handle); }
    protected ASCredentialProviderViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNibName:bundle:")
    public ASCredentialProviderViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public ASCredentialProviderViewController(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "extensionContext")
    public native ASCredentialProviderExtensionContext getExtensionContext();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "prepareCredentialListForServiceIdentifiers:")
    public native void prepareCredentialListForServiceIdentifiers(NSArray<ASCredentialServiceIdentifier> serviceIdentifiers);
    @Method(selector = "provideCredentialWithoutUserInteractionForIdentity:")
    public native void provideCredentialWithoutUserInteraction(ASPasswordCredentialIdentity credentialIdentity);
    @Method(selector = "prepareInterfaceToProvideCredentialForIdentity:")
    public native void prepareInterfaceToProvideCredentialForIdentity(ASPasswordCredentialIdentity credentialIdentity);
    @Method(selector = "prepareInterfaceForExtensionConfiguration")
    public native void prepareInterfaceForExtensionConfiguration();
    /*</methods>*/
}
