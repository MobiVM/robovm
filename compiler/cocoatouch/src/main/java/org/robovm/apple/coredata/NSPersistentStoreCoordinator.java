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
package org.robovm.apple.coredata;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPersistentStoreCoordinator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSLocking/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObject observeStoresWillChange(NSPersistentStoreCoordinator object, final VoidBlock2<NSPersistentStoreCoordinator, NSPersistentStoreCoordinatorChangeNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(NotificationKeys.CoordinatorStoresWillChange(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> userInfo = a.getUserInfo();
                    NSPersistentStoreCoordinatorChangeNotification data = null;
                    if (userInfo != null) {
                        data = new NSPersistentStoreCoordinatorChangeNotification(userInfo);
                    }
                    block.invoke((NSPersistentStoreCoordinator)a.getObject(), data);
                }
            });
        }
        /**
         * @since Available in iOS 3.0 and later.
         */
        public static NSObject observeStoresDidChange(NSPersistentStoreCoordinator object, final VoidBlock2<NSPersistentStoreCoordinator, NSPersistentStoreCoordinatorChangeNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(NotificationKeys.CoordinatorStoresDidChange(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> userInfo = a.getUserInfo();
                    NSPersistentStoreCoordinatorChangeNotification data = null;
                    if (userInfo != null) {
                        data = new NSPersistentStoreCoordinatorChangeNotification(userInfo);
                    }
                    block.invoke((NSPersistentStoreCoordinator)a.getObject(), data);
                }
            });
        }
        /**
         * @since Available in iOS 3.0 and later.
         */
        public static NSObject observeWillRemoveStore(NSPersistentStoreCoordinator object, final VoidBlock1<NSPersistentStoreCoordinator> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(NotificationKeys.CoordinatorWillRemoveStore(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSPersistentStoreCoordinator)a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 5.0 and later.
         */
        public static NSObject observeDidImportUbiquitousContentChanges(NSPersistentStoreCoordinator object, final VoidBlock2<NSPersistentStoreCoordinator, NSNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(NotificationKeys.DidImportUbiquitousContentChanges(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSPersistentStoreCoordinator)a.getObject(), a);
                }
            });
        }
    }
    
    /*<ptr>*/public static class NSPersistentStoreCoordinatorPtr extends Ptr<NSPersistentStoreCoordinator, NSPersistentStoreCoordinatorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSPersistentStoreCoordinator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSPersistentStoreCoordinator() {}
    protected NSPersistentStoreCoordinator(Handle h, long handle) { super(h, handle); }
    protected NSPersistentStoreCoordinator(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithManagedObjectModel:")
    public NSPersistentStoreCoordinator(NSManagedObjectModel model) { super((SkipInit) null); initObject(init(model)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "managedObjectModel")
    public native NSManagedObjectModel getManagedObjectModel();
    @Property(selector = "persistentStores")
    public native NSArray<NSPersistentStore> getPersistentStores();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "registeredStoreTypes")
    public static native NSDictionary<NSString, NSPersistentStore> getRegisteredStoreTypes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * 
     * @param storeType
     * @param configuration
     * @param storeURL
     * @param options
     * @return
     * @throws NSErrorException
     */
    public NSPersistentStore addPersistentStore(NSPersistentStoreType storeType, String configuration, NSURL storeURL, NSPersistentStoreOptions options) throws NSErrorException {
        return addPersistentStore(storeType.value().toString(), configuration, storeURL, options);
    }
    /**
     * 
     * @param store
     * @param URL
     * @param options
     * @param storeType
     * @return
     * @throws NSErrorException
     */
    public NSPersistentStore migratePersistentStore(NSPersistentStore store, NSURL URL, NSPersistentStoreOptions options, NSPersistentStoreType storeType) throws NSErrorException {
        return migratePersistentStore(store, URL, options, storeType.value().toString());
    }
    /**
     * 
     * @param storeClass
     * @param storeType
     * @since Available in iOS 3.0 and later.
     */
    public static void registerStoreClassForType(Class<? extends NSPersistentStore> storeClass, NSPersistentStoreType storeType) {
        registerStoreClassForType(storeClass, storeType.value().toString());
    }
    /**
     * 
     * @param storeType
     * @param url
     * @return
     * @since Available in iOS 3.0 and later.
     * @throws NSErrorException
     */
    public static NSPersistentStoreMetadata getMetadataForPersistentStoreType(NSPersistentStoreType storeType, NSURL url) throws NSErrorException {
        return getMetadataForPersistentStoreType(storeType.value().toString(), url);
    }
    /**
     * 
     * @param metadata
     * @param storeType
     * @param url
     * @return
     * @since Available in iOS 3.0 and later.
     * @throws NSErrorException
     */
    public static boolean setMetadataForPersistentStoreType(NSPersistentStoreMetadata metadata, NSPersistentStoreType storeType, NSURL url) throws NSErrorException {
        return setMetadataForPersistentStoreType(metadata, storeType.value().toString(), url);
    }
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="NSCoreDataCoreSpotlightExporter", optional=true)
    public static native String CoreSpotlightExporter();
    @Library("CoreData")
    public static class NotificationKeys {
        static { Bro.bind(NotificationKeys.class); }

        @GlobalValue(symbol="NSPersistentStoreCoordinatorStoresWillChangeNotification", optional=true)
        public static native NSString CoordinatorStoresWillChange();
        @GlobalValue(symbol="NSPersistentStoreCoordinatorStoresDidChangeNotification", optional=true)
        public static native NSString CoordinatorStoresDidChange();
        @GlobalValue(symbol="NSPersistentStoreCoordinatorWillRemoveStoreNotification", optional=true)
        public static native NSString CoordinatorWillRemoveStore();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="NSPersistentStoreRemoteChangeNotification", optional=true)
        public static native NSString RemoteChange();
        /**
         * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
         */
        @Deprecated
        @GlobalValue(symbol="NSPersistentStoreDidImportUbiquitousContentChangesNotification", optional=true)
        public static native NSString DidImportUbiquitousContentChanges();
    }
    
    @Method(selector = "initWithManagedObjectModel:")
    protected native @Pointer long init(NSManagedObjectModel model);
    @Method(selector = "persistentStoreForURL:")
    public native NSPersistentStore getPersistentStoreForURL(NSURL URL);
    @Method(selector = "URLForPersistentStore:")
    public native NSURL getURLForPersistentStore(NSPersistentStore store);
    @Method(selector = "setURL:forPersistentStore:")
    public native boolean setURLForPersistentStore(NSURL url, NSPersistentStore store);
    public NSPersistentStore addPersistentStore(String storeType, String configuration, NSURL storeURL, NSPersistentStoreOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSPersistentStore result = addPersistentStore(storeType, configuration, storeURL, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "addPersistentStoreWithType:configuration:URL:options:error:")
    private native NSPersistentStore addPersistentStore(String storeType, String configuration, NSURL storeURL, NSPersistentStoreOptions options, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "addPersistentStoreWithDescription:completionHandler:")
    public native void addPersistentStoreWithDescription(NSPersistentStoreDescription storeDescription, @Block VoidBlock2<NSPersistentStoreDescription, NSError> block);
    public boolean removePersistentStore(NSPersistentStore store) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = removePersistentStore(store, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "removePersistentStore:error:")
    private native boolean removePersistentStore(NSPersistentStore store, NSError.NSErrorPtr error);
    @Method(selector = "setMetadata:forPersistentStore:")
    public native void setMetadataForPersistentStore(NSPersistentStoreMetadata metadata, NSPersistentStore store);
    @Method(selector = "metadataForPersistentStore:")
    public native NSDictionary<NSString, ?> getMetadataForPersistentStore(NSPersistentStore store);
    @Method(selector = "managedObjectIDForURIRepresentation:")
    public native NSManagedObjectID getManagedObjectIDForURIRepresentation(NSURL url);
    public NSObject executeRequest(NSPersistentStoreRequest request, NSManagedObjectContext context) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSObject result = executeRequest(request, context, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "executeRequest:withContext:error:")
    private native NSObject executeRequest(NSPersistentStoreRequest request, NSManagedObjectContext context, NSError.NSErrorPtr error);
    public NSPersistentStore migratePersistentStore(NSPersistentStore store, NSURL URL, NSPersistentStoreOptions options, String storeType) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSPersistentStore result = migratePersistentStore(store, URL, options, storeType, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "migratePersistentStore:toURL:options:withType:error:")
    private native NSPersistentStore migratePersistentStore(NSPersistentStore store, NSURL URL, NSPersistentStoreOptions options, String storeType, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public boolean destroyPersistentStore(NSURL url, String storeType, NSPersistentStoreOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = destroyPersistentStore(url, storeType, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "destroyPersistentStoreAtURL:withType:options:error:")
    private native boolean destroyPersistentStore(NSURL url, String storeType, NSPersistentStoreOptions options, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 9.0 and later.
     */
    public boolean replacePersistentStore(NSURL destinationURL, NSPersistentStoreOptions destinationOptions, NSURL sourceURL, NSPersistentStoreOptions sourceOptions, String storeType) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = replacePersistentStore(destinationURL, destinationOptions, sourceURL, sourceOptions, storeType, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "replacePersistentStoreAtURL:destinationOptions:withPersistentStoreFromURL:sourceOptions:storeType:error:")
    private native boolean replacePersistentStore(NSURL destinationURL, NSPersistentStoreOptions destinationOptions, NSURL sourceURL, NSPersistentStoreOptions sourceOptions, String storeType, NSError.NSErrorPtr error);
    @Method(selector = "performBlock:")
    public native void performBlock(@Block Runnable block);
    @Method(selector = "performBlockAndWait:")
    public native void performBlockAndWait(@Block Runnable block);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "currentPersistentHistoryTokenFromStores:")
    public native NSPersistentHistoryToken currentPersistentHistoryTokenFromStores(NSArray<?> stores);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public boolean finishDeferredLightweightMigration() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = finishDeferredLightweightMigration(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "finishDeferredLightweightMigration:")
    private native boolean finishDeferredLightweightMigration(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     */
    public boolean finishDeferredLightweightMigrationTask() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = finishDeferredLightweightMigrationTask(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "finishDeferredLightweightMigrationTask:")
    private native boolean finishDeferredLightweightMigrationTask(NSError.NSErrorPtr error);
    /**
     * @deprecated Deprecated in iOS 8.0. Use -performBlockAndWait: instead
     */
    @Deprecated
    @Method(selector = "lock")
    public native void lock();
    /**
     * @deprecated Deprecated in iOS 8.0. Use -performBlockAndWait: instead
     */
    @Deprecated
    @Method(selector = "unlock")
    public native void unlock();
    /**
     * @deprecated Deprecated in iOS 8.0. Use -performBlock: instead
     */
    @Deprecated
    @Method(selector = "tryLock")
    public native boolean tryLock();
    @Method(selector = "registerStoreClass:forStoreType:")
    public static native void registerStoreClassForType(Class<? extends NSPersistentStore> storeClass, String storeType);
    public static NSPersistentStoreMetadata getMetadataForPersistentStoreType(String storeType, NSURL url, NSPersistentStoreOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSPersistentStoreMetadata result = getMetadataForPersistentStoreType(storeType, url, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "metadataForPersistentStoreOfType:URL:options:error:")
    private static native NSPersistentStoreMetadata getMetadataForPersistentStoreType(String storeType, NSURL url, NSPersistentStoreOptions options, NSError.NSErrorPtr error);
    public static boolean setMetadataForPersistentStoreType(NSPersistentStoreMetadata metadata, String storeType, NSURL url, NSPersistentStoreOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setMetadataForPersistentStoreType(metadata, storeType, url, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setMetadata:forPersistentStoreOfType:URL:options:error:")
    private static native boolean setMetadataForPersistentStoreType(NSPersistentStoreMetadata metadata, String storeType, NSURL url, NSPersistentStoreOptions options, NSError.NSErrorPtr error);
    /**
     * @deprecated Deprecated in iOS 9.0. Use -metadataForPersistentStoreOfType:URL:options:error: and pass in an options dictionary matching addPersistentStoreWithType
     */
    @Deprecated
    public static NSPersistentStoreMetadata getMetadataForPersistentStoreType(String storeType, NSURL url) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSPersistentStoreMetadata result = getMetadataForPersistentStoreType(storeType, url, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @deprecated Deprecated in iOS 9.0. Use -metadataForPersistentStoreOfType:URL:options:error: and pass in an options dictionary matching addPersistentStoreWithType
     */
    @Deprecated
    @Method(selector = "metadataForPersistentStoreOfType:URL:error:")
    private static native NSPersistentStoreMetadata getMetadataForPersistentStoreType(String storeType, NSURL url, NSError.NSErrorPtr error);
    /**
     * @deprecated Deprecated in iOS 9.0. Use  -setMetadata:forPersistentStoreOfType:URL:options:error: and pass in an options dictionary matching addPersistentStoreWithType
     */
    @Deprecated
    public static boolean setMetadataForPersistentStoreType(NSPersistentStoreMetadata metadata, String storeType, NSURL url) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setMetadataForPersistentStoreType(metadata, storeType, url, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @deprecated Deprecated in iOS 9.0. Use  -setMetadata:forPersistentStoreOfType:URL:options:error: and pass in an options dictionary matching addPersistentStoreWithType
     */
    @Deprecated
    @Method(selector = "setMetadata:forPersistentStoreOfType:URL:error:")
    private static native boolean setMetadataForPersistentStoreType(NSPersistentStoreMetadata metadata, String storeType, NSURL url, NSError.NSErrorPtr error);
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    public static boolean removeUbiquitousContentAndPersistentStore(NSURL storeURL, NSPersistentStoreOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = removeUbiquitousContentAndPersistentStore(storeURL, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @deprecated Deprecated in iOS 10.0. Please see the release notes and Core Data documentation.
     */
    @Deprecated
    @Method(selector = "removeUbiquitousContentAndPersistentStoreAtURL:options:error:")
    private static native boolean removeUbiquitousContentAndPersistentStore(NSURL storeURL, NSPersistentStoreOptions options, NSError.NSErrorPtr error);
    /*</methods>*/
}
