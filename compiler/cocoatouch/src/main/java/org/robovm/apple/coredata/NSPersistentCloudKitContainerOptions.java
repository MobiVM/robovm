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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPersistentCloudKitContainerOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSPersistentCloudKitContainerOptionsPtr extends Ptr<NSPersistentCloudKitContainerOptions, NSPersistentCloudKitContainerOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSPersistentCloudKitContainerOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSPersistentCloudKitContainerOptions() {}
    protected NSPersistentCloudKitContainerOptions(Handle h, long handle) { super(h, handle); }
    protected NSPersistentCloudKitContainerOptions(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithContainerIdentifier:")
    public NSPersistentCloudKitContainerOptions(String containerIdentifier) { super((SkipInit) null); initObject(init(containerIdentifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "containerIdentifier")
    public native String getContainerIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContainerIdentifier:")
    protected native @Pointer long init(String containerIdentifier);
    /*</methods>*/
}
