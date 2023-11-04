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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponentsPtr extends Ptr<MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents, MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponentsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents() {}
    protected MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents(Handle h, long handle) { super(h, handle); }
    protected MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "activeTimestampPresent")
    public native NSNumber getActiveTimestampPresent();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setActiveTimestampPresent:")
    public native void setActiveTimestampPresent(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "pendingTimestampPresent")
    public native NSNumber getPendingTimestampPresent();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setPendingTimestampPresent:")
    public native void setPendingTimestampPresent(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "masterKeyPresent")
    public native NSNumber getMasterKeyPresent();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setMasterKeyPresent:")
    public native void setMasterKeyPresent(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "networkNamePresent")
    public native NSNumber getNetworkNamePresent();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setNetworkNamePresent:")
    public native void setNetworkNamePresent(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "extendedPanIdPresent")
    public native NSNumber getExtendedPanIdPresent();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setExtendedPanIdPresent:")
    public native void setExtendedPanIdPresent(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "meshLocalPrefixPresent")
    public native NSNumber getMeshLocalPrefixPresent();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setMeshLocalPrefixPresent:")
    public native void setMeshLocalPrefixPresent(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "delayPresent")
    public native NSNumber getDelayPresent();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setDelayPresent:")
    public native void setDelayPresent(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "panIdPresent")
    public native NSNumber getPanIdPresent();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setPanIdPresent:")
    public native void setPanIdPresent(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "channelPresent")
    public native NSNumber getChannelPresent();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setChannelPresent:")
    public native void setChannelPresent(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "pskcPresent")
    public native NSNumber getPskcPresent();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setPskcPresent:")
    public native void setPskcPresent(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "securityPolicyPresent")
    public native NSNumber getSecurityPolicyPresent();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setSecurityPolicyPresent:")
    public native void setSecurityPolicyPresent(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "channelMaskPresent")
    public native NSNumber getChannelMaskPresent();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setChannelMaskPresent:")
    public native void setChannelMaskPresent(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
