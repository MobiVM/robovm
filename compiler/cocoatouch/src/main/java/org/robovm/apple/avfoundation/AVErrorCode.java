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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
@ForceLinkClass(AVError.class)
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/AVErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Unknown(-11800L),
    OutOfMemory(-11801L),
    SessionNotRunning(-11803L),
    DeviceAlreadyUsedByAnotherSession(-11804L),
    NoDataCaptured(-11805L),
    SessionConfigurationChanged(-11806L),
    DiskFull(-11807L),
    DeviceWasDisconnected(-11808L),
    MediaChanged(-11809L),
    MaximumDurationReached(-11810L),
    MaximumFileSizeReached(-11811L),
    MediaDiscontinuity(-11812L),
    MaximumNumberOfSamplesForFileFormatReached(-11813L),
    DeviceNotConnected(-11814L),
    DeviceInUseByAnotherApplication(-11815L),
    DeviceLockedForConfigurationByAnotherProcess(-11817L),
    SessionWasInterrupted(-11818L),
    MediaServicesWereReset(-11819L),
    ExportFailed(-11820L),
    DecodeFailed(-11821L),
    InvalidSourceMedia(-11822L),
    FileAlreadyExists(-11823L),
    CompositionTrackSegmentsNotContiguous(-11824L),
    InvalidCompositionTrackSegmentDuration(-11825L),
    InvalidCompositionTrackSegmentSourceStartTime(-11826L),
    InvalidCompositionTrackSegmentSourceDuration(-11827L),
    FileFormatNotRecognized(-11828L),
    FileFailedToParse(-11829L),
    MaximumStillImageCaptureRequestsExceeded(-11830L),
    ContentIsProtected(-11831L),
    NoImageAtTime(-11832L),
    DecoderNotFound(-11833L),
    EncoderNotFound(-11834L),
    ContentIsNotAuthorized(-11835L),
    ApplicationIsNotAuthorized(-11836L),
    /**
     * @since Available in iOS 4.3 and later.
     * @deprecated Deprecated in iOS 9.0. AVCaptureSession no longer produces an AVCaptureSessionRuntimeErrorNotification with this error. See AVCaptureSessionInterruptionReasonVideoDeviceNotAvailableInBackground.
     */
    @Deprecated
    DeviceIsNotAvailableInBackground(-11837L),
    OperationNotSupportedForAsset(-11838L),
    DecoderTemporarilyUnavailable(-11839L),
    EncoderTemporarilyUnavailable(-11840L),
    InvalidVideoComposition(-11841L),
    ReferenceForbiddenByReferencePolicy(-11842L),
    InvalidOutputURLPathExtension(-11843L),
    ScreenCaptureFailed(-11844L),
    DisplayWasDisabled(-11845L),
    TorchLevelUnavailable(-11846L),
    OperationInterrupted(-11847L),
    IncompatibleAsset(-11848L),
    FailedToLoadMediaData(-11849L),
    ServerIncorrectlyConfigured(-11850L),
    ApplicationIsNotAuthorizedToUseDevice(-11852L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    FailedToParse(-11853L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    FileTypeDoesNotSupportSampleReferences(-11854L),
    /**
     * @since Available in iOS 8.0 and later.
     */
    UndecodableMediaData(-11855L),
    /**
     * @since Available in iOS 8.3 and later.
     */
    AirPlayControllerRequiresInternet(-11856L),
    /**
     * @since Available in iOS 8.3 and later.
     */
    AirPlayReceiverRequiresInternet(-11857L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    VideoCompositorFailed(-11858L),
    /**
     * @since Available in iOS 9.0 and later.
     */
    RecordingAlreadyInProgress(-11859L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    UnsupportedOutputSettings(-11861L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    OperationNotAllowed(-11862L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ContentIsUnavailable(-11863L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    FormatUnsupported(-11864L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    MalformedDepth(-11865L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    ContentNotUpdated(-11866L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    NoLongerPlayable(-11867L),
    /**
     * @since Available in iOS 11.0 and later.
     */
    NoCompatibleAlternatesForExternalDisplay(-11868L),
    /**
     * @since Available in iOS 11.2 and later.
     */
    NoSourceTrack(-11869L),
    /**
     * @since Available in iOS 12.0 and later.
     */
    ExternalPlaybackNotSupportedForAsset(-11870L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AVErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AVErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/AVErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AVErrorCode/*</name>*/.class.getName());
    }
}
