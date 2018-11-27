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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPersistentStoreDescription/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSPersistentStoreDescriptionPtr extends Ptr<NSPersistentStoreDescription, NSPersistentStoreDescriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSPersistentStoreDescription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSPersistentStoreDescription() {}
    protected NSPersistentStoreDescription(Handle h, long handle) { super(h, handle); }
    protected NSPersistentStoreDescription(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:")
    public NSPersistentStoreDescription(NSURL url) { super((SkipInit) null); initObject(init(url)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "setType:")
    public native void setType(String v);
    @Property(selector = "configuration")
    public native String getConfiguration();
    @Property(selector = "setConfiguration:")
    public native void setConfiguration(String v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "options")
    public native NSDictionary<NSString, ?> getOptions();
    @Property(selector = "isReadOnly")
    public native boolean isReadOnly();
    @Property(selector = "setReadOnly:")
    public native void setReadOnly(boolean v);
    @Property(selector = "timeout")
    public native double getTimeout();
    @Property(selector = "setTimeout:")
    public native void setTimeout(double v);
    @Property(selector = "sqlitePragmas")
    public native NSDictionary<NSString, ?> getSqlitePragmas();
    @Property(selector = "shouldAddStoreAsynchronously")
    public native boolean shouldAddStoreAsynchronously();
    @Property(selector = "setShouldAddStoreAsynchronously:")
    public native void setShouldAddStoreAsynchronously(boolean v);
    @Property(selector = "shouldMigrateStoreAutomatically")
    public native boolean shouldMigrateStoreAutomatically();
    @Property(selector = "setShouldMigrateStoreAutomatically:")
    public native void setShouldMigrateStoreAutomatically(boolean v);
    @Property(selector = "shouldInferMappingModelAutomatically")
    public native boolean shouldInferMappingModelAutomatically();
    @Property(selector = "setShouldInferMappingModelAutomatically:")
    public native void setShouldInferMappingModelAutomatically(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setOption:forKey:")
    public native void setOption(NSObject option, String key);
    @Method(selector = "setValue:forPragmaNamed:")
    public native void setValue(NSObject value, String name);
    @Method(selector = "initWithURL:")
    protected native @Pointer long init(NSURL url);
    /*</methods>*/
}
