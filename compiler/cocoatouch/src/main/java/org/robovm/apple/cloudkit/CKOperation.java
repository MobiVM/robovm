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
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "configuration")
    public native CKOperationConfiguration getConfiguration();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setConfiguration:")
    public native void setConfiguration(CKOperationConfiguration v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "group")
    public native CKOperationGroup getGroup();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setGroup:")
    public native void setGroup(CKOperationGroup v);
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Property(selector = "operationID")
    public native String getOperationID();
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
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use CKOperationConfiguration
     */
    @Deprecated
    @Property(selector = "container")
    public native CKContainer getContainer();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use CKOperationConfiguration
     */
    @Deprecated
    @Property(selector = "setContainer:")
    public native void setContainer(CKContainer v);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use CKOperationConfiguration
     */
    @Deprecated
    @Property(selector = "allowsCellularAccess")
    public native boolean allowsCellularAccess();
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use CKOperationConfiguration
     */
    @Deprecated
    @Property(selector = "setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean v);
    /**
     * @since Available in iOS 9.3 and later.
     * @deprecated Deprecated in iOS 11.0. Use CKOperationConfiguration
     */
    @Deprecated
    @Property(selector = "isLongLived")
    public native boolean isLongLived();
    /**
     * @since Available in iOS 9.3 and later.
     * @deprecated Deprecated in iOS 11.0. Use CKOperationConfiguration
     */
    @Deprecated
    @Property(selector = "setLongLived:")
    public native void setLongLived(boolean v);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use CKOperationConfiguration
     */
    @Deprecated
    @Property(selector = "timeoutIntervalForRequest")
    public native double getTimeoutIntervalForRequest();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use CKOperationConfiguration
     */
    @Deprecated
    @Property(selector = "setTimeoutIntervalForRequest:")
    public native void setTimeoutIntervalForRequest(double v);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use CKOperationConfiguration
     */
    @Deprecated
    @Property(selector = "timeoutIntervalForResource")
    public native double getTimeoutIntervalForResource();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use CKOperationConfiguration
     */
    @Deprecated
    @Property(selector = "setTimeoutIntervalForResource:")
    public native void setTimeoutIntervalForResource(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
