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
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTRDeviceControllerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "controller:statusUpdate:")
    void statusUpdate(MTRDeviceController controller, MTRCommissioningStatus status);
    @Method(selector = "controller:commissioningSessionEstablishmentDone:")
    void commissioningSessionEstablishmentDone(MTRDeviceController controller, NSError error);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 17.0. Please use controller:commissioningComplete:nodeID:
     */
    @Deprecated
    @Method(selector = "controller:commissioningComplete:")
    void commissioningComplete(MTRDeviceController controller, NSError error);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "controller:commissioningComplete:nodeID:")
    void commissioningComplete(MTRDeviceController controller, NSError error, NSNumber nodeID);
    /**
     * @since Available in iOS 17.6 and later.
     */
    @Method(selector = "controller:commissioningComplete:nodeID:metrics:")
    void commissioningComplete(MTRDeviceController controller, NSError error, NSNumber nodeID, MTRMetrics metrics);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "controller:readCommissioneeInfo:")
    void readCommissioneeInfo(MTRDeviceController controller, MTRCommissioneeInfo info);
    /**
     * @since Available in iOS 17.0 and later.
     * @deprecated Deprecated in iOS 18.4. Use controller:readCommissioneeInfo:
     */
    @Deprecated
    @Method(selector = "controller:readCommissioningInfo:")
    void readCommissioningInfo(MTRDeviceController controller, MTRProductIdentity info);
    /**
     * @since Available in iOS 18.2 and later.
     */
    @Method(selector = "controller:suspendedChangedTo:")
    void suspendedChanged(MTRDeviceController controller, boolean suspended);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "devicesChangedForController:")
    void devicesChangedForController(MTRDeviceController controller);
    /**
     * @since Available in iOS 18.5 and later.
     */
    @Method(selector = "controller:commissioneeHasReceivedNetworkCredentials:")
    void commissioneeHasReceivedNetworkCredentials(MTRDeviceController controller, NSNumber nodeID);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
