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
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPersistentCloudKitContainer/*</name>*/ 
    extends /*<extends>*/NSPersistentContainer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSPersistentCloudKitContainerPtr extends Ptr<NSPersistentCloudKitContainer, NSPersistentCloudKitContainerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSPersistentCloudKitContainer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSPersistentCloudKitContainer() {}
    protected NSPersistentCloudKitContainer(Handle h, long handle) { super(h, handle); }
    protected NSPersistentCloudKitContainer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:")
    public NSPersistentCloudKitContainer(String name) { super(name); }
    @Method(selector = "initWithName:managedObjectModel:")
    public NSPersistentCloudKitContainer(String name, NSManagedObjectModel model) { super(name, model); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean initializeCloudKitSchema(NSPersistentCloudKitContainerSchemaInitializationOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = initializeCloudKitSchema(options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "initializeCloudKitSchemaWithOptions:error:")
    private native boolean initializeCloudKitSchema(NSPersistentCloudKitContainerSchemaInitializationOptions options, NSError.NSErrorPtr error);
    @Method(selector = "recordForManagedObjectID:")
    public native CKRecord recordForManagedObjectID(NSManagedObjectID managedObjectID);
    @Method(selector = "recordsForManagedObjectIDs:")
    public native NSDictionary<NSManagedObjectID, CKRecord> recordsForManagedObjectIDs(NSArray<NSManagedObjectID> managedObjectIDs);
    @Method(selector = "recordIDForManagedObjectID:")
    public native CKRecordID recordIDForManagedObjectID(NSManagedObjectID managedObjectID);
    @Method(selector = "recordIDsForManagedObjectIDs:")
    public native NSDictionary<NSManagedObjectID, CKRecordID> recordIDsForManagedObjectIDs(NSArray<NSManagedObjectID> managedObjectIDs);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "canUpdateRecordForManagedObjectWithID:")
    public native boolean canUpdateRecordForManagedObject(NSManagedObjectID objectID);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "canDeleteRecordForManagedObjectWithID:")
    public native boolean canDeleteRecordForManagedObject(NSManagedObjectID objectID);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "canModifyManagedObjectsInStore:")
    public native boolean canModifyManagedObjectsInStore(NSPersistentStore store);
    @Method(selector = "defaultDirectoryURL")
    public static native NSURL defaultDirectoryURL();
    /*</methods>*/
}
