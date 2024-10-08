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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetImageGenerator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAssetImageGeneratorPtr extends Ptr<AVAssetImageGenerator, AVAssetImageGeneratorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetImageGenerator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAssetImageGenerator() {}
    protected AVAssetImageGenerator(Handle h, long handle) { super(h, handle); }
    protected AVAssetImageGenerator(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAsset:")
    public AVAssetImageGenerator(AVAsset asset) { super((SkipInit) null); initObject(init(asset)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "asset")
    public native AVAsset getAsset();
    @Property(selector = "appliesPreferredTrackTransform")
    public native boolean appliesPreferredTrackTransform();
    @Property(selector = "setAppliesPreferredTrackTransform:")
    public native void setAppliesPreferredTrackTransform(boolean v);
    @Property(selector = "maximumSize")
    public native @ByVal CGSize getMaximumSize();
    @Property(selector = "setMaximumSize:")
    public native void setMaximumSize(@ByVal CGSize v);
    @Property(selector = "apertureMode")
    public native AVAssetImageGeneratorApertureMode getApertureMode();
    @Property(selector = "setApertureMode:")
    public native void setApertureMode(AVAssetImageGeneratorApertureMode v);
    @Property(selector = "videoComposition")
    public native AVVideoComposition getVideoComposition();
    @Property(selector = "setVideoComposition:")
    public native void setVideoComposition(AVVideoComposition v);
    @Property(selector = "customVideoCompositor")
    public native AVVideoCompositing getCustomVideoCompositor();
    @Property(selector = "requestedTimeToleranceBefore")
    public native @ByVal CMTime getRequestedTimeToleranceBefore();
    @Property(selector = "setRequestedTimeToleranceBefore:")
    public native void setRequestedTimeToleranceBefore(@ByVal CMTime v);
    @Property(selector = "requestedTimeToleranceAfter")
    public native @ByVal CMTime getRequestedTimeToleranceAfter();
    @Property(selector = "setRequestedTimeToleranceAfter:")
    public native void setRequestedTimeToleranceAfter(@ByVal CMTime v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAsset:")
    protected native @Pointer long init(AVAsset asset);
    /**
     * @deprecated Use generateCGImageAsynchronouslyForTime:completionHandler:
     */
    @Deprecated
    @WeaklyLinked
    public CGImage getCGImageAtTime(@ByVal CMTime requestedTime, CMTime actualTime) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       CGImage result = getCGImageAtTime(requestedTime, actualTime, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @deprecated Use generateCGImageAsynchronouslyForTime:completionHandler:
     */
    @Deprecated
    @WeaklyLinked
    @Method(selector = "copyCGImageAtTime:actualTime:error:")
    private native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGImage getCGImageAtTime(@ByVal CMTime requestedTime, CMTime actualTime, NSError.NSErrorPtr outError);
    @Method(selector = "generateCGImagesAsynchronouslyForTimes:completionHandler:")
    public native void generateCGImagesAsynchronously(@org.robovm.rt.bro.annotation.Marshaler(CMTime.AsValuedListMarshaler.class) List<CMTime> requestedTimes, @Block VoidBlock5<CMTime, CGImage, CMTime, AVAssetImageGeneratorResult, NSError> handler);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "generateCGImageAsynchronouslyForTime:completionHandler:")
    public native void generateCGImageAsynchronouslyForTime(@ByVal CMTime requestedTime, @Block("(,@ByVal,)") VoidBlock3<CGImage, CMTime, NSError> handler);
    @Method(selector = "cancelAllCGImageGeneration")
    public native void cancelAllCGImageGeneration();
    /*</methods>*/
}
