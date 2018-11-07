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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPersistentContainer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSPersistentContainerPtr extends Ptr<NSPersistentContainer, NSPersistentContainerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSPersistentContainer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSPersistentContainer() {}
    protected NSPersistentContainer(Handle h, long handle) { super(h, handle); }
    protected NSPersistentContainer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:")
    public NSPersistentContainer(String name) { super((SkipInit) null); initObject(init(name)); }
    @Method(selector = "initWithName:managedObjectModel:")
    public NSPersistentContainer(String name, NSManagedObjectModel model) { super((SkipInit) null); initObject(init(name, model)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "viewContext")
    public native NSManagedObjectContext getViewContext();
    @Property(selector = "managedObjectModel")
    public native NSManagedObjectModel getManagedObjectModel();
    @Property(selector = "persistentStoreCoordinator")
    public native NSPersistentStoreCoordinator getPersistentStoreCoordinator();
    @Property(selector = "persistentStoreDescriptions")
    public native NSArray<NSPersistentStoreDescription> getPersistentStoreDescriptions();
    @Property(selector = "setPersistentStoreDescriptions:")
    public native void setPersistentStoreDescriptions(NSArray<NSPersistentStoreDescription> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:")
    protected native @Pointer long init(String name);
    @Method(selector = "initWithName:managedObjectModel:")
    protected native @Pointer long init(String name, NSManagedObjectModel model);
    @Method(selector = "loadPersistentStoresWithCompletionHandler:")
    public native void loadPersistentStores(@Block VoidBlock2<NSPersistentStoreDescription, NSError> block);
    @Method(selector = "newBackgroundContext")
    public native NSManagedObjectContext newBackgroundContext();
    @Method(selector = "performBackgroundTask:")
    public native void performBackgroundTask(@Block VoidBlock1<NSManagedObjectContext> block);
    @Method(selector = "defaultDirectoryURL")
    public static native NSURL defaultDirectoryURL();
    /*</methods>*/
}
