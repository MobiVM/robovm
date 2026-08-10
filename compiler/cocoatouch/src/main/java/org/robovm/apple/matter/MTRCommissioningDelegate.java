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
 * @since Available in iOS 26.2 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTRCommissioningDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "commissioning:readCommissioneeInfo:")
    void readCommissioneeInfo(MTRCommissioningOperation commissioning, MTRCommissioneeInfo info);
    @Method(selector = "commissioning:completedDeviceAttestation:error:completion:")
    void completedDeviceAttestation(MTRCommissioningOperation commissioning, MTRDeviceAttestationDeviceInfo attestationDeviceInfo, NSError error, @Block Runnable completion);
    @Method(selector = "commissioning:needsWiFiCredentialsWithScanResults:error:completion:")
    void needsWiFiCredentials(MTRCommissioningOperation commissioning, NSArray<MTRNetworkCommissioningClusterWiFiInterfaceScanResultStruct> networks, NSError error, @Block VoidBlock2<NSData, NSData> completion);
    @Method(selector = "commissioning:needsThreadCredentialsWithScanResults:error:completion:")
    void needsThreadCredentials(MTRCommissioningOperation commissioning, NSArray<MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct> networks, NSError error, @Block VoidBlock1<NSData> completion);
    @Method(selector = "commissioningStartingNetworkScan:")
    void commissioningStartingNetworkScan(MTRCommissioningOperation commissioning);
    @Method(selector = "commissioningProvisionedNetworkCredentials:")
    void commissioningProvisionedNetworkCredentials(MTRCommissioningOperation commissioning);
    @Method(selector = "commissioning:failedWithError:metrics:")
    void failed(MTRCommissioningOperation commissioning, NSError error, MTRMetrics metrics);
    @Method(selector = "commissioning:succeededForNodeID:metrics:")
    void succeededForNodeID(MTRCommissioningOperation commissioning, NSNumber nodeID, MTRMetrics metrics);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
