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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKSystemSharingUIObserver/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKSystemSharingUIObserverPtr extends Ptr<CKSystemSharingUIObserver, CKSystemSharingUIObserverPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKSystemSharingUIObserver.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CKSystemSharingUIObserver() {}
    protected CKSystemSharingUIObserver(Handle h, long handle) { super(h, handle); }
    protected CKSystemSharingUIObserver(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithContainer:")
    public CKSystemSharingUIObserver(CKContainer container) { super((SkipInit) null); initObject(init(container)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "systemSharingUIDidSaveShareBlock")
    public native @Block VoidBlock3<CKRecordID, CKShare, NSError> getSystemSharingUIDidSaveShareBlock();
    @Property(selector = "setSystemSharingUIDidSaveShareBlock:")
    public native void setSystemSharingUIDidSaveShareBlock(@Block VoidBlock3<CKRecordID, CKShare, NSError> v);
    @Property(selector = "systemSharingUIDidStopSharingBlock")
    public native @Block VoidBlock2<CKRecordID, NSError> getSystemSharingUIDidStopSharingBlock();
    @Property(selector = "setSystemSharingUIDidStopSharingBlock:")
    public native void setSystemSharingUIDidStopSharingBlock(@Block VoidBlock2<CKRecordID, NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContainer:")
    protected native @Pointer long init(CKContainer container);
    /*</methods>*/
}
