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
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVMutableVideoComposition/*</name>*/ 
    extends /*<extends>*/AVVideoComposition/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVMutableVideoCompositionPtr extends Ptr<AVMutableVideoComposition, AVMutableVideoCompositionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVMutableVideoComposition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVMutableVideoComposition() {}
    protected AVMutableVideoComposition(Handle h, long handle) { super(h, handle); }
    protected AVMutableVideoComposition(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    public AVMutableVideoComposition(AVAsset asset) { super((Handle) null, create(asset)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public AVMutableVideoComposition(AVAsset asset, @Block VoidBlock1<AVAsynchronousCIImageFilteringRequest> ciFiltersApplier) { super((Handle) null, create(asset, ciFiltersApplier)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "customVideoCompositorClass")
    public native Class<? extends AVVideoCompositing> getCustomVideoCompositorClass();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setCustomVideoCompositorClass:")
    public native void setCustomVideoCompositorClass(Class<? extends AVVideoCompositing> v);
    @Property(selector = "frameDuration")
    public native @ByVal CMTime getFrameDuration();
    @Property(selector = "setFrameDuration:")
    public native void setFrameDuration(@ByVal CMTime v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "sourceTrackIDForFrameTiming")
    public native int getSourceTrackIDForFrameTiming();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSourceTrackIDForFrameTiming:")
    public native void setSourceTrackIDForFrameTiming(int v);
    @Property(selector = "renderSize")
    public native @ByVal CGSize getRenderSize();
    @Property(selector = "setRenderSize:")
    public native void setRenderSize(@ByVal CGSize v);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "renderScale")
    public native float getRenderScale();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "setRenderScale:")
    public native void setRenderScale(float v);
    @Property(selector = "instructions")
    public native NSArray<AVVideoCompositionInstruction> getInstructions();
    @Property(selector = "setInstructions:")
    public native void setInstructions(NSArray<AVVideoCompositionInstruction> v);
    @Property(selector = "animationTool")
    public native AVVideoCompositionCoreAnimationTool getAnimationTool();
    @Property(selector = "setAnimationTool:")
    public native void setAnimationTool(AVVideoCompositionCoreAnimationTool v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "colorPrimaries")
    public native String getColorPrimaries();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setColorPrimaries:")
    public native void setColorPrimaries(String v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "colorYCbCrMatrix")
    public native String getColorYCbCrMatrix();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setColorYCbCrMatrix:")
    public native void setColorYCbCrMatrix(String v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "colorTransferFunction")
    public native String getColorTransferFunction();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setColorTransferFunction:")
    public native void setColorTransferFunction(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "videoCompositionWithPropertiesOfAsset:")
    protected static native @Pointer long create(AVAsset asset);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "videoCompositionWithAsset:applyingCIFiltersWithHandler:")
    protected static native @Pointer long create(AVAsset asset, @Block VoidBlock1<AVAsynchronousCIImageFilteringRequest> ciFiltersApplier);
    /*</methods>*/
}
