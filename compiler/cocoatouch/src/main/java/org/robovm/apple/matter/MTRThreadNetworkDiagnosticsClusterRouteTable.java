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
 * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRThreadNetworkDiagnosticsClusterRouteTable/*</name>*/ 
    extends /*<extends>*/MTRThreadNetworkDiagnosticsClusterRouteTableStruct/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRThreadNetworkDiagnosticsClusterRouteTablePtr extends Ptr<MTRThreadNetworkDiagnosticsClusterRouteTable, MTRThreadNetworkDiagnosticsClusterRouteTablePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRThreadNetworkDiagnosticsClusterRouteTable.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRThreadNetworkDiagnosticsClusterRouteTable() {}
    protected MTRThreadNetworkDiagnosticsClusterRouteTable(Handle h, long handle) { super(h, handle); }
    protected MTRThreadNetworkDiagnosticsClusterRouteTable(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "extAddress")
    public native NSNumber getExtAddress();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "setExtAddress:")
    public native void setExtAddress(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "rloc16")
    public native NSNumber getRloc16();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "setRloc16:")
    public native void setRloc16(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "routerId")
    public native NSNumber getRouterId();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "setRouterId:")
    public native void setRouterId(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "nextHop")
    public native NSNumber getNextHop();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "setNextHop:")
    public native void setNextHop(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "pathCost")
    public native NSNumber getPathCost();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "setPathCost:")
    public native void setPathCost(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "lqiIn")
    public native NSNumber getLqiIn();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "setLqiIn:")
    public native void setLqiIn(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "lqiOut")
    public native NSNumber getLqiOut();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "setLqiOut:")
    public native void setLqiOut(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "age")
    public native NSNumber getAge();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "setAge:")
    public native void setAge(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "allocated")
    public native NSNumber getAllocated();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "setAllocated:")
    public native void setAllocated(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "linkEstablished")
    public native NSNumber getLinkEstablished();
    /**
     * @since Available in iOS 16.1 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Deprecated
    @Property(selector = "setLinkEstablished:")
    public native void setLinkEstablished(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
