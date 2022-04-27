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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVVideoComposition/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVVideoCompositionPtr extends Ptr<AVVideoComposition, AVVideoCompositionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVVideoComposition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVVideoComposition() {}
    @Deprecated protected AVVideoComposition(long handle) { super(handle); }
    protected AVVideoComposition(Handle h, long handle) { super(h, handle); }
    protected AVVideoComposition(SkipInit skipInit) { super(skipInit); }
    public AVVideoComposition(AVAsset asset) { super((Handle) null, create(asset)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public AVVideoComposition(AVAsset asset, @Block VoidBlock1<AVAsynchronousCIImageFilteringRequest> ciFiltersApplier) { super((Handle) null, create(asset, ciFiltersApplier)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "customVideoCompositorClass")
    public native Class<? extends AVVideoCompositing> getCustomVideoCompositorClass();
    @Property(selector = "frameDuration")
    public native @ByVal CMTime getFrameDuration();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "sourceTrackIDForFrameTiming")
    public native int getSourceTrackIDForFrameTiming();
    @Property(selector = "renderSize")
    public native @ByVal CGSize getRenderSize();
    @Property(selector = "renderScale")
    public native float getRenderScale();
    @Property(selector = "instructions")
    public native NSArray<AVVideoCompositionInstruction> getInstructions();
    @Property(selector = "animationTool")
    public native AVVideoCompositionCoreAnimationTool getAnimationTool();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "sourceSampleDataTrackIDs")
    public native NSArray<NSNumber> getSourceSampleDataTrackIDs();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "colorPrimaries")
    public native String getColorPrimaries();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "colorYCbCrMatrix")
    public native String getColorYCbCrMatrix();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "colorTransferFunction")
    public native String getColorTransferFunction();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "videoCompositionWithPropertiesOfAsset:")
    protected static native @Pointer long create(AVAsset asset);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "videoCompositionWithAsset:applyingCIFiltersWithHandler:")
    protected static native @Pointer long create(AVAsset asset, @Block VoidBlock1<AVAsynchronousCIImageFilteringRequest> ciFiltersApplier);
    @Method(selector = "isValidForAsset:timeRange:validationDelegate:")
    public native boolean isValid(AVAsset asset, @ByVal CMTimeRange timeRange, AVVideoCompositionValidationHandling validationDelegate);
    /*</methods>*/
}
