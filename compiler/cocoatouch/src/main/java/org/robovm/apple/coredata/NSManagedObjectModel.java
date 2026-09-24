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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSManagedObjectModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding, NSFastEnumeration/*</implements>*/ {

    /*<ptr>*/public static class NSManagedObjectModelPtr extends Ptr<NSManagedObjectModel, NSManagedObjectModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSManagedObjectModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSManagedObjectModel() {}
    protected NSManagedObjectModel(Handle h, long handle) { super(h, handle); }
    protected NSManagedObjectModel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithContentsOfURL:")
    public NSManagedObjectModel(NSURL url) { super((SkipInit) null); initObject(init(url)); }
    @Method(selector = "initWithCoder:")
    public NSManagedObjectModel(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "entitiesByName")
    public native NSDictionary<NSString, NSEntityDescription> getEntitiesByName();
    @Property(selector = "entities")
    public native NSArray<NSEntityDescription> getEntities();
    @Property(selector = "setEntities:")
    public native void setEntities(NSArray<NSEntityDescription> v);
    @Property(selector = "configurations")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getConfigurations();
    @Property(selector = "localizationDictionary")
    public native NSDictionary<NSString, NSString> getLocalizationDictionary();
    @Property(selector = "setLocalizationDictionary:")
    public native void setLocalizationDictionary(NSDictionary<NSString, NSString> v);
    @Property(selector = "fetchRequestTemplatesByName")
    public native NSDictionary<NSString, NSFetchRequest> getFetchRequestTemplatesByName();
    @Property(selector = "versionIdentifiers")
    public native NSSet<?> getVersionIdentifiers();
    @Property(selector = "setVersionIdentifiers:")
    public native void setVersionIdentifiers(NSSet<?> v);
    @Property(selector = "entityVersionHashesByName")
    public native NSDictionary<NSString, NSData> getEntityVersionHashesByName();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "versionChecksum")
    public native String getVersionChecksum();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContentsOfURL:")
    protected native @Pointer long init(NSURL url);
    @Method(selector = "entitiesForConfiguration:")
    public native NSArray<NSEntityDescription> getEntitiesForConfiguration(String configuration);
    @Method(selector = "setEntities:forConfiguration:")
    public native void setEntitiesForConfiguration(NSArray<NSEntityDescription> entities, String configuration);
    @Method(selector = "setFetchRequestTemplate:forName:")
    public native void setFetchRequestTemplate(NSFetchRequest fetchRequestTemplate, String name);
    @Method(selector = "fetchRequestTemplateForName:")
    public native NSFetchRequest getFetchRequestTemplate(String name);
    @Method(selector = "fetchRequestFromTemplateWithName:substitutionVariables:")
    public native NSFetchRequest getFetchRequestTemplate(String name, NSDictionary<NSString, ?> variables);
    @Method(selector = "isConfiguration:compatibleWithStoreMetadata:")
    public native boolean isConfigurationCompatibleWithStoreMetadata(String configuration, NSPersistentStoreMetadata metadata);
    @Method(selector = "mergedModelFromBundles:")
    public static native NSManagedObjectModel createFromBundles(NSArray<NSBundle> bundles);
    @Method(selector = "modelByMergingModels:")
    public static native NSManagedObjectModel createByMergingModels(NSArray<NSManagedObjectModel> models);
    @Method(selector = "mergedModelFromBundles:forStoreMetadata:")
    public static native NSManagedObjectModel createFromBundles(NSArray<NSBundle> bundles, NSPersistentStoreMetadata metadata);
    @Method(selector = "modelByMergingModels:forStoreMetadata:")
    public static native NSManagedObjectModel createByMergingModels(NSArray<NSManagedObjectModel> models, NSPersistentStoreMetadata metadata);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static NSDictionary<NSString, NSString> getChecksumsForVersionedModel(NSURL modelURL) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSDictionary<NSString, NSString> result = getChecksumsForVersionedModel(modelURL, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "checksumsForVersionedModelAtURL:error:")
    private static native NSDictionary<NSString, NSString> getChecksumsForVersionedModel(NSURL modelURL, NSError.NSErrorPtr error);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
