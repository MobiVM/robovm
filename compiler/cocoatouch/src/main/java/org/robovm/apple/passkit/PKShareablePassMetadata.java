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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKShareablePassMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKShareablePassMetadataPtr extends Ptr<PKShareablePassMetadata, PKShareablePassMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKShareablePassMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKShareablePassMetadata() {}
    protected PKShareablePassMetadata(Handle h, long handle) { super(h, handle); }
    protected PKShareablePassMetadata(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardConfigurationIdentifier:passPreviewMetadata:
     */
    @Deprecated
    @Method(selector = "initWithProvisioningCredentialIdentifier:cardConfigurationIdentifier:sharingInstanceIdentifier:passThumbnailImage:ownerDisplayName:localizedDescription:")
    public PKShareablePassMetadata(String credentialIdentifier, String cardConfigurationIdentifier, String sharingInstanceIdentifier, CGImage passThumbnailImage, String ownerDisplayName, String localizedDescription) { super((SkipInit) null); initObject(init(credentialIdentifier, cardConfigurationIdentifier, sharingInstanceIdentifier, passThumbnailImage, ownerDisplayName, localizedDescription)); }
    /**
     * @since Available in iOS 15.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardTemplateIdentifier:passPreviewMetadata:
     */
    @Deprecated
    @Method(selector = "initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:passThumbnailImage:ownerDisplayName:localizedDescription:accountHash:templateIdentifier:relyingPartyIdentifier:requiresUnifiedAccessCapableDevice:")
    public PKShareablePassMetadata(String credentialIdentifier, String sharingInstanceIdentifier, CGImage passThumbnailImage, String ownerDisplayName, String localizedDescription, String accountHash, String templateIdentifier, String relyingPartyIdentifier, boolean requiresUnifiedAccessCapableDevice) { super((SkipInit) null); initObject(init(credentialIdentifier, sharingInstanceIdentifier, passThumbnailImage, ownerDisplayName, localizedDescription, accountHash, templateIdentifier, relyingPartyIdentifier, requiresUnifiedAccessCapableDevice)); }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardTemplateIdentifier:preview:")
    public static  PKShareablePassMetadata createUsingCardTemplateIdentifier(String credentialIdentifier, String sharingInstanceIdentifier, String templateIdentifier, PKShareablePassMetadataPreview preview) {
       PKShareablePassMetadata res = new PKShareablePassMetadata((SkipInit) null);
       res.initObject(res.createUsingCardTemplateIdentifier0(credentialIdentifier, sharingInstanceIdentifier, templateIdentifier, preview));
       return res;
    }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardConfigurationIdentifier:preview:")
    public static  PKShareablePassMetadata createUsingCardConfigurationIdentifier0(String credentialIdentifier, String sharingInstanceIdentifier, String templateIdentifier, PKShareablePassMetadataPreview preview) {
       PKShareablePassMetadata res = new PKShareablePassMetadata((SkipInit) null);
       res.initObject(res.createUsingcardConfigurationIdentifier0(credentialIdentifier, sharingInstanceIdentifier, templateIdentifier, preview));
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "credentialIdentifier")
    public native String getCredentialIdentifier();
    @Property(selector = "sharingInstanceIdentifier")
    public native String getSharingInstanceIdentifier();
    /**
     * @since Available in iOS 15.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use cardTemplateIdentifier
     */
    @Deprecated
    @Property(selector = "templateIdentifier")
    public native String getTemplateIdentifier();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "cardTemplateIdentifier")
    public native String getCardTemplateIdentifier();
    @Property(selector = "cardConfigurationIdentifier")
    public native String getCardConfigurationIdentifier();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "requiresUnifiedAccessCapableDevice")
    public native boolean requiresUnifiedAccessCapableDevice();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setRequiresUnifiedAccessCapableDevice:")
    public native void setRequiresUnifiedAccessCapableDevice(boolean v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "serverEnvironmentIdentifier")
    public native String getServerEnvironmentIdentifier();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setServerEnvironmentIdentifier:")
    public native void setServerEnvironmentIdentifier(String v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "preview")
    public native PKShareablePassMetadataPreview getPreview();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use preview.passThumbnailImage
     */
    @Deprecated
    @Property(selector = "passThumbnailImage")
    public native CGImage getPassThumbnailImage();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use preview.localizedDescription
     */
    @Deprecated
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use preview.ownerDisplayName
     */
    @Deprecated
    @Property(selector = "ownerDisplayName")
    public native String getOwnerDisplayName();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "accountHash")
    public native String getAccountHash();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setAccountHash:")
    public native void setAccountHash(String v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "relyingPartyIdentifier")
    public native String getRelyingPartyIdentifier();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setRelyingPartyIdentifier:")
    public native void setRelyingPartyIdentifier(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardConfigurationIdentifier:passPreviewMetadata:
     */
    @Deprecated
    @Method(selector = "initWithProvisioningCredentialIdentifier:cardConfigurationIdentifier:sharingInstanceIdentifier:passThumbnailImage:ownerDisplayName:localizedDescription:")
    protected native @Pointer long init(String credentialIdentifier, String cardConfigurationIdentifier, String sharingInstanceIdentifier, CGImage passThumbnailImage, String ownerDisplayName, String localizedDescription);
    /**
     * @since Available in iOS 15.0 and later.
     * @deprecated Deprecated in iOS 16.0. Use initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardTemplateIdentifier:passPreviewMetadata:
     */
    @Deprecated
    @Method(selector = "initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:passThumbnailImage:ownerDisplayName:localizedDescription:accountHash:templateIdentifier:relyingPartyIdentifier:requiresUnifiedAccessCapableDevice:")
    protected native @Pointer long init(String credentialIdentifier, String sharingInstanceIdentifier, CGImage passThumbnailImage, String ownerDisplayName, String localizedDescription, String accountHash, String templateIdentifier, String relyingPartyIdentifier, boolean requiresUnifiedAccessCapableDevice);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardTemplateIdentifier:preview:")
    protected native @Pointer long createUsingCardTemplateIdentifier0(String credentialIdentifier, String sharingInstanceIdentifier, String templateIdentifier, PKShareablePassMetadataPreview preview);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardConfigurationIdentifier:preview:")
    protected native @Pointer long createUsingcardConfigurationIdentifier0(String credentialIdentifier, String sharingInstanceIdentifier, String templateIdentifier, PKShareablePassMetadataPreview preview);
    /*</methods>*/
}
