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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSCustomMigrationStage/*</name>*/ 
    extends /*<extends>*/NSMigrationStage/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSCustomMigrationStagePtr extends Ptr<NSCustomMigrationStage, NSCustomMigrationStagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSCustomMigrationStage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSCustomMigrationStage() {}
    protected NSCustomMigrationStage(Handle h, long handle) { super(h, handle); }
    protected NSCustomMigrationStage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCurrentModelReference:nextModelReference:")
    public NSCustomMigrationStage(NSManagedObjectModelReference currentModel, NSManagedObjectModelReference nextModel) { super((SkipInit) null); initObject(init(currentModel, nextModel)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "currentModel")
    public native NSManagedObjectModelReference getCurrentModel();
    @Property(selector = "nextModel")
    public native NSManagedObjectModelReference getNextModel();
    @Property(selector = "willMigrateHandler")
    public native @Block Block3<NSStagedMigrationManager, NSCustomMigrationStage, NSError.NSErrorPtr, Boolean> getWillMigrateHandler();
    @Property(selector = "setWillMigrateHandler:")
    public native void setWillMigrateHandler(@Block Block3<NSStagedMigrationManager, NSCustomMigrationStage, NSError.NSErrorPtr, Boolean> v);
    @Property(selector = "didMigrateHandler")
    public native @Block Block3<NSStagedMigrationManager, NSCustomMigrationStage, NSError.NSErrorPtr, Boolean> getDidMigrateHandler();
    @Property(selector = "setDidMigrateHandler:")
    public native void setDidMigrateHandler(@Block Block3<NSStagedMigrationManager, NSCustomMigrationStage, NSError.NSErrorPtr, Boolean> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCurrentModelReference:nextModelReference:")
    protected native @Pointer long init(NSManagedObjectModelReference currentModel, NSManagedObjectModelReference nextModel);
    /*</methods>*/
}
