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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRThreadNetworkDiagnosticsClusterNeighborTableStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRThreadNetworkDiagnosticsClusterNeighborTableStructPtr extends Ptr<MTRThreadNetworkDiagnosticsClusterNeighborTableStruct, MTRThreadNetworkDiagnosticsClusterNeighborTableStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRThreadNetworkDiagnosticsClusterNeighborTableStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRThreadNetworkDiagnosticsClusterNeighborTableStruct() {}
    protected MTRThreadNetworkDiagnosticsClusterNeighborTableStruct(Handle h, long handle) { super(h, handle); }
    protected MTRThreadNetworkDiagnosticsClusterNeighborTableStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "extAddress")
    public native NSNumber getExtAddress();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setExtAddress:")
    public native void setExtAddress(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "age")
    public native NSNumber getAge();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAge:")
    public native void setAge(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "rloc16")
    public native NSNumber getRloc16();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setRloc16:")
    public native void setRloc16(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "linkFrameCounter")
    public native NSNumber getLinkFrameCounter();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setLinkFrameCounter:")
    public native void setLinkFrameCounter(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "mleFrameCounter")
    public native NSNumber getMleFrameCounter();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setMleFrameCounter:")
    public native void setMleFrameCounter(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "lqi")
    public native NSNumber getLqi();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setLqi:")
    public native void setLqi(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "averageRssi")
    public native NSNumber getAverageRssi();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setAverageRssi:")
    public native void setAverageRssi(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "lastRssi")
    public native NSNumber getLastRssi();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setLastRssi:")
    public native void setLastRssi(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "frameErrorRate")
    public native NSNumber getFrameErrorRate();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setFrameErrorRate:")
    public native void setFrameErrorRate(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "messageErrorRate")
    public native NSNumber getMessageErrorRate();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setMessageErrorRate:")
    public native void setMessageErrorRate(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "rxOnWhenIdle")
    public native NSNumber getRxOnWhenIdle();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setRxOnWhenIdle:")
    public native void setRxOnWhenIdle(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "fullThreadDevice")
    public native NSNumber getFullThreadDevice();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setFullThreadDevice:")
    public native void setFullThreadDevice(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "fullNetworkData")
    public native NSNumber getFullNetworkData();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setFullNetworkData:")
    public native void setFullNetworkData(NSNumber v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "isChild")
    public native NSNumber getIsChild();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setIsChild:")
    public native void setIsChild(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
