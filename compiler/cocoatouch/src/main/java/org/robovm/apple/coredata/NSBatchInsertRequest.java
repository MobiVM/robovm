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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSBatchInsertRequest/*</name>*/ 
    extends /*<extends>*/NSPersistentStoreRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSBatchInsertRequestPtr extends Ptr<NSBatchInsertRequest, NSBatchInsertRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSBatchInsertRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSBatchInsertRequest() {}
    protected NSBatchInsertRequest(Handle h, long handle) { super(h, handle); }
    protected NSBatchInsertRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEntityName:objects:")
    public NSBatchInsertRequest(String entityName, NSArray<?> dictionaries) { super((SkipInit) null); initObject(init(entityName, dictionaries)); }
    @Method(selector = "initWithEntity:objects:")
    public NSBatchInsertRequest(NSEntityDescription entity, NSArray<?> dictionaries) { super((SkipInit) null); initObject(init(entity, dictionaries)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "entityName")
    public native String getEntityName();
    @Property(selector = "entity")
    public native NSEntityDescription getEntity();
    @Property(selector = "objectsToInsert")
    public native NSArray<?> getObjectsToInsert();
    @Property(selector = "setObjectsToInsert:")
    public native void setObjectsToInsert(NSArray<?> v);
    @Property(selector = "resultType")
    public native NSBatchInsertRequestResultType getResultType();
    @Property(selector = "setResultType:")
    public native void setResultType(NSBatchInsertRequestResultType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEntityName:objects:")
    protected native @Pointer long init(String entityName, NSArray<?> dictionaries);
    @Method(selector = "initWithEntity:objects:")
    protected native @Pointer long init(NSEntityDescription entity, NSArray<?> dictionaries);
    /*</methods>*/
}
