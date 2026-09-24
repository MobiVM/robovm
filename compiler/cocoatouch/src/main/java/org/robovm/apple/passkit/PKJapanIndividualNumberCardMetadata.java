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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKJapanIndividualNumberCardMetadata/*</name>*/ 
    extends /*<extends>*/PKIdentityDocumentMetadata/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKJapanIndividualNumberCardMetadataPtr extends Ptr<PKJapanIndividualNumberCardMetadata, PKJapanIndividualNumberCardMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKJapanIndividualNumberCardMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKJapanIndividualNumberCardMetadata() {}
    protected PKJapanIndividualNumberCardMetadata(Handle h, long handle) { super(h, handle); }
    protected PKJapanIndividualNumberCardMetadata(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardTemplateIdentifier:preview:")
    public static PKJapanIndividualNumberCardMetadata createUsingCardTemplateIdentifier(String credentialIdentifier, String sharingInstanceIdentifier, String templateIdentifier, PKAddPassMetadataPreview preview) {
       PKJapanIndividualNumberCardMetadata res = new PKJapanIndividualNumberCardMetadata((SkipInit) null);
       res.initObject(res.initWithProvisioningCredentialIdentifierCardTemplateIdentifier(credentialIdentifier, sharingInstanceIdentifier, templateIdentifier, preview));
       return res;
    }
    @Method(selector = "initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardConfigurationIdentifier:preview:")
    public static PKJapanIndividualNumberCardMetadata createUsingCardConfigurationIdentifier(String credentialIdentifier, String sharingInstanceIdentifier, String cardConfigurationIdentifier, PKAddPassMetadataPreview preview) {
       PKJapanIndividualNumberCardMetadata res = new PKJapanIndividualNumberCardMetadata((SkipInit) null);
       res.initObject(res.initWithProvisioningCredentialIdentifierCardConfigurationIdentifier(credentialIdentifier, sharingInstanceIdentifier, cardConfigurationIdentifier, preview));
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authenticationPassword")
    public native String getAuthenticationPassword();
    @Property(selector = "setAuthenticationPassword:")
    public native void setAuthenticationPassword(String v);
    @Property(selector = "signingPassword")
    public native String getSigningPassword();
    @Property(selector = "setSigningPassword:")
    public native void setSigningPassword(String v);
    @Property(selector = "preview")
    public native PKAddPassMetadataPreview getPreview();
    @Property(selector = "setPreview:")
    public native void setPreview(PKAddPassMetadataPreview v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardTemplateIdentifier:preview:")
    protected native @Pointer long initWithProvisioningCredentialIdentifierCardTemplateIdentifier(String credentialIdentifier, String sharingInstanceIdentifier, String templateIdentifier, PKAddPassMetadataPreview preview);
    @Method(selector = "initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardConfigurationIdentifier:preview:")
    protected native @Pointer long initWithProvisioningCredentialIdentifierCardConfigurationIdentifier(String credentialIdentifier, String sharingInstanceIdentifier, String cardConfigurationIdentifier, PKAddPassMetadataPreview preview);
    /*</methods>*/
}
