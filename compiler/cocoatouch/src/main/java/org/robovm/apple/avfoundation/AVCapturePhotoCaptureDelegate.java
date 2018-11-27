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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/AVCapturePhotoCaptureDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "captureOutput:willBeginCaptureForResolvedSettings:")
    void willBeginCaptureForResolvedSettings(AVCapturePhotoOutput output, AVCaptureResolvedPhotoSettings resolvedSettings);
    @Method(selector = "captureOutput:willCapturePhotoForResolvedSettings:")
    void willCapturePhotoForResolvedSettings(AVCapturePhotoOutput output, AVCaptureResolvedPhotoSettings resolvedSettings);
    @Method(selector = "captureOutput:didCapturePhotoForResolvedSettings:")
    void didCapturePhotoForResolvedSettings(AVCapturePhotoOutput output, AVCaptureResolvedPhotoSettings resolvedSettings);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "captureOutput:didFinishProcessingPhoto:error:")
    void didFinishProcessingPhoto(AVCapturePhotoOutput output, AVCapturePhoto photo, NSError error);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -captureOutput:didFinishProcessingPhoto:error: instead.
     */
    @Deprecated
    @Method(selector = "captureOutput:didFinishProcessingPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:")
    void didFinishProcessingPhotoSampleBuffer(AVCapturePhotoOutput output, CMSampleBuffer photoSampleBuffer, CMSampleBuffer previewPhotoSampleBuffer, AVCaptureResolvedPhotoSettings resolvedSettings, AVCaptureBracketedStillImageSettings bracketSettings, NSError error);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. Use -captureOutput:didFinishProcessingPhoto:error: instead.
     */
    @Deprecated
    @Method(selector = "captureOutput:didFinishProcessingRawPhotoSampleBuffer:previewPhotoSampleBuffer:resolvedSettings:bracketSettings:error:")
    void didFinishProcessingRawPhotoSampleBuffer(AVCapturePhotoOutput output, CMSampleBuffer rawSampleBuffer, CMSampleBuffer previewPhotoSampleBuffer, AVCaptureResolvedPhotoSettings resolvedSettings, AVCaptureBracketedStillImageSettings bracketSettings, NSError error);
    @Method(selector = "captureOutput:didFinishRecordingLivePhotoMovieForEventualFileAtURL:resolvedSettings:")
    void didFinishRecordingLivePhotoMovieForEventualFileAtURL(AVCapturePhotoOutput output, NSURL outputFileURL, AVCaptureResolvedPhotoSettings resolvedSettings);
    @Method(selector = "captureOutput:didFinishProcessingLivePhotoToMovieFileAtURL:duration:photoDisplayTime:resolvedSettings:error:")
    void didFinishProcessingLivePhotoToMovieFileAtURL(AVCapturePhotoOutput output, NSURL outputFileURL, @ByVal CMTime duration, @ByVal CMTime photoDisplayTime, AVCaptureResolvedPhotoSettings resolvedSettings, NSError error);
    @Method(selector = "captureOutput:didFinishCaptureForResolvedSettings:error:")
    void didFinishCaptureForResolvedSettings(AVCapturePhotoOutput output, AVCaptureResolvedPhotoSettings resolvedSettings, NSError error);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
