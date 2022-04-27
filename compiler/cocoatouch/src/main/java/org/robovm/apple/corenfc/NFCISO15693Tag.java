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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/NFCISO15693Tag/*</name>*/ 
    /*<implements>*/extends NFCTag, NFCNDEFTag/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "identifier")
    NSData getIdentifier();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "icManufacturerCode")
    @MachineSizedUInt long getIcManufacturerCode();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "icSerialNumber")
    NSData getIcSerialNumber();
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "sendCustomCommandWithConfiguration:completionHandler:")
    void sendCustomCommand(NFCISO15693CustomCommandConfiguration commandConfiguration, @Block VoidBlock2<NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "readMultipleBlocksWithConfiguration:completionHandler:")
    void readMultipleBlocks(NFCISO15693ReadMultipleBlocksConfiguration readConfiguration, @Block VoidBlock2<NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "stayQuietWithCompletionHandler:")
    void stayQuiet(@Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "readSingleBlockWithRequestFlags:blockNumber:completionHandler:")
    void readSingleBlock(NFCISO15693RequestFlag flags, byte blockNumber, @Block VoidBlock2<NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "writeSingleBlockWithRequestFlags:blockNumber:dataBlock:completionHandler:")
    void writeSingleBlock(NFCISO15693RequestFlag flags, byte blockNumber, NSData dataBlock, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "lockBlockWithRequestFlags:blockNumber:completionHandler:")
    void lockBlock(NFCISO15693RequestFlag flags, byte blockNumber, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "readMultipleBlocksWithRequestFlags:blockRange:completionHandler:")
    void readMultipleBlocks(NFCISO15693RequestFlag flags, @ByVal NSRange blockRange, @Block VoidBlock2<NSArray<NSData>, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "writeMultipleBlocksWithRequestFlags:blockRange:dataBlocks:completionHandler:")
    void writeMultipleBlocks(NFCISO15693RequestFlag flags, @ByVal NSRange blockRange, NSArray<NSData> dataBlocks, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "selectWithRequestFlags:completionHandler:")
    void selectWithRequestFlags(NFCISO15693RequestFlag flags, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "resetToReadyWithRequestFlags:completionHandler:")
    void resetToReady(NFCISO15693RequestFlag flags, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "writeAFIWithRequestFlag:afi:completionHandler:")
    void writeAFI(NFCISO15693RequestFlag flags, byte afi, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "lockAFIWithRequestFlag:completionHandler:")
    void lockAFI(NFCISO15693RequestFlag flags, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "writeDSFIDWithRequestFlag:dsfid:completionHandler:")
    void writeDSFID(NFCISO15693RequestFlag flags, byte dsfid, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use lockDSFIDWithRequestFlag:completionHandler:
     */
    @Deprecated
    @Method(selector = "lockDFSIDWithRequestFlag:completionHandler:")
    void lockDFSID(NFCISO15693RequestFlag flags, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "lockDSFIDWithRequestFlag:completionHandler:")
    void lockDSFID(NFCISO15693RequestFlag flags, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use getSystemInfoAndUIDWithRequestFlag:completionHandler:
     */
    @Deprecated
    @Method(selector = "getSystemInfoWithRequestFlag:completionHandler:")
    void getSystemInfo(NFCISO15693RequestFlag flags, @Block("(@MachineSizedSInt,@MachineSizedSInt,@MachineSizedSInt,@MachineSizedSInt,@MachineSizedSInt,)") VoidBlock6<Long, Long, Long, Long, Long, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "getSystemInfoAndUIDWithRequestFlag:completionHandler:")
    void getSystemInfoAndUID(NFCISO15693RequestFlag flags,  ObjCBlock completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "getMultipleBlockSecurityStatusWithRequestFlag:blockRange:completionHandler:")
    void getMultipleBlockSecurityStatus(NFCISO15693RequestFlag flags, @ByVal NSRange blockRange, @Block VoidBlock2<NSArray<NSNumber>, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "fastReadMultipleBlocksWithRequestFlag:blockRange:completionHandler:")
    void fastReadMultipleBlocks(NFCISO15693RequestFlag flags, @ByVal NSRange blockRange, @Block VoidBlock2<NSArray<NSData>, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "customCommandWithRequestFlag:customCommandCode:customRequestParameters:completionHandler:")
    void customCommand(NFCISO15693RequestFlag flags, @MachineSizedSInt long customCommandCode, NSData customRequestParameters, @Block VoidBlock2<NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "extendedReadSingleBlockWithRequestFlags:blockNumber:completionHandler:")
    void extendedReadSingleBlock(NFCISO15693RequestFlag flags, @MachineSizedSInt long blockNumber, @Block VoidBlock2<NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "extendedWriteSingleBlockWithRequestFlags:blockNumber:dataBlock:completionHandler:")
    void extendedWriteSingleBlock(NFCISO15693RequestFlag flags, @MachineSizedSInt long blockNumber, NSData dataBlock, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "extendedLockBlockWithRequestFlags:blockNumber:completionHandler:")
    void extendedLockBlock(NFCISO15693RequestFlag flags, @MachineSizedSInt long blockNumber, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "extendedReadMultipleBlocksWithRequestFlags:blockRange:completionHandler:")
    void extendedReadMultipleBlocks(NFCISO15693RequestFlag flags, @ByVal NSRange blockRange, @Block VoidBlock2<NSArray<NSData>, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "extendedWriteMultipleBlocksWithRequestFlags:blockRange:dataBlocks:completionHandler:")
    void extendedWriteMultipleBlocks(NFCISO15693RequestFlag flags, @ByVal NSRange blockRange, NSArray<NSData> dataBlocks, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "authenticateWithRequestFlags:cryptoSuiteIdentifier:message:completionHandler:")
    void authenticate(NFCISO15693RequestFlag flags, @MachineSizedSInt long cryptoSuiteIdentifier, NSData message, @Block VoidBlock3<NFCISO15693ResponseFlag, NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "keyUpdateWithRequestFlags:keyIdentifier:message:completionHandler:")
    void keyUpdate(NFCISO15693RequestFlag flags, @MachineSizedSInt long keyIdentifier, NSData message, @Block VoidBlock3<NFCISO15693ResponseFlag, NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "challengeWithRequestFlags:cryptoSuiteIdentifier:message:completionHandler:")
    void challenge(NFCISO15693RequestFlag flags, @MachineSizedSInt long cryptoSuiteIdentifier, NSData message, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "readBufferWithRequestFlags:completionHandler:")
    void readBuffer(NFCISO15693RequestFlag flags, @Block VoidBlock3<NFCISO15693ResponseFlag, NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "extendedGetMultipleBlockSecurityStatusWithRequestFlag:blockRange:completionHandler:")
    void extendedGetMultipleBlockSecurityStatus(NFCISO15693RequestFlag flags, @ByVal NSRange blockRange, @Block VoidBlock2<NSArray<NSNumber>, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "extendedFastReadMultipleBlocksWithRequestFlag:blockRange:completionHandler:")
    void extendedFastReadMultipleBlocks(NFCISO15693RequestFlag flags, @ByVal NSRange blockRange, @Block VoidBlock2<NSArray<NSData>, NSError> completionHandler);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "sendRequestWithFlag:commandCode:data:completionHandler:")
    void sendRequest(@MachineSizedSInt long flags, @MachineSizedSInt long commandCode, NSData data, @Block VoidBlock3<NFCISO15693ResponseFlag, NSData, NSError> completionHandler);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
