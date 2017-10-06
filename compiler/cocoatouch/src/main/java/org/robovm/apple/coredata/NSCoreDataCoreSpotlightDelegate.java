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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSCoreDataCoreSpotlightDelegate/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSCoreDataCoreSpotlightDelegatePtr extends Ptr<NSCoreDataCoreSpotlightDelegate, NSCoreDataCoreSpotlightDelegatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSCoreDataCoreSpotlightDelegate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSCoreDataCoreSpotlightDelegate() {}
    protected NSCoreDataCoreSpotlightDelegate(Handle h, long handle) { super(h, handle); }
    protected NSCoreDataCoreSpotlightDelegate(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initForStoreWithDescription:model:")
    public NSCoreDataCoreSpotlightDelegate(NSPersistentStoreDescription description, NSManagedObjectModel model) { super((SkipInit) null); initObject(init(description, model)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "domainIdentifier")
    public native String domainIdentifier();
    @Method(selector = "indexName")
    public native String indexName();
    @Method(selector = "initForStoreWithDescription:model:")
    protected native @Pointer long init(NSPersistentStoreDescription description, NSManagedObjectModel model);
    @Method(selector = "attributeSetForObject:")
    public native CSSearchableItemAttributeSet attributeSetForObject(NSManagedObject object);
    @Method(selector = "searchableIndex:reindexAllSearchableItemsWithAcknowledgementHandler:")
    public native void reindexAllSearchableItems(CSSearchableIndex searchableIndex, @Block Runnable acknowledgementHandler);
    @Method(selector = "searchableIndex:reindexSearchableItemsWithIdentifiers:acknowledgementHandler:")
    public native void reindexSearchableItems(CSSearchableIndex searchableIndex, NSArray<NSString> identifiers, @Block Runnable acknowledgementHandler);
    /*</methods>*/
}
