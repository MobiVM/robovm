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
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCapturePhotoBracketSettings/*</name>*/ 
    extends /*<extends>*/AVCapturePhotoSettings/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCapturePhotoBracketSettingsPtr extends Ptr<AVCapturePhotoBracketSettings, AVCapturePhotoBracketSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCapturePhotoBracketSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCapturePhotoBracketSettings() {}
    protected AVCapturePhotoBracketSettings(Handle h, long handle) { super(h, handle); }
    protected AVCapturePhotoBracketSettings(SkipInit skipInit) { super(skipInit); }
    public AVCapturePhotoBracketSettings(int rawPixelFormatType, NSDictionary<NSString, ?> processedFormat, NSArray<AVCaptureBracketedStillImageSettings> bracketedSettings) { super((Handle) null, create(rawPixelFormatType, processedFormat, bracketedSettings)); retain(getHandle()); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public AVCapturePhotoBracketSettings(int rawPixelFormatType, String rawFileType, NSDictionary<NSString, ?> processedFormat, String processedFileType, NSArray<AVCaptureBracketedStillImageSettings> bracketedSettings) { super((Handle) null, create(rawPixelFormatType, rawFileType, processedFormat, processedFileType, bracketedSettings)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bracketedSettings")
    public native NSArray<AVCaptureBracketedStillImageSettings> getBracketedSettings();
    @Property(selector = "isLensStabilizationEnabled")
    public native boolean isLensStabilizationEnabled();
    @Property(selector = "setLensStabilizationEnabled:")
    public native void setLensStabilizationEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "photoBracketSettingsWithRawPixelFormatType:processedFormat:bracketedSettings:")
    protected static native @Pointer long create(int rawPixelFormatType, NSDictionary<NSString, ?> processedFormat, NSArray<AVCaptureBracketedStillImageSettings> bracketedSettings);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "photoBracketSettingsWithRawPixelFormatType:rawFileType:processedFormat:processedFileType:bracketedSettings:")
    protected static native @Pointer long create(int rawPixelFormatType, String rawFileType, NSDictionary<NSString, ?> processedFormat, String processedFileType, NSArray<AVCaptureBracketedStillImageSettings> bracketedSettings);
    /*</methods>*/
}
