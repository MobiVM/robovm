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
    public ASCredentialProviderViewController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "extensionContext")
    public native ASCredentialProviderExtensionContext getExtensionContext();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "prepareCredentialListForServiceIdentifiers:")
    public native void prepareCredentialListForServiceIdentifiers(NSArray<ASCredentialServiceIdentifier> serviceIdentifiers);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "prepareCredentialListForServiceIdentifiers:requestParameters:")
    public native void prepareCredentialList(NSArray<ASCredentialServiceIdentifier> serviceIdentifiers, ASPasskeyCredentialRequestParameters requestParameters);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "prepareOneTimeCodeCredentialListForServiceIdentifiers:")
    public native void prepareOneTimeCodeCredentialListForServiceIdentifiers(NSArray<ASCredentialServiceIdentifier> serviceIdentifiers);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "prepareInterfaceForUserChoosingTextToInsert")
    public native void prepareInterfaceForUserChoosingTextToInsert();
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 17.0. Use provideCredentialWithoutUserInteractionForRequest:
     */
    @Deprecated
    @Method(selector = "provideCredentialWithoutUserInteractionForIdentity:")
    public native void provideCredentialWithoutUserInteraction(ASPasswordCredentialIdentity credentialIdentity);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "provideCredentialWithoutUserInteractionForRequest:")
    public native void provideCredentialWithoutUserInteraction(ASCredentialRequest credentialRequest);
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 17.0. Use prepareInterfaceToProvideCredentialForRequest:
     */
    @Deprecated
    @Method(selector = "prepareInterfaceToProvideCredentialForIdentity:")
    public native void prepareInterfaceToProvideCredentialForIdentity(ASPasswordCredentialIdentity credentialIdentity);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "prepareInterfaceToProvideCredentialForRequest:")
    public native void prepareInterfaceToProvideCredentialForRequest(ASCredentialRequest credentialRequest);
    @Method(selector = "prepareInterfaceForExtensionConfiguration")
    public native void prepareInterfaceForExtensionConfiguration();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "prepareInterfaceForPasskeyRegistration:")
    public native void prepareInterfaceForPasskeyRegistration(ASCredentialRequest registrationRequest);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "performPasskeyRegistrationWithoutUserInteractionIfPossible:")
    public native void performPasskeyRegistrationWithoutUserInteractionIfPossible(ASPasskeyCredentialRequest registrationRequest);
    @Method(selector = "reportPublicKeyCredentialUpdateForRelyingParty:userHandle:newName:")
    public native void reportPublicKeyCredentialUpdate(String relyingParty, NSData userHandle, String newName);
    @Method(selector = "reportUnknownPublicKeyCredentialForRelyingParty:credentialID:")
    public native void reportUnknownPublicKeyCredential(String relyingParty, NSData credentialID);
    @Method(selector = "reportAllAcceptedPublicKeyCredentialsForRelyingParty:userHandle:acceptedCredentialIDs:")
    public native void reportAllAcceptedPublicKeyCredentials(String relyingParty, NSData userHandle, NSArray<NSData> acceptedCredentialIDs);
    @Method(selector = "reportUnusedPasswordCredentialForDomain:userName:")
    public native void reportUnusedPasswordCredential(String domain, String userName);
    /**
     * @since Available in iOS 26.2 and later.
     */
    @Method(selector = "performSavePasswordRequestWithoutUserInteractionIfPossible:")
    public native void performSavePasswordRequest(ASSavePasswordRequest savePasswordRequest);
    /**
     * @since Available in iOS 26.2 and later.
     */
    @Method(selector = "prepareInterfaceForSavePasswordRequest:")
    public native void prepareInterfaceForSavePasswordRequest(ASSavePasswordRequest savePasswordRequest);
    /**
     * @since Available in iOS 26.2 and later.
     */
    @Method(selector = "performGeneratePasswordsRequestWithoutUserInteraction:")
    public native void performGeneratePasswordsRequest(ASGeneratePasswordsRequest generatePasswordsRequest);
    /**
     * @since Available in iOS 26.2 and later.
     */
    @Method(selector = "prepareInterfaceForGeneratePasswordsRequest:")
    public native void prepareInterfaceForGeneratePasswordsRequest(ASGeneratePasswordsRequest generatePasswordsRequest);
    /*</methods>*/
}
