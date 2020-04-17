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
package org.robovm.apple.imagecapturecore;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("ImageCaptureCore")/*</annotations>*/
public enum /*<name>*/ICReturnCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Success(0L),
    InvalidParam(-9922L),
    CommunicationTimedOut(-9923L),
    ScanOperationCanceled(-9924L),
    ScannerInUseByLocalUser(-9925L),
    ScannerInUseByRemoteUser(-9926L),
    DeviceFailedToOpenSession(-9927L),
    DeviceFailedToCloseSession(-9928L),
    ScannerFailedToSelectFunctionalUnit(-9929L),
    ScannerFailedToCompleteOverviewScan(-9930L),
    ScannerFailedToCompleteScan(-9931L),
    ReceivedUnsolicitedScannerStatusInfo(-9932L),
    ReceivedUnsolicitedScannerErrorInfo(-9933L),
    DownloadFailed(-9934L),
    UploadFailed(-9935L),
    FailedToCompletePassThroughCommand(-9936L),
    DownloadCanceled(-9937L),
    FailedToEnabeTethering(-9938L),
    FailedToDisabeTethering(-9939L),
    FailedToCompleteSendMessageRequest(-9940L),
    DeleteFilesFailed(-9941L),
    DeleteFilesCanceled(-9942L),
    DeviceIsPasscodeLocked(-9943L),
    DeviceFailedToTakePicture(-9944L),
    DeviceSoftwareNotInstalled(-9945L),
    DeviceSoftwareIsBeingInstalled(-9946L),
    DeviceSoftwareInstallationCompleted(-9947L),
    DeviceSoftwareInstallationCanceled(-9948L),
    DeviceSoftwareInstallationFailed(-9949L),
    DeviceSoftwareNotAvailable(-9950L),
    DeviceCouldNotPair(-9951L),
    DeviceCouldNotUnpair(-9952L),
    DeviceNeedsCredentials(-9953L),
    DeviceIsBusyEnumerating(-9954L),
    DeviceCommandGeneralFailure(-9955L),
    DeviceFailedToCompleteTransfer(-9956L),
    DeviceFailedToSendData(-9957L),
    SessionNotOpened(-9958L),
    ExFATVolumeInvalid(21200L),
    MultiErrorDictionary(-30000L),
    ThumbnailNotAvailable(-21000L),
    ThumbnailAlreadyFetching(-20999L),
    ThumbnailCanceled(-20098L),
    ThumbnailInvalid(-20097L),
    MetadataNotAvailable(-20150L),
    MetadataAlreadyFetching(-20149L),
    MetadataCanceled(-20148L),
    MetadataInvalid(-20147L),
    ConnectionDriverExited(-21350L),
    ConnectionClosedSessionSuddenly(-21349L),
    ConnectionEjectedSuddenly(-21348L),
    ConnectionSessionAlreadyOpen(-21347L),
    ConnectionEjectFailed(-21346L),
    ConnectionFailedToOpen(-21345L),
    ConnectionFailedToOpenDevice(-21344L),
    PTPFailedToSendCommand(-21250L),
    PTPNotAuthorizedToSendCommand(-21249L),
    DownloadPathInvalid(-21100L),
    DownloadFileWritable(-21099L),
    LegacyCommunication(-9900L),
    LegacyDeviceNotFound(-9901L),
    LegacyDeviceNotOpen(-9902L),
    LegacyFileCorrupted(-9903L),
    LegacyIOPending(-9904L),
    LegacyInvalidObject(-9905L),
    LegacyInvalidProperty(-9906L),
    LegacyIndexOutOfRange(-9907L),
    LegacyPropertyTypeNotFound(-9908L),
    CannotYieldDevice(-9909L),
    LegacyDataTypeNotFound(-9910L),
    LegacyDeviceMemoryAllocation(-9911L),
    LegacyDeviceInternal(-9912L),
    LegacyDeviceInvalidParam(-9913L),
    LegacyDeviceAlreadyOpen(-9914L),
    LegacyDeviceLocationIDNotFound(-9915L),
    LegacyDeviceGUIDNotFound(-9916L),
    LegacyDeviceIOServicePathNotFound(-9917L),
    LegacyDeviceUnsupported(-9918L),
    LegacyFrameworkInternal(-9919L),
    LegacyExtensionInternal(-9920L),
    LegacyInvalidSession(-9921L),
    CodeObjectDoesNotExist(-21450L),
    CodeObjectDataOffsetInvalid(-21449L),
    CodeObjectCouldNotBeRead(-21448L),
    CodeObjectDataEmpty(-21447L),
    CodeObjectDataRequestTooLarge(-21446L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(ICReturnCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="ICErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/ICReturnCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/ICReturnCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/ICReturnCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/ICReturnCode/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/ICReturnCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be incerted in value section */
            return /*<name>*/ICReturnCode/*</name>*/.getClassDomain();
        }
    }
}
