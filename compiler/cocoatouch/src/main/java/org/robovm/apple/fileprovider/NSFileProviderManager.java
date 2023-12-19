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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("FileProvider") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFileProviderManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSFileProviderManagerPtr extends Ptr<NSFileProviderManager, NSFileProviderManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSFileProviderManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSFileProviderManager() {}
    protected NSFileProviderManager(Handle h, long handle) { super(h, handle); }
    protected NSFileProviderManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultManager")
    public static native NSFileProviderManager getDefaultManager();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "providerIdentifier")
    public native String getProviderIdentifier();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "documentStorageURL")
    public native NSURL getDocumentStorageURL();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderRootContainerItemIdentifier", optional=true)
    public static native NSString RootContainerItemIdentifier();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderWorkingSetContainerItemIdentifier", optional=true)
    public static native NSString WorkingSetContainerItemIdentifier();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderTrashContainerItemIdentifier", optional=true)
    public static native NSString getTrashContainerItemIdentifier();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderFavoriteRankUnranked", optional=true)
    public static native NSString FavoriteRankUnranked();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderDomainDidChange", optional=true)
    public static native NSString getDomainDidChange();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderInitialPageSortedByDate", optional=true)
    public static native NSString getEnumerationInitialPageSortedByDate();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderInitialPageSortedByName", optional=true)
    public static native NSString getEnumerationInitialPageSortedByName();
    /**
     * @deprecated Deprecated in iOS 13.0. NSFileProviderErrorItemKey
     */
    @Deprecated
    @GlobalValue(symbol="NSFileProviderErrorCollidingItemKey", optional=true)
    public static native NSString getErrorCollidingItemKey();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderErrorItemKey", optional=true)
    public static native NSString getErrorItemKey();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderErrorNonExistentItemIdentifierKey", optional=true)
    public static native NSString getErrorNonExistentItemIdentifierKey();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderMaterializedSetDidChange", optional=true)
    public static native NSString getMaterializedSetDidChange();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderPendingSetDidChange", optional=true)
    public static native NSString getPendingSetDidChange();
    
    @Method(selector = "signalEnumeratorForContainerItemIdentifier:completionHandler:")
    public native void signalEnumerator(NSString containerItemIdentifier, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "getUserVisibleURLForItemIdentifier:completionHandler:")
    public native void getUserVisibleURLForItemIdentifier(NSString itemIdentifier, @Block VoidBlock2<NSURL, NSError> completionHandler);
    @Method(selector = "registerURLSessionTask:forItemWithIdentifier:completionHandler:")
    public native void registerURLSessionTask(NSURLSessionTask task, NSString identifier, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.0 and later.
     */
    public NSURL getTemporaryDirectoryURL() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSURL result = getTemporaryDirectoryURL(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "temporaryDirectoryURLWithError:")
    private native NSURL getTemporaryDirectoryURL(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "signalErrorResolved:completionHandler:")
    public native void signalErrorResolved(NSError error, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "globalProgressForKind:")
    public native NSProgress globalProgressForKind(String kind);
    @Method(selector = "managerForDomain:")
    public static native NSFileProviderManager managerForDomain(NSFileProviderDomain domain);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "getIdentifierForUserVisibleFileAtURL:completionHandler:")
    public static native void getIdentifierForUserVisibleFile(NSURL url, @Block VoidBlock3<NSString, String, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "writePlaceholderAtURL:withMetadata:error:")
    public static native boolean writePlaceholderAtURL(NSURL placeholderURL, NSFileProviderItem metadata, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "placeholderURLForURL:")
    public static native NSURL placeholderURLForURL(NSURL url);
    @Method(selector = "addDomain:completionHandler:")
    public static native void addDomain(NSFileProviderDomain domain, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "removeDomain:completionHandler:")
    public static native void removeDomain(NSFileProviderDomain domain, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "removeDomain:mode:completionHandler:")
    public static native void removeDomain(NSFileProviderDomain domain, NSFileProviderDomainRemovalMode mode, @Block VoidBlock2<NSURL, NSError> completionHandler);
    @Method(selector = "getDomainsWithCompletionHandler:")
    public static native void getDomains(@Block VoidBlock2<NSArray<NSFileProviderDomain>, NSError> completionHandler);
    @Method(selector = "removeAllDomainsWithCompletionHandler:")
    public static native void removeAllDomains(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "enumeratorForMaterializedItems")
    public native NSFileProviderEnumerator enumeratorForMaterializedItems();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "enumeratorForPendingItems")
    public native NSFileProviderPendingSetEnumerator enumeratorForPendingItems();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "reimportItemsBelowItemWithIdentifier:completionHandler:")
    public native void reimportItemsBelowItem(NSString itemIdentifier, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "requestModificationOfFields:forItemWithIdentifier:options:completionHandler:")
    public native void requestModificationOfFields(NSFileProviderItemFields fields, NSString itemIdentifier, NSFileProviderModifyItemOptions options, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "importDomain:fromDirectoryAtURL:completionHandler:")
    public static native void importDomain(NSFileProviderDomain domain, NSURL url, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "evictItemWithIdentifier:completionHandler:")
    public native void evictItem(NSString itemIdentifier, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "waitForChangesOnItemsBelowItemWithIdentifier:completionHandler:")
    public native void waitForChangesOnItemsBelowItem(NSString itemIdentifier, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "waitForStabilizationWithCompletionHandler:")
    public native void waitForStabilization(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "getServiceWithName:itemIdentifier:completionHandler:")
    public native void getService(NSString serviceName, NSString itemIdentifier, @Block VoidBlock2<NSFileProviderService, NSError> completionHandler);
    /**
     * @since Available in iOS 16.0 and later.
     */
    public NSArray<?> listAvailableTestingOperations() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSArray<?> result = listAvailableTestingOperations(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "listAvailableTestingOperationsWithError:")
    private native NSArray<?> listAvailableTestingOperations(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 16.0 and later.
     */
    public NSDictionary<?, NSError> runTestingOperations(NSArray<?> operations) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSDictionary<?, NSError> result = runTestingOperations(operations, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "runTestingOperations:error:")
    private native NSDictionary<?, NSError> runTestingOperations(NSArray<?> operations, NSError.NSErrorPtr error);
    /*</methods>*/
}
