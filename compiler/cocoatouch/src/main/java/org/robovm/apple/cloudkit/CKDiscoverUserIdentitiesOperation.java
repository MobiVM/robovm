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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKDiscoverUserIdentitiesOperation/*</name>*/ 
    extends /*<extends>*/CKOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKDiscoverUserIdentitiesOperationPtr extends Ptr<CKDiscoverUserIdentitiesOperation, CKDiscoverUserIdentitiesOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKDiscoverUserIdentitiesOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKDiscoverUserIdentitiesOperation() {}
    protected CKDiscoverUserIdentitiesOperation(Handle h, long handle) { super(h, handle); }
    protected CKDiscoverUserIdentitiesOperation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUserIdentityLookupInfos:")
    public CKDiscoverUserIdentitiesOperation(NSArray<CKUserIdentityLookupInfo> userIdentityLookupInfos) { super((SkipInit) null); initObject(init(userIdentityLookupInfos)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userIdentityLookupInfos")
    public native NSArray<CKUserIdentityLookupInfo> getUserIdentityLookupInfos();
    @Property(selector = "setUserIdentityLookupInfos:")
    public native void setUserIdentityLookupInfos(NSArray<CKUserIdentityLookupInfo> v);
    @Property(selector = "userIdentityDiscoveredBlock")
    public native @Block VoidBlock2<CKUserIdentity, CKUserIdentityLookupInfo> getUserIdentityDiscoveredBlock();
    @Property(selector = "setUserIdentityDiscoveredBlock:")
    public native void setUserIdentityDiscoveredBlock(@Block VoidBlock2<CKUserIdentity, CKUserIdentityLookupInfo> v);
    @Property(selector = "discoverUserIdentitiesCompletionBlock")
    public native @Block VoidBlock1<NSError> getDiscoverUserIdentitiesCompletionBlock();
    @Property(selector = "setDiscoverUserIdentitiesCompletionBlock:")
    public native void setDiscoverUserIdentitiesCompletionBlock(@Block VoidBlock1<NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUserIdentityLookupInfos:")
    protected native @Pointer long init(NSArray<CKUserIdentityLookupInfo> userIdentityLookupInfos);
    /*</methods>*/
}
