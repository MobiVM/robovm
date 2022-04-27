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
package org.robovm.apple.replaykit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
@ForceLinkClass(RPRecordingError.class)
public enum /*<name>*/RPRecordingErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Unknown(-5800L),
    UserDeclined(-5801L),
    Disabled(-5802L),
    FailedToStart(-5803L),
    Failed(-5804L),
    InsufficientStorage(-5805L),
    Interrupted(-5806L),
    ContentResize(-5807L),
    BroadcastInvalidSession(-5808L),
    SystemDormancy(-5809L),
    Entitlements(-5810L),
    ActivePhoneCall(-5811L),
    FailedToSave(-5812L),
    CarPlay(-5813L),
    FailedApplicationConnectionInvalid(-5814L),
    FailedApplicationConnectionInterrupted(-5815L),
    FailedNoMatchingApplicationContext(-5816L),
    FailedMediaServicesFailure(-5817L),
    VideoMixingFailure(-5818L),
    BroadcastSetupFailed(-5819L),
    FailedToObtainURL(-5820L),
    FailedIncorrectTimeStamps(-5821L),
    FailedToProcessFirstSample(-5822L),
    FailedAssetWriterFailedToSave(-5823L),
    FailedNoAssetWriter(-5824L),
    FailedAssetWriterInWrongState(-5825L),
    FailedAssetWriterExportFailed(-5826L),
    FailedToRemoveFile(-5827L),
    FailedAssetWriterExportCanceled(-5828L),
    AttemptToStopNonRecording(-5829L),
    AttemptToStartInRecordingState(-5830L),
    PhotoFailure(-5831L),
    RecordingInvalidSession(-5832L),
    FailedToStartCaptureStack(-5833L),
    InvalidParameter(-5834L),
    FilePermissions(-5835L),
    ExportClipToURLInProgress(-5836L),
    CodeSuccessful(0L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/RPRecordingErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/RPRecordingErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/RPRecordingErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/RPRecordingErrorCode/*</name>*/.class.getName());
    }
}
