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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKSyncEngineSendChangesOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKSyncEngineSendChangesOptionsPtr extends Ptr<CKSyncEngineSendChangesOptions, CKSyncEngineSendChangesOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKSyncEngineSendChangesOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKSyncEngineSendChangesOptions() {}
    protected CKSyncEngineSendChangesOptions(Handle h, long handle) { super(h, handle); }
    protected CKSyncEngineSendChangesOptions(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithScope:")
    public CKSyncEngineSendChangesOptions(CKSyncEngineSendChangesScope scope) { super((SkipInit) null); initObject(init(scope)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "scope")
    public native CKSyncEngineSendChangesScope getScope();
    @Property(selector = "setScope:")
    public native void setScope(CKSyncEngineSendChangesScope v);
    @Property(selector = "operationGroup")
    public native CKOperationGroup getOperationGroup();
    @Property(selector = "setOperationGroup:")
    public native void setOperationGroup(CKOperationGroup v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithScope:")
    protected native @Pointer long init(CKSyncEngineSendChangesScope scope);
    /*</methods>*/
}
