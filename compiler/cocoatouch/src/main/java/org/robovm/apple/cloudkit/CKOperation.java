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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKOperation/*</name>*/ 
    extends /*<extends>*/NSOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKOperationPtr extends Ptr<CKOperation, CKOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKOperation() {}
    protected CKOperation(Handle h, long handle) { super(h, handle); }
    protected CKOperation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "container")
    public native CKContainer getContainer();
    @Property(selector = "setContainer:")
    public native void setContainer(CKContainer v);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Property(selector = "usesBackgroundSession")
    public native boolean usesBackgroundSession();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Property(selector = "setUsesBackgroundSession:")
    public native void setUsesBackgroundSession(boolean v);
    @Property(selector = "allowsCellularAccess")
    public native boolean allowsCellularAccess();
    @Property(selector = "setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean v);
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Property(selector = "operationID")
    public native String getOperationID();
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Property(selector = "isLongLived")
    public native boolean isLongLived();
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Property(selector = "setLongLived:")
    public native void setLongLived(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "timeoutIntervalForRequest")
    public native double getTimeoutIntervalForRequest();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setTimeoutIntervalForRequest:")
    public native void setTimeoutIntervalForRequest(double v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "timeoutIntervalForResource")
    public native double getTimeoutIntervalForResource();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setTimeoutIntervalForResource:")
    public native void setTimeoutIntervalForResource(double v);
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Property(selector = "longLivedOperationWasPersistedBlock")
    public native @Block Runnable getLongLivedOperationWasPersistedBlock();
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Property(selector = "setLongLivedOperationWasPersistedBlock:")
    public native void setLongLivedOperationWasPersistedBlock(@Block Runnable v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
