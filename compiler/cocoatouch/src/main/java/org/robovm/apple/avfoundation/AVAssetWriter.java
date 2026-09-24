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
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetWriter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAssetWriterPtr extends Ptr<AVAssetWriter, AVAssetWriterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetWriter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAssetWriter() {}
    protected AVAssetWriter(Handle h, long handle) { super(h, handle); }
    protected AVAssetWriter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:fileType:error:")
    public AVAssetWriter(NSURL outputURL, String outputFileType) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(outputURL, outputFileType, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithContentType:")
    public AVAssetWriter(org.robovm.apple.uniformtypeid.UTType outputContentType) { super((SkipInit) null); initObject(init(outputContentType)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "outputURL")
    public native NSURL getOutputURL();
    @Property(selector = "outputFileType")
    public native String getOutputFileType();
    @Property(selector = "availableMediaTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(AVMediaType.AsListMarshaler.class) List<AVMediaType> getAvailableMediaTypes();
    @Property(selector = "status")
    public native AVAssetWriterStatus getStatus();
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSArray<AVMetadataItem> v);
    @Property(selector = "shouldOptimizeForNetworkUse")
    public native boolean shouldOptimizeForNetworkUse();
    @Property(selector = "setShouldOptimizeForNetworkUse:")
    public native void setShouldOptimizeForNetworkUse(boolean v);
    @Property(selector = "directoryForTemporaryFiles")
    public native NSURL getDirectoryForTemporaryFiles();
    @Property(selector = "setDirectoryForTemporaryFiles:")
    public native void setDirectoryForTemporaryFiles(NSURL v);
    @Property(selector = "inputs")
    public native NSArray<AVAssetWriterInput> getInputs();
    @Property(selector = "movieFragmentInterval")
    public native @ByVal CMTime getMovieFragmentInterval();
    @Property(selector = "setMovieFragmentInterval:")
    public native void setMovieFragmentInterval(@ByVal CMTime v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "initialMovieFragmentInterval")
    public native @ByVal CMTime getInitialMovieFragmentInterval();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setInitialMovieFragmentInterval:")
    public native void setInitialMovieFragmentInterval(@ByVal CMTime v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "initialMovieFragmentSequenceNumber")
    public native @MachineSizedSInt long getInitialMovieFragmentSequenceNumber();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setInitialMovieFragmentSequenceNumber:")
    public native void setInitialMovieFragmentSequenceNumber(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "producesCombinableFragments")
    public native boolean isProducesCombinableFragments();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setProducesCombinableFragments:")
    public native void setProducesCombinableFragments(boolean v);
    @Property(selector = "overallDurationHint")
    public native @ByVal CMTime getOverallDurationHint();
    @Property(selector = "setOverallDurationHint:")
    public native void setOverallDurationHint(@ByVal CMTime v);
    @Property(selector = "movieTimeScale")
    public native int getMovieTimeScale();
    @Property(selector = "setMovieTimeScale:")
    public native void setMovieTimeScale(int v);
    @Property(selector = "inputGroups")
    public native NSArray<AVAssetWriterInputGroup> getInputGroups();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "preferredOutputSegmentInterval")
    public native @ByVal CMTime getPreferredOutputSegmentInterval();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setPreferredOutputSegmentInterval:")
    public native void setPreferredOutputSegmentInterval(@ByVal CMTime v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "initialSegmentStartTime")
    public native @ByVal CMTime getInitialSegmentStartTime();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setInitialSegmentStartTime:")
    public native void setInitialSegmentStartTime(@ByVal CMTime v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "outputFileTypeProfile")
    public native String getOutputFileTypeProfile();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setOutputFileTypeProfile:")
    public native void setOutputFileTypeProfile(String v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "delegate")
    public native AVAssetWriterDelegate getDelegate();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(AVAssetWriterDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public boolean canApplyOutputSettings(AVAudioSettings outputSettings, AVMediaType mediaType) {
        return canApplyOutputSettings(outputSettings.getDictionary(), mediaType);
    }
    public boolean canApplyOutputSettings(AVVideoSettings outputSettings, AVMediaType mediaType) {
        return canApplyOutputSettings(outputSettings.getDictionary(), mediaType);
    }
    @SuppressWarnings("unchecked")
    public boolean canApplyOutputSettings(AVPixelBufferAttributes outputSettings, AVMediaType mediaType) {
        return canApplyOutputSettings(outputSettings.getDictionary().as(NSDictionary.class), mediaType);
    }
    /*<methods>*/
    @Method(selector = "initWithURL:fileType:error:")
    private native @Pointer long init(NSURL outputURL, String outputFileType, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithContentType:")
    protected native @Pointer long init(org.robovm.apple.uniformtypeid.UTType outputContentType);
    @Method(selector = "canApplyOutputSettings:forMediaType:")
    protected native boolean canApplyOutputSettings(NSDictionary<NSString, ?> outputSettings, AVMediaType mediaType);
    @Method(selector = "canAddInput:")
    public native boolean canAddInput(AVAssetWriterInput input);
    @Method(selector = "addInput:")
    public native void addInput(AVAssetWriterInput input);
    @Method(selector = "startWriting")
    public native boolean startWriting();
    @Method(selector = "startSessionAtSourceTime:")
    public native void startSession(@ByVal CMTime startTime);
    @Method(selector = "endSessionAtSourceTime:")
    public native void endSession(@ByVal CMTime endTime);
    @Method(selector = "cancelWriting")
    public native void cancelWriting();
    @Method(selector = "finishWritingWithCompletionHandler:")
    public native void finishWriting(@Block Runnable handler);
    @Method(selector = "canAddInputGroup:")
    public native boolean canAddInputGroup(AVAssetWriterInputGroup inputGroup);
    @Method(selector = "addInputGroup:")
    public native void addInputGroup(AVAssetWriterInputGroup inputGroup);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "flushSegment")
    public native void flushSegment();
    /*</methods>*/
}
