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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureVideoDataOutput/*</name>*/ 
    extends /*<extends>*/AVCaptureOutput/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureVideoDataOutputPtr extends Ptr<AVCaptureVideoDataOutput, AVCaptureVideoDataOutputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureVideoDataOutput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureVideoDataOutput(Handle h, long handle) { super(h, handle); }
    protected AVCaptureVideoDataOutput(SkipInit skipInit) { super(skipInit); }
    public AVCaptureVideoDataOutput() { super((Handle) null, create()); retain(getHandle()); }
    /*</constructors>*/
    public AVVideoSettings getVideoSettings() {
        return new AVVideoSettings(getVideoSettings0());
    }
    public void setVideoSettings(AVVideoSettings videoSettings) {
        setVideoSettings0(videoSettings.getDictionary());
    }
    @WeaklyLinked
    public AVPixelBufferAttributes getPixelBufferSettings() {
        return new AVPixelBufferAttributes(getVideoSettings0().as(CFDictionary.class));
    }
    @SuppressWarnings("unchecked")
    public void setPixelBufferSettings(AVPixelBufferAttributes videoSettings) {
        setVideoSettings0(videoSettings.getDictionary().as(NSDictionary.class));
    }
    /*<properties>*/
    @Property(selector = "sampleBufferDelegate")
    public native AVCaptureVideoDataOutputSampleBufferDelegate getSampleBufferDelegate();
    @WeaklyLinked
    @Property(selector = "sampleBufferCallbackQueue")
    public native DispatchQueue getSampleBufferCallbackQueue();
    @Property(selector = "videoSettings")
    protected native NSDictionary<NSString, ?> getVideoSettings0();
    @Property(selector = "setVideoSettings:")
    protected native void setVideoSettings0(NSDictionary<NSString, ?> v);
    @WeaklyLinked
    @Property(selector = "availableVideoCVPixelFormatTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(CVPixelFormatType.AsListMarshaler.class) List<CVPixelFormatType> getAvailableVideoCVPixelFormatTypes();
    @Property(selector = "availableVideoCodecTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(CMVideoCodecType.AsListMarshaler.class) List<CMVideoCodecType> getAvailableVideoCodecTypes();
    @Property(selector = "alwaysDiscardsLateVideoFrames")
    public native boolean alwaysDiscardsLateVideoFrames();
    @Property(selector = "setAlwaysDiscardsLateVideoFrames:")
    public native void setAlwaysDiscardsLateVideoFrames(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "automaticallyConfiguresOutputBufferDimensions")
    public native boolean automaticallyConfiguresOutputBufferDimensions();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAutomaticallyConfiguresOutputBufferDimensions:")
    public native void setAutomaticallyConfiguresOutputBufferDimensions(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "deliversPreviewSizedOutputBuffers")
    public native boolean isDeliversPreviewSizedOutputBuffers();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setDeliversPreviewSizedOutputBuffers:")
    public native void setDeliversPreviewSizedOutputBuffers(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    public AVVideoSettings getRecommendedVideoSettings(String outputFileType) {
        return new AVVideoSettings(getRecommendedVideoSettings0(outputFileType));
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public AVPixelBufferAttributes getRecommendedPixelBufferSettings(String outputFileType) {
        return new AVPixelBufferAttributes(getRecommendedVideoSettings0(outputFileType).as(CFDictionary.class));
    }
    /*<methods>*/
    @WeaklyLinked
    @Method(selector = "setSampleBufferDelegate:queue:")
    public native void setSampleBufferDelegate(AVCaptureVideoDataOutputSampleBufferDelegate sampleBufferDelegate, DispatchQueue sampleBufferCallbackQueue);
    @Method(selector = "recommendedVideoSettingsForAssetWriterWithOutputFileType:")
    protected native NSDictionary<NSString, ?> getRecommendedVideoSettings0(String outputFileType);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "availableVideoCodecTypesForAssetWriterWithOutputFileType:")
    public native NSArray<NSString> getAvailableVideoCodecTypes(String outputFileType);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "recommendedVideoSettingsForVideoCodecType:assetWriterOutputFileType:")
    public native NSDictionary<NSString, ?> getRecommendedVideoSettings(AVVideoCodecType videoCodecType, String outputFileType);
    @Method(selector = "new")
    protected static native @Pointer long create();
    /*</methods>*/
}
