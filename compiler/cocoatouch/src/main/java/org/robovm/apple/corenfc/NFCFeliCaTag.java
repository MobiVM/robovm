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
package org.robovm.apple.corenfc;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/NFCFeliCaTag/*</name>*/ 
    /*<implements>*/extends NFCTag, NFCNDEFTag/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "currentSystemCode")
    NSData getCurrentSystemCode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "currentIDm")
    NSData getCurrentIDm();
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "pollingWithSystemCode:requestCode:timeSlot:completionHandler:")
    void pollingUsingSystemCode(NSData systemCode, PollingRequestCode requestCode, PollingTimeSlot timeSlot, @Block VoidBlock3<NSData, NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestServiceWithNodeCodeList:completionHandler:")
    void requestService(NSArray<NSData> nodeCodeList, @Block VoidBlock2<NSArray<NSData>, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestResponseWithCompletionHandler:")
    void requestResponse(@Block("(@MachineSizedSInt,)") VoidBlock2<Long, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "readWithoutEncryptionWithServiceCodeList:blockList:completionHandler:")
    void readWithoutEncryption(NSArray<NSData> serviceCodeList, NSArray<NSData> blockList, @Block("(@MachineSizedSInt,@MachineSizedSInt,,)") VoidBlock4<Long, Long, NSArray<NSData>, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "writeWithoutEncryptionWithServiceCodeList:blockList:blockData:completionHandler:")
    void writeWithoutEncryption(NSArray<NSData> serviceCodeList, NSArray<NSData> blockList, NSArray<NSData> blockData, @Block("(@MachineSizedSInt,@MachineSizedSInt,)") VoidBlock3<Long, Long, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestSystemCodeWithCompletionHandler:")
    void requestSystemCode(@Block VoidBlock2<NSArray<NSData>, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestServiceV2WithNodeCodeList:completionHandler:")
    void requestServiceV2(NSArray<NSData> nodeCodeList, @Block("(@MachineSizedSInt,@MachineSizedSInt,,,,)") VoidBlock6<Long, Long, EncryptionId, NSArray<NSData>, NSArray<NSData>, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestSpecificationVersionWithCompletionHandler:")
    void requestSpecificationVersion(@Block("(@MachineSizedSInt,@MachineSizedSInt,,,)") VoidBlock5<Long, Long, NSData, NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resetModeWithCompletionHandler:")
    void resetMode(@Block("(@MachineSizedSInt,@MachineSizedSInt,)") VoidBlock3<Long, Long, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "sendFeliCaCommandPacket:completionHandler:")
    void sendFeliCaCommandPacket(NSData commandPacket, @Block VoidBlock2<NSData, NSError> completionHandler);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
