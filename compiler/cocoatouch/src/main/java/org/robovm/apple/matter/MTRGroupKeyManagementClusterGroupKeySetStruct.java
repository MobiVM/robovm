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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRGroupKeyManagementClusterGroupKeySetStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRGroupKeyManagementClusterGroupKeySetStructPtr extends Ptr<MTRGroupKeyManagementClusterGroupKeySetStruct, MTRGroupKeyManagementClusterGroupKeySetStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRGroupKeyManagementClusterGroupKeySetStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRGroupKeyManagementClusterGroupKeySetStruct() {}
    protected MTRGroupKeyManagementClusterGroupKeySetStruct(Handle h, long handle) { super(h, handle); }
    protected MTRGroupKeyManagementClusterGroupKeySetStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "groupKeySetID")
    public native NSNumber getGroupKeySetID();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setGroupKeySetID:")
    public native void setGroupKeySetID(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "groupKeySecurityPolicy")
    public native NSNumber getGroupKeySecurityPolicy();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setGroupKeySecurityPolicy:")
    public native void setGroupKeySecurityPolicy(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "epochKey0")
    public native NSData getEpochKey0();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setEpochKey0:")
    public native void setEpochKey0(NSData v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "epochStartTime0")
    public native NSNumber getEpochStartTime0();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setEpochStartTime0:")
    public native void setEpochStartTime0(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "epochKey1")
    public native NSData getEpochKey1();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setEpochKey1:")
    public native void setEpochKey1(NSData v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "epochStartTime1")
    public native NSNumber getEpochStartTime1();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setEpochStartTime1:")
    public native void setEpochStartTime1(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "epochKey2")
    public native NSData getEpochKey2();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setEpochKey2:")
    public native void setEpochKey2(NSData v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "epochStartTime2")
    public native NSNumber getEpochStartTime2();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setEpochStartTime2:")
    public native void setEpochStartTime2(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
