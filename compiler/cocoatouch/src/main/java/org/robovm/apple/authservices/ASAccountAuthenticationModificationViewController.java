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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AuthenticationServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASAccountAuthenticationModificationViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASAccountAuthenticationModificationViewControllerPtr extends Ptr<ASAccountAuthenticationModificationViewController, ASAccountAuthenticationModificationViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASAccountAuthenticationModificationViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ASAccountAuthenticationModificationViewController() {}
    protected ASAccountAuthenticationModificationViewController(Handle h, long handle) { super(h, handle); }
    protected ASAccountAuthenticationModificationViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNibName:bundle:")
    public ASAccountAuthenticationModificationViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public ASAccountAuthenticationModificationViewController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "extensionContext")
    public native ASAccountAuthenticationModificationExtensionContext getExtensionContext();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "convertAccountToSignInWithAppleWithoutUserInteractionForServiceIdentifier:existingCredential:userInfo:")
    public native void convertAccountToSignInWithAppleWithoutUserInteraction(ASCredentialServiceIdentifier serviceIdentifier, ASPasswordCredential existingCredential, NSDictionary<?, ?> userInfo);
    @Method(selector = "prepareInterfaceToConvertAccountToSignInWithAppleForServiceIdentifier:existingCredential:userInfo:")
    public native void prepareInterfaceToConvertAccountToSignInWithApple(ASCredentialServiceIdentifier serviceIdentifier, ASPasswordCredential existingCredential, NSDictionary<?, ?> userInfo);
    @Method(selector = "changePasswordWithoutUserInteractionForServiceIdentifier:existingCredential:newPassword:userInfo:")
    public native void changePasswordWithoutUserInteraction(ASCredentialServiceIdentifier serviceIdentifier, ASPasswordCredential existingCredential, String newPassword, NSDictionary<?, ?> userInfo);
    @Method(selector = "prepareInterfaceToChangePasswordForServiceIdentifier:existingCredential:newPassword:userInfo:")
    public native void prepareInterfaceToChangePassword(ASCredentialServiceIdentifier serviceIdentifier, ASPasswordCredential existingCredential, String newPassword, NSDictionary<?, ?> userInfo);
    @Method(selector = "cancelRequest")
    public native void cancelRequest();
    /*</methods>*/
}
