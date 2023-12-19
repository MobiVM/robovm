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
package org.robovm.apple.cloudkit;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.fileprovider.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKSyncEngine/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKSyncEnginePtr extends Ptr<CKSyncEngine, CKSyncEnginePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKSyncEngine.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKSyncEngine() {}
    protected CKSyncEngine(Handle h, long handle) { super(h, handle); }
    protected CKSyncEngine(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConfiguration:")
    public CKSyncEngine(CKSyncEngineConfiguration configuration) { super((SkipInit) null); initObject(init(configuration)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "database")
    public native CKDatabase getDatabase();
    @Property(selector = "state")
    public native CKSyncEngineState getState();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConfiguration:")
    protected native @Pointer long init(CKSyncEngineConfiguration configuration);
    @Method(selector = "fetchChangesWithCompletionHandler:")
    public native void fetchChanges(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "fetchChangesWithOptions:completionHandler:")
    public native void fetchChanges(CKSyncEngineFetchChangesOptions options, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "sendChangesWithCompletionHandler:")
    public native void sendChanges(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "sendChangesWithOptions:completionHandler:")
    public native void sendChanges(CKSyncEngineSendChangesOptions options, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "cancelOperationsWithCompletionHandler:")
    public native void cancelOperations(@Block Runnable completionHandler);
    /*</methods>*/
}
