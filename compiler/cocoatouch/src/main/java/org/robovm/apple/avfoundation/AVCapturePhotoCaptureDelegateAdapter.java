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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCapturePhotoCaptureDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements AVCapturePhotoCaptureDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("captureOutput:willBeginCaptureForResolvedSettings:")
    public void willBeginCaptureForResolvedSettings(AVCapturePhotoOutput output, AVCaptureResolvedPhotoSettings resolvedSettings) {}
    @NotImplemented("captureOutput:willCapturePhotoForResolvedSettings:")
    public void willCapturePhotoForResolvedSettings(AVCapturePhotoOutput output, AVCaptureResolvedPhotoSettings resolvedSettings) {}
    @NotImplemented("captureOutput:didCapturePhotoForResolvedSettings:")
    public void didCapturePhotoForResolvedSettings(AVCapturePhotoOutput output, AVCaptureResolvedPhotoSettings resolvedSettings) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("captureOutput:didFinishProcessingPhoto:error:")
    public void didFinishProcessingPhoto(AVCapturePhotoOutput output, AVCapturePhoto photo, NSError error) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -captureOutput:didFinishProcessingPhoto:error: instead.
     */
    @Deprecated
    @NotImplemented("captureOutput:didFinishProcessingPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:")
    public void didFinishProcessingPhotoSampleBuffer(AVCapturePhotoOutput output, CMSampleBuffer photoSampleBuffer, CMSampleBuffer previewPhotoSampleBuffer, AVCaptureResolvedPhotoSettings resolvedSettings, AVCaptureBracketedStillImageSettings bracketSettings, NSError error) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -captureOutput:didFinishProcessingPhoto:error: instead.
     */
    @Deprecated
    @NotImplemented("captureOutput:didFinishProcessingRawPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:")
    public void didFinishProcessingRawPhotoSampleBuffer(AVCapturePhotoOutput output, CMSampleBuffer rawSampleBuffer, CMSampleBuffer previewPhotoSampleBuffer, AVCaptureResolvedPhotoSettings resolvedSettings, AVCaptureBracketedStillImageSettings bracketSettings, NSError error) {}
    @NotImplemented("captureOutput:didFinishRecordingLivePhotoMovieForEventualFileAtURL:resolvedSettings:")
    public void didFinishRecordingLivePhotoMovieForEventualFileAtURL(AVCapturePhotoOutput output, NSURL outputFileURL, AVCaptureResolvedPhotoSettings resolvedSettings) {}
    @NotImplemented("captureOutput:didFinishProcessingLivePhotoToMovieFileAtURL:duration:photoDisplayTime:resolvedSettings:error:")
    public void didFinishProcessingLivePhotoToMovieFileAtURL(AVCapturePhotoOutput output, NSURL outputFileURL, @ByVal CMTime duration, @ByVal CMTime photoDisplayTime, AVCaptureResolvedPhotoSettings resolvedSettings, NSError error) {}
    @NotImplemented("captureOutput:didFinishCaptureForResolvedSettings:error:")
    public void didFinishCaptureForResolvedSettings(AVCapturePhotoOutput output, AVCaptureResolvedPhotoSettings resolvedSettings, NSError error) {}
    /*</methods>*/
}
