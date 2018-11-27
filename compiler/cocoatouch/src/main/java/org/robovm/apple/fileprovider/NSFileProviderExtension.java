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
package org.robovm.apple.fileprovider;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("FileProvider") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFileProviderExtension/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSFileProviderExtensionPtr extends Ptr<NSFileProviderExtension, NSFileProviderExtensionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSFileProviderExtension.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSFileProviderExtension() {}
    protected NSFileProviderExtension(Handle h, long handle) { super(h, handle); }
    protected NSFileProviderExtension(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Property(selector = "providerIdentifier")
    public native String getProviderIdentifier();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Property(selector = "documentStorageURL")
    public native NSURL getDocumentStorageURL();
    @Property(selector = "domain")
    public native NSFileProviderDomain getDomain();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "URLForItemWithPersistentIdentifier:")
    public native NSURL getURLForItem(NSString identifier);
    @Method(selector = "persistentIdentifierForItemAtURL:")
    public native NSString persistentIdentifierForItemAtURL(NSURL url);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public NSFileProviderItem itemForIdentifier(NSString identifier) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSFileProviderItem result = itemForIdentifier(identifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "itemForIdentifier:error:")
    private native NSFileProviderItem itemForIdentifier(NSString identifier, NSError.NSErrorPtr error);
    @Method(selector = "providePlaceholderAtURL:completionHandler:")
    public native void providePlaceholderAtURL(NSURL url, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "startProvidingItemAtURL:completionHandler:")
    public native void startProvidingItemAtURL(NSURL url, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "stopProvidingItemAtURL:")
    public native void stopProvidingItemAtURL(NSURL url);
    @Method(selector = "itemChangedAtURL:")
    public native void itemChangedAtURL(NSURL url);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use the corresponding method on NSFileProviderManager instead
     */
    @Deprecated
    @Method(selector = "writePlaceholderAtURL:withMetadata:error:")
    public static native boolean writePlaceholder(NSURL placeholderURL, NSDictionary<NSString, ?> metadata, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "placeholderURLForURL:")
    public static native NSURL placeholderURLForURL(NSURL url);
    @Method(selector = "enumeratorForContainerItemIdentifier:error:")
    public native NSFileProviderEnumerator enumeratorForContainer(NSString containerItemIdentifier, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "importDocumentAtURL:toParentItemIdentifier:completionHandler:")
    public native void importDocumentAtURL(NSURL fileURL, NSString parentItemIdentifier, @Block VoidBlock2<NSFileProviderItem, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "createDirectoryWithName:inParentItemIdentifier:completionHandler:")
    public native void createDirectory(String directoryName, NSString parentItemIdentifier, @Block VoidBlock2<NSFileProviderItem, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "renameItemWithIdentifier:toName:completionHandler:")
    public native void renameItem(NSString itemIdentifier, String itemName, @Block VoidBlock2<NSFileProviderItem, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "reparentItemWithIdentifier:toParentItemWithIdentifier:newName:completionHandler:")
    public native void reparentItem(NSString itemIdentifier, NSString parentItemIdentifier, String newName, @Block VoidBlock2<NSFileProviderItem, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "trashItemWithIdentifier:completionHandler:")
    public native void trashItem(NSString itemIdentifier, @Block VoidBlock2<NSFileProviderItem, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "untrashItemWithIdentifier:toParentItemIdentifier:completionHandler:")
    public native void untrashItem(NSString itemIdentifier, NSString parentItemIdentifier, @Block VoidBlock2<NSFileProviderItem, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "deleteItemWithIdentifier:completionHandler:")
    public native void deleteItem(NSString itemIdentifier, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setLastUsedDate:forItemIdentifier:completionHandler:")
    public native void setLastUsedDate(NSDate lastUsedDate, NSString itemIdentifier, @Block VoidBlock2<NSFileProviderItem, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setTagData:forItemIdentifier:completionHandler:")
    public native void setTagData(NSData tagData, NSString itemIdentifier, @Block VoidBlock2<NSFileProviderItem, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setFavoriteRank:forItemIdentifier:completionHandler:")
    public native void setFavoriteRank(NSNumber favoriteRank, NSString itemIdentifier, @Block VoidBlock2<NSFileProviderItem, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "supportedServiceSourcesForItemIdentifier:error:")
    public native NSArray<?> supportedServiceSources(NSString itemIdentifier, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "fetchThumbnailsForItemIdentifiers:requestedSize:perThumbnailCompletionHandler:completionHandler:")
    public native NSProgress fetchThumbnails(NSArray<NSString> itemIdentifiers, @ByVal CGSize size, @Block VoidBlock3<NSString, NSData, NSError> perThumbnailCompletionHandler, @Block VoidBlock1<NSError> completionHandler);
    /*</methods>*/
}
