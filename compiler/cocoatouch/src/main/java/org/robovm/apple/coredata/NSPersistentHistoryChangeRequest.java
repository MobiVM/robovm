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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPersistentHistoryChangeRequest/*</name>*/ 
    extends /*<extends>*/NSPersistentStoreRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSPersistentHistoryChangeRequestPtr extends Ptr<NSPersistentHistoryChangeRequest, NSPersistentHistoryChangeRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSPersistentHistoryChangeRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSPersistentHistoryChangeRequest() {}
    protected NSPersistentHistoryChangeRequest(Handle h, long handle) { super(h, handle); }
    protected NSPersistentHistoryChangeRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "resultType")
    public native NSPersistentHistoryResultType getResultType();
    @Property(selector = "setResultType:")
    public native void setResultType(NSPersistentHistoryResultType v);
    @Property(selector = "token")
    public native NSPersistentHistoryToken getToken();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fetchHistoryAfterDate:")
    public static native NSPersistentHistoryChangeRequest fetchHistoryAfterDate(NSDate date);
    @Method(selector = "fetchHistoryAfterToken:")
    public static native NSPersistentHistoryChangeRequest fetchHistoryAfterToken(NSPersistentHistoryToken token);
    @Method(selector = "fetchHistoryAfterTransaction:")
    public static native NSPersistentHistoryChangeRequest fetchHistoryAfterTransaction(NSPersistentHistoryTransaction transaction);
    @Method(selector = "deleteHistoryBeforeDate:")
    public static native NSPersistentHistoryChangeRequest deleteHistoryBeforeDate(NSDate date);
    @Method(selector = "deleteHistoryBeforeToken:")
    public static native NSPersistentHistoryChangeRequest deleteHistoryBeforeToken(NSPersistentHistoryToken token);
    @Method(selector = "deleteHistoryBeforeTransaction:")
    public static native NSPersistentHistoryChangeRequest deleteHistoryBeforeTransaction(NSPersistentHistoryTransaction transaction);
    /*</methods>*/
}
