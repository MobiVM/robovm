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
    @Property(selector = "providerIdentifier")
    public native String getProviderIdentifier();
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
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderFavoriteRankUnranked", optional=true)
    public static native NSString FavoriteRankUnranked();
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
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderErrorCollidingItemKey", optional=true)
    public static native NSString getErrorCollidingItemKey();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSFileProviderErrorNonExistentItemIdentifierKey", optional=true)
    public static native NSString getErrorNonExistentItemIdentifierKey();
    
    @Method(selector = "signalEnumeratorForContainerItemIdentifier:completionHandler:")
    public native void signalEnumerator(NSString containerItemIdentifier, @Block VoidBlock1<NSError> completion);
    @Method(selector = "registerURLSessionTask:forItemWithIdentifier:completionHandler:")
    public native void registerURLSessionTask(NSURLSessionTask task, NSString identifier, @Block VoidBlock1<NSError> completion);
    @Method(selector = "writePlaceholderAtURL:withMetadata:error:")
    public static native boolean writePlaceholderAtURL(NSURL placeholderURL, NSFileProviderItem metadata, NSError.NSErrorPtr error);
    @Method(selector = "placeholderURLForURL:")
    public static native NSURL placeholderURLForURL(NSURL url);
    @Method(selector = "addDomain:completionHandler:")
    public static native void addDomain(NSFileProviderDomain domain, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "removeDomain:completionHandler:")
    public static native void removeDomain(NSFileProviderDomain domain, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "getDomainsWithCompletionHandler:")
    public static native void getDomains(@Block VoidBlock2<NSArray<NSFileProviderDomain>, NSError> completionHandler);
    @Method(selector = "removeAllDomainsWithCompletionHandler:")
    public static native void removeAllDomains(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "managerForDomain:")
    public static native NSFileProviderManager managerForDomain(NSFileProviderDomain domain);
    /*</methods>*/
}
