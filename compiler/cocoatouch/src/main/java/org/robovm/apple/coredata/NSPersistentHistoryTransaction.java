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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPersistentHistoryTransaction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSPersistentHistoryTransactionPtr extends Ptr<NSPersistentHistoryTransaction, NSPersistentHistoryTransactionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSPersistentHistoryTransaction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSPersistentHistoryTransaction() {}
    protected NSPersistentHistoryTransaction(Handle h, long handle) { super(h, handle); }
    protected NSPersistentHistoryTransaction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "timestamp")
    public native NSDate getTimestamp();
    @Property(selector = "changes")
    public native NSArray<NSPersistentHistoryChange> getChanges();
    @Property(selector = "transactionNumber")
    public native long getTransactionNumber();
    @Property(selector = "storeID")
    public native String getStoreID();
    @Property(selector = "bundleID")
    public native String getBundleID();
    @Property(selector = "processID")
    public native String getProcessID();
    @Property(selector = "contextName")
    public native String getContextName();
    @Property(selector = "author")
    public native String getAuthor();
    @Property(selector = "token")
    public native NSPersistentHistoryToken getToken();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "objectIDNotification")
    public native NSNotification objectIDNotification();
    /*</methods>*/
}
