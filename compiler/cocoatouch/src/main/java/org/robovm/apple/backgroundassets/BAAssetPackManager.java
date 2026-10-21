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
package org.robovm.apple.backgroundassets;

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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("BackgroundAssets") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BAAssetPackManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BAAssetPackManagerPtr extends Ptr<BAAssetPackManager, BAAssetPackManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BAAssetPackManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BAAssetPackManager() {}
    protected BAAssetPackManager(Handle h, long handle) { super(h, handle); }
    protected BAAssetPackManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedManager")
    public static native BAAssetPackManager getSharedManager();
    @Property(selector = "delegate")
    public native BAManagedAssetPackDownloadDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(BAManagedAssetPackDownloadDelegate v);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "resolvedLanguage")
    public native String getResolvedLanguage();
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Property(selector = "setResolvedLanguage:")
    public native void setResolvedLanguage(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "getManifestWithCompletionHandler:")
    public native void getManifest(@Block VoidBlock2<BAAssetPackManifest, NSError> completionHandler);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "getStatusRelativeToAssetPack:completionHandler:")
    public native void getStatusRelativeToAssetPack(BAAssetPack assetPack, @Block VoidBlock2<BAAssetPackStatus, NSError> completionHandler);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "getLocalStatusOfAssetPackWithIdentifier:completionHandler:")
    public native void getLocalStatusOfAssetPack(String assetPackIdentifier, @Block VoidBlock1<BAAssetPackStatus> completionHandler);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "assetPackIsAvailableLocallyWithIdentifier:")
    public native boolean assetPackIsAvailableLocally(String assetPackIdentifier);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "getLocallyAvailableLanguagesWithCompletionHandler:")
    public native void getLocallyAvailableLanguages(@Block VoidBlock1<NSArray<NSString>> completionHandler);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "reconcilePreferredLanguagesWithCompletionHandler:")
    public native void reconcilePreferredLanguages(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "ensureLocalAvailabilityOfAssetPack:completionHandler:")
    public native void ensureLocalAvailabilityOfAssetPack(BAAssetPack assetPack, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "ensureLocalAvailabilityOfAssetPack:requireLatestVersion:completionHandler:")
    public native void ensureLocalAvailabilityOfAssetPack(BAAssetPack assetPack, boolean shouldUpdate, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "ensureLocalAvailabilityOfAssetPacks:completionHandler:")
    public native void ensureLocalAvailabilityOfAssetPacks(NSSet<BAAssetPack> assetPacks, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "ensureLocalAvailabilityOfAssetPacks:requireLatestVersions:completionHandler:")
    public native void ensureLocalAvailabilityOfAssetPacks(NSSet<BAAssetPack> assetPacks, boolean shouldUpdate, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "checkForUpdatesWithCompletionHandler:")
    public native void checkForUpdates(@Block VoidBlock3<NSSet<NSString>, NSSet<NSString>, NSError> completionHandler);
    public NSData getContents(String path, String assetPackIdentifier, NSDataReadingOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = getContents(path, assetPackIdentifier, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "contentsAtPath:searchingInAssetPackWithIdentifier:options:error:")
    private native NSData getContents(String path, String assetPackIdentifier, NSDataReadingOptions options, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 27.0 and later.
     */
    public NSData getContentsAsLocalizedForLanguage(String path, String languageIdentifier, NSDataReadingOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = getContentsAsLocalizedForLanguage(path, languageIdentifier, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "contentsAtPath:asLocalizedForLanguage:options:error:")
    private native NSData getContentsAsLocalizedForLanguage(String path, String languageIdentifier, NSDataReadingOptions options, NSError.NSErrorPtr error);
    public int getFileDescriptor(String path, String assetPackIdentifier) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       int result = getFileDescriptor(path, assetPackIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "fileDescriptorForPath:searchingInAssetPackWithIdentifier:error:")
    private native int getFileDescriptor(String path, String assetPackIdentifier, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 27.0 and later.
     */
    public int getFileDescriptorAsLocalizedForLanguage(String path, String languageIdentifier) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       int result = getFileDescriptorAsLocalizedForLanguage(path, languageIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "fileDescriptorForPath:asLocalizedForLanguage:error:")
    private native int getFileDescriptorAsLocalizedForLanguage(String path, String languageIdentifier, NSError.NSErrorPtr error);
    public NSURL getURL(String path) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSURL result = getURL(path, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "URLForPath:error:")
    private native NSURL getURL(String path, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 27.0 and later.
     */
    public NSURL getURL(String path, String languageIdentifier) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSURL result = getURL(path, languageIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "URLForPath:asLocalizedForLanguage:error:")
    private native NSURL getURL(String path, String languageIdentifier, NSError.NSErrorPtr error);
    @Method(selector = "removeAssetPackWithIdentifier:completionHandler:")
    public native void removeAssetPack(String assetPackIdentifier, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 26.0 and later.
     * @deprecated Deprecated in iOS 27.0. Send -getManifestWithCompletionHandler: to obtain a manifest, and send -assetPacks to that manifest to obtain the set of asset packs.
     */
    @Deprecated
    @Method(selector = "getAllAssetPacksWithCompletionHandler:")
    public native void getAllAssetPacks(@Block VoidBlock2<NSSet<BAAssetPack>, NSError> completionHandler);
    /**
     * @since Available in iOS 26.0 and later.
     * @deprecated Deprecated in iOS 27.0. Send -getManifestWithCompletionHandler: to obtain a manifest, and send -assetPackWithIdentifier: to that manifest to obtain an asset pack.
     */
    @Deprecated
    @Method(selector = "getAssetPackWithIdentifier:completionHandler:")
    public native void getAssetPack(String assetPackIdentifier, @Block VoidBlock2<BAAssetPack, NSError> completionHandler);
    /**
     * @since Available in iOS 26.0 and later.
     * @deprecated Deprecated in iOS 26.4. Use Send -getStatusRelativeToAssetPack:completionHandler: instead.
     */
    @Deprecated
    @Method(selector = "getStatusOfAssetPackWithIdentifier:completionHandler:")
    public native void getStatusOfAssetPack(String assetPackIdentifier, @Block VoidBlock2<BAAssetPackStatus, NSError> completionHandler);
    /*</methods>*/
}
