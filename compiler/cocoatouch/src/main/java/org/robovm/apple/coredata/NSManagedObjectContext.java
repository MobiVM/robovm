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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSManagedObjectContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding, NSLocking/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 3.0 and later.
         */
        public static NSObjectProtocol observeWillSave(NSManagedObject object, final VoidBlock1<NSManagedObject> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillSaveNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSManagedObject)a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 3.0 and later.
         */
        public static NSObjectProtocol observeDidSave(NSManagedObject object, final VoidBlock2<NSManagedObject, NSManagedObjectContextNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidSaveNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> userInfo = a.getUserInfo();
                    NSManagedObjectContextNotification data = null;
                    if (userInfo != null) {
                        data = new NSManagedObjectContextNotification(userInfo);
                    }
                    block.invoke((NSManagedObject)a.getObject(), data);
                }
            });
        }
        /**
         * @since Available in iOS 3.0 and later.
         */
        public static NSObjectProtocol observeObjectsDidChange(NSManagedObject object, final VoidBlock3<NSManagedObject, NSManagedObjectContextNotification, NSNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ObjectsDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> userInfo = a.getUserInfo();
                    NSManagedObjectContextNotification data = null;
                    if (userInfo != null) {
                        data = new NSManagedObjectContextNotification(userInfo);
                    }
                    block.invoke((NSManagedObject)a.getObject(), data, a);
                }
            });
        }
        
    }
    
    /*<ptr>*/public static class NSManagedObjectContextPtr extends Ptr<NSManagedObjectContext, NSManagedObjectContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSManagedObjectContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSManagedObjectContext() {}
    protected NSManagedObjectContext(Handle h, long handle) { super(h, handle); }
    protected NSManagedObjectContext(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConcurrencyType:")
    public NSManagedObjectContext(NSManagedObjectContextConcurrencyType ct) { super((SkipInit) null); initObject(init(ct)); }
    @Method(selector = "initWithCoder:")
    public NSManagedObjectContext(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "persistentStoreCoordinator")
    public native NSPersistentStoreCoordinator getPersistentStoreCoordinator();
    @Property(selector = "setPersistentStoreCoordinator:")
    public native void setPersistentStoreCoordinator(NSPersistentStoreCoordinator v);
    @Property(selector = "parentContext")
    public native NSManagedObjectContext getParentContext();
    @Property(selector = "setParentContext:")
    public native void setParentContext(NSManagedObjectContext v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "undoManager")
    public native NSUndoManager getUndoManager();
    @Property(selector = "setUndoManager:")
    public native void setUndoManager(NSUndoManager v);
    @Property(selector = "hasChanges")
    public native boolean hasChanges();
    @Property(selector = "userInfo")
    public native NSMutableDictionary<?, ?> getUserInfo();
    @Property(selector = "concurrencyType")
    public native NSManagedObjectContextConcurrencyType getConcurrencyType();
    @Property(selector = "insertedObjects")
    public native NSSet<NSManagedObject> getInsertedObjects();
    @Property(selector = "updatedObjects")
    public native NSSet<NSManagedObject> getUpdatedObjects();
    @Property(selector = "deletedObjects")
    public native NSSet<NSManagedObject> getDeletedObjects();
    @Property(selector = "registeredObjects")
    public native NSSet<NSManagedObject> getRegisteredObjects();
    @Property(selector = "propagatesDeletesAtEndOfEvent")
    public native boolean propagatesDeletesAtEndOfEvent();
    @Property(selector = "setPropagatesDeletesAtEndOfEvent:")
    public native void setPropagatesDeletesAtEndOfEvent(boolean v);
    @Property(selector = "retainsRegisteredObjects")
    public native NSSet<NSManagedObject> getRetainsRegisteredObjects();
    @Property(selector = "setRetainsRegisteredObjects:")
    public native void setRetainsRegisteredObjects(NSSet<NSManagedObject> v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "shouldDeleteInaccessibleFaults")
    public native boolean shouldDeleteInaccessibleFaults();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setShouldDeleteInaccessibleFaults:")
    public native void setShouldDeleteInaccessibleFaults(boolean v);
    @Property(selector = "stalenessInterval")
    public native double getStalenessInterval();
    @Property(selector = "setStalenessInterval:")
    public native void setStalenessInterval(double v);
    @Property(selector = "mergePolicy")
    public native NSObject getMergePolicy();
    @Property(selector = "setMergePolicy:")
    public native void setMergePolicy(NSObject v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "queryGenerationToken")
    public native NSQueryGenerationToken getQueryGenerationToken();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "automaticallyMergesChangesFromParent")
    public native boolean automaticallyMergesChangesFromParent();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setAutomaticallyMergesChangesFromParent:")
    public native void setAutomaticallyMergesChangesFromParent(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "transactionAuthor")
    public native String getTransactionAuthor();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setTransactionAuthor:")
    public native void setTransactionAuthor(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void observeValue(String keyPath, NSObject object, NSKeyValueChangeInfo change) {}
    
    @Method(selector = "observeValueForKeyPath:ofObject:change:context:")
    private void observeValueForKeyPath(String keyPath, NSObject object, NSKeyValueChangeInfo change, VoidPtr context) {
        observeValue(keyPath, object, change);
    }
    /*<methods>*/
    @GlobalValue(symbol="NSManagedObjectContextWillSaveNotification", optional=true)
    public static native NSString WillSaveNotification();
    @GlobalValue(symbol="NSManagedObjectContextDidSaveNotification", optional=true)
    public static native NSString DidSaveNotification();
    @GlobalValue(symbol="NSManagedObjectContextObjectsDidChangeNotification", optional=true)
    public static native NSString ObjectsDidChangeNotification();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @GlobalValue(symbol="NSManagedObjectContextDidSaveObjectIDsNotification", optional=true)
    public static native NSString DidSaveObjectIDsNotification();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @GlobalValue(symbol="NSManagedObjectContextDidMergeChangesObjectIDsNotification", optional=true)
    public static native NSString DidMergeChangesObjectIDsNotification();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="NSManagedObjectContextQueryGenerationKey", optional=true)
    public static native NSString QueryGenerationKey();
    
    @Method(selector = "initWithConcurrencyType:")
    protected native @Pointer long init(NSManagedObjectContextConcurrencyType ct);
    @Method(selector = "performBlock:")
    public native void performBlock(@Block Runnable block);
    @Method(selector = "performBlockAndWait:")
    public native void performBlockAndWait(@Block Runnable block);
    @Method(selector = "objectRegisteredForID:")
    public native NSManagedObject getObjectRegisteredForID(NSManagedObjectID objectID);
    @Method(selector = "objectWithID:")
    public native NSManagedObject getObjectWithId(NSManagedObjectID objectID);
    public NSManagedObject getExistingObjectWithID(NSManagedObjectID objectID) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSManagedObject result = getExistingObjectWithID(objectID, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "existingObjectWithID:error:")
    private native NSManagedObject getExistingObjectWithID(NSManagedObjectID objectID, NSError.NSErrorPtr error);
    public NSArray<NSManagedObject> executeFetchRequest(NSFetchRequest request) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSArray<NSManagedObject> result = executeFetchRequest(request, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "executeFetchRequest:error:")
    private native NSArray<NSManagedObject> executeFetchRequest(NSFetchRequest request, NSError.NSErrorPtr error);
    public @MachineSizedUInt long getCountForFetchRequest(NSFetchRequest request) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long result = getCountForFetchRequest(request, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "countForFetchRequest:error:")
    private native @MachineSizedUInt long getCountForFetchRequest(NSFetchRequest request, NSError.NSErrorPtr error);
    public NSPersistentStoreResult executeRequest(NSPersistentStoreRequest request) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSPersistentStoreResult result = executeRequest(request, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "executeRequest:error:")
    private native NSPersistentStoreResult executeRequest(NSPersistentStoreRequest request, NSError.NSErrorPtr error);
    @Method(selector = "insertObject:")
    public native void insertObject(NSManagedObject object);
    @Method(selector = "deleteObject:")
    public native void deleteObject(NSManagedObject object);
    @Method(selector = "refreshObject:mergeChanges:")
    public native void refreshObject(NSManagedObject object, boolean flag);
    @Method(selector = "detectConflictsForObject:")
    public native void detectConflicts(NSManagedObject object);
    @Method(selector = "processPendingChanges")
    public native void processPendingChanges();
    @Method(selector = "assignObject:toPersistentStore:")
    public native void assignObjectToPersistentStore(NSObject object, NSPersistentStore store);
    @Method(selector = "undo")
    public native void undo();
    @Method(selector = "redo")
    public native void redo();
    @Method(selector = "reset")
    public native void reset();
    @Method(selector = "rollback")
    public native void rollback();
    public boolean save() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = save(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "save:")
    private native boolean save(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 8.3 and later.
     */
    @Method(selector = "refreshAllObjects")
    public native void refreshAllObjects();
    /**
     * @deprecated Deprecated in iOS 8.0. Use a queue style context and -performBlockAndWait: instead
     */
    @Deprecated
    @Method(selector = "lock")
    public native void lock();
    /**
     * @deprecated Deprecated in iOS 8.0. Use a queue style context and -performBlockAndWait: instead
     */
    @Deprecated
    @Method(selector = "unlock")
    public native void unlock();
    /**
     * @deprecated Deprecated in iOS 8.0. Use a queue style context and -performBlock: instead
     */
    @Deprecated
    @Method(selector = "tryLock")
    public native boolean tryLock();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "shouldHandleInaccessibleFault:forObjectID:triggeredByProperty:")
    public native boolean shouldHandleInaccessibleFault(NSManagedObject fault, NSManagedObjectID oid, NSPropertyDescription property);
    public boolean obtainPermanentIDsForObjects(NSArray<NSManagedObject> objects) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = obtainPermanentIDsForObjects(objects, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "obtainPermanentIDsForObjects:error:")
    private native boolean obtainPermanentIDsForObjects(NSArray<NSManagedObject> objects, NSError.NSErrorPtr error);
    @Method(selector = "mergeChangesFromContextDidSaveNotification:")
    public native void mergeChangesFromContextDidSaveNotification(NSNotification notification);
    /**
     * @since Available in iOS 10.0 and later.
     */
    public boolean setQueryGenerationFromToken(NSQueryGenerationToken generation) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setQueryGenerationFromToken(generation, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setQueryGenerationFromToken:error:")
    private native boolean setQueryGenerationFromToken(NSQueryGenerationToken generation, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "mergeChangesFromRemoteContextSave:intoContexts:")
    public static native void mergeChangesFromRemoteContextSave(NSDictionary<?, ?> changeNotificationData, NSArray<NSManagedObjectContext> contexts);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
