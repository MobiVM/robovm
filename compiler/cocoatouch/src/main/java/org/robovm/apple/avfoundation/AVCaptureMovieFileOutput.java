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
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureMovieFileOutput/*</name>*/ 
    extends /*<extends>*/AVCaptureFileOutput/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureMovieFileOutputPtr extends Ptr<AVCaptureMovieFileOutput, AVCaptureMovieFileOutputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureMovieFileOutput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureMovieFileOutput(Handle h, long handle) { super(h, handle); }
    protected AVCaptureMovieFileOutput(SkipInit skipInit) { super(skipInit); }
    public AVCaptureMovieFileOutput() { super((Handle) null, create()); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "movieFragmentInterval")
    public native @ByVal CMTime getMovieFragmentInterval();
    @Property(selector = "setMovieFragmentInterval:")
    public native void setMovieFragmentInterval(@ByVal CMTime v);
    @Property(selector = "metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSArray<AVMetadataItem> v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "availableVideoCodecTypes")
    public native NSArray<NSString> getAvailableVideoCodecTypes();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "isPrimaryConstituentDeviceSwitchingBehaviorForRecordingEnabled")
    public native boolean isPrimaryConstituentDeviceSwitchingBehaviorForRecordingEnabled();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setPrimaryConstituentDeviceSwitchingBehaviorForRecordingEnabled:")
    public native void setPrimaryConstituentDeviceSwitchingBehaviorForRecordingEnabled(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "primaryConstituentDeviceSwitchingBehaviorForRecording")
    public native AVCapturePrimaryConstituentDeviceSwitchingBehavior getPrimaryConstituentDeviceSwitchingBehaviorForRecording();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "primaryConstituentDeviceRestrictedSwitchingBehaviorConditionsForRecording")
    public native AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditions getPrimaryConstituentDeviceRestrictedSwitchingBehaviorConditionsForRecording();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "supportedOutputSettingsKeysForConnection:")
    public native NSArray<NSString> supportedOutputSettingsKeysForConnection(AVCaptureConnection connection);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "outputSettingsForConnection:")
    public native NSDictionary<NSString, ?> getOutputSettings(AVCaptureConnection connection);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setOutputSettings:forConnection:")
    public native void setOutputSettings(NSDictionary<NSString, ?> outputSettings, AVCaptureConnection connection);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "recordsVideoOrientationAndMirroringChangesAsMetadataTrackForConnection:")
    public native boolean recordsVideoOrientationAndMirroringChangesAsMetadataTrack(AVCaptureConnection connection);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "setRecordsVideoOrientationAndMirroringChanges:asMetadataTrackForConnection:")
    public native void setRecordsVideoOrientationAndMirroringChangesAsMetadataTrack(boolean doRecordChanges, AVCaptureConnection connection);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "setPrimaryConstituentDeviceSwitchingBehaviorForRecording:restrictedSwitchingBehaviorConditions:")
    public native void setPrimaryConstituentDeviceSwitchingBehaviorForRecording(AVCapturePrimaryConstituentDeviceSwitchingBehavior switchingBehavior, AVCapturePrimaryConstituentDeviceRestrictedSwitchingBehaviorConditions restrictedSwitchingBehaviorConditions);
    @Method(selector = "new")
    protected static native @Pointer long create();
    /*</methods>*/
}
