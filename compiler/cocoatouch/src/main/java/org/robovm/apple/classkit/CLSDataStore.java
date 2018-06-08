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
package org.robovm.apple.classkit;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ClassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLSDataStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLSDataStorePtr extends Ptr<CLSDataStore, CLSDataStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLSDataStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CLSDataStore() {}
    protected CLSDataStore(Handle h, long handle) { super(h, handle); }
    protected CLSDataStore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shared")
    public static native CLSDataStore getShared();
    @Property(selector = "mainAppContext")
    public native CLSContext getMainAppContext();
    @Property(selector = "activeContext")
    public native CLSContext getActiveContext();
    @Property(selector = "runningActivity")
    public native CLSActivity getRunningActivity();
    @Property(selector = "delegate")
    public native CLSDataStoreDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CLSDataStoreDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "saveWithCompletion:")
    public native void saveWithCompletion(@Block VoidBlock1<NSError> completion);
    @Method(selector = "contextsMatchingPredicate:completion:")
    public native void getContextsMatchingPredicate(NSPredicate predicate, @Block VoidBlock2<NSArray<CLSContext>, NSError> completion);
    @Method(selector = "contextsMatchingIdentifierPath:completion:")
    public native void getContextsMatchingIdentifier(NSArray<NSString> identifierPath, @Block VoidBlock2<NSArray<CLSContext>, NSError> completion);
    @Method(selector = "removeContext:")
    public native void removeContext(CLSContext context);
    /*</methods>*/
}
