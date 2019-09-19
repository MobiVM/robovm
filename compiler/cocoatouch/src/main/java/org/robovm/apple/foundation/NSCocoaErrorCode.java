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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
@ForceLinkClass(NSCocoaError.class)
public enum /*<name>*/NSCocoaErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    FileNoSuchFile(4L),
    FileLocking(255L),
    FileReadUnknown(256L),
    FileReadNoPermission(257L),
    FileReadInvalidFileName(258L),
    FileReadCorruptFile(259L),
    FileReadNoSuchFile(260L),
    FileReadInapplicableStringEncoding(261L),
    FileReadUnsupportedScheme(262L),
    FileReadTooLarge(263L),
    FileReadUnknownStringEncoding(264L),
    FileWriteUnknown(512L),
    FileWriteNoPermission(513L),
    FileWriteInvalidFileName(514L),
    FileWriteFileExists(516L),
    FileWriteInapplicableStringEncoding(517L),
    FileWriteUnsupportedScheme(518L),
    FileWriteOutOfSpace(640L),
    FileWriteVolumeReadOnly(642L),
    KeyValueValidation(1024L),
    Formatting(2048L),
    UserCancelled(3072L),
    FeatureUnsupported(3328L),
    ExecutableNotLoadable(3584L),
    ExecutableArchitectureMismatch(3585L),
    ExecutableRuntimeMismatch(3586L),
    ExecutableLoad(3587L),
    ExecutableLink(3588L),
    FileErrorMinimum(0L),
    FileErrorMaximum(1023L),
    ValidationErrorMinimum(1024L),
    ValidationErrorMaximum(2047L),
    ExecutableErrorMinimum(3584L),
    ExecutableErrorMaximum(3839L),
    FormattingErrorMinimum(2048L),
    FormattingErrorMaximum(2559L),
    PropertyListReadCorrupt(3840L),
    PropertyListReadUnknownVersion(3841L),
    PropertyListReadStream(3842L),
    PropertyListWriteStream(3851L),
    PropertyListWriteInvalid(3852L),
    PropertyListErrorMinimum(3840L),
    PropertyListErrorMaximum(4095L),
    XPCConnectionInterrupted(4097L),
    XPCConnectionInvalid(4099L),
    XPCConnectionReplyInvalid(4101L),
    XPCConnectionErrorMinimum(4096L),
    XPCConnectionErrorMaximum(4224L),
    UbiquitousFileUnavailable(4353L),
    UbiquitousFileNotUploadedDueToQuota(4354L),
    UbiquitousFileUbiquityServerNotAvailable(4355L),
    UbiquitousFileErrorMinimum(4352L),
    UbiquitousFileErrorMaximum(4607L),
    UserActivityHandoffFailed(4608L),
    UserActivityConnectionUnavailable(4609L),
    UserActivityRemoteApplicationTimedOut(4610L),
    UserActivityHandoffUserInfoTooLarge(4611L),
    UserActivityErrorMinimum(4608L),
    UserActivityErrorMaximum(4863L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    CoderReadCorrupt(4864L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    CoderValueNotFound(4865L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    CoderInvalidValue(4866L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    CoderErrorMinimum(4864L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    CoderErrorMaximum(4991L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    BundleErrorMinimum(4992L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    BundleErrorMaximum(5119L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    BundleOnDemandResourceOutOfSpace(4992L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    BundleOnDemandResourceExceededMaximumSize(4993L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    BundleOnDemandResourceInvalidTag(4994L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    CloudSharingNetworkFailure(5120L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    CloudSharingQuotaExceeded(5121L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    CloudSharingTooManyParticipants(5122L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    CloudSharingConflict(5123L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    CloudSharingNoPermission(5124L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    CloudSharingOther(5375L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    CloudSharingErrorMinimum(5120L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    CloudSharingErrorMaximum(5375L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    CompressionFailed(5376L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    DecompressionFailed(5377L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    CompressionErrorMinimum(5376L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    CompressionErrorMaximum(5503L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/NSCocoaErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    @WeaklyLinked
    public static NSErrorCode valueOf(long n) {
        for (/*<name>*/NSCocoaErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        // NSCoreDataError codes don't have their own domain. They are added to Cocoa error codes.
        for (NSCoreDataErrorCode v : NSCoreDataErrorCode.values()) {
            if (v.value() == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/NSCocoaErrorCode/*</name>*/.class.getName());
    }
}
