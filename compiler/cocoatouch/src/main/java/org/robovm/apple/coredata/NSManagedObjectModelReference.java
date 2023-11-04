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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSManagedObjectModelReference/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSManagedObjectModelReferencePtr extends Ptr<NSManagedObjectModelReference, NSManagedObjectModelReferencePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSManagedObjectModelReference.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSManagedObjectModelReference() {}
    protected NSManagedObjectModelReference(Handle h, long handle) { super(h, handle); }
    protected NSManagedObjectModelReference(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithModel:versionChecksum:")
    public NSManagedObjectModelReference(NSManagedObjectModel model, String versionChecksum) { super((SkipInit) null); initObject(init(model, versionChecksum)); }
    @Method(selector = "initWithFileURL:versionChecksum:")
    public NSManagedObjectModelReference(NSURL fileURL, String versionChecksum) { super((SkipInit) null); initObject(init(fileURL, versionChecksum)); }
    @Method(selector = "initWithEntityVersionHashes:inBundle:versionChecksum:")
    public NSManagedObjectModelReference(NSDictionary<?, ?> versionHash, NSBundle bundle, String versionChecksum) { super((SkipInit) null); initObject(init(versionHash, bundle, versionChecksum)); }
    @Method(selector = "initWithName:inBundle:versionChecksum:")
    public NSManagedObjectModelReference(String modelName, NSBundle bundle, String versionChecksum) { super((SkipInit) null); initObject(init(modelName, bundle, versionChecksum)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "resolvedModel")
    public native NSManagedObjectModel getResolvedModel();
    @Property(selector = "versionChecksum")
    public native String getVersionChecksum();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithModel:versionChecksum:")
    protected native @Pointer long init(NSManagedObjectModel model, String versionChecksum);
    @Method(selector = "initWithFileURL:versionChecksum:")
    protected native @Pointer long init(NSURL fileURL, String versionChecksum);
    @Method(selector = "initWithEntityVersionHashes:inBundle:versionChecksum:")
    protected native @Pointer long init(NSDictionary<?, ?> versionHash, NSBundle bundle, String versionChecksum);
    @Method(selector = "initWithName:inBundle:versionChecksum:")
    protected native @Pointer long init(String modelName, NSBundle bundle, String versionChecksum);
    /*</methods>*/
}
