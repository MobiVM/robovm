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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTROTAProviderDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "handleQueryImageForNodeID:controller:params:completion:")
    void handleQueryImage(NSNumber nodeID, MTRDeviceController controller, MTROTASoftwareUpdateProviderClusterQueryImageParams params, @Block VoidBlock2<MTROTASoftwareUpdateProviderClusterQueryImageResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "handleApplyUpdateRequestForNodeID:controller:params:completion:")
    void handleApplyUpdateRequest(NSNumber nodeID, MTRDeviceController controller, MTROTASoftwareUpdateProviderClusterApplyUpdateRequestParams params, @Block VoidBlock2<MTROTASoftwareUpdateProviderClusterApplyUpdateResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "handleNotifyUpdateAppliedForNodeID:controller:params:completion:")
    void handleNotifyUpdateApplied(NSNumber nodeID, MTRDeviceController controller, MTROTASoftwareUpdateProviderClusterNotifyUpdateAppliedParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "handleBDXTransferSessionBeginForNodeID:controller:fileDesignator:offset:completion:")
    void handleBDXTransferSessionBegin(NSNumber nodeID, MTRDeviceController controller, String fileDesignator, NSNumber offset, @Block VoidBlock1<NSError> completion);
    @Method(selector = "handleBDXTransferSessionEndForNodeID:controller:error:")
    void handleBDXTransferSessionEnd(NSNumber nodeID, MTRDeviceController controller, NSError error);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "handleBDXQueryForNodeID:controller:blockSize:blockIndex:bytesToSkip:completion:")
    void handleBDXQuery(NSNumber nodeID, MTRDeviceController controller, NSNumber blockSize, NSNumber blockIndex, NSNumber bytesToSkip, @Block VoidBlock2<NSData, Boolean> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
