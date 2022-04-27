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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPersistentCloudKitContainerEventRequest/*</name>*/ 
    extends /*<extends>*/NSPersistentStoreRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSPersistentCloudKitContainerEventRequestPtr extends Ptr<NSPersistentCloudKitContainerEventRequest, NSPersistentCloudKitContainerEventRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSPersistentCloudKitContainerEventRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSPersistentCloudKitContainerEventRequest() {}
    protected NSPersistentCloudKitContainerEventRequest(Handle h, long handle) { super(h, handle); }
    protected NSPersistentCloudKitContainerEventRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "resultType")
    public native NSPersistentCloudKitContainerEventResultType getResultType();
    @Property(selector = "setResultType:")
    public native void setResultType(NSPersistentCloudKitContainerEventResultType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fetchEventsAfterDate:")
    public static native NSPersistentCloudKitContainerEventRequest fetchEventsAfterDate(NSDate date);
    @Method(selector = "fetchEventsAfterEvent:")
    public static native NSPersistentCloudKitContainerEventRequest fetchEventsAfterEvent(NSPersistentCloudKitContainerEvent event);
    @Method(selector = "fetchEventsMatchingFetchRequest:")
    public static native NSPersistentCloudKitContainerEventRequest fetchEventsMatchingFetchRequest(NSFetchRequest fetchRequest);
    @Method(selector = "fetchRequestForEvents")
    public static native NSFetchRequest fetchRequestForEvents();
    /*</methods>*/
}
