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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKSyncEngineConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKSyncEngineConfigurationPtr extends Ptr<CKSyncEngineConfiguration, CKSyncEngineConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKSyncEngineConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKSyncEngineConfiguration() {}
    protected CKSyncEngineConfiguration(Handle h, long handle) { super(h, handle); }
    protected CKSyncEngineConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDatabase:stateSerialization:delegate:")
    public CKSyncEngineConfiguration(CKDatabase database, CKSyncEngineStateSerialization stateSerialization, CKSyncEngineDelegate delegate) { super((SkipInit) null); initObject(init(database, stateSerialization, delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "database")
    public native CKDatabase getDatabase();
    @Property(selector = "setDatabase:")
    public native void setDatabase(CKDatabase v);
    @Property(selector = "stateSerialization")
    public native CKSyncEngineStateSerialization getStateSerialization();
    @Property(selector = "setStateSerialization:")
    public native void setStateSerialization(CKSyncEngineStateSerialization v);
    @Property(selector = "delegate")
    public native CKSyncEngineDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CKSyncEngineDelegate v);
    @Property(selector = "automaticallySync")
    public native boolean automaticallySync();
    @Property(selector = "setAutomaticallySync:")
    public native void setAutomaticallySync(boolean v);
    @Property(selector = "subscriptionID")
    public native String getSubscriptionID();
    @Property(selector = "setSubscriptionID:")
    public native void setSubscriptionID(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDatabase:stateSerialization:delegate:")
    protected native @Pointer long init(CKDatabase database, CKSyncEngineStateSerialization stateSerialization, CKSyncEngineDelegate delegate);
    /*</methods>*/
}
