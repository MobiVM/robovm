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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRCommissioningDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTRCommissioningDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("commissioning:readCommissioneeInfo:")
    public void readCommissioneeInfo(MTRCommissioningOperation commissioning, MTRCommissioneeInfo info) {}
    @NotImplemented("commissioning:completedDeviceAttestation:error:completion:")
    public void completedDeviceAttestation(MTRCommissioningOperation commissioning, MTRDeviceAttestationDeviceInfo attestationDeviceInfo, NSError error, @Block Runnable completion) {}
    @NotImplemented("commissioning:needsWiFiCredentialsWithScanResults:error:completion:")
    public void needsWiFiCredentials(MTRCommissioningOperation commissioning, NSArray<MTRNetworkCommissioningClusterWiFiInterfaceScanResultStruct> networks, NSError error, @Block VoidBlock2<NSData, NSData> completion) {}
    @NotImplemented("commissioning:needsThreadCredentialsWithScanResults:error:completion:")
    public void needsThreadCredentials(MTRCommissioningOperation commissioning, NSArray<MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct> networks, NSError error, @Block VoidBlock1<NSData> completion) {}
    @NotImplemented("commissioningStartingNetworkScan:")
    public void commissioningStartingNetworkScan(MTRCommissioningOperation commissioning) {}
    @NotImplemented("commissioningProvisionedNetworkCredentials:")
    public void commissioningProvisionedNetworkCredentials(MTRCommissioningOperation commissioning) {}
    @NotImplemented("commissioning:failedWithError:metrics:")
    public void failed(MTRCommissioningOperation commissioning, NSError error, MTRMetrics metrics) {}
    @NotImplemented("commissioning:succeededForNodeID:metrics:")
    public void succeededForNodeID(MTRCommissioningOperation commissioning, NSNumber nodeID, MTRMetrics metrics) {}
    /*</methods>*/
}
